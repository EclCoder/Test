package jm;

import em.i2;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {
    private static final u a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ u b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(i2 i2Var) {
        return i2Var.X0() instanceof u;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final i2 e(r rVar, List list) {
        try {
            return rVar.b(list);
        } catch (Throwable th2) {
            return a(th2, rVar.a());
        }
    }
}
