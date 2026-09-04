package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbjj extends zzbee implements zzbjl {
    zzbjj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zze(zzbji zzbjiVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbjiVar);
        zzda(1, parcelZza);
    }
}
