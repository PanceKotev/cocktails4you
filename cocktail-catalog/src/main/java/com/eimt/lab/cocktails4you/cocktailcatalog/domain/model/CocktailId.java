package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Embeddable;

@Embeddable
public class CocktailId extends DomainObjectId {

    public CocktailId() {
        super(DomainObjectId.randomId(CocktailId.class).toString());
    }


    @JsonCreator
    public CocktailId(String id) {
        super(id);
    }
}
