package da;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import ob.r0;
import u9.b0;
import u9.l;
import u9.m;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b0 f36528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f36529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f36530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f36531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f36532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36535i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f36537k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36539m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f36527a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f36536j = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        v0 f36540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f36541b;

        b() {
        }
    }

    private void a() {
        ob.a.i(this.f36528b);
        r0.j(this.f36529c);
    }

    private boolean i(l lVar) {
        while (this.f36527a.d(lVar)) {
            this.f36537k = lVar.getPosition() - this.f36532f;
            if (!h(this.f36527a.c(), this.f36532f, this.f36536j)) {
                return true;
            }
            this.f36532f = lVar.getPosition();
        }
        this.f36534h = 3;
        return false;
    }

    private int j(l lVar) {
        if (!i(lVar)) {
            return -1;
        }
        v0 v0Var = this.f36536j.f36540a;
        this.f36535i = v0Var.f18882z;
        if (!this.f36539m) {
            this.f36528b.e(v0Var);
            this.f36539m = true;
        }
        g gVar = this.f36536j.f36541b;
        if (gVar != null) {
            this.f36530d = gVar;
        } else if (lVar.getLength() == -1) {
            this.f36530d = new c();
        } else {
            f fVarB = this.f36527a.b();
            this.f36530d = new da.a(this, this.f36532f, lVar.getLength(), fVarB.f36520h + fVarB.f36521i, fVarB.f36515c, (fVarB.f36514b & 4) != 0);
        }
        this.f36534h = 2;
        this.f36527a.f();
        return 0;
    }

    private int k(l lVar, y yVar) {
        long jA = this.f36530d.a(lVar);
        if (jA >= 0) {
            yVar.f54333a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f36538l) {
            this.f36529c.c((z) ob.a.i(this.f36530d.createSeekMap()));
            this.f36538l = true;
        }
        if (this.f36537k <= 0 && !this.f36527a.d(lVar)) {
            this.f36534h = 3;
            return -1;
        }
        this.f36537k = 0L;
        d0 d0VarC = this.f36527a.c();
        long jF = f(d0VarC);
        if (jF >= 0) {
            long j10 = this.f36533g;
            if (j10 + jF >= this.f36531e) {
                long jB = b(j10);
                this.f36528b.c(d0VarC, d0VarC.g());
                this.f36528b.f(jB, 1, d0VarC.g(), 0, null);
                this.f36531e = -1L;
            }
        }
        this.f36533g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / ((long) this.f36535i);
    }

    protected long c(long j10) {
        return (((long) this.f36535i) * j10) / 1000000;
    }

    void d(m mVar, b0 b0Var) {
        this.f36529c = mVar;
        this.f36528b = b0Var;
        l(true);
    }

    protected void e(long j10) {
        this.f36533g = j10;
    }

    protected abstract long f(d0 d0Var);

    final int g(l lVar, y yVar) {
        a();
        int i10 = this.f36534h;
        if (i10 == 0) {
            return j(lVar);
        }
        if (i10 == 1) {
            lVar.skipFully((int) this.f36532f);
            this.f36534h = 2;
            return 0;
        }
        if (i10 == 2) {
            r0.j(this.f36530d);
            return k(lVar, yVar);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean h(d0 d0Var, long j10, b bVar);

    protected void l(boolean z10) {
        if (z10) {
            this.f36536j = new b();
            this.f36532f = 0L;
            this.f36534h = 0;
        } else {
            this.f36534h = 1;
        }
        this.f36531e = -1L;
        this.f36533g = 0L;
    }

    final void m(long j10, long j11) {
        this.f36527a.e();
        if (j10 == 0) {
            l(!this.f36538l);
        } else if (this.f36534h != 0) {
            this.f36531e = c(j11);
            ((g) r0.j(this.f36530d)).startSeek(this.f36531e);
            this.f36534h = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements g {
        private c() {
        }

        @Override // da.g
        public long a(l lVar) {
            return -1L;
        }

        @Override // da.g
        public z createSeekMap() {
            return new z.b(C.TIME_UNSET);
        }

        @Override // da.g
        public void startSeek(long j10) {
        }
    }
}
