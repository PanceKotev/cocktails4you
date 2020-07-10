package com.eimt.lab.cocktails4you.sharedkernel.eventlog;

import com.eimt.lab.cocktails4you.sharedkernel.domain.base.RemoteEventLog;

public interface RemoteEventLogService  {
    String source();

    RemoteEventLog currentLog(long lastProcessedId);

}
