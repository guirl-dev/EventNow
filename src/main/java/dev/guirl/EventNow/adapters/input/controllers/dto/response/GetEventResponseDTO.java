package dev.guirl.EventNow.adapters.input.controllers.dto.response;

import dev.guirl.EventNow.domain.model.event.EventStatus;
import dev.guirl.EventNow.domain.model.event.EventType;
import java.time.LocalDateTime;
import java.util.UUID;

public record GetEventResponseDTO(
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
) {
}
