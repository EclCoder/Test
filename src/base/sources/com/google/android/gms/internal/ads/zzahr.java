package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzahr implements zzahb {
    final /* synthetic */ zzaht zza;
    private final long zzb;

    public zzahr(zzaht zzahtVar, long j10) {
        Objects.requireNonNull(zzahtVar);
        this.zza = zzahtVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        zzaht zzahtVar = this.zza;
        zzagz zzagzVarZzg = zzahtVar.zzh()[0].zzg(j10);
        for (int i10 = 1; i10 < zzahtVar.zzh().length; i10++) {
            zzagz zzagzVarZzg2 = zzahtVar.zzh()[i10].zzg(j10);
            if (zzagzVarZzg2.zza.zzc < zzagzVarZzg.zza.zzc) {
                zzagzVarZzg = zzagzVarZzg2;
            }
        }
        return zzagzVarZzg;
    }
}
