package dev.guirl.EventNow.domain.exceptions;

public class EventNotFoundException extends RuntimeException {
    public EventNotFoundException(String identifier) {
        super("Event not found with identifier: " + identifier);
    }
}
