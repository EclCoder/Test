package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzj {
    public static Object zza(Class cls, String str, zzi... zziVarArr) {
        return zzc(cls, "isIsolated", null, false, zziVarArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z10, zzi... zziVarArr) {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < zziVarArr.length; i10++) {
            zzi zziVar = zziVarArr[i10];
            zziVar.getClass();
            clsArr[i10] = zziVar.zzc();
            objArr[i10] = zziVarArr[i10].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
