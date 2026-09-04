package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l f33789b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f33790a;

    private l() {
    }

    public static l a() {
        if (f33789b == null) {
            synchronized (l.class) {
                try {
                    if (f33789b == null) {
                        f33789b = new l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33789b;
    }

    public u b() {
        if (this.f33790a == null) {
            u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f33790a = uVarA;
            uVarA.b();
        }
        return this.f33790a;
    }
}
