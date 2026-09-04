package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.t f53747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.u f53748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f53752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f53755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f53756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t1.o f53757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f53759m;

    public c() {
        this(null, 0);
    }

    private boolean a(w1.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f53754h);
        uVar.l(bArr, this.f53754h, iMin);
        int i11 = this.f53754h + iMin;
        this.f53754h = i11;
        return i11 == i10;
    }

    private void f() {
        this.f53747a.p(0);
        o2.b.C0739b c0739bF = o2.b.f(this.f53747a);
        t1.o oVar = this.f53757k;
        if (oVar == null || c0739bF.f47977d != oVar.B || c0739bF.f47976c != oVar.C || !w1.c0.c(c0739bF.f47974a, oVar.f52757n)) {
            t1.o.b bVarJ0 = new t1.o.b().a0(this.f53751e).o0(c0739bF.f47974a).N(c0739bF.f47977d).p0(c0739bF.f47976c).e0(this.f53749c).m0(this.f53750d).j0(c0739bF.f47980g);
            if (MimeTypes.AUDIO_AC3.equals(c0739bF.f47974a)) {
                bVarJ0.M(c0739bF.f47980g);
            }
            t1.o oVarK = bVarJ0.K();
            this.f53757k = oVarK;
            this.f53752f.b(oVarK);
        }
        this.f53758l = c0739bF.f47978e;
        this.f53756j = (((long) c0739bF.f47979f) * 1000000) / ((long) this.f53757k.C);
    }

    private boolean g(w1.u uVar) {
        while (true) {
            if (uVar.a() <= 0) {
                return false;
            }
            if (this.f53755i) {
                int iG = uVar.G();
                if (iG == 119) {
                    this.f53755i = false;
                    return true;
                }
                this.f53755i = iG == 11;
            } else {
                this.f53755i = uVar.G() == 11;
            }
        }
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        w1.a.i(this.f53752f);
        while (uVar.a() > 0) {
            int i10 = this.f53753g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(uVar.a(), this.f53758l - this.f53754h);
                        this.f53752f.c(uVar, iMin);
                        int i11 = this.f53754h + iMin;
                        this.f53754h = i11;
                        if (i11 == this.f53758l) {
                            w1.a.g(this.f53759m != C.TIME_UNSET);
                            this.f53752f.e(this.f53759m, 1, this.f53758l, 0, null);
                            this.f53759m += this.f53756j;
                            this.f53753g = 0;
                        }
                    }
                } else if (a(uVar, this.f53748b.e(), 128)) {
                    f();
                    this.f53748b.T(0);
                    this.f53752f.c(this.f53748b, 128);
                    this.f53753g = 2;
                }
            } else if (g(uVar)) {
                this.f53753g = 1;
                this.f53748b.e()[0] = 11;
                this.f53748b.e()[1] = 119;
                this.f53754h = 2;
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f53759m = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f53751e = dVar.b();
        this.f53752f = rVar.track(dVar.c(), 1);
    }

    @Override // u3.m
    public void seek() {
        this.f53753g = 0;
        this.f53754h = 0;
        this.f53755i = false;
        this.f53759m = C.TIME_UNSET;
    }

    public c(String str, int i10) {
        w1.t tVar = new w1.t(new byte[128]);
        this.f53747a = tVar;
        this.f53748b = new w1.u(tVar.f55837a);
        this.f53753g = 0;
        this.f53759m = C.TIME_UNSET;
        this.f53749c = str;
        this.f53750d = i10;
    }

    @Override // u3.m
    public void e(boolean z10) {
    }
}
