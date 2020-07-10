package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Embeddable;

@Embeddable
public class CocktailItemId extends DomainObjectId {

    public CocktailItemId() {
        super(DomainObjectId.randomId(CocktailItemId.class).toString());
    }


    @JsonCreator
    public CocktailItemId(String id) {
        super(id);
    }

}
