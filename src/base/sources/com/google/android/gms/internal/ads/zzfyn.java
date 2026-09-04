package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfyn extends zzbee implements IInterface {
    zzfyn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfyl zze(zzfyj zzfyjVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzfyjVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzfyl zzfylVar = (zzfyl) zzbeg.zzb(parcelZzcZ, zzfyl.CREATOR);
        parcelZzcZ.recycle();
        return zzfylVar;
    }

    public final void zzf(zzfyg zzfygVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzfygVar);
        zzda(2, parcelZza);
    }

    public final zzfyu zzg(zzfys zzfysVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzfysVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzfyu zzfyuVar = (zzfyu) zzbeg.zzb(parcelZzcZ, zzfyu.CREATOR);
        parcelZzcZ.recycle();
        return zzfyuVar;
    }
}
