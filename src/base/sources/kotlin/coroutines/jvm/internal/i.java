package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f43564a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f43565b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f43566c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f43567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f43568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f43569c;

        public a(Method method, Method method2, Method method3) {
            this.f43567a = method;
            this.f43568b = method2;
            this.f43569c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f43566c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f43565b;
            f43566c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        s.h(continuation, "continuation");
        a aVarA = f43566c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f43565b && (method = aVarA.f43567a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f43568b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f43569c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
