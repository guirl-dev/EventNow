package dev.guirl.EventNow.adapters.input.controllers.mapper;

import dev.guirl.EventNow.adapters.input.controllers.dto.request.CreateEventRequestDTO;
import dev.guirl.EventNow.adapters.input.controllers.dto.response.CreateEventResponseDTO;
import dev.guirl.EventNow.domain.model.event.EventModel;
import dev.guirl.EventNow.domain.model.event.EventStatus;
import dev.guirl.EventNow.domain.model.event.EventType;

public class EventDtoMapper {

    public EventModel toEventModel(CreateEventRequestDTO dto) {

        Integer capacity = Integer.valueOf(dto.eventCapacity());
        EventType type = EventType.valueOf(dto.eventType());
        EventStatus status = EventStatus.valueOf(dto.eventStatus());

        return new EventModel(
                null,
                dto.eventName(),
                dto.eventDescription(),
                dto.eventLocation(),
                capacity,
                null,
                type,
                status,
                dto.eventInitialDate(),
                dto.eventFinalDate()
        );
    }

    public CreateEventResponseDTO toCreateEventResponseDTO(EventModel model) {
        String capacity = String.valueOf(model.eventCapacity());
        String type = model.eventType().name();
        String status = model.eventStatus().name();
        String identifier = model.eventIdentifier();

        return new CreateEventResponseDTO(
                model.eventName(),
                model.eventDescription(),
                model.eventLocation(),
                capacity,
                identifier,
                type,
                status,
                model.eventInitialDate(),
                model.eventFinalDate()
        );
    }

}
