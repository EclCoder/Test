package gm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface u {
    static /* synthetic */ boolean f(u uVar, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return uVar.w(th2);
    }

    void d(Function1 function1);

    Object e(Object obj);

    Object o(Object obj, kl.f fVar);

    boolean w(Throwable th2);

    boolean y();
}
