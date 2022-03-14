package com.kodilla.eventsTask.domain;

public class DataDto {

    private double valueOne;
    private double valueTwo;

    public DataDto(double valueOne, double valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public double getValueOne() {
        return valueOne;
    }

    public double getValueTwo() {
        return valueTwo;
    }
}
