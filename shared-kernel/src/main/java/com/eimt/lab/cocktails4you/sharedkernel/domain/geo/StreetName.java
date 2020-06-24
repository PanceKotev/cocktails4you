package com.eimt.lab.cocktails4you.sharedkernel.domain.geo;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.ValueObject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
public class StreetName implements ValueObject {

    @Column(name="street_name")
    private final String name;

    //unused
    private StreetName() {this.name="";}

    @JsonCreator
    public StreetName(@NonNull String name) {
        this.name = Objects.requireNonNull(name, "name must not be null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetName streetName = (StreetName) o;
        return Objects.equals(name, streetName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    @JsonValue
    public String toString() {
        return name;
    }
}
