package tm;

import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final rm.f[] f53439a = new rm.f[0];

    public static final Set a(rm.f fVar) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        if (fVar instanceof n) {
            return ((n) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(fVar.f(i10));
        }
        return hashSet;
    }

    public static final rm.f[] b(List list) {
        rm.f[] fVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (rm.f[]) list.toArray(new rm.f[0])) == null) ? f53439a : fVarArr;
    }

    public static final zl.c c(zl.l lVar) {
        kotlin.jvm.internal.s.h(lVar, "<this>");
        zl.d dVarI = lVar.i();
        if (dVarI instanceof zl.c) {
            return (zl.c) dVarI;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + dVarI);
    }

    public static final String e(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        String strK = cVar.k();
        if (strK == null) {
            strK = "<local class name not available>";
        }
        return d(strK);
    }

    public static final Void f(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        throw new SerializationException(e(cVar));
    }

    public static final zl.l g(zl.m mVar) {
        kotlin.jvm.internal.s.h(mVar, "<this>");
        zl.l lVarA = mVar.a();
        if (lVarA != null) {
            return lVarA;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + mVar.a()).toString());
    }

    public static final String d(String className) {
        kotlin.jvm.internal.s.h(className, "className");
        return "Serializer for class '" + className + KPtaxpyICj.pSpoXn;
    }
}
