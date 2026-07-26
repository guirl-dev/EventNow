package dev.guirl.EventNow.application.ports.input;

import dev.guirl.EventNow.domain.model.event.EventModel;

import java.util.UUID;

public interface GetEventByIdUseCase {

    public EventModel execute(UUID id);
}
