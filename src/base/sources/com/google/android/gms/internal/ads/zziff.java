package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zziff implements zzifn {
    private final zzifn[] zza;

    zziff(zzifn... zzifnVarArr) {
        this.zza = zzifnVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzifn
    public final zzifm zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzifn zzifnVar = this.zza[i10];
            if (zzifnVar.zzb(cls)) {
                return zzifnVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
