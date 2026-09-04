package jm;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f42645a = am.j.B(am.j.e(ServiceLoader.load(em.l0.class, em.l0.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f42645a;
    }

    public static final void b(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
        } catch (Throwable unused) {
        }
    }
}
