package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgqk extends zzbee implements zzgqm {
    zzgqk(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final void zze(String str, Bundle bundle, zzgqo zzgqoVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbeg.zzc(parcelZza, bundle);
        zzbeg.zze(parcelZza, zzgqoVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final void zzf(Bundle bundle, zzgqo zzgqoVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, bundle);
        zzbeg.zze(parcelZza, zzgqoVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final void zzg(Bundle bundle, zzgqo zzgqoVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, bundle);
        zzbeg.zze(parcelZza, zzgqoVar);
        zzdb(3, parcelZza);
    }
}
