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
public final class zzbnt extends zzbee implements zzbnv {
    zzbnt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzA() {
        Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzdgVar);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzdcVar);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzD() {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzE() {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final zzbmb zzF() {
        zzbmb zzblzVar;
        Parcel parcelZzcZ = zzcZ(29, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzG() {
        Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.ads.internal.client.zzdx zzH() {
        Parcel parcelZzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzb = com.google.android.gms.ads.internal.client.zzdw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzdqVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzJ(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final long zzK() {
        Parcel parcelZzcZ = zzcZ(34, zza());
        long j10 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzL(long j10) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final String zze() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final List zzf() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzbeg.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final String zzg() {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final zzbme zzh() {
        zzbme zzbmcVar;
        Parcel parcelZzcZ = zzcZ(5, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final String zzi() {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final String zzj() {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final double zzk() {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d10 = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final String zzl() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final String zzm() {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final com.google.android.gms.ads.internal.client.zzea zzn() {
        Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final String zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzp() {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final zzblx zzq() {
        zzblx zzblvVar;
        Parcel parcelZzcZ = zzcZ(14, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzblvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzblvVar = iInterfaceQueryLocalInterface instanceof zzblx ? (zzblx) iInterfaceQueryLocalInterface : new zzblv(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzblvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzr(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, bundle);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final boolean zzs(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzt(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final IObjectWrapper zzu() {
        Parcel parcelZzcZ = zzcZ(18, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final IObjectWrapper zzv() {
        Parcel parcelZzcZ = zzcZ(19, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final Bundle zzw() {
        Parcel parcelZzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzbeg.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzx(zzbns zzbnsVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbnsVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final void zzy() {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbnv
    public final List zzz() {
        Parcel parcelZzcZ = zzcZ(23, zza());
        ArrayList arrayListZzf = zzbeg.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }
}
