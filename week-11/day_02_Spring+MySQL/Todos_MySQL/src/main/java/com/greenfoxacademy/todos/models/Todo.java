package com.greenfoxacademy.todos.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Boolean urgent;
    private Boolean done;
    private LocalDateTime timestamp;

    @ManyToOne(fetch = FetchType.EAGER)
    private Assignee assignee;

    public Todo(){
        this.timestamp = LocalDateTime.now();
    }

    public Todo(String title, Assignee assignee) {
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.assignee = assignee;
        this.timestamp = LocalDateTime.now();
    }

    public Todo(String title, Boolean urgent, Boolean done, Assignee assignee) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.assignee = assignee;
        this.timestamp = LocalDateTime.now();
    }

    public Todo(Long id, String title, Boolean urgent, Boolean done, Assignee assignee) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.assignee = assignee;
        this.timestamp = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }


    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}
