package ea;

import com.google.android.exoplayer2.v0;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.d0 f37618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.t.a f37619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u9.b0 f37621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f37627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37629l;

    public t() {
        this(null);
    }

    private void a(ob.d0 d0Var) {
        byte[] bArrE = d0Var.e();
        int iG = d0Var.g();
        for (int iF = d0Var.f(); iF < iG; iF++) {
            byte b10 = bArrE[iF];
            boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
            boolean z11 = this.f37626i && (b10 & 224) == 224;
            this.f37626i = z10;
            if (z11) {
                d0Var.U(iF + 1);
                this.f37626i = false;
                this.f37618a.e()[1] = bArrE[iF];
                this.f37624g = 2;
                this.f37623f = 1;
                return;
            }
        }
        d0Var.U(iG);
    }

    private void e(ob.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), this.f37628k - this.f37624g);
        this.f37621d.c(d0Var, iMin);
        int i10 = this.f37624g + iMin;
        this.f37624g = i10;
        int i11 = this.f37628k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f37629l;
        if (j10 != C.TIME_UNSET) {
            this.f37621d.f(j10, 1, i11, 0, null);
            this.f37629l += this.f37627j;
        }
        this.f37624g = 0;
        this.f37623f = 0;
    }

    private void f(ob.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), 4 - this.f37624g);
        d0Var.l(this.f37618a.e(), this.f37624g, iMin);
        int i10 = this.f37624g + iMin;
        this.f37624g = i10;
        if (i10 < 4) {
            return;
        }
        this.f37618a.U(0);
        if (!this.f37619b.a(this.f37618a.q())) {
            this.f37624g = 0;
            this.f37623f = 1;
            return;
        }
        q9.t.a aVar = this.f37619b;
        this.f37628k = aVar.f50503c;
        if (!this.f37625h) {
            this.f37627j = (((long) aVar.f50507g) * 1000000) / ((long) aVar.f50504d);
            this.f37621d.e(new v0.b().U(this.f37622e).g0(this.f37619b.f50502b).Y(4096).J(this.f37619b.f50505e).h0(this.f37619b.f50504d).X(this.f37620c).G());
            this.f37625h = true;
        }
        this.f37618a.U(0);
        this.f37621d.c(this.f37618a, 4);
        this.f37623f = 2;
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        ob.a.i(this.f37621d);
        while (d0Var.a() > 0) {
            int i10 = this.f37623f;
            if (i10 == 0) {
                a(d0Var);
            } else if (i10 == 1) {
                f(d0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                e(d0Var);
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37629l = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37622e = dVar.b();
        this.f37621d = mVar.track(dVar.c(), 1);
    }

    @Override // ea.m
    public void seek() {
        this.f37623f = 0;
        this.f37624g = 0;
        this.f37626i = false;
        this.f37629l = C.TIME_UNSET;
    }

    public t(String str) {
        this.f37623f = 0;
        ob.d0 d0Var = new ob.d0(4);
        this.f37618a = d0Var;
        d0Var.e()[0] = -1;
        this.f37619b = new q9.t.a();
        this.f37629l = C.TIME_UNSET;
        this.f37620c = str;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
