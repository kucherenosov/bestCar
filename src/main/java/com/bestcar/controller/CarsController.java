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
 * Created by skucherenosov on 7/27/16.
 */
@Controller
@RequestMapping("/cars")
public class CarsController extends BaseController {

    @Autowired
    private CarRepository carService;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String getCarsPage(ModelMap model) {
        List<Car> cars =  Lists.newArrayList(carService.findAll());
        model.addAttribute("cars", cars);
        return "cars";
    }
}
