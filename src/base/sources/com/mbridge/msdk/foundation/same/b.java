package com.mbridge.msdk.foundation.same;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f30505b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f30506a = null;

    private b() {
    }

    public static b b() {
        if (f30505b == null) {
            synchronized (b.class) {
                try {
                    if (f30505b == null) {
                        f30505b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30505b;
    }

    public Boolean a() {
        return this.f30506a;
    }
}
