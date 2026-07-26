package dev.guirl.EventNow.application.ports.output;

import dev.guirl.EventNow.domain.model.event.EventModel;

public interface EventCreationGateway {

    EventModel save(EventModel event);
}
