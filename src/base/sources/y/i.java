package y;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static o a(x.e eVar, int i10, ArrayList arrayList, o oVar) {
        int iX1;
        int i11 = i10 == 0 ? eVar.S0 : eVar.T0;
        if (i11 != -1 && (oVar == null || i11 != oVar.c())) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                o oVar2 = (o) arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof x.j) && (iX1 = ((x.j) eVar).x1(i10)) != -1) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    o oVar3 = (o) arrayList.get(i13);
                    if (oVar3.c() == iX1) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof x.h) {
                x.h hVar = (x.h) eVar;
                hVar.w1().c(hVar.x1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.S0 = oVar.c();
                eVar.Q.c(i10, arrayList, oVar);
                eVar.S.c(i10, arrayList, oVar);
            } else {
                eVar.T0 = oVar.c();
                eVar.R.c(i10, arrayList, oVar);
                eVar.U.c(i10, arrayList, oVar);
                eVar.T.c(i10, arrayList, oVar);
            }
            eVar.X.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x0341  */
    public static boolean c(x.f fVar, b.InterfaceC0875b interfaceC0875b) {
        o oVar;
        boolean z10;
        o oVar2;
        ArrayList arrayListW1 = fVar.w1();
        int size = arrayListW1.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            x.e eVar = (x.e) arrayListW1.get(i11);
            if (!d(fVar.C(), fVar.V(), eVar.C(), eVar.V()) || (eVar instanceof x.g)) {
                return false;
            }
        }
        int i12 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i12 < size) {
            x.e eVar2 = (x.e) arrayListW1.get(i12);
            if (!d(fVar.C(), fVar.V(), eVar2.C(), eVar2.V())) {
                x.f.Y1(i10, eVar2, interfaceC0875b, fVar.f56514z1, b.a.f57048k);
            }
            boolean z11 = eVar2 instanceof x.h;
            if (z11) {
                x.h hVar = (x.h) eVar2;
                if (hVar.x1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(hVar);
                }
                if (hVar.x1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(hVar);
                }
            }
            if (eVar2 instanceof x.j) {
                if (eVar2 instanceof x.a) {
                    x.a aVar = (x.a) eVar2;
                    if (aVar.C1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.C1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    x.j jVar = (x.j) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(jVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(jVar);
                }
            }
            if (eVar2.Q.f56417f == null && eVar2.S.f56417f == null && !z11 && !(eVar2 instanceof x.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.R.f56417f == null && eVar2.T.f56417f == null && eVar2.U.f56417f == null && !z11 && !(eVar2 instanceof x.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i12++;
            i10 = 0;
        }
        ArrayList arrayList7 = new ArrayList();
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayList.get(i13);
                i13++;
                a((x.h) obj, 0, arrayList7, null);
            }
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                x.j jVar2 = (x.j) obj2;
                o oVarA = a(jVar2, 0, arrayList7, null);
                jVar2.w1(arrayList7, 0, oVarA);
                oVarA.b(arrayList7);
            }
        }
        x.d dVarQ = fVar.q(x.d.a.LEFT);
        if (dVarQ.d() != null) {
            Iterator it = dVarQ.d().iterator();
            while (it.hasNext()) {
                a(((x.d) it.next()).f56415d, 0, arrayList7, null);
            }
        }
        x.d dVarQ2 = fVar.q(x.d.a.RIGHT);
        if (dVarQ2.d() != null) {
            Iterator it2 = dVarQ2.d().iterator();
            while (it2.hasNext()) {
                a(((x.d) it2.next()).f56415d, 0, arrayList7, null);
            }
        }
        x.d dVarQ3 = fVar.q(x.d.a.CENTER);
        if (dVarQ3.d() != null) {
            Iterator it3 = dVarQ3.d().iterator();
            while (it3.hasNext()) {
                a(((x.d) it3.next()).f56415d, 0, arrayList7, null);
            }
        }
        if (arrayList5 != null) {
            int size4 = arrayList5.size();
            int i15 = 0;
            while (i15 < size4) {
                Object obj3 = arrayList5.get(i15);
                i15++;
                a((x.e) obj3, 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            int i16 = 0;
            while (i16 < size5) {
                Object obj4 = arrayList3.get(i16);
                i16++;
                a((x.h) obj4, 1, arrayList7, null);
            }
        }
        if (arrayList4 != null) {
            int size6 = arrayList4.size();
            int i17 = 0;
            while (i17 < size6) {
                Object obj5 = arrayList4.get(i17);
                i17++;
                x.j jVar3 = (x.j) obj5;
                o oVarA2 = a(jVar3, 1, arrayList7, null);
                jVar3.w1(arrayList7, 1, oVarA2);
                oVarA2.b(arrayList7);
            }
        }
        x.d dVarQ4 = fVar.q(x.d.a.TOP);
        if (dVarQ4.d() != null) {
            Iterator it4 = dVarQ4.d().iterator();
            while (it4.hasNext()) {
                a(((x.d) it4.next()).f56415d, 1, arrayList7, null);
            }
        }
        x.d dVarQ5 = fVar.q(x.d.a.BASELINE);
        if (dVarQ5.d() != null) {
            Iterator it5 = dVarQ5.d().iterator();
            while (it5.hasNext()) {
                a(((x.d) it5.next()).f56415d, 1, arrayList7, null);
            }
        }
        x.d dVarQ6 = fVar.q(x.d.a.BOTTOM);
        if (dVarQ6.d() != null) {
            Iterator it6 = dVarQ6.d().iterator();
            while (it6.hasNext()) {
                a(((x.d) it6.next()).f56415d, 1, arrayList7, null);
            }
        }
        x.d dVarQ7 = fVar.q(x.d.a.CENTER);
        if (dVarQ7.d() != null) {
            Iterator it7 = dVarQ7.d().iterator();
            while (it7.hasNext()) {
                a(((x.d) it7.next()).f56415d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            int size7 = arrayList6.size();
            int i18 = 0;
            while (i18 < size7) {
                Object obj6 = arrayList6.get(i18);
                i18++;
                a((x.e) obj6, 1, arrayList7, null);
            }
        }
        for (int i19 = 0; i19 < size; i19++) {
            x.e eVar3 = (x.e) arrayListW1.get(i19);
            if (eVar3.u0()) {
                o oVarB = b(arrayList7, eVar3.S0);
                o oVarB2 = b(arrayList7, eVar3.T0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.g(0, oVarB2);
                    oVarB2.i(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.C() == x.e.b.WRAP_CONTENT) {
            int size8 = arrayList7.size();
            oVar = null;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size8) {
                Object obj7 = arrayList7.get(i21);
                i21++;
                o oVar3 = (o) obj7;
                if (oVar3.d() != 1) {
                    oVar3.h(false);
                    int iF = oVar3.f(fVar.Q1(), 0);
                    if (iF > i20) {
                        oVar = oVar3;
                        i20 = iF;
                    }
                }
            }
            if (oVar != null) {
                fVar.U0(x.e.b.FIXED);
                fVar.p1(i20);
                oVar.h(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.V() == x.e.b.WRAP_CONTENT) {
            int size9 = arrayList7.size();
            oVar2 = null;
            int i22 = 0;
            int i23 = 0;
            while (i22 < size9) {
                Object obj8 = arrayList7.get(i22);
                i22++;
                o oVar4 = (o) obj8;
                if (oVar4.d() != 0) {
                    oVar4.h(false);
                    int iF2 = oVar4.f(fVar.Q1(), 1);
                    if (iF2 > i23) {
                        oVar2 = oVar4;
                        i23 = iF2;
                    }
                }
            }
            z10 = true;
            if (oVar2 != null) {
                fVar.l1(x.e.b.FIXED);
                fVar.Q0(i23);
                oVar2.h(true);
            }
            if (oVar == null || oVar2 != null) {
                return z10;
            }
            return false;
        }
        z10 = true;
        oVar2 = null;
        if (oVar == null) {
        }
        return z10;
    }

    public static boolean d(x.e.b bVar, x.e.b bVar2, x.e.b bVar3, x.e.b bVar4) {
        x.e.b bVar5;
        x.e.b bVar6;
        x.e.b bVar7 = x.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = x.e.b.WRAP_CONTENT) || (bVar3 == x.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = x.e.b.WRAP_CONTENT) || (bVar4 == x.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
