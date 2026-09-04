package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaak implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaak(zzv zzvVar, int i10) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zznc.zzac(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaak zzaakVar) {
        return zzgvz.zzg().zzd(this.zzb, zzaakVar.zzb).zzd(this.zza, zzaakVar.zza).zze();
    }
}
