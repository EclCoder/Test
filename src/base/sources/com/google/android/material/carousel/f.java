package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f19774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f19776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f19777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f19778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f19779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f19780g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19781a;

        static {
            int[] iArr = new int[c.a.values().length];
            f19781a = iArr;
            try {
                iArr[c.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private f(e eVar, List list, List list2) {
        this.f19774a = eVar;
        this.f19775b = Collections.unmodifiableList(list);
        this.f19776c = Collections.unmodifiableList(list2);
        float f10 = ((e) list.get(list.size() - 1)).d().f19766a - eVar.d().f19766a;
        this.f19779f = f10;
        float f11 = eVar.k().f19766a - ((e) list2.get(list2.size() - 1)).k().f19766a;
        this.f19780g = f11;
        this.f19777d = m(f10, list, true);
        this.f19778e = m(f11, list2, false);
    }

    private e a(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? (e) list.get((int) fArrO[2]) : (e) list.get((int) fArrO[1]);
    }

    private static int b(e eVar, float f10) {
        for (int iJ = eVar.j(); iJ < eVar.h().size(); iJ++) {
            if (f10 == ((e.c) eVar.h().get(iJ)).f19768c) {
                return iJ;
            }
        }
        return eVar.h().size() - 1;
    }

    private static int c(e eVar) {
        for (int i10 = 0; i10 < eVar.h().size(); i10++) {
            if (!((e.c) eVar.h().get(i10)).f19770e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(e eVar, float f10) {
        for (int iC = eVar.c() - 1; iC >= 0; iC--) {
            if (f10 == ((e.c) eVar.h().get(iC)).f19768c) {
                return iC;
            }
        }
        return 0;
    }

    private static int e(e eVar) {
        for (int size = eVar.h().size() - 1; size >= 0; size--) {
            if (!((e.c) eVar.h().get(size)).f19770e) {
                return size;
            }
        }
        return -1;
    }

    static f f(yb.a aVar, e eVar, float f10, float f11, float f12, c.a aVar2) {
        return new f(eVar, p(aVar, eVar, f10, f11, aVar2), n(aVar, eVar, f10, f12, aVar2));
    }

    private static float[] m(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            e eVar = (e) list.get(i11);
            e eVar2 = (e) list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? eVar2.d().f19766a - eVar.d().f19766a : eVar.k().f19766a - eVar2.k().f19766a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List n(yb.a aVar, e eVar, float f10, float f11, c.a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int iE = e(eVar);
        int iA = aVar.d() ? aVar.a() : aVar.b();
        if (!r(aVar, eVar) && iE != -1) {
            int iJ = iE - eVar.j();
            float f12 = eVar.d().f19767b - (eVar.d().f19769d / 2.0f);
            if (iJ <= 0 && eVar.i().f19771f > 0.0f) {
                arrayList.add(x(eVar, (f12 - eVar.i().f19771f) - f11, iA));
                return arrayList;
            }
            float f13 = 0.0f;
            int i10 = 0;
            while (i10 < iJ) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i11 = iE - i10;
                float f14 = f13 + ((e.c) eVar.h().get(i11)).f19771f;
                int i12 = i11 + 1;
                int i13 = iA;
                e eVarT = t(eVar2, iE, i12 < eVar.h().size() ? d(eVar2, ((e.c) eVar.h().get(i12)).f19768c) + 1 : 0, f12 - f14, eVar.c() + i10 + 1, eVar.j() + i10 + 1, i13);
                if (i10 == iJ - 1 && f11 > 0.0f) {
                    eVarT = u(eVarT, f11, i13, false, f10, aVar2);
                    i13 = i13;
                }
                arrayList.add(eVarT);
                i10++;
                iA = i13;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(eVar, f11, iA, false, f10, aVar2));
        }
        return arrayList;
    }

    private static float[] o(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{tb.b.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(yb.a aVar, e eVar, float f10, float f11, c.a aVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int iC = c(eVar);
        int iA = aVar.d() ? aVar.a() : aVar.b();
        if (!q(eVar) && iC != -1) {
            int iC2 = eVar.c() - iC;
            float f12 = eVar.d().f19767b - (eVar.d().f19769d / 2.0f);
            if (iC2 <= 0 && eVar.b().f19771f > 0.0f) {
                arrayList.add(x(eVar, f12 + eVar.b().f19771f + f11, iA));
                return arrayList;
            }
            float f13 = 0.0f;
            for (int i10 = 0; i10 < iC2; i10++) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = eVar.h().size() - 1;
                f13 += ((e.c) eVar.h().get(i11)).f19771f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(eVar2, ((e.c) eVar.h().get(i12)).f19768c) - 1;
                }
                int i13 = iA;
                e eVarT = t(eVar2, iC, size, f12 + f13, (eVar.c() - i10) - 1, (eVar.j() - i10) - 1, i13);
                iA = i13;
                if (i10 == iC2 - 1 && f11 > 0.0f) {
                    eVarT = u(eVarT, f11, iA, true, f10, aVar2);
                }
                arrayList.add(eVarT);
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(eVar, f11, iA, true, f10, aVar2));
        }
        return arrayList;
    }

    private static boolean q(e eVar) {
        return eVar.b().f19767b - (eVar.b().f19769d / 2.0f) >= 0.0f && eVar.b() == eVar.e();
    }

    private static boolean r(yb.a aVar, e eVar) {
        int iB = aVar.b();
        if (aVar.d()) {
            iB = aVar.a();
        }
        return eVar.i().f19767b + (eVar.i().f19769d / 2.0f) <= ((float) iB) && eVar.i() == eVar.l();
    }

    private static e s(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return e.o((e) list.get((int) fArrO[1]), (e) list.get((int) fArrO[2]), fArrO[0]);
    }

    private static e t(e eVar, int i10, int i11, float f10, int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList(eVar.h());
        arrayList.add(i11, (e.c) arrayList.remove(i10));
        e.b bVar = new e.b(eVar.g(), i14);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i15);
            float f11 = cVar.f19769d;
            bVar.e(f10 + (f11 / 2.0f), cVar.f19768c, f11, i15 >= i12 && i15 <= i13, cVar.f19770e, cVar.f19771f);
            f10 += cVar.f19769d;
            i15++;
        }
        return bVar.i();
    }

    private static e u(e eVar, float f10, int i10, boolean z10, float f11, c.a aVar) {
        return a.f19781a[aVar.ordinal()] != 1 ? w(eVar, f10, i10, z10) : v(eVar, f10, i10, z10, f11);
    }

    private static e v(e eVar, float f10, int i10, boolean z10, float f11) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i10);
        float fM = f10 / eVar.m();
        float f12 = z10 ? f10 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i11);
            if (cVar.f19770e) {
                bVar.e(cVar.f19767b, cVar.f19768c, cVar.f19769d, false, true, cVar.f19771f);
            } else {
                boolean z11 = i11 >= eVar.c() && i11 <= eVar.j();
                float f13 = cVar.f19769d - fM;
                float fB = c.b(f13, eVar.g(), f11);
                float f14 = (f13 / 2.0f) + f12;
                float fAbs = Math.abs(f14 - cVar.f19767b);
                bVar.f(f14, fB, f13, z11, false, cVar.f19771f, z10 ? fAbs : 0.0f, z10 ? 0.0f : fAbs);
                f12 += f13;
            }
            i11++;
        }
        return bVar.i();
    }

    private static e w(e eVar, float f10, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(eVar.h());
        e.b bVar = new e.b(eVar.g(), i10);
        boolean z11 = true;
        int size = z10 ? 0 : arrayList.size() - 1;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i11);
            if (cVar.f19770e && i11 == size) {
                bVar.e(cVar.f19767b, cVar.f19768c, cVar.f19769d, false, true, cVar.f19771f);
            } else {
                float f11 = cVar.f19767b;
                float f12 = z10 ? f11 + f10 : f11 - f10;
                float f13 = z10 ? f10 : 0.0f;
                float f14 = z10 ? 0.0f : f10;
                boolean z12 = (i11 < eVar.c() || i11 > eVar.j()) ? false : z11;
                float f15 = f12;
                float f16 = cVar.f19768c;
                float f17 = cVar.f19769d;
                bVar.f(f15, f16, f17, z12, cVar.f19770e, Math.abs(z10 ? Math.max(0.0f, ((f17 / 2.0f) + f15) - i10) : Math.min(0.0f, f15 - (f17 / 2.0f))), f13, f14);
            }
            i11++;
            z11 = true;
        }
        return bVar.i();
    }

    private static e x(e eVar, float f10, int i10) {
        return t(eVar, 0, 0, f10, eVar.c(), eVar.j(), i10);
    }

    e g() {
        return this.f19774a;
    }

    e h() {
        List list = this.f19776c;
        return (e) list.get(list.size() - 1);
    }

    Map i(int i10, int i11, int i12, boolean z10) {
        float fG = this.f19774a.g();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * fG * (z10 ? -1 : 1) > i12 - this.f19780g || i13 >= i10 - this.f19776c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List list = this.f19776c;
                map.put(numValueOf, (e) list.get(h0.a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * fG * (z10 ? -1 : 1) < i11 + this.f19779f || i17 < this.f19775b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List list2 = this.f19775b;
                map.put(numValueOf2, (e) list2.get(h0.a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public e j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    e k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List list;
        float[] fArr;
        float f13 = this.f19779f + f11;
        float f14 = f12 - this.f19780g;
        float f15 = l().b().f19772g;
        float f16 = h().b().f19773h;
        if (this.f19779f == f15) {
            f13 += f15;
        }
        if (this.f19780g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = tb.b.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f19775b;
            fArr = this.f19777d;
        } else {
            if (f10 <= f14) {
                return this.f19774a;
            }
            fB = tb.b.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f19776c;
            fArr = this.f19778e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    e l() {
        List list = this.f19775b;
        return (e) list.get(list.size() - 1);
    }
}
