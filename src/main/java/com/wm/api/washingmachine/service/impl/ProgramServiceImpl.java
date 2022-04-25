package com.wm.api.washingmachine.service.impl;

import com.wm.api.washingmachine.data.ProgramRepository;
import com.wm.api.washingmachine.service.Program;
import com.wm.api.washingmachine.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramServiceImpl implements ProgramService {
    private final ProgramRepository programRepository;

    @Autowired
    public ProgramServiceImpl(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    @Override
    public Program save(Program program) {
        return programRepository.save(program);
    }
}