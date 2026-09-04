package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l1 {
    public static final rm.f a(rm.f fVar, vm.b module) {
        rm.f fVarA;
        kotlin.jvm.internal.s.h(fVar, "<this>");
        kotlin.jvm.internal.s.h(module, "module");
        if (!kotlin.jvm.internal.s.c(fVar.d(), rm.m.a.f51419a)) {
            return fVar.isInline() ? a(fVar.h(0), module) : fVar;
        }
        rm.f fVarB = rm.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final k1 b(kotlinx.serialization.json.b bVar, rm.f desc) {
        kotlin.jvm.internal.s.h(bVar, "<this>");
        kotlin.jvm.internal.s.h(desc, "desc");
        rm.m mVarD = desc.d();
        if (mVarD instanceof rm.d) {
            return k1.POLY_OBJ;
        }
        if (kotlin.jvm.internal.s.c(mVarD, rm.n.b.f51422a)) {
            return k1.LIST;
        }
        if (!kotlin.jvm.internal.s.c(mVarD, rm.n.c.f51423a)) {
            return k1.OBJ;
        }
        rm.f fVarA = a(desc.h(0), bVar.a());
        rm.m mVarD2 = fVarA.d();
        if ((mVarD2 instanceof rm.e) || kotlin.jvm.internal.s.c(mVarD2, rm.m.b.f51420a)) {
            return k1.MAP;
        }
        if (bVar.e().c()) {
            return k1.LIST;
        }
        throw g0.d(fVarA);
    }
}
