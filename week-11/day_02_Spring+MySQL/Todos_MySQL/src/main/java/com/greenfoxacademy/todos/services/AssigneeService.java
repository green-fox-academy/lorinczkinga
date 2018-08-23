package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Assignee;
import com.greenfoxacademy.todos.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AssigneeService {
    List<Assignee> getAllAssignees();
    void save(String title, String email);
    void deleteTodo(Long id);
    void update(Assignee editedAssignee, Long id);
    Assignee getAssigneeById(Long id);
    Optional<Assignee> getAssigneeByName(String name);
    void setTodoToAssignee(Todo todo, Long AssigneeId);
}
