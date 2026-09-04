package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzfg implements Runnable {
    final /* synthetic */ zzfh zza;

    zzfg(zzfh zzfhVar) {
        Objects.requireNonNull(zzfhVar);
        this.zza = zzfhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfh zzfhVar = this.zza;
        if (zzfhVar.zzL() != null) {
            try {
                zzfhVar.zzL().zzc(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
