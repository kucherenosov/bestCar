package com.bestcar.rest;

import com.bestcar.model.TestUser;
import com.bestcar.repo.UserPreferencesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skucherenosov on 6/25/16.
 */

@RestController
@RequestMapping("/test/rest")
@PropertySource("classpath:props/common.properties")
public class RestTestController {

    private static final Logger LOG = LoggerFactory.getLogger(RestTestController.class);

    @Autowired
    private Environment envProperties;

    @Value("${common.prop}")
    private String commonPropValue;

    @Value("${env.prop}")
    private String env;

    @Autowired
    protected UserPreferencesRepository userPreferencesRepo;

    @RequestMapping(value = "/echo", method = RequestMethod.GET, produces = "application/json")
    public String echo() {
        return "env=" + env + "; commonPropValue = " + commonPropValue + "; envProperties = " + envProperties.getProperty("common.prop");
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public TestUser getUser(@PathVariable String id) {
        if (StringUtils.isEmpty(id)) {
            LOG.warn("id shouldn't be empty");
        }
        TestUser user = new TestUser(id, "Sergey");
        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<TestUser> getUser() {
        List<TestUser> users = new ArrayList<>();
        users.add(new TestUser("1", "Sergey"));
        users.add(new TestUser("2", "Dima"));
        users.add(new TestUser("3", "Alex"));
        users.add(new TestUser("4", "Petia"));
        return users;
    }
}
