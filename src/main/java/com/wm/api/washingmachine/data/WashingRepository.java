package com.wm.api.washingmachine.data;

import com.wm.api.washingmachine.model.Washing;
import org.springframework.data.repository.CrudRepository;

public interface WashingRepository extends CrudRepository<Washing, Long> {
    Washing save(Washing washing);
}