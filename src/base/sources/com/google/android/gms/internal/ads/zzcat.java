package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcat extends zzbef implements zzcau {
    public zzcat() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbef
    protected final boolean zzdd(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbeg.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzbeg.zzh(parcel);
            zze(parcelFileDescriptor);
        } else if (i10 == 2) {
            com.google.android.gms.ads.internal.util.zzba zzbaVar = (com.google.android.gms.ads.internal.util.zzba) zzbeg.zzb(parcel, com.google.android.gms.ads.internal.util.zzba.CREATOR);
            zzbeg.zzh(parcel);
            zzf(zzbaVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbeg.zzb(parcel, ParcelFileDescriptor.CREATOR);
            zzcbd zzcbdVar = (zzcbd) zzbeg.zzb(parcel, zzcbd.CREATOR);
            zzbeg.zzh(parcel);
            zzg(parcelFileDescriptor2, zzcbdVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
