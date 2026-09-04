package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeht implements zzhbt {
    final /* synthetic */ zzcbd zza;
    final /* synthetic */ zzcau zzb;

    zzeht(zzeii zzeiiVar, zzcbd zzcbdVar, zzcau zzcauVar) {
        this.zza = zzcbdVar;
        this.zzb = zzcauVar;
        Objects.requireNonNull(zzeiiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th2));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcN)).booleanValue()) {
                this.zzb.zze(parcelFileDescriptor);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcO)).booleanValue() && (bundle = this.zza.zzm) != null) {
                bundle.putLong(zzdyu.BINDER_CALL_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }
}
