package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class l implements Comparable {
    static String[] D = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2246c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private v.c f2263t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f2265v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f2266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f2267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f2268y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f2269z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f2244a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2245b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    LinkedHashMap f2247d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2248e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double[] f2249f = new double[18];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    double[] f2250g = new double[18];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f2251h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2252i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f2253j = 0.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f2254k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f2255l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f2256m = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2257n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2258o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f2259p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f2260q = 0.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f2261r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f2262s = 0.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2264u = 0;
    private float A = Float.NaN;
    private float B = Float.NaN;
    private int C = -1;

    l() {
    }

    private boolean e(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void a(HashMap map, int i10) {
        for (String str : map.keySet()) {
            z.d dVar = (z.d) map.get(str);
            if (dVar != null) {
                str.getClass();
                byte b10 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b10 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b10 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b10 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b10 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b10 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                            b10 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b10 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b10 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b10 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b10 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b10 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b10 = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b10 = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b10 = 13;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        dVar.c(i10, Float.isNaN(this.f2255l) ? 0.0f : this.f2255l);
                        break;
                    case 1:
                        dVar.c(i10, Float.isNaN(this.f2244a) ? 0.0f : this.f2244a);
                        break;
                    case 2:
                        dVar.c(i10, Float.isNaN(this.f2260q) ? 0.0f : this.f2260q);
                        break;
                    case 3:
                        dVar.c(i10, Float.isNaN(this.f2261r) ? 0.0f : this.f2261r);
                        break;
                    case 4:
                        dVar.c(i10, Float.isNaN(this.f2262s) ? 0.0f : this.f2262s);
                        break;
                    case 5:
                        dVar.c(i10, Float.isNaN(this.B) ? 0.0f : this.B);
                        break;
                    case 6:
                        dVar.c(i10, Float.isNaN(this.f2256m) ? 1.0f : this.f2256m);
                        break;
                    case 7:
                        dVar.c(i10, Float.isNaN(this.f2257n) ? 1.0f : this.f2257n);
                        break;
                    case 8:
                        dVar.c(i10, Float.isNaN(this.f2258o) ? 0.0f : this.f2258o);
                        break;
                    case 9:
                        dVar.c(i10, Float.isNaN(this.f2259p) ? 0.0f : this.f2259p);
                        break;
                    case 10:
                        dVar.c(i10, Float.isNaN(this.f2254k) ? 0.0f : this.f2254k);
                        break;
                    case 11:
                        dVar.c(i10, Float.isNaN(this.f2253j) ? 0.0f : this.f2253j);
                        break;
                    case 12:
                        dVar.c(i10, Float.isNaN(this.A) ? 0.0f : this.A);
                        break;
                    case 13:
                        dVar.c(i10, Float.isNaN(this.f2251h) ? 1.0f : this.f2251h);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            if (this.f2247d.containsKey(str2)) {
                                androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f2247d.get(str2);
                                if (dVar instanceof z.d.b) {
                                    ((z.d.b) dVar).i(i10, aVar);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + aVar.e() + dVar);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline " + str);
                        }
                        break;
                }
            }
        }
    }

    public void b(View view) {
        this.f2246c = view.getVisibility();
        this.f2251h = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f2252i = false;
        this.f2253j = view.getElevation();
        this.f2254k = view.getRotation();
        this.f2255l = view.getRotationX();
        this.f2244a = view.getRotationY();
        this.f2256m = view.getScaleX();
        this.f2257n = view.getScaleY();
        this.f2258o = view.getPivotX();
        this.f2259p = view.getPivotY();
        this.f2260q = view.getTranslationX();
        this.f2261r = view.getTranslationY();
        this.f2262s = view.getTranslationZ();
    }

    public void c(androidx.constraintlayout.widget.c.a aVar) {
        androidx.constraintlayout.widget.c.d dVar = aVar.f2692c;
        int i10 = dVar.f2771c;
        this.f2245b = i10;
        int i11 = dVar.f2770b;
        this.f2246c = i11;
        this.f2251h = (i11 == 0 || i10 != 0) ? dVar.f2772d : 0.0f;
        androidx.constraintlayout.widget.c.e eVar = aVar.f2695f;
        this.f2252i = eVar.f2787m;
        this.f2253j = eVar.f2788n;
        this.f2254k = eVar.f2776b;
        this.f2255l = eVar.f2777c;
        this.f2244a = eVar.f2778d;
        this.f2256m = eVar.f2779e;
        this.f2257n = eVar.f2780f;
        this.f2258o = eVar.f2781g;
        this.f2259p = eVar.f2782h;
        this.f2260q = eVar.f2784j;
        this.f2261r = eVar.f2785k;
        this.f2262s = eVar.f2786l;
        this.f2263t = v.c.c(aVar.f2693d.f2758d);
        androidx.constraintlayout.widget.c.C0026c c0026c = aVar.f2693d;
        this.A = c0026c.f2763i;
        this.f2264u = c0026c.f2760f;
        this.C = c0026c.f2756b;
        this.B = aVar.f2692c.f2773e;
        for (String str : aVar.f2696g.keySet()) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) aVar.f2696g.get(str);
            if (aVar2.g()) {
                this.f2247d.put(str, aVar2);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        return Float.compare(this.f2265v, lVar.f2265v);
    }

    void f(l lVar, HashSet hashSet) {
        if (e(this.f2251h, lVar.f2251h)) {
            hashSet.add("alpha");
        }
        if (e(this.f2253j, lVar.f2253j)) {
            hashSet.add("elevation");
        }
        int i10 = this.f2246c;
        int i11 = lVar.f2246c;
        if (i10 != i11 && this.f2245b == 0 && (i10 == 0 || i11 == 0)) {
            hashSet.add("alpha");
        }
        if (e(this.f2254k, lVar.f2254k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.A) || !Float.isNaN(lVar.A)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.B) || !Float.isNaN(lVar.B)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (e(this.f2255l, lVar.f2255l)) {
            hashSet.add("rotationX");
        }
        if (e(this.f2244a, lVar.f2244a)) {
            hashSet.add("rotationY");
        }
        if (e(this.f2258o, lVar.f2258o)) {
            hashSet.add("transformPivotX");
        }
        if (e(this.f2259p, lVar.f2259p)) {
            hashSet.add("transformPivotY");
        }
        if (e(this.f2256m, lVar.f2256m)) {
            hashSet.add("scaleX");
        }
        if (e(this.f2257n, lVar.f2257n)) {
            hashSet.add("scaleY");
        }
        if (e(this.f2260q, lVar.f2260q)) {
            hashSet.add("translationX");
        }
        if (e(this.f2261r, lVar.f2261r)) {
            hashSet.add("translationY");
        }
        if (e(this.f2262s, lVar.f2262s)) {
            hashSet.add("translationZ");
        }
    }

    void g(float f10, float f11, float f12, float f13) {
        this.f2266w = f10;
        this.f2267x = f11;
        this.f2268y = f12;
        this.f2269z = f13;
    }

    public void h(Rect rect, androidx.constraintlayout.widget.c cVar, int i10, int i11) {
        g(rect.left, rect.top, rect.width(), rect.height());
        c(cVar.y(i11));
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f10 = this.f2254k + 90.0f;
            this.f2254k = f10;
            if (f10 > 180.0f) {
                this.f2254k = f10 - 360.0f;
                return;
            }
            return;
        }
        this.f2254k -= 90.0f;
    }

    public void i(View view) {
        g(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}
