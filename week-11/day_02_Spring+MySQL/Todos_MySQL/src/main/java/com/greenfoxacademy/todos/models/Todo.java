package com.greenfoxacademy.todos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    public Todo(){
        this.timestamp = LocalDateTime.now();
    }

    public Todo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.timestamp = LocalDateTime.now();
    }

    public Todo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.timestamp = LocalDateTime.now();
    }

    public Todo(Long id, String title, Boolean urgent, Boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
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
}
