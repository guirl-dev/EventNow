package dev.guirl.EventNow.domain.model.event;

import java.time.LocalDateTime;
import java.util.UUID;

public record Event(
        UUID id,
        String eventName,
        String eventDescription,
        String eventLocation,
        Integer eventCapacity,
        String eventIdentifier,
        EventType eventType,
        EventStatus eventStatus,
        LocalDateTime eventInitialDate,
        LocalDateTime eventFinalDate
) {}