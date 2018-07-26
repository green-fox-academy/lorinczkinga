package com.greenfoxacademy.restbasics.controllers;

import com.greenfoxacademy.restbasics.models.*;
import com.greenfoxacademy.restbasics.models.Error;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/dountil/{what}")
    public Object doUntil(@PathVariable("what") String what, @RequestBody(required = false) Until until) {
        if (until == null) {
            return new Error("Please provide a number!");
        } else {
            DoUntil doUntil = new DoUntil();
            return doUntil.doUntil(what, until);
        }
    }

    @PostMapping("/arrays")
    public Object doUntil(@RequestBody ExpectedObject object) {

        if (object.numbers.length == 0) {
            return new Error("Please provide a number!");
        } else {
            if (object.what.equals("sum")) {
                return new SumMultiply().sum(object.numbers);
            } else if (object.what.equals("multiply")) {
                return new SumMultiply().multiply(object.numbers);
            } else if (object.what.equals("double")) {
                return new DoublingArray().doubling(object.numbers);
            } else {
                return new Error("Please provide an available operation: sum, multiply or double!");
            }
        }
    }
}
