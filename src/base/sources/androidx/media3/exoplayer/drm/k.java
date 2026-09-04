package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m {
    @Override // androidx.media3.exoplayer.drm.m
    public int a() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.m
    public b2.b b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean c(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.a d(byte[] bArr, List list, int i10, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] openSession() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public Map queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void release() {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void closeSession(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void f(m.b bVar) {
    }
}
