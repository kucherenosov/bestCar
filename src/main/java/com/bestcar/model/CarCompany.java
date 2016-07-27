package com.bestcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by sergey on 7/7/16.
 */
@Entity
@Table(name = "CAR_COMPANY")
public class CarCompany {

    @Id
    @Column(name = "CAR_COMPANY_ID")
    private Long carCompanyId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OSR")
    private String osr;

    @Column(name = "FILE_NAME")
    private String fileName;

    public Long getCarCompanyId() {
        return carCompanyId;
    }

    public void setCarCompanyId(Long carCompanyId) {
        this.carCompanyId = carCompanyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOsr() {
        return osr;
    }

    public void setOsr(String osr) {
        this.osr = osr;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarCompany that = (CarCompany) o;

        return getCarCompanyId() != null ? getCarCompanyId().equals(that.getCarCompanyId()) : that.getCarCompanyId() == null;

    }

    @Override
    public int hashCode() {
        return getCarCompanyId() != null ? getCarCompanyId().hashCode() : 0;
    }
}
