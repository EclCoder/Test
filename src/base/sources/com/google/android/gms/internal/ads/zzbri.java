package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbri extends zzbee implements IInterface {
    zzbri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbrc zzbrcVar, zzbrh zzbrhVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzbrcVar);
        zzbeg.zze(parcelZza, zzbrhVar);
        zzdb(2, parcelZza);
    }
}
