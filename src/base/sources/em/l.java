package em;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l {
    public static final Object a(kl.j jVar, tl.o oVar) {
        i1 i1VarA;
        kl.j jVarJ;
        if (((kl.g) jVar.get(kl.g.f43529z2)) == null) {
            i1VarA = w2.f38068a.b();
            jVarJ = i0.j(s1.f38055a, jVar.plus(i1VarA));
        } else {
            i1VarA = w2.f38068a.a();
            jVarJ = i0.j(s1.f38055a, jVar);
        }
        return i.g(jVarJ, i1VarA, oVar);
    }

    public static /* synthetic */ Object b(kl.j jVar, tl.o oVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        return i.h(jVar, oVar);
    }
}
