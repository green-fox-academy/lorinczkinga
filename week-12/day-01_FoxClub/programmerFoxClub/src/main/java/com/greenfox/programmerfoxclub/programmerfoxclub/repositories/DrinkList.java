package com.greenfox.programmerfoxclub.programmerfoxclub.repositories;

import com.greenfox.programmerfoxclub.programmerfoxclub.models.Drink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkList {
    private List<Drink> drinkList;

    public DrinkList() {
        this.drinkList = new ArrayList<>(Arrays.asList(
                new Drink("lemonade"),
                new Drink("coffee"),
                new Drink("tea"),
                new Drink("water"),
                new Drink("orange juice")));
    }

    public DrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }
}
