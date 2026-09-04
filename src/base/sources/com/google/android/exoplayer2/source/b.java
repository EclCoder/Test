package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o9.j0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements o, o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f17412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o.a f17413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a[] f17414c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f17415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f17416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f17417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f17418g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements ra.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ra.s f17419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17420b;

        public a(ra.s sVar) {
            this.f17419a = sVar;
        }

        @Override // ra.s
        public int a(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (b.this.h()) {
                return -3;
            }
            if (this.f17420b) {
                decoderInputBuffer.k(4);
                return -4;
            }
            long bufferedPositionUs = b.this.getBufferedPositionUs();
            int iA = this.f17419a.a(pVar, decoderInputBuffer, i10);
            if (iA == -5) {
                v0 v0Var = (v0) ob.a.e(pVar.f48303b);
                int i11 = v0Var.B;
                if (i11 != 0 || v0Var.C != 0) {
                    b bVar = b.this;
                    if (bVar.f17416e != 0) {
                        i11 = 0;
                    }
                    pVar.f48303b = v0Var.b().P(i11).Q(bVar.f17417f == Long.MIN_VALUE ? v0Var.C : 0).G();
                }
                return -5;
            }
            long j10 = b.this.f17417f;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || decoderInputBuffer.f16756e < j10) && !(iA == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.f16755d))) {
                return iA;
            }
            decoderInputBuffer.b();
            decoderInputBuffer.k(4);
            this.f17420b = true;
            return -4;
        }

        public void b() {
            this.f17420b = false;
        }

        @Override // ra.s
        public boolean isReady() {
            return !b.this.h() && this.f17419a.isReady();
        }

        @Override // ra.s
        public void maybeThrowError() {
            this.f17419a.maybeThrowError();
        }

        @Override // ra.s
        public int skipData(long j10) {
            if (b.this.h()) {
                return -3;
            }
            return this.f17419a.skipData(j10);
        }
    }

    public b(o oVar, boolean z10, long j10, long j11) {
        this.f17412a = oVar;
        this.f17415d = z10 ? j10 : C.TIME_UNSET;
        this.f17416e = j10;
        this.f17417f = j11;
    }

    private j0 a(long j10, j0 j0Var) {
        long jR = r0.r(j0Var.f48297a, 0L, j10 - this.f17416e);
        long j11 = j0Var.f48298b;
        long j12 = this.f17417f;
        long jR2 = r0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jR == j0Var.f48297a && jR2 == j0Var.f48298b) ? j0Var : new j0(jR, jR2);
    }

    private static boolean k(long j10, lb.r[] rVarArr) {
        if (j10 != 0) {
            for (lb.r rVar : rVarArr) {
                if (rVar != null) {
                    v0 selectedFormat = rVar.getSelectedFormat();
                    if (!ob.y.a(selectedFormat.f18868l, selectedFormat.f18865i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o
    public long b(long j10, j0 j0Var) {
        long j11 = this.f17416e;
        if (j10 == j11) {
            return j11;
        }
        return this.f17412a.b(j10, a(j10, j0Var));
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean continueLoading(long j10) {
        return this.f17412a.continueLoading(j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void d(o.a aVar, long j10) {
        this.f17413b = aVar;
        this.f17412a.d(this, j10);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void discardBuffer(long j10, boolean z10) {
        this.f17412a.discardBuffer(j10, z10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    @Override // com.google.android.exoplayer2.source.o
    public long f(lb.r[] rVarArr, boolean[] zArr, ra.s[] sVarArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f17414c = new a[sVarArr.length];
        ra.s[] sVarArr2 = new ra.s[sVarArr.length];
        int i10 = 0;
        while (true) {
            ra.s sVar = null;
            if (i10 >= sVarArr.length) {
                break;
            }
            a[] aVarArr = this.f17414c;
            a aVar = (a) sVarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                sVar = aVar.f17419a;
            }
            sVarArr2[i10] = sVar;
            i10++;
        }
        long jF = this.f17412a.f(rVarArr, zArr, sVarArr2, zArr2, j10);
        if (h()) {
            long j12 = this.f17416e;
            if (j10 == j12 && k(j12, rVarArr)) {
                j11 = jF;
            } else {
                j11 = C.TIME_UNSET;
            }
        } else {
            j11 = C.TIME_UNSET;
        }
        this.f17415d = j11;
        if (jF != j10) {
            if (jF >= this.f17416e) {
                long j13 = this.f17417f;
                z10 = j13 == Long.MIN_VALUE || jF <= j13;
            }
        }
        ob.a.g(z10);
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            ra.s sVar2 = sVarArr2[i11];
            if (sVar2 == null) {
                this.f17414c[i11] = null;
            } else {
                a[] aVarArr2 = this.f17414c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f17419a != sVar2) {
                    aVarArr2[i11] = new a(sVar2);
                }
            }
            sVarArr[i11] = this.f17414c[i11];
        }
        return jF;
    }

    @Override // com.google.android.exoplayer2.source.o.a
    public void g(o oVar) {
        if (this.f17418g != null) {
            return;
        }
        ((o.a) ob.a.e(this.f17413b)).g(this);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.f17412a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f17417f;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f17412a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f17417f;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.o
    public ra.x getTrackGroups() {
        return this.f17412a.getTrackGroups();
    }

    boolean h() {
        return this.f17415d != C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.d0.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(o oVar) {
        ((o.a) ob.a.e(this.f17413b)).c(this);
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public boolean isLoading() {
        return this.f17412a.isLoading();
    }

    public void j(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f17418g = illegalClippingException;
    }

    public void l(long j10, long j11) {
        this.f17416e = j10;
        this.f17417f = j11;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f17418g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f17412a.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.o
    public long readDiscontinuity() {
        if (h()) {
            long j10 = this.f17415d;
            this.f17415d = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j10;
        }
        long discontinuity2 = this.f17412a.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        ob.a.g(discontinuity2 >= this.f17416e);
        long j11 = this.f17417f;
        ob.a.g(j11 == Long.MIN_VALUE || discontinuity2 <= j11);
        return discontinuity2;
    }

    @Override // com.google.android.exoplayer2.source.o, com.google.android.exoplayer2.source.d0
    public void reevaluateBuffer(long j10) {
        this.f17412a.reevaluateBuffer(j10);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.o
    public long seekToUs(long j10) {
        this.f17415d = C.TIME_UNSET;
        boolean z10 = false;
        for (a aVar : this.f17414c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jSeekToUs = this.f17412a.seekToUs(j10);
        if (jSeekToUs == j10) {
            z10 = true;
        } else if (jSeekToUs >= this.f17416e) {
            long j11 = this.f17417f;
            if (j11 == Long.MIN_VALUE || jSeekToUs <= j11) {
                z10 = true;
            }
        }
        ob.a.g(z10);
        return jSeekToUs;
    }
}
