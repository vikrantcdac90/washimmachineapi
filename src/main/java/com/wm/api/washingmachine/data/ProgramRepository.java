package com.wm.api.washingmachine.data;

import com.wm.api.washingmachine.service.Program;
import org.springframework.data.repository.CrudRepository;


public interface ProgramRepository extends CrudRepository<Program, Long> {
    Program save(Program program);
}