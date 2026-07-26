package dev.guirl.EventNow.application.ports.input;

import dev.guirl.EventNow.domain.model.event.EventModel;

public interface CreateEventUseCase {

    EventModel execute(EventModel eventModel);
}
