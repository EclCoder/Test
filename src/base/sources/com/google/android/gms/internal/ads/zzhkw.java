package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhkw {
    static void zza(long[] jArr, long[] jArr2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = (int) jArr[i11];
            jArr[i11] = ((-i10) & (((int) jArr2[i11]) ^ i12)) ^ i12;
        }
    }
}
