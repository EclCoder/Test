package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdh {
    private static Executor zza;

    public static synchronized Executor zza() {
        try {
            if (zza == null) {
                zza = zzfl.zzg("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zza;
    }
}
