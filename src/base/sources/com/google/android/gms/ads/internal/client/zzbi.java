package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbi extends zzbee implements zzbk {
    zzbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(zze zzeVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzeVar);
        zzda(2, parcelZza);
    }
}
