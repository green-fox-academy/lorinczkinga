package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {
    List<Assignee> getAllAssignees();
    void save(String title, String email);
    void deleteTodo(Long id);
    void update(Assignee editedAssignee, Long id);
    Assignee getAssigneeById(Long id);
    List<Assignee> getAssigneeByName(String name);
    void setTodoToAssignee(Long todoId, Long AssigneeId);
}
