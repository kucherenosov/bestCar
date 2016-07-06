package com.bestcar.controller;

import com.bestcar.model.Car;
import com.bestcar.repo.CarRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by skucherenosov on 6/25/16.
 */
@Controller
@RequestMapping("/")
public class WebTestController extends BaseController {

    @Autowired
    private CarRepository carService;

    @RequestMapping(method = RequestMethod.GET)
    public String defaultGet(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        model.addAttribute("appPageContext", getPageContext());
        return "welcome";
    }

    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World - Spring 4 MVC." +
                "<br>");
        return "welcome";
    }

    @RequestMapping(value="/admin", method = RequestMethod.GET)
    public String getAdminPage(ModelMap model) {
        return "admin";
    }

    @RequestMapping(value="/cars", method = RequestMethod.GET)
    public String getCarsPage(ModelMap model) {
        List<Car> cars =  Lists.newArrayList(carService.findAll());
        model.addAttribute("cars", cars);
        return "cars";
    }


    @RequestMapping(value="/accessDenied", method = RequestMethod.GET)
    public String accessDenied(ModelMap model) {
        return "errors/403";
    }


}
