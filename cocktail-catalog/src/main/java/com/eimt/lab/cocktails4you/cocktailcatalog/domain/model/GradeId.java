package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.Embeddable;

@Embeddable
public class GradeId extends DomainObjectId {

    public GradeId() {
        super("");
    }


    @JsonCreator
    public GradeId(String id) {
        super(id);
    }
}
