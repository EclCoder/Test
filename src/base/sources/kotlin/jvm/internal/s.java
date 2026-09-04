package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {
    }

    public static boolean a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean b(Float f10, Float f11) {
        if (f10 == null) {
            return f11 == null;
        }
        return f11 != null && f10.floatValue() == f11.floatValue();
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) n(new IllegalStateException(str + " must not be null")));
    }

    public static void e(Object obj) {
        if (obj == null) {
            q();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) n(new NullPointerException(str + " must not be null")));
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static int i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int j(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    private static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = s.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void l() {
        t();
    }

    public static void m(int i10, String str) {
        t();
    }

    private static Throwable n(Throwable th2) {
        return o(th2, s.class.getName());
    }

    static Throwable o(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th2;
    }

    public static String p(String str, Object obj) {
        return str + obj;
    }

    public static void q() {
        throw ((NullPointerException) n(new NullPointerException()));
    }

    public static void r(String str) {
        throw ((NullPointerException) n(new NullPointerException(str)));
    }

    private static void s(String str) {
        throw ((NullPointerException) n(new NullPointerException(k(str))));
    }

    public static void t() {
        u("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void u(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void v(String str) {
        throw ((UninitializedPropertyAccessException) n(new UninitializedPropertyAccessException(str)));
    }

    public static void w(String str) {
        v("lateinit property " + str + " has not been initialized");
    }
}
