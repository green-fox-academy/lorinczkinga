package com.greenfox.dependenciesapp.services.Colors;

public class GreyColor implements MyColor{
    private static String color;

    GreyColor(){
        GreyColor.color = "grey";
    }

    @Override
    public void printColor() {
        System.out.println("My color is " + GreyColor.color + ".");
    }
}
