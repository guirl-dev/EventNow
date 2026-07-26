package dev.guirl.EventNow.adapters.output.persistence.Implementation;

import dev.guirl.EventNow.adapters.output.persistence.entity.EventEntity;
import dev.guirl.EventNow.adapters.output.persistence.mapper.EventEntityMapper;
import dev.guirl.EventNow.adapters.output.persistence.repository.EventRepository;
import dev.guirl.EventNow.application.ports.output.EventCreationGateway;
import dev.guirl.EventNow.domain.model.event.EventModel;
import org.springframework.stereotype.Service;

@Service
public class EventCreationGatewayImpl implements EventCreationGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper  eventEntityMapper;

    public EventCreationGatewayImpl(EventRepository eventRepository, EventEntityMapper eventEntityMapper) {
        this.eventRepository = eventRepository;
        this.eventEntityMapper = eventEntityMapper;
    }

    @Override
    public EventModel save(EventModel event) {
        EventEntity newEventEntity = eventEntityMapper.toEntity(event);
        EventEntity savedEventEntity = eventRepository.save(newEventEntity);
        return eventEntityMapper.toModel(savedEventEntity);
    }
}
