package dev.guirl.EventNow.adapters.output.persistence.entity;

import dev.guirl.EventNow.domain.model.event.EventStatus;
import dev.guirl.EventNow.domain.model.event.EventType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String eventName;
    private String eventDescription;
    private String eventLocation;
    private Integer eventCapacity;
    private String eventIdentifier;
    private EventType eventType;
    private EventStatus eventStatus;
    private LocalDateTime eventInitialDate;
    private LocalDateTime eventFinalDate;
}


