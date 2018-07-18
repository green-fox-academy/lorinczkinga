package com.greenfoxacademy.todos.repositories;

import com.greenfoxacademy.todos.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    List<Assignee> findByNameEquals(String name);
}
