package za;

import ob.c0;
import ob.d0;
import ob.r0;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f58689b = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f58691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f58692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f58693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f58694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f58695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f58696i;

    public b(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58688a = hVar;
        this.f58690c = hVar.f17997b;
        String str = (String) ob.a.e((String) hVar.f17999d.get("mode"));
        if (sc.c.a(str, "AAC-hbr")) {
            this.f58691d = 13;
            this.f58692e = 3;
        } else {
            if (!sc.c.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f58691d = 6;
            this.f58692e = 2;
        }
        this.f58693f = this.f58692e + this.f58691d;
    }

    private static void d(b0 b0Var, long j10, int i10) {
        b0Var.f(j10, 1, i10, 0, null);
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 1);
        this.f58695h = b0VarTrack;
        b0VarTrack.e(this.f58688a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        ob.a.e(this.f58695h);
        short sD = d0Var.D();
        int i11 = sD / this.f58693f;
        long jA = m.a(this.f58696i, j10, this.f58694g, this.f58690c);
        this.f58689b.m(d0Var);
        if (i11 == 1) {
            int iH = this.f58689b.h(this.f58691d);
            this.f58689b.r(this.f58692e);
            this.f58695h.c(d0Var, d0Var.a());
            if (z10) {
                d(this.f58695h, jA, iH);
                return;
            }
            return;
        }
        d0Var.V((sD + 7) / 8);
        for (int i12 = 0; i12 < i11; i12++) {
            int iH2 = this.f58689b.h(this.f58691d);
            this.f58689b.r(this.f58692e);
            this.f58695h.c(d0Var, iH2);
            d(this.f58695h, jA, iH2);
            jA += r0.U0(i11, 1000000L, this.f58690c);
        }
    }

    @Override // za.k
    public void c(long j10, int i10) {
        this.f58694g = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58694g = j10;
        this.f58696i = j11;
    }
}
