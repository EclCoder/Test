package com.google.android.exoplayer2.drm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DrmSession.DrmSessionException f16871a;

    public m(DrmSession.DrmSessionException drmSessionException) {
        this.f16871a = (DrmSession.DrmSessionException) ob.a.e(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID a() {
        return o9.b.f48262a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public s9.b c() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.f16871a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map queryKeyStatus() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void e(i.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void f(i.a aVar) {
    }
}
