package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zztm {
    private final zzco[] zza;
    private final zztz zzb;
    private final zzcu zzc;

    public zztm(zzco... zzcoVarArr) {
        zztz zztzVar = new zztz();
        zzcu zzcuVar = new zzcu();
        zzco[] zzcoVarArr2 = {zztzVar, zzcuVar};
        this.zza = zzcoVarArr2;
        System.arraycopy(zzcoVarArr, 0, zzcoVarArr2, 0, 0);
        this.zzb = zztzVar;
        this.zzc = zzcuVar;
    }

    public final zzco[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcu zzcuVar = this.zzc;
        zzcuVar.zzk(zzavVar.zzb);
        zzcuVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z10) {
        this.zzb.zzq(z10);
        return z10;
    }

    public final long zzd(long j10) {
        zzcu zzcuVar = this.zzc;
        return zzcuVar.zzc() ? zzcuVar.zzm(j10) : j10;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
