package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.AbstractEntity;
import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainObjectId;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Getter
public class CatalogGrade extends AbstractEntity<CatalogGradeId> {

    @Id
    private CatalogGradeId id;
    @Embedded
    private CocktailId cocktail_id;
    private int grade;
    @Embedded
    private UserId user_id;

    public CatalogGrade(){}

    CatalogGrade(@NonNull CocktailId cocktailId, @NonNull UserId userid, @NonNull int grade){
        super(DomainObjectId.randomId(CatalogGradeId.class));
        setCocktail_id(cocktailId);
        setUser_id(userid);
        if (grade < 1 || grade>5) {
            throw new IllegalArgumentException("Grade must be between 1 and 5!");
        }
        this.grade = grade;

    }

    public void setCocktail_id(CocktailId cocktail_id) {
        this.cocktail_id = cocktail_id;
    }

    public void setGrade(int grade) {
        if ((grade<1)||(grade>5))
            throw new IllegalArgumentException("Grade must be between 1 and 5");
        this.grade = grade;
    }

    public void setUser_id(UserId user_id) {
        this.user_id = user_id;
    }
}
