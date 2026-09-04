package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdpd implements zzbeq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdpo zzb;

    zzdpd(zzdpo zzdpoVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdpoVar);
        this.zzb = zzdpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(zzbep zzbepVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzcu)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzbepVar.zzj) {
                        zzdpo zzdpoVar = this.zzb;
                        if (zzdpoVar.zzaa() != null) {
                            zzdpoVar.zzab().put(this.zza, Boolean.TRUE);
                            if (zzdpoVar.zzaa() == null) {
                                return;
                            } else {
                                zzdpoVar.zzu(zzdpoVar.zzaa().zzdF(), zzdpoVar.zzaa().zzi(), zzdpoVar.zzaa().zzj(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (zzbepVar.zzj) {
            zzdpo zzdpoVar2 = this.zzb;
            if (zzdpoVar2.zzaa() != null) {
                zzdpoVar2.zzab().put(this.zza, Boolean.TRUE);
                if (zzdpoVar2.zzaa() == null) {
                    return;
                }
                zzdpoVar2.zzu(zzdpoVar2.zzaa().zzdF(), zzdpoVar2.zzaa().zzi(), zzdpoVar2.zzaa().zzj(), true);
            }
        }
    }
}
