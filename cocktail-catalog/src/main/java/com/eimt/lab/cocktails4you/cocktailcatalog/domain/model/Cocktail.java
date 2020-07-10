package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Ingredient;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;


public class Cocktail {

    private String name;
    private CocktailId id;
    private String opis;
    private Set<Ingredient> ingredients;
    private String url_name;

}
