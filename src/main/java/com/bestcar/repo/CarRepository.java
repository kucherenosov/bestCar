package com.bestcar.repo;

import com.bestcar.model.Car;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergey on 7/5/16.
 */
public interface CarRepository extends CrudRepository<Car, Long>, JpaSpecificationExecutor<Car> {
}
