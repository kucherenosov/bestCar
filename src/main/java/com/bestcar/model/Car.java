package com.bestcar.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by sergey on 7/5/16.
 */
@Entity
@Table(name = "CAR")
public class Car {

    @Id
    @Column(name = "CAR_ID")
    private Long carId;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CAR_COMPANY_ID", nullable = false)
    private CarCompany carCompany;

    @Column(name="CAR_MODEL")
    private String carModel;

    @Column(name="PRICE")
    private BigDecimal price;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getCarId() != null ? getCarId().equals(car.getCarId()) : car.getCarId() == null;
    }

    @Override
    public int hashCode() {
        return getCarId() != null ? getCarId().hashCode() : 0;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public CarCompany getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(CarCompany carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
