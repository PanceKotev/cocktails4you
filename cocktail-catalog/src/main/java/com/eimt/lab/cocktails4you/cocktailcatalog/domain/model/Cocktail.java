package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Ingredient;
import lombok.Getter;

import java.util.Set;

@Getter
public class Cocktail {

    private String name;
    private CocktailId id;
    private String opis;
    private Set<Ingredient> ingredients;
    private String url_name;
}
