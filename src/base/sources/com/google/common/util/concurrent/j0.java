package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class j0 {
    static boolean a(Throwable th2, Class cls) {
        return cls.isInstance(th2);
    }

    static void b(Throwable th2) {
        sc.p.o(th2);
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
