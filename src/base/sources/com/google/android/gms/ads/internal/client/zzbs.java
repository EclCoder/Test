package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcbv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbs extends zzbee implements zzbu {
    zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() {
        Parcel parcelZzcZ = zzcZ(46, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzB() {
        Parcel parcelZzcZ = zzcZ(23, zza());
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzcbv zzcbvVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzea zzF() {
        zzea zzdyVar;
        Parcel parcelZzcZ = zzcZ(26, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdyVar = iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzfw zzfwVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzfwVar);
        zzda(29, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzee zzeeVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzx zzxVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzbgm zzbgmVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbgmVar);
        zzda(40, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = zzbeg.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzda(34, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzdqVar);
        zzda(42, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzm zzmVar, zzbk zzbkVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzmVar);
        zzbeg.zze(parcelZza, zzbkVar);
        zzda(43, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(44, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzcs zzcsVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzcsVar);
        zzda(45, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j10) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzda(48, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() {
        Parcel parcelZzcZ = zzcZ(47, zza());
        long j10 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(zzcp zzcpVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        Parcel parcelZzcZ = zzcZ(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbhVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zze(zzm zzmVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzmVar);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZza = zzbeg.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzclVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzby zzbyVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzr zzn() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzr zzrVar = (zzr) zzbeg.zzb(parcelZzcZ, zzr.CREATOR);
        parcelZzcZ.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzr zzrVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzbzk zzbzkVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzbzn zzbznVar, String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzdx zzt() {
        zzdx zzdvVar;
        Parcel parcelZzcZ = zzcZ(41, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzu() {
        Parcel parcelZzcZ = zzcZ(31, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() {
        zzcl zzcjVar;
        Parcel parcelZzcZ = zzcZ(32, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() {
        zzbh zzbfVar;
        Parcel parcelZzcZ = zzcZ(33, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(zzbjl zzbjlVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzbeVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = zzbeg.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzda(22, parcelZza);
    }
}
