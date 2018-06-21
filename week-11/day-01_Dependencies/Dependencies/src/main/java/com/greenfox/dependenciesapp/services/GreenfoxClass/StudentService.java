package com.greenfox.dependenciesapp.services.GreenfoxClass;

import java.util.List;

public interface StudentService {

    public List<String> findAll();
    public void save(String student);
    public int count();
    public String studentChecker(String name);
}
