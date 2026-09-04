package l1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43779e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f43781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f43782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f43783d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(List features, float f10, float f11) {
        List listQ;
        List listQ2;
        d dVar;
        List listA;
        kotlin.jvm.internal.s.h(features, "features");
        this.f43780a = features;
        this.f43781b = f10;
        this.f43782c = f11;
        List listC = gl.r.c();
        int i10 = 0;
        d dVar2 = null;
        if (features.size() <= 0 || ((g) features.get(0)).a().size() != 3) {
            listQ = null;
            listQ2 = null;
        } else {
            fl.q qVarM = ((d) ((g) features.get(0)).a().get(1)).m(0.5f);
            d dVar3 = (d) qVarM.d();
            d dVar4 = (d) qVarM.g();
            listQ2 = gl.r.q(((g) features.get(0)).a().get(0), dVar3);
            listQ = gl.r.q(dVar4, ((g) features.get(0)).a().get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i11 = 0;
            d dVar5 = null;
            while (true) {
                if (i11 == 0 && listQ != null) {
                    listA = listQ;
                } else if (i11 != this.f43780a.size()) {
                    listA = ((g) this.f43780a.get(i11)).a();
                } else if (listQ2 == null) {
                    break;
                } else {
                    listA = listQ2;
                }
                int size2 = listA.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    d dVar6 = (d) listA.get(i12);
                    if (!dVar6.p()) {
                        if (dVar5 != null) {
                            listC.add(dVar5);
                        }
                        if (dVar2 == null) {
                            dVar2 = dVar6;
                            dVar5 = dVar2;
                        } else {
                            dVar5 = dVar6;
                        }
                    } else if (dVar5 != null) {
                        dVar5.j()[6] = dVar6.d();
                        dVar5.j()[7] = dVar6.e();
                    }
                }
                if (i11 == size) {
                    break;
                } else {
                    i11++;
                }
            }
            dVar = dVar2;
            dVar2 = dVar5;
        } else {
            dVar = null;
        }
        if (dVar2 != null && dVar != null) {
            listC.add(e.a(dVar2.b(), dVar2.c(), dVar2.f(), dVar2.g(), dVar2.h(), dVar2.i(), dVar.b(), dVar.c()));
        }
        List listA2 = gl.r.a(listC);
        this.f43783d = listA2;
        Object obj = listA2.get(listA2.size() - 1);
        int size3 = listA2.size();
        while (i10 < size3) {
            d dVar7 = (d) this.f43783d.get(i10);
            d dVar8 = (d) obj;
            if (Math.abs(dVar7.b() - dVar8.d()) > 1.0E-4f || Math.abs(dVar7.c() - dVar8.e()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i10++;
            obj = dVar7;
        }
    }

    public static /* synthetic */ float[] c(u uVar, float[] fArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return uVar.b(fArr, z10);
    }

    public final float[] a(float[] bounds) {
        kotlin.jvm.internal.s.h(bounds, "bounds");
        return c(this, bounds, false, 2, null);
    }

    public final float[] b(float[] bounds, boolean z10) {
        kotlin.jvm.internal.s.h(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.f43783d.size();
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f43783d.get(i10)).a(bounds, z10);
            fMin = Math.min(fMin, bounds[0]);
            fMin2 = Math.min(fMin2, bounds[1]);
            fMax = Math.max(fMax, bounds[2]);
            fMax2 = Math.max(fMax2, bounds[3]);
        }
        bounds[0] = fMin;
        bounds[1] = fMin2;
        bounds[2] = fMax;
        bounds[3] = fMax2;
        return bounds;
    }

    public final float[] d(float[] bounds) {
        kotlin.jvm.internal.s.h(bounds, "bounds");
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.f43783d.size();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) this.f43783d.get(i10);
            float fE = y.e(dVar.b() - this.f43781b, dVar.c() - this.f43782c);
            long jK = dVar.k(0.5f);
            fMax = Math.max(fMax, Math.max(fE, y.e(p.g(jK) - this.f43781b, p.h(jK) - this.f43782c)));
        }
        float fSqrt = (float) Math.sqrt(fMax);
        float f10 = this.f43781b;
        bounds[0] = f10 - fSqrt;
        float f11 = this.f43782c;
        bounds[1] = f11 - fSqrt;
        bounds[2] = f10 + fSqrt;
        bounds[3] = f11 + fSqrt;
        return bounds;
    }

    public final float e() {
        return this.f43781b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return kotlin.jvm.internal.s.c(this.f43780a, ((u) obj).f43780a);
        }
        return false;
    }

    public final float f() {
        return this.f43782c;
    }

    public final List g() {
        return this.f43780a;
    }

    public final u h(q f10) {
        kotlin.jvm.internal.s.h(f10, "f");
        long jM = p.m(androidx.collection.g.b(this.f43781b, this.f43782c), f10);
        List listC = gl.r.c();
        int size = this.f43780a.size();
        for (int i10 = 0; i10 < size; i10++) {
            listC.add(((g) this.f43780a.get(i10)).b(f10));
        }
        return new u(gl.r.a(listC), p.g(jM), p.h(jM));
    }

    public int hashCode() {
        return this.f43780a.hashCode();
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + gl.r.l0(this.f43783d, null, null, null, 0, null, null, 63, null) + " || Features = " + gl.r.l0(this.f43780a, null, null, null, 0, null, null, 63, null) + " || Center = (" + this.f43781b + ", " + this.f43782c + ")]";
    }
}
