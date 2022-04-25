package com.wm.api.washingmachine.model;

import javax.persistence.*;

@Entity
@Table(name = "process")
public class Process {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "duration")
    private Long duration;
    @Column(name = "temperature")
    private Integer temperature;
    @Column(name = "rotationSpeed")
    private Integer rotationSpeed;
    public Process() {
    }
    public Process(Long duration, Integer temperature, Integer rotationSpeed) {
        this.duration = duration;
        this.temperature = temperature;
        this.rotationSpeed = rotationSpeed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(Integer rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", duration=" + duration +
                ", temperature=" + temperature +
                ", rotationSpeed=" + rotationSpeed +
                '}';
    }
}