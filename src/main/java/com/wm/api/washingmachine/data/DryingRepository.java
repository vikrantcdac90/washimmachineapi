package com.wm.api.washingmachine.data;

import com.wm.api.washingmachine.model.Drying;
import org.springframework.data.repository.CrudRepository;

public interface DryingRepository extends CrudRepository<Drying, Long> {
    Drying save(Drying process);
}
