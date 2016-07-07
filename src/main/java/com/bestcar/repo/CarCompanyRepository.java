package com.bestcar.repo;

import com.bestcar.model.CarCompany;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sergey on 7/7/16.
 */
public interface CarCompanyRepository extends CrudRepository<CarCompany, Long>, JpaSpecificationExecutor<CarCompany> {
}
