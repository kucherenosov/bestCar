package com.bestcar.controller;

import com.bestcar.model.Car;
import com.bestcar.model.CarCompany;
import com.bestcar.model.dto.DateView;
import com.bestcar.repo.CarCompanyRepository;
import com.bestcar.repo.CarRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by skucherenosov on 6/25/16.
 */
@Controller
@RequestMapping("/")
public class WebTestController extends BaseController {

    @Autowired
    private CarRepository carService;

    @Autowired
    private CarCompanyRepository carCompanyService;

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


    @RequestMapping(value="/carCompany", method = RequestMethod.GET)
    public String getCarCompanies(ModelMap model) {
        List<CarCompany> companies =  Lists.newArrayList(carCompanyService.findAll());
        model.addAttribute("carCompanies", companies);
        return "carCompay";
    }


    @RequestMapping(value="/months", method = RequestMethod.GET)
    public String getMonthes(ModelMap model) {
        List<DateView> months =  new ArrayList<>();

        String NEW_MANULIFE_COVERAGE_EFF_DATE_FORMAT = "MMM dd, yyyy";
        SimpleDateFormat enSDF = new SimpleDateFormat(NEW_MANULIFE_COVERAGE_EFF_DATE_FORMAT, Locale.ENGLISH);
        SimpleDateFormat frSDF = new SimpleDateFormat(NEW_MANULIFE_COVERAGE_EFF_DATE_FORMAT, Locale.CANADA_FRENCH);


        Calendar cal = Calendar.getInstance();
        for (int i=0; i<12; i++) {
            cal.set(Calendar.MONTH, i);
            String enDate = enSDF.format(cal.getTime());
            String frDate = frSDF.format(cal.getTime());
            DateView dateView = new DateView(enDate, frDate);
            months.add(dateView);
        }
        model.addAttribute("months", months);
        return "months";
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
