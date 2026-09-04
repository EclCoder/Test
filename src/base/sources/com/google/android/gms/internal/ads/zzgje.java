package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgje {
    private final Context zza;
    private final zzgqh zzb;
    private final zzgha zzc;
    private final String zzd;

    zzgje(Context context, zzgqh zzgqhVar, zzgha zzghaVar, zzgdf zzgdfVar) {
        this.zza = context;
        this.zzb = zzgqhVar;
        this.zzc = zzghaVar;
        this.zzd = zzgdfVar.zzd();
    }

    public final String zza(boolean z10, long j10) {
        zzgqf zzgqfVarZza = this.zzb.zza(55);
        try {
            zzgqfVarZza.zza();
            zzayx zzayxVarZza = zzayy.zza();
            zzayxVarZza.zzb(this.zzd);
            zzayxVarZza.zza("0.878096153");
            Context context = this.zza;
            zzayxVarZza.zzd(context.getPackageName());
            zzayxVarZza.zzc(System.currentTimeMillis() / 1000);
            zzayxVarZza.zzf((System.currentTimeMillis() - j10) / 1000);
            try {
                zzayxVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzayxVarZza.zze(-1L);
            }
            zzgha zzghaVar = this.zzc;
            if (!zzghaVar.zzc()) {
                zzghaVar.zza();
            }
            zzaze zzazeVarZzf = zzghaVar.zzf(((zzayy) zzayxVarZza.zzbu()).zzaN(), null);
            zzazeVarZzf.zzc(5);
            zzazeVarZzf.zzd(2);
            String strZza = zzgea.zza(((zzazf) zzazeVarZzf.zzbu()).zzaN(), true);
            zzgqfVarZza.zzc();
            return strZza;
        } catch (Throwable th2) {
            try {
                zzgqfVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgqfVarZza.zzc();
                throw th3;
            }
        }
    }
}
