package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class m {
    private HashMap B;
    private HashMap C;
    private HashMap D;
    private k[] E;
    private int F;
    private int G;
    private View H;
    private int I;
    private float J;
    private Interpolator K;
    private boolean L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f2271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2272c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f2274e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v.b[] f2280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v.b f2281l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f2285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f2286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int[] f2287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private double[] f2288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double[] f2289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String[] f2290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[] f2291v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Rect f2270a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f2273d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2275f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o f2276g = new o();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o f2277h = new o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f2278i = new l();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private l f2279j = new l();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f2282m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f2283n = 0.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f2284o = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2292w = 4;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float[] f2293x = new float[4];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ArrayList f2294y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float[] f2295z = new float[1];
    private ArrayList A = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v.c f2296a;

        a(v.c cVar) {
            this.f2296a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f2296a.a(f10);
        }
    }

    m(View view) {
        int i10 = d.f2143f;
        this.F = i10;
        this.G = i10;
        this.H = null;
        this.I = i10;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        H(view);
    }

    private float g(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f2284o;
            if (f12 != 1.0d) {
                float f13 = this.f2283n;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        v.c cVar = this.f2276g.f2298a;
        ArrayList arrayList = this.f2294y;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o oVar = (o) obj;
            v.c cVar2 = oVar.f2298a;
            if (cVar2 != null) {
                float f15 = oVar.f2300c;
                if (f15 < f10) {
                    cVar = cVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = oVar.f2300c;
                }
            }
        }
        if (cVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) cVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) cVar.b(d10);
            }
        }
        return f10;
    }

    private static Interpolator p(Context context, int i10, String str, int i11) {
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, i11);
        }
        if (i10 == -1) {
            return new a(v.c.c(str));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float s() {
        float[] fArr = new float[2];
        float f10 = 1.0f / 99;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        float fHypot = 0.0f;
        while (i10 < 100) {
            float f11 = i10 * f10;
            double dA = f11;
            v.c cVar = this.f2276g.f2298a;
            ArrayList arrayList = this.f2294y;
            int size = arrayList.size();
            float f12 = Float.NaN;
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                o oVar = (o) obj;
                float f14 = f10;
                v.c cVar2 = oVar.f2298a;
                if (cVar2 != null) {
                    float f15 = oVar.f2300c;
                    if (f15 < f11) {
                        f13 = f15;
                        cVar = cVar2;
                    } else if (Float.isNaN(f12)) {
                        f12 = oVar.f2300c;
                    }
                }
                f10 = f14;
            }
            float f16 = f10;
            if (cVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                float f17 = f12 - f13;
                dA = (((float) cVar.a((f11 - f13) / f17)) * f17) + f13;
            }
            double d12 = dA;
            this.f2280k[0].d(d12, this.f2288s);
            int i12 = i10;
            this.f2276g.f(d12, this.f2287r, this.f2288s, fArr, 0);
            if (i12 > 0) {
                fHypot += (float) Math.hypot(d11 - ((double) fArr[1]), d10 - ((double) fArr[0]));
            }
            d10 = fArr[0];
            d11 = fArr[1];
            i10 = i12 + 1;
            f10 = f16;
        }
        return fHypot;
    }

    private void w(o oVar) {
        int iBinarySearch = Collections.binarySearch(this.f2294y, oVar);
        if (iBinarySearch == 0) {
            Log.e("MotionController", " KeyPath position \"" + oVar.f2301d + "\" outside of range");
        }
        this.f2294y.add((-iBinarySearch) - 1, oVar);
    }

    private void y(o oVar) {
        oVar.q((int) this.f2271b.getX(), (int) this.f2271b.getY(), this.f2271b.getWidth(), this.f2271b.getHeight());
    }

    void A(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((i13 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((i15 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = i11 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i16 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void B(View view) {
        o oVar = this.f2276g;
        oVar.f2300c = 0.0f;
        oVar.f2301d = 0.0f;
        this.L = true;
        oVar.q(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f2277h.q(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f2278i.i(view);
        this.f2279j.i(view);
    }

    void C(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        m mVar;
        int i12 = cVar.f2686e;
        if (i12 != 0) {
            mVar = this;
            mVar.A(rect, this.f2270a, i12, i10, i11);
            rect = mVar.f2270a;
        } else {
            mVar = this;
        }
        o oVar = mVar.f2277h;
        oVar.f2300c = 1.0f;
        oVar.f2301d = 1.0f;
        y(oVar);
        mVar.f2277h.q(rect.left, rect.top, rect.width(), rect.height());
        mVar.f2277h.a(cVar.y(mVar.f2272c));
        mVar.f2279j.h(rect, cVar, i12, mVar.f2272c);
    }

    public void D(int i10) {
        this.F = i10;
    }

    void E(View view) {
        o oVar = this.f2276g;
        oVar.f2300c = 0.0f;
        oVar.f2301d = 0.0f;
        oVar.q(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.f2278i.i(view);
    }

    void F(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        m mVar;
        Rect rect2;
        int i12 = cVar.f2686e;
        if (i12 != 0) {
            mVar = this;
            rect2 = rect;
            mVar.A(rect2, this.f2270a, i12, i10, i11);
        } else {
            mVar = this;
            rect2 = rect;
        }
        o oVar = mVar.f2276g;
        oVar.f2300c = 0.0f;
        oVar.f2301d = 0.0f;
        y(oVar);
        mVar.f2276g.q(rect2.left, rect2.top, rect2.width(), rect2.height());
        androidx.constraintlayout.widget.c.a aVarY = cVar.y(mVar.f2272c);
        mVar.f2276g.a(aVarY);
        mVar.f2282m = aVarY.f2693d.f2761g;
        mVar.f2278i.h(rect2, cVar, i12, mVar.f2272c);
        mVar.G = aVarY.f2695f.f2783i;
        androidx.constraintlayout.widget.c.C0026c c0026c = aVarY.f2693d;
        mVar.I = c0026c.f2765k;
        mVar.J = c0026c.f2764j;
        Context context = mVar.f2271b.getContext();
        androidx.constraintlayout.widget.c.C0026c c0026c2 = aVarY.f2693d;
        mVar.K = p(context, c0026c2.f2767m, c0026c2.f2766l, c0026c2.f2768n);
    }

    public void G(z.e eVar, View view, int i10, int i11, int i12) {
        o oVar = this.f2276g;
        oVar.f2300c = 0.0f;
        oVar.f2301d = 0.0f;
        Rect rect = new Rect();
        if (i10 == 1 || i10 == 2) {
            throw null;
        }
        this.f2276g.q(rect.left, rect.top, rect.width(), rect.height());
        throw null;
    }

    public void H(View view) {
        this.f2271b = view;
        this.f2272c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.f2274e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        int i12;
        String[] strArr;
        int i13;
        androidx.constraintlayout.widget.a aVar;
        z.f fVarH;
        androidx.constraintlayout.widget.a aVar2;
        Integer num;
        int i14;
        z.d dVarG;
        androidx.constraintlayout.widget.a aVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        HashSet<String> hashSet3 = new HashSet();
        HashMap map = new HashMap();
        int i15 = this.F;
        if (i15 != d.f2143f) {
            this.f2276g.f2308k = i15;
        }
        this.f2278i.f(this.f2279j, hashSet2);
        ArrayList arrayList2 = this.A;
        int i16 = 0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i17 = 0;
            arrayList = null;
            while (i17 < size) {
                Object obj = arrayList2.get(i17);
                i17++;
                d dVar = (d) obj;
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    w(new o(i10, i11, hVar, this.f2276g, this.f2277h));
                    int i18 = hVar.f2203g;
                    if (i18 != d.f2143f) {
                        this.f2275f = i18;
                    }
                } else if (dVar instanceof f) {
                    dVar.d(hashSet3);
                } else if (dVar instanceof j) {
                    dVar.d(hashSet);
                } else if (dVar instanceof k) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((k) dVar);
                } else {
                    dVar.h(map);
                    dVar.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.E = (k[]) arrayList.toArray(new k[0]);
        }
        int i19 = 1;
        if (hashSet2.isEmpty()) {
            i12 = 1;
        } else {
            this.C = new HashMap();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[i19];
                    ArrayList arrayList3 = this.A;
                    int size2 = arrayList3.size();
                    int i20 = i16;
                    while (i20 < size2) {
                        Object obj2 = arrayList3.get(i20);
                        i20++;
                        int i21 = i19;
                        d dVar2 = (d) obj2;
                        HashMap map2 = dVar2.f2148e;
                        if (map2 != null && (aVar3 = (androidx.constraintlayout.widget.a) map2.get(str2)) != null) {
                            sparseArray.append(dVar2.f2144a, aVar3);
                        }
                        i19 = i21;
                    }
                    i14 = i19;
                    dVarG = z.d.f(str, sparseArray);
                } else {
                    i14 = i19;
                    dVarG = z.d.g(str);
                }
                if (dVarG != null) {
                    dVarG.d(str);
                    this.C.put(str, dVarG);
                }
                i19 = i14;
                i16 = 0;
            }
            i12 = i19;
            ArrayList arrayList4 = this.A;
            if (arrayList4 != null) {
                int size3 = arrayList4.size();
                int i22 = 0;
                while (i22 < size3) {
                    Object obj3 = arrayList4.get(i22);
                    i22++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof e) {
                        dVar3.a(this.C);
                    }
                }
            }
            this.f2278i.a(this.C, 0);
            this.f2279j.a(this.C, 100);
            for (String str3 : this.C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = (Integer) map.get(str3)) == null) ? 0 : num.intValue();
                v.j jVar = (v.j) this.C.get(str3);
                if (jVar != null) {
                    jVar.e(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap();
            }
            for (String str4 : hashSet) {
                if (!this.B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[i12];
                        ArrayList arrayList5 = this.A;
                        int size4 = arrayList5.size();
                        int i23 = 0;
                        while (i23 < size4) {
                            Object obj4 = arrayList5.get(i23);
                            i23++;
                            d dVar4 = (d) obj4;
                            HashMap map3 = dVar4.f2148e;
                            if (map3 != null && (aVar2 = (androidx.constraintlayout.widget.a) map3.get(str5)) != null) {
                                sparseArray2.append(dVar4.f2144a, aVar2);
                            }
                        }
                        fVarH = z.f.g(str4, sparseArray2);
                    } else {
                        fVarH = z.f.h(str4, j10);
                    }
                    if (fVarH != null) {
                        fVarH.d(str4);
                        this.B.put(str4, fVarH);
                    }
                }
            }
            ArrayList arrayList6 = this.A;
            if (arrayList6 != null) {
                int size5 = arrayList6.size();
                int i24 = 0;
                while (i24 < size5) {
                    Object obj5 = arrayList6.get(i24);
                    i24++;
                    d dVar5 = (d) obj5;
                    if (dVar5 instanceof j) {
                        ((j) dVar5).U(this.B);
                    }
                }
            }
            for (String str6 : this.B.keySet()) {
                ((z.f) this.B.get(str6)).e(map.containsKey(str6) ? ((Integer) map.get(str6)).intValue() : 0);
            }
        }
        int size6 = this.f2294y.size();
        int i25 = size6 + 2;
        o[] oVarArr = new o[i25];
        oVarArr[0] = this.f2276g;
        oVarArr[size6 + 1] = this.f2277h;
        if (this.f2294y.size() > 0 && this.f2275f == -1) {
            this.f2275f = 0;
        }
        ArrayList arrayList7 = this.f2294y;
        int size7 = arrayList7.size();
        int i26 = i12;
        int i27 = 0;
        while (i27 < size7) {
            Object obj6 = arrayList7.get(i27);
            i27++;
            oVarArr[i26] = (o) obj6;
            i26++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f2277h.f2312o.keySet()) {
            if (this.f2276g.f2312o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f2290u = strArr2;
        this.f2291v = new int[strArr2.length];
        int i28 = 0;
        while (true) {
            strArr = this.f2290u;
            if (i28 >= strArr.length) {
                break;
            }
            String str8 = strArr[i28];
            this.f2291v[i28] = 0;
            for (int i29 = 0; i29 < i25; i29++) {
                if (oVarArr[i29].f2312o.containsKey(str8) && (aVar = (androidx.constraintlayout.widget.a) oVarArr[i29].f2312o.get(str8)) != null) {
                    int[] iArr = this.f2291v;
                    iArr[i28] = iArr[i28] + aVar.h();
                    break;
                }
            }
            i28++;
        }
        boolean z10 = oVarArr[0].f2308k != d.f2143f ? i12 : 0;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i30 = i12; i30 < i25; i30++) {
            oVarArr[i30].d(oVarArr[i30 - 1], zArr, this.f2290u, z10);
        }
        int i31 = 0;
        for (int i32 = i12; i32 < length; i32++) {
            if (zArr[i32]) {
                i31++;
            }
        }
        this.f2287r = new int[i31];
        int i33 = 2;
        int iMax = Math.max(2, i31);
        this.f2288s = new double[iMax];
        this.f2289t = new double[iMax];
        int i34 = 0;
        for (int i35 = i12; i35 < length; i35++) {
            if (zArr[i35]) {
                this.f2287r[i34] = i35;
                i34++;
            }
        }
        int[] iArr2 = new int[2];
        iArr2[i12] = this.f2287r.length;
        iArr2[0] = i25;
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i25];
        for (int i36 = 0; i36 < i25; i36++) {
            oVarArr[i36].e(dArr[i36], this.f2287r);
            dArr2[i36] = oVarArr[i36].f2300c;
        }
        int i37 = 0;
        while (true) {
            int[] iArr3 = this.f2287r;
            if (i37 >= iArr3.length) {
                break;
            }
            if (iArr3[i37] < o.f2297t.length) {
                String str9 = o.f2297t[this.f2287r[i37]] + " [";
                for (int i38 = 0; i38 < i25; i38++) {
                    str9 = str9 + dArr[i38][i37];
                }
            }
            i37++;
        }
        this.f2280k = new v.b[this.f2290u.length + 1];
        int i39 = 0;
        while (true) {
            String[] strArr3 = this.f2290u;
            if (i39 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i39];
            int i40 = 0;
            int i41 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i40 < i25) {
                if (oVarArr[i40].k(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i25];
                        int[] iArr4 = new int[i33];
                        iArr4[i12] = oVarArr[i40].i(str10);
                        i13 = 0;
                        iArr4[0] = i25;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    } else {
                        i13 = 0;
                    }
                    o oVar = oVarArr[i40];
                    dArr3[i41] = oVar.f2300c;
                    oVar.h(str10, dArr4[i41], i13);
                    i41++;
                }
                i40++;
                i39 = i39;
                i33 = 2;
            }
            int i42 = i39 + 1;
            this.f2280k[i42] = v.b.a(this.f2275f, Arrays.copyOf(dArr3, i41), (double[][]) Arrays.copyOf(dArr4, i41));
            i39 = i42;
            i33 = 2;
        }
        int i43 = 0;
        this.f2280k[0] = v.b.a(this.f2275f, dArr2, dArr);
        if (oVarArr[0].f2308k != d.f2143f) {
            int[] iArr5 = new int[i25];
            double[] dArr5 = new double[i25];
            int[] iArr6 = new int[2];
            iArr6[i12] = 2;
            iArr6[0] = i25;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i44 = 0; i44 < i25; i44++) {
                o oVar2 = oVarArr[i44];
                iArr5[i44] = oVar2.f2308k;
                dArr5[i44] = oVar2.f2300c;
                double[] dArr7 = dArr6[i44];
                dArr7[0] = oVar2.f2302e;
                dArr7[i12] = oVar2.f2303f;
            }
            i43 = 0;
            this.f2281l = v.b.b(iArr5, dArr5, dArr6);
        }
        this.D = new HashMap();
        if (this.A != null) {
            float fS = Float.NaN;
            for (String str11 : hashSet3) {
                z.c cVarI = z.c.i(str11);
                if (cVarI != null) {
                    if (cVarI.h() && Float.isNaN(fS)) {
                        fS = s();
                    }
                    cVarI.f(str11);
                    this.D.put(str11, cVarI);
                }
            }
            ArrayList arrayList8 = this.A;
            int size8 = arrayList8.size();
            int i45 = i43;
            while (i45 < size8) {
                Object obj7 = arrayList8.get(i45);
                i45++;
                d dVar6 = (d) obj7;
                if (dVar6 instanceof f) {
                    ((f) dVar6).Y(this.D);
                }
            }
            Iterator it = this.D.values().iterator();
            while (it.hasNext()) {
                ((z.c) it.next()).g(fS);
            }
        }
    }

    public void J(m mVar) {
        this.f2276g.t(mVar, mVar.f2276g);
        this.f2277h.t(mVar, mVar.f2277h);
    }

    public void a(d dVar) {
        this.A.add(dVar);
    }

    void b(ArrayList arrayList) {
        this.A.addAll(arrayList);
    }

    int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrH = this.f2280k[0].h();
        if (iArr != null) {
            ArrayList arrayList = this.f2294y;
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                iArr[i10] = ((o) obj).f2313p;
                i10++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < dArrH.length; i13++) {
            this.f2280k[0].d(dArrH[i13], this.f2288s);
            this.f2276g.f(dArrH[i13], this.f2287r, this.f2288s, fArr, i12);
            i12 += 2;
        }
        return i12 / 2;
    }

    void d(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / (i11 - 1);
        HashMap map = this.C;
        v.j jVar = map == null ? null : (v.j) map.get("translationX");
        HashMap map2 = this.C;
        v.j jVar2 = map2 == null ? null : (v.j) map2.get("translationY");
        HashMap map3 = this.D;
        z.c cVar = map3 == null ? null : (z.c) map3.get("translationX");
        HashMap map4 = this.D;
        z.c cVar2 = map4 != null ? (z.c) map4.get("translationY") : null;
        int i12 = 0;
        while (i12 < i11) {
            float fMin = i12 * f11;
            float f12 = this.f2284o;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f2283n;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double dA = fMin;
            v.c cVar3 = this.f2276g.f2298a;
            ArrayList arrayList = this.f2294y;
            int size = arrayList.size();
            float f15 = Float.NaN;
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                o oVar = (o) obj;
                float f16 = f11;
                v.c cVar4 = oVar.f2298a;
                if (cVar4 != null) {
                    float f17 = oVar.f2300c;
                    if (f17 < fMin) {
                        f13 = f17;
                        cVar3 = cVar4;
                    } else if (Float.isNaN(f15)) {
                        f15 = oVar.f2300c;
                    }
                }
                f11 = f16;
            }
            float f18 = f11;
            if (cVar3 != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                float f19 = f15 - f13;
                dA = (((float) cVar3.a((fMin - f13) / f19)) * f19) + f13;
            }
            this.f2280k[0].d(dA, this.f2288s);
            v.b bVar = this.f2281l;
            if (bVar != null) {
                double[] dArr = this.f2288s;
                if (dArr.length > 0) {
                    bVar.d(dA, dArr);
                }
            }
            int i14 = i12 * 2;
            this.f2276g.f(dA, this.f2287r, this.f2288s, fArr, i14);
            if (cVar != null) {
                fArr[i14] = fArr[i14] + cVar.a(fMin);
            } else if (jVar != null) {
                fArr[i14] = fArr[i14] + jVar.a(fMin);
            }
            if (cVar2 != null) {
                int i15 = i14 + 1;
                fArr[i15] = fArr[i15] + cVar2.a(fMin);
            } else if (jVar2 != null) {
                int i16 = i14 + 1;
                fArr[i16] = fArr[i16] + jVar2.a(fMin);
            }
            i12++;
            i11 = i10;
            f11 = f18;
            f10 = 1.0f;
        }
    }

    void e(float f10, float[] fArr, int i10) {
        this.f2280k[0].d(g(f10, null), this.f2288s);
        this.f2276g.j(this.f2287r, this.f2288s, fArr, i10);
    }

    void f(boolean z10) {
        if (!"button".equals(androidx.constraintlayout.motion.widget.a.d(this.f2271b)) || this.E == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            k[] kVarArr = this.E;
            if (i10 >= kVarArr.length) {
                return;
            }
            kVarArr[i10].y(z10 ? -100.0f : 100.0f, this.f2271b);
            i10++;
        }
    }

    public int h() {
        return this.f2276g.f2309l;
    }

    public void i(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f2280k[0].d(d10, dArr);
        this.f2280k[0].g(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f2276g.g(d10, this.f2287r, dArr, fArr, dArr2, fArr2);
    }

    public float j() {
        return this.f2285p;
    }

    public float k() {
        return this.f2286q;
    }

    void l(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float fG = g(f10, this.f2295z);
        v.b[] bVarArr = this.f2280k;
        int i10 = 0;
        if (bVarArr == null) {
            o oVar = this.f2277h;
            float f13 = oVar.f2302e;
            o oVar2 = this.f2276g;
            float f14 = f13 - oVar2.f2302e;
            float f15 = oVar.f2303f - oVar2.f2303f;
            float f16 = (oVar.f2304g - oVar2.f2304g) + f14;
            float f17 = (oVar.f2305h - oVar2.f2305h) + f15;
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            return;
        }
        double d10 = fG;
        bVarArr[0].g(d10, this.f2289t);
        this.f2280k[0].d(d10, this.f2288s);
        float f18 = this.f2295z[0];
        while (true) {
            dArr = this.f2289t;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * ((double) f18);
            i10++;
        }
        v.b bVar = this.f2281l;
        if (bVar == null) {
            this.f2276g.r(f11, f12, fArr, this.f2287r, dArr, this.f2288s);
            return;
        }
        double[] dArr2 = this.f2288s;
        if (dArr2.length > 0) {
            bVar.d(d10, dArr2);
            this.f2281l.g(d10, this.f2289t);
            this.f2276g.r(f11, f12, fArr, this.f2287r, this.f2289t, this.f2288s);
        }
    }

    public int m() {
        int iMax = this.f2276g.f2299b;
        ArrayList arrayList = this.f2294y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iMax = Math.max(iMax, ((o) obj).f2299b);
        }
        return Math.max(iMax, this.f2277h.f2299b);
    }

    public float n() {
        return this.f2277h.f2302e;
    }

    public float o() {
        return this.f2277h.f2303f;
    }

    o q(int i10) {
        return (o) this.f2294y.get(i10);
    }

    void r(float f10, int i10, int i11, float f11, float f12, float[] fArr) {
        float fG = g(f10, this.f2295z);
        HashMap map = this.C;
        v.j jVar = map == null ? null : (v.j) map.get("translationX");
        HashMap map2 = this.C;
        v.j jVar2 = map2 == null ? null : (v.j) map2.get("translationY");
        HashMap map3 = this.C;
        v.j jVar3 = map3 == null ? null : (v.j) map3.get("rotation");
        HashMap map4 = this.C;
        v.j jVar4 = map4 == null ? null : (v.j) map4.get("scaleX");
        HashMap map5 = this.C;
        v.j jVar5 = map5 == null ? null : (v.j) map5.get("scaleY");
        HashMap map6 = this.D;
        z.c cVar = map6 == null ? null : (z.c) map6.get("translationX");
        HashMap map7 = this.D;
        z.c cVar2 = map7 == null ? null : (z.c) map7.get("translationY");
        HashMap map8 = this.D;
        z.c cVar3 = map8 == null ? null : (z.c) map8.get("rotation");
        HashMap map9 = this.D;
        z.c cVar4 = map9 == null ? null : (z.c) map9.get("scaleX");
        HashMap map10 = this.D;
        z.c cVar5 = map10 != null ? (z.c) map10.get("scaleY") : null;
        v.p pVar = new v.p();
        pVar.b();
        pVar.d(jVar3, fG);
        pVar.h(jVar, jVar2, fG);
        pVar.f(jVar4, jVar5, fG);
        pVar.c(cVar3, fG);
        pVar.g(cVar, cVar2, fG);
        pVar.e(cVar4, cVar5, fG);
        v.b bVar = this.f2281l;
        if (bVar != null) {
            double[] dArr = this.f2288s;
            if (dArr.length > 0) {
                double d10 = fG;
                bVar.d(d10, dArr);
                this.f2281l.g(d10, this.f2289t);
                this.f2276g.r(f11, f12, fArr, this.f2287r, this.f2289t, this.f2288s);
            }
            pVar.a(f11, f12, i10, i11, fArr);
            return;
        }
        int i12 = 0;
        if (this.f2280k == null) {
            o oVar = this.f2277h;
            float f13 = oVar.f2302e;
            o oVar2 = this.f2276g;
            float f14 = f13 - oVar2.f2302e;
            float f15 = oVar.f2303f - oVar2.f2303f;
            float f16 = (oVar.f2304g - oVar2.f2304g) + f14;
            float f17 = f15 + (oVar.f2305h - oVar2.f2305h);
            fArr[0] = (f14 * (1.0f - f11)) + (f16 * f11);
            fArr[1] = (f15 * (1.0f - f12)) + (f17 * f12);
            pVar.b();
            pVar.d(jVar3, fG);
            pVar.h(jVar, jVar2, fG);
            pVar.f(jVar4, jVar5, fG);
            pVar.c(cVar3, fG);
            pVar.g(cVar, cVar2, fG);
            pVar.e(cVar4, cVar5, fG);
            pVar.a(f11, f12, i10, i11, fArr);
            return;
        }
        double dG = g(fG, this.f2295z);
        this.f2280k[0].g(dG, this.f2289t);
        this.f2280k[0].d(dG, this.f2288s);
        float f18 = this.f2295z[0];
        while (true) {
            double[] dArr2 = this.f2289t;
            if (i12 >= dArr2.length) {
                this.f2276g.r(f11, f12, fArr, this.f2287r, dArr2, this.f2288s);
                pVar.a(f11, f12, i10, i11, fArr);
                return;
            } else {
                dArr2[i12] = dArr2[i12] * ((double) f18);
                i12++;
            }
        }
    }

    public float t() {
        return this.f2276g.f2302e;
    }

    public String toString() {
        return " start: x: " + this.f2276g.f2302e + " y: " + this.f2276g.f2303f + " end: x: " + this.f2277h.f2302e + " y: " + this.f2277h.f2303f;
    }

    public float u() {
        return this.f2276g.f2303f;
    }

    public View v() {
        return this.f2271b;
    }

    boolean x(View view, float f10, long j10, v.d dVar) {
        z.f.d dVar2;
        boolean zJ;
        View view2;
        View view3;
        float f11;
        double d10;
        View view4 = view;
        float fG = g(f10, null);
        int i10 = this.I;
        if (i10 != d.f2143f) {
            float f12 = 1.0f / i10;
            float fFloor = ((float) Math.floor(fG / f12)) * f12;
            float f13 = (fG % f12) / f12;
            if (!Float.isNaN(this.J)) {
                f13 = (f13 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            fG = ((interpolator != null ? interpolator.getInterpolation(f13) : ((double) f13) > 0.5d ? 1.0f : 0.0f) * f12) + fFloor;
        }
        HashMap map = this.C;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((z.d) it.next()).h(view4, fG);
            }
        }
        HashMap map2 = this.B;
        if (map2 != null) {
            z.f.d dVar3 = null;
            boolean zI = false;
            for (z.f fVar : map2.values()) {
                if (fVar instanceof z.f.d) {
                    dVar3 = (z.f.d) fVar;
                } else {
                    zI |= fVar.i(view4, fG, j10, dVar);
                    view4 = view;
                }
            }
            zJ = zI;
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            zJ = false;
        }
        v.b[] bVarArr = this.f2280k;
        if (bVarArr != null) {
            double d11 = fG;
            bVarArr[0].d(d11, this.f2288s);
            this.f2280k[0].g(d11, this.f2289t);
            v.b bVar = this.f2281l;
            if (bVar != null) {
                double[] dArr = this.f2288s;
                if (dArr.length > 0) {
                    bVar.d(d11, dArr);
                    this.f2281l.g(d11, this.f2289t);
                }
            }
            if (this.L) {
                view3 = view;
                f11 = 0.0f;
                d10 = d11;
            } else {
                float f14 = fG;
                d10 = d11;
                f11 = 0.0f;
                this.f2276g.s(f14, view, this.f2287r, this.f2288s, this.f2289t, null, this.f2273d);
                fG = f14;
                view3 = view;
                this.f2273d = false;
            }
            if (this.G != d.f2143f) {
                if (this.H == null) {
                    this.H = ((View) view3.getParent()).findViewById(this.G);
                }
                View view5 = this.H;
                if (view5 != null) {
                    float top = (view5.getTop() + this.H.getBottom()) / 2.0f;
                    float left = (this.H.getLeft() + this.H.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        float left2 = left - view3.getLeft();
                        float top2 = top - view3.getTop();
                        view3.setPivotX(left2);
                        view3.setPivotY(top2);
                    }
                }
            }
            HashMap map3 = this.C;
            if (map3 != null) {
                for (v.j jVar : map3.values()) {
                    if (jVar instanceof z.d.C0887d) {
                        double[] dArr2 = this.f2289t;
                        if (dArr2.length > 1) {
                            ((z.d.C0887d) jVar).i(view3, fG, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (dVar2 != null) {
                double[] dArr3 = this.f2289t;
                view2 = view;
                float f15 = fG;
                fG = f15;
                zJ |= dVar2.j(view2, dVar, f15, j10, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i11 = 1;
            while (true) {
                v.b[] bVarArr2 = this.f2280k;
                if (i11 >= bVarArr2.length) {
                    break;
                }
                bVarArr2[i11].e(d10, this.f2293x);
                z.a.b((androidx.constraintlayout.widget.a) this.f2276g.f2312o.get(this.f2290u[i11 - 1]), view2, this.f2293x);
                i11++;
            }
            l lVar = this.f2278i;
            if (lVar.f2245b == 0) {
                if (fG <= f11) {
                    view2.setVisibility(lVar.f2246c);
                } else if (fG >= 1065353216) {
                    view2.setVisibility(this.f2279j.f2246c);
                } else if (this.f2279j.f2246c != lVar.f2246c) {
                    view2.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i12 = 0;
                while (true) {
                    k[] kVarArr = this.E;
                    if (i12 >= kVarArr.length) {
                        break;
                    }
                    kVarArr[i12].y(fG, view2);
                    i12++;
                }
            }
        } else {
            view2 = view;
            o oVar = this.f2276g;
            float f16 = oVar.f2302e;
            o oVar2 = this.f2277h;
            float f17 = f16 + ((oVar2.f2302e - f16) * fG);
            float f18 = oVar.f2303f;
            float f19 = f18 + ((oVar2.f2303f - f18) * fG);
            float f20 = oVar.f2304g;
            float f21 = oVar2.f2304g;
            float f22 = oVar.f2305h;
            float f23 = oVar2.f2305h;
            float f24 = f17 + 0.5f;
            int i13 = (int) f24;
            float f25 = f19 + 0.5f;
            int i14 = (int) f25;
            int i15 = (int) (f24 + ((f21 - f20) * fG) + f20);
            int i16 = (int) (f25 + ((f23 - f22) * fG) + f22);
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            if (f21 != f20 || f23 != f22 || this.f2273d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                this.f2273d = false;
            }
            view2.layout(i13, i14, i15, i16);
        }
        HashMap map4 = this.D;
        if (map4 != null) {
            for (z.c cVar : map4.values()) {
                if (cVar instanceof z.c.d) {
                    double[] dArr4 = this.f2289t;
                    ((z.c.d) cVar).k(view2, fG, dArr4[0], dArr4[1]);
                } else {
                    cVar.j(view2, fG);
                }
            }
        }
        return zJ;
    }

    public void z() {
        this.f2273d = true;
    }
}
