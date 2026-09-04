package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzld implements zzmg {
    private final Object zza;
    private zzbf zzb;

    public zzld(Object obj, zzxf zzxfVar) {
        this.zza = obj;
        this.zzb = zzxfVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmg
    public final zzbf zzb() {
        return this.zzb;
    }

    public final void zzc(zzbf zzbfVar) {
        this.zzb = zzbfVar;
    }
}
