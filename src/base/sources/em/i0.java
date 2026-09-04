package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {
    private static final kl.j d(kl.j jVar, kl.j jVar2, final boolean z10) {
        boolean zH = h(jVar);
        boolean zH2 = h(jVar2);
        if (!zH && !zH2) {
            return jVar.plus(jVar2);
        }
        final kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        k0Var.f43597a = jVar2;
        kl.k kVar = kl.k.f43531a;
        kl.j jVar3 = (kl.j) jVar.fold(kVar, new tl.o() { // from class: em.g0
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return i0.e(k0Var, z10, (kl.j) obj, (kl.j.b) obj2);
            }
        });
        if (zH2) {
            k0Var.f43597a = ((kl.j) k0Var.f43597a).fold(kVar, new tl.o() { // from class: em.h0
                @Override // tl.o
                public final Object invoke(Object obj, Object obj2) {
                    return i0.f((kl.j) obj, (kl.j.b) obj2);
                }
            });
        }
        return jVar3.plus((kl.j) k0Var.f43597a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kl.j e(kotlin.jvm.internal.k0 k0Var, boolean z10, kl.j jVar, kl.j.b bVar) {
        return jVar.plus(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kl.j f(kl.j jVar, kl.j.b bVar) {
        return jVar.plus(bVar);
    }

    public static final String g(kl.j jVar) {
        return null;
    }

    private static final boolean h(kl.j jVar) {
        return ((Boolean) jVar.fold(Boolean.FALSE, new tl.o() { // from class: em.f0
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(i0.i(((Boolean) obj).booleanValue(), (kl.j.b) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, kl.j.b bVar) {
        return z10;
    }

    public static final kl.j j(o0 o0Var, kl.j jVar) {
        kl.j jVarD = d(o0Var.i0(), jVar, true);
        return (jVarD == c1.a() || jVarD.get(kl.g.f43529z2) != null) ? jVarD : jVarD.plus(c1.a());
    }

    public static final kl.j k(kl.j jVar, kl.j jVar2) {
        return !h(jVar2) ? jVar.plus(jVar2) : d(jVar, jVar2, false);
    }

    public static final b3 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof z0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof b3) {
                return (b3) eVar;
            }
        }
        return null;
    }

    public static final b3 m(kl.f fVar, kl.j jVar, Object obj) {
        if (!(fVar instanceof kotlin.coroutines.jvm.internal.e) || jVar.get(c3.f37970a) == null) {
            return null;
        }
        b3 b3VarL = l((kotlin.coroutines.jvm.internal.e) fVar);
        if (b3VarL != null) {
            b3VarL.X0(jVar, obj);
        }
        return b3VarL;
    }
}
