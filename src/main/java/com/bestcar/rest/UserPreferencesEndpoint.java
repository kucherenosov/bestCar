package com.bestcar.rest;

import com.bestcar.model.UserPreferences;
import com.bestcar.repo.UserPreferencesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by skucherenoso on 6/26/16.
 */
@RestController
@RequestMapping("/rest/user-pref")
public class UserPreferencesEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(UserPreferencesEndpoint.class);

    @Autowired
    protected UserPreferencesRepository userPreferencesRepo;

    @RequestMapping(value = "/{prefId}", method = RequestMethod.GET)
    public UserPreferences getUserPreferences(@PathVariable String prefId) {
        UserPreferences preference = userPreferencesRepo.findOne(prefId);
        if (preference == null) {
            LOG.warn("couldn't find any UserPreferences with id {} ", prefId);
        }
        return preference;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserPreferences> listUserPreferences() {
        //List<UserPreferences> preferences =  Lists.newArrayList(userPreferencesRepo.findAll());
        List<UserPreferences> preferences =  userPreferencesRepo.getUserPreferences();  //USING QUERY
        return preferences;
    }

}
