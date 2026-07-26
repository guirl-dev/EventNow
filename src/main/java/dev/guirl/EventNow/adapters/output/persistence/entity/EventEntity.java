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
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_description")
    private String eventDescription;

    @Column(name = "event_location")
    private String eventLocation;

    @Column(name = "event_capacity")
    private Integer eventCapacity;

    @Column(name = "event_identifier", unique = true)
    private String eventIdentifier;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_type")
    private EventType eventType;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_status")
    private EventStatus eventStatus;

    @Column(name = "event_initial_date")
    private LocalDateTime eventInitialDate;

    @Column(name = "event_final_date")
    private LocalDateTime eventFinalDate;
}


