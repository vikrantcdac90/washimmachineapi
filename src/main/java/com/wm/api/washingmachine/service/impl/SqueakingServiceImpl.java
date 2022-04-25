package com.wm.api.washingmachine.service.impl;

import com.wm.api.washingmachine.data.SqueakingRepository;
import com.wm.api.washingmachine.model.Squeaking;
import com.wm.api.washingmachine.service.SqueakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SqueakingServiceImpl implements SqueakingService {
    private final SqueakingRepository squeakingRepository;

    @Autowired
    public SqueakingServiceImpl(SqueakingRepository squeakingRepository) {
        this.squeakingRepository = squeakingRepository;
    }

    @Override
    public Squeaking save(Squeaking squeaking) {
        return squeakingRepository.save(squeaking);
    }
}