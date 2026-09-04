package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbeh extends zzbee implements zzbej {
    zzbeh(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final Bundle zze(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        Bundle bundle2 = (Bundle) zzbeg.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle2;
    }
}
