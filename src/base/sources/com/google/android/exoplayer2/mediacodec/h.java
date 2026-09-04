package com.google.android.exoplayer2.mediacodec;

import ob.r0;
import ob.u;
import ob.y;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17280a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17281b;

    @Override // com.google.android.exoplayer2.mediacodec.j.b
    public j a(j.a aVar) {
        int i10;
        int i11 = r0.f48425a;
        if (i11 < 23 || ((i10 = this.f17280a) != 1 && (i10 != 0 || i11 < 31))) {
            return new q.b().a(aVar);
        }
        int iK = y.k(aVar.f17289c.f18868l);
        u.f(YSHErhbVu.LTaKyy, "Creating an asynchronous MediaCodec adapter for track type " + r0.p0(iK));
        return new b.C0282b(iK, this.f17281b).a(aVar);
    }
}
