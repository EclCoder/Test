package o2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f48015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f48016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f48017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48018d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f48019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f48022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f48023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f48024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f48025g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f48019a = dVar;
            this.f48020b = j10;
            this.f48021c = j11;
            this.f48022d = j12;
            this.f48023e = j13;
            this.f48024f = j14;
            this.f48025g = j15;
        }

        @Override // o2.j0
        public long getDurationUs() {
            return this.f48020b;
        }

        @Override // o2.j0
        public j0.a getSeekPoints(long j10) {
            return new j0.a(new k0(j10, c.h(this.f48019a.a(j10), this.f48021c, this.f48022d, this.f48023e, this.f48024f, this.f48025g)));
        }

        public long h(long j10) {
            return this.f48019a.a(j10);
        }

        @Override // o2.j0
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f48026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f48029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f48030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f48031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f48032g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f48033h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f48026a = j10;
            this.f48027b = j11;
            this.f48029d = j12;
            this.f48030e = j13;
            this.f48031f = j14;
            this.f48032g = j15;
            this.f48028c = j16;
            this.f48033h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return w1.c0.p(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f48032g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f48031f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f48033h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f48026a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f48027b;
        }

        private void n() {
            this.f48033h = h(this.f48027b, this.f48029d, this.f48030e, this.f48031f, this.f48032g, this.f48028c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f48030e = j10;
            this.f48032g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f48029d = j10;
            this.f48031f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: renamed from: o2.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0740e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0740e f48034d = new C0740e(-3, C.TIME_UNSET, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f48037c;

        private C0740e(int i10, long j10, long j11) {
            this.f48035a = i10;
            this.f48036b = j10;
            this.f48037c = j11;
        }

        public static C0740e d(long j10, long j11) {
            return new C0740e(-1, j10, j11);
        }

        public static C0740e e(long j10) {
            return new C0740e(0, C.TIME_UNSET, j10);
        }

        public static C0740e f(long j10, long j11) {
            return new C0740e(-2, j10, j11);
        }
    }

    protected e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f48016b = fVar;
        this.f48018d = i10;
        this.f48015a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f48015a.h(j10), this.f48015a.f48021c, this.f48015a.f48022d, this.f48015a.f48023e, this.f48015a.f48024f, this.f48015a.f48025g);
    }

    public final j0 b() {
        return this.f48015a;
    }

    public int c(q qVar, i0 i0Var) {
        while (true) {
            c cVar = (c) w1.a.i(this.f48017c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f48018d) {
                e(false, j10);
                return g(qVar, j10, i0Var);
            }
            if (!i(qVar, jK)) {
                return g(qVar, jK, i0Var);
            }
            qVar.resetPeekPosition();
            C0740e c0740eB = this.f48016b.b(qVar, cVar.m());
            int i10 = c0740eB.f48035a;
            if (i10 == -3) {
                e(false, jK);
                return g(qVar, jK, i0Var);
            }
            if (i10 == -2) {
                cVar.p(c0740eB.f48036b, c0740eB.f48037c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(qVar, c0740eB.f48037c);
                    e(true, c0740eB.f48037c);
                    return g(qVar, c0740eB.f48037c, i0Var);
                }
                cVar.o(c0740eB.f48036b, c0740eB.f48037c);
            }
        }
    }

    public final boolean d() {
        return this.f48017c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f48017c = null;
        this.f48016b.a();
        f(z10, j10);
    }

    protected final int g(q qVar, long j10, i0 i0Var) {
        if (j10 == qVar.getPosition()) {
            return 0;
        }
        i0Var.f48076a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f48017c;
        if (cVar == null || cVar.l() != j10) {
            this.f48017c = a(j10);
        }
    }

    protected final boolean i(q qVar, long j10) {
        long position = j10 - qVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        qVar.skipFully((int) position);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        C0740e b(q qVar, long j10);

        default void a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements d {
        @Override // o2.e.d
        public long a(long j10) {
            return j10;
        }
    }

    protected void f(boolean z10, long j10) {
    }
}
