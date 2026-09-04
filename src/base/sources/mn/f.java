package mn;

import com.google.api.client.http.HttpMethods;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f46483a = new f();

    private f() {
    }

    public static final boolean a(String method) {
        s.h(method, "method");
        return s.c(method, HttpMethods.POST) || s.c(method, HttpMethods.PATCH) || s.c(method, HttpMethods.PUT) || s.c(method, HttpMethods.DELETE) || s.c(method, "MOVE");
    }

    public static final boolean c(String method) {
        s.h(method, "method");
        return (s.c(method, HttpMethods.GET) || s.c(method, HttpMethods.HEAD)) ? false : true;
    }

    public static final boolean f(String method) {
        s.h(method, "method");
        return s.c(method, HttpMethods.POST) || s.c(method, HttpMethods.PUT) || s.c(method, HttpMethods.PATCH) || s.c(method, "PROPPATCH") || s.c(method, "QUERY") || s.c(method, "REPORT");
    }

    public final boolean b(String requestMethod) {
        s.h(requestMethod, "requestMethod");
        return s.c(requestMethod, HttpMethods.GET) || s.c(requestMethod, "QUERY");
    }

    public final boolean d(String method) {
        s.h(method, "method");
        return !s.c(method, "PROPFIND");
    }

    public final boolean e(String method) {
        s.h(method, "method");
        return s.c(method, "PROPFIND");
    }
}
