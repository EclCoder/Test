package sn;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f52448a = new d();

    private d() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        s.h(record, "record");
        c cVar = c.f52445a;
        String loggerName = record.getLoggerName();
        s.g(loggerName, "getLoggerName(...)");
        int iB = e.b(record);
        String message = record.getMessage();
        s.g(message, "getMessage(...)");
        cVar.a(loggerName, iB, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
