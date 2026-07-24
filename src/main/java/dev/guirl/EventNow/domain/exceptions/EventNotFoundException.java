package dev.guirl.EventNow.domain.exceptions;

import java.util.UUID;

public class EventNotFoundException extends RuntimeException {
    public EventNotFoundException(UUID id) {
        super("Event not found with ID: " + id);
    }
}
