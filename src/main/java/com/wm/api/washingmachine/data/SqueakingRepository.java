package com.wm.api.washingmachine.data;

import com.wm.api.washingmachine.model.Squeaking;
import org.springframework.data.repository.CrudRepository;

public interface SqueakingRepository extends CrudRepository<Squeaking, Long> {
    Squeaking save(Process Squeaking);
}