package com.eimt.lab.cocktails4you.cocktailcatalog.integration;

import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.CocktailId;
import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainEvent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

import java.time.Instant;
import java.util.Objects;

public class RecipeCreatedEvent implements DomainEvent {
    @JsonProperty("cocktailId")
    private final CocktailId cocktailId;
    @JsonProperty("occurredOn")
    private final Instant occurredOn;

    @JsonCreator
    public RecipeCreatedEvent(@JsonProperty("cocktailId") @NonNull CocktailId cocktailId,
                         @JsonProperty("occurredOn") @NonNull Instant occurredOn) {
        this.cocktailId = Objects.requireNonNull(cocktailId, "cocktailId must not be null");
        this.occurredOn = Objects.requireNonNull(occurredOn, "occurredOn must not be null");
    }

    @NonNull
    public CocktailId cocktailId() {
        return cocktailId;
    }

    @Override
    @NonNull
    public Instant occurredOn() {
        return occurredOn;
    }
}
