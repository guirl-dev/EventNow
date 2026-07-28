package dev.guirl.EventNow.adapters.output.persistence.repository;

import dev.guirl.EventNow.adapters.output.persistence.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EventRepository extends JpaRepository<EventEntity, UUID> {
    Optional<EventEntity> findByEventIdentifier(String eventIdentifier);
}
