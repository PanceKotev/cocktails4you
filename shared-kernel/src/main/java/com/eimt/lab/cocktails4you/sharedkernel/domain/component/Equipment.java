package com.eimt.lab.cocktails4you.sharedkernel.domain.component;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.ValueObject;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
public class Equipment implements ValueObject {

    private final String name;

    private final int quantity;


    public Equipment(@NonNull String name, @NonNull int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Equipment equipment = (Equipment) obj;
        return name.equals(equipment.name) &&
                quantity == equipment.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantity);
    }

    @Override
    public String toString() {
        return String.format("%s %d", name, quantity);
    }
}