package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzg extends zza implements IInterface {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(com.google.android.gms.appset.zza zzaVar, zzf zzfVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzaVar);
        zzc.zzc(parcelZza, zzfVar);
        zzb(1, parcelZza);
    }
}
