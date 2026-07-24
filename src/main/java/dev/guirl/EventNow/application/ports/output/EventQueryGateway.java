package dev.guirl.EventNow.application.ports.output;

import dev.guirl.EventNow.domain.model.event.Event;

import java.util.Optional;
import java.util.UUID;

public interface EventQueryGateway {

    public Event findById(UUID id);
}
