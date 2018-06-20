package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class WebController {

    private final
    BankService bankService;

    @Autowired
    public WebController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/add")
    public String addAndShowAccount(Model model, @RequestParam(value = "name", required = false) String name) {
        bankService.addToList(bankService.createByName(name));
        model.addAttribute("accountList", bankService.getAllAccountList());
        model.addAttribute("newAccount", new BankAccount());
        return "addAndShowAccount";
    }

    @PostMapping("/create-new-account")
    public String createNewAccount(Model model, @ModelAttribute(value = "newAccount") BankAccount newAccount,
                                   @ModelAttribute(value = "isKing") Boolean isKing,
                                   @ModelAttribute(value = "isGoodGuy") Boolean isGoodGuy,
                                   @ModelAttribute(value = "accountList") ArrayList<BankAccount> accountList) {

        newAccount.setGoodGuy(isGoodGuy);
        newAccount.setKing(isKing);
        newAccount.setBalanceWithCurrency();
        bankService.addToList(newAccount);
        model.addAttribute("accountList", bankService.getAllAccountList());
        return "addAndShowAccount";
    }

    @PostMapping("/balance-increase")
    public String createNewAccount(Model model, @ModelAttribute(value = "index") int index,
                                   @ModelAttribute(value = "newAccount") BankAccount newAccount,
                                   @ModelAttribute(value = "isKing") String isKing,
                                   @ModelAttribute(value = "isGoodGuy") String isGoodGuy,
                                   @ModelAttribute(value = "accountList") ArrayList<BankAccount> accountList) {

        bankService.balanceIncrease(index);
        model.addAttribute("accountList", bankService.getAllAccountList());
        return "addAndShowAccount";
    }

    @RequestMapping("/HTMLception")
    public String HTLMception(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }

    @RequestMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("SimbaAccount", new BankAccount("Simba", 2000, "Zebra", "lion"));
        return "show";
    }

    public BankService getBankService() {
        return bankService;
    }
}
