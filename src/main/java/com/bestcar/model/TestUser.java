package com.bestcar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * Created by skucherenosov on 6/25/16.
 */
public class TestUser implements Serializable {

    @JsonIgnore
    private String id;
    private String name;

    public TestUser() {
    }

    public TestUser(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
