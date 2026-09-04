package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzxo extends zzxz implements zzyi {
    protected zzxo(Level level, boolean z10) {
        super(level, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    protected final zzabn zza() {
        return zzabl.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    protected final boolean zzb(zzyd zzydVar) {
        zzzj zzzjVarZzl = zzl();
        int iZza = zzzjVarZzl.zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            if (zzzjVarZzl.zzb(i10).zzd() == "eye3tag") {
                if (zzzjVarZzl.zzd(zzxx.zza) != null) {
                    break;
                }
                zzyl zzylVar = zzxx.zzi;
                if (zzzjVarZzl.zzd(zzylVar) != null) {
                    break;
                }
                zzm(zzylVar, zzyv.SMALL);
                break;
            }
        }
        return super.zzb(zzydVar);
    }
}
