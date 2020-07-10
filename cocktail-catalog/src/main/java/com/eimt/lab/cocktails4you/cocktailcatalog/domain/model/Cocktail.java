package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Equipment;
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
    private String description;
    private Set<Ingredient> ingredients;
    private Set<Equipment> equipment;
    private String url_name;
    private String instructions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CocktailId getId() {
        return id;
    }

    public void setId(CocktailId id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getUrl_name() {
        return url_name;
    }

    public void setUrl_name(String url_name) {
        this.url_name = url_name;
    }

    public Set<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(Set<Equipment> equipment) {
        this.equipment = equipment;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
