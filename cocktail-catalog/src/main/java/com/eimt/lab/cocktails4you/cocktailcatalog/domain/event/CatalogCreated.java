package com.eimt.lab.cocktails4you.cocktailcatalog.domain.event;

import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.CatalogId;
import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainEvent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

import java.time.Instant;
import java.util.Objects;

public class CatalogCreated implements DomainEvent{
    @JsonProperty("CatalogId")
    private final CatalogId CatalogId;
    @JsonProperty("occurredOn")
    private final Instant occurredOn;

    @JsonCreator
    public CatalogCreated(@JsonProperty("orderId") @NonNull CatalogId CatalogId,
                        @JsonProperty("occurredOn") @NonNull Instant occurredOn) {
        this.CatalogId = Objects.requireNonNull(CatalogId, "orderId must not be null");
        this.occurredOn = Objects.requireNonNull(occurredOn, "occurredOn must not be null");
    }



    @NonNull
    public CatalogId orderId() {
        return CatalogId;
    }

    @Override
    @NonNull
    public Instant occurredOn() {
        return occurredOn;
    }

}
