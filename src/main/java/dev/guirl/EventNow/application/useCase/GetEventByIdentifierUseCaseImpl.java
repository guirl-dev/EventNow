package dev.guirl.EventNow.application.useCase;

import dev.guirl.EventNow.application.ports.input.GetEventByIdentifierUseCase;
import dev.guirl.EventNow.application.ports.output.EventQueryGateway;
import dev.guirl.EventNow.domain.exceptions.EventNotFoundException;
import dev.guirl.EventNow.domain.model.event.EventModel;

public class GetEventByIdentifierUseCaseImpl implements GetEventByIdentifierUseCase {

    private final EventQueryGateway eventQueryGateway;

    public GetEventByIdentifierUseCaseImpl(EventQueryGateway eventQueryGateway) {
        this.eventQueryGateway = eventQueryGateway;
    }

    @Override
    public EventModel execute(String eventIdentifier) {
        EventModel eventModel = eventQueryGateway.findByEventIdentifier(eventIdentifier);

        if (eventModel == null) {
            throw new EventNotFoundException(eventIdentifier);
        }

        return eventModel;
    }
}
