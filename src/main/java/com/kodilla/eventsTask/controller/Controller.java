package com.kodilla.eventsTask.controller;

import com.kodilla.eventsTask.domain.DataDto;
import com.kodilla.eventsTask.event.DataRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/calculator")
public class Controller implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @PostMapping(path = "addition")
    public void addition(@RequestBody DataDto dataDto) {
        System.out.println("The process of adding numbers has started ");
        double result = dataDto.getValueOne() + dataDto.getValueTwo();
        publisher.publishEvent(new DataRegisteredEvent(
                this,
                dataDto.getValueOne(),
                dataDto.getValueTwo(),
                result));
    }

    @PostMapping(path = "subtraction")
    public void subtraction(@RequestBody DataDto dataDto) {
        System.out.println("The process of subtracting numbers has started ");
        double result = dataDto.getValueOne() - dataDto.getValueTwo();
        publisher.publishEvent(new DataRegisteredEvent(
                this,
                dataDto.getValueOne(),
                dataDto.getValueTwo(),
                result));
    }

    @PostMapping(path = "multiplication")
    public void multiplication(@RequestBody DataDto dataDto) {
        System.out.println("The process of multiplying numbers has started ");
        double result = dataDto.getValueOne() * dataDto.getValueTwo();
        publisher.publishEvent(new DataRegisteredEvent(
                this,
                dataDto.getValueOne(),
                dataDto.getValueTwo(),
                result));
    }

    @PostMapping(path = "division")
    public void division(@RequestBody DataDto dataDto) {
        System.out.println("The process of dividing numbers has started ");
        double result = dataDto.getValueOne() / dataDto.getValueTwo();
        publisher.publishEvent(new DataRegisteredEvent(
                this,
                dataDto.getValueOne(),
                dataDto.getValueTwo(),
                result));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

}