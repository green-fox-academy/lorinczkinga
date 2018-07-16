package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    List<Todo> getAllTodo();
    List<Todo> getUnfinishedBusinesses();
    void save(String title);
    void deleteTodo(Long id);
    void update(Todo editedTodo);
    Todo getTodoById(Long id);
    List<Todo> getTodoByTitle(String title);
}
