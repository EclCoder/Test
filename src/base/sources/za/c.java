package za;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.c0;
import ob.d0;
import ob.r0;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58697a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0 f58699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58700d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f58703g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f58698b = new c0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f58701e = C.TIME_UNSET;

    public c(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58697a = hVar;
    }

    private void d() {
        if (this.f58700d > 0) {
            e();
        }
    }

    private void e() {
        ((b0) r0.j(this.f58699c)).f(this.f58702f, 1, this.f58700d, 0, null);
        this.f58700d = 0;
    }

    private void f(d0 d0Var, boolean z10, int i10, long j10) {
        int iA = d0Var.a();
        ((b0) ob.a.e(this.f58699c)).c(d0Var, iA);
        this.f58700d += iA;
        this.f58702f = j10;
        if (z10 && i10 == 3) {
            e();
        }
    }

    private void g(d0 d0Var, int i10, long j10) {
        this.f58698b.n(d0Var.e());
        this.f58698b.s(2);
        long j11 = j10;
        for (int i11 = 0; i11 < i10; i11++) {
            q9.b.C0779b c0779bF = q9.b.f(this.f58698b);
            ((b0) ob.a.e(this.f58699c)).c(d0Var, c0779bF.f50452e);
            ((b0) r0.j(this.f58699c)).f(j11, 1, c0779bF.f50452e, 0, null);
            j11 += ((long) (c0779bF.f50453f / c0779bF.f50450c)) * 1000000;
            this.f58698b.s(c0779bF.f50452e);
        }
    }

    private void h(d0 d0Var, long j10) {
        int iA = d0Var.a();
        ((b0) ob.a.e(this.f58699c)).c(d0Var, iA);
        ((b0) r0.j(this.f58699c)).f(j10, 1, iA, 0, null);
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 1);
        this.f58699c = b0VarTrack;
        b0VarTrack.e(this.f58697a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        int iH = d0Var.H() & 3;
        int iH2 = d0Var.H() & 255;
        long jA = m.a(this.f58703g, j10, this.f58701e, this.f58697a.f17997b);
        if (iH == 0) {
            d();
            if (iH2 == 1) {
                h(d0Var, jA);
                return;
            } else {
                g(d0Var, iH2, jA);
                return;
            }
        }
        if (iH == 1 || iH == 2) {
            d();
        } else if (iH != 3) {
            throw new IllegalArgumentException(String.valueOf(iH));
        }
        f(d0Var, z10, iH, jA);
    }

    @Override // za.k
    public void c(long j10, int i10) {
        ob.a.g(this.f58701e == C.TIME_UNSET);
        this.f58701e = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58701e = j10;
        this.f58703g = j11;
    }
}
