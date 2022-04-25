package com.wm.api.washingmachine.service.impl;

import com.wm.api.washingmachine.data.DryingRepository;
import com.wm.api.washingmachine.model.Drying;
import com.wm.api.washingmachine.service.DryingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DryingServiceImpl implements DryingService {
    private final DryingRepository dryingRepository;

    @Autowired
    public DryingServiceImpl(DryingRepository dryingRepository) {
        this.dryingRepository = dryingRepository;
    }

    @Override
    public Drying save(Drying drying) {
        return dryingRepository.save(drying);
    }
}
