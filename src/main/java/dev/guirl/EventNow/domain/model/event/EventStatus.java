package dev.guirl.EventNow.domain.model.event;

public enum EventStatus {
    PLANNED("Planned"),
    IN_PROGRESS("In Progress"),
    FINISHED("Finished"),
    CANCELED("Canceled");

    private final String description;

    EventStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
