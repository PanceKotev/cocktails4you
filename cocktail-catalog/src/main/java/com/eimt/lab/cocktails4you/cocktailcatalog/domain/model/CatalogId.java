package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;

public class CatalogId extends DomainObjectId {

    private CatalogId() {
        super("");
    }


    public CatalogId(String id) {
        super(id);
    }
}
