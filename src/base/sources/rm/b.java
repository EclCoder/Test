package rm;

import kotlin.jvm.internal.s;
import tm.p2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final zl.c a(f fVar) {
        s.h(fVar, "<this>");
        if (fVar instanceof c) {
            return ((c) fVar).f51386b;
        }
        if (fVar instanceof p2) {
            return a(((p2) fVar).k());
        }
        return null;
    }

    public static final f b(vm.b bVar, f descriptor) {
        pm.d dVarC;
        s.h(bVar, "<this>");
        s.h(descriptor, "descriptor");
        zl.c cVarA = a(descriptor);
        if (cVarA == null || (dVarC = vm.b.c(bVar, cVarA, null, 2, null)) == null) {
            return null;
        }
        return dVarC.getDescriptor();
    }

    public static final f c(f fVar, zl.c context) {
        s.h(fVar, "<this>");
        s.h(context, "context");
        return new c(fVar, context);
    }
}
