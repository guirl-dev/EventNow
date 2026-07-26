package dev.guirl.EventNow.adapters.output.persistence.mapper;

import dev.guirl.EventNow.adapters.output.persistence.entity.EventEntity;
import dev.guirl.EventNow.domain.model.event.EventModel;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public EventEntity toEntity(EventModel model) {
        if (model == null) {
            return null;
        }

        return new EventEntity(
                model.id(),
                model.eventName(),
                model.eventDescription(),
                model.eventLocation(),
                model.eventCapacity(),
                model.eventIdentifier(),
                model.eventType(),
                model.eventStatus(),
                model.eventInitialDate(),
                model.eventFinalDate()
        );
    }

    public EventModel toModel(EventEntity entity) {
        if (entity == null) {
            return null;
        }

        return new EventModel(
                entity.getId(),
                entity.getEventName(),
                entity.getEventDescription(),
                entity.getEventLocation(),
                entity.getEventCapacity(),
                entity.getEventIdentifier(),
                entity.getEventType(),
                entity.getEventStatus(),
                entity.getEventInitialDate(),
                entity.getEventFinalDate()
        );
    }
}

