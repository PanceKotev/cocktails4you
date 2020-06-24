package com.eimt.lab.cocktails4you.cocktailrecipe.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.AbstractEntity;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.AlcoholicType;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Description;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Equipment;
import com.eimt.lab.cocktails4you.sharedkernel.domain.component.Ingredient;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "cocktails")
public class Cocktail extends AbstractEntity<CocktailId> {

    @Version
    private long version;

    @Column(nullable = false)
    private String name;

    @ElementCollection
    @CollectionTable(name="cocktail_ingredients", joinColumns=@JoinColumn(name="cocktails_Id"))
    private List<Ingredient> ingredients;

    @ElementCollection
    @CollectionTable(name="cocktail_equipment", joinColumns=@JoinColumn(name="cocktails_Id"))
    private List<Equipment> equipment;

    @Embedded
    private Description description;

    @Column(name = "alcoholic_type")
    @Enumerated(EnumType.STRING)
    private AlcoholicType type;

    @NotNull
    private String imageUrl;

    private String instructions;

    public Cocktail(){
        ingredients = new ArrayList<Ingredient>();
        equipment = new ArrayList<Equipment>();

    }

    public Cocktail(CocktailId cocktailId, String name, List<Ingredient> ingredients, List<Equipment> equipment, Description description, AlcoholicType type, String imageUrl, String instructions){
        super(cocktailId);
        this.instructions = instructions;
        ingredients.forEach(ingredient -> {

            if (!ingredient.getType().equals(type)){
                throw new RuntimeException("Types of alcoholic dont match.");
            }
        });
        this.name=name;
        if (ingredients.size()<1){
            throw new RuntimeException("Must have more than 1 ingredient.");
        }
        this.ingredients=ingredients;
        this.equipment=equipment;
        this.description=description;
        this.type=type;
        this.imageUrl=imageUrl;
    }

    public Cocktail(String name, List<Ingredient> ingredients, List<Equipment> equipment, Description description, AlcoholicType type, String imageUrl, String instructions){
        this.instructions = instructions;
        ingredients.forEach(ingredient -> {

            if (!ingredient.getType().equals(type)){
                throw new RuntimeException("Types of alcoholic dont match.");
            }
        });
        this.name=name;
        if (ingredients.size()<1){
            throw new RuntimeException("Must have more than 1 ingredient.");
        }
        this.ingredients=ingredients;
        this.equipment=equipment;
        this.description=description;
        this.type=type;
        this.imageUrl=imageUrl;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public Description getDescription() {
        return description;
    }

    public AlcoholicType getType() {
        return type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getInstructions() {
        return instructions;
    }
}
