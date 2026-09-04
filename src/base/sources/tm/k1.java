package tm;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SoftReference f53528a = new SoftReference(null);

    public final synchronized Object a(tl.a factory) {
        kotlin.jvm.internal.s.h(factory, "factory");
        Object obj = this.f53528a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = factory.invoke();
        this.f53528a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
