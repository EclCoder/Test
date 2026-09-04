package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcby extends zzbee implements zzcca {
    zzcby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzf(IObjectWrapper iObjectWrapper, int i10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzh(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzk(IObjectWrapper iObjectWrapper, zzccb zzccbVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzbeg.zzc(parcelZza, zzccbVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzl(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzm(IObjectWrapper iObjectWrapper, int i10) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i10);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzn(IObjectWrapper iObjectWrapper) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzo(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final void zzp(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(13, parcelZza);
    }
}
