package com.greenfox.dependenciesapp.services.Colors;

import org.springframework.stereotype.Service;

@Service
public class PinkColor implements MyColor{
    private static String color;

    PinkColor(){
        PinkColor.color = "pink";
    }

    @Override
    public void printColor() {
        System.out.println("My color is " + PinkColor.color + ".");
    }
}
