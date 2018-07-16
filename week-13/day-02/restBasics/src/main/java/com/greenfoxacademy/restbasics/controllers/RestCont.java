package com.greenfoxacademy.restbasics.controllers;

import com.greenfoxacademy.restbasics.models.AppendA;
import com.greenfoxacademy.restbasics.models.Doubling;
import com.greenfoxacademy.restbasics.models.Greeter;
import com.greenfoxacademy.restbasics.models.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {

    @GetMapping("doubling")
    public Object doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new Error("Please provide an input!");
        } else {
            return new Doubling(input);
        }
    }

    @GetMapping("greeter")
    public Object greeter(@RequestParam(required = false) String name,
                          @RequestParam(required = false) String title) {
        if (name == null) {
            return new Error("Please provide a name!");
        } else if (title == null) {
            return new Error("Please provide a title!");
        } else {
            return new Greeter(name, title);
        }
    }

    @GetMapping("appenda/{appendable}")
    public Object doubling(@PathVariable String appendable) {
            return new AppendA(appendable);
    }
}
