package com.academy.course.lesson16.home.work;

public class Processor {

    private String model;
    private int clockFrequency;

    public Processor(int clockFrequency, String model) {
        this.clockFrequency = clockFrequency;
        this.model = model;
    }

    public int getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(int clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "model='" + model + '\'' +
                ", clockFrequency=" + clockFrequency +
                '}';
    }
}
