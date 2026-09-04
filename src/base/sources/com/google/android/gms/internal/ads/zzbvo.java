package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbvo extends zzbee implements IInterface {
    zzbvo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final String zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final List zzf() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzbeg.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    public final String zzg() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final zzbme zzh() {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbme zzbmeVarZzh = zzbmd.zzh(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmeVarZzh;
    }

    public final String zzi() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzj() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final void zzk() {
        zzda(8, zza());
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    public final void zzm(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(10, parcelZza);
    }

    public final boolean zzn() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final boolean zzo() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    public final Bundle zzp() {
        Parcel parcelZzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzbeg.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    public final IObjectWrapper zzr() {
        Parcel parcelZzcZ = zzcZ(15, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final com.google.android.gms.ads.internal.client.zzea zzs() {
        Parcel parcelZzcZ = zzcZ(16, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    public final zzblx zzt() {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzblx zzblxVarZzj = zzblw.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzblxVarZzj;
    }

    public final IObjectWrapper zzu() {
        Parcel parcelZzcZ = zzcZ(20, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzv() {
        Parcel parcelZzcZ = zzcZ(21, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    public final void zzw(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzbeg.zze(parcelZza, iObjectWrapper2);
        zzbeg.zze(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }
}
