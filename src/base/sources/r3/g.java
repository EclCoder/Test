package r3;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51060e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f51066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f51067l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f51070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f51071p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f51073r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51061f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f51062g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51063h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51064i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51065j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f51068m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f51069n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f51072q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f51074s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f51058c && gVar.f51058c) {
                w(gVar.f51057b);
            }
            if (this.f51063h == -1) {
                this.f51063h = gVar.f51063h;
            }
            if (this.f51064i == -1) {
                this.f51064i = gVar.f51064i;
            }
            if (this.f51056a == null && (str = gVar.f51056a) != null) {
                this.f51056a = str;
            }
            if (this.f51061f == -1) {
                this.f51061f = gVar.f51061f;
            }
            if (this.f51062g == -1) {
                this.f51062g = gVar.f51062g;
            }
            if (this.f51069n == -1) {
                this.f51069n = gVar.f51069n;
            }
            if (this.f51070o == null && (alignment2 = gVar.f51070o) != null) {
                this.f51070o = alignment2;
            }
            if (this.f51071p == null && (alignment = gVar.f51071p) != null) {
                this.f51071p = alignment;
            }
            if (this.f51072q == -1) {
                this.f51072q = gVar.f51072q;
            }
            if (this.f51065j == -1) {
                this.f51065j = gVar.f51065j;
                this.f51066k = gVar.f51066k;
            }
            if (this.f51073r == null) {
                this.f51073r = gVar.f51073r;
            }
            if (this.f51074s == Float.MAX_VALUE) {
                this.f51074s = gVar.f51074s;
            }
            if (z10 && !this.f51060e && gVar.f51060e) {
                u(gVar.f51059d);
            }
            if (z10 && this.f51068m == -1 && (i10 = gVar.f51068m) != -1) {
                this.f51068m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f51067l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f51064i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f51061f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f51071p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f51069n = i10;
        return this;
    }

    public g F(int i10) {
        this.f51068m = i10;
        return this;
    }

    public g G(float f10) {
        this.f51074s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f51070o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f51072q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f51073r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f51062g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f51060e) {
            return this.f51059d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f51058c) {
            return this.f51057b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f51056a;
    }

    public float e() {
        return this.f51066k;
    }

    public int f() {
        return this.f51065j;
    }

    public String g() {
        return this.f51067l;
    }

    public Layout.Alignment h() {
        return this.f51071p;
    }

    public int i() {
        return this.f51069n;
    }

    public int j() {
        return this.f51068m;
    }

    public float k() {
        return this.f51074s;
    }

    public int l() {
        int i10 = this.f51063h;
        if (i10 == -1 && this.f51064i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f51064i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f51070o;
    }

    public boolean n() {
        return this.f51072q == 1;
    }

    public b o() {
        return this.f51073r;
    }

    public boolean p() {
        return this.f51060e;
    }

    public boolean q() {
        return this.f51058c;
    }

    public boolean s() {
        return this.f51061f == 1;
    }

    public boolean t() {
        return this.f51062g == 1;
    }

    public g u(int i10) {
        this.f51059d = i10;
        this.f51060e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f51063h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f51057b = i10;
        this.f51058c = true;
        return this;
    }

    public g x(String str) {
        this.f51056a = str;
        return this;
    }

    public g y(float f10) {
        this.f51066k = f10;
        return this;
    }

    public g z(int i10) {
        this.f51065j = i10;
        return this;
    }
}
