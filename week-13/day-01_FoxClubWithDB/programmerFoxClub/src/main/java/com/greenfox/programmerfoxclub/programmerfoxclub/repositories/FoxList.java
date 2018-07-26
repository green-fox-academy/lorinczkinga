package com.greenfox.programmerfoxclub.programmerfoxclub.repositories;

import com.greenfox.programmerfoxclub.programmerfoxclub.models.Fox;

import java.util.HashMap;

public class FoxList {
    public HashMap<String, Fox> listOfFoxes;

    public HashMap<String, Fox> getListOfFoxes() {
        return listOfFoxes;
    }

    public void setListOfFoxes(HashMap<String, Fox> listOfFoxes) {
        this.listOfFoxes = listOfFoxes;
    }

    public FoxList() {
        this.listOfFoxes = new HashMap<>();
    }
}
