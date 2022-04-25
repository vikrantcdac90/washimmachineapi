package com.wm.api.washingmachine.service;

import com.wm.api.washingmachine.model.WashingMachine;

public interface WashingMachineService {
    WashingMachine getFirst();
    WashingMachine save(WashingMachine washingMachine);
}