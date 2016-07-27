package com.bestcar.controller;

import com.bestcar.model.dto.DateView;
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
 * Created by skucherenosov on 7/27/16.
 */
@Controller
public class MonthTestController {

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



}
