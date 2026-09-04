package l1;

import gl.j0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List a(List f10, List f11) {
        kotlin.jvm.internal.s.h(f10, "f1");
        kotlin.jvm.internal.s.h(f11, "f2");
        Iterator it = gl.r.m(f11).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        j0 j0Var = (j0) it;
        int iNextInt = j0Var.nextInt();
        if (it.hasNext()) {
            float fB = b(((s) f10.get(0)).a(), ((s) f11.get(iNextInt)).a());
            do {
                int iNextInt2 = j0Var.nextInt();
                float fB2 = b(((s) f10.get(0)).a(), ((s) f11.get(iNextInt2)).a());
                if (Float.compare(fB, fB2) > 0) {
                    iNextInt = iNextInt2;
                    fB = fB2;
                }
            } while (it.hasNext());
        }
        int size = f10.size();
        int size2 = f11.size();
        List listQ = gl.r.q(f11.get(iNextInt));
        int i10 = iNextInt;
        for (int i11 = 1; i11 < size; i11++) {
            int i12 = iNextInt - (size - i11);
            if (i12 <= i10) {
                i12 += size2;
            }
            Iterator it2 = new yl.f(i10 + 1, i12).iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            j0 j0Var2 = (j0) it2;
            int iNextInt3 = j0Var2.nextInt();
            if (it2.hasNext()) {
                float fB3 = b(((s) f10.get(i11)).a(), ((s) f11.get(iNextInt3 % size2)).a());
                do {
                    int iNextInt4 = j0Var2.nextInt();
                    float fB4 = b(((s) f10.get(i11)).a(), ((s) f11.get(iNextInt4 % size2)).a());
                    if (Float.compare(fB3, fB4) > 0) {
                        iNextInt3 = iNextInt4;
                        fB3 = fB4;
                    }
                } while (it2.hasNext());
            }
            i10 = iNextInt3;
            listQ.add(f11.get(i10 % size2));
        }
        return listQ;
    }

    public static final float b(g f10, g f11) {
        kotlin.jvm.internal.s.h(f10, "f1");
        kotlin.jvm.internal.s.h(f11, "f2");
        if ((f10 instanceof g.a) && (f11 instanceof g.a) && ((g.a) f10).c() != ((g.a) f11).c()) {
            return Float.MAX_VALUE;
        }
        float fB = (((d) gl.r.b0(f10.a())).b() + ((d) gl.r.n0(f10.a())).d()) / 2.0f;
        float fC = (((d) gl.r.b0(f10.a())).c() + ((d) gl.r.n0(f10.a())).e()) / 2.0f;
        float fB2 = fB - ((((d) gl.r.b0(f11.a())).b() + ((d) gl.r.n0(f11.a())).d()) / 2.0f);
        float fC2 = fC - ((((d) gl.r.b0(f11.a())).c() + ((d) gl.r.n0(f11.a())).e()) / 2.0f);
        return (fB2 * fB2) + (fC2 * fC2);
    }

    public static final f c(List features1, List features2) {
        kotlin.jvm.internal.s.h(features1, "features1");
        kotlin.jvm.internal.s.h(features2, "features2");
        List listC = gl.r.c();
        int size = features1.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((s) features1.get(i10)).a() instanceof g.a) {
                listC.add(features1.get(i10));
            }
        }
        List listA = gl.r.a(listC);
        List listC2 = gl.r.c();
        int size2 = features2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((s) features2.get(i11)).a() instanceof g.a) {
                listC2.add(features2.get(i11));
            }
        }
        List listA2 = gl.r.a(listC2);
        fl.q qVarA = listA.size() > listA2.size() ? fl.w.a(a(listA2, listA), listA2) : fl.w.a(listA, a(listA, listA2));
        List list = (List) qVarA.d();
        List list2 = (List) qVarA.g();
        List listC3 = gl.r.c();
        int size3 = list.size();
        for (int i12 = 0; i12 < size3 && i12 != list2.size(); i12++) {
            listC3.add(fl.w.a(Float.valueOf(((s) list.get(i12)).b()), Float.valueOf(((s) list2.get(i12)).b())));
        }
        fl.q[] qVarArr = (fl.q[]) gl.r.a(listC3).toArray(new fl.q[0]);
        return new f((fl.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
    }
}
