package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbsi extends zzbee implements zzbsk {
    zzbsi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zze(zzbse zzbseVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbseVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zzf(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
