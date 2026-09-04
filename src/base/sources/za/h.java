package za;

import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.e0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.c0;
import ob.d0;
import ob.r0;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.rtsp.h f58743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b0 f58745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f58746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f58749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f58750h;

    public h(com.google.android.exoplayer2.source.rtsp.h hVar) {
        this.f58743a = hVar;
        try {
            this.f58744b = d(hVar.f17999d);
            this.f58746d = C.TIME_UNSET;
            this.f58747e = -1;
            this.f58748f = 0;
            this.f58749g = 0L;
            this.f58750h = C.TIME_UNSET;
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private static int d(e0 e0Var) throws ParserException {
        String str = (String) e0Var.get("config");
        int i10 = 0;
        i10 = 0;
        if (str != null && str.length() % 2 == 0) {
            c0 c0Var = new c0(r0.K(str));
            int iH = c0Var.h(1);
            if (iH != 0) {
                throw ParserException.b("unsupported audio mux version: " + iH, null);
            }
            ob.a.b(c0Var.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int iH2 = c0Var.h(6);
            ob.a.b(c0Var.h(4) == 0, "Only suppors one program.");
            ob.a.b(c0Var.h(3) == 0, "Only suppors one layer.");
            i10 = iH2;
        }
        return i10 + 1;
    }

    private void e() {
        ((b0) ob.a.e(this.f58745c)).f(this.f58750h, 1, this.f58748f, 0, null);
        this.f58748f = 0;
        this.f58750h = C.TIME_UNSET;
    }

    @Override // za.k
    public void a(u9.m mVar, int i10) {
        b0 b0VarTrack = mVar.track(i10, 2);
        this.f58745c = b0VarTrack;
        ((b0) r0.j(b0VarTrack)).e(this.f58743a.f17998c);
    }

    @Override // za.k
    public void b(d0 d0Var, long j10, int i10, boolean z10) {
        ob.a.i(this.f58745c);
        int iB = ya.a.b(this.f58747e);
        if (this.f58748f > 0 && iB < i10) {
            e();
        }
        for (int i11 = 0; i11 < this.f58744b; i11++) {
            int i12 = 0;
            while (d0Var.f() < d0Var.g()) {
                int iH = d0Var.H();
                i12 += iH;
                if (iH != 255) {
                    break;
                }
            }
            this.f58745c.c(d0Var, i12);
            this.f58748f += i12;
        }
        this.f58750h = m.a(this.f58749g, j10, this.f58746d, this.f58743a.f17997b);
        if (z10) {
            e();
        }
        this.f58747e = i10;
    }

    @Override // za.k
    public void c(long j10, int i10) {
        ob.a.g(this.f58746d == C.TIME_UNSET);
        this.f58746d = j10;
    }

    @Override // za.k
    public void seek(long j10, long j11) {
        this.f58746d = j10;
        this.f58748f = 0;
        this.f58749g = j11;
    }
}
