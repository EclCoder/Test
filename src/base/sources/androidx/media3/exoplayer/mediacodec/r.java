package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f5635a;

    public r(MediaCodec mediaCodec) {
        this.f5635a = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f5635a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void b(Bundle bundle) {
        this.f5635a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void j(int i10, int i11, b2.c cVar, long j10, int i12) {
        this.f5635a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void c() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
    }
}
