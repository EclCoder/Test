package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbfi implements Runnable {
    final /* synthetic */ zzbfj zza;

    zzbfi(zzbfj zzbfjVar) {
        Objects.requireNonNull(zzbfjVar);
        this.zza = zzbfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfj zzbfjVar = this.zza;
        synchronized (zzbfjVar.zzf()) {
            if (zzbfjVar.zzg().get() && zzbfjVar.zzh()) {
                zzbfjVar.zzg().set(false);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App went background");
                Iterator it = zzbfjVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbfk) it.next()).zza(false);
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                    }
                }
            } else {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("App is still foreground");
            }
        }
    }
}
