package com.apm.insight;

import com.apm.insight.l.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.apm.insight.b.a f10616a = new com.apm.insight.b.a();

    public static com.apm.insight.b.a a() {
        return f10616a;
    }

    public static void a(Throwable th2, String str) {
        if (!e.i().isEnsureEnable() || g.a(th2)) {
            return;
        }
        com.apm.insight.f.b.a(th2, str, "core_exception_monitor");
    }
}
