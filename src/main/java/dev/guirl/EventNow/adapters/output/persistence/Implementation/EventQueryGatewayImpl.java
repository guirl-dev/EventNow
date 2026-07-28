package dev.guirl.EventNow.adapters.output.persistence.Implementation;

import dev.guirl.EventNow.adapters.output.persistence.mapper.EventEntityMapper;
import dev.guirl.EventNow.adapters.output.persistence.repository.EventRepository;
import dev.guirl.EventNow.application.ports.output.EventQueryGateway;
import dev.guirl.EventNow.domain.model.event.EventModel;
import org.springframework.stereotype.Service;

@Service
public class EventQueryGatewayImpl implements EventQueryGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper eventEntityMapper;

    public EventQueryGatewayImpl(EventRepository eventRepository, EventEntityMapper eventEntityMapper) {
        this.eventRepository = eventRepository;
        this.eventEntityMapper = eventEntityMapper;
    }

    @Override
    public EventModel findByEventIdentifier(String eventIdentifier) {
        return eventRepository.findByEventIdentifier(eventIdentifier)
                .map(eventEntityMapper::toModel)
                .orElse(null);
    }

}
