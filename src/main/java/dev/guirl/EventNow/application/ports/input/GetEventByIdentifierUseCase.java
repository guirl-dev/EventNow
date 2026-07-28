package dev.guirl.EventNow.application.ports.input;

import dev.guirl.EventNow.domain.model.event.EventModel;

public interface GetEventByIdentifierUseCase {

    EventModel execute(String eventIdentifier);
}
