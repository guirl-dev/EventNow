package dev.guirl.EventNow.adapters.input.controllers.dto.request;

import java.time.LocalDateTime;

public record CreateEventRequestDTO(
        String eventName,
        String eventDescription,
        String eventLocation,
        String eventCapacity,
        String eventType,
        String eventStatus,
        LocalDateTime eventInitialDate,
        LocalDateTime eventFinalDate
) {}
