package com.eimt.lab.cocktails4you.cocktailcatalog.integration;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainEvent;
import com.eimt.lab.cocktails4you.sharedkernel.eventlog.RemoteEventTranslator;
import com.eimt.lab.cocktails4you.sharedkernel.eventlog.StoredDomainEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeDeletedEventTranslator implements RemoteEventTranslator {

    private final ObjectMapper objectMapper;

    RecipeDeletedEventTranslator(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean supports(StoredDomainEvent remoteEvent) {
        return remoteEvent.domainEventClassName().equals("com.eimt.lab.cocktails4you.cocktailcatalog.integration.RecipeDeletedEvent");
    }

    @Override
    public Optional<DomainEvent> translate(StoredDomainEvent remoteEvent) {
        return Optional.of(remoteEvent.toDomainEvent(objectMapper, RecipeDeletedEvent.class));
    }
}
