package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class X4 extends X9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f25995g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X4(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", AbstractC3488zl.a(thread, error));
        kotlin.jvm.internal.s.h(thread, "thread");
        kotlin.jvm.internal.s.h(error, "error");
        this.f25995g = error.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public X4(String str) {
        String eventId = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(eventId, "toString(...)");
        kotlin.jvm.internal.s.h("crashReporting", "component");
        kotlin.jvm.internal.s.h("CatchEvent", "eventType");
        kotlin.jvm.internal.s.h(eventId, "eventId");
        super(eventId, "crashReporting", "CatchEvent", str);
    }
}
