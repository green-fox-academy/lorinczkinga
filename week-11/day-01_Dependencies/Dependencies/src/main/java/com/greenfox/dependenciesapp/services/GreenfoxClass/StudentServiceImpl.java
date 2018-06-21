package com.greenfox.dependenciesapp.services.GreenfoxClass;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    ArrayList<String> names;

    public StudentServiceImpl() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    @Override
    public int count() {
        return names.size();
    }

    @Override
    public String studentChecker(String name) {
        String result;
        if (names.contains(name)) {
            result = name + " is in the class.";
        } else {
            result = name + " isn't in the class.";
        }
        return result;
    }
}