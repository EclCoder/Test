package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.i1;
import androidx.media3.exoplayer.j2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface q extends g0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a extends g0.a {
        void d(q qVar);
    }

    @Override // androidx.media3.exoplayer.source.g0
    boolean a(i1 i1Var);

    long c(long j10, j2 j2Var);

    void discardBuffer(long j10, boolean z10);

    long f(k2.q[] qVarArr, boolean[] zArr, i2.q[] qVarArr2, boolean[] zArr2, long j10);

    void g(a aVar, long j10);

    @Override // androidx.media3.exoplayer.source.g0
    long getBufferedPositionUs();

    @Override // androidx.media3.exoplayer.source.g0
    long getNextLoadPositionUs();

    i2.v getTrackGroups();

    @Override // androidx.media3.exoplayer.source.g0
    boolean isLoading();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    @Override // androidx.media3.exoplayer.source.g0
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
