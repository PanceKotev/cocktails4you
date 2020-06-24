package com.eimt.lab.cocktails4you.sharedkernel.domain.component;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.ValueObject;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;

@Embeddable
@Getter
public class Ingredient implements ValueObject {

    private final String name;

    private final int amount;

    @Enumerated(EnumType.STRING)
    private final AlcoholicType type;

    public Ingredient(@NonNull String name,@NonNull int amount,@NonNull AlcoholicType type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }
    private Ingredient(){
        this.name="";
        this.amount=0;
        this.type=null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ingredient money = (Ingredient) obj;
        return amount == money.amount &&
                name.equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", name, amount, type);
    }

}
