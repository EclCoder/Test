package pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.l0;
import tm.a2;
import tm.b1;
import tm.n0;
import tm.n2;
import tm.p0;
import tm.z0;
import tm.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class v {
    private static final d b(zl.c cVar, List list, tl.a aVar) {
        if (kotlin.jvm.internal.s.c(cVar, l0.b(Collection.class)) || kotlin.jvm.internal.s.c(cVar, l0.b(List.class)) || kotlin.jvm.internal.s.c(cVar, l0.b(List.class)) || kotlin.jvm.internal.s.c(cVar, l0.b(ArrayList.class))) {
            return new tm.f((d) list.get(0));
        }
        if (kotlin.jvm.internal.s.c(cVar, l0.b(HashSet.class))) {
            return new p0((d) list.get(0));
        }
        if (kotlin.jvm.internal.s.c(cVar, l0.b(Set.class)) || kotlin.jvm.internal.s.c(cVar, l0.b(Set.class)) || kotlin.jvm.internal.s.c(cVar, l0.b(LinkedHashSet.class))) {
            return new b1((d) list.get(0));
        }
        if (kotlin.jvm.internal.s.c(cVar, l0.b(HashMap.class))) {
            return new n0((d) list.get(0), (d) list.get(1));
        }
        if (kotlin.jvm.internal.s.c(cVar, l0.b(Map.class)) || kotlin.jvm.internal.s.c(cVar, l0.b(Map.class)) || kotlin.jvm.internal.s.c(cVar, l0.b(LinkedHashMap.class))) {
            return new z0((d) list.get(0), (d) list.get(1));
        }
        if (kotlin.jvm.internal.s.c(cVar, l0.b(Map.Entry.class))) {
            return qm.a.j((d) list.get(0), (d) list.get(1));
        }
        if (kotlin.jvm.internal.s.c(cVar, l0.b(fl.q.class))) {
            return qm.a.m((d) list.get(0), (d) list.get(1));
        }
        if (kotlin.jvm.internal.s.c(cVar, l0.b(fl.v.class))) {
            return qm.a.o((d) list.get(0), (d) list.get(1), (d) list.get(2));
        }
        if (!z1.o(cVar)) {
            return null;
        }
        Object objInvoke = aVar.invoke();
        kotlin.jvm.internal.s.f(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return qm.a.a((zl.c) objInvoke, (d) list.get(0));
    }

    private static final d c(zl.c cVar, List list) {
        d[] dVarArr = (d[]) list.toArray(new d[0]);
        return z1.d(cVar, (d[]) Arrays.copyOf(dVarArr, dVarArr.length));
    }

    private static final d d(d dVar, boolean z10) {
        if (z10) {
            return qm.a.t(dVar);
        }
        kotlin.jvm.internal.s.f(dVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return dVar;
    }

    public static final d e(zl.c cVar, List serializers, tl.a elementClassifierIfArray) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        kotlin.jvm.internal.s.h(serializers, "serializers");
        kotlin.jvm.internal.s.h(elementClassifierIfArray, "elementClassifierIfArray");
        d dVarB = b(cVar, serializers, elementClassifierIfArray);
        return dVarB == null ? c(cVar, serializers) : dVarB;
    }

    public static final d f(vm.b bVar, zl.l type) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(type, "type");
        d dVarH = h(bVar, type, true);
        if (dVarH != null) {
            return dVarH;
        }
        z1.p(a2.c(type));
        throw new KotlinNothingValueException();
    }

    public static final d g(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        d dVarE = t.e(cVar);
        if (dVarE != null) {
            return dVarE;
        }
        a2.f(cVar);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    private static final d h(vm.b bVar, zl.l lVar, boolean z10) {
        d dVarM;
        d dVarB;
        h hVar;
        zl.c cVarC = a2.c(lVar);
        boolean zH = lVar.h();
        List listG = lVar.g();
        final ArrayList arrayList = new ArrayList(gl.r.v(listG, 10));
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(a2.g((zl.m) it.next()));
        }
        if (arrayList.isEmpty()) {
            if (!z1.l(cVarC) || vm.b.c(bVar, cVarC, null, 2, null) == null) {
                dVarM = s.m(cVarC, zH);
            } else {
                dVarM = null;
            }
        } else if (bVar.d()) {
            dVarM = null;
        } else {
            Object objN = s.n(cVarC, arrayList, zH);
            if (fl.r.h(objN)) {
                objN = null;
            }
            dVarM = (d) objN;
        }
        if (dVarM != null) {
            return dVarM;
        }
        if (arrayList.isEmpty()) {
            dVarB = t.e(cVarC);
            if (dVarB == null && (dVarB = vm.b.c(bVar, cVarC, null, 2, null)) == null) {
                if (z1.l(cVarC)) {
                    hVar = new h(cVarC);
                    dVarB = hVar;
                } else {
                    dVarB = null;
                }
            }
        } else {
            List listF = t.f(bVar, arrayList, z10);
            if (listF == null) {
                return null;
            }
            d dVarA = t.a(cVarC, listF, new tl.a() { // from class: pm.u
                @Override // tl.a
                public final Object invoke() {
                    return v.i(arrayList);
                }
            });
            if (dVarA == null) {
                dVarB = bVar.b(cVarC, listF);
                if (dVarB == null) {
                    if (z1.l(cVarC)) {
                        hVar = new h(cVarC);
                        dVarB = hVar;
                    } else {
                        dVarB = null;
                    }
                }
            } else {
                dVarB = dVarA;
            }
        }
        if (dVarB != null) {
            return d(dVarB, zH);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zl.d i(List list) {
        return ((zl.l) list.get(0)).i();
    }

    public static final d j(vm.b bVar, zl.l type) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(type, "type");
        return h(bVar, type, false);
    }

    public static final d k(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        d dVarB = z1.b(cVar);
        return dVarB == null ? n2.b(cVar) : dVarB;
    }

    public static final List l(vm.b bVar, List typeArguments, boolean z10) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(typeArguments, "typeArguments");
        if (z10) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(t.b(bVar, (zl.l) it.next()));
            }
            return arrayList;
        }
        List list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(gl.r.v(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            d dVarD = t.d(bVar, (zl.l) it2.next());
            if (dVarD == null) {
                return null;
            }
            arrayList2.add(dVarD);
        }
        return arrayList2;
    }
}
