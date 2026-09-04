package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcbq extends zzbee implements IInterface {
    zzcbq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcbp zzcbpVar, String str, String str2) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzcbpVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(2, parcelZza);
    }
}
