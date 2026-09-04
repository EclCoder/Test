package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcq extends zzbee implements zzcs {
    zzcq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzb(zze zzeVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzeVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzc() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzd() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zzf() {
        zzda(5, zza());
    }
}
