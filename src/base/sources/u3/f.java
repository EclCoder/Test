package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.t f53790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f53795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f53800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t1.o f53801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f53803n;

    public f() {
        this(null, 0);
    }

    private boolean a(w1.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f53797h);
        uVar.l(bArr, this.f53797h, iMin);
        int i11 = this.f53797h + iMin;
        this.f53797h = i11;
        return i11 == i10;
    }

    private void f() {
        this.f53790a.p(0);
        o2.c.b bVarD = o2.c.d(this.f53790a);
        t1.o oVar = this.f53801l;
        if (oVar == null || bVarD.f47987c != oVar.B || bVarD.f47986b != oVar.C || !"audio/ac4".equals(oVar.f52757n)) {
            t1.o oVarK = new t1.o.b().a0(this.f53794e).o0("audio/ac4").N(bVarD.f47987c).p0(bVarD.f47986b).e0(this.f53792c).m0(this.f53793d).K();
            this.f53801l = oVarK;
            this.f53795f.b(oVarK);
        }
        this.f53802m = bVarD.f47988d;
        this.f53800k = (((long) bVarD.f47989e) * 1000000) / ((long) this.f53801l.C);
    }

    private boolean g(w1.u uVar) {
        while (true) {
            if (uVar.a() <= 0) {
                return false;
            }
            if (this.f53798i) {
                int iG = uVar.G();
                this.f53798i = iG == 172;
                if (iG == 64 || iG == 65) {
                    this.f53799j = iG == 65;
                    return true;
                }
            } else {
                this.f53798i = uVar.G() == 172;
            }
        }
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        w1.a.i(this.f53795f);
        while (uVar.a() > 0) {
            int i10 = this.f53796g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(uVar.a(), this.f53802m - this.f53797h);
                        this.f53795f.c(uVar, iMin);
                        int i11 = this.f53797h + iMin;
                        this.f53797h = i11;
                        if (i11 == this.f53802m) {
                            w1.a.g(this.f53803n != C.TIME_UNSET);
                            this.f53795f.e(this.f53803n, 1, this.f53802m, 0, null);
                            this.f53803n += this.f53800k;
                            this.f53796g = 0;
                        }
                    }
                } else if (a(uVar, this.f53791b.e(), 16)) {
                    f();
                    this.f53791b.T(0);
                    this.f53795f.c(this.f53791b, 16);
                    this.f53796g = 2;
                }
            } else if (g(uVar)) {
                this.f53796g = 1;
                this.f53791b.e()[0] = -84;
                this.f53791b.e()[1] = (byte) (this.f53799j ? 65 : 64);
                this.f53797h = 2;
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f53803n = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f53794e = dVar.b();
        this.f53795f = rVar.track(dVar.c(), 1);
    }

    @Override // u3.m
    public void seek() {
        this.f53796g = 0;
        this.f53797h = 0;
        this.f53798i = false;
        this.f53799j = false;
        this.f53803n = C.TIME_UNSET;
    }

    public f(String str, int i10) {
        w1.t tVar = new w1.t(new byte[16]);
        this.f53790a = tVar;
        this.f53791b = new w1.u(tVar.f55837a);
        this.f53796g = 0;
        this.f53797h = 0;
        this.f53798i = false;
        this.f53799j = false;
        this.f53803n = C.TIME_UNSET;
        this.f53792c = str;
        this.f53793d = i10;
    }

    @Override // u3.m
    public void e(boolean z10) {
    }
}
