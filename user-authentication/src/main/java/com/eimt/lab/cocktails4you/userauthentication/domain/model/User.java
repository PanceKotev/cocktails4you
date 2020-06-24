package com.eimt.lab.cocktails4you.userauthentication.domain.model;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.AbstractEntity;
import com.eimt.lab.cocktails4you.sharedkernel.domain.geo.Address;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;
import java.util.List;

@Entity
@Table(name="users")
public class User extends AbstractEntity<UserId> {

    @Version
    private Long version;

    private String name;

    private String password;

    private String email;

    @Embedded
    private Address address;

    private List<GradeId> gradedCocktails;

    public User(){

    }
    public User(UserId userId,String name, String password, String email, Address address, List<GradeId> gradedCocktails){
        super(userId);
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.gradedCocktails = gradedCocktails;
    }

    public User(String name, String password, String email, Address address, List<GradeId> gradedCocktails){
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.gradedCocktails = gradedCocktails;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public List<GradeId> getGradedCocktails() {
        return gradedCocktails;
    }
}
