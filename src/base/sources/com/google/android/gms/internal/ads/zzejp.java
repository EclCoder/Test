package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzejp implements zzfpl {
    private final zzejd zza;
    private final zzejh zzb;

    zzejp(zzejd zzejdVar, zzejh zzejhVar) {
        this.zza = zzejdVar;
        this.zzb = zzejhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdM(zzfpe zzfpeVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhh)).booleanValue()) {
            if (zzfpe.RENDERER == zzfpeVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfpe.PRELOADED_LOADER == zzfpeVar || zzfpe.SERVER_TRANSACTION == zzfpeVar) {
                zzejd zzejdVar = this.zza;
                zzejdVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzejh zzejhVar = this.zzb;
                final long jZzb = zzejdVar.zzb();
                zzejhVar.zza.zza(new zzfok() { // from class: com.google.android.gms.internal.ads.zzejg
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzejhVar.zzf()) {
                            return null;
                        }
                        long j10 = jZzb;
                        zzbhv.zzaf.zza.C0299zza c0299zzaZzz = zzbhv.zzaf.zza.zzz();
                        c0299zzaZzz.zzad(j10);
                        byte[] bArrZzaN = c0299zzaZzz.zzbu().zzaN();
                        zzejo.zzf(sQLiteDatabase, false, false);
                        zzejo.zze(sQLiteDatabase, j10, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdN(zzfpe zzfpeVar, String str, Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhh)).booleanValue() && zzfpe.RENDERER == zzfpeVar) {
            zzejd zzejdVar = this.zza;
            if (zzejdVar.zzh() != 0) {
                zzejdVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzejdVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdO(zzfpe zzfpeVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhh)).booleanValue() && zzfpe.RENDERER == zzfpeVar) {
            zzejd zzejdVar = this.zza;
            if (zzejdVar.zzh() != 0) {
                zzejdVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzejdVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdL(zzfpe zzfpeVar, String str) {
    }
}
