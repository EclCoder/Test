package androidx.media3.exoplayer.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface DrmSession {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class DrmSessionException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5236a;

        public DrmSessionException(Throwable th2, int i10) {
            super(th2);
            this.f5236a = i10;
        }
    }

    static void e(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.f(null);
        }
        if (drmSession != null) {
            drmSession.g(null);
        }
    }

    UUID a();

    boolean b();

    b2.b c();

    boolean d(String str);

    void f(h.a aVar);

    void g(h.a aVar);

    DrmSessionException getError();

    int getState();

    Map queryKeyStatus();
}
