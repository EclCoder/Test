package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzccg extends zzbee implements zzcci {
    zzccg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzb(IObjectWrapper iObjectWrapper) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccp zzccpVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzmVar);
        zzbeg.zze(parcelZza, zzccpVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccp zzccpVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzmVar);
        zzbeg.zze(parcelZza, zzccpVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zze(zzccl zzcclVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzcclVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzdnVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final Bundle zzg() {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzbeg.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzh(zzccw zzccwVar) {
        Parcel parcelZza = zza();
        zzbeg.zzc(parcelZza, zzccwVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final String zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final zzccf zzl() {
        zzccf zzccdVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzccdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzccdVar = iInterfaceQueryLocalInterface instanceof zzccf ? (zzccf) iInterfaceQueryLocalInterface : new zzccd(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzccdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final com.google.android.gms.ads.internal.client.zzdx zzm() {
        Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzb = com.google.android.gms.ads.internal.client.zzdw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final String zzn() {
        Parcel parcelZzcZ = zzcZ(16, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, zzdqVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzp(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = zzbeg.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final long zzq() {
        Parcel parcelZzcZ = zzcZ(17, zza());
        long j10 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzr(long j10) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzs(zzccq zzccqVar) {
        throw null;
    }
}
