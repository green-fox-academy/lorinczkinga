package com.greenfox.programmerfoxclub.programmerfoxclub.services;

import com.greenfox.programmerfoxclub.programmerfoxclub.models.Drink;
import com.greenfox.programmerfoxclub.programmerfoxclub.models.Food;
import com.greenfox.programmerfoxclub.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.programmerfoxclub.models.Trick;
import com.greenfox.programmerfoxclub.programmerfoxclub.repositories.FoxList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxService {
    Fox createFox(String name, List<Trick> availableTricks);
    Boolean existsFox(String name);
    FoxList getFoxList();
    Fox getFox(String name);

    void learnTrick(Fox fox, String trickNameToLearn);
    List<Food> getFoodList();
    List<Drink> getDrinkList();
    List<Trick> getAvailableTricks();
}
