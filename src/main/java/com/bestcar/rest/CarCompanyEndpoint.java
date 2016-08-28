package com.bestcar.rest;

import com.bestcar.model.Car;
import com.bestcar.model.CarCompany;
import com.bestcar.repo.CarCompanyRepository;
import com.bestcar.repo.CarRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by skucherenosov on 8/18/16.
 */
@RestController
@RequestMapping("/rest/carCompany")
public class CarCompanyEndpoint {

    @Autowired
    private CarCompanyRepository carCompanyService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<CarCompany> listUserPreferences() {
        List<CarCompany> companies =  Lists.newArrayList(carCompanyService.findAll());
        return companies;
    }
}
