package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbna extends zzbee implements zzbnc {
    zzbna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zze(zzbms zzbmsVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbmsVar);
        zzda(1, parcelZza);
    }
}
