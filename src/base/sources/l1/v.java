package l1;

import gl.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {
    public static final u a(int i10, float f10, float f11, float f12, c rounding) {
        kotlin.jvm.internal.s.h(rounding, "rounding");
        return d(i10, f10, f11, f12, rounding, null, 32, null);
    }

    public static final u b(int i10, float f10, float f11, float f12, c rounding, List list) {
        kotlin.jvm.internal.s.h(rounding, "rounding");
        return c(f(i10, f10, f11, f12), rounding, list, f11, f12);
    }

    public static /* synthetic */ u d(int i10, float f10, float f11, float f12, c cVar, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f10 = 1.0f;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 8) != 0) {
            f12 = 0.0f;
        }
        if ((i11 & 16) != 0) {
            cVar = c.f43737d;
        }
        if ((i11 & 32) != 0) {
            list = null;
        }
        List list2 = list;
        return b(i10, f10, f11, f12, cVar, list2);
    }

    private static final long e(float[] fArr) {
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        while (i10 < fArr.length) {
            int i11 = i10 + 1;
            f10 += fArr[i10];
            i10 += 2;
            f11 += fArr[i11];
        }
        float f12 = 2;
        return androidx.collection.g.b((f10 / fArr.length) / f12, (f11 / fArr.length) / f12);
    }

    private static final float[] f(int i10, float f10, float f11, float f12) {
        float[] fArr = new float[i10 * 2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            float f13 = f10;
            long jK = p.k(y.l(f13, (y.g() / i10) * 2 * i11, 0L, 4, null), androidx.collection.g.b(f11, f12));
            int i13 = i12 + 1;
            fArr[i12] = p.g(jK);
            i12 += 2;
            fArr[i13] = p.h(jK);
            i11++;
            f10 = f13;
        }
        return fArr;
    }

    public static final u c(float[] vertices, c cVar, List list, float f10, float f11) {
        c cVar2;
        Float fValueOf = Float.valueOf(1.0f);
        kotlin.jvm.internal.s.h(vertices, "vertices");
        kotlin.jvm.internal.s.h(cVar, SVWsZyNSAChGIA.eiioR);
        if (vertices.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i10 = 2;
        int i11 = 1;
        if (vertices.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != vertices.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList = new ArrayList();
        int length = vertices.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            c cVar3 = (list == null || (cVar2 = (c) list.get(i13)) == null) ? cVar : cVar2;
            int i14 = (((i13 + length) - i11) % length) * 2;
            int i15 = i13 + 1;
            int i16 = (i15 % length) * 2;
            int i17 = i13 * 2;
            arrayList2.add(new t(androidx.collection.g.b(vertices[i14], vertices[i14 + i11]), androidx.collection.g.b(vertices[i17], vertices[i17 + i11]), androidx.collection.g.b(vertices[i16], vertices[i16 + 1]), cVar3, null));
            i13 = i15;
            i11 = i11;
        }
        int i18 = i11;
        yl.f fVarM = yl.g.m(0, length);
        ArrayList arrayList3 = new ArrayList(gl.r.v(fVarM, 10));
        Iterator it = fVarM.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j0) it).nextInt();
            int i19 = (iNextInt + 1) % length;
            float f12 = ((t) arrayList2.get(iNextInt)).f() + ((t) arrayList2.get(i19)).f();
            float fE = ((t) arrayList2.get(iNextInt)).e() + ((t) arrayList2.get(i19)).e();
            int i20 = iNextInt * 2;
            int i21 = i19 * 2;
            float fD = y.d(vertices[i20] - vertices[i21], vertices[i20 + 1] - vertices[i21 + 1]);
            arrayList3.add(f12 > fD ? fl.w.a(Float.valueOf(fD / f12), Float.valueOf(0.0f)) : fE > fD ? fl.w.a(fValueOf, Float.valueOf((fD - f12) / (fE - f12))) : fl.w.a(fValueOf, fValueOf));
        }
        for (int i22 = 0; i22 < length; i22++) {
            androidx.collection.o oVar = new androidx.collection.o(2);
            for (int i23 = 0; i23 < 2; i23++) {
                fl.q qVar = (fl.q) arrayList3.get((((i22 + length) - 1) + i23) % length);
                oVar.g((((t) arrayList2.get(i22)).f() * ((Number) qVar.d()).floatValue()) + ((((t) arrayList2.get(i22)).e() - ((t) arrayList2.get(i22)).f()) * ((Number) qVar.g()).floatValue()));
            }
            arrayList.add(((t) arrayList2.get(i22)).d(oVar.b(0), oVar.b(i18)));
        }
        ArrayList arrayList4 = new ArrayList();
        while (i12 < length) {
            int i24 = i12 + 1;
            int i25 = i24 % length;
            int i26 = i12 * 2;
            long jB = androidx.collection.g.b(vertices[i26], vertices[i26 + i18]);
            int i27 = (((i12 + length) - i18) % length) * i10;
            long jB2 = androidx.collection.g.b(vertices[i27], vertices[i27 + i18]);
            int i28 = i25 * 2;
            arrayList4.add(new g.a((List) arrayList.get(i12), jB, ((t) arrayList2.get(i12)).c(), p.a(p.j(jB, jB2), p.j(androidx.collection.g.b(vertices[i28], vertices[i28 + i18]), jB)), null));
            arrayList4.add(new g.b(gl.r.e(d.f43740b.b(((d) gl.r.n0((List) arrayList.get(i12))).d(), ((d) gl.r.n0((List) arrayList.get(i12))).e(), ((d) gl.r.b0((List) arrayList.get(i25))).b(), ((d) gl.r.b0((List) arrayList.get(i25))).c()))));
            i12 = i24;
            i10 = 2;
        }
        long jE = (f10 == Float.MIN_VALUE || f11 == Float.MIN_VALUE) ? e(vertices) : androidx.collection.g.b(f10, f11);
        return new u(arrayList4, Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jE & 4294967295L)));
    }
}
