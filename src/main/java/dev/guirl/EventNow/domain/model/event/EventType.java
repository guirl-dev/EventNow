package dev.guirl.EventNow.domain.model.event;

import lombok.Getter;

@Getter
public enum EventType {
    LECTURE("Lecture"),
    MUSIC("Music"),
    NETWORKING("Networking"),
    WORKSHOP("Workshop");

    private final String description;

    EventType(String description) {
        this.description = description;
    }

}