package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahg extends zzagm {
    private final long zza;

    public zzahg(zzafz zzafzVar, long j10) {
        super(zzafzVar);
        zzgtj.zza(zzafzVar.zzn() >= j10);
        this.zza = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzagm, com.google.android.gms.internal.ads.zzafz
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagm, com.google.android.gms.internal.ads.zzafz
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagm, com.google.android.gms.internal.ads.zzafz
    public final long zzo() {
        return super.zzo() - this.zza;
    }
}
