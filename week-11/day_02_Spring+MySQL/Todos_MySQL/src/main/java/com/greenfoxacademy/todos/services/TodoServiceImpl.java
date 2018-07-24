package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Todo;
import com.greenfoxacademy.todos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private final
    TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodo() {
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public List<Todo> getUnfinishedBusinesses() {
        return todoRepository.findByDoneFalse();
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public void update(Todo editedTodo) {
        todoRepository.save(editedTodo);
    }

    @Override
    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).get();
    }

    @Override
    public List<Todo> searchTodo(String searchType, String search) {
        if (Todo.searchOptions[0].equals(searchType)) {
            return todoRepository.findByTitleEquals(search);
        } else if (Todo.searchOptions[1].equals(searchType)) {
            return todoRepository.findByTimestampEquals(search);
        } else
            return todoRepository.findByDueDateEquals(search);
        }
    }