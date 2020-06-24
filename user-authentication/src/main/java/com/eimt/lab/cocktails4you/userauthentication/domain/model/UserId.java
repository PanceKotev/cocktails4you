package com.eimt.lab.cocktails4you.userauthentication.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import lombok.Getter;

@Getter
public class UserId extends DomainObjectId {

    public UserId(String id) {
        super(id);
    }

    public UserId(){
        super("");
    }
}
