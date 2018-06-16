package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @RequestMapping("/webGreeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        return "webGreeting";
    }

    @RequestMapping(value = "/web/greeting")
    public String greetingCounter(@RequestParam(value = "name", required = true) String name, Model model) {
        model.addAttribute("Greeting", new Greeting("Hello, " + name + "!"));
        return "greetingCounter";
    }

    @RequestMapping(value = "/web/internationalHello")
    public String internationalGreeting(Model model) {
        model.addAttribute("helloObject", new InternationalHello());
        return "internationalHello";
    }

}
