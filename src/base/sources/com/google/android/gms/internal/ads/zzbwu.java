package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzbwu extends zzbef implements zzbwv {
    public zzbwu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzbvr zzbvrVarZzb = zzbvq.zzb(parcel.readStrongBinder());
            zzbeg.zzh(parcel);
            zze(zzbvrVarZzb);
        } else if (i10 == 2) {
            String string = parcel.readString();
            zzbeg.zzh(parcel);
            zzf(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbeg.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzbeg.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
