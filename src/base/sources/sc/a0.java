package sc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f52278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f52279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f52280c;

    static {
        Object objB = b();
        f52278a = objB;
        f52279b = objB == null ? null : a();
        f52280c = objB != null ? d(objB) : null;
    }

    private static Method a() {
        return c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    private static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Object obj) {
        try {
            Method methodC = c("getStackTraceDepth", Throwable.class);
            if (methodC == null) {
                return null;
            }
            methodC.invoke(obj, new Throwable());
            return methodC;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static RuntimeException e(Throwable th2) {
        j(th2);
        throw new RuntimeException(th2);
    }

    public static void f(Throwable th2, Class cls) throws Throwable {
        if (th2 != null) {
            i(th2, cls);
        }
    }

    public static void g(Throwable th2) {
        if (th2 != null) {
            j(th2);
        }
    }

    public static void h(Throwable th2, Class cls) throws Throwable {
        f(th2, cls);
        g(th2);
    }

    public static void i(Throwable th2, Class cls) throws Throwable {
        p.o(th2);
        if (cls.isInstance(th2)) {
            throw ((Throwable) cls.cast(th2));
        }
    }

    public static void j(Throwable th2) {
        p.o(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
