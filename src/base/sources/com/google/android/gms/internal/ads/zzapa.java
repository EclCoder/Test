package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzapa implements Comparable {
    public final int zza;
    public final zzaov zzb;

    public zzapa(int i10, zzaov zzaovVar) {
        this.zza = i10;
        this.zzb = zzaovVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzapa) obj).zza);
    }
}
