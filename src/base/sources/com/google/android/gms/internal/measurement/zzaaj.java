package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaaj extends zzaad {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzaac zzc;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class zza {
        zza() {
        }

        static boolean zza() {
            return zzaaj.zzp();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z10 = true;
        if (str != null && !"robolectric".equals(str)) {
            z10 = false;
        }
        zzb = z10;
        zzc = new zzaac() { // from class: com.google.android.gms.internal.measurement.zzaaj.1
            @Override // com.google.android.gms.internal.measurement.zzaac
            public String zza(Class<? extends zzxi<?>> cls) {
                StackTraceElement stackTraceElementZza;
                if (zzaaj.zza) {
                    try {
                        if (cls.equals(zzaaj.zzr())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzaaj.zzb || (stackTraceElementZza = zzabq.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }

            @Override // com.google.android.gms.internal.measurement.zzaac
            public zzyc zzb(Class<?> cls, int i10) {
                return zzyc.zza;
            }
        };
    }

    static boolean zzp() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> zzr() {
        return VMStack.getStackClass2();
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    protected zzaac zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    protected zzzf zze(String str) {
        return zzaao.zze(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    protected zzaat zzg() {
        return zzaap.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    protected String zzn() {
        return "platform: Android";
    }
}
