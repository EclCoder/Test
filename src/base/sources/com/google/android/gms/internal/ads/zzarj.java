package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzarj {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzet zzetVar, int i10, int i11) {
        zzetVar.zzh(i10);
        if (zzetVar.zzd() < 5) {
            return C.TIME_UNSET;
        }
        int iZzB = zzetVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & 8191) != i11 || (iZzB & 32) == 0 || zzetVar.zzs() < 7 || zzetVar.zzd() < 7 || (zzetVar.zzs() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        zzetVar.zzm(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((((long) bArr[4]) & 255) >> 7);
    }
}
