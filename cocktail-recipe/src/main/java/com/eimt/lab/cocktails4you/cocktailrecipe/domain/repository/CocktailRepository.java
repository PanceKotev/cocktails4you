package com.eimt.lab.cocktails4you.cocktailrecipe.domain.repository;

import com.eimt.lab.cocktails4you.cocktailrecipe.domain.model.Cocktail;
import com.eimt.lab.cocktails4you.cocktailrecipe.domain.model.CocktailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, CocktailId> {
}
