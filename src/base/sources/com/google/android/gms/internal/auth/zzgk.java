package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgk {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzgz zzc;
    private static final zzgz zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzgz zzgzVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzgzVar = (zzgz) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzgzVar;
        zzd = new zzhb();
    }

    public static zzgz zza() {
        return zzc;
    }

    public static zzgz zzb() {
        return zzd;
    }

    static Object zzc(Object obj, int i10, int i11, Object obj2, zzgz zzgzVar) {
        if (obj2 == null) {
            obj2 = zzgzVar.zza(obj);
        }
        zzgzVar.zzd(obj2, i10, i11);
        return obj2;
    }

    static void zzd(zzgz zzgzVar, Object obj, Object obj2) {
        zzgzVar.zzf(obj, zzgzVar.zzc(zzgzVar.zzb(obj), zzgzVar.zzb(obj2)));
    }

    public static void zze(Class cls) {
        Class cls2;
        if (!zzev.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzf(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
