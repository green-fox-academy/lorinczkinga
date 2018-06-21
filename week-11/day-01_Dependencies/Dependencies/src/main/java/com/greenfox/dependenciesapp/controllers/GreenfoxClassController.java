package com.greenfox.dependenciesapp.controllers;

import com.greenfox.dependenciesapp.services.GreenfoxClass.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreenfoxClassController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/gfa", method = RequestMethod.GET)
    public String mainPage(Model model) {
        model.addAttribute("studentCounter", studentService.count());
        return "GreenfoxClass/index";
    }

    @RequestMapping(value = "/gfa/list", method = RequestMethod.GET)
    public String listAll(Model model) {
        model.addAttribute("listOfStudents", studentService.findAll());
        return "GreenfoxClass/listOfStudents";
    }

    @RequestMapping(value = "/gfa/add", method = RequestMethod.GET)
    public String add() {
        return "GreenfoxClass/add";
    }

    @RequestMapping(value = "/gfa/save", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute("name") String name) {
        studentService.save(name);
        model.addAttribute("listOfStudents", studentService.findAll());
        return "GreenfoxClass/listOfStudents";
    }

    @RequestMapping(value = "/gfa/studentChecker", method = RequestMethod.GET)
    public String checkerPage(Model model, @ModelAttribute(value = "message") String message) {
        return "GreenfoxClass/studentChecker";
    }

    @RequestMapping(value = "/gfa/check", method = RequestMethod.POST)
    public String checker(Model model, @ModelAttribute("name") String name) {
        model.addAttribute("message", studentService.studentChecker(name));
        return "GreenfoxClass/studentChecker";
    }
}
