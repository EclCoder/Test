package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgqv extends zzgrx {
    private String zza;
    private String zzb;

    zzgqv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgrx zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgrx zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgrx
    public final zzgry zzc() {
        return new zzgqw(this.zza, this.zzb, null);
    }
}
