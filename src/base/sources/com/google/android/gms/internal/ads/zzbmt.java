package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbmt extends zzbee implements zzbmv {
    zzbmt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final String zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final zzbme zzf(String str) {
        zzbme zzbmcVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbmcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmcVar = iInterfaceQueryLocalInterface instanceof zzbme ? (zzbme) iInterfaceQueryLocalInterface : new zzbmc(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final List zzg() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzcZ.createStringArrayList();
        parcelZzcZ.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final String zzh() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzi(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzj() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final com.google.android.gms.ads.internal.client.zzea zzk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzl() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final IObjectWrapper zzm() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzn(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzo() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzp() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzq(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final void zzr() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final zzbmb zzs() {
        zzbmb zzblzVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzblzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzblzVar = iInterfaceQueryLocalInterface instanceof zzbmb ? (zzbmb) iInterfaceQueryLocalInterface : new zzblz(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzblzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final boolean zzt(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
