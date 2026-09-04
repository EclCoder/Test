package ln;

import gn.h0;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f44846a = new LinkedHashSet();

    public final synchronized void a(h0 route) {
        kotlin.jvm.internal.s.h(route, "route");
        this.f44846a.remove(route);
    }

    public final synchronized void b(h0 failedRoute) {
        kotlin.jvm.internal.s.h(failedRoute, "failedRoute");
        this.f44846a.add(failedRoute);
    }

    public final synchronized boolean c(h0 route) {
        kotlin.jvm.internal.s.h(route, "route");
        return this.f44846a.contains(route);
    }
}
