package androidx.media3.exoplayer.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends l0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f5771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f5772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f5773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f5774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f5775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f5776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final t1.a0.c f5777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f5778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private IllegalClippingException f5779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f5780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f5781w;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class IllegalClippingException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5782a;

        public IllegalClippingException(int i10) {
            super("Illegal clipping: " + a(i10));
            this.f5782a = i10;
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
    private static final class a extends m {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f5783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f5784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final long f5785h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f5786i;

        public a(t1.a0 a0Var, long j10, long j11) throws IllegalClippingException {
            super(a0Var);
            boolean z10 = false;
            if (a0Var.i() != 1) {
                throw new IllegalClippingException(0);
            }
            t1.a0.c cVarN = a0Var.n(0, new t1.a0.c());
            long jMax = Math.max(0L, j10);
            if (!cVarN.f52546k && jMax != 0 && !cVarN.f52543h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j11 == Long.MIN_VALUE ? cVarN.f52548m : Math.max(0L, j11);
            long j12 = cVarN.f52548m;
            if (j12 != C.TIME_UNSET) {
                jMax2 = jMax2 > j12 ? j12 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f5783f = jMax;
            this.f5784g = jMax2;
            this.f5785h = jMax2 == C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f52544i && (jMax2 == C.TIME_UNSET || (j12 != C.TIME_UNSET && jMax2 == j12))) {
                z10 = true;
            }
            this.f5786i = z10;
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.b g(int i10, t1.a0.b bVar, boolean z10) {
            this.f6027e.g(0, bVar, z10);
            long jN = bVar.n() - this.f5783f;
            long j10 = this.f5785h;
            long j11 = C.TIME_UNSET;
            if (j10 != C.TIME_UNSET) {
                j11 = j10 - jN;
            }
            return bVar.s(bVar.f52519a, bVar.f52520b, 0, j11, jN);
        }

        @Override // androidx.media3.exoplayer.source.m, t1.a0
        public t1.a0.c o(int i10, t1.a0.c cVar, long j10) {
            this.f6027e.o(0, cVar, 0L);
            long j11 = cVar.f52551p;
            long j12 = this.f5783f;
            cVar.f52551p = j11 + j12;
            cVar.f52548m = this.f5785h;
            cVar.f52544i = this.f5786i;
            long j13 = cVar.f52547l;
            if (j13 != C.TIME_UNSET) {
                long jMax = Math.max(j13, j12);
                cVar.f52547l = jMax;
                long j14 = this.f5784g;
                if (j14 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f52547l = jMax - this.f5783f;
            }
            long jC1 = w1.c0.c1(this.f5783f);
            long j15 = cVar.f52540e;
            if (j15 != C.TIME_UNSET) {
                cVar.f52540e = j15 + jC1;
            }
            long j16 = cVar.f52541f;
            if (j16 != C.TIME_UNSET) {
                cVar.f52541f = j16 + jC1;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(r rVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((r) w1.a.e(rVar));
        w1.a.a(j10 >= 0);
        this.f5771m = j10;
        this.f5772n = j11;
        this.f5773o = z10;
        this.f5774p = z11;
        this.f5775q = z12;
        this.f5776r = new ArrayList();
        this.f5777s = new t1.a0.c();
    }

    private void Q(t1.a0 a0Var) {
        long j10;
        a0Var.n(0, this.f5777s);
        long jE = this.f5777s.e();
        long j11 = Long.MIN_VALUE;
        if (this.f5778t == null || this.f5776r.isEmpty() || this.f5774p) {
            j10 = this.f5771m;
            long j12 = this.f5772n;
            if (this.f5775q) {
                long jC = this.f5777s.c();
                j10 += jC;
                j12 += jC;
            }
            this.f5780v = jE + j10;
            this.f5781w = this.f5772n != Long.MIN_VALUE ? jE + j12 : Long.MIN_VALUE;
            int size = this.f5776r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f5776r.get(i10)).l(this.f5780v, this.f5781w);
            }
            j11 = j12;
        } else {
            j10 = this.f5780v - jE;
            if (this.f5772n != Long.MIN_VALUE) {
                j11 = this.f5781w - jE;
            }
        }
        try {
            a aVar = new a(a0Var, j10, j11);
            this.f5778t = aVar;
            y(aVar);
        } catch (IllegalClippingException e10) {
            this.f5779u = e10;
            for (int i11 = 0; i11 < this.f5776r.size(); i11++) {
                ((b) this.f5776r.get(i11)).j(this.f5779u);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.l0
    protected void N(t1.a0 a0Var) {
        if (this.f5779u != null) {
            return;
        }
        Q(a0Var);
    }

    @Override // androidx.media3.exoplayer.source.r
    public q f(r.b bVar, l2.b bVar2, long j10) {
        b bVar3 = new b(this.f6026k.f(bVar, bVar2, j10), this.f5773o, this.f5780v, this.f5781w);
        this.f5776r.add(bVar3);
        return bVar3;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void j(q qVar) {
        w1.a.g(this.f5776r.remove(qVar));
        this.f6026k.j(((b) qVar).f5813a);
        if (!this.f5776r.isEmpty() || this.f5774p) {
            return;
        }
        Q(((a) w1.a.e(this.f5778t)).f6027e);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.r
    public void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.f5779u;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected void z() {
        super.z();
        this.f5779u = null;
        this.f5778t = null;
    }
}
