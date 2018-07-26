package com.greenfox.programmerfoxclub.programmerfoxclub.services;

import com.greenfox.programmerfoxclub.programmerfoxclub.models.Drink;
import com.greenfox.programmerfoxclub.programmerfoxclub.models.Food;
import com.greenfox.programmerfoxclub.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.programmerfoxclub.models.Trick;
import com.greenfox.programmerfoxclub.programmerfoxclub.repositories.DrinkList;
import com.greenfox.programmerfoxclub.programmerfoxclub.repositories.FoodList;
import com.greenfox.programmerfoxclub.programmerfoxclub.repositories.FoxList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {

    private FoxList foxList;
    private FoodList foodList;
    private DrinkList drinkList;
    private List<Trick> availableTricks;

    public FoxServiceImpl() {
        this.foxList = new FoxList();
        this.foodList = new FoodList();
        this.drinkList = new DrinkList();
        this.availableTricks = new ArrayList<>(Arrays.asList(
                new Trick("be happy"),
                new Trick("be awesome"),
                new Trick("learn Java")));
    }

    public void setFoxList(FoxList foxList) {
        this.foxList = foxList;
    }

    public List<Trick> getAvailableTricks() {
        return availableTricks;
    }

    public void setAvailableTricks(List<Trick> availableTricks) {
        this.availableTricks = availableTricks;
    }

    @Override
    public List<Food> getFoodList() {
        return foodList.getFoodList();
    }

    public void setFoodList(FoodList foodList) {
        this.foodList = foodList;
    }

    @Override
    public List<Drink> getDrinkList() {
        return drinkList.getDrinkList();
    }

    public void setDrinkList(DrinkList drinkList) {
        this.drinkList = drinkList;
    }

    @Override
    public Fox createFox(String name, List<Trick> availableTricks) {
        Fox fox = new Fox(name, availableTricks);
        foxList.listOfFoxes.put(fox.getName(), fox);
        return fox;
    }

    @Override
    public Boolean existsFox(String name) {
        return foxList.listOfFoxes.containsKey(name);
    }

    @Override
    public FoxList getFoxList() {
        return foxList;
    }

    @Override
    public Fox getFox(String name) {
        return foxList.listOfFoxes.get(name);
    }

    @Override
    public void learnTrick(Fox fox, String trickNameToLearn) {
        Trick trickToLearn = new Trick(trickNameToLearn);
        fox.getListOfLearnedTricks().add(trickToLearn);
        fox.setTricksToLearn(availableTricks);
    }
}
