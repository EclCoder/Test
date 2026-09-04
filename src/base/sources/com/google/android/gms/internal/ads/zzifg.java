package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzifg {
    private static final zzifn zzb = new zzife();
    private final zzifn zza;

    public zzifg() {
        zzidx zzidxVarZza = zzidx.zza();
        int i10 = zzicn.zza;
        this.zza = new zziff(zzidxVarZza, zzb);
    }

    public final zzigh zza(Class cls) {
        int i10 = zzigi.zza;
        if (!zziee.class.isAssignableFrom(cls)) {
            int i11 = zzicn.zza;
        }
        zzifm zzifmVarZzc = this.zza.zzc(cls);
        if (zzifmVarZzc.zza()) {
            int i12 = zzicn.zza;
            return zzift.zzh(zzigi.zzF(), zzidr.zza(), zzifmVarZzc.zzb());
        }
        int i13 = zzicn.zza;
        return zzifs.zzm(cls, zzifmVarZzc, zzifw.zza(), zzifc.zza(), zzigi.zzF(), zzifmVarZzc.zzc() + (-1) != 1 ? zzidr.zza() : null, zzifl.zza());
    }
}
