package c4;

import fl.g0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import pm.t;
import rm.f;
import rm.n;
import y3.p1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    private static final void b(pm.d dVar, Map map, Function3 function3) {
        int iE = dVar.getDescriptor().e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = dVar.getDescriptor().f(i10);
            p1 p1Var = (p1) map.get(strF);
            if (p1Var == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + strF + ']').toString());
            }
            function3.invoke(Integer.valueOf(i10), strF, p1Var);
        }
    }

    public static final int c(pm.d dVar) {
        s.h(dVar, "<this>");
        int iHashCode = dVar.getDescriptor().i().hashCode();
        int iE = dVar.getDescriptor().e();
        for (int i10 = 0; i10 < iE; i10++) {
            iHashCode = (iHashCode * 31) + dVar.getDescriptor().f(i10).hashCode();
        }
        return iHashCode;
    }

    public static final String d(Object route, Map typeMap) {
        s.h(route, "route");
        s.h(typeMap, "typeMap");
        pm.d dVarC = t.c(l0.b(route.getClass()));
        final Map mapK = new b(dVarC, typeMap).K(route);
        final a aVar = new a(dVarC);
        b(dVarC, typeMap, new Function3() { // from class: c4.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return d.e(mapK, aVar, ((Integer) obj).intValue(), (String) obj2, (p1) obj3);
            }
        });
        return aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 e(Map map, a aVar, int i10, String argName, p1 navType) {
        s.h(argName, "argName");
        s.h(navType, "navType");
        Object obj = map.get(argName);
        s.e(obj);
        aVar.c(i10, argName, navType, (List) obj);
        return g0.f38750a;
    }

    public static final boolean f(f fVar) {
        s.h(fVar, "<this>");
        return s.c(fVar.d(), n.a.f51421a) && fVar.isInline() && fVar.e() == 1;
    }
}
