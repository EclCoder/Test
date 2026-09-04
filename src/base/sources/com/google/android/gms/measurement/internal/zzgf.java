package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgf extends com.google.android.gms.internal.measurement.zzbl implements zzgh {
    zzgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void zze(zzoq zzoqVar) {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(parcelZza, zzoqVar);
        zzd(2, parcelZza);
    }
}
