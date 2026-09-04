package u9;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0816a f54207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final f f54208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected c f54209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54210d;

    /* JADX INFO: renamed from: u9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class C0816a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f54211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f54213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f54214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f54215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f54216f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f54217g;

        public C0816a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f54211a = dVar;
            this.f54212b = j10;
            this.f54213c = j11;
            this.f54214d = j12;
            this.f54215e = j13;
            this.f54216f = j14;
            this.f54217g = j15;
        }

        public long g(long j10) {
            return this.f54211a.a(j10);
        }

        @Override // u9.z
        public long getDurationUs() {
            return this.f54212b;
        }

        @Override // u9.z
        public z.a getSeekPoints(long j10) {
            return new z.a(new a0(j10, c.h(this.f54211a.a(j10), this.f54213c, this.f54214d, this.f54215e, this.f54216f, this.f54217g)));
        }

        @Override // u9.z
        public boolean isSeekable() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f54218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f54220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f54221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f54222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f54223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f54224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f54225h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f54218a = j10;
            this.f54219b = j11;
            this.f54221d = j12;
            this.f54222e = j13;
            this.f54223f = j14;
            this.f54224g = j15;
            this.f54220c = j16;
            this.f54225h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return r0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f54224g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f54223f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f54225h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f54218a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f54219b;
        }

        private void n() {
            this.f54225h = h(this.f54219b, this.f54221d, this.f54222e, this.f54223f, this.f54224g, this.f54220c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f54222e = j10;
            this.f54224g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f54221d = j10;
            this.f54223f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        long a(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f54226d = new e(-3, C.TIME_UNSET, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f54227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f54228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f54229c;

        private e(int i10, long j10, long j11) {
            this.f54227a = i10;
            this.f54228b = j10;
            this.f54229c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, C.TIME_UNSET, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    protected a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f54208b = fVar;
        this.f54210d = i10;
        this.f54207a = new C0816a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f54207a.g(j10), this.f54207a.f54213c, this.f54207a.f54214d, this.f54207a.f54215e, this.f54207a.f54216f, this.f54207a.f54217g);
    }

    public final z b() {
        return this.f54207a;
    }

    public int c(l lVar, y yVar) {
        while (true) {
            c cVar = (c) ob.a.i(this.f54209c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f54210d) {
                e(false, j10);
                return g(lVar, j10, yVar);
            }
            if (!i(lVar, jK)) {
                return g(lVar, jK, yVar);
            }
            lVar.resetPeekPosition();
            e eVarB = this.f54208b.b(lVar, cVar.m());
            int i10 = eVarB.f54227a;
            if (i10 == -3) {
                e(false, jK);
                return g(lVar, jK, yVar);
            }
            if (i10 == -2) {
                cVar.p(eVarB.f54228b, eVarB.f54229c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(lVar, eVarB.f54229c);
                    e(true, eVarB.f54229c);
                    return g(lVar, eVarB.f54229c, yVar);
                }
                cVar.o(eVarB.f54228b, eVarB.f54229c);
            }
        }
    }

    public final boolean d() {
        return this.f54209c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f54209c = null;
        this.f54208b.a();
        f(z10, j10);
    }

    protected final int g(l lVar, long j10, y yVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        yVar.f54333a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f54209c;
        if (cVar == null || cVar.l() != j10) {
            this.f54209c = a(j10);
        }
    }

    protected final boolean i(l lVar, long j10) {
        long position = j10 - lVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        lVar.skipFully((int) position);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface f {
        e b(l lVar, long j10);

        default void a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements d {
        @Override // u9.a.d
        public long a(long j10) {
            return j10;
        }
    }

    protected void f(boolean z10, long j10) {
    }
}
