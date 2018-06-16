package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private static AtomicLong numberOfGreetings = new AtomicLong();
    private String content;
    private long id;

    public Greeting() { }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public Greeting(String content) {
        this.id = numberOfGreetings.incrementAndGet();
        this.content = content;
    }
}
