package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b1 {
    public static final void a(a1 a1Var, int i10) {
        kl.f fVarC = a1Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(fVarC instanceof jm.h) || b(i10) != b(a1Var.f37958c)) {
            d(a1Var, fVarC, z10);
            return;
        }
        jm.h hVar = (jm.h) fVarC;
        k0 k0Var = hVar.f42648d;
        kl.j context = hVar.getContext();
        if (jm.i.d(k0Var, context)) {
            jm.i.c(k0Var, context, a1Var);
        } else {
            e(a1Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(a1 a1Var, kl.f fVar, boolean z10) {
        Object objE;
        Object objG = a1Var.g();
        Throwable thD = a1Var.d(objG);
        if (thD != null) {
            fl.r.a aVar = fl.r.f38769b;
            objE = fl.s.a(thD);
        } else {
            fl.r.a aVar2 = fl.r.f38769b;
            objE = a1Var.e(objG);
        }
        Object objB = fl.r.b(objE);
        if (!z10) {
            fVar.resumeWith(objB);
            return;
        }
        kotlin.jvm.internal.s.f(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        jm.h hVar = (jm.h) fVar;
        kl.f fVar2 = hVar.f42649e;
        Object obj = hVar.f42651g;
        kl.j context = fVar2.getContext();
        Object objI = jm.k0.i(context, obj);
        b3 b3VarM = objI != jm.k0.f42663a ? i0.m(fVar2, context, objI) : null;
        try {
            hVar.f42649e.resumeWith(objB);
            fl.g0 g0Var = fl.g0.f38750a;
        } finally {
            if (b3VarM == null || b3VarM.V0()) {
                jm.k0.f(context, objI);
            }
        }
    }

    private static final void e(a1 a1Var) {
        i1 i1VarB = w2.f38068a.b();
        if (i1VarB.e1()) {
            i1VarB.a1(a1Var);
            return;
        }
        i1VarB.c1(true);
        try {
            d(a1Var, a1Var.c(), true);
            do {
            } while (i1VarB.h1());
        } catch (Throwable th2) {
            try {
                a1Var.f(th2);
            } finally {
                i1VarB.X0(true);
            }
        }
    }
}
