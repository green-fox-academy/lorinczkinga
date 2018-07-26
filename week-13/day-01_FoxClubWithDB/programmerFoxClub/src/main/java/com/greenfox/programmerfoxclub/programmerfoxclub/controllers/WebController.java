package com.greenfox.programmerfoxclub.programmerfoxclub.controllers;

import com.greenfox.programmerfoxclub.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    private final
    FoxService foxService;

    @Autowired
    public WebController(FoxService foxService) {
        this.foxService = foxService;
    }

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String mainPage() {
        return "login";
    }

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String infoPage(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("fox", foxService.getFox(name));
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginFox(Model model, @RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "errorflag", required = false) Boolean errorFlag) {
        if (name == null) {
            return "login";
        } else {
            if (foxService.existsFox(name)) {
                return "redirect:index?name=" + name;
            } else {
                if (errorFlag == null) {
                    errorFlag = true;
                    model.addAttribute("errorflag",errorFlag);
                    return "login";
                } else {
                        foxService.createFox(name, foxService.getAvailableTricks());
                        return "redirect:index?name=" + name;
                }
            }
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String createUser(Model model, @RequestParam(value = "name") String name,
                             @RequestParam(value = "password") String password,
                             @RequestParam(value = "password2") String password2,
                             @RequestParam(value = "errorflag", required = false) Boolean errorFlag) {
        if (password.equals(password2)) {
            errorFlag = true;
        } else {

        }

        return "redirect:login";
    }
}
