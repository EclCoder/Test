package l1;

import fl.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k extends gl.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43750e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f43751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f43752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f43753d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(l measurer, u polygon) {
            List listE;
            kotlin.jvm.internal.s.h(measurer, "measurer");
            kotlin.jvm.internal.s.h(polygon, "polygon");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = polygon.g().size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) polygon.g().get(i10);
                int size2 = gVar.a().size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if ((gVar instanceof g.a) && i11 == gVar.a().size() / 2) {
                        arrayList2.add(fl.w.a(gVar, Integer.valueOf(arrayList.size())));
                    }
                    arrayList.add(gVar.a().get(i11));
                }
            }
            Float fValueOf = Float.valueOf(0.0f);
            int iV = gl.r.v(arrayList, 9);
            if (iV == 0) {
                listE = gl.r.e(fValueOf);
            } else {
                ArrayList arrayList3 = new ArrayList(iV + 1);
                arrayList3.add(fValueOf);
                int size3 = arrayList.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    float fFloatValue = fValueOf.floatValue();
                    float fB = measurer.b((d) obj);
                    if (fB < 0.0f) {
                        throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                    }
                    g0 g0Var = g0.f38750a;
                    fValueOf = Float.valueOf(fFloatValue + fB);
                    arrayList3.add(fValueOf);
                }
                listE = arrayList3;
            }
            float fFloatValue2 = ((Number) gl.r.n0(listE)).floatValue();
            androidx.collection.o oVar = new androidx.collection.o(listE.size());
            int size4 = listE.size();
            for (int i13 = 0; i13 < size4; i13++) {
                oVar.g(((Number) listE.get(i13)).floatValue() / fFloatValue2);
            }
            String unused = r.f43764a;
            List listC = gl.r.c();
            int size5 = arrayList2.size();
            for (int i14 = 0; i14 < size5; i14++) {
                int iIntValue = ((Number) ((fl.q) arrayList2.get(i14)).i()).intValue();
                listC.add(new s((oVar.b(iIntValue) + oVar.b(iIntValue + 1)) / 2, (g) ((fl.q) arrayList2.get(i14)).h()));
            }
            return new k(measurer, gl.r.a(listC), arrayList, oVar, null);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f43754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f43755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f43756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f43757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f43758e;

        public b(k kVar, d cubic, float f10, float f11) {
            kotlin.jvm.internal.s.h(cubic, "cubic");
            this.f43758e = kVar;
            this.f43754a = cubic;
            if (f11 < f10) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.f43755b = kVar.f43751b.b(cubic);
            this.f43756c = f10;
            this.f43757d = f11;
        }

        public static /* synthetic */ void f(b bVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = bVar.f43756c;
            }
            if ((i10 & 2) != 0) {
                f11 = bVar.f43757d;
            }
            bVar.e(f10, f11);
        }

        public final fl.q a(float f10) {
            float fH = yl.g.h(f10, this.f43756c, this.f43757d);
            float f11 = this.f43757d;
            float f12 = this.f43756c;
            float fA = this.f43758e.f43751b.a(this.f43754a, ((fH - f12) / (f11 - f12)) * this.f43755b);
            if (0.0f > fA || fA > 1.0f) {
                throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
            }
            String unused = r.f43764a;
            fl.q qVarM = this.f43754a.m(fA);
            return fl.w.a(new b(this.f43758e, (d) qVarM.d(), this.f43756c, fH), new b(this.f43758e, (d) qVarM.g(), fH, this.f43757d));
        }

        public final d b() {
            return this.f43754a;
        }

        public final float c() {
            return this.f43757d;
        }

        public final float d() {
            return this.f43756c;
        }

        public final void e(float f10, float f11) {
            if (f11 < f10) {
                throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
            }
            this.f43756c = f10;
            this.f43757d = f11;
        }

        public String toString() {
            return "MeasuredCubic(outlineProgress=[" + this.f43756c + " .. " + this.f43757d + "], size=" + this.f43755b + ", cubic=" + this.f43754a + ')';
        }
    }

    public /* synthetic */ k(l lVar, List list, List list2, androidx.collection.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, list, list2, hVar);
    }

    @Override // gl.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof b) {
            return k((b) obj);
        }
        return false;
    }

    @Override // gl.b
    public int d() {
        return this.f43752c.size();
    }

    @Override // gl.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof b) {
            return p((b) obj);
        }
        return -1;
    }

    public /* bridge */ boolean k(b bVar) {
        return super.contains(bVar);
    }

    @Override // gl.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof b) {
            return r((b) obj);
        }
        return -1;
    }

    public final k m(float f10) {
        float fJ;
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
        }
        if (f10 < 1.0E-4f) {
            return this;
        }
        Iterator it = this.f43752c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            b bVar = (b) it.next();
            float fD = bVar.d();
            if (f10 <= bVar.c() && fD <= f10) {
                break;
            }
            i10++;
        }
        fl.q qVarA = ((b) this.f43752c.get(i10)).a(f10);
        b bVar2 = (b) qVarA.d();
        b bVar3 = (b) qVarA.g();
        String unused = r.f43764a;
        List listQ = gl.r.q(bVar3.b());
        int size = this.f43752c.size();
        for (int i11 = 1; i11 < size; i11++) {
            List list = this.f43752c;
            listQ.add(((b) list.get((i11 + i10) % list.size())).b());
        }
        listQ.add(bVar2.b());
        androidx.collection.o oVar = new androidx.collection.o(this.f43752c.size() + 2);
        int size2 = this.f43752c.size() + 2;
        for (int i12 = 0; i12 < size2; i12++) {
            if (i12 == 0) {
                fJ = 0.0f;
            } else if (i12 == this.f43752c.size() + 1) {
                fJ = 1.0f;
            } else {
                fJ = y.j(((b) this.f43752c.get(((i10 + i12) - 1) % this.f43752c.size())).c() - f10, 1.0f);
            }
            oVar.g(fJ);
        }
        List listC = gl.r.c();
        int size3 = this.f43753d.size();
        for (int i13 = 0; i13 < size3; i13++) {
            listC.add(new s(y.j(((s) this.f43753d.get(i13)).b() - f10, 1.0f), ((s) this.f43753d.get(i13)).a()));
        }
        return new k(this.f43751b, gl.r.a(listC), listQ, oVar);
    }

    @Override // gl.d, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public b get(int i10) {
        return (b) this.f43752c.get(i10);
    }

    public final List o() {
        return this.f43753d;
    }

    public /* bridge */ int p(b bVar) {
        return super.indexOf(bVar);
    }

    public /* bridge */ int r(b bVar) {
        return super.lastIndexOf(bVar);
    }

    private k(l lVar, List list, List list2, androidx.collection.h hVar) {
        if (hVar.c() != list2.size() + 1) {
            throw new IllegalArgumentException("Outline progress size is expected to be the cubics size + 1");
        }
        if (hVar.a() != 0.0f) {
            throw new IllegalArgumentException("First outline progress value is expected to be zero");
        }
        if (hVar.f() != 1.0f) {
            throw new IllegalArgumentException("Last outline progress value is expected to be one");
        }
        this.f43751b = lVar;
        this.f43753d = list;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i10 = 0;
        float fB = 0.0f;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (hVar.b(i11) - hVar.b(i10) > 1.0E-4f) {
                arrayList.add(new b(this, (d) list2.get(i10), fB, hVar.b(i11)));
                fB = hVar.b(i11);
            }
            i10 = i11;
        }
        b.f((b) arrayList.get(gl.r.n(arrayList)), 0.0f, 1.0f, 1, null);
        this.f43752c = arrayList;
    }
}
