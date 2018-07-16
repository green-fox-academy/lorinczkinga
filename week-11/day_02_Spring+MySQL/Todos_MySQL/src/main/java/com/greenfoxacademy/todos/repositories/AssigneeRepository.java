package com.greenfoxacademy.todos.repositories;

import com.greenfoxacademy.todos.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Todo, Long> {
}
