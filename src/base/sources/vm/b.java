package vm;

import gl.r;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pm.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ pm.d c(b bVar, zl.c cVar, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = r.l();
        }
        return bVar.b(cVar, list);
    }

    public abstract void a(d dVar);

    public abstract pm.d b(zl.c cVar, List list);

    public abstract boolean d();

    public abstract pm.c e(zl.c cVar, String str);

    public abstract l f(zl.c cVar, Object obj);

    private b() {
    }
}
