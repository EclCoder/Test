package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbl extends zzbee implements zzbn {
    zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(zzm zzmVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzmVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzg() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzh() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzi(zzm zzmVar, int i10) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzmVar);
        parcelZza.writeInt(i10);
        zzda(5, parcelZza);
    }
}
