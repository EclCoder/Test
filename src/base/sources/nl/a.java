package nl;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import gl.j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: nl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0733a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0733a f47817a = new C0733a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f47818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f47819c;

        private C0733a() {
        }

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            s.e(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (s.c(method2.getName(), dOIDCKnIR.VqjmeLVaWpV)) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    s.g(parameterTypes, "getParameterTypes(...)");
                    if (s.c(j.o0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i10++;
            }
            f47818b = method2;
            for (Method method3 : methods) {
                if (s.c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f47819c = method;
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        s.h(cause, "cause");
        s.h(exception, "exception");
        Method method = C0733a.f47818b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public wl.c b() {
        return new wl.b();
    }
}
