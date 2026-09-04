package l1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43759d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f43760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f43761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f43762c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(u p10, u p11) {
            fl.q qVarA;
            fl.q qVarA2;
            kotlin.jvm.internal.s.h(p10, "p1");
            kotlin.jvm.internal.s.h(p11, "p2");
            k.a aVar = k.f43750e;
            k kVarA = aVar.a(new b(p10.e(), p10.f()), p10);
            k kVarA2 = aVar.a(new b(p11.e(), p11.f()), p11);
            f fVarC = h.c(kVarA.o(), kVarA2.o());
            float fA = fVarC.a(0.0f);
            String unused = n.f43763a;
            k kVarM = kVarA2.m(fA);
            ArrayList arrayList = new ArrayList();
            k.b bVar = (k.b) gl.r.e0(kVarA, 0);
            k.b bVar2 = (k.b) gl.r.e0(kVarM, 0);
            int i10 = 1;
            int i11 = 1;
            while (bVar != null && bVar2 != null) {
                float fC = i10 == kVarA.size() ? 1.0f : bVar.c();
                float fB = i11 == kVarM.size() ? 1.0f : fVarC.b(y.j(bVar2.c() + fA, 1.0f));
                float fMin = Math.min(fC, fB);
                String unused2 = n.f43763a;
                float f10 = 1.0E-6f + fMin;
                if (fC > f10) {
                    String unused3 = n.f43763a;
                    qVarA = bVar.a(fMin);
                } else {
                    qVarA = fl.w.a(bVar, gl.r.e0(kVarA, i10));
                    i10++;
                }
                k.b bVar3 = (k.b) qVarA.d();
                bVar = (k.b) qVarA.g();
                if (fB > f10) {
                    String unused4 = n.f43763a;
                    qVarA2 = bVar2.a(y.j(fVarC.a(fMin) - fA, 1.0f));
                } else {
                    qVarA2 = fl.w.a(bVar2, gl.r.e0(kVarM, i11));
                    i11++;
                }
                k.b bVar4 = (k.b) qVarA2.d();
                bVar2 = (k.b) qVarA2.g();
                String unused5 = n.f43763a;
                arrayList.add(fl.w.a(bVar3.b(), bVar4.b()));
            }
            if (bVar == null && bVar2 == null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }

        private a() {
        }
    }

    public m(u start, u end) {
        kotlin.jvm.internal.s.h(start, "start");
        kotlin.jvm.internal.s.h(end, "end");
        this.f43760a = start;
        this.f43761b = end;
        this.f43762c = f43759d.a(start, end);
    }

    public final List a(float f10) {
        List listC = gl.r.c();
        int size = this.f43762c.size();
        d dVar = null;
        d dVar2 = null;
        int i10 = 0;
        while (i10 < size) {
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 8; i11++) {
                fArr[i11] = y.i(((d) ((fl.q) this.f43762c.get(i10)).h()).j()[i11], ((d) ((fl.q) this.f43762c.get(i10)).i()).j()[i11], f10);
            }
            d dVar3 = new d(fArr);
            if (dVar2 == null) {
                dVar2 = dVar3;
            }
            if (dVar != null) {
                listC.add(dVar);
            }
            i10++;
            dVar = dVar3;
        }
        if (dVar != null && dVar2 != null) {
            listC.add(e.a(dVar.b(), dVar.c(), dVar.f(), dVar.g(), dVar.h(), dVar.i(), dVar2.b(), dVar2.c()));
        }
        return gl.r.a(listC);
    }
}
