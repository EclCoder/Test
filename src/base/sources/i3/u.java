package i3;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f40974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f40976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40979f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40985l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f40987n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f40989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f40990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f40991r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f40980g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f40981h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f40982i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f40983j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f40984k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f40986m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1.u f40988o = new w1.u();

    public void a(o2.q qVar) {
        qVar.readFully(this.f40988o.e(), 0, this.f40988o.g());
        this.f40988o.T(0);
        this.f40989p = false;
    }

    public void b(w1.u uVar) {
        uVar.l(this.f40988o.e(), 0, this.f40988o.g());
        this.f40988o.T(0);
        this.f40989p = false;
    }

    public long c(int i10) {
        return this.f40983j[i10];
    }

    public void d(int i10) {
        this.f40988o.P(i10);
        this.f40985l = true;
        this.f40989p = true;
    }

    public void e(int i10, int i11) {
        this.f40978e = i10;
        this.f40979f = i11;
        if (this.f40981h.length < i10) {
            this.f40980g = new long[i10];
            this.f40981h = new int[i10];
        }
        if (this.f40982i.length < i11) {
            int i12 = (i11 * Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.f40982i = new int[i12];
            this.f40983j = new long[i12];
            this.f40984k = new boolean[i12];
            this.f40986m = new boolean[i12];
        }
    }

    public void f() {
        this.f40978e = 0;
        this.f40990q = 0L;
        this.f40991r = false;
        this.f40985l = false;
        this.f40989p = false;
        this.f40987n = null;
    }

    public boolean g(int i10) {
        return this.f40985l && this.f40986m[i10];
    }
}
