package dev.guirl.EventNow.adapters.infra;

import dev.guirl.EventNow.application.ports.input.CreateEventUseCase;
import dev.guirl.EventNow.application.ports.output.EventCreationGateway;
import dev.guirl.EventNow.application.useCase.CreateEventUseCaseImpl;
import dev.guirl.EventNow.domain.service.EventIdentifierService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateEventUseCaseConfiguration {

    private final EventCreationGateway eventCreationGateway;

    public CreateEventUseCaseConfiguration(EventCreationGateway eventCreationGateway) {
        this.eventCreationGateway = eventCreationGateway;
    }

    @Bean
    public CreateEventUseCase createEventUseCase() {

        EventIdentifierService identifierService = new EventIdentifierService();
        return new CreateEventUseCaseImpl(eventCreationGateway, identifierService);
    }

}
