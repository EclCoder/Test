package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzama implements zzahb {
    private final long zza;
    private final zzamb[] zzb;
    private final int zzc;

    public zzama(long j10, zzamb[] zzambVarArr, int i10) {
        this.zza = j10;
        this.zzb = zzambVarArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzahb
    public final zzagz zzc(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int i10;
        long jZzh;
        long jZzh2;
        zzaml zzamlVar;
        int iZzb;
        zzamb[] zzambVarArr = this.zzb;
        if (zzambVarArr.length == 0) {
            zzahc zzahcVar = zzahc.zza;
            return new zzagz(zzahcVar, zzahcVar);
        }
        int i11 = this.zzc;
        if (i11 != -1) {
            zzaml zzamlVar2 = zzambVarArr[i11].zzb;
            int iZzl = zzamc.zzl(zzamlVar2, j10);
            if (iZzl == -1) {
                zzahc zzahcVar2 = zzahc.zza;
                return new zzagz(zzahcVar2, zzahcVar2);
            }
            long[] jArr = zzamlVar2.zzf;
            j12 = jArr[iZzl];
            long[] jArr2 = zzamlVar2.zzc;
            j11 = jArr2[iZzl];
            if (j12 < j10 && iZzl < zzamlVar2.zzb - 1 && (iZzb = zzamlVar2.zzb(j10)) != -1 && iZzb != iZzl) {
                j13 = jArr[iZzb];
                j14 = jArr2[iZzb];
            }
            jZzh = j11;
            jZzh2 = j14;
            for (i10 = 0; i10 < zzambVarArr.length; i10++) {
                if (i10 != i11) {
                    zzamlVar = zzambVarArr[i10].zzb;
                    jZzh = zzamc.zzh(zzamlVar, j12, jZzh);
                    if (j13 != C.TIME_UNSET) {
                        jZzh2 = zzamc.zzh(zzamlVar, j13, jZzh2);
                    }
                }
            }
            zzahc zzahcVar3 = new zzahc(j12, jZzh);
            return j13 == C.TIME_UNSET ? new zzagz(zzahcVar3, zzahcVar3) : new zzagz(zzahcVar3, new zzahc(j13, jZzh2));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        j13 = C.TIME_UNSET;
        j14 = -1;
        jZzh = j11;
        jZzh2 = j14;
        while (i10 < zzambVarArr.length) {
            if (i10 != i11) {
                zzamlVar = zzambVarArr[i10].zzb;
                jZzh = zzamc.zzh(zzamlVar, j12, jZzh);
                if (j13 != C.TIME_UNSET) {
                    jZzh2 = zzamc.zzh(zzamlVar, j13, jZzh2);
                }
            }
        }
        zzahc zzahcVar4 = new zzahc(j12, jZzh);
        if (j13 == C.TIME_UNSET) {
        }
    }
}
