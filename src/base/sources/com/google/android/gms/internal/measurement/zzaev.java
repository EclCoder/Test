package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaev {
    private final zzaeu zza;

    private zzaev(zzagm zzagmVar, Object obj, zzagm zzagmVar2, Object obj2) {
        this.zza = new zzaeu(zzagmVar, "", zzagmVar2, obj2);
    }

    public static zzaev zza(zzagm zzagmVar, Object obj, zzagm zzagmVar2, Object obj2) {
        return new zzaev(zzagmVar, "", zzagmVar2, obj2);
    }

    static void zzb(zzada zzadaVar, zzaeu zzaeuVar, Object obj, Object obj2) {
        zzadk.zzf(zzadaVar, zzaeuVar.zza, 1, obj);
        zzadk.zzf(zzadaVar, zzaeuVar.zzc, 2, obj2);
    }

    static int zzc(zzaeu zzaeuVar, Object obj, Object obj2) {
        return zzadk.zzh(zzaeuVar.zza, 1, obj) + zzadk.zzh(zzaeuVar.zzc, 2, obj2);
    }

    public final int zzd(int i10, Object obj, Object obj2) {
        zzaeu zzaeuVar = this.zza;
        int iZzE = zzada.zzE(i10 << 3);
        int iZzc = zzc(zzaeuVar, obj, obj2);
        return iZzE + zzada.zzE(iZzc) + iZzc;
    }

    final zzaeu zze() {
        return this.zza;
    }
}
