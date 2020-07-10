package com.eimt.lab.cocktails4you.cocktailcatalog.application.payload;

import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.UserId;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.AlcoholicType;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Description;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Equipment;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Ingredient;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CocktailGrade implements Serializable {

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
    private String imageUrl;
    @NotNull
    private String instructions;
    @NotNull
    private List<Integer> grades;
    @NotNull
    private String userId;

    public CocktailGrade(@NotNull String name, @NotNull @Valid List<Ingredient> ingredients, @NotNull @Valid List<Equipment> equipment, @NotNull @Valid Description description, @NotNull String imageUrl, @NotNull String instructions, @NotNull List<Integer> grades, @NotNull String userId) {
        this.name = name;
        this.ingredients = ingredients;
        this.equipment = equipment;
        this.description = description;
        this.imageUrl = imageUrl;
        this.instructions = instructions;
        this.grades = grades;
        this.userId = userId;
    }


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

    public List<Integer> getGrades() {
        return grades;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }
}
