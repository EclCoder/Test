package com.google.android.exoplayer2.source;

import o9.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface o extends d0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a extends d0.a {
        void g(o oVar);
    }

    long b(long j10, j0 j0Var);

    @Override // com.google.android.exoplayer2.source.d0
    boolean continueLoading(long j10);

    void d(a aVar, long j10);

    void discardBuffer(long j10, boolean z10);

    long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10);

    @Override // com.google.android.exoplayer2.source.d0
    long getBufferedPositionUs();

    @Override // com.google.android.exoplayer2.source.d0
    long getNextLoadPositionUs();

    ra.x getTrackGroups();

    @Override // com.google.android.exoplayer2.source.d0
    boolean isLoading();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    @Override // com.google.android.exoplayer2.source.d0
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
