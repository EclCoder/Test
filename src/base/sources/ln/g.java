package ln;

import gn.h0;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44737a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f44738b = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends g {
        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f44738b;
        }

        private b() {
        }
    }

    public void b(gn.k connection, h0 route, gn.e call) {
        kotlin.jvm.internal.s.h(connection, "connection");
        kotlin.jvm.internal.s.h(route, "route");
        kotlin.jvm.internal.s.h(call, "call");
    }

    public void c(h0 route, gn.e call, IOException failure) {
        kotlin.jvm.internal.s.h(route, "route");
        kotlin.jvm.internal.s.h(call, "call");
        kotlin.jvm.internal.s.h(failure, "failure");
    }

    public void d(h0 route, gn.e call) {
        kotlin.jvm.internal.s.h(route, "route");
        kotlin.jvm.internal.s.h(call, "call");
    }

    public void e(gn.k connection, gn.e call) {
        kotlin.jvm.internal.s.h(connection, "connection");
        kotlin.jvm.internal.s.h(call, "call");
    }

    public void f(gn.k connection) {
        kotlin.jvm.internal.s.h(connection, "connection");
    }

    public void g(gn.k connection, gn.e call) {
        kotlin.jvm.internal.s.h(connection, "connection");
        kotlin.jvm.internal.s.h(call, "call");
    }

    public void h(gn.k connection) {
        kotlin.jvm.internal.s.h(connection, "connection");
    }
}
