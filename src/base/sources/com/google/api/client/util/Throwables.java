package com.google.api.client.util;

import sc.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Throwables {
    private Throwables() {
    }

    public static RuntimeException propagate(Throwable th2) {
        return a0.e(th2);
    }

    public static void propagateIfPossible(Throwable th2) {
        if (th2 != null) {
            a0.j(th2);
        }
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th2, Class<X> cls) throws Throwable {
        a0.h(th2, cls);
    }
}
