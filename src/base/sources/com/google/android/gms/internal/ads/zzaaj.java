package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaaj extends zzaaq implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaaj(int i10, zzbg zzbgVar, int i11, zzaam zzaamVar, int i12) {
        super(i10, zzbgVar, i11);
        this.zze = zznc.zzac(i12, zzaamVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaaj zzaajVar) {
        return Integer.compare(this.zzf, zzaajVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaaq
    public final /* bridge */ /* synthetic */ boolean zzc(zzaaq zzaaqVar) {
        return false;
    }
}
