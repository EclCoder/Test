package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaqz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzet zzb = new zzet();

    zzaqz(int i10) {
    }

    private final int zze(zzafz zzafzVar) {
        byte[] bArr = zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafzVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzafz zzafzVar, zzagy zzagyVar, int i10) {
        if (i10 <= 0) {
            zze(zzafzVar);
            return 0;
        }
        boolean z10 = this.zze;
        long j10 = C.TIME_UNSET;
        if (z10) {
            if (this.zzg == C.TIME_UNSET) {
                zze(zzafzVar);
                return 0;
            }
            if (this.zzd) {
                long j11 = this.zzf;
                if (j11 == C.TIME_UNSET) {
                    zze(zzafzVar);
                    return 0;
                }
                zzfi zzfiVar = this.zza;
                this.zzh = zzfiVar.zzf(this.zzg) - zzfiVar.zze(j11);
                zze(zzafzVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzafzVar.zzo());
            if (zzafzVar.zzn() != 0) {
                zzagyVar.zza = 0L;
                return 1;
            }
            zzet zzetVar = this.zzb;
            zzetVar.zza(iMin);
            zzafzVar.zzl();
            zzafzVar.zzi(zzetVar.zzi(), 0, iMin);
            int iZze = zzetVar.zze();
            for (int iZzg = zzetVar.zzg(); iZzg < iZze; iZzg++) {
                if (zzetVar.zzi()[iZzg] == 71) {
                    long jZzb = zzarj.zzb(zzetVar, iZzg, i10);
                    if (jZzb != C.TIME_UNSET) {
                        j10 = jZzb;
                        break;
                    }
                }
            }
            this.zzf = j10;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzafzVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j12 = jZzo - ((long) iMin2);
        if (zzafzVar.zzn() != j12) {
            zzagyVar.zza = j12;
            return 1;
        }
        zzet zzetVar2 = this.zzb;
        zzetVar2.zza(iMin2);
        zzafzVar.zzl();
        zzafzVar.zzi(zzetVar2.zzi(), 0, iMin2);
        int iZzg2 = zzetVar2.zzg();
        int iZze2 = zzetVar2.zze();
        for (int i11 = iZze2 - 188; i11 >= iZzg2; i11--) {
            byte[] bArrZzi = zzetVar2.zzi();
            int i12 = 0;
            for (int i13 = -4; i13 <= 4; i13++) {
                int i14 = (i13 * 188) + i11;
                if (i14 >= iZzg2 && i14 < iZze2 && bArrZzi[i14] == 71) {
                    i12++;
                    if (i12 == 5) {
                        long jZzb2 = zzarj.zzb(zzetVar2, i11, i10);
                        if (jZzb2 == C.TIME_UNSET) {
                            break;
                        }
                        j10 = jZzb2;
                        break;
                    }
                } else {
                    i12 = 0;
                }
            }
        }
        this.zzg = j10;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfi zzd() {
        return this.zza;
    }
}
