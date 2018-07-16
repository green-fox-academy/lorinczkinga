package com.greenfox.programmerfoxclub.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private final
    FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping(value = {"nutritionStore"}, method = RequestMethod.GET)
    public String nutritionStorePage(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("fox", foxService.getFox(name));
        model.addAttribute("foodList", foxService.getFoodList());
        model.addAttribute("drinkList", foxService.getDrinkList());
        return "nutritionstore";
    }

    @RequestMapping(value = {"nutritionStore"}, method = RequestMethod.POST)
    public String nutritionStoreSave(@ModelAttribute(value = "fox") Fox fox) {
        foxService.getFox(fox.getName()).setFood(fox.getFood());
        foxService.getFox(fox.getName()).setDrink(fox.getDrink());
        return "redirect:/index?name=" + fox.getName();
    }

    @RequestMapping(value = {"trickCenter"}, method = RequestMethod.GET)
    public String trickCenterPage(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("fox", foxService.getFox(name));
        return "trickCenter";
    }

    @RequestMapping(value = {"trickCenter"}, method = RequestMethod.POST)
    public String trickCenterSave(@ModelAttribute(value = "fox") Fox fox, @ModelAttribute(value = "pickedTrick") String trickName) {
        foxService.learnTrick(foxService.getFox(fox.getName()), trickName);
        return "redirect:/index?name=" + fox.getName();
    }
}
