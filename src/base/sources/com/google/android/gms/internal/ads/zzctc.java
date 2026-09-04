package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzctc implements zzhbt {
    final /* synthetic */ zzfsc zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzctj zzd;

    zzctc(zzctj zzctjVar, zzfsc zzfscVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfscVar;
        this.zzb = str;
        this.zzc = zzvVar;
        Objects.requireNonNull(zzctjVar);
        this.zzd = zzctjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(final Throwable th2) {
        final zzfsc zzfscVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzlK)).booleanValue();
                Throwable th3 = th2;
                zzctc zzctcVar = this.zza;
                if (zBooleanValue) {
                    zzctj zzctjVar = zzctcVar.zzd;
                    zzcaa zzcaaVarZzc = zzbzy.zzc(zzctjVar.zzi());
                    zzctjVar.zzb = zzcaaVarZzc;
                    zzcaaVarZzc.zzh(th3, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzctj zzctjVar2 = zzctcVar.zzd;
                    zzcaa zzcaaVarZza = zzbzy.zza(zzctjVar2.zzi());
                    zzctjVar2.zza = zzcaaVarZza;
                    zzcaaVarZza.zzh(th3, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfscVar.zzb(str, zzvVar2, null, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfsc zzfscVar = this.zza;
        final String str = (String) obj;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        this.zzd.zzj().submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcta
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfscVar.zzb(str, zzvVar, null, null);
            }
        });
    }
}
