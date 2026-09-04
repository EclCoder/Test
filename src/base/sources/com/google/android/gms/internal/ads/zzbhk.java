package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbhk implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcfw zza;
    final /* synthetic */ zzbhl zzb;

    zzbhk(zzbhl zzbhlVar, zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        Objects.requireNonNull(zzbhlVar);
        this.zzb = zzbhlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
