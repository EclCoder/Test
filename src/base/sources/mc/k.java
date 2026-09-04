package mc;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l1.c f45625a = new l1.c(0.15f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l1.c f45626b = new l1.c(0.2f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final l1.c f45627c = new l1.c(0.3f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l1.c f45628d = new l1.c(0.5f, 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l1.c f45629e = new l1.c(1.0f, 0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l1.u f45630f = P(i(), true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l1.u f45631g = P(K(), true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l1.u f45632h = P(H(), true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l1.u f45633i = P(d(), true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l1.u f45634j = P(s(), true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l1.u f45635k = P(e(), true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l1.u f45636l = P(G(), true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l1.u f45637m = P(z(-45.0f), true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l1.u f45638n = P(B(), true);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l1.u f45639o = P(N(-90.0f), true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l1.u f45640p = P(r(), true);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l1.u f45641q = P(j(), true);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l1.u f45642r = P(A(), true);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l1.u f45643s = P(v(-90.0f), true);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l1.u f45644t = P(L(), true);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l1.u f45645u = P(O(), true);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l1.u f45646v = P(n(), true);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l1.u f45647w = P(o(), true);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l1.u f45648x = P(p(), true);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final l1.u f45649y = P(q(), true);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final l1.u f45650z = P(m(), true);
    public static final l1.u A = P(w(), true);
    public static final l1.u B = P(k(), true);
    public static final l1.u C = P(l(), true);
    public static final l1.u D = P(h(), true);
    public static final l1.u E = P(J(), true);
    public static final l1.u F = P(f(), true);
    public static final l1.u G = P(I(), true);
    public static final l1.u H = P(t(), true);
    public static final l1.u I = P(E(), true);
    public static final l1.u J = P(F(), true);
    public static final l1.u K = P(C(), true);
    public static final l1.u L = P(D(), true);
    public static final l1.u M = P(g(), true);
    public static final l1.u N = P(x(), true);

    private static l1.u A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, -0.009f), new l1.c(0.172f, 0.0f)));
        return c(arrayList, 5, 0.5f, 0.5f, false);
    }

    private static l1.u B() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.961f, 0.039f), new l1.c(0.426f, 0.0f)));
        arrayList.add(new b(new PointF(1.001f, 0.428f)));
        arrayList.add(new b(new PointF(1.0f, 0.609f), f45629e));
        return c(arrayList, 2, 0.5f, 0.5f, true);
    }

    private static l1.u C() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.0f)));
        arrayList.add(new b(new PointF(0.704f, 0.0f)));
        arrayList.add(new b(new PointF(0.704f, 0.065f)));
        arrayList.add(new b(new PointF(0.843f, 0.065f)));
        arrayList.add(new b(new PointF(0.843f, 0.148f)));
        arrayList.add(new b(new PointF(0.926f, 0.148f)));
        arrayList.add(new b(new PointF(0.926f, 0.296f)));
        arrayList.add(new b(new PointF(1.0f, 0.296f)));
        return c(arrayList, 2, 0.5f, 0.5f, true);
    }

    private static l1.u D() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.11f, 0.5f)));
        arrayList.add(new b(new PointF(0.113f, 0.0f)));
        arrayList.add(new b(new PointF(0.287f, 0.0f)));
        arrayList.add(new b(new PointF(0.287f, 0.087f)));
        arrayList.add(new b(new PointF(0.421f, 0.087f)));
        arrayList.add(new b(new PointF(0.421f, 0.17f)));
        arrayList.add(new b(new PointF(0.56f, 0.17f)));
        arrayList.add(new b(new PointF(0.56f, 0.265f)));
        arrayList.add(new b(new PointF(0.674f, 0.265f)));
        arrayList.add(new b(new PointF(0.675f, 0.344f)));
        arrayList.add(new b(new PointF(0.789f, 0.344f)));
        arrayList.add(new b(new PointF(0.789f, 0.439f)));
        arrayList.add(new b(new PointF(0.888f, 0.439f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static l1.u E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.053f)));
        arrayList.add(new b(new PointF(0.545f, -0.04f), new l1.c(0.405f, 0.0f)));
        arrayList.add(new b(new PointF(0.67f, -0.035f), new l1.c(0.426f, 0.0f)));
        arrayList.add(new b(new PointF(0.717f, 0.066f), new l1.c(0.574f, 0.0f)));
        arrayList.add(new b(new PointF(0.722f, 0.128f)));
        arrayList.add(new b(new PointF(0.777f, 0.002f), new l1.c(0.36f, 0.0f)));
        arrayList.add(new b(new PointF(0.914f, 0.149f), new l1.c(0.66f, 0.0f)));
        arrayList.add(new b(new PointF(0.926f, 0.289f), new l1.c(0.66f, 0.0f)));
        arrayList.add(new b(new PointF(0.881f, 0.346f)));
        arrayList.add(new b(new PointF(0.94f, 0.344f), new l1.c(0.126f, 0.0f)));
        arrayList.add(new b(new PointF(1.003f, 0.437f), new l1.c(0.255f, 0.0f)));
        return l1.x.c(c(arrayList, 2, 0.5f, 0.5f, true), b(1.0f, 0.742f));
    }

    private static l1.u F() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.87f, 0.13f), new l1.c(0.146f, 0.0f)));
        arrayList.add(new b(new PointF(0.818f, 0.357f)));
        arrayList.add(new b(new PointF(1.0f, 0.332f), new l1.c(0.853f, 0.0f)));
        return c(arrayList, 4, 0.5f, 0.5f, true);
    }

    private static l1.u G() {
        l1.u.a aVar = l1.u.f43779e;
        l1.c cVar = l1.c.f43737d;
        l1.c cVar2 = f45626b;
        l1.c cVar3 = f45629e;
        return l1.w.e(aVar, 1.6f, 1.0f, cVar, Arrays.asList(cVar2, cVar2, cVar3, cVar3), 0.0f, 0.0f);
    }

    private static l1.u H() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.926f, 0.97f), new l1.c(0.189f, 0.811f)));
        arrayList.add(new b(new PointF(-0.021f, 0.967f), new l1.c(0.187f, 0.057f)));
        return c(arrayList, 2, 0.5f, 0.5f, false);
    }

    private static l1.u I() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.733f, 0.454f)));
        arrayList.add(new b(new PointF(0.839f, 0.437f), new l1.c(0.532f, 0.0f)));
        arrayList.add(new b(new PointF(0.949f, 0.449f), new l1.c(0.439f, 1.0f)));
        arrayList.add(new b(new PointF(0.998f, 0.478f), new l1.c(0.174f, 0.0f)));
        return c(arrayList, 16, 0.5f, 0.5f, true);
    }

    private static l1.u J() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.193f, 0.277f), new l1.c(0.053f, 0.0f)));
        arrayList.add(new b(new PointF(0.176f, 0.055f), new l1.c(0.053f, 0.0f)));
        return c(arrayList, 10, 0.5f, 0.5f, false);
    }

    private static l1.u K() {
        return l1.w.e(l1.u.f43779e, 1.0f, 1.0f, f45627c, null, 0.0f, 0.0f);
    }

    private static l1.u L() {
        return l1.w.f(l1.u.f43779e, 8, 1.0f, 0.8f, f45625a);
    }

    private static l1.u M() {
        return l1.v.a(3, 1.0f, 0.0f, 0.0f, f45626b);
    }

    private static l1.u N(float f10) {
        return l1.x.c(M(), a(f10));
    }

    private static l1.u O() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 1.08f), new l1.c(0.085f, 0.0f)));
        arrayList.add(new b(new PointF(0.358f, 0.843f), new l1.c(0.085f, 0.0f)));
        return c(arrayList, 8, 0.5f, 0.5f, false);
    }

    public static l1.u P(l1.u uVar, boolean z10) {
        return Q(uVar, z10, new RectF(0.0f, 0.0f, 1.0f, 1.0f));
    }

    public static l1.u Q(l1.u uVar, boolean z10, RectF rectF) {
        float[] fArr = new float[4];
        if (z10) {
            uVar.d(fArr);
        } else {
            uVar.a(fArr);
        }
        RectF rectF2 = new RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
        float fMin = Math.min(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        Matrix matrixB = b(fMin, fMin);
        matrixB.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrixB.postTranslate(rectF.centerX(), rectF.centerY());
        return l1.x.c(uVar, matrixB);
    }

    private static void R(List list, List list2, int i10, float f10, float f11, boolean z10) {
        list2.clear();
        T(list, f10, f11);
        float f12 = (float) (6.283185307179586d / ((double) i10));
        if (z10) {
            int i11 = i10 * 2;
            float f13 = f12 / 2.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < list.size(); i13++) {
                    boolean z11 = i12 % 2 != 0;
                    int size = z11 ? (list.size() - 1) - i13 : i13;
                    b bVar = (b) list.get(size);
                    if (size > 0 || !z11) {
                        list2.add(new b(new PointF((i12 * f13) + (z11 ? (f13 - bVar.f45651a.x) + (((b) list.get(0)).f45651a.x * 2.0f) : bVar.f45651a.x), bVar.f45651a.y), bVar.f45652b));
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < i10; i14++) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b bVar2 = (b) it.next();
                    list2.add(new b(new PointF((i14 * f12) + bVar2.f45651a.x, bVar2.f45651a.y), bVar2.f45652b));
                }
            }
        }
        S(list2, f10, f11);
    }

    private static void S(List list, float f10, float f11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).e(f10, f11);
        }
    }

    private static void T(List list, float f10, float f11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f(f10, f11);
        }
    }

    private static List U(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(((b) list.get(i10)).f45652b);
        }
        return arrayList;
    }

    private static float[] V(List list) {
        float[] fArr = new float[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 * 2;
            fArr[i11] = ((b) list.get(i10)).f45651a.x;
            fArr[i11 + 1] = ((b) list.get(i10)).f45651a.y;
        }
        return fArr;
    }

    static Matrix a(float f10) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f10);
        return matrix;
    }

    static Matrix b(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        return matrix;
    }

    private static l1.u c(List list, int i10, float f10, float f11, boolean z10) {
        ArrayList arrayList = new ArrayList();
        R(list, arrayList, i10, f10, f11, z10);
        return l1.v.c(V(arrayList), l1.c.f43737d, U(arrayList), f10, f11);
    }

    private static l1.u d() {
        l1.c cVar = l1.c.f43737d;
        l1.c cVar2 = f45629e;
        l1.c cVar3 = f45626b;
        return l1.x.c(l1.v.b(4, 1.0f, 0.0f, 0.0f, cVar, Arrays.asList(cVar2, cVar2, cVar3, cVar3)), a(-135.0f));
    }

    private static l1.u e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.892f), new l1.c(0.313f, 0.0f)));
        arrayList.add(new b(new PointF(-0.216f, 1.05f), new l1.c(0.207f, 0.0f)));
        arrayList.add(new b(new PointF(0.499f, -0.16f), new l1.c(0.215f, 1.0f)));
        arrayList.add(new b(new PointF(1.225f, 1.06f), new l1.c(0.211f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, false);
    }

    private static l1.u f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.457f, 0.296f), new l1.c(0.007f, 0.0f)));
        arrayList.add(new b(new PointF(0.5f, -0.051f), new l1.c(0.007f, 0.0f)));
        return c(arrayList, 15, 0.5f, 0.5f, false);
    }

    private static l1.u g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.796f, 0.5f)));
        PointF pointF = new PointF(0.853f, 0.518f);
        l1.c cVar = f45629e;
        arrayList.add(new b(pointF, cVar));
        arrayList.add(new b(new PointF(0.992f, 0.631f), cVar));
        arrayList.add(new b(new PointF(0.968f, 1.0f), cVar));
        return c(arrayList, 2, 0.5f, 0.5f, true);
    }

    private static l1.u h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, -0.006f), new l1.c(0.006f, 0.0f)));
        arrayList.add(new b(new PointF(0.592f, 0.158f), new l1.c(0.006f, 0.0f)));
        return c(arrayList, 12, 0.5f, 0.5f, false);
    }

    private static l1.u i() {
        return l1.w.b(l1.u.f43779e, 10);
    }

    private static l1.u j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.171f, 0.841f), new l1.c(0.159f, 0.0f)));
        arrayList.add(new b(new PointF(-0.02f, 0.5f), new l1.c(0.14f, 0.0f)));
        arrayList.add(new b(new PointF(0.17f, 0.159f), new l1.c(0.159f, 0.0f)));
        return c(arrayList, 2, 0.5f, 0.5f, false);
    }

    private static l1.u k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.074f)));
        arrayList.add(new b(new PointF(0.725f, -0.099f), new l1.c(0.476f, 0.0f)));
        return c(arrayList, 4, 0.5f, 0.5f, true);
    }

    private static l1.u l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.036f)));
        arrayList.add(new b(new PointF(0.758f, -0.101f), new l1.c(0.209f, 0.0f)));
        return c(arrayList, 8, 0.5f, 0.5f, false);
    }

    private static l1.u m() {
        return l1.x.c(l1.w.f(l1.u.f43779e, 12, 1.0f, 0.8f, f45628d), a(-90.0f));
    }

    private static l1.u n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(1.237f, 1.236f), new l1.c(0.258f, 0.0f)));
        arrayList.add(new b(new PointF(0.5f, 0.918f), new l1.c(0.233f, 0.0f)));
        return c(arrayList, 4, 0.5f, 0.5f, false);
    }

    private static l1.u o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.723f, 0.884f), new l1.c(0.394f, 0.0f)));
        arrayList.add(new b(new PointF(0.5f, 1.099f), new l1.c(0.398f, 0.0f)));
        return c(arrayList, 6, 0.5f, 0.5f, false);
    }

    private static l1.u p() {
        return l1.x.c(l1.w.f(l1.u.f43779e, 7, 1.0f, 0.75f, f45628d), a(-90.0f));
    }

    private static l1.u q() {
        return l1.x.c(l1.w.f(l1.u.f43779e, 9, 1.0f, 0.8f, f45628d), a(-90.0f));
    }

    private static l1.u r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 1.096f), new l1.c(0.151f, 0.524f)));
        arrayList.add(new b(new PointF(0.04f, 0.5f), new l1.c(0.159f, 0.0f)));
        return c(arrayList, 2, 0.5f, 0.5f, false);
    }

    private static l1.u s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(1.0f, 1.0f), new l1.c(0.148f, 0.417f)));
        arrayList.add(new b(new PointF(0.0f, 1.0f), new l1.c(0.151f, 0.0f)));
        arrayList.add(new b(new PointF(0.0f, 0.0f), new l1.c(0.148f, 0.0f)));
        arrayList.add(new b(new PointF(0.978f, 0.02f), new l1.c(0.803f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, false);
    }

    private static l1.u t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.37f, 0.187f)));
        arrayList.add(new b(new PointF(0.416f, 0.049f), new l1.c(0.381f, 0.0f)));
        arrayList.add(new b(new PointF(0.479f, 0.0f), new l1.c(0.095f, 0.0f)));
        return c(arrayList, 8, 0.5f, 0.5f, true);
    }

    private static l1.u u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.499f, 1.023f), new l1.c(0.241f, 0.778f)));
        arrayList.add(new b(new PointF(-0.005f, 0.792f), new l1.c(0.208f, 0.0f)));
        arrayList.add(new b(new PointF(0.073f, 0.258f), new l1.c(0.228f, 0.0f)));
        arrayList.add(new b(new PointF(0.433f, -0.0f), new l1.c(0.491f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static l1.u v(float f10) {
        return l1.x.c(u(), a(f10));
    }

    private static l1.u w() {
        ArrayList arrayList = new ArrayList();
        PointF pointF = new PointF(0.5f, 0.0f);
        l1.c cVar = f45629e;
        arrayList.add(new b(pointF, cVar));
        arrayList.add(new b(new PointF(1.0f, 0.0f), cVar));
        arrayList.add(new b(new PointF(1.0f, 1.14f), new l1.c(0.254f, 0.106f)));
        arrayList.add(new b(new PointF(0.575f, 0.906f), new l1.c(0.253f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static l1.u x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(new PointF(0.5f, 0.268f), new l1.c(0.016f, 0.0f)));
        arrayList.add(new b(new PointF(0.792f, -0.066f), new l1.c(0.958f, 0.0f)));
        arrayList.add(new b(new PointF(1.064f, 0.276f), f45629e));
        arrayList.add(new b(new PointF(0.501f, 0.946f), new l1.c(0.129f, 0.0f)));
        return c(arrayList, 1, 0.5f, 0.5f, true);
    }

    private static l1.u y() {
        return l1.x.c(l1.w.a(l1.u.f43779e), b(1.0f, 0.64f));
    }

    private static l1.u z(float f10) {
        return l1.x.c(y(), a(f10));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PointF f45651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l1.c f45652b;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(float f10, float f11) {
            PointF pointF = this.f45651a;
            float fCos = (float) ((((double) pointF.y) * Math.cos(pointF.x)) + ((double) f10));
            PointF pointF2 = this.f45651a;
            float fSin = (float) ((((double) pointF2.y) * Math.sin(pointF2.x)) + ((double) f11));
            PointF pointF3 = this.f45651a;
            pointF3.x = fCos;
            pointF3.y = fSin;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(float f10, float f11) {
            this.f45651a.offset(-f10, -f11);
            PointF pointF = this.f45651a;
            float fAtan2 = (float) Math.atan2(pointF.y, pointF.x);
            PointF pointF2 = this.f45651a;
            float fHypot = (float) Math.hypot(pointF2.x, pointF2.y);
            PointF pointF3 = this.f45651a;
            pointF3.x = fAtan2;
            pointF3.y = fHypot;
        }

        private b(PointF pointF) {
            this(pointF, l1.c.f43737d);
        }

        private b(PointF pointF, l1.c cVar) {
            this.f45651a = pointF;
            this.f45652b = cVar;
        }
    }
}
