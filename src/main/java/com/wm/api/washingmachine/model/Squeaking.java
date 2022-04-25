package com.wm.api.washingmachine.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "squeaking")
public class Squeaking extends Process {
    public Squeaking() {
    }

    public Squeaking(Long duration, Integer temperature, Integer rotationSpeed) {
        super(duration, temperature, rotationSpeed);
    }

    @Override
    public String toString() {
        return "Squeaking " + super.toString();
    }
}
