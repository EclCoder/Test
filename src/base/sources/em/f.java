package em;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final Object a(Collection collection, kl.f fVar) {
        return collection.isEmpty() ? gl.r.l() : new e((v0[]) collection.toArray(new v0[0])).c(fVar);
    }
}
