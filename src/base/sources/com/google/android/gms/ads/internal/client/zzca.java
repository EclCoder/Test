package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzca extends zzbef implements zzcb {
    public zzca() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzfp zzfpVar = (zzfp) zzbeg.zzb(parcel, zzfp.CREATOR);
            zzbeg.zzh(parcel);
            zze(zzfpVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzfp zzfpVar2 = (zzfp) zzbeg.zzb(parcel, zzfp.CREATOR);
            zzbeg.zzh(parcel);
            zzf(zzfpVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
