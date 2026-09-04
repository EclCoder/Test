package com.mbridge.msdk.foundation.controller;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile c f30180t;

    private c() {
    }

    public static c n() {
        if (f30180t == null) {
            synchronized (c.class) {
                try {
                    if (f30180t == null) {
                        f30180t = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f30180t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    protected void a(a.e eVar) {
    }
}
