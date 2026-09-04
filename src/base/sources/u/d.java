package u;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f53658s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f53659t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f53660u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f53661v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f53662w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f53663x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f53664y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f53669e;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final c f53679o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f53682r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53665a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53666b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f53667c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap f53668d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53670f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53671g = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f53673i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f53674j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean[] f53675k = new boolean[32];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f53676l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f53677m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53678n = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i[] f53680p = new i[1000];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f53681q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    u.b[] f53672h = new u.b[32];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        void a(a aVar);

        i b(d dVar, boolean[] zArr);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends u.b {
        b(c cVar) {
            this.f53652e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f53679o = cVar;
        this.f53669e = new h(cVar);
        if (f53662w) {
            this.f53682r = new b(cVar);
        } else {
            this.f53682r = new u.b(cVar);
        }
    }

    private int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f53676l; i10++) {
            this.f53675k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f53676l * 2) {
                if (aVar.getKey() != null) {
                    this.f53675k[aVar.getKey().f53698c] = true;
                }
                i iVarB = aVar.b(this, this.f53675k);
                if (iVarB != null) {
                    boolean[] zArr = this.f53675k;
                    int i12 = iVarB.f53698c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarB != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f53677m; i14++) {
                        u.b bVar = this.f53672h[i14];
                        if (bVar.f53648a.f53705j != i.a.UNRESTRICTED && !bVar.f53653f && bVar.t(iVarB)) {
                            float fI = bVar.f53652e.i(iVarB);
                            if (fI < 0.0f) {
                                float f11 = (-bVar.f53649b) / fI;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        u.b bVar2 = this.f53672h[i13];
                        bVar2.f53648a.f53699d = -1;
                        bVar2.x(iVarB);
                        i iVar = bVar2.f53648a;
                        iVar.f53699d = i13;
                        iVar.h(this, bVar2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void D() {
        int i10 = 0;
        if (f53662w) {
            while (i10 < this.f53677m) {
                u.b bVar = this.f53672h[i10];
                if (bVar != null) {
                    this.f53679o.f53654a.a(bVar);
                }
                this.f53672h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f53677m) {
            u.b bVar2 = this.f53672h[i10];
            if (bVar2 != null) {
                this.f53679o.f53655b.a(bVar2);
            }
            this.f53672h[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f53679o.f53656c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.g(aVar, str);
        } else {
            iVar.e();
            iVar.g(aVar, str);
        }
        int i10 = this.f53681q;
        int i11 = this.f53665a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f53665a = i12;
            this.f53680p = (i[]) Arrays.copyOf(this.f53680p, i12);
        }
        i[] iVarArr = this.f53680p;
        int i13 = this.f53681q;
        this.f53681q = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private void l(u.b bVar) {
        int i10;
        if (f53660u && bVar.f53653f) {
            bVar.f53648a.f(this, bVar.f53649b);
        } else {
            u.b[] bVarArr = this.f53672h;
            int i11 = this.f53677m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f53648a;
            iVar.f53699d = i11;
            this.f53677m = i11 + 1;
            iVar.h(this, bVar);
        }
        if (f53660u && this.f53666b) {
            int i12 = 0;
            while (i12 < this.f53677m) {
                if (this.f53672h[i12] == null) {
                    System.out.println("WTF");
                }
                u.b bVar2 = this.f53672h[i12];
                if (bVar2 != null && bVar2.f53653f) {
                    bVar2.f53648a.f(this, bVar2.f53649b);
                    if (f53662w) {
                        this.f53679o.f53654a.a(bVar2);
                    } else {
                        this.f53679o.f53655b.a(bVar2);
                    }
                    this.f53672h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f53677m;
                        if (i13 >= i10) {
                            break;
                        }
                        u.b[] bVarArr2 = this.f53672h;
                        int i15 = i13 - 1;
                        u.b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f53648a;
                        if (iVar2.f53699d == i13) {
                            iVar2.f53699d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f53672h[i14] = null;
                    }
                    this.f53677m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f53666b = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f53677m; i10++) {
            u.b bVar = this.f53672h[i10];
            bVar.f53648a.f53701f = bVar.f53649b;
        }
    }

    public static u.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        float f10;
        for (int i10 = 0; i10 < this.f53677m; i10++) {
            u.b bVar = this.f53672h[i10];
            if (bVar.f53648a.f53705j != i.a.UNRESTRICTED) {
                float f11 = 0.0f;
                if (bVar.f53649b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f12 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f53677m) {
                                break;
                            }
                            u.b bVar2 = this.f53672h[i12];
                            if (bVar2.f53648a.f53705j == i.a.UNRESTRICTED || bVar2.f53653f || bVar2.f53649b >= f11) {
                                f10 = f11;
                            } else if (f53661v) {
                                int iE = bVar2.f53652e.e();
                                int i16 = 0;
                                while (i16 < iE) {
                                    i iVarB = bVar2.f53652e.b(i16);
                                    float fI = bVar2.f53652e.i(iVarB);
                                    if (fI > f11) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f13 = iVarB.f53703h[i17] / fI;
                                            if ((f13 < f12 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarB.f53698c;
                                                i13 = i12;
                                                f12 = f13;
                                            }
                                        }
                                    }
                                    i16++;
                                    f11 = f11;
                                }
                                f10 = f11;
                            } else {
                                f10 = f11;
                                for (int i18 = 1; i18 < this.f53676l; i18++) {
                                    i iVar = this.f53679o.f53657d[i18];
                                    float fI2 = bVar2.f53652e.i(iVar);
                                    if (fI2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f14 = iVar.f53703h[i19] / fI2;
                                            if ((f14 < f12 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i13 = i12;
                                                i14 = i18;
                                                f12 = f14;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f11 = f10;
                        }
                        float f15 = f11;
                        if (i13 != -1) {
                            u.b bVar3 = this.f53672h[i13];
                            bVar3.f53648a.f53699d = -1;
                            bVar3.x(this.f53679o.f53657d[i14]);
                            i iVar2 = bVar3.f53648a;
                            iVar2.f53699d = i13;
                            iVar2.h(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f53676l / 2) {
                            z10 = true;
                        }
                        f11 = f15;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public static e x() {
        return null;
    }

    private void z() {
        int i10 = this.f53670f * 2;
        this.f53670f = i10;
        this.f53672h = (u.b[]) Arrays.copyOf(this.f53672h, i10);
        c cVar = this.f53679o;
        cVar.f53657d = (i[]) Arrays.copyOf(cVar.f53657d, this.f53670f);
        int i11 = this.f53670f;
        this.f53675k = new boolean[i11];
        this.f53671g = i11;
        this.f53678n = i11;
    }

    public void A() {
        if (this.f53669e.isEmpty()) {
            n();
            return;
        }
        if (!this.f53673i && !this.f53674j) {
            B(this.f53669e);
            return;
        }
        for (int i10 = 0; i10 < this.f53677m; i10++) {
            if (!this.f53672h[i10].f53653f) {
                B(this.f53669e);
                return;
            }
        }
        n();
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f53679o;
            i[] iVarArr = cVar.f53657d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.e();
            }
            i10++;
        }
        cVar.f53656c.c(this.f53680p, this.f53681q);
        this.f53681q = 0;
        Arrays.fill(this.f53679o.f53657d, (Object) null);
        HashMap map = this.f53668d;
        if (map != null) {
            map.clear();
        }
        this.f53667c = 0;
        this.f53669e.clear();
        this.f53676l = 1;
        for (int i11 = 0; i11 < this.f53677m; i11++) {
            u.b bVar = this.f53672h[i11];
            if (bVar != null) {
                bVar.f53650c = false;
            }
        }
        D();
        this.f53677m = 0;
        if (f53662w) {
            this.f53682r = new b(this.f53679o);
        } else {
            this.f53682r = new u.b(this.f53679o);
        }
    }

    public void b(x.e eVar, x.e eVar2, float f10, int i10) {
        x.d.a aVar = x.d.a.LEFT;
        i iVarQ = q(eVar.q(aVar));
        x.d.a aVar2 = x.d.a.TOP;
        i iVarQ2 = q(eVar.q(aVar2));
        x.d.a aVar3 = x.d.a.RIGHT;
        i iVarQ3 = q(eVar.q(aVar3));
        x.d.a aVar4 = x.d.a.BOTTOM;
        i iVarQ4 = q(eVar.q(aVar4));
        i iVarQ5 = q(eVar2.q(aVar));
        i iVarQ6 = q(eVar2.q(aVar2));
        i iVarQ7 = q(eVar2.q(aVar3));
        i iVarQ8 = q(eVar2.q(aVar4));
        u.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        u.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        u.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public void d(u.b bVar) {
        i iVarV;
        if (bVar == null) {
            return;
        }
        boolean z10 = true;
        if (this.f53677m + 1 >= this.f53678n || this.f53676l + 1 >= this.f53671g) {
            z();
        }
        boolean z11 = false;
        if (!bVar.f53653f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f53648a = iVarP;
                int i10 = this.f53677m;
                l(bVar);
                if (this.f53677m == i10 + 1) {
                    this.f53682r.a(bVar);
                    C(this.f53682r, true);
                    if (iVarP.f53699d == -1) {
                        if (bVar.f53648a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            bVar.x(iVarV);
                        }
                        if (!bVar.f53653f) {
                            bVar.f53648a.h(this, bVar);
                        }
                        if (f53662w) {
                            this.f53679o.f53654a.a(bVar);
                        } else {
                            this.f53679o.f53655b.a(bVar);
                        }
                        this.f53677m--;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (z11) {
            return;
        }
        l(bVar);
    }

    public u.b e(i iVar, i iVar2, int i10, int i11) {
        if (f53659t && i11 == 8 && iVar2.f53702g && iVar.f53699d == -1) {
            iVar.f(this, iVar2.f53701f + i10);
            return null;
        }
        u.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        if (f53659t && iVar.f53699d == -1) {
            float f10 = i10;
            iVar.f(this, f10);
            for (int i11 = 0; i11 < this.f53667c + 1; i11++) {
                i iVar2 = this.f53679o.f53657d[i11];
                if (iVar2 != null && iVar2.f53709n && iVar2.f53710o == iVar.f53698c) {
                    iVar2.f(this, iVar2.f53711p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f53699d;
        if (i12 == -1) {
            u.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        u.b bVar = this.f53672h[i12];
        if (bVar.f53653f) {
            bVar.f53649b = i10;
            return;
        }
        if (bVar.f53652e.e() == 0) {
            bVar.f53653f = true;
            bVar.f53649b = i10;
        } else {
            u.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f53700e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f53700e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f53652e.i(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f53700e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        u.b bVarR = r();
        i iVarT = t();
        iVarT.f53700e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f53652e.i(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        u.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    void m(u.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f53676l + 1 >= this.f53671g) {
            z();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f53667c + 1;
        this.f53667c = i11;
        this.f53676l++;
        iVarA.f53698c = i11;
        iVarA.f53700e = i10;
        this.f53679o.f53657d[i11] = iVarA;
        this.f53669e.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f53676l + 1 >= this.f53671g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f53667c + 1;
        this.f53667c = i10;
        this.f53676l++;
        iVarA.f53698c = i10;
        this.f53679o.f53657d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f53676l + 1 >= this.f53671g) {
            z();
        }
        if (obj instanceof x.d) {
            x.d dVar = (x.d) obj;
            iVarI = dVar.i();
            if (iVarI == null) {
                dVar.s(this.f53679o);
                iVarI = dVar.i();
            }
            int i10 = iVarI.f53698c;
            if (i10 != -1 && i10 <= this.f53667c && this.f53679o.f53657d[i10] != null) {
                return iVarI;
            }
            if (i10 != -1) {
                iVarI.e();
            }
            int i11 = this.f53667c + 1;
            this.f53667c = i11;
            this.f53676l++;
            iVarI.f53698c = i11;
            iVarI.f53705j = i.a.UNRESTRICTED;
            this.f53679o.f53657d[i11] = iVarI;
        }
        return iVarI;
    }

    public u.b r() {
        u.b bVar;
        if (f53662w) {
            bVar = (u.b) this.f53679o.f53654a.b();
            if (bVar == null) {
                bVar = new b(this.f53679o);
                f53664y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (u.b) this.f53679o.f53655b.b();
            if (bVar == null) {
                bVar = new u.b(this.f53679o);
                f53663x++;
            } else {
                bVar.y();
            }
        }
        i.c();
        return bVar;
    }

    public i t() {
        if (this.f53676l + 1 >= this.f53671g) {
            z();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f53667c + 1;
        this.f53667c = i10;
        this.f53676l++;
        iVarA.f53698c = i10;
        this.f53679o.f53657d[i10] = iVarA;
        return iVarA;
    }

    public c w() {
        return this.f53679o;
    }

    public int y(Object obj) {
        i iVarI = ((x.d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f53701f + 0.5f);
        }
        return 0;
    }

    public void v(e eVar) {
    }
}
