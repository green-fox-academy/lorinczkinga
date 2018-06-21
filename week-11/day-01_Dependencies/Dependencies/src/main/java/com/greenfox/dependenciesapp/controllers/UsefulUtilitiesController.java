package com.greenfox.dependenciesapp.controllers;

import com.greenfox.dependenciesapp.services.UsefulUtilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

    private final
    UtilityService utilityService;

    @Autowired
    public UsefulUtilitiesController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping(value = "/useful", method = RequestMethod.GET)
    public String mainPage() {
        return "UsefulUtilities/index";
    }

    @RequestMapping(value = "/useful/colored", method = RequestMethod.GET)
    public String coloredPage(Model model) {
        model.addAttribute("randomBackgroundColor", utilityService.randomColor());
        return "UsefulUtilities/coloredPage";
    }

    @RequestMapping(value = "/useful/email", method = RequestMethod.GET)
    public String emailValidation(Model model, @RequestParam("email") String email) {
        model.addAttribute("response", utilityService.validateEmail(email));
        return "UsefulUtilities/email";
    }

    @RequestMapping(value = "/useful/encode", method = RequestMethod.GET)
    public String encode(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
        model.addAttribute("resultedText", utilityService.caesar(text, number));
        return "UsefulUtilities/enDecode";
    }

    @RequestMapping(value = "/useful/decode", method = RequestMethod.GET)
    public String decode(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
        model.addAttribute("resultedText", utilityService.caesar(text, number * (-1)));
        return "UsefulUtilities/enDecode";
    }

}
