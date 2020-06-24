package com.eimt.lab.cocktails4you.cocktailrecipe.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name= "cocktails")
public class Cocktail extends AbstractEntity<CocktailId> {

    @Version
    private long version;

    private String name;

    private String description;




}
