package com.eimt.lab.cocktails4you.userauthentication.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import lombok.Getter;

@Getter
public class GradeId extends DomainObjectId {

    public GradeId(String id) {
        super(id);
    }

    public GradeId(){
        super("");
    }
}
