package com.eimt.lab.cocktails4you.sharedkernel.domain.geo;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.ValueObject;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.Objects;

@Embeddable
@Getter
public class Address implements ValueObject {


    private final int number;

    @Column(name = "street")
    @Embedded
    private final StreetName street;

    @Column(name = "city")
    @Embedded
    private final CityName city;


    public Address(@NonNull  int number, @NonNull StreetName street, @NonNull CityName city) {
        this.number = number;
        this.street = street;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(address, address.street) &&
                Objects.equals(city, address.city) &&
                number == address.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number,  street,  city);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        sb.append(", ");
        sb.append(street);
        sb.append(", ");
        sb.append(city);
        return sb.toString();
    }

}
