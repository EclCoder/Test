package com.google.android.gms.internal.measurement;

import com.google.common.collect.e0;
import com.google.common.collect.g0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzqs {
    private final boolean zza = true;
    private final String zzb;
    private final zzacr zzc;
    private final e0 zzd;
    private final zzqr zze;

    private zzqs(zznd zzndVar, zzqr zzqrVar) {
        zzndVar.zzi();
        this.zzb = zzndVar.zzd();
        this.zzc = zzndVar.zzg();
        zzndVar.zze();
        zzndVar.zzf();
        Map mapZzh = zzndVar.zzh();
        if (mapZzh != null) {
            g0.v(mapZzh.keySet());
        } else {
            g0.z();
        }
        zzmw zzmwVarZzc = zzndVar.zzc();
        e0.a aVarH = e0.h(zzmwVarZzc.zzf() + 3);
        zzmwVarZzc.zzc(aVarH);
        aVarH.g("__phenotype_server_token", zzndVar.zze()).g("__phenotype_snapshot_token", zzndVar.zzd()).g("__phenotype_configuration_version", Long.valueOf(zzndVar.zzf()));
        this.zzd = aVarH.c();
        this.zze = zzqrVar;
    }

    static zzqs zza(zzqv zzqvVar, zzqr zzqrVar) {
        return new zzqs(zzqvVar, zzqrVar);
    }

    static zzqs zzb(zzqv zzqvVar, zzqs zzqsVar) {
        return new zzqs(zzqvVar, zzqsVar.zze);
    }

    static zzqs zzc(zznd zzndVar, zzqr zzqrVar) {
        return new zzqs(zzndVar, zzqrVar);
    }

    final String zzd() {
        return this.zzb;
    }

    final zzacr zze() {
        return this.zzc;
    }

    final e0 zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze.zzc() == 3;
    }

    public final boolean zzh() {
        return this.zza;
    }

    final zzmd zzi() {
        return this.zze.zza();
    }

    public final boolean zzj() {
        return this.zze.zzb() == 17;
    }

    public final boolean zzk() {
        int iZzb = this.zze.zzb() - 2;
        return iZzb == 15 || iZzb == 16;
    }

    private zzqs(zzqv zzqvVar, zzqr zzqrVar) {
        zzqv.zzi().equals(zzqvVar);
        this.zzb = zzqvVar.zza();
        this.zzc = zzqvVar.zzb();
        zzqvVar.zzc();
        zzqvVar.zzd();
        g0.z();
        e0.a aVarH = e0.h(zzqvVar.zzf() + 3);
        for (zzqx zzqxVar : zzqvVar.zze()) {
            int iZzp = zzqxVar.zzp();
            int i10 = iZzp - 1;
            if (iZzp == 0) {
                throw null;
            }
            if (i10 == 0) {
                aVarH.g(zzqxVar.zza(), Long.valueOf(zzqxVar.zzb()));
            } else if (i10 == 1) {
                aVarH.g(zzqxVar.zza(), Boolean.valueOf(zzqxVar.zzc()));
            } else if (i10 == 2) {
                aVarH.g(zzqxVar.zza(), Double.valueOf(zzqxVar.zzd()));
            } else if (i10 == 3) {
                aVarH.g(zzqxVar.zza(), zzqxVar.zze());
            } else if (i10 == 4) {
                aVarH.g(zzqxVar.zza(), zzqxVar.zzf().zzm());
            }
        }
        aVarH.g("__phenotype_server_token", zzqvVar.zzc());
        aVarH.g("__phenotype_snapshot_token", zzqvVar.zza());
        aVarH.g("__phenotype_configuration_version", Long.valueOf(zzqvVar.zzd()));
        this.zzd = aVarH.c();
        this.zze = zzqrVar;
    }
}
