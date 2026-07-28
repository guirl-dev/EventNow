package dev.guirl.EventNow.application.ports.output;

import dev.guirl.EventNow.domain.model.event.EventModel;

public interface EventQueryGateway {

    EventModel findByEventIdentifier(String eventIdentifier);
}
