package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzq implements zzjq {
    public final com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzq(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzic zzicVar = this.zzb.zza;
            if (zzicVar != null) {
                zzicVar.zzaW().zze().zzb("Event listener threw exception", e10);
            }
        }
    }
}
