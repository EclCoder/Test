package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1601a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1602b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1603c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1604d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1605e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1606f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1607g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1608h = false;

    h0() {
    }

    public int a() {
        return this.f1607g ? this.f1601a : this.f1602b;
    }

    public int b() {
        return this.f1601a;
    }

    public int c() {
        return this.f1602b;
    }

    public int d() {
        return this.f1607g ? this.f1602b : this.f1601a;
    }

    public void e(int i10, int i11) {
        this.f1608h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1605e = i10;
            this.f1601a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1606f = i11;
            this.f1602b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f1607g) {
            return;
        }
        this.f1607g = z10;
        if (!this.f1608h) {
            this.f1601a = this.f1605e;
            this.f1602b = this.f1606f;
            return;
        }
        if (z10) {
            int i10 = this.f1604d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f1605e;
            }
            this.f1601a = i10;
            int i11 = this.f1603c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f1606f;
            }
            this.f1602b = i11;
            return;
        }
        int i12 = this.f1603c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = this.f1605e;
        }
        this.f1601a = i12;
        int i13 = this.f1604d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = this.f1606f;
        }
        this.f1602b = i13;
    }

    public void g(int i10, int i11) {
        this.f1603c = i10;
        this.f1604d = i11;
        this.f1608h = true;
        if (this.f1607g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1601a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1602b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1601a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1602b = i11;
        }
    }
}
