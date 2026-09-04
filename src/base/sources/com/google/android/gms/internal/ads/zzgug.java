package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgug {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb;

    static {
        Object objZzc = zzc();
        zzb = objZzc;
        if (objZzc != null) {
            zze("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (objZzc == null) {
            return;
        }
        zzd(objZzc);
    }

    public static void zza(Throwable th2, Class cls) throws Throwable {
        if (cls.isInstance(th2)) {
            throw ((Throwable) cls.cast(th2));
        }
    }

    public static void zzb(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }

    private static Object zzc() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method zzd(Object obj) {
        try {
            Method methodZze = zze("getStackTraceDepth", Throwable.class);
            if (methodZze == null) {
                return null;
            }
            methodZze.invoke(obj, new Throwable());
            return methodZze;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Method zze(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }
}
