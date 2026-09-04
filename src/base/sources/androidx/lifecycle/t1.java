package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4501a = new LinkedHashMap();

    public final void a() {
        Map mapT = gl.l0.t(this.f4501a);
        this.f4501a.clear();
        Iterator it = mapT.values().iterator();
        while (it.hasNext()) {
            ((p1) it.next()).e();
        }
    }

    public final p1 b(Object obj) {
        return (p1) this.f4501a.get(obj);
    }

    public final Set c() {
        return gl.r.N0(this.f4501a.keySet());
    }

    public final void d(Object obj, p1 viewModel) {
        kotlin.jvm.internal.s.h(viewModel, "viewModel");
        p1 p1Var = (p1) this.f4501a.put(obj, viewModel);
        if (p1Var != null) {
            p1Var.e();
        }
    }

    public String toString() {
        String strK = kotlin.jvm.internal.l0.b(getClass()).k();
        if (strK == null) {
            strK = "ViewModelStore";
        }
        String string = Integer.toString(hashCode(), bm.a.a(16));
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return strK + "@" + string + "(keys=" + c() + ")";
    }
}
