package androidx.constraintlayout.motion.widget;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class o implements Comparable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static String[] f2297t = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    v.c f2298a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float f2300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f2301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f2302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f2303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f2304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f2305h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f2308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f2309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f2310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    m f2311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    LinkedHashMap f2312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f2313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f2314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    double[] f2315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    double[] f2316s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2299b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f2306i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f2307j = Float.NaN;

    o() {
        int i10 = d.f2143f;
        this.f2308k = i10;
        this.f2309l = i10;
        this.f2310m = Float.NaN;
        this.f2311n = null;
        this.f2312o = new LinkedHashMap();
        this.f2313p = 0;
        this.f2315r = new double[18];
        this.f2316s = new double[18];
    }

    private boolean c(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    public void a(androidx.constraintlayout.widget.c.a aVar) {
        this.f2298a = v.c.c(aVar.f2693d.f2758d);
        androidx.constraintlayout.widget.c.C0026c c0026c = aVar.f2693d;
        this.f2308k = c0026c.f2759e;
        this.f2309l = c0026c.f2756b;
        this.f2306i = c0026c.f2763i;
        this.f2299b = c0026c.f2760f;
        this.f2314q = c0026c.f2757c;
        this.f2307j = aVar.f2692c.f2773e;
        this.f2310m = aVar.f2694e.D;
        for (String str : aVar.f2696g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) aVar.f2696g.get(str);
            if (aVar2 != null && aVar2.g()) {
                this.f2312o.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(o oVar) {
        return Float.compare(this.f2301d, oVar.f2301d);
    }

    void d(o oVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean zC = c(this.f2302e, oVar.f2302e);
        boolean zC2 = c(this.f2303f, oVar.f2303f);
        zArr[0] = zArr[0] | c(this.f2301d, oVar.f2301d);
        boolean z11 = zC | zC2 | z10;
        zArr[1] = zArr[1] | z11;
        zArr[2] = z11 | zArr[2];
        zArr[3] = zArr[3] | c(this.f2304g, oVar.f2304g);
        zArr[4] = c(this.f2305h, oVar.f2305h) | zArr[4];
    }

    void e(double[] dArr, int[] iArr) {
        float[] fArr = {this.f2301d, this.f2302e, this.f2303f, this.f2304g, this.f2305h, this.f2306i};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = fArr[i11];
                i10++;
            }
        }
    }

    void f(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f2302e;
        float fCos = this.f2303f;
        float f10 = this.f2304g;
        float f11 = this.f2305h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f12 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f12;
            } else if (i12 == 2) {
                fCos = f12;
            } else if (i12 == 3) {
                f10 = f12;
            } else if (i12 == 4) {
                f11 = f12;
            }
        }
        m mVar = this.f2311n;
        if (mVar != null) {
            float[] fArr2 = new float[2];
            mVar.i(d10, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d11 = f13;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (d12 * Math.cos(d13))) - ((double) (f11 / 2.0f)));
        }
        fArr[i10] = fSin + (f10 / 2.0f) + 0.0f;
        fArr[i10 + 1] = fCos + (f11 / 2.0f) + 0.0f;
    }

    void g(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float fSin = this.f2302e;
        float fCos = this.f2303f;
        float f11 = this.f2304g;
        float f12 = this.f2305h;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f17 = (float) dArr[i10];
            float f18 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f17;
                f13 = f18;
            } else if (i11 == 2) {
                fCos = f17;
                f15 = f18;
            } else if (i11 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i11 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = (f14 / 2.0f) + f13;
        float fCos2 = (f16 / 2.0f) + f15;
        m mVar = this.f2311n;
        if (mVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            mVar.i(d10, fArr3, fArr4);
            float f20 = fArr3[0];
            float f21 = fArr3[1];
            float f22 = fArr4[0];
            float f23 = fArr4[1];
            f10 = 2.0f;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) ((((double) f20) + (Math.sin(d12) * d11)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) f21) - (Math.cos(d12) * d11)) - ((double) (f12 / 2.0f)));
            double d13 = f13;
            double dSin = ((double) f22) + (Math.sin(d12) * d13);
            double d14 = f15;
            float fCos3 = (float) (dSin + (Math.cos(d12) * d14));
            fCos2 = (float) ((((double) f23) - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f19 = fCos3;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = fSin + (f11 / f10) + 0.0f;
        fArr[1] = fCos + (f12 / f10) + 0.0f;
        fArr2[0] = f19;
        fArr2[1] = fCos2;
    }

    int h(String str, double[] dArr, int i10) {
        androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f2312o.get(str);
        int i11 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.h() == 1) {
            dArr[i10] = aVar.e();
            return 1;
        }
        int iH = aVar.h();
        float[] fArr = new float[iH];
        aVar.f(fArr);
        while (i11 < iH) {
            dArr[i10] = fArr[i11];
            i11++;
            i10++;
        }
        return iH;
    }

    int i(String str) {
        androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f2312o.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.h();
    }

    void j(int[] iArr, double[] dArr, float[] fArr, int i10) {
        float f10 = this.f2302e;
        float fCos = this.f2303f;
        float f11 = this.f2304g;
        float f12 = this.f2305h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f13 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f10 = f13;
            } else if (i12 == 2) {
                fCos = f13;
            } else if (i12 == 3) {
                f11 = f13;
            } else if (i12 == 4) {
                f12 = f13;
            }
        }
        m mVar = this.f2311n;
        if (mVar != null) {
            float fJ = mVar.j();
            float fK = this.f2311n.k();
            double d10 = f10;
            double d11 = fCos;
            float fSin = (float) ((((double) fJ) + (Math.sin(d11) * d10)) - ((double) (f11 / 2.0f)));
            fCos = (float) ((((double) fK) - (d10 * Math.cos(d11))) - ((double) (f12 / 2.0f)));
            f10 = fSin;
        }
        float f14 = f11 + f10;
        float f15 = f12 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i10] = f10 + 0.0f;
        fArr[i10 + 1] = fCos + 0.0f;
        fArr[i10 + 2] = f14 + 0.0f;
        fArr[i10 + 3] = fCos + 0.0f;
        fArr[i10 + 4] = f14 + 0.0f;
        fArr[i10 + 5] = f15 + 0.0f;
        fArr[i10 + 6] = f10 + 0.0f;
        fArr[i10 + 7] = f15 + 0.0f;
    }

    boolean k(String str) {
        return this.f2312o.containsKey(str);
    }

    void l(h hVar, o oVar, o oVar2) {
        float f10 = hVar.f2144a / 100.0f;
        this.f2300c = f10;
        this.f2299b = hVar.f2192j;
        float f11 = Float.isNaN(hVar.f2193k) ? f10 : hVar.f2193k;
        float f12 = Float.isNaN(hVar.f2194l) ? f10 : hVar.f2194l;
        float f13 = oVar2.f2304g;
        float f14 = oVar.f2304g;
        float f15 = f13 - f14;
        float f16 = oVar2.f2305h;
        float f17 = oVar.f2305h;
        float f18 = f16 - f17;
        this.f2301d = this.f2300c;
        float f19 = oVar.f2302e;
        float f20 = (f14 / 2.0f) + f19;
        float f21 = oVar.f2303f;
        float f22 = f21 + (f17 / 2.0f);
        float f23 = f10;
        float f24 = oVar2.f2302e + (f13 / 2.0f);
        float f25 = oVar2.f2303f + (f16 / 2.0f);
        if (f20 > f24) {
            f20 = f24;
            f24 = f20;
        }
        if (f22 <= f25) {
            f22 = f25;
            f25 = f22;
        }
        float f26 = f24 - f20;
        float f27 = f22 - f25;
        float f28 = f15 * f11;
        float f29 = f28 / 2.0f;
        this.f2302e = (int) ((f19 + (f26 * f23)) - f29);
        float f30 = f18 * f12;
        float f31 = f30 / 2.0f;
        this.f2303f = (int) ((f21 + (f27 * f23)) - f31);
        this.f2304g = (int) (f14 + f28);
        this.f2305h = (int) (f17 + f30);
        float f32 = Float.isNaN(hVar.f2195m) ? f23 : hVar.f2195m;
        float f33 = Float.isNaN(hVar.f2198p) ? 0.0f : hVar.f2198p;
        if (!Float.isNaN(hVar.f2196n)) {
            f23 = hVar.f2196n;
        }
        float f34 = Float.isNaN(hVar.f2197o) ? 0.0f : hVar.f2197o;
        this.f2313p = 0;
        this.f2302e = (int) (((oVar.f2302e + (f32 * f26)) + (f34 * f27)) - f29);
        this.f2303f = (int) (((oVar.f2303f + (f26 * f33)) + (f27 * f23)) - f31);
        this.f2298a = v.c.c(hVar.f2190h);
        this.f2308k = hVar.f2191i;
    }

    void m(h hVar, o oVar, o oVar2) {
        float f10 = hVar.f2144a / 100.0f;
        this.f2300c = f10;
        this.f2299b = hVar.f2192j;
        float f11 = Float.isNaN(hVar.f2193k) ? f10 : hVar.f2193k;
        float f12 = Float.isNaN(hVar.f2194l) ? f10 : hVar.f2194l;
        float f13 = oVar2.f2304g;
        float f14 = oVar.f2304g;
        float f15 = oVar2.f2305h;
        float f16 = oVar.f2305h;
        this.f2301d = this.f2300c;
        float f17 = oVar.f2302e;
        float f18 = oVar.f2303f;
        float f19 = f10;
        float f20 = (oVar2.f2302e + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f21 = (oVar2.f2303f + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f22 = (f13 - f14) * f11;
        float f23 = f22 / 2.0f;
        this.f2302e = (int) ((f17 + (f20 * f19)) - f23);
        float f24 = (f15 - f16) * f12;
        float f25 = f24 / 2.0f;
        this.f2303f = (int) ((f18 + (f21 * f19)) - f25);
        this.f2304g = (int) (f14 + f22);
        this.f2305h = (int) (f16 + f24);
        float f26 = Float.isNaN(hVar.f2195m) ? f19 : hVar.f2195m;
        float f27 = Float.isNaN(hVar.f2198p) ? 0.0f : hVar.f2198p;
        if (!Float.isNaN(hVar.f2196n)) {
            f19 = hVar.f2196n;
        }
        float f28 = Float.isNaN(hVar.f2197o) ? 0.0f : hVar.f2197o;
        this.f2313p = 0;
        this.f2302e = (int) (((oVar.f2302e + (f26 * f20)) + (f28 * f21)) - f23);
        this.f2303f = (int) (((oVar.f2303f + (f20 * f27)) + (f21 * f19)) - f25);
        this.f2298a = v.c.c(hVar.f2190h);
        this.f2308k = hVar.f2191i;
    }

    void n(h hVar, o oVar, o oVar2) {
        float f10 = hVar.f2144a / 100.0f;
        this.f2300c = f10;
        this.f2299b = hVar.f2192j;
        float f11 = Float.isNaN(hVar.f2193k) ? f10 : hVar.f2193k;
        float f12 = Float.isNaN(hVar.f2194l) ? f10 : hVar.f2194l;
        float f13 = oVar2.f2304g - oVar.f2304g;
        float f14 = oVar2.f2305h - oVar.f2305h;
        this.f2301d = this.f2300c;
        if (!Float.isNaN(hVar.f2195m)) {
            f10 = hVar.f2195m;
        }
        float f15 = oVar.f2302e;
        float f16 = oVar.f2304g;
        float f17 = oVar.f2303f;
        float f18 = oVar.f2305h;
        float f19 = f10;
        float f20 = (oVar2.f2302e + (oVar2.f2304g / 2.0f)) - ((f16 / 2.0f) + f15);
        float f21 = (oVar2.f2303f + (oVar2.f2305h / 2.0f)) - ((f18 / 2.0f) + f17);
        float f22 = f20 * f19;
        float f23 = f13 * f11;
        float f24 = f23 / 2.0f;
        this.f2302e = (int) ((f15 + f22) - f24);
        float f25 = f21 * f19;
        float f26 = f14 * f12;
        float f27 = f26 / 2.0f;
        this.f2303f = (int) ((f17 + f25) - f27);
        this.f2304g = (int) (f16 + f23);
        this.f2305h = (int) (f18 + f26);
        float f28 = Float.isNaN(hVar.f2196n) ? 0.0f : hVar.f2196n;
        this.f2313p = 1;
        float f29 = (int) ((oVar.f2302e + f22) - f24);
        float f30 = (int) ((oVar.f2303f + f25) - f27);
        this.f2302e = f29 + ((-f21) * f28);
        this.f2303f = f30 + (f20 * f28);
        this.f2309l = this.f2309l;
        this.f2298a = v.c.c(hVar.f2190h);
        this.f2308k = hVar.f2191i;
    }

    void o(int i10, int i11, h hVar, o oVar, o oVar2) {
        float fMin;
        float f10;
        float f11 = hVar.f2144a / 100.0f;
        this.f2300c = f11;
        this.f2299b = hVar.f2192j;
        this.f2313p = hVar.f2199q;
        float f12 = Float.isNaN(hVar.f2193k) ? f11 : hVar.f2193k;
        float f13 = Float.isNaN(hVar.f2194l) ? f11 : hVar.f2194l;
        float f14 = oVar2.f2304g;
        float f15 = oVar.f2304g;
        float f16 = oVar2.f2305h;
        float f17 = oVar.f2305h;
        this.f2301d = this.f2300c;
        this.f2304g = (int) (f15 + ((f14 - f15) * f12));
        this.f2305h = (int) (f17 + ((f16 - f17) * f13));
        if (hVar.f2199q != 2) {
            float f18 = Float.isNaN(hVar.f2195m) ? f11 : hVar.f2195m;
            float f19 = oVar2.f2302e;
            float f20 = oVar.f2302e;
            this.f2302e = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(hVar.f2196n)) {
                f11 = hVar.f2196n;
            }
            float f21 = oVar2.f2303f;
            float f22 = oVar.f2303f;
            this.f2303f = (f11 * (f21 - f22)) + f22;
        } else {
            if (Float.isNaN(hVar.f2195m)) {
                float f23 = oVar2.f2302e;
                float f24 = oVar.f2302e;
                fMin = ((f23 - f24) * f11) + f24;
            } else {
                fMin = Math.min(f13, f12) * hVar.f2195m;
            }
            this.f2302e = fMin;
            if (Float.isNaN(hVar.f2196n)) {
                float f25 = oVar2.f2303f;
                float f26 = oVar.f2303f;
                f10 = (f11 * (f25 - f26)) + f26;
            } else {
                f10 = hVar.f2196n;
            }
            this.f2303f = f10;
        }
        this.f2309l = oVar.f2309l;
        this.f2298a = v.c.c(hVar.f2190h);
        this.f2308k = hVar.f2191i;
    }

    void p(int i10, int i11, h hVar, o oVar, o oVar2) {
        float f10 = hVar.f2144a / 100.0f;
        this.f2300c = f10;
        this.f2299b = hVar.f2192j;
        float f11 = Float.isNaN(hVar.f2193k) ? f10 : hVar.f2193k;
        float f12 = Float.isNaN(hVar.f2194l) ? f10 : hVar.f2194l;
        float f13 = oVar2.f2304g;
        float f14 = oVar.f2304g;
        float f15 = oVar2.f2305h;
        float f16 = oVar.f2305h;
        this.f2301d = this.f2300c;
        float f17 = oVar.f2302e;
        float f18 = oVar.f2303f;
        float f19 = oVar2.f2302e + (f13 / 2.0f);
        float f20 = oVar2.f2303f + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f2302e = (int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f));
        float f22 = (f15 - f16) * f12;
        this.f2303f = (int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f));
        this.f2304g = (int) (f14 + f21);
        this.f2305h = (int) (f16 + f22);
        this.f2313p = 2;
        if (!Float.isNaN(hVar.f2195m)) {
            this.f2302e = (int) (hVar.f2195m * (i10 - ((int) this.f2304g)));
        }
        if (!Float.isNaN(hVar.f2196n)) {
            this.f2303f = (int) (hVar.f2196n * (i11 - ((int) this.f2305h)));
        }
        this.f2309l = this.f2309l;
        this.f2298a = v.c.c(hVar.f2190h);
        this.f2308k = hVar.f2191i;
    }

    void q(float f10, float f11, float f12, float f13) {
        this.f2302e = f10;
        this.f2303f = f11;
        this.f2304g = f12;
        this.f2305h = f13;
    }

    void r(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f16 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void s(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        float fSin = this.f2302e;
        float fCos = this.f2303f;
        float f12 = this.f2304g;
        float f13 = this.f2305h;
        if (iArr.length != 0 && this.f2315r.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.f2315r = new double[i10];
            this.f2316s = new double[i10];
        }
        Arrays.fill(this.f2315r, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            double[] dArr4 = this.f2315r;
            int i12 = iArr[i11];
            dArr4[i12] = dArr[i11];
            this.f2316s[i12] = dArr2[i11];
        }
        float f14 = Float.NaN;
        int i13 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            double[] dArr5 = this.f2315r;
            if (i13 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f11 = f14;
            } else {
                double d10 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f2315r[i13])) {
                    d10 = this.f2315r[i13] + d10;
                }
                f11 = f14;
                float f19 = (float) d10;
                float f20 = (float) this.f2316s[i13];
                if (i13 == 1) {
                    f14 = f11;
                    f15 = f20;
                    fSin = f19;
                } else if (i13 == 2) {
                    f14 = f11;
                    f16 = f20;
                    fCos = f19;
                } else if (i13 == 3) {
                    f14 = f11;
                    f17 = f20;
                    f12 = f19;
                } else if (i13 == 4) {
                    f14 = f11;
                    f18 = f20;
                    f13 = f19;
                } else if (i13 == 5) {
                    f14 = f19;
                }
                i13++;
            }
            f14 = f11;
            i13++;
        }
        float f21 = f14;
        m mVar = this.f2311n;
        if (mVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            mVar.i(f10, fArr, fArr2);
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            double d11 = f22;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f12 / 2.0f)));
            fCos = (float) ((((double) f23) - (Math.cos(d13) * d12)) - ((double) (f13 / 2.0f)));
            double d14 = f24;
            double d15 = f15;
            double dSin = d14 + (Math.sin(d13) * d15);
            double dCos = Math.cos(d13) * d12;
            double d16 = f16;
            float f26 = (float) (dSin + (dCos * d16));
            float fCos2 = (float) ((((double) f25) - (d15 * Math.cos(d13))) + (Math.sin(d13) * d12 * d16));
            if (dArr2.length >= 2) {
                dArr2[0] = f26;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f21)) {
                view.setRotation((float) (((double) f21) + Math.toDegrees(Math.atan2(fCos2, f26))));
            }
        } else if (!Float.isNaN(f21)) {
            view.setRotation(f21 + ((float) Math.toDegrees(Math.atan2(f16 + (f18 / 2.0f), f15 + (f17 / 2.0f)))) + 0.0f);
        }
        if (view instanceof c) {
            ((c) view).a(fSin, fCos, f12 + fSin, f13 + fCos);
            return;
        }
        float f27 = fSin + 0.5f;
        int i14 = (int) f27;
        float f28 = fCos + 0.5f;
        int i15 = (int) f28;
        int i16 = (int) (f27 + f12);
        int i17 = (int) (f28 + f13);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight() || z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }

    public void t(m mVar, o oVar) {
        double d10 = ((this.f2302e + (this.f2304g / 2.0f)) - oVar.f2302e) - (oVar.f2304g / 2.0f);
        double d11 = ((this.f2303f + (this.f2305h / 2.0f)) - oVar.f2303f) - (oVar.f2305h / 2.0f);
        this.f2311n = mVar;
        this.f2302e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f2310m)) {
            this.f2303f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f2303f = (float) Math.toRadians(this.f2310m);
        }
    }

    o(int i10, int i11, h hVar, o oVar, o oVar2) {
        int i12 = d.f2143f;
        this.f2308k = i12;
        this.f2309l = i12;
        this.f2310m = Float.NaN;
        this.f2311n = null;
        this.f2312o = new LinkedHashMap();
        this.f2313p = 0;
        this.f2315r = new double[18];
        this.f2316s = new double[18];
        if (oVar.f2309l != d.f2143f) {
            o(i10, i11, hVar, oVar, oVar2);
            return;
        }
        int i13 = hVar.f2199q;
        if (i13 == 1) {
            n(hVar, oVar, oVar2);
            return;
        }
        if (i13 == 2) {
            p(i10, i11, hVar, oVar, oVar2);
        } else if (i13 != 3) {
            m(hVar, oVar, oVar2);
        } else {
            l(hVar, oVar, oVar2);
        }
    }
}
