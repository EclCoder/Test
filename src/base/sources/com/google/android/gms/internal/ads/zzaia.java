package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaia implements zzafy {
    private final zzet zza = new zzet(4);
    private final zzahd zzb = new zzahd(-1, -1, "image/avif");

    private final boolean zzh(zzafz zzafzVar, int i10) {
        zzet zzetVar = this.zza;
        zzetVar.zza(4);
        ((zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, 4, false);
        return zzetVar.zzz() == ((long) i10);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) throws EOFException, InterruptedIOException {
        ((zzafp) zzafzVar).zzj(4, false);
        return zzh(zzafzVar, 1718909296) && zzh(zzafzVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        this.zzb.zzc(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) {
        return this.zzb.zzd(zzafzVar, zzagyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzb.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
