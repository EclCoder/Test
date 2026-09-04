package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import sc.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzxh {
    private static final b0 zza;

    static {
        b0 zzxgVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzxgVar = new zzxf();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzxgVar = new zzxg();
        }
        zza = zzxgVar;
    }

    public static b0 zza() {
        return zza;
    }
}
