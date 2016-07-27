package com.bestcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by skucherenosov on 6/25/16.
 */
@Controller
@RequestMapping("/")
public class WebTestController extends BaseController {

    @RequestMapping(method = RequestMethod.GET)
    public String defaultGet(ModelMap model) {
        return "welcome";
    }

    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        return "welcome";
    }

    @RequestMapping(value="/admin", method = RequestMethod.GET)
    public String getAdminPage(ModelMap model) {
        return "admin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }


    @RequestMapping(value="/accessDenied", method = RequestMethod.GET)
    public String accessDenied(ModelMap model) {
        return "errors/403";
    }

}
