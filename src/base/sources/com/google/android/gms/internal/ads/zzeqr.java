package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeqr implements zzdea {
    boolean zza;
    final /* synthetic */ zzelv zzb;
    final /* synthetic */ zzcfw zzc;

    zzeqr(zzequ zzequVar, zzelv zzelvVar, zzcfw zzcfwVar) {
        this.zzb = zzelvVar;
        this.zzc = zzcfwVar;
        Objects.requireNonNull(zzequVar);
        this.zza = false;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgz)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzelw(i10, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zza() {
        this.zzc.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zzb(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i10, zzequ.zze(this.zzb.zza, i10), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zzc(int i10, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzequ.zze(this.zzb.zza, i10);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }
}
