package com.eimt.lab.cocktails4you.sharedkernel.domain.component;

import lombok.Getter;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
public class Description {

    private final String text;

    private final int length;


    public Description(String text, int length) {
        this.text = text;
        this.length = length;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Description desc = (Description) obj;
        return text.equals(desc.text) &&
                length == desc.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, length);
    }

    @Override
    public String toString() {
        return String.format("%s %d", text, length);
    }
}
