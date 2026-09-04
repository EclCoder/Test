package em;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface o extends kl.f {
    static /* synthetic */ boolean v(o oVar, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return oVar.n(th2);
    }

    boolean h();

    void i(Function1 function1);

    Object m(Throwable th2);

    boolean n(Throwable th2);

    void p(Object obj, Function3 function3);

    void u(k0 k0Var, Object obj);

    Object x(Object obj, Object obj2, Function3 function3);

    void z(Object obj);
}
