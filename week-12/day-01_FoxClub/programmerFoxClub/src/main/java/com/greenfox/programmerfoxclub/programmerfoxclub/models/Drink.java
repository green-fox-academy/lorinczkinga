package com.greenfox.programmerfoxclub.programmerfoxclub.models;

public class Drink {
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
