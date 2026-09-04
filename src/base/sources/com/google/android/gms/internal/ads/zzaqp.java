package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqp {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzet zzb = new zzet();

    zzaqp() {
    }

    public static long zze(zzet zzetVar) {
        int iZzg = zzetVar.zzg();
        if (zzetVar.zzd() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzetVar.zzm(bArr, 0, 9);
        zzetVar.zzh(iZzg);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return C.TIME_UNSET;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return C.TIME_UNSET;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C.TIME_UNSET;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    private final int zzf(zzafz zzafzVar) {
        byte[] bArr = zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafzVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfi zzb() {
        return this.zza;
    }

    public final int zzc(zzafz zzafzVar, zzagy zzagyVar) {
        boolean z10 = this.zze;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            long jZzo = zzafzVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j11 = jZzo - ((long) iMin);
            if (zzafzVar.zzn() != j11) {
                zzagyVar.zza = j11;
                return 1;
            }
            zzet zzetVar = this.zzb;
            zzetVar.zza(iMin);
            zzafzVar.zzl();
            zzafzVar.zzi(zzetVar.zzi(), 0, iMin);
            int iZzg = zzetVar.zzg();
            for (int iZze = zzetVar.zze() - 4; iZze >= iZzg; iZze--) {
                if (zzg(zzetVar.zzi(), iZze) == 442) {
                    zzetVar.zzh(iZze + 4);
                    long jZze = zze(zzetVar);
                    if (jZze != C.TIME_UNSET) {
                        j10 = jZze;
                        break;
                    }
                }
            }
            this.zzg = j10;
            this.zze = true;
            return 0;
        }
        if (this.zzg == C.TIME_UNSET) {
            zzf(zzafzVar);
            return 0;
        }
        if (this.zzd) {
            long j12 = this.zzf;
            if (j12 == C.TIME_UNSET) {
                zzf(zzafzVar);
                return 0;
            }
            zzfi zzfiVar = this.zza;
            this.zzh = zzfiVar.zzf(this.zzg) - zzfiVar.zze(j12);
            zzf(zzafzVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzafzVar.zzo());
        if (zzafzVar.zzn() != 0) {
            zzagyVar.zza = 0L;
            return 1;
        }
        zzet zzetVar2 = this.zzb;
        zzetVar2.zza(iMin2);
        zzafzVar.zzl();
        zzafzVar.zzi(zzetVar2.zzi(), 0, iMin2);
        int iZze2 = zzetVar2.zze();
        for (int iZzg2 = zzetVar2.zzg(); iZzg2 < iZze2 - 3; iZzg2++) {
            if (zzg(zzetVar2.zzi(), iZzg2) == 442) {
                zzetVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzetVar2);
                if (jZze2 != C.TIME_UNSET) {
                    j10 = jZze2;
                    break;
                }
            }
        }
        this.zzf = j10;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
