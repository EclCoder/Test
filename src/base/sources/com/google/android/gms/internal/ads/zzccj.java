package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzccj extends zzbee implements zzccl {
    zzccj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzg(zzccf zzccfVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzccfVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzh(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzeVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzj() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzk() {
        zzda(7, zza());
    }
}
