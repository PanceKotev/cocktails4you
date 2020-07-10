package com.eimt.lab.cocktails4you.sharedkernel.domain.base;

import com.eimt.lab.cocktails4you.sharedkernel.eventlog.StoredDomainEvent;

import java.util.List;

public interface RemoteEventLog {
    List<StoredDomainEvent> events();
}
