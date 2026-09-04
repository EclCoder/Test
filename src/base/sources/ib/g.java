package ib;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41301e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f41307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f41308l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f41311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f41312p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f41314r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f41302f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41303g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41304h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41305i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f41306j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f41309m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41310n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f41313q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f41315s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f41299c && gVar.f41299c) {
                w(gVar.f41298b);
            }
            if (this.f41304h == -1) {
                this.f41304h = gVar.f41304h;
            }
            if (this.f41305i == -1) {
                this.f41305i = gVar.f41305i;
            }
            if (this.f41297a == null && (str = gVar.f41297a) != null) {
                this.f41297a = str;
            }
            if (this.f41302f == -1) {
                this.f41302f = gVar.f41302f;
            }
            if (this.f41303g == -1) {
                this.f41303g = gVar.f41303g;
            }
            if (this.f41310n == -1) {
                this.f41310n = gVar.f41310n;
            }
            if (this.f41311o == null && (alignment2 = gVar.f41311o) != null) {
                this.f41311o = alignment2;
            }
            if (this.f41312p == null && (alignment = gVar.f41312p) != null) {
                this.f41312p = alignment;
            }
            if (this.f41313q == -1) {
                this.f41313q = gVar.f41313q;
            }
            if (this.f41306j == -1) {
                this.f41306j = gVar.f41306j;
                this.f41307k = gVar.f41307k;
            }
            if (this.f41314r == null) {
                this.f41314r = gVar.f41314r;
            }
            if (this.f41315s == Float.MAX_VALUE) {
                this.f41315s = gVar.f41315s;
            }
            if (z10 && !this.f41301e && gVar.f41301e) {
                u(gVar.f41300d);
            }
            if (z10 && this.f41309m == -1 && (i10 = gVar.f41309m) != -1) {
                this.f41309m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f41308l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f41305i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f41302f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f41312p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f41310n = i10;
        return this;
    }

    public g F(int i10) {
        this.f41309m = i10;
        return this;
    }

    public g G(float f10) {
        this.f41315s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f41311o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f41313q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f41314r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f41303g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f41301e) {
            return this.f41300d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f41299c) {
            return this.f41298b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f41297a;
    }

    public float e() {
        return this.f41307k;
    }

    public int f() {
        return this.f41306j;
    }

    public String g() {
        return this.f41308l;
    }

    public Layout.Alignment h() {
        return this.f41312p;
    }

    public int i() {
        return this.f41310n;
    }

    public int j() {
        return this.f41309m;
    }

    public float k() {
        return this.f41315s;
    }

    public int l() {
        int i10 = this.f41304h;
        if (i10 == -1 && this.f41305i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f41305i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f41311o;
    }

    public boolean n() {
        return this.f41313q == 1;
    }

    public b o() {
        return this.f41314r;
    }

    public boolean p() {
        return this.f41301e;
    }

    public boolean q() {
        return this.f41299c;
    }

    public boolean s() {
        return this.f41302f == 1;
    }

    public boolean t() {
        return this.f41303g == 1;
    }

    public g u(int i10) {
        this.f41300d = i10;
        this.f41301e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f41304h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f41298b = i10;
        this.f41299c = true;
        return this;
    }

    public g x(String str) {
        this.f41297a = str;
        return this;
    }

    public g y(float f10) {
        this.f41307k = f10;
        return this;
    }

    public g z(int i10) {
        this.f41306j = i10;
        return this;
    }
}
