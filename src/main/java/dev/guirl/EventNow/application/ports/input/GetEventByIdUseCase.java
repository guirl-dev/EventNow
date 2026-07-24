package dev.guirl.EventNow.application.ports.input;

import dev.guirl.EventNow.domain.model.event.Event;

import java.util.UUID;

public interface GetEventByIdUseCase {

    public Event execute(UUID id);
}
