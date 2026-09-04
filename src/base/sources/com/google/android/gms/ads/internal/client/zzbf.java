package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbf extends zzbee implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(zze zzeVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        zzda(7, zza());
    }
}
