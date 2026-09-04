package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhky extends zzhkx {
    private final long[] zzd;

    zzhky() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhkx
    public final void zza(long[] jArr, long[] jArr2) {
        zzhlj.zze(jArr, jArr2, this.zzd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhky(zzhlb zzhlbVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzhla zzhlaVar = zzhlbVar.zza;
        zzhlj.zza(jArr2, zzhlaVar.zzb, zzhlaVar.zza);
        long[] jArr3 = this.zzb;
        zzhla zzhlaVar2 = zzhlbVar.zza;
        zzhlj.zzb(jArr3, zzhlaVar2.zzb, zzhlaVar2.zza);
        System.arraycopy(zzhlbVar.zza.zzc, 0, jArr, 0, 10);
        zzhlj.zze(this.zzc, zzhlbVar.zzb, zzhle.zzb);
    }
}
