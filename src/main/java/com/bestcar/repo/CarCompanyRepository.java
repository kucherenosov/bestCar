package com.bestcar.repo;

import com.bestcar.model.CarCompany;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by skucherenosov on 7/7/16.
 */
@Repository
public interface CarCompanyRepository extends CrudRepository<CarCompany, Long>, JpaSpecificationExecutor<CarCompany> {
}
