package um;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f54746a = gl.s0.h(qm.a.x(fl.z.f38788b).getDescriptor(), qm.a.y(fl.b0.f38735b).getDescriptor(), qm.a.w(fl.x.f38783b).getDescriptor(), qm.a.z(fl.e0.f38745b).getDescriptor());

    public static final boolean a(rm.f fVar) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        return fVar.isInline() && kotlin.jvm.internal.s.c(fVar, kotlinx.serialization.json.k.l());
    }

    public static final boolean b(rm.f fVar) {
        kotlin.jvm.internal.s.h(fVar, "<this>");
        return fVar.isInline() && f54746a.contains(fVar);
    }
}
