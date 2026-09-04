package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqp extends zzgqx {
    private String zza;
    private String zzb;

    zzgqp() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final zzgqx zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final zzgqx zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgqx
    public final zzgqy zzc() {
        return new zzgqq(this.zza, this.zzb, null);
    }
}
