package com.bestcar.rest;

import com.bestcar.model.Car;
import com.bestcar.repo.CarRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sergey on 7/6/16.
 */
@RestController
@RequestMapping("/rest/car")
public class CarEndpoint {

    @Autowired
    private CarRepository carService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Car> listUserPreferences() {
        List<Car> cars =  Lists.newArrayList(carService.findAll());
        return cars;
    }

}
