package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvt implements zzimu {
    private final zzcvs zza;
    private final zzind zzb;

    private zzcvt(zzcvs zzcvsVar, zzind zzindVar) {
        this.zza = zzcvsVar;
        this.zzb = zzindVar;
    }

    public static zzcvt zza(zzcvs zzcvsVar, zzind zzindVar) {
        return new zzcvt(zzcvsVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zze(((zzing) this.zzb).zzb());
    }
}
