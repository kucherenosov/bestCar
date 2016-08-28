package com.bestcar.controller;

import com.bestcar.model.dto.PageContext;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by sergey on 7/5/16.
 */
public abstract class BaseController {


    public boolean isLoggedIn() {
        return SecurityContextHolder.getContext().getAuthentication() != null
                && SecurityContextHolder.getContext().getAuthentication().isAuthenticated()
                //when Anonymous Authentication is enabled
                && !(SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken);
    }

    public String getLogoutUrl() {
        return "/logout";
    }

    public String getLoginUrl() {
        return "/login";
    }


    @ModelAttribute("appPageContext")
    public PageContext getPageContext() {
        PageContext pageContext = new PageContext();
        pageContext.setLoginUrl(getLoginUrl());
        pageContext.setLoggedIn(isLoggedIn());
        pageContext.setLogoutUrl(getLogoutUrl());
        return pageContext;
    }

}
