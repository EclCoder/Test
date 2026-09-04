package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbgh extends zzbee implements zzbgj {
    zzbgh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzf(IObjectWrapper iObjectWrapper, zzbgq zzbgqVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzbeg.zze(parcelZza, zzbgqVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzb = com.google.android.gms.ads.internal.client.zzdw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzh(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = zzbeg.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzdqVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final String zzj() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final long zzk() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        long j10 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbgj
    public final void zzl(long j10) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzda(10, parcelZza);
    }
}
