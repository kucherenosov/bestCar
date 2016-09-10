package com.bestcar.repo;

import com.bestcar.model.UserPreferences;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by skucherenosov on 6/26/16.
 */
public interface UserPreferencesRepository extends CrudRepository<UserPreferences, String>, JpaSpecificationExecutor<UserPreferences> {

    @Query("select p from UserPreferences p")
    List<UserPreferences> getUserPreferences();

//    Page<UserPreferences> findByName(String name, Pageable pageable);

     List<UserPreferences> findByName(String name);

}
