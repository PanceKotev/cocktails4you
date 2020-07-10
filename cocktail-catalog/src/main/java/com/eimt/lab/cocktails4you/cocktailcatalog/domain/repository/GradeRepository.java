package com.eimt.lab.cocktails4you.cocktailcatalog.domain.repository;

import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.CocktailId;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.Grade;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.GradeId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, GradeId> {

    List<Grade> findAllByCocktail_idEquals(CocktailId cId);
}
