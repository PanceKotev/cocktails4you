package com.eimt.lab.cocktails4you.cocktailrecipe.application.form;

import com.eimt.lab.cocktails4you.sharedkernel.domain.component.AlcoholicType;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Description;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Equipment;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Ingredient;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CocktailForm implements Serializable {

    @NotNull
    private String name;
    @NotNull
    @Valid
    private List<Ingredient> ingredients = new ArrayList<>();
    @NotNull
    @Valid
    private List<Equipment> equipment = new ArrayList<>();
    @NotNull
    @Valid
    private Description description ;
    @NotNull
    @Valid
    private AlcoholicType alcoholicType;
    @NotNull
    private String imageUrl;
    @NotNull
    private String instructions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public AlcoholicType getAlcoholicType() {
        return alcoholicType;
    }

    public void setAlcoholicType(AlcoholicType alcoholicType) {
        this.alcoholicType = alcoholicType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }
}
