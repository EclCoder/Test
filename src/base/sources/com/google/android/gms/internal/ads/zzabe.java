package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzabe extends zzabh {
    protected abstract Pair zzh(zzabd zzabdVar, int[][][] iArr, int[] iArr2, zzxk zzxkVar, zzbf zzbfVar);

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final zzabi zzr(zznc[] zzncVarArr, zzzn zzznVar, zzxk zzxkVar, zzbf zzbfVar) {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzznVar.zzb;
            zzbgVarArr[i10] = new zzbg[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzncVarArr[i13].zzu();
        }
        int i14 = 0;
        while (i14 < zzznVar.zzb) {
            zzbg zzbgVarZza = zzznVar.zza(i14);
            int i15 = zzbgVarZza.zzc;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z10 = true;
            while (i17 < i12) {
                zznc zzncVar = zzncVarArr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 < zzbgVarZza.zza; i19++) {
                    iMax = Math.max(iMax, zzncVar.zzad(zzbgVarZza.zza(i19)) & 7);
                }
                boolean z11 = iArr2[i17] == 0;
                if (iMax > i18) {
                    z10 = z11;
                    i16 = i17;
                    i18 = iMax;
                } else if (iMax == i18 && i15 == 5 && !z10 && z11) {
                    i16 = i17;
                    i18 = iMax;
                    z10 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zznc zzncVar2 = zzncVarArr[i16];
                int i20 = zzbgVarZza.zza;
                int[] iArr5 = new int[i20];
                for (int i21 = 0; i21 < i20; i21++) {
                    iArr5[i21] = zzncVar2.zzad(zzbgVarZza.zza(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzbgVarArr[i16][i22] = zzbgVarZza;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        zzzn[] zzznVarArr = new zzzn[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            int i24 = iArr2[i23];
            zzznVarArr[i23] = new zzzn((zzbg[]) zzfl.zzb(zzbgVarArr[i23], i24));
            iArr3[i23] = (int[][]) zzfl.zzb(iArr3[i23], i24);
            strArr[i23] = zzncVarArr[i23].zzU();
            iArr6[i23] = zzncVarArr[i23].zza();
            i23++;
            i12 = 2;
        }
        int i25 = i12;
        zzabd zzabdVar = new zzabd(strArr, iArr6, zzznVarArr, iArr4, iArr3, new zzzn((zzbg[]) zzfl.zzb(zzbgVarArr[i25], iArr2[i25])));
        Pair pairZzh = zzh(zzabdVar, iArr3, iArr4, zzxkVar, zzbfVar);
        zzabf[] zzabfVarArr = (zzabf[]) pairZzh.second;
        int length = zzabfVarArr.length;
        List[] listArr = new List[length];
        for (int i26 = 0; i26 < zzabfVarArr.length; i26++) {
            zzabf zzabfVar = zzabfVarArr[i26];
            listArr[i26] = zzabfVar != null ? zzgwm.zzj(zzabfVar) : zzgwm.zzi();
        }
        zzgwj zzgwjVar = new zzgwj();
        for (int i27 = 0; i27 < 2; i27++) {
            zzzn zzznVarZzb = zzabdVar.zzb(i27);
            int i28 = 0;
            while (i28 < zzznVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzznVarZzb.zza(i28);
                boolean z12 = zzabdVar.zzd(i27, i28, false) != 0;
                int i29 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i29];
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 < i29; i30++) {
                    iArr7[i30] = zzabdVar.zzc(i27, i28, i30) & 7;
                    int i31 = 0;
                    boolean z13 = false;
                    while (i31 < length) {
                        List list = listArr[i31];
                        int i32 = length;
                        List[] listArr2 = listArr;
                        int i33 = 0;
                        while (i33 < list.size()) {
                            zzabf zzabfVar2 = (zzabf) list.get(i33);
                            int i34 = i33;
                            if (zzabfVar2.zza().equals(zzbgVarZza2) && zzabfVar2.zzg(i30) != -1) {
                                z13 = true;
                                break;
                            }
                            i33 = i34 + 1;
                        }
                        i31++;
                        length = i32;
                        listArr = listArr2;
                    }
                    zArr[i30] = z13;
                }
                zzgwjVar.zzf(new zzbm(zzbgVarZza2, z12, iArr7, zArr));
                i28++;
                length = length;
            }
        }
        zzzn zzznVarZze = zzabdVar.zze();
        for (int i35 = 0; i35 < zzznVarZze.zzb; i35++) {
            zzbg zzbgVarZza3 = zzznVarZze.zza(i35);
            int i36 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i36];
            Arrays.fill(iArr8, 0);
            zzgwjVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i36]));
        }
        return new zzabi((zznd[]) pairZzh.first, (zzaba[]) pairZzh.second, new zzbn(zzgwjVar.zzi()), zzabdVar);
    }
}
