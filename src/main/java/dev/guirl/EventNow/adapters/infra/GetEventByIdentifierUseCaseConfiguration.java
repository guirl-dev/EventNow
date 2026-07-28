package dev.guirl.EventNow.adapters.infra;

import dev.guirl.EventNow.application.ports.input.GetEventByIdentifierUseCase;
import dev.guirl.EventNow.application.ports.output.EventQueryGateway;
import dev.guirl.EventNow.application.useCase.GetEventByIdentifierUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetEventByIdentifierUseCaseConfiguration {

    private final EventQueryGateway eventQueryGateway;

    public GetEventByIdentifierUseCaseConfiguration(EventQueryGateway eventQueryGateway) {
        this.eventQueryGateway = eventQueryGateway;
    }

    @Bean
    public GetEventByIdentifierUseCase getEventByIdentifierUseCase() {
        return new GetEventByIdentifierUseCaseImpl(eventQueryGateway);
    }
}
