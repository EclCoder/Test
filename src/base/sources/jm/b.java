package jm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f42637a = new d0("CLOSED");

    public static final c b(c cVar) {
        while (true) {
            Object objG = cVar.g();
            if (objG == f42637a) {
                return cVar;
            }
            c cVar2 = (c) objG;
            if (cVar2 != null) {
                cVar = cVar2;
            } else if (cVar.m()) {
                return cVar;
            }
        }
    }

    public static final Object c(a0 a0Var, long j10, tl.o oVar) {
        while (true) {
            if (a0Var.f42636c >= j10 && !a0Var.k()) {
                return b0.a(a0Var);
            }
            Object objG = a0Var.g();
            if (objG == f42637a) {
                return b0.a(f42637a);
            }
            a0 a0Var2 = (a0) ((c) objG);
            if (a0Var2 == null) {
                a0Var2 = (a0) oVar.invoke(Long.valueOf(a0Var.f42636c + 1), a0Var);
                if (a0Var.o(a0Var2)) {
                    if (a0Var.k()) {
                        a0Var.n();
                    }
                }
            }
            a0Var = a0Var2;
        }
    }
}
