package com.bestcar.model.dto;

/**
 * Created by sergey on 7/26/16.
 */
public class DateView {

    String enDate;

    String frDate;

    public DateView(String enDate, String frDate) {
        this.enDate = enDate;
        this.frDate = frDate;
    }

    public String getEnDate() {
        return enDate;
    }

    public void setEnDate(String enDate) {
        this.enDate = enDate;
    }

    public String getFrDate() {
        return frDate;
    }

    public void setFrDate(String frDate) {
        this.frDate = frDate;
    }
}
