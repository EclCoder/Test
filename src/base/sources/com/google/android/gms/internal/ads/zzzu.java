package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzu extends zzzw {
    protected zzzu(zzbg zzbgVar, int[] iArr, int i10, zzabq zzabqVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzdo zzdoVar) {
        super(zzbgVar, iArr, 0);
        zzgwm.zzq(list);
    }

    static /* synthetic */ zzgwm zzd(zzaaz[] zzaazVarArr) {
        int i10;
        int i11;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                break;
            }
            zzaaz zzaazVar = zzaazVarArr[i13];
            if (zzaazVar == null || zzaazVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = zzgwm.zzd;
                zzgwj zzgwjVar = new zzgwj();
                zzgwjVar.zzf(new zzzs(0L, 0L));
                arrayList.add(zzgwjVar);
            }
            i13++;
        }
        long[][] jArr2 = new long[2][];
        for (int i15 = 0; i15 < 2; i15++) {
            zzaaz zzaazVar2 = zzaazVarArr[i15];
            if (zzaazVar2 == null) {
                jArr2[i15] = new long[0];
            } else {
                int[] iArr = zzaazVar2.zzb;
                jArr2[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j10 = zzaazVar2.zza.zza(iArr[i16]).zzj;
                    long[] jArr3 = jArr2[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i16] = j10;
                }
                Arrays.sort(jArr2[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr5 = jArr2[i17];
            jArr4[i17] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgxh zzgxhVarZza = zzgyb.zzc(zzgyg.zzb()).zzb(2).zza();
        int i18 = 0;
        while (i18 < 2) {
            int length = jArr2[i18].length;
            if (length <= i10) {
                i11 = i12;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr6 = jArr2[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = i12;
                    long[][] jArr7 = jArr2;
                    long j11 = jArr6[i19];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i19] = dLog;
                    i19++;
                    i12 = i20;
                    jArr2 = jArr7;
                }
                i11 = i12;
                jArr = jArr2;
                int i21 = length - 1;
                double d10 = dArr[i21] - dArr[i11];
                int i22 = i11;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22++;
                    zzgxhVarZza.zze(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i18));
                    i10 = i10;
                }
            }
            i18++;
            i12 = i11;
            jArr2 = jArr;
            i10 = i10;
        }
        int i23 = i12;
        long[][] jArr8 = jArr2;
        zzgwm zzgwmVarZzq = zzgwm.zzq(zzgxhVarZza.zzt());
        for (int i24 = i23; i24 < zzgwmVarZzq.size(); i24++) {
            int iIntValue = ((Integer) zzgwmVarZzq.get(i24)).intValue();
            int i25 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i25;
            jArr4[iIntValue] = jArr8[iIntValue][i25];
            zzi(arrayList, jArr4);
        }
        for (int i26 = i23; i26 < 2; i26++) {
            if (arrayList.get(i26) != null) {
                long j12 = jArr4[i26];
                jArr4[i26] = j12 + j12;
            }
        }
        zzi(arrayList, jArr4);
        zzgwj zzgwjVar2 = new zzgwj();
        while (i23 < arrayList.size()) {
            zzgwj zzgwjVar3 = (zzgwj) arrayList.get(i23);
            zzgwjVar2.zzf(zzgwjVar3 == null ? zzgwm.zzi() : zzgwjVar3.zzi());
            i23++;
        }
        return zzgwjVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgwj zzgwjVar = (zzgwj) list.get(i11);
            if (zzgwjVar != null) {
                zzgwjVar.zzf(new zzzs(j10, jArr[i11]));
            }
        }
    }
}
