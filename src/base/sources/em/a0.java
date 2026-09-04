package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {
    public static final y a(z1 z1Var) {
        return new z(z1Var);
    }

    public static final y b(Object obj) {
        z zVar = new z(null);
        zVar.s(obj);
        return zVar;
    }

    public static /* synthetic */ y c(z1 z1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z1Var = null;
        }
        return a(z1Var);
    }

    public static final boolean d(y yVar, Object obj) {
        Throwable thE = fl.r.e(obj);
        return thE == null ? yVar.s(obj) : yVar.r(thE);
    }
}
