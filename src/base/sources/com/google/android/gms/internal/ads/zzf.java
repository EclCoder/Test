package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzf implements zzbb {
    protected final zzbe zza = new zzbe();

    protected zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zza() {
        return zzh() == 3 && zzk() && zzi() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzb(long j10) {
        zzc(zzs(), j10, 5, false);
    }

    protected abstract void zzc(int i10, long j10, int i11, boolean z10);
}
