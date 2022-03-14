package com.kodilla.eventsTask.event;

import org.springframework.context.ApplicationEvent;

public class DataRegisteredEvent extends ApplicationEvent {

    private double valueOne;
    private double valueTwo;
    private double result;

    public DataRegisteredEvent(Object source, double valueOne, double valueTwo, double result) {
        super(source);
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
        this.result = result;
    }

    public double getValueOne() {
        return valueOne;
    }

    public double getValueTwo() {
        return valueTwo;
    }

    public double getResult() {
        return result;
    }
}