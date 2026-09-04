package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o9.p;
import ob.r0;
import ra.s;
import va.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0 f17596a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f17598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f17600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17602g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ja.c f17597b = new ja.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f17603h = C.TIME_UNSET;

    public d(f fVar, v0 v0Var, boolean z10) {
        this.f17596a = v0Var;
        this.f17600e = fVar;
        this.f17598c = fVar.f55334b;
        d(fVar, z10);
    }

    @Override // ra.s
    public int a(p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        int i11 = this.f17602g;
        boolean z10 = i11 == this.f17598c.length;
        if (z10 && !this.f17599d) {
            decoderInputBuffer.k(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f17601f) {
            pVar.f48303b = this.f17596a;
            this.f17601f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f17602g = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f17597b.a(this.f17600e.f55333a[i11]);
            decoderInputBuffer.m(bArrA.length);
            decoderInputBuffer.f16754c.put(bArrA);
        }
        decoderInputBuffer.f16756e = this.f17598c[i11];
        decoderInputBuffer.k(1);
        return -4;
    }

    public String b() {
        return this.f17600e.a();
    }

    public void c(long j10) {
        int iE = r0.e(this.f17598c, j10, true, false);
        this.f17602g = iE;
        if (!this.f17599d || iE != this.f17598c.length) {
            j10 = C.TIME_UNSET;
        }
        this.f17603h = j10;
    }

    public void d(f fVar, boolean z10) {
        int i10 = this.f17602g;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f17598c[i10 - 1];
        this.f17599d = z10;
        this.f17600e = fVar;
        long[] jArr = fVar.f55334b;
        this.f17598c = jArr;
        long j11 = this.f17603h;
        if (j11 != C.TIME_UNSET) {
            c(j11);
        } else if (j10 != C.TIME_UNSET) {
            this.f17602g = r0.e(jArr, j10, false, false);
        }
    }

    @Override // ra.s
    public boolean isReady() {
        return true;
    }

    @Override // ra.s
    public int skipData(long j10) {
        int iMax = Math.max(this.f17602g, r0.e(this.f17598c, j10, true, false));
        int i10 = iMax - this.f17602g;
        this.f17602g = iMax;
        return i10;
    }

    @Override // ra.s
    public void maybeThrowError() {
    }
}
