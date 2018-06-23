package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.models.Todo;
import com.greenfoxacademy.todos.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller(value = "todo")
public class WebController {

    private final
    TodoService todoService;

    @Autowired
    public WebController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value = {"/", "/list"})
    public String getAll(Model model) {
        model.addAttribute("todos", todoService.getAllTodo());
        return "index";
    }

    @GetMapping(value = {"todo"})
    public String getUnfinishedTodos(Model model, @RequestParam("isActive") Boolean isActive) {
        if (isActive) {
            model.addAttribute("todos", todoService.getUnfinishedBusinesses());
        } else {
            model.addAttribute("todos", todoService.getAllTodo());
        }
        return "index";
    }

    @RequestMapping(value = "/todo/add", method = RequestMethod.GET)
    public String add() {
        return "add";
    }

    @RequestMapping(value = "/todo/save", method = RequestMethod.POST)
    public String saveTodo(Model model, @ModelAttribute("title") String title) {
        todoService.save(title);
        model.addAttribute("todos", todoService.getAllTodo());
        return "index";
    }

    @GetMapping(value = {"todo/delete"})
    public String deleteTodo(Model model, @RequestParam("id") Long id) {
        todoService.deleteTodo(id);
        model.addAttribute("todos", todoService.getAllTodo());
        return "index";
    }

    @GetMapping(value = {"todo/edit"})
    public String editFormPage(Model model, @RequestParam("id") Long id) {
        model.addAttribute("id", id);
        model.addAttribute("editedTodo", new Todo());
        return "edit";
    }

    @PostMapping(value = {"todo/edit"})
    public String update(Model model, @ModelAttribute(value = "editedTodo") Todo editedTodo,
                         @ModelAttribute(value="id") Long id) {
        editedTodo.setId(id);
        todoService.update(editedTodo);
        model.addAttribute("todos", todoService.getAllTodo());
        return "index";
    }

    @RequestMapping(value = "/todo/tododpage", method = RequestMethod.GET)
    public String todoPage(Model model, @RequestParam("id") Long id) {
        Optional<Todo> todo = todoService.getTodoById(id);
        model.addAttribute("todo", todo);
        return "todopage";
    }
}
