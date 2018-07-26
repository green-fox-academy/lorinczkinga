package com.greenfoxacademy.restbasics.services;

import com.greenfoxacademy.restbasics.Repositories.LogRepository;
import com.greenfoxacademy.restbasics.models.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceImpl implements LogService{

    private final LogRepository logRepository;

    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void save(Log log) {
        logRepository.save(log);
    }

    @Override
    public List<Log> getAll() {
        List<Log> logs = new ArrayList<>();
        logRepository.findAll().forEach(logs::add);
        return logs;
    }
}
