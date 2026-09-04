package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaes implements zzafa {
    private final zzafa[] zza;

    zzaes(zzafa... zzafaVarArr) {
        this.zza = zzafaVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzafa
    public final zzaez zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzafa zzafaVar = this.zza[i10];
            if (zzafaVar.zzb(cls)) {
                return zzafaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
