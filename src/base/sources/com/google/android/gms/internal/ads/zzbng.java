package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbng extends zzbee implements zzbni {
    zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zze(zzbmv zzbmvVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbmvVar);
        zzda(1, parcelZza);
    }
}
