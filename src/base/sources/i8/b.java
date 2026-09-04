package i8;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f41179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final ThreadLocal f41180b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f41179a = zEquals ? j.a() : null;
        f41180b = new ThreadLocal();
    }

    public static a a() {
        ThreadLocal threadLocal = f41180b;
        SoftReference softReference = (SoftReference) threadLocal.get();
        a aVar = softReference == null ? null : (a) softReference.get();
        if (aVar == null) {
            aVar = new a();
            j jVar = f41179a;
            threadLocal.set(jVar != null ? jVar.c(aVar) : new SoftReference(aVar));
        }
        return aVar;
    }
}
