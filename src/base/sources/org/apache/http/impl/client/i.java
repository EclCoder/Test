package org.apache.http.impl.client;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class i implements InvocationHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Constructor f49289b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final co.q f49290a;

    static {
        try {
            f49289b = Proxy.getProxyClass(i.class.getClassLoader(), io.c.class).getConstructor(InvocationHandler.class);
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        }
    }

    i(co.q qVar) {
        this.f49290a = qVar;
    }

    public static io.c b(co.q qVar) {
        try {
            return (io.c) f49289b.newInstance(new i(qVar));
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (InvocationTargetException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public void a() throws IOException {
        ip.e.a(this.f49290a.getEntity());
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("close")) {
            a();
            return null;
        }
        try {
            return method.invoke(this.f49290a, objArr);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e10;
        }
    }
}
