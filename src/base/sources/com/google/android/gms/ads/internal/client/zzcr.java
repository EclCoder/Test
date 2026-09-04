package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzcr extends zzbef implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zze zzeVar = (zze) zzbeg.zzb(parcel, zze.CREATOR);
            zzbeg.zzh(parcel);
            zzb(zzeVar);
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            zzd();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
