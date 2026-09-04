package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgep implements Comparable {
    final Runnable zza;
    final long zzb;

    zzgep(Runnable runnable, long j10) {
        this.zza = runnable;
        this.zzb = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgep) obj).zzb);
    }
}
