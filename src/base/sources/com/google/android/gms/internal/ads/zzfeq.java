package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfeq implements zzimu {
    private final zzfep zza;

    private zzfeq(zzfep zzfepVar) {
        this.zza = zzfepVar;
    }

    public static zzfeq zzc(zzfep zzfepVar) {
        return new zzfeq(zzfepVar);
    }

    public static String zzd(zzfep zzfepVar) {
        String strZza = zzfepVar.zza();
        zzinc.zzb(strZza);
        return strZza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
