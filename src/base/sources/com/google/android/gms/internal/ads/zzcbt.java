package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcbt extends zzbee implements zzcbv {
    zzcbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzg() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzh() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzi(zzcbp zzcbpVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzcbpVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzj() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzk(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzl() {
        zzda(8, zza());
    }
}
