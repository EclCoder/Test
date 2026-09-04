package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgv implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbgx zza;

    zzbgv(zzbgx zzbgxVar) {
        Objects.requireNonNull(zzbgxVar);
        this.zza = zzbgxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbgx zzbgxVar = this.zza;
        synchronized (zzbgxVar.zzh()) {
            try {
                if (zzbgxVar.zzi() != null) {
                    zzbgxVar.zzk(zzbgxVar.zzi().zzq());
                }
            } catch (DeadObjectException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e10);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        zzbgx zzbgxVar = this.zza;
        synchronized (zzbgxVar.zzh()) {
            zzbgxVar.zzk(null);
            zzbgxVar.zzh().notifyAll();
        }
    }
}
