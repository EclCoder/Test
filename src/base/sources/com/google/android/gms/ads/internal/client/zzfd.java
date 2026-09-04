package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzfd implements Runnable {
    final /* synthetic */ zzfe zza;

    zzfd(zzfe zzfeVar) {
        Objects.requireNonNull(zzfeVar);
        this.zza = zzfeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzff zzffVar = this.zza.zza;
        if (zzffVar.zzc() != null) {
            try {
                zzffVar.zzc().zzc(1);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
