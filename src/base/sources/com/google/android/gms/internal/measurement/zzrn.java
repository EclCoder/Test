package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrn {
    private static final Object zza = new Object();
    private static Thread zzb;
    private static volatile Handler zzc;

    public static boolean zza(Thread thread) {
        if (zzb == null) {
            zzb = Looper.getMainLooper().getThread();
        }
        return thread == zzb;
    }

    public static Handler zzb() {
        if (zzc == null) {
            synchronized (zza) {
                try {
                    if (zzc == null) {
                        zzc = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zzc;
    }
}
