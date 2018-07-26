package com.greenfox.programmerfoxclub.programmerfoxclub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Food {

    @Id
    @GeneratedValue
    private Long id;
    private String foodName;

    public Food(){}

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
