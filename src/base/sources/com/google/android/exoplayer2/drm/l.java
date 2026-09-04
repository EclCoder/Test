package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {
    @Override // com.google.android.exoplayer2.drm.n
    public int a() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.n
    public s9.b b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public boolean c(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public n.a d(byte[] bArr, List list, int i10, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public n.d getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void release() {
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void closeSession(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void e(n.b bVar) {
    }
}
