package com.greenfox.programmerfoxclub.programmerfoxclub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Drink {

    @Id
    @GeneratedValue
    private Long id;
    private String drinkName;

    public Drink(){}

    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
}
