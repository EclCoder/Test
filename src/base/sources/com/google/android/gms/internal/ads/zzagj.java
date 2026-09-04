package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagj implements zzahb {
    private final zzagl zza;
    private final long zzb;

    public zzagj(zzagl zzaglVar, long j10) {
        this.zza = zzaglVar;
        this.zzb = j10;
    }

    private final zzahc zze(long j10, long j11) {
        return new zzahc((j10 * 1000000) / ((long) this.zza.zze), this.zzb + j11);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        zzagl zzaglVar = this.zza;
        zzagk zzagkVar = zzaglVar.zzk;
        zzagkVar.getClass();
        long jZzb = zzaglVar.zzb(j10);
        long[] jArr = zzagkVar.zza;
        int iZzo = zzfl.zzo(jArr, jZzb, true, false);
        long j11 = iZzo == -1 ? 0L : jArr[iZzo];
        long[] jArr2 = zzagkVar.zzb;
        zzahc zzahcVarZze = zze(j11, iZzo != -1 ? jArr2[iZzo] : 0L);
        if (zzahcVarZze.zzb == j10 || iZzo == jArr.length - 1) {
            return new zzagz(zzahcVarZze, zzahcVarZze);
        }
        int i10 = iZzo + 1;
        return new zzagz(zzahcVarZze, zze(jArr[i10], jArr2[i10]));
    }
}
