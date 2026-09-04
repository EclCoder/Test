package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.h2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ClippingMediaSource extends i0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f17362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f17363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f17364o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f17365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f17366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f17367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h2.d f17368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f17369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private IllegalClippingException f17370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f17371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f17372w;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class IllegalClippingException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17373a;

        public IllegalClippingException(int i10) {
            super("Illegal clipping: " + a(i10));
            this.f17373a = i10;
        }

        private static String a(int i10) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 != 1) {
                return i10 != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f17374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f17375h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f17376i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f17377j;

        public a(h2 h2Var, long j10, long j11) throws IllegalClippingException {
            super(h2Var);
            boolean z10 = false;
            if (h2Var.m() != 1) {
                throw new IllegalClippingException(0);
            }
            h2.d dVarR = h2Var.r(0, new h2.d());
            long jMax = Math.max(0L, j10);
            if (!dVarR.f17029l && jMax != 0 && !dVarR.f17025h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? dVarR.f17031n : Math.max(0L, j11);
            long j12 = dVarR.f17031n;
            if (j12 != C.TIME_UNSET) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f17374g = jMax;
            this.f17375h = jMax2;
            this.f17376i = jMax2 == C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (dVarR.f17026i && (jMax2 == C.TIME_UNSET || (j12 != C.TIME_UNSET && jMax2 == j12))) {
                z10 = true;
            }
            this.f17377j = z10;
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.b k(int i10, h2.b bVar, boolean z10) {
            this.f17847f.k(0, bVar, z10);
            long jQ = bVar.q() - this.f17374g;
            long j10 = this.f17376i;
            long j11 = C.TIME_UNSET;
            if (j10 != C.TIME_UNSET) {
                j11 = j10 - jQ;
            }
            return bVar.v(bVar.f16998a, bVar.f16999b, 0, j11, jQ);
        }

        @Override // com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.h2
        public h2.d s(int i10, h2.d dVar, long j10) {
            this.f17847f.s(0, dVar, 0L);
            long j11 = dVar.f17034q;
            long j12 = this.f17374g;
            dVar.f17034q = j11 + j12;
            dVar.f17031n = this.f17376i;
            dVar.f17026i = this.f17377j;
            long j13 = dVar.f17030m;
            if (j13 != C.TIME_UNSET) {
                long jMax = Math.max(j13, j12);
                dVar.f17030m = jMax;
                long j14 = this.f17375h;
                if (j14 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j14);
                }
                dVar.f17030m = jMax - this.f17374g;
            }
            long jI1 = r0.i1(this.f17374g);
            long j15 = dVar.f17022e;
            if (j15 != C.TIME_UNSET) {
                dVar.f17022e = j15 + jI1;
            }
            long j16 = dVar.f17023f;
            if (j16 != C.TIME_UNSET) {
                dVar.f17023f = j16 + jI1;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(p pVar, long j10, long j11) {
        this(pVar, j10, j11, true, false, false);
    }

    private void W(h2 h2Var) {
        long j10;
        h2Var.r(0, this.f17368s);
        long jG = this.f17368s.g();
        long j11 = Long.MIN_VALUE;
        if (this.f17369t == null || this.f17367r.isEmpty() || this.f17365p) {
            j10 = this.f17362m;
            long j12 = this.f17363n;
            if (this.f17366q) {
                long jE = this.f17368s.e();
                j10 += jE;
                j12 += jE;
            }
            this.f17371v = jG + j10;
            this.f17372w = this.f17363n != Long.MIN_VALUE ? jG + j12 : Long.MIN_VALUE;
            int size = this.f17367r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f17367r.get(i10)).l(this.f17371v, this.f17372w);
            }
            j11 = j12;
        } else {
            j10 = this.f17371v - jG;
            if (this.f17363n != Long.MIN_VALUE) {
                j11 = this.f17372w - jG;
            }
        }
        try {
            a aVar = new a(h2Var, j10, j11);
            this.f17369t = aVar;
            B(aVar);
        } catch (IllegalClippingException e10) {
            this.f17370u = e10;
            for (int i11 = 0; i11 < this.f17367r.size(); i11++) {
                ((b) this.f17367r.get(i11)).j(this.f17370u);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected void C() {
        super.C();
        this.f17370u = null;
        this.f17369t = null;
    }

    @Override // com.google.android.exoplayer2.source.i0
    protected void S(h2 h2Var) {
        if (this.f17370u != null) {
            return;
        }
        W(h2Var);
    }

    @Override // com.google.android.exoplayer2.source.p
    public void l(o oVar) {
        ob.a.g(this.f17367r.remove(oVar));
        this.f17828k.l(((b) oVar).f17412a);
        if (!this.f17367r.isEmpty() || this.f17365p) {
            return;
        }
        W(((a) ob.a.e(this.f17369t)).f17847f);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f17370u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.p
    public o o(p.b bVar, nb.b bVar2, long j10) {
        b bVar3 = new b(this.f17828k.o(bVar, bVar2, j10), this.f17364o, this.f17371v, this.f17372w);
        this.f17367r.add(bVar3);
        return bVar3;
    }

    public ClippingMediaSource(p pVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((p) ob.a.e(pVar));
        ob.a.a(j10 >= 0);
        this.f17362m = j10;
        this.f17363n = j11;
        this.f17364o = z10;
        this.f17365p = z11;
        this.f17366q = z12;
        this.f17367r = new ArrayList();
        this.f17368s = new h2.d();
    }
}
