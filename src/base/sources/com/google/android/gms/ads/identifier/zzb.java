package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzb extends Thread {
    final CountDownLatch zza = new CountDownLatch(1);
    boolean zzb = false;
    private final WeakReference<AdvertisingIdClient> zzc;
    private final long zzd;

    public zzb(AdvertisingIdClient advertisingIdClient, long j10) {
        this.zzc = new WeakReference<>(advertisingIdClient);
        this.zzd = j10;
        start();
    }

    private final void zza() {
        AdvertisingIdClient advertisingIdClient = this.zzc.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.zzb = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.zza.await(this.zzd, TimeUnit.MILLISECONDS)) {
                return;
            }
            zza();
        } catch (InterruptedException unused) {
            zza();
        }
    }
}
