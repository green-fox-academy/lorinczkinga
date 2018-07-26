package com.greenfoxacademy.restbasics.services;

import com.greenfoxacademy.restbasics.models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
    public void save(Log log);
    public List<Log> getAll();
}
