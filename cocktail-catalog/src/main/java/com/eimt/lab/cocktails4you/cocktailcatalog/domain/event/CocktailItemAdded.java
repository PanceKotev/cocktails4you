package com.eimt.lab.cocktails4you.cocktailcatalog.domain.event;

import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.CatalogId;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.CocktailId;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.CocktailItemId;
import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.Instant;

@Getter
public class CocktailItemAdded implements DomainEvent {

    @JsonProperty("orderId")
    private final CatalogId catalogId;

    @JsonProperty
    private final CocktailItemId cocktailItemId;

    @JsonProperty
    private final CocktailId cocktailId;

    @JsonProperty("occurredOn")
    private final Instant occurredOn;

    public CocktailItemAdded(CatalogId catalogId, CocktailItemId cocktailItemId, CocktailId cocktailId, Instant occurredOn) {
        this.catalogId = catalogId;
        this.cocktailItemId = cocktailItemId;
        this.cocktailId = cocktailId;
        this.occurredOn = occurredOn;
    }

    @Override
    public Instant occurredOn() {
        return occurredOn;
    }


}
