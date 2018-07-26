package com.greenfoxacademy.restbasics.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {

    @Id
    @GeneratedValue
    private Long id;

    private String createdAt;
    private String endpoint;
    private String data;

    public Log() {
        this.createdAt = String.valueOf(LocalDateTime.now());
    }

    public Log(String endpoint, String data) {
        this.createdAt = String.valueOf(LocalDateTime.now());
        this.endpoint = endpoint;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}