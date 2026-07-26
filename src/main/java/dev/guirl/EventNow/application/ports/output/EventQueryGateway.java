package dev.guirl.EventNow.application.ports.output;

import dev.guirl.EventNow.domain.model.event.EventModel;

import java.util.UUID;

public interface EventQueryGateway {

    public EventModel findById(UUID id);
}
