package com.bestcar.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        return "welcome";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage(ModelMap model) {
        return "admin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }


    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String accessDenied(ModelMap model) {
        return "errors/403";
    }

}
