package com.greenfox.dependenciesapp.services.UsefulUtilities;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityServiceImpl implements UtilityService{
    ArrayList<String> colors;
    Random random;

    public UtilityServiceImpl() {
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("lime");
        colors.add("orange");
        colors.add("magenta");
        random = new Random();
    }

    public String randomColor() {
        return colors.get(random.nextInt(colors.size()));
    }

    @Override
    public String validateEmail(String email) {
        String result = "";
        if (email.contains("@") && email.contains(".")) {
            if (email.indexOf("@") < email.lastIndexOf(".")) {
                result+= "<font color=\"green\">" + email + " is a valid email address </font>";
            }
        } else {
            result+= "<font color=\"red\">" + email + " is not a valid email address </font>";
        }
        return result;
    }

    public String caesar(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }
}