package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfwp implements Runnable {
    zzfwp() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfws.zzc != null) {
            zzfws.zzc.post(zzfws.zzk);
            zzfws.zzc.postDelayed(zzfws.zzl, 200L);
        }
    }
}
