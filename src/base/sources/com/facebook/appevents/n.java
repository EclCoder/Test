package com.facebook.appevents;

import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f14960a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f14961b = n.class.getName();

    private n() {
    }

    public static final synchronized void a(a accessTokenAppIdPair, t0 appEvents) {
        if (x7.a.c(n.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.s.h(appEvents, "appEvents");
            n7.h.b();
            s0 s0VarA = f.a();
            s0VarA.a(accessTokenAppIdPair, appEvents.d());
            f.b(s0VarA);
        } catch (Throwable th2) {
            x7.a.b(th2, n.class);
        }
    }

    public static final synchronized void b(e eventsToPersist) {
        if (x7.a.c(n.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.s.h(eventsToPersist, "eventsToPersist");
            n7.h.b();
            s0 s0VarA = f.a();
            for (a aVar : eventsToPersist.f()) {
                t0 t0VarC = eventsToPersist.c(aVar);
                if (t0VarC == null) {
                    throw new IllegalStateException(SVWsZyNSAChGIA.yTxyiCjMcpKc);
                }
                s0VarA.a(aVar, t0VarC.d());
            }
            f.b(s0VarA);
        } catch (Throwable th2) {
            x7.a.b(th2, n.class);
        }
    }
}
