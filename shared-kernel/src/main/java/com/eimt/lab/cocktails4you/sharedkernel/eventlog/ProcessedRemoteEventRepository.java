package com.eimt.lab.cocktails4you.sharedkernel.eventlog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessedRemoteEventRepository extends JpaRepository<ProcessedRemoteEvent,String> {
}
