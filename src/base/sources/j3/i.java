package j3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.i0;
import o2.j0;
import o2.o0;
import o2.q;
import o2.r;
import t1.o;
import w1.c0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0 f41971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f41972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f41973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f41974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f41975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f41976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41978i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f41980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f41982m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f41970a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f41979j = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        o f41983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f41984b;

        b() {
        }
    }

    private void a() {
        w1.a.i(this.f41971b);
        c0.h(this.f41972c);
    }

    private boolean h(q qVar) {
        while (this.f41970a.d(qVar)) {
            this.f41980k = qVar.getPosition() - this.f41975f;
            if (!i(this.f41970a.c(), this.f41975f, this.f41979j)) {
                return true;
            }
            this.f41975f = qVar.getPosition();
        }
        this.f41977h = 3;
        return false;
    }

    private int j(q qVar) {
        if (!h(qVar)) {
            return -1;
        }
        o oVar = this.f41979j.f41983a;
        this.f41978i = oVar.C;
        if (!this.f41982m) {
            this.f41971b.b(oVar);
            this.f41982m = true;
        }
        g gVar = this.f41979j.f41984b;
        if (gVar != null) {
            this.f41973d = gVar;
        } else if (qVar.getLength() == -1) {
            this.f41973d = new c();
        } else {
            f fVarB = this.f41970a.b();
            this.f41973d = new j3.a(this, this.f41975f, qVar.getLength(), fVarB.f41963h + fVarB.f41964i, fVarB.f41958c, (fVarB.f41957b & 4) != 0);
        }
        this.f41977h = 2;
        this.f41970a.f();
        return 0;
    }

    private int k(q qVar, i0 i0Var) {
        long jA = this.f41973d.a(qVar);
        if (jA >= 0) {
            i0Var.f48076a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f41981l) {
            this.f41972c.d((j0) w1.a.i(this.f41973d.createSeekMap()));
            this.f41981l = true;
        }
        if (this.f41980k <= 0 && !this.f41970a.d(qVar)) {
            this.f41977h = 3;
            return -1;
        }
        this.f41980k = 0L;
        u uVarC = this.f41970a.c();
        long jF = f(uVarC);
        if (jF >= 0) {
            long j10 = this.f41976g;
            if (j10 + jF >= this.f41974e) {
                long jB = b(j10);
                this.f41971b.c(uVarC, uVarC.g());
                this.f41971b.e(jB, 1, uVarC.g(), 0, null);
                this.f41974e = -1L;
            }
        }
        this.f41976g += jF;
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / ((long) this.f41978i);
    }

    protected long c(long j10) {
        return (((long) this.f41978i) * j10) / 1000000;
    }

    void d(r rVar, o0 o0Var) {
        this.f41972c = rVar;
        this.f41971b = o0Var;
        l(true);
    }

    protected void e(long j10) {
        this.f41976g = j10;
    }

    protected abstract long f(u uVar);

    final int g(q qVar, i0 i0Var) {
        a();
        int i10 = this.f41977h;
        if (i10 == 0) {
            return j(qVar);
        }
        if (i10 == 1) {
            qVar.skipFully((int) this.f41975f);
            this.f41977h = 2;
            return 0;
        }
        if (i10 == 2) {
            c0.h(this.f41973d);
            return k(qVar, i0Var);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean i(u uVar, long j10, b bVar);

    protected void l(boolean z10) {
        if (z10) {
            this.f41979j = new b();
            this.f41975f = 0L;
            this.f41977h = 0;
        } else {
            this.f41977h = 1;
        }
        this.f41974e = -1L;
        this.f41976g = 0L;
    }

    final void m(long j10, long j11) {
        this.f41970a.e();
        if (j10 == 0) {
            l(!this.f41981l);
        } else if (this.f41977h != 0) {
            this.f41974e = c(j11);
            ((g) c0.h(this.f41973d)).startSeek(this.f41974e);
            this.f41977h = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements g {
        private c() {
        }

        @Override // j3.g
        public long a(q qVar) {
            return -1L;
        }

        @Override // j3.g
        public j0 createSeekMap() {
            return new j0.b(C.TIME_UNSET);
        }

        @Override // j3.g
        public void startSeek(long j10) {
        }
    }
}
