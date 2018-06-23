package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TodoService {

    public List<Todo> getAllTodo();
    public List<Todo> getUnfinishedBusinesses();
    void save(String title);
    void deleteTodo(Long id);
    void update(Todo editedTodo);
    public Optional<Todo> getTodoById(Long id);
}
