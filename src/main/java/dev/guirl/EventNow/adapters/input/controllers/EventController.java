package dev.guirl.EventNow.adapters.input.controllers;

import dev.guirl.EventNow.adapters.input.controllers.dto.request.CreateEventRequestDTO;
import dev.guirl.EventNow.adapters.input.controllers.dto.response.CreateEventResponseDTO;
import dev.guirl.EventNow.adapters.input.controllers.mapper.EventDtoMapper;
import dev.guirl.EventNow.application.ports.input.CreateEventUseCase;
import dev.guirl.EventNow.domain.model.event.EventModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/events")
public class EventController {

    private final CreateEventUseCase createEventUseCase;
    private final EventDtoMapper eventDtoMapper;

    public EventController(CreateEventUseCase createEventUseCase, EventDtoMapper eventDtoMapper) {
        this.eventDtoMapper = eventDtoMapper;
        this.createEventUseCase = createEventUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<CreateEventResponseDTO> createEvent(@RequestBody CreateEventRequestDTO createEventRequestDTO) {

        EventModel genericModel = eventDtoMapper.toEventModel(createEventRequestDTO);
        EventModel savedModel = createEventUseCase.execute(genericModel);

        return new ResponseEntity<>(eventDtoMapper.toCreateEventResponseDTO(savedModel), HttpStatus.CREATED);
    }
}
