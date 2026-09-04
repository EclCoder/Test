package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 {
    public static Collection a(Object obj) {
        if ((obj instanceof ul.a) && !(obj instanceof ul.b)) {
            n(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof ul.a) && !(obj instanceof ul.c)) {
            n(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof ul.a) && !(obj instanceof ul.d)) {
            n(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof ul.a) && !(obj instanceof ul.e)) {
            n(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            n(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof n) {
            return ((n) obj).getArity();
        }
        if (obj instanceof tl.a) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof tl.o) {
            return 2;
        }
        return obj instanceof Function3 ? 3 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof fl.g) && j(obj) == i10;
    }

    private static Throwable l(Throwable th2) {
        return s.o(th2, p0.class.getName());
    }

    public static ClassCastException m(ClassCastException classCastException) {
        throw ((ClassCastException) l(classCastException));
    }

    public static void n(Object obj, String str) {
        o((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void o(String str) {
        throw m(new ClassCastException(str));
    }
}
