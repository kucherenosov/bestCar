package com.bestcar.controller.admin;

import com.bestcar.model.CarCompany;
import com.bestcar.repo.CarCompanyRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by skucherenosov on 7/27/16.
 */

@Controller
@RequestMapping("/admin/carCompany")
public class CarCompanyController {

    @Autowired
    private CarCompanyRepository carCompanyService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String getCarCompanies(ModelMap model) {
        List<CarCompany> companies =  Lists.newArrayList(carCompanyService.findAll());
        model.addAttribute("carCompanies", companies);
        return "carCompay";
    }

}
