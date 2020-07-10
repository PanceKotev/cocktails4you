package com.eimt.lab.cocktails4you.sharedkernel.eventlog;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainEvent;

import java.util.Optional;

public interface RemoteEventTranslator {
    boolean supports(StoredDomainEvent storedDomainEvent);

    Optional<DomainEvent> translate(StoredDomainEvent remoteEvent);

}
