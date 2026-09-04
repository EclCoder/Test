package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbgw implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbgx zza;

    zzbgw(zzbgx zzbgxVar) {
        Objects.requireNonNull(zzbgxVar);
        this.zza = zzbgxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbgx zzbgxVar = this.zza;
        synchronized (zzbgxVar.zzh()) {
            try {
                zzbgxVar.zzk(null);
                if (zzbgxVar.zzi() != null) {
                    zzbgxVar.zzj(null);
                }
                zzbgxVar.zzh().notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
