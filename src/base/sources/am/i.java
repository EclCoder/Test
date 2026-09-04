package am;

import fl.g0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public abstract Object a(Object obj, kl.f fVar);

    public final Object b(g gVar, kl.f fVar) {
        Object objC = c(gVar.iterator(), fVar);
        return objC == ll.b.f() ? objC : g0.f38750a;
    }

    public abstract Object c(Iterator it, kl.f fVar);
}
