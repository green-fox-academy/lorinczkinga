package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    List<Todo> getAllTodo();
    List<Todo> getUnfinishedBusinesses();
    void saveTodo(String title, Long assigneeId);
    void deleteTodo(Long id);
    void update(Todo editedTodo);
    Todo getTodoById(Long id);
    List<Todo> searchTodo(String searchType, String search);


}
