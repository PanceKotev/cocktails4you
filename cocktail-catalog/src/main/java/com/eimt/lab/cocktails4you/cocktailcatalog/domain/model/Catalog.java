package com.eimt.lab.cocktails4you.cocktailcatalog.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Catalog {
    @Id
    private Long CatalogNumber;

    private String Name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<CocktailItem> cocktails;

    public Catalog() {
    }

    public Catalog(Long CatalogNumber, String Name){
        this.CatalogNumber=CatalogNumber;
        this.Name=Name;
        cocktails= Collections.emptySet();
    }
}
