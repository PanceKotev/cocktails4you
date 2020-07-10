package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.AbstractEntity;
import lombok.Getter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Getter
public class CocktailItem extends AbstractEntity<CocktailItemId> {

    @Embedded
    @AttributeOverride(name="id",column = @Column(name="cocktail_id",nullable = false))
    private CocktailId cocktailId;

    public CocktailItem() {
    }

    private CocktailItem(CocktailId id){
        cocktailId=id;
    }
}
