package com.greenfoxacademy.restbasics.Repositories;

import com.greenfoxacademy.restbasics.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
