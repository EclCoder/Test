package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzblz extends zzbee implements zzbmb {
    zzblz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final float zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final IObjectWrapper zzg() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final float zzh() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final float zzi() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final com.google.android.gms.ads.internal.client.zzea zzj() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final boolean zzk() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final boolean zzl() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmb
    public final void zzm(zzbnj zzbnjVar) {
        throw null;
    }
}
