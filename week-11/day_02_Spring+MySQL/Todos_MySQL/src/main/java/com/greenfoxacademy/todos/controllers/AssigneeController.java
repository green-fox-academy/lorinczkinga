package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.models.Assignee;
import com.greenfoxacademy.todos.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {

    private final
    AssigneeService assigneeService;

    @Autowired
    public AssigneeController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @RequestMapping(value = "/assignee", method = RequestMethod.GET)
    public String getListOfAssignees(Model model) {
        model.addAttribute("allAssignees", assigneeService.getAllAssignees());
        return "listOfAssignees";
    }

    @RequestMapping(value = "assignee/add", method = RequestMethod.GET)
    public String add() {
        return "addAssignee";
    }

    @RequestMapping(value = "assignee/save", method = RequestMethod.POST)
    public String saveAssignee(Model model, @ModelAttribute("name") String name,
                           @ModelAttribute("email") String email) {
        assigneeService.save(name, email);
        model.addAttribute("assignees", assigneeService.getAllAssignees());
        return "redirect:/assignee";
    }

    @RequestMapping(value = "assignee/search", method = RequestMethod.POST)
    public String searchAssignee(Model model, @ModelAttribute("name") String name) {
        if (assigneeService.getAssigneeByName(name).size() == 0) {
            model.addAttribute("errorflag", true); }
        model.addAttribute("searchedAssignees", assigneeService.getAssigneeByName(name));
        return "assigneeSearchResults";
    }

    @GetMapping(value = {"assignee/delete"})
    public String deleteAssignee(Model model, @RequestParam("id") Long id) {
        assigneeService.deleteTodo(id);
        model.addAttribute("todos", assigneeService.getAllAssignees());
        return "redirect:/assignee";
    }

    @GetMapping(value = {"assignee/edit"})
    public String editFormPage(Model model, @RequestParam("id") Long id) {
        model.addAttribute("id", id);
        model.addAttribute("editedAssignee", new Assignee());
        return "editAssignee";
    }

    @PostMapping(value = {"assignee/edit"})
    public String updateAssignee(Model model, @ModelAttribute(value = "editedAssignee") Assignee editedAssignee,
                         @ModelAttribute(value="id") Long id) {
        editedAssignee.setId(id);
        assigneeService.update(editedAssignee);
        model.addAttribute("assignees", assigneeService.getAllAssignees());
        return "redirect:/assignee";
    }
}
