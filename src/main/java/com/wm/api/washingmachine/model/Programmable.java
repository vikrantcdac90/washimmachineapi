package com.wm.api.washingmachine.model;

import com.wm.api.washingmachine.service.Program;

import java.util.List;

public interface Programmable {
    List<Program> getPrograms();
}