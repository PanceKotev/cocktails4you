package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Embeddable;

@Embeddable
public class CatalogGradeId extends DomainObjectId {

    public CatalogGradeId() {
        super("");
    }


    @JsonCreator
    public CatalogGradeId(String id) {
        super(id);
    }
}
