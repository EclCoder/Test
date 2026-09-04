package com.google.android.gms.internal.measurement;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaar extends zzaag {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzzq zzd;
    private final int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaar(String str, String str2, boolean z10, int i10, boolean z11, boolean z12) {
        super(str2);
        Level level = Level.ALL;
        int i11 = zzaas.zza;
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = zzaas.zzb;
        this.zzd = zzaas.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean zzb(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void zzc(zzzd zzzdVar) {
        String strZza = (String) zzzdVar.zzl().zzd(zzyw.zza);
        if (strZza == null) {
            strZza = zza();
        }
        if (strZza == null) {
            strZza = zzzdVar.zzg().zza();
            int iIndexOf = strZza.indexOf(36, strZza.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strZza = strZza.substring(0, iIndexOf);
            }
        }
        String str = this.zza;
        zzaas.zzi(zzzdVar, zzaal.zza(str, strZza, true), 2, this.zzb, this.zzc, this.zzd);
    }
}
