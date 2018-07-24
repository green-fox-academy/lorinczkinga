package com.greenfoxacademy.todos.repositories;

import com.greenfoxacademy.todos.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findByDoneFalse();
    List<Todo> findByTitleEquals(String title);
    Todo getOne(Long id);
}
