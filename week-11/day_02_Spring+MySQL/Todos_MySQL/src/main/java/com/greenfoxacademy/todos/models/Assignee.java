package com.greenfoxacademy.todos.models;

import javax.persistence.*;
import java.util.*;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignee", fetch = FetchType.EAGER)
    private Set<Todo> todosOfTheAssignee = new HashSet<>();

    public Set<Todo> getTodosOfTheAssignee() {
        return todosOfTheAssignee;
    }

    public Assignee(String name, String email, Set<Todo> todosOfTheAssignee) {
        this.name = name;
        this.email = email;
        this.todosOfTheAssignee = todosOfTheAssignee;
    }

    public void setTodosOfTheAssignee(Set<Todo> todosOfTheAssignee) {
        this.todosOfTheAssignee = todosOfTheAssignee;
    }

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
