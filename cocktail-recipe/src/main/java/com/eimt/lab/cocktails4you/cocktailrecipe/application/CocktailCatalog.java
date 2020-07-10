package com.eimt.lab.cocktails4you.cocktailrecipe.application;

import com.eimt.lab.cocktails4you.cocktailrecipe.application.form.CocktailForm;
import com.eimt.lab.cocktails4you.cocktailrecipe.domain.event.RecipeCreated;
import com.eimt.lab.cocktails4you.cocktailrecipe.domain.event.RecipeDeleted;
import com.eimt.lab.cocktails4you.cocktailrecipe.domain.model.Cocktail;
import com.eimt.lab.cocktails4you.cocktailrecipe.domain.model.CocktailId;
import com.eimt.lab.cocktails4you.cocktailrecipe.domain.repository.CocktailRepository;
import lombok.NonNull;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class CocktailCatalog {
    private final CocktailRepository cocktailRepository;

    private final ApplicationEventPublisher applicationEventPublisher;

    public CocktailCatalog(CocktailRepository cocktailRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.cocktailRepository = cocktailRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public CocktailId createCocktail(@NonNull CocktailForm cocktail){
        Objects.requireNonNull(cocktail,"cocktail must not be null");
        var newRecipe = cocktailRepository.saveAndFlush(toDomainModel(cocktail));
        applicationEventPublisher.publishEvent(new RecipeCreated(newRecipe.id(),Instant.now()));
        return newRecipe.id();
    }

    @NonNull
    public Optional<Cocktail> findById(@NonNull CocktailId cocktailId) {
        Objects.requireNonNull(cocktailId, "cocktailId must not be null");
        return cocktailRepository.findById(cocktailId);
    }

    @NonNull
    public void deleteCocktail(@NonNull CocktailId cocktailId){
        Objects.requireNonNull(cocktailId, "cocktailId must not be null");
        applicationEventPublisher.publishEvent(new RecipeDeleted(cocktailId,Instant.now()));
        cocktailRepository.deleteById(cocktailId);
    }

    @NonNull
    private Cocktail toDomainModel(@NonNull CocktailForm cocktailForm) {
        var cocktail = new Cocktail(cocktailForm.getName(),cocktailForm.getIngredients(),cocktailForm.getEquipment(),cocktailForm.getDescription(),cocktailForm.getAlcoholicType(),cocktailForm.getImageUrl(),cocktailForm.getInstructions());
        return cocktail;
    }

}
