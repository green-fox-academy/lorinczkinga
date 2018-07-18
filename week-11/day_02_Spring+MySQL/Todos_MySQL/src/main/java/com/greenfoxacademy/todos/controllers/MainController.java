package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private final
    TodoService todoService;

    @Autowired
    public MainController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", "/list"})
    public String getAll(Model model)    {
        model.addAttribute("todos", todoService.getAllTodo());
        return "index";
    }
}
