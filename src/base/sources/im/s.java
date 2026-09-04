package im;

import em.z1;
import jm.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {
    public static final void b(final p pVar, kl.j jVar) {
        if (((Number) jVar.fold(0, new tl.o() { // from class: im.r
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(s.c(pVar, ((Integer) obj).intValue(), (kl.j.b) obj2));
            }
        })).intValue() == pVar.f41539t) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + pVar.f41538s + ",\n\t\tbut emission happened in " + jVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(p pVar, int i10, kl.j.b bVar) {
        kl.j.c key = bVar.getKey();
        kl.j.b bVar2 = pVar.f41538s.get(key);
        if (key != z1.f38078x2) {
            if (bVar != bVar2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        z1 z1Var = (z1) bVar2;
        kotlin.jvm.internal.s.f(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        z1 z1VarD = d((z1) bVar, z1Var);
        if (z1VarD == z1Var) {
            return z1Var == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + z1VarD + ", expected child of " + z1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    public static final z1 d(z1 z1Var, z1 z1Var2) {
        while (z1Var != null) {
            if (z1Var == z1Var2 || !(z1Var instanceof z)) {
                return z1Var;
            }
            z1Var = ((z) z1Var).X();
        }
        return null;
    }
}
