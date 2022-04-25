package com.wm.api.washingmachine.data;

import com.wm.api.washingmachine.model.WashingMachine;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WashingMachineRepository extends CrudRepository<WashingMachine, Long> {
    List<WashingMachine> findAll();
    WashingMachine save(WashingMachine appliance);
}