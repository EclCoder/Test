package em;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {
    public static final Object a(kl.j jVar, tl.o oVar) {
        return i.h(jVar, oVar);
    }

    public static /* synthetic */ Object b(kl.j jVar, tl.o oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        return i.e(jVar, oVar);
    }

    public static final Object c(kl.j jVar, i1 i1Var, tl.o oVar) {
        g gVar = new g(jVar, Thread.currentThread(), i1Var);
        gVar.T0(q0.DEFAULT, gVar, oVar);
        return gVar.U0();
    }
}
