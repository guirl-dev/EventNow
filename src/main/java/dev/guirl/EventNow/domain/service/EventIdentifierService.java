package dev.guirl.EventNow.domain.service;

import dev.guirl.EventNow.domain.model.event.EventModel;

import java.util.UUID;

public class EventIdentifierService {

    public String generate(EventModel eventModel) {

        return eventModel.eventName().substring(0, 1)
                .concat("-")
                .concat(eventModel.eventDescription().substring(0, 1))
                .concat("-")
                .concat(eventModel.eventInitialDate().toString().substring(0,2))
                .concat("-")
                .concat(UUID.randomUUID().toString().substring(0,5));
    }
}




