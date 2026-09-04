package tm;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f53542a = z1.i();

    public static final rm.f a(String serialName, rm.e kind) {
        kotlin.jvm.internal.s.h(serialName, "serialName");
        kotlin.jvm.internal.s.h(kind, "kind");
        c(serialName);
        return new m2(serialName, kind);
    }

    public static final pm.d b(zl.c cVar) {
        kotlin.jvm.internal.s.h(cVar, "<this>");
        return (pm.d) f53542a.get(cVar);
    }

    private static final void c(String str) {
        for (pm.d dVar : f53542a.values()) {
            if (kotlin.jvm.internal.s.c(str, dVar.getDescriptor().i())) {
                throw new IllegalArgumentException(bm.r.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + kotlin.jvm.internal.l0.b(dVar.getClass()).k() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
