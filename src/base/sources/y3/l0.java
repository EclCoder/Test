package y3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends androidx.lifecycle.p1 implements t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f57228c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f57229b = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 a(androidx.lifecycle.t1 viewModelStore) {
            kotlin.jvm.internal.s.h(viewModelStore, "viewModelStore");
            return (l0) androidx.lifecycle.s1.b.c(androidx.lifecycle.s1.f4482b, viewModelStore, n0.f57258a, null, 4, null).c(kotlin.jvm.internal.l0.b(l0.class));
        }

        private a() {
        }
    }

    @Override // y3.t1
    public androidx.lifecycle.t1 b(String backStackEntryId) {
        kotlin.jvm.internal.s.h(backStackEntryId, "backStackEntryId");
        androidx.lifecycle.t1 t1Var = (androidx.lifecycle.t1) this.f57229b.get(backStackEntryId);
        if (t1Var != null) {
            return t1Var;
        }
        androidx.lifecycle.t1 t1Var2 = new androidx.lifecycle.t1();
        this.f57229b.put(backStackEntryId, t1Var2);
        return t1Var2;
    }

    @Override // androidx.lifecycle.p1
    protected void g() {
        Iterator it = this.f57229b.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.t1) it.next()).a();
        }
        this.f57229b.clear();
    }

    public final void j(String backStackEntryId) {
        kotlin.jvm.internal.s.h(backStackEntryId, "backStackEntryId");
        androidx.lifecycle.t1 t1Var = (androidx.lifecycle.t1) this.f57229b.remove(backStackEntryId);
        if (t1Var != null) {
            t1Var.a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(bm.l0.a(fl.z.b(b4.c0.a(this)), 16));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f57229b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }
}
