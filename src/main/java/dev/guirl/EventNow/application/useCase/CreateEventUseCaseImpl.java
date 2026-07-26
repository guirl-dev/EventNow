package dev.guirl.EventNow.application.useCase;

import dev.guirl.EventNow.application.ports.input.CreateEventUseCase;
import dev.guirl.EventNow.application.ports.output.EventCreationGateway;
import dev.guirl.EventNow.domain.model.event.EventModel;
import dev.guirl.EventNow.domain.service.EventIdentifierService;

public class CreateEventUseCaseImpl implements CreateEventUseCase {

    private final EventCreationGateway  eventCreationGateway;
    private final EventIdentifierService  eventIdentifierService;

    public CreateEventUseCaseImpl(EventCreationGateway eventCreationGateway,  EventIdentifierService eventIdentifierService) {
        this.eventIdentifierService = eventIdentifierService;
        this.eventCreationGateway = eventCreationGateway;
    }

    @Override
    public EventModel execute(EventModel eventModel) {

        EventModel eventWithId = new EventModel(
            null,
            eventModel.eventName(),
            eventModel.eventDescription(),
            eventModel.eventLocation(),
            eventModel.eventCapacity(),
            eventIdentifierService.generate(eventModel.eventName()),
            eventModel.eventType(),
            eventModel.eventStatus(),
            eventModel.eventInitialDate(),
            eventModel.eventFinalDate()
        );

        EventModel savedEvent = eventCreationGateway.save(eventWithId);

        if (savedEvent == null) {
            throw new RuntimeException("Failed to create event");
        }
        return savedEvent;
    }
}
