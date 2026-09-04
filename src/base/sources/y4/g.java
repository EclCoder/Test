package y4;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g extends x4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsReplyProxyBoundaryInterface f57370a;

    public g(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f57370a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new g(jsReplyProxyBoundaryInterface);
    }

    public static g b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) jp.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (g) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: y4.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.a(jsReplyProxyBoundaryInterface);
            }
        });
    }
}
