package ca;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f9839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f9841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9844f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9850l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f9852n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f9855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9856r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f9845g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f9846h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f9847i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f9848j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f9849k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f9851m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0 f9853o = new d0();

    public void a(d0 d0Var) {
        d0Var.l(this.f9853o.e(), 0, this.f9853o.g());
        this.f9853o.U(0);
        this.f9854p = false;
    }

    public void b(u9.l lVar) {
        lVar.readFully(this.f9853o.e(), 0, this.f9853o.g());
        this.f9853o.U(0);
        this.f9854p = false;
    }

    public long c(int i10) {
        return this.f9848j[i10];
    }

    public void d(int i10) {
        this.f9853o.Q(i10);
        this.f9850l = true;
        this.f9854p = true;
    }

    public void e(int i10, int i11) {
        this.f9843e = i10;
        this.f9844f = i11;
        if (this.f9846h.length < i10) {
            this.f9845g = new long[i10];
            this.f9846h = new int[i10];
        }
        if (this.f9847i.length < i11) {
            int i12 = (i11 * Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.f9847i = new int[i12];
            this.f9848j = new long[i12];
            this.f9849k = new boolean[i12];
            this.f9851m = new boolean[i12];
        }
    }

    public void f() {
        this.f9843e = 0;
        this.f9855q = 0L;
        this.f9856r = false;
        this.f9850l = false;
        this.f9854p = false;
        this.f9852n = null;
    }

    public boolean g(int i10) {
        return this.f9850l && this.f9851m[i10];
    }
}
