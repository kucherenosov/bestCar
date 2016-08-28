package com.bestcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by skucherenosov on 8/18/16.
 */
@Controller
@RequestMapping("/ng")
public class TestNgController extends BaseController {

    @RequestMapping(value="/carCompany", method = RequestMethod.GET)
    public String carCompany(ModelMap model) {
        return "ng-carCompany";
    }

}
