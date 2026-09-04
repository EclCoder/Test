package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbhd extends zzbee implements IInterface {
    zzbhd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbgy zze(zzbhb zzbhbVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzbhbVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzbgy zzbgyVar = (zzbgy) zzbeg.zzb(parcelZzcZ, zzbgy.CREATOR);
        parcelZzcZ.recycle();
        return zzbgyVar;
    }

    public final zzbgy zzf(zzbhb zzbhbVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzbhbVar);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        zzbgy zzbgyVar = (zzbgy) zzbeg.zzb(parcelZzcZ, zzbgy.CREATOR);
        parcelZzcZ.recycle();
        return zzbgyVar;
    }

    public final long zzg(zzbhb zzbhbVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzbhbVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j10 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j10;
    }
}
