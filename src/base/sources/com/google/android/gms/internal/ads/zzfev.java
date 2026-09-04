package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfev implements zzimu {
    private final zzfep zza;

    private zzfev(zzfep zzfepVar) {
        this.zza = zzfepVar;
    }

    public static zzfev zzc(zzfep zzfepVar) {
        return new zzfev(zzfepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }
}
