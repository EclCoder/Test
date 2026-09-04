package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfo implements zzfv {
    private final zzfv[] zza;

    zzfo(zzfv... zzfvVarArr) {
        this.zza = zzfvVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final zzfu zzb(Class cls) {
        zzfv[] zzfvVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzfv zzfvVar = zzfvVarArr[i10];
            if (zzfvVar.zzc(cls)) {
                return zzfvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(Class cls) {
        zzfv[] zzfvVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzfvVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
