package com.greenfoxacademy.todos.controllers;

import com.greenfoxacademy.todos.models.Assignee;
import com.greenfoxacademy.todos.models.Todo;
import com.greenfoxacademy.todos.services.AssigneeService;
import com.greenfoxacademy.todos.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    private final
    TodoService todoService;

    private final
    AssigneeService assigneeService;

    @Autowired
    public TodoController(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @GetMapping(value = "todo")
    public String getUnfinishedTodos(Model model, @RequestParam("isActive") Boolean isActive) {
        if (isActive) {
            model.addAttribute("todos", todoService.getUnfinishedBusinesses());
        } else {
            model.addAttribute("todos", todoService.getAllTodo());
        }
        return "index";
    }

    @RequestMapping(value = "todo/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("assigneeList", assigneeService.getAllAssignees());
        return "addTodo";
    }

    @RequestMapping(value = "todo/save", method = RequestMethod.POST)
    public String createTodo(@ModelAttribute("title") String title,
                             @ModelAttribute(value = "selectedAssigneeId") Long selectedAssigneeId) {
        todoService.saveTodo(title, selectedAssigneeId);
        return "redirect:/list";
    }

    @RequestMapping(value = "todo/search", method = RequestMethod.POST)
    public String searchTodo(Model model, @ModelAttribute("search") String search,
                             @ModelAttribute("selectedSearchType") String selectedSearchType) {
        if (todoService.searchTodo(selectedSearchType, search).size() == 0) {
            model.addAttribute("errorflag", true);
        }
        model.addAttribute("searchedTodoList", todoService.searchTodo(selectedSearchType, search));
        return "searchresults";
    }

    @GetMapping(value = "todo/delete")
    public String deleteTodo(@RequestParam("id") Long id) {
        todoService.deleteTodo(id);
        return "redirect:/list";
    }

    @GetMapping(value = "todo/edit")
    public String editFormPage(Model model, @RequestParam("id") Long id) {
        model.addAttribute("assigneeList", assigneeService.getAllAssignees());
        model.addAttribute("todoId", id);
        model.addAttribute("editedTodo", todoService.getTodoById(id));
        return "editTodo";
    }

    @PostMapping(value = "todo/edit")
    public String update(@ModelAttribute(value = "editedTodo") Todo editedTodo,
                         @ModelAttribute(value="todoId") Long todoId,
                         @ModelAttribute(value = "selectedAssigneeId") Long selectedAssigneeId) {
        editedTodo.setTimestamp(todoService.getTodoById(todoId).getTimestamp());
        editedTodo.setId(todoId);
        editedTodo.setAssignee(assigneeService.getAssigneeById(selectedAssigneeId));
        todoService.update(editedTodo);
        return "redirect:/list";
    }

    @RequestMapping(value = "todo/todopage", method = RequestMethod.GET)
    public String todoPage(Model model, @RequestParam("id") Long id) {
        model.addAttribute("todo", todoService.getTodoById(id));
        return "todopage";
    }
}
