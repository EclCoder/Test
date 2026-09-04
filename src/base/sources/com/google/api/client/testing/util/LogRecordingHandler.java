package com.google.api.client.testing.util;

import com.google.api.client.util.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class LogRecordingHandler extends Handler {
    private final List<LogRecord> records = Lists.newArrayList();

    public List<String> messages() {
        ArrayList arrayListNewArrayList = Lists.newArrayList();
        Iterator<LogRecord> it = this.records.iterator();
        while (it.hasNext()) {
            arrayListNewArrayList.add(it.next().getMessage());
        }
        return arrayListNewArrayList;
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        this.records.add(logRecord);
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
