package com.greenfoxacademy.restbasics.controllers;

import com.greenfoxacademy.restbasics.models.*;
import com.greenfoxacademy.restbasics.models.Error;
import com.greenfoxacademy.restbasics.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class RestCont {

    private final
    LogService logService;

    @Autowired
    public RestCont(LogService logService) {
        this.logService = logService;
    }


    @GetMapping("doubling")
    public Object doubling(@RequestParam(required = false) Integer input) {
        logService.save(new Log("doubling", "input=" + input.toString()));
        if (input == null) {
            return new Error("Please provide an input!");
        } else {
            return new Doubling(input);
        }
    }

    @GetMapping("greeter")
    public Object greeter(@RequestParam(required = false) String name,
                          @RequestParam(required = false) String title) {
        logService.save(new Log("greeter", "name=" + name + ", title=" + title));
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
        logService.save(new Log("appenda/{appendable}", "appendable=" + appendable));
        return new AppendA(appendable);
    }

    @PostMapping("dountil/{what}")
    public Object doUntil(@PathVariable("what") String what, @RequestBody(required = false) Until until) {
        logService.save(new Log("dountil/{what}", "what=" + what + ", until=" + until.getUntil().toString()));
        if (until == null) {
            return new Error("Please provide a number!");
        } else {
            DoUntil doUntil = new DoUntil();
            return doUntil.doUntil(what, until);
        }
    }

    @PostMapping("arrays")
    public Object arrayHandler(@RequestBody ExpectedObject object) {
        logService.save(new Log("arrays", "ExpectedObject=" + Arrays.toString(object.numbers) + ", what=" + object.what));
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

    @GetMapping(value = {"/log"})
    public Object log() {
        return new LogEntries(logService.getAll());
    }
}
