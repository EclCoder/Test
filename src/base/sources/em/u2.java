package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u2 {
    public static final b0 a(z1 z1Var) {
        return new t2(z1Var);
    }

    public static /* synthetic */ b0 b(z1 z1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z1Var = null;
        }
        return a(z1Var);
    }

    public static final Object c(tl.o oVar, kl.f fVar) {
        s2 s2Var = new s2(fVar.getContext(), fVar);
        Object objE = km.b.e(s2Var, s2Var, oVar);
        if (objE == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objE;
    }
}
