package dev.guirl.EventNow.application.useCase;

import dev.guirl.EventNow.application.ports.input.GetEventByIdUseCase;
import dev.guirl.EventNow.application.ports.output.EventQueryGateway;
import dev.guirl.EventNow.domain.exceptions.EventNotFoundException;
import dev.guirl.EventNow.domain.model.event.EventModel;

import java.util.UUID;

public class GetEventByIdUseCaseImpl implements GetEventByIdUseCase {

    private final EventQueryGateway eventQueryGateway;

    public GetEventByIdUseCaseImpl(EventQueryGateway eventQueryGateway) {
        this.eventQueryGateway = eventQueryGateway;
    }

    @Override
    public EventModel execute(UUID id) {
        EventModel eventModel = eventQueryGateway.findById(id);

        if (eventModel == null) {
            throw new EventNotFoundException(id);
        }

        return eventModel;
    }
}
