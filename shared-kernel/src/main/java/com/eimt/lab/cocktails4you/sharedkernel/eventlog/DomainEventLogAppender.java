package com.eimt.lab.cocktails4you.sharedkernel.eventlog;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.DomainEvent;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
public class DomainEventLogAppender {
    private final DomainEventLogService domainEventLogService;

    DomainEventLogAppender(DomainEventLogService domainEventLogService) {
        this.domainEventLogService = domainEventLogService;
    }

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void onDomainEvent(@NonNull DomainEvent domainEvent) {
        domainEventLogService.append(domainEvent);
    }

}