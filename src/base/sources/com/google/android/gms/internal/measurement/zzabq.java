package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabq {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzabu zzb;

    static {
        zzabu zzabvVar;
        for (int i10 = 0; i10 < 2; i10++) {
            zzabvVar = null;
            try {
                zzabvVar = (zzabu) Class.forName(zza[i10]).asSubclass(zzabu.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzabvVar != null) {
                zzb = zzabvVar;
            }
        }
        zzabvVar = new zzabv();
        zzb = zzabvVar;
    }

    public static StackTraceElement zza(Class cls, int i10) {
        zzabr.zza(cls, "target");
        return zzb.zza(cls, 2);
    }

    public static StackTraceElement[] zzb(Class cls, int i10, int i11) {
        if (i10 > 0 || i10 == -1) {
            return zzb.zzb(cls, i10, 2);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}
