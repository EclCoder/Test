package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhkz {
    final zzhla zza;
    final long[] zzb;

    zzhkz(zzhla zzhlaVar, long[] jArr) {
        this.zza = zzhlaVar;
        this.zzb = jArr;
    }

    zzhkz() {
        this(new zzhla(), new long[10]);
    }

    zzhkz(zzhkz zzhkzVar) {
        this.zza = new zzhla(zzhkzVar.zza);
        this.zzb = Arrays.copyOf(zzhkzVar.zzb, 10);
    }
}
