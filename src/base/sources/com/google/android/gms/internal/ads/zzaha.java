package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzaha implements zzahb {
    private final long zza;
    private final zzagz zzb;

    public zzaha(long j10, long j11) {
        this.zza = j10;
        zzahc zzahcVar = j11 == 0 ? zzahc.zza : new zzahc(0L, j11);
        this.zzb = new zzagz(zzahcVar, zzahcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        return this.zzb;
    }
}
