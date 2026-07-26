package dev.guirl.EventNow.adapters.input.controllers.dto.response;

import java.time.LocalDateTime;

public record CreateEventResponseDTO(
        String eventName,
        String eventDescription,
        String eventLocation,
        String eventCapacity,
        String eventIdentifier,
        String eventType,
        String eventStatus,
        LocalDateTime eventInitialDate,
        LocalDateTime eventFinalDate
) {}
