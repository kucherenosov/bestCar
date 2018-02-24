package com.bestcar.rest;

import com.bestcar.model.Car;
import com.bestcar.repo.CarRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.rmi.server.UID;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created by sergey on 7/6/16.
 */
@RestController
@RequestMapping("/rest/car")
public class CarEndpoint {

    private final static String COOKIE_CART_ID = "CART_ID";

    @Autowired
    private CarRepository carService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Car> listUserPreferences() {
        List<Car> cars =  Lists.newArrayList(carService.findAll());
        return cars;
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(HttpServletRequest request, HttpServletResponse response) {
        String servletPath = request.getServletContext().getContextPath();
        boolean isNewCookieGenerated = false;
        Cookie cookie = getCookie(request, COOKIE_CART_ID);
        if(cookie == null) {  // generate new
            isNewCookieGenerated = true;
            String cartIdValue = UUID.randomUUID().toString();
            cookie = new Cookie(COOKIE_CART_ID, cartIdValue);
            cookie.setPath(servletPath);  // "/bestcar"
            response.addCookie(cookie);
        }
        return isNewCookieGenerated ? "new:" + cookie.getValue() : "old:" + cookie.getValue();
    }


    protected Cookie getCookie(HttpServletRequest request, String cookieName) {
        List<Cookie> matchedCookies = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            matchedCookies = Arrays.stream(cookies).filter(c -> cookieName.equals(c.getName())).collect(Collectors.toList());
        }
        return org.springframework.util.CollectionUtils.isEmpty(matchedCookies) ? null : matchedCookies.get(0);
    }



}
