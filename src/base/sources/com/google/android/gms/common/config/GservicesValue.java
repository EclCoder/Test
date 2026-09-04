package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    protected final String zza;
    protected final Object zzb;
    private Object zzd = null;

    protected GservicesValue(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    public static GservicesValue<Float> value(String str, Float f10) {
        return new zzd(str, f10);
    }

    public final T get() {
        T t10;
        T t11 = (T) this.zzd;
        if (t11 != null) {
            return t11;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        }
        try {
            t10 = (T) zza(this.zza);
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Object objZza = zza(this.zza);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                t10 = (T) objZza;
            } catch (Throwable th3) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th3;
            }
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return t10;
    }

    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    public void override(T t10) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = t10;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    public void resetOverride() {
        this.zzd = null;
    }

    protected abstract Object zza(String str);

    public static GservicesValue<Integer> value(String str, Integer num) {
        return new zzc(str, num);
    }

    public static GservicesValue<Long> value(String str, Long l10) {
        return new zzb(str, l10);
    }

    public static GservicesValue<String> value(String str, String str2) {
        return new zze(str, str2);
    }

    public static GservicesValue<Boolean> value(String str, boolean z10) {
        return new zza(str, Boolean.valueOf(z10));
    }
}
