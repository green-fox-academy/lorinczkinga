package com.greenfox.programmerfoxclub.programmerfoxclub.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    private List<Trick> listOfLearnedTricks;
    private List<Trick> tricksToLearn;

    private Food food;
    private Drink drink;

    @OneToOne
    private User user;

    public Fox(){}

    public Fox(String name, List<Trick> availableTricks) {
        this.name = name;
        this.food = new Food("salad");
        this.drink = new Drink("tea");
        this.listOfLearnedTricks = new ArrayList<>();
        setTricksToLearn(availableTricks);
    }

    public Fox(String name, List<Trick> listOfLearnedTricks, List<Trick> availableTricks, String food, String drink) {
        this.name = name;
        this.listOfLearnedTricks = listOfLearnedTricks;
        setTricksToLearn(availableTricks);
        this.food = new Food(food);
        this.drink = new Drink(drink);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getListOfLearnedTricks() {
        return listOfLearnedTricks;
    }

    public void setListOfLearnedTricks(List<Trick> listOfLearnedTricks) {
        this.listOfLearnedTricks = listOfLearnedTricks;
    }

    public List<Trick> getTricksToLearn() {
        return tricksToLearn;
    }

    public void setTricksToLearn(List<Trick> availableTricks) {
        tricksToLearn = availableTricks;
        for (int i = 0; i < availableTricks.size(); i++) {
            for (int j = 0; j < listOfLearnedTricks.size(); j++) {
                 if (availableTricks.get(i).getTrickName().equals(getListOfLearnedTricks().get(j).getTrickName())) {
                     for (int k = 0; k < tricksToLearn.size(); k++) {
                         if (tricksToLearn.get(k).getTrickName().equals(getListOfLearnedTricks().get(j).getTrickName())) {
                             tricksToLearn.remove(k);
                         }
                     }
                 }
            }
        }
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
