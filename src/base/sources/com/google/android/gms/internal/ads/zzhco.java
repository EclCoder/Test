package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhco {
    static void zza(Throwable th2) {
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    static void zzb(Throwable th2) {
        if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
            throw ((Error) th2);
        }
    }
}
