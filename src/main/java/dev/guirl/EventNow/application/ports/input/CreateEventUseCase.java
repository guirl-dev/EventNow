package dev.guirl.EventNow.application.ports.input;

import dev.guirl.EventNow.domain.model.event.EventModel;

public interface CreateEventUseCase {

    public EventModel execute(EventModel eventModel);
}
