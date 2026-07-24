package dev.guirl.EventNow.application.ports.input;

import dev.guirl.EventNow.domain.model.event.Event;

public interface CreateEventUseCase {

    public Event execute(Event event);
}
