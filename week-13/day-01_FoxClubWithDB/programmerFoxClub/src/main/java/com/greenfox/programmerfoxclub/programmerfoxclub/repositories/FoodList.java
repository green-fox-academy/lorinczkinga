package com.greenfox.programmerfoxclub.programmerfoxclub.repositories;

import com.greenfox.programmerfoxclub.programmerfoxclub.models.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodList {
    private List<Food> foodList;

    public FoodList() {
        this.foodList = new ArrayList<>(Arrays.asList(
                new Food("salad"),
                new Food("meat"),
                new Food("fruit"),
                new Food("vegetables"),
                new Food("goulash")));
    }

    public FoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}
