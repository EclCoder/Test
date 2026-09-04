package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzd extends zza implements zzf {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() {
        Parcel parcelZzb = zzb(1, zza());
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() {
        Parcel parcelZzb = zzb(6, zza());
        boolean zZzb = zzc.zzb(parcelZzb);
        parcelZzb.recycle();
        return zZzb;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z10) {
        Parcel parcelZza = zza();
        zzc.zza(parcelZza, true);
        Parcel parcelZzb = zzb(2, parcelZza);
        boolean zZzb = zzc.zzb(parcelZzb);
        parcelZzb.recycle();
        return zZzb;
    }
}
