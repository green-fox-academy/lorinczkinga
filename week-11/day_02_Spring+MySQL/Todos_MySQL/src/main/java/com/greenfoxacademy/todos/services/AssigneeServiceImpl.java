package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Assignee;
import com.greenfoxacademy.todos.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

    private final
    AssigneeRepository assigneeRepository;

    private final
    TodoService todoService;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository, TodoService todoService) {
        this.assigneeRepository = assigneeRepository;
        this.todoService = todoService;
    }

    @Override
    public List<Assignee> getAllAssignees() {
        List<Assignee> assignees = new ArrayList<>();
        assigneeRepository.findAll().forEach(assignees::add);
        return assignees;
    }

    @Override
    public void save(String name, String email) {
        assigneeRepository.save(new Assignee(name, email));
    }

    @Override
    public void deleteTodo(Long id) {
        assigneeRepository.deleteById(id);
    }

    @Override
    public void update(Assignee editedAssignee, Long id) {
        editedAssignee.setId(id);
        assigneeRepository.save(editedAssignee);
    }

    @Override
    public Assignee getAssigneeById(Long id) {
        return assigneeRepository.findById(id).get();
    }

    @Override
    public List<Assignee> getAssigneeByName(String name) {
        return assigneeRepository.findByNameEquals(name);
    }

    @Override
    public void setTodoToAssignee(Long todoId, Long AssigneeId) {
        Assignee assigneeToUpdate = assigneeRepository.findById(AssigneeId).get();
        assigneeToUpdate.getTodosOfTheAssignee().add(todoService.getTodoById(todoId));
        assigneeRepository.save(assigneeToUpdate);
    }

}
