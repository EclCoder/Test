package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzifi {
    private final zzifh zza;

    private zzifi(zzihg zzihgVar, Object obj, zzihg zzihgVar2, Object obj2) {
        this.zza = new zzifh(zzihgVar, "", zzihgVar2, obj2);
    }

    public static zzifi zza(zzihg zzihgVar, Object obj, zzihg zzihgVar2, Object obj2) {
        return new zzifi(zzihgVar, "", zzihgVar2, obj2);
    }

    static void zzb(zzidj zzidjVar, zzifh zzifhVar, Object obj, Object obj2) {
        zzidt.zzf(zzidjVar, zzifhVar.zza, 1, obj);
        zzidt.zzf(zzidjVar, zzifhVar.zzc, 2, obj2);
    }

    static int zzc(zzifh zzifhVar, Object obj, Object obj2) {
        return zzidt.zzh(zzifhVar.zza, 1, obj) + zzidt.zzh(zzifhVar.zzc, 2, obj2);
    }

    public final int zzd(int i10, Object obj, Object obj2) {
        zzifh zzifhVar = this.zza;
        int iZzF = zzidj.zzF(i10 << 3);
        int iZzc = zzc(zzifhVar, obj, obj2);
        return iZzF + zzidj.zzF(iZzc) + iZzc;
    }

    final zzifh zze() {
        return this.zza;
    }
}
