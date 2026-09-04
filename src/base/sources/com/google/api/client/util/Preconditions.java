package com.google.api.client.util;

import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z10) {
        p.d(z10);
    }

    public static <T> T checkNotNull(T t10) {
        return (T) p.o(t10);
    }

    public static void checkState(boolean z10) {
        p.v(z10);
    }

    public static void checkArgument(boolean z10, Object obj) {
        p.e(z10, obj);
    }

    public static <T> T checkNotNull(T t10, Object obj) {
        return (T) p.p(t10, obj);
    }

    public static void checkState(boolean z10, Object obj) {
        p.w(z10, obj);
    }

    public static void checkArgument(boolean z10, String str, Object... objArr) {
        p.l(z10, str, objArr);
    }

    public static <T> T checkNotNull(T t10, String str, Object... objArr) {
        return (T) p.r(t10, str, objArr);
    }

    public static void checkState(boolean z10, String str, Object... objArr) {
        p.z(z10, str, objArr);
    }
}
