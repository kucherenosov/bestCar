package com.bestcar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by sergey on 7/11/16.
 */
@Controller
@RequestMapping(value="/image")
public class ImageController {

    @Value("${image.file.path}")
    private String imageFilePath;

    @Value("${image.brand.folder}")
    private String brandFolder;

    @Value("${image.default.name}")
    private String defaultImageName;


    @RequestMapping(value = "/company/car/{companyOSR}/{fileName}", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getCarCompanyLogo(@PathVariable("companyOSR") String companyOSR, @PathVariable("fileName") String fileName) {
        String fullFileName =  makeFilePath(companyOSR, fileName);
        return readFile(fullFileName);
    }

    @RequestMapping(value = "/company/car/{companyOSR}", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getCarCompanyLogo(@PathVariable("companyOSR") String companyOSR) {
        String fullFileName =  makeFilePath(companyOSR, defaultImageName);
        return readFile(fullFileName);
    }

    private byte[] readFile(String fullFileName) {
        Path path = Paths.get(fullFileName);
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String makeFilePath(String companyOSR, String fileName) {
        StringBuilder sb = new StringBuilder(imageFilePath)
                .append(File.separator).append(brandFolder)
                .append(File.separator).append(companyOSR)
                .append(File.separator).append(fileName);
        return sb.toString();
    }

}
