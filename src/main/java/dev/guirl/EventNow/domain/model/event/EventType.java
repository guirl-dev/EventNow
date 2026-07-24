package dev.guirl.EventNow.domain.model.event;

public enum EventType {
    LECTURE("Lecture"),
    MUSIC("Music"),
    NETWORKING("Networking"),
    WORKSHOP("Workshop");

    private final String description;

    EventType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}