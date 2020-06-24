package com.eimt.lab.cocktails4you.cocktailrecipe.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import lombok.Getter;
import lombok.NonNull;


@Getter
public class CocktailId extends DomainObjectId {
    public CocktailId(){
        super("");
    }
    public CocktailId(@NonNull String id) {
        super(id);
    }
}
