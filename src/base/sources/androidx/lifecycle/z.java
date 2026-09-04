package androidx.lifecycle;

import em.u2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final v a(s sVar) {
        w wVar;
        kotlin.jvm.internal.s.h(sVar, "<this>");
        do {
            w wVar2 = (w) sVar.c().b();
            if (wVar2 != null) {
                return wVar2;
            }
            wVar = new w(sVar, u2.b(null, 1, null).plus(em.c1.c().X0()));
        } while (!sVar.c().a(null, wVar));
        wVar.e();
        return wVar;
    }
}
