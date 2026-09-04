package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzls {
    private static final Object zza = new Object();
    private static volatile boolean zzb = false;
    private static volatile zzlr zzc = null;
    private static volatile boolean zzd = false;
    private static volatile zzlr zze;

    static void zza() {
        zzd = true;
    }

    static boolean zzb() {
        synchronized (zza) {
        }
        return false;
    }

    static void zzc() {
        if (zze == null) {
            zze = new zzlr(null);
        }
    }

    static void zzd() {
        if (zzc == null) {
            zzc = new zzlr(null);
        }
    }
}
