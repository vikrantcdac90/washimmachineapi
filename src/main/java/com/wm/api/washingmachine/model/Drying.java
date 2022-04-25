package com.wm.api.washingmachine.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "drying")
public class Drying extends Process {
    public Drying() {
    }

    public Drying(Long duration, Integer temperature, Integer rotationSpeed) {
        super(duration, temperature, rotationSpeed);
    }

    @Override
    public String toString() {
        return "Drying " + super.toString();
    }
}
