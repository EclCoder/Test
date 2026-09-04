package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbmg extends zzbee implements zzbmi {
    zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzb(String str, IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final IObjectWrapper zzc(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzd(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzdB(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzdC(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzdD(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzdE(zzbmb zzbmbVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbmbVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zze() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzf(IObjectWrapper iObjectWrapper, int i10) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i10);
        zzda(5, parcelZza);
    }
}
