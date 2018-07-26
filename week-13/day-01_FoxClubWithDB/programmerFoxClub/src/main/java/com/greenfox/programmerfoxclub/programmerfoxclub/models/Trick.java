package com.greenfox.programmerfoxclub.programmerfoxclub.models;

import javax.persistence.Entity;

@Entity
public class Trick {
    private String trickName;

    public Trick(String trickName) {
        this.trickName = trickName;
    }

    public String getTrickName() {
        return trickName;
    }

    public void setTrickName(String drinkName) {
        this.trickName = trickName;
    }
}