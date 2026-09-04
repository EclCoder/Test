package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m0 f43599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zl.c[] f43600b;

    static {
        m0 m0Var = null;
        try {
            m0Var = (m0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m0Var == null) {
            m0Var = new m0();
        }
        f43599a = m0Var;
        f43600b = new zl.c[0];
    }

    public static zl.f a(o oVar) {
        return f43599a.a(oVar);
    }

    public static zl.c b(Class cls) {
        return f43599a.b(cls);
    }

    public static zl.e c(Class cls) {
        return f43599a.c(cls, "");
    }

    public static zl.l d(zl.l lVar) {
        return f43599a.d(lVar);
    }

    public static zl.g e(v vVar) {
        return f43599a.e(vVar);
    }

    public static zl.h f(z zVar) {
        return f43599a.f(zVar);
    }

    public static zl.i g(b0 b0Var) {
        return f43599a.g(b0Var);
    }

    public static zl.j h(d0 d0Var) {
        return f43599a.h(d0Var);
    }

    public static String i(n nVar) {
        return f43599a.i(nVar);
    }

    public static String j(t tVar) {
        return f43599a.j(tVar);
    }

    public static zl.l k(Class cls) {
        return f43599a.k(b(cls), Collections.EMPTY_LIST, false);
    }

    public static zl.l l(Class cls, zl.m mVar) {
        return f43599a.k(b(cls), Collections.singletonList(mVar), false);
    }

    public static zl.l m(Class cls, zl.m mVar, zl.m mVar2) {
        return f43599a.k(b(cls), Arrays.asList(mVar, mVar2), false);
    }
}
