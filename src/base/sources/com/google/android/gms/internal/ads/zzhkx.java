package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zzhkx {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    zzhkx(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void zzb(zzhkx zzhkxVar, int i10) {
        zzhkw.zza(this.zza, zzhkxVar.zza, i10);
        zzhkw.zza(this.zzb, zzhkxVar.zzb, i10);
        zzhkw.zza(this.zzc, zzhkxVar.zzc, i10);
    }

    zzhkx() {
        this(new long[10], new long[10], new long[10]);
    }

    zzhkx(zzhkx zzhkxVar) {
        this.zza = Arrays.copyOf(zzhkxVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhkxVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhkxVar.zzc, 10);
    }
}
