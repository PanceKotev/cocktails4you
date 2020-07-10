package com.eimt.lab.cocktails4you.cocktailcatalog.application;

import com.eimt.lab.cocktails4you.cocktailcatalog.application.payload.CocktailGrade;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.Cocktail;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.model.Grade;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.repository.CocktailRepository;
import com.eimt.lab.cocktails4you.cocktailcatalog.domain.repository.GradeRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CocktailCatalog {
    private final CocktailRepository cocktailRepository;
    private final GradeRepository gradeRepository;


    public CocktailCatalog(CocktailRepository cocktailRepository, GradeRepository gradeRepository) {
        this.cocktailRepository = cocktailRepository;
        this.gradeRepository = gradeRepository;
    }

    @NonNull
    public List<CocktailGrade> findAll() {
        List<Grade> grades = new ArrayList<>();
        List<CocktailGrade> cocktailGrades = new ArrayList<>();
        List<Cocktail> cocktails =  cocktailRepository.findAll();
        cocktails.forEach(cocktail -> cocktailGrades.add(new CocktailGrade(cocktail.getName(),cocktail.getId(),cocktail.getIngredients(),cocktail.getEquipment(),cocktail.getDescription(),cocktail.getUrl_name(),cocktail.getInstructions(),gradeRepository.findAllByCocktail_idEquals(cocktail.getId()).stream().map(grade -> grade.getGrade()).collect(Collectors.toList()),0);

        }
