package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbmx extends zzbee implements zzbmz {
    zzbmx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zze(zzbmq zzbmqVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbmqVar);
        zzda(1, parcelZza);
    }
}
