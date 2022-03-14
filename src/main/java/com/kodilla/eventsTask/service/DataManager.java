package com.kodilla.eventsTask.service;

import com.kodilla.eventsTask.event.DataRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DataManager implements ApplicationListener<DataRegisteredEvent> {

    @Override
    public void onApplicationEvent(DataRegisteredEvent event) {
        System.out.println("Processing the result of operating on numbers: " + event.getValueOne() + " and " + event.getValueTwo());
        System.out.println("The result is: " + event.getResult());
    }

}
