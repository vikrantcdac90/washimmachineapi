package com.wm.api.washingmachine.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "washing")
public class Washing extends Process{
    public Washing() {
    }

    public Washing(Long duration, Integer temperature, Integer rotationSpeed) {
        super(duration, temperature, rotationSpeed);
    }

    @Override
    public String toString() {
        return "Washing " + super.toString();
    }
}
