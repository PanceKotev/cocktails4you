package com.eimt.lab.cocktails4you.sharedkernel.domain.base;

import lombok.NonNull;

import java.time.Instant;

public interface DomainEvent extends DomainObject {

    @NonNull
    Instant occurredOn();

}
