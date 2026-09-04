package em;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k {
    public static final v0 a(o0 o0Var, kl.j jVar, q0 q0Var, tl.o oVar) {
        kl.j jVarJ = i0.j(o0Var, jVar);
        w0 g2Var = q0Var.g() ? new g2(jVarJ, oVar) : new w0(jVarJ, true);
        g2Var.T0(q0Var, g2Var, oVar);
        return g2Var;
    }

    public static /* synthetic */ v0 b(o0 o0Var, kl.j jVar, q0 q0Var, tl.o oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        if ((i10 & 2) != 0) {
            q0Var = q0.DEFAULT;
        }
        return i.a(o0Var, jVar, q0Var, oVar);
    }

    public static final z1 c(o0 o0Var, kl.j jVar, q0 q0Var, tl.o oVar) {
        kl.j jVarJ = i0.j(o0Var, jVar);
        r2 h2Var = q0Var.g() ? new h2(jVarJ, oVar) : new r2(jVarJ, true);
        h2Var.T0(q0Var, h2Var, oVar);
        return h2Var;
    }

    public static /* synthetic */ z1 d(o0 o0Var, kl.j jVar, q0 q0Var, tl.o oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        if ((i10 & 2) != 0) {
            q0Var = q0.DEFAULT;
        }
        return i.c(o0Var, jVar, q0Var, oVar);
    }

    public static final Object e(kl.j jVar, tl.o oVar, kl.f fVar) {
        Object objV0;
        kl.j context = fVar.getContext();
        kl.j jVarK = i0.k(context, jVar);
        b2.h(jVarK);
        if (jVarK == context) {
            jm.z zVar = new jm.z(jVarK, fVar);
            objV0 = km.b.e(zVar, zVar, oVar);
        } else {
            kl.g.b bVar = kl.g.f43529z2;
            if (kotlin.jvm.internal.s.c(jVarK.get(bVar), context.get(bVar))) {
                b3 b3Var = new b3(jVarK, fVar);
                kl.j context2 = b3Var.getContext();
                Object objI = jm.k0.i(context2, null);
                try {
                    Object objE = km.b.e(b3Var, b3Var, oVar);
                    jm.k0.f(context2, objI);
                    objV0 = objE;
                } catch (Throwable th2) {
                    jm.k0.f(context2, objI);
                    throw th2;
                }
            } else {
                z0 z0Var = new z0(jVarK, fVar);
                km.a.c(oVar, z0Var, z0Var);
                objV0 = z0Var.V0();
            }
        }
        if (objV0 == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objV0;
    }
}
