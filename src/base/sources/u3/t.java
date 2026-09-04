package u3;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.u f54076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o2.f0.a f54077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f54078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o0 f54080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f54081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f54082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f54086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f54088m;

    public t() {
        this(null, 0);
    }

    private void a(w1.u uVar) {
        byte[] bArrE = uVar.e();
        int iG = uVar.g();
        for (int iF = uVar.f(); iF < iG; iF++) {
            byte b10 = bArrE[iF];
            boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
            boolean z11 = this.f54085j && (b10 & 224) == 224;
            this.f54085j = z10;
            if (z11) {
                uVar.T(iF + 1);
                this.f54085j = false;
                this.f54076a.e()[1] = bArrE[iF];
                this.f54083h = 2;
                this.f54082g = 1;
                return;
            }
        }
        uVar.T(iG);
    }

    private void f(w1.u uVar) {
        int iMin = Math.min(uVar.a(), this.f54087l - this.f54083h);
        this.f54080e.c(uVar, iMin);
        int i10 = this.f54083h + iMin;
        this.f54083h = i10;
        if (i10 < this.f54087l) {
            return;
        }
        w1.a.g(this.f54088m != C.TIME_UNSET);
        this.f54080e.e(this.f54088m, 1, this.f54087l, 0, null);
        this.f54088m += this.f54086k;
        this.f54083h = 0;
        this.f54082g = 0;
    }

    private void g(w1.u uVar) {
        int iMin = Math.min(uVar.a(), 4 - this.f54083h);
        uVar.l(this.f54076a.e(), this.f54083h, iMin);
        int i10 = this.f54083h + iMin;
        this.f54083h = i10;
        if (i10 < 4) {
            return;
        }
        this.f54076a.T(0);
        if (!this.f54077b.a(this.f54076a.p())) {
            this.f54083h = 0;
            this.f54082g = 1;
            return;
        }
        o2.f0.a aVar = this.f54077b;
        this.f54087l = aVar.f48051c;
        if (!this.f54084i) {
            this.f54086k = (((long) aVar.f48055g) * 1000000) / ((long) aVar.f48052d);
            this.f54080e.b(new t1.o.b().a0(this.f54081f).o0(this.f54077b.f48050b).f0(4096).N(this.f54077b.f48053e).p0(this.f54077b.f48052d).e0(this.f54078c).m0(this.f54079d).K());
            this.f54084i = true;
        }
        this.f54076a.T(0);
        this.f54080e.c(this.f54076a, 4);
        this.f54082g = 2;
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        w1.a.i(this.f54080e);
        while (uVar.a() > 0) {
            int i10 = this.f54082g;
            if (i10 == 0) {
                a(uVar);
            } else if (i10 == 1) {
                g(uVar);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                f(uVar);
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f54088m = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f54081f = dVar.b();
        this.f54080e = rVar.track(dVar.c(), 1);
    }

    @Override // u3.m
    public void seek() {
        this.f54082g = 0;
        this.f54083h = 0;
        this.f54085j = false;
        this.f54088m = C.TIME_UNSET;
    }

    public t(String str, int i10) {
        this.f54082g = 0;
        w1.u uVar = new w1.u(4);
        this.f54076a = uVar;
        uVar.e()[0] = -1;
        this.f54077b = new o2.f0.a();
        this.f54088m = C.TIME_UNSET;
        this.f54078c = str;
        this.f54079d = i10;
    }

    @Override // u3.m
    public void e(boolean z10) {
    }
}
