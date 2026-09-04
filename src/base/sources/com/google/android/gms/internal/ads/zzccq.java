package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzccq extends zzbee implements IInterface {
    zzccq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzccf zzccfVar, String str, String str2) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzccfVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(2, parcelZza);
    }
}
