package com.wm.api.washingmachine.service.impl;

import com.wm.api.washingmachine.data.WashingMachineRepository;
import com.wm.api.washingmachine.model.WashingMachine;
import com.wm.api.washingmachine.service.WashingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WashingMachineServiceImpl implements WashingMachineService {
    private final WashingMachineRepository washingMachineRepository;

    @Autowired
    public WashingMachineServiceImpl(WashingMachineRepository washingMachineRepository) {
        this.washingMachineRepository = washingMachineRepository;
    }

    @Override
    public WashingMachine getFirst() {
        List<WashingMachine> all = washingMachineRepository.findAll();
        return all.size() == 0 ? null : all.get(0);
    }

    @Override
    public WashingMachine save(WashingMachine washingMachine) {
        return washingMachineRepository.save(washingMachine);
    }
}