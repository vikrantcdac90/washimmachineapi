package com.wm.api.washingmachine.service.impl;

import com.wm.api.washingmachine.data.WashingRepository;
import com.wm.api.washingmachine.model.Washing;
import com.wm.api.washingmachine.service.WashingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WashingServiceImpl implements WashingService {
    private final WashingRepository washingRepository;

    @Autowired
    public WashingServiceImpl(WashingRepository washingRepository) {
        this.washingRepository = washingRepository;
    }

    @Override
    public Washing save(Washing washing) {
        return washingRepository.save(washing);
    }
}