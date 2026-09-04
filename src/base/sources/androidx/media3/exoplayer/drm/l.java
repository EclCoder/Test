package androidx.media3.exoplayer.drm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f5261a;

    public l(DrmSession.DrmSessionException drmSessionException) {
        this.f5261a = (DrmSession.DrmSessionException) w1.a.e(drmSessionException);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        return t1.e.f52663a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public b2.b c() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean d(String str) {
        return false;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.f5261a;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map queryKeyStatus() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void f(h.a aVar) {
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void g(h.a aVar) {
    }
}
