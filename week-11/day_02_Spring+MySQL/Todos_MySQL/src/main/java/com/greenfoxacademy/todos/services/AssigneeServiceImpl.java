package com.greenfoxacademy.todos.services;

import com.greenfoxacademy.todos.models.Assignee;
import com.greenfoxacademy.todos.models.Todo;
import com.greenfoxacademy.todos.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssigneeServiceImpl implements AssigneeService {

    private final
    AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
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
    public Optional<Assignee> getAssigneeByName(String name) {
        return assigneeRepository.findByName(name);
    }

    @Override
    public void setTodoToAssignee(Todo todo, Long AssigneeId) {
        Assignee assigneeToUpdate = assigneeRepository.findById(AssigneeId).get();
        assigneeToUpdate.getTodosOfTheAssignee().add(todo);
        assigneeRepository.save(assigneeToUpdate);
    }

}
