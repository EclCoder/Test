package com.google.android.exoplayer2.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface DrmSession {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16837a;

        public DrmSessionException(Throwable th2, int i10) {
            super(th2);
            this.f16837a = i10;
        }
    }

    static void g(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.e(null);
        }
        if (drmSession != null) {
            drmSession.f(null);
        }
    }

    UUID a();

    boolean b();

    s9.b c();

    boolean d(String str);

    void e(i.a aVar);

    void f(i.a aVar);

    DrmSessionException getError();

    int getState();

    Map queryKeyStatus();
}
