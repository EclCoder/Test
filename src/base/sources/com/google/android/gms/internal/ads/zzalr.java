package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzalr implements zzafy {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzalq zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzagb zzI;
    private zzahk[] zzJ;
    private zzahk[] zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private long zzO;
    private final zzanj zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzet zzg;
    private final zzet zzh;
    private final zzet zzi;
    private final byte[] zzj;
    private final zzet zzk;
    private final zzajb zzl;
    private final zzet zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgz zzp;
    private final zzafn zzq;
    private zzgwm zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzet zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i10 = zzalm.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzo(MimeTypes.APPLICATION_EMSG);
        zzb = zztVar.zzO();
    }

    @Deprecated
    public zzalr() {
        this(zzanj.zza, 32, null, null, zzgwm.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:142:0x03fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:144:0x0407  */
    /* JADX WARN: Code duplicated, block: B:147:0x0410  */
    /* JADX WARN: Code duplicated, block: B:148:0x041b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0424  */
    /* JADX WARN: Code duplicated, block: B:152:0x0429  */
    /* JADX WARN: Code duplicated, block: B:153:0x042b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x042d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0432  */
    /* JADX WARN: Code duplicated, block: B:156:0x0434 A[PHI: r31
      0x0434: PHI (r31v4 int) = (r5v56 int), (r31v5 int) binds: [B:152:0x0429, B:155:0x0432] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0438  */
    /* JADX WARN: Code duplicated, block: B:160:0x0443  */
    /* JADX WARN: Code duplicated, block: B:163:0x045c  */
    /* JADX WARN: Code duplicated, block: B:166:0x046e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0470 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0472  */
    /* JADX WARN: Code duplicated, block: B:169:0x0477  */
    /* JADX WARN: Code duplicated, block: B:170:0x0479  */
    private final void zzj(long j10) throws zzat {
        zzap zzapVar;
        int i10;
        List list;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        byte[] bArr;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        int i21;
        boolean z12;
        int i22;
        long j11;
        long j12;
        int i23;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        long jZzv;
        boolean z13;
        long[] jArr2;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfx) arrayDeque.peek()).zza != j10) {
                break;
            }
            zzfx zzfxVar = (zzfx) arrayDeque.pop();
            int i24 = zzfxVar.zzd;
            int i25 = 12;
            int i26 = 8;
            boolean z14 = true;
            if (i24 == 1836019574) {
                zzq zzqVarZzn = zzn(zzfxVar.zzb);
                zzfx zzfxVarZzd = zzfxVar.zzd(1836475768);
                zzfxVarZzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzfxVarZzd.zzb;
                int size = list2.size();
                int i27 = 0;
                long jZzz = C.TIME_UNSET;
                while (i27 < size) {
                    zzfy zzfyVar = (zzfy) list2.get(i27);
                    int i28 = zzfyVar.zzd;
                    if (i28 == 1953654136) {
                        zzet zzetVar = zzfyVar.zza;
                        zzetVar.zzh(i25);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzetVar.zzB()), new zzalk(zzetVar.zzB() - 1, zzetVar.zzB(), zzetVar.zzB(), zzetVar.zzB()));
                        sparseArray.put(((Integer) pairCreate.first).intValue(), (zzalk) pairCreate.second);
                    } else if (i28 == 1835362404) {
                        zzet zzetVar2 = zzfyVar.zza;
                        zzetVar2.zzh(8);
                        jZzz = zzalj.zza(zzetVar2.zzB()) == 0 ? zzetVar2.zzz() : zzetVar2.zzJ();
                    }
                    i27++;
                    i25 = 12;
                }
                zzfx zzfxVarZzd2 = zzfxVar.zzd(1835365473);
                zzap zzapVarZze = zzfxVarZzd2 != null ? zzalj.zze(zzfxVarZzd2) : null;
                zzagr zzagrVar = new zzagr();
                zzfy zzfyVarZzc = zzfxVar.zzc(1969517665);
                if (zzfyVarZzc != null) {
                    zzap zzapVarZzc = zzalj.zzc(zzfyVarZzc);
                    zzagrVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzfy zzfyVarZzc2 = zzfxVar.zzc(1836476516);
                zzfyVarZzc2.getClass();
                zzap zzapVar2 = new zzap(C.TIME_UNSET, zzalj.zzd(zzfyVarZzc2.zza));
                List listZzb = zzalj.zzb(zzfxVar, zzagrVar, jZzz, zzqVarZzn, (this.zzd & 16) != 0, false, new zzgta(this) { // from class: com.google.android.gms.internal.ads.zzall
                    @Override // com.google.android.gms.internal.ads.zzgta
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzami) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String strZza = zzalu.zza(listZzb);
                    int i29 = 0;
                    while (i29 < size2) {
                        zzaml zzamlVar = (zzaml) listZzb.get(i29);
                        zzami zzamiVar = zzamlVar.zza;
                        zzagb zzagbVar = this.zzI;
                        int i30 = zzamiVar.zzb;
                        zzahk zzahkVarZzu = zzagbVar.zzu(i29, i30);
                        int i31 = size2;
                        SparseArray sparseArray3 = sparseArray2;
                        long j13 = zzamiVar.zze;
                        zzahkVarZzu.zzO(j13);
                        int i32 = i29;
                        zzv zzvVar = zzamiVar.zzg;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzn(strZza);
                        zzalt.zzb(i30, zzagrVar, zztVarZza);
                        zzagr zzagrVar2 = zzagrVar;
                        zzalt.zza(i30, zzapVarZze, zztVarZza, zzvVar.zzl, zzapVar, zzapVar2);
                        int i33 = zzamiVar.zza;
                        sparseArray3.put(i33, new zzalq(zzahkVarZzu, zzamlVar, zzp(sparseArray, i33), zztVarZza.zzO()));
                        this.zzA = Math.max(this.zzA, j13);
                        i29 = i32 + 1;
                        sparseArray2 = sparseArray3;
                        size2 = i31;
                        zzagrVar = zzagrVar2;
                    }
                    this.zzI.zzv();
                } else {
                    zzgtj.zzi(sparseArray2.size() == size2);
                    for (int i34 = 0; i34 < size2; i34++) {
                        zzaml zzamlVar2 = (zzaml) listZzb.get(i34);
                        int i35 = zzamlVar2.zza.zza;
                        ((zzalq) sparseArray2.get(i35)).zza(zzamlVar2, zzp(sparseArray, i35));
                    }
                }
            } else {
                int i36 = 16;
                int i37 = 0;
                if (i24 == 1836019558) {
                    SparseArray sparseArray4 = this.zzf;
                    int i38 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list3 = zzfxVar.zzc;
                    int size3 = list3.size();
                    int i39 = 0;
                    while (i39 < size3) {
                        zzfx zzfxVar2 = (zzfx) list3.get(i39);
                        if (zzfxVar2.zzd == 1953653094) {
                            zzfy zzfyVarZzc3 = zzfxVar2.zzc(1952868452);
                            zzfyVarZzc3.getClass();
                            zzet zzetVar3 = zzfyVarZzc3.zza;
                            zzetVar3.zzh(i26);
                            int iZzB5 = zzetVar3.zzB();
                            int i40 = zzalj.zza;
                            zzalq zzalqVar = (zzalq) sparseArray4.get(zzetVar3.zzB());
                            if (zzalqVar == null) {
                                zzalqVar = null;
                            } else {
                                if ((iZzB5 & 1) != 0) {
                                    long jZzJ = zzetVar3.zzJ();
                                    zzamk zzamkVar = zzalqVar.zzb;
                                    zzamkVar.zzb = jZzJ;
                                    zzamkVar.zzc = jZzJ;
                                }
                                zzalk zzalkVar = zzalqVar.zze;
                                zzalqVar.zzb.zza = new zzalk((iZzB5 & 2) != 0 ? zzetVar3.zzB() - 1 : zzalkVar.zza, (iZzB5 & 8) != 0 ? zzetVar3.zzB() : zzalkVar.zzb, (iZzB5 & 16) != 0 ? zzetVar3.zzB() : zzalkVar.zzc, (iZzB5 & 32) != 0 ? zzetVar3.zzB() : zzalkVar.zzd);
                            }
                            if (zzalqVar == null) {
                                i10 = i38;
                                list = list3;
                                i11 = size3;
                                i12 = i39;
                                i14 = i36;
                                i15 = i37;
                                i13 = 8;
                                z10 = true;
                            } else {
                                zzamk zzamkVar2 = zzalqVar.zzb;
                                long j14 = zzamkVar2.zzp;
                                boolean z15 = zzamkVar2.zzq;
                                zzalqVar.zzc();
                                zzalqVar.zzl(true);
                                zzfy zzfyVarZzc4 = zzfxVar2.zzc(1952867444);
                                if (zzfyVarZzc4 == null || (i38 & 2) != 0) {
                                    zzamkVar2.zzp = j14;
                                    zzamkVar2.zzq = z15;
                                } else {
                                    zzet zzetVar4 = zzfyVarZzc4.zza;
                                    zzetVar4.zzh(8);
                                    zzamkVar2.zzp = zzalj.zza(zzetVar4.zzB()) == 1 ? zzetVar4.zzJ() : zzetVar4.zzz();
                                    zzamkVar2.zzq = true;
                                }
                                List list4 = zzfxVar2.zzb;
                                int size4 = list4.size();
                                i10 = i38;
                                int i41 = i37;
                                int i42 = i41;
                                int i43 = i42;
                                while (true) {
                                    i16 = 1953658222;
                                    if (i41 >= size4) {
                                        break;
                                    }
                                    List list5 = list3;
                                    zzfy zzfyVar2 = (zzfy) list4.get(i41);
                                    int i44 = size3;
                                    if (zzfyVar2.zzd == 1953658222) {
                                        zzet zzetVar5 = zzfyVar2.zza;
                                        zzetVar5.zzh(12);
                                        int iZzH = zzetVar5.zzH();
                                        if (iZzH > 0) {
                                            i43 += iZzH;
                                            i42++;
                                        }
                                    }
                                    i41++;
                                    size3 = i44;
                                    list3 = list5;
                                }
                                list = list3;
                                i11 = size3;
                                int i45 = i37;
                                zzalqVar.zzh = i45;
                                zzalqVar.zzg = i45;
                                zzalqVar.zzf = i45;
                                zzamkVar2.zzd = i42;
                                zzamkVar2.zze = i43;
                                if (zzamkVar2.zzg.length < i42) {
                                    zzamkVar2.zzf = new long[i42];
                                    zzamkVar2.zzg = new int[i42];
                                }
                                if (zzamkVar2.zzh.length < i43) {
                                    int i46 = (i43 * Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    zzamkVar2.zzh = new int[i46];
                                    zzamkVar2.zzi = new long[i46];
                                    zzamkVar2.zzj = new boolean[i46];
                                    zzamkVar2.zzl = new boolean[i46];
                                }
                                int i47 = 0;
                                int i48 = 0;
                                int i49 = 0;
                                while (true) {
                                    long j15 = 0;
                                    if (i47 >= size4) {
                                        break;
                                    }
                                    zzfy zzfyVar3 = (zzfy) list4.get(i47);
                                    if (zzfyVar3.zzd == i16) {
                                        int i50 = i48 + 1;
                                        zzet zzetVar6 = zzfyVar3.zza;
                                        zzetVar6.zzh(8);
                                        int iZzB6 = zzetVar6.zzB();
                                        zzami zzamiVar2 = zzalqVar.zzd.zza;
                                        int i51 = i48;
                                        zzalk zzalkVar2 = zzamkVar2.zza;
                                        String str = zzfl.zza;
                                        zzamkVar2.zzg[i51] = zzetVar6.zzH();
                                        long[] jArr3 = zzamkVar2.zzf;
                                        int i52 = i49;
                                        long j16 = zzamkVar2.zzb;
                                        jArr3[i51] = j16;
                                        if ((iZzB6 & 1) != 0) {
                                            jArr3[i51] = j16 + ((long) zzetVar6.zzB());
                                        }
                                        boolean z16 = (iZzB6 & 4) != 0;
                                        int i53 = zzalkVar2.zzd;
                                        int iZzB7 = z16 ? zzetVar6.zzB() : i53;
                                        boolean z17 = z16;
                                        int i54 = iZzB6 & 256;
                                        int i55 = iZzB6 & 512;
                                        int i56 = iZzB6 & UserVerificationMethods.USER_VERIFY_ALL;
                                        int i57 = iZzB6 & 2048;
                                        long[] jArr4 = zzamiVar2.zzi;
                                        if (jArr4 != null) {
                                            i18 = i56;
                                            if (jArr4.length == 1 && (jArr2 = zzamiVar2.zzj) != null) {
                                                long j17 = jArr4[0];
                                                if (j17 == 0) {
                                                    i19 = i53;
                                                    i20 = iZzB7;
                                                } else {
                                                    i19 = i53;
                                                    i20 = iZzB7;
                                                    long j18 = zzamiVar2.zzd;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    if (zzfl.zzv(j17, 1000000L, j18, roundingMode) + zzfl.zzv(jArr2[0], 1000000L, zzamiVar2.zzc, roundingMode) >= zzamiVar2.zze) {
                                                    }
                                                }
                                                j15 = jArr2[0];
                                            }
                                            iArr = zzamkVar2.zzh;
                                            jArr = zzamkVar2.zzi;
                                            zArr = zzamkVar2.zzj;
                                            i21 = i19;
                                            if (zzamiVar2.zzb == 2 || (i10 & 1) == 0) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                            i22 = i52 + zzamkVar2.zzg[i51];
                                            j11 = zzamiVar2.zzc;
                                            j12 = zzamkVar2.zzp;
                                            i23 = i52;
                                            while (i23 < i22) {
                                                if (i54 != 0) {
                                                    iZzB = zzetVar6.zzB();
                                                } else {
                                                    iZzB = zzalkVar2.zzb;
                                                }
                                                zzk(iZzB);
                                                if (i55 != 0) {
                                                    iZzB2 = zzetVar6.zzB();
                                                } else {
                                                    iZzB2 = zzalkVar2.zzc;
                                                }
                                                zzk(iZzB2);
                                                if (i18 != 0) {
                                                    iZzB3 = zzetVar6.zzB();
                                                } else if (i23 != 0) {
                                                    iZzB3 = i21;
                                                } else if (z17) {
                                                    iZzB3 = i20;
                                                    i23 = 0;
                                                } else {
                                                    i23 = 0;
                                                    iZzB3 = i21;
                                                }
                                                if (i57 != 0) {
                                                    iZzB4 = zzetVar6.zzB();
                                                } else {
                                                    iZzB4 = 0;
                                                }
                                                zzalk zzalkVar3 = zzalkVar2;
                                                jZzv = zzfl.zzv((((long) iZzB4) + j12) - j15, 1000000L, j11, RoundingMode.DOWN);
                                                jArr[i23] = jZzv;
                                                if (!zzamkVar2.zzq) {
                                                    jArr[i23] = jZzv + zzalqVar.zzd.zzi;
                                                }
                                                iArr[i23] = iZzB2;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    z13 = false;
                                                } else if (z12) {
                                                    z13 = true;
                                                } else if (i23 == 0) {
                                                    z13 = true;
                                                    i23 = 0;
                                                } else {
                                                    z13 = false;
                                                }
                                                zArr[i23] = z13;
                                                j12 += (long) iZzB;
                                                i23++;
                                                z12 = z12;
                                                zzalkVar2 = zzalkVar3;
                                            }
                                            zzamkVar2.zzp = j12;
                                            i49 = i22;
                                            i48 = i50;
                                        } else {
                                            i18 = i56;
                                        }
                                        i19 = i53;
                                        i20 = iZzB7;
                                        iArr = zzamkVar2.zzh;
                                        jArr = zzamkVar2.zzi;
                                        zArr = zzamkVar2.zzj;
                                        i21 = i19;
                                        if (zzamiVar2.zzb == 2) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        i22 = i52 + zzamkVar2.zzg[i51];
                                        j11 = zzamiVar2.zzc;
                                        j12 = zzamkVar2.zzp;
                                        i23 = i52;
                                        while (i23 < i22) {
                                            if (i54 != 0) {
                                                iZzB = zzetVar6.zzB();
                                            } else {
                                                iZzB = zzalkVar2.zzb;
                                            }
                                            zzk(iZzB);
                                            if (i55 != 0) {
                                                iZzB2 = zzetVar6.zzB();
                                            } else {
                                                iZzB2 = zzalkVar2.zzc;
                                            }
                                            zzk(iZzB2);
                                            if (i18 != 0) {
                                                iZzB3 = zzetVar6.zzB();
                                            } else if (i23 != 0) {
                                                iZzB3 = i21;
                                            } else if (z17) {
                                                iZzB3 = i20;
                                                i23 = 0;
                                            } else {
                                                i23 = 0;
                                                iZzB3 = i21;
                                            }
                                            if (i57 != 0) {
                                                iZzB4 = zzetVar6.zzB();
                                            } else {
                                                iZzB4 = 0;
                                            }
                                            zzalk zzalkVar4 = zzalkVar2;
                                            jZzv = zzfl.zzv((((long) iZzB4) + j12) - j15, 1000000L, j11, RoundingMode.DOWN);
                                            jArr[i23] = jZzv;
                                            if (!zzamkVar2.zzq) {
                                                jArr[i23] = jZzv + zzalqVar.zzd.zzi;
                                            }
                                            iArr[i23] = iZzB2;
                                            if (((iZzB3 >> 16) & 1) != 0) {
                                                z13 = false;
                                            } else if (z12) {
                                                z13 = true;
                                            } else if (i23 == 0) {
                                                z13 = true;
                                                i23 = 0;
                                            } else {
                                                z13 = false;
                                            }
                                            zArr[i23] = z13;
                                            j12 += (long) iZzB;
                                            i23++;
                                            z12 = z12;
                                            zzalkVar2 = zzalkVar4;
                                        }
                                        zzamkVar2.zzp = j12;
                                        i49 = i22;
                                        i48 = i50;
                                    }
                                    i47++;
                                    i39 = i39;
                                    size4 = size4;
                                    i16 = 1953658222;
                                }
                                i12 = i39;
                                zzami zzamiVar3 = zzalqVar.zzd.zza;
                                zzalk zzalkVar5 = zzamkVar2.zza;
                                zzalkVar5.getClass();
                                zzamj zzamjVarZza = zzamiVar3.zza(zzalkVar5.zza);
                                zzfy zzfyVarZzc5 = zzfxVar2.zzc(1935763834);
                                if (zzfyVarZzc5 != null) {
                                    zzamjVarZza.getClass();
                                    int i58 = zzamjVarZza.zzd;
                                    zzet zzetVar7 = zzfyVarZzc5.zza;
                                    zzetVar7.zzh(8);
                                    if ((zzetVar7.zzB() & 1) == 1) {
                                        zzetVar7.zzk(8);
                                    }
                                    int iZzs = zzetVar7.zzs();
                                    int iZzH2 = zzetVar7.zzH();
                                    int i59 = zzamkVar2.zze;
                                    if (iZzH2 > i59) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i59).length());
                                        sb2.append("Saiz sample count ");
                                        sb2.append(iZzH2);
                                        sb2.append(" is greater than fragment sample count");
                                        sb2.append(i59);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    if (iZzs == 0) {
                                        boolean[] zArr2 = zzamkVar2.zzl;
                                        i17 = 0;
                                        for (int i60 = 0; i60 < iZzH2; i60++) {
                                            int iZzs2 = zzetVar7.zzs();
                                            i17 += iZzs2;
                                            zArr2[i60] = iZzs2 > i58;
                                        }
                                        z11 = false;
                                    } else {
                                        boolean z18 = iZzs > i58;
                                        i17 = iZzs * iZzH2;
                                        z11 = false;
                                        Arrays.fill(zzamkVar2.zzl, 0, iZzH2, z18);
                                    }
                                    Arrays.fill(zzamkVar2.zzl, iZzH2, zzamkVar2.zze, z11);
                                    if (i17 > 0) {
                                        zzamkVar2.zza(i17);
                                    }
                                }
                                zzfy zzfyVarZzc6 = zzfxVar2.zzc(1935763823);
                                if (zzfyVarZzc6 != null) {
                                    zzet zzetVar8 = zzfyVarZzc6.zza;
                                    zzetVar8.zzh(8);
                                    int iZzB8 = zzetVar8.zzB();
                                    if ((iZzB8 & 1) == 1) {
                                        zzetVar8.zzk(8);
                                    }
                                    int iZzH3 = zzetVar8.zzH();
                                    if (iZzH3 != 1) {
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                        sb3.append("Unexpected saio entry count: ");
                                        sb3.append(iZzH3);
                                        throw zzat.zzb(sb3.toString(), null);
                                    }
                                    zzamkVar2.zzc += zzalj.zza(iZzB8) == 0 ? zzetVar8.zzz() : zzetVar8.zzJ();
                                }
                                zzfy zzfyVarZzc7 = zzfxVar2.zzc(1936027235);
                                if (zzfyVarZzc7 != null) {
                                    zzl(zzfyVarZzc7.zza, 0, zzamkVar2);
                                }
                                String str2 = zzamjVarZza != null ? zzamjVarZza.zzb : null;
                                zzet zzetVar9 = null;
                                zzet zzetVar10 = null;
                                for (int i61 = 0; i61 < list4.size(); i61++) {
                                    zzfy zzfyVar4 = (zzfy) list4.get(i61);
                                    zzet zzetVar11 = zzfyVar4.zza;
                                    int i62 = zzfyVar4.zzd;
                                    if (i62 == 1935828848) {
                                        zzetVar11.zzh(12);
                                        if (zzetVar11.zzB() == 1936025959) {
                                            zzetVar9 = zzetVar11;
                                        }
                                    } else if (i62 == 1936158820) {
                                        zzetVar11.zzh(12);
                                        if (zzetVar11.zzB() == 1936025959) {
                                            zzetVar10 = zzetVar11;
                                        }
                                    }
                                }
                                if (zzetVar9 == null || zzetVar10 == null) {
                                    z10 = true;
                                } else {
                                    zzetVar9.zzh(8);
                                    int iZza = zzalj.zza(zzetVar9.zzB());
                                    zzetVar9.zzk(4);
                                    if (iZza == 1) {
                                        zzetVar9.zzk(4);
                                    }
                                    if (zzetVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzetVar10.zzh(8);
                                    int iZza2 = zzalj.zza(zzetVar10.zzB());
                                    zzetVar10.zzk(4);
                                    if (iZza2 == 1) {
                                        if (zzetVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZza2 >= 2) {
                                        zzetVar10.zzk(4);
                                    }
                                    if (zzetVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    z10 = true;
                                    zzetVar10.zzk(1);
                                    int iZzs3 = zzetVar10.zzs();
                                    int i63 = (iZzs3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    int i64 = iZzs3 & 15;
                                    if (zzetVar10.zzs() == 1) {
                                        int iZzs4 = zzetVar10.zzs();
                                        int i65 = i36;
                                        byte[] bArr3 = new byte[i65];
                                        zzetVar10.zzm(bArr3, 0, i65);
                                        if (iZzs4 == 0) {
                                            int iZzs5 = zzetVar10.zzs();
                                            byte[] bArr4 = new byte[iZzs5];
                                            zzetVar10.zzm(bArr4, 0, iZzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzamkVar2.zzk = true;
                                        zzamkVar2.zzm = new zzamj(true, str2, iZzs4, bArr3, i63, i64, bArr);
                                    }
                                }
                                int size5 = list4.size();
                                for (int i66 = 0; i66 < size5; i66++) {
                                    zzfy zzfyVar5 = (zzfy) list4.get(i66);
                                    if (zzfyVar5.zzd == 1970628964) {
                                        zzet zzetVar12 = zzfyVar5.zza;
                                        zzetVar12.zzh(8);
                                        zzetVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzetVar12, 16, zzamkVar2);
                                        }
                                    }
                                }
                                i15 = 0;
                                i13 = 8;
                                i14 = 16;
                            }
                        } else {
                            i10 = i38;
                            list = list3;
                            i11 = size3;
                            i12 = i39;
                            i13 = i26;
                            z10 = z14;
                            i14 = i36;
                            i15 = i37;
                        }
                        i39 = i12 + 1;
                        i37 = i15;
                        i26 = i13;
                        i36 = i14;
                        z14 = z10;
                        i38 = i10;
                        size3 = i11;
                        list3 = list;
                    }
                    int i67 = i37;
                    zzq zzqVarZzn2 = zzn(zzfxVar.zzb);
                    if (zzqVarZzn2 != null) {
                        int size6 = sparseArray4.size();
                        for (int i68 = i67; i68 < size6; i68++) {
                            ((zzalq) sparseArray4.valueAt(i68)).zzb(zzqVarZzn2);
                        }
                    }
                    if (this.zzz != C.TIME_UNSET) {
                        int size7 = sparseArray4.size();
                        for (int i69 = i67; i69 < size7; i69++) {
                            zzalq zzalqVar2 = (zzalq) sparseArray4.valueAt(i69);
                            long j19 = this.zzz;
                            int i70 = zzalqVar2.zzf;
                            while (true) {
                                zzamk zzamkVar3 = zzalqVar2.zzb;
                                if (i70 >= zzamkVar3.zze || zzamkVar3.zzi[i70] > j19) {
                                    break;
                                }
                                if (zzamkVar3.zzj[i70]) {
                                    zzalqVar2.zzi = i70;
                                }
                                i70++;
                            }
                        }
                        this.zzz = C.TIME_UNSET;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzfx) arrayDeque.peek()).zzb(zzfxVar);
                }
            }
        }
        zzi();
    }

    private static int zzk(int i10) throws zzat {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i10);
        throw zzat.zzb(sb2.toString(), null);
    }

    private static void zzl(zzet zzetVar, int i10, zzamk zzamkVar) throws zzat {
        zzetVar.zzh(i10 + 8);
        int iZzB = zzetVar.zzB();
        int i11 = zzalj.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iZzB & 2) != 0;
        int iZzH = zzetVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzamkVar.zzl, 0, zzamkVar.zze, false);
            return;
        }
        int i12 = zzamkVar.zze;
        if (iZzH != i12) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i12).length());
            sb2.append("Senc sample count ");
            sb2.append(iZzH);
            sb2.append(" is different from fragment sample count");
            sb2.append(i12);
            throw zzat.zzb(sb2.toString(), null);
        }
        Arrays.fill(zzamkVar.zzl, 0, iZzH, z10);
        zzamkVar.zza(zzetVar.zzd());
        zzet zzetVar2 = zzamkVar.zzn;
        zzetVar.zzm(zzetVar2.zzi(), 0, zzetVar2.zze());
        zzetVar2.zzh(0);
        zzamkVar.zzo = false;
    }

    private static Pair zzm(zzet zzetVar, long j10) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzet zzetVar2 = zzetVar;
        zzetVar2.zzh(8);
        int iZza = zzalj.zza(zzetVar2.zzB());
        zzetVar2.zzk(4);
        long jZzz = zzetVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzetVar2.zzz();
            jZzJ2 = zzetVar2.zzz();
        } else {
            jZzJ = zzetVar2.zzJ();
            jZzJ2 = zzetVar2.zzJ();
        }
        long j11 = j10 + jZzJ2;
        long jZzv = zzfl.zzv(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzetVar2.zzk(2);
        int iZzt = zzetVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j12 = j11;
        long j13 = jZzv;
        int i10 = 0;
        while (i10 < iZzt) {
            int iZzB = zzetVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzetVar2.zzz();
            iArr[i10] = iZzB & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzv2 = zzfl.zzv(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i10] = jZzv2 - jArr5[i10];
            zzetVar2.zzk(4);
            j12 += (long) iArr[i10];
            i10++;
            zzetVar2 = zzetVar;
            iZzt = iZzt;
            j13 = jZzv2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzv), new zzafm(iArr, jArr, jArr2, jArr3));
    }

    private static zzq zzn(List list) {
        int i10;
        UUID[] uuidArr;
        zzame zzameVar;
        int size = list.size();
        int i11 = 0;
        ArrayList arrayList = null;
        while (i11 < size) {
            zzfy zzfyVar = (zzfy) list.get(i11);
            if (zzfyVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzi = zzfyVar.zza.zzi();
                zzet zzetVar = new zzet(bArrZzi);
                if (zzetVar.zze() < 32) {
                    i10 = i11;
                    zzameVar = null;
                } else {
                    zzetVar.zzh(0);
                    int iZzd = zzetVar.zzd();
                    int iZzB = zzetVar.zzB();
                    if (iZzB != iZzd) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length());
                        sb2.append("Advertised atom size (");
                        sb2.append(iZzB);
                        sb2.append(") does not match buffer size: ");
                        sb2.append(iZzd);
                        zzeg.zzc("PsshAtomUtil", sb2.toString());
                    } else {
                        int iZzB2 = zzetVar.zzB();
                        if (iZzB2 != 1886614376) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzB2).length() + 23);
                            sb3.append("Atom type is not pssh: ");
                            sb3.append(iZzB2);
                            zzeg.zzc("PsshAtomUtil", sb3.toString());
                        } else {
                            int iZza = zzalj.zza(zzetVar.zzB());
                            if (iZza > 1) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 26);
                                sb4.append("Unsupported pssh version: ");
                                sb4.append(iZza);
                                zzeg.zzc("PsshAtomUtil", sb4.toString());
                            } else {
                                UUID uuid = new UUID(zzetVar.zzD(), zzetVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzetVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i12 = 0;
                                    while (i12 < iZzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i13 = i12;
                                        uuidArr2[i13] = new UUID(zzetVar.zzD(), zzetVar.zzD());
                                        i12 = i13 + 1;
                                        i11 = i11;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i10 = i11;
                                int iZzH2 = zzetVar.zzH();
                                int iZzd2 = zzetVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length());
                                    sb5.append("Atom data size (");
                                    sb5.append(iZzH2);
                                    sb5.append(") does not match the bytes left: ");
                                    sb5.append(iZzd2);
                                    zzeg.zzc("PsshAtomUtil", sb5.toString());
                                    zzameVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzetVar.zzm(bArr, 0, iZzH2);
                                    zzameVar = new zzame(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i10 = i11;
                    zzameVar = null;
                }
                UUID uuid2 = zzameVar == null ? null : zzameVar.zza;
                if (uuid2 == null) {
                    zzeg.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzp(uuid2, null, MimeTypes.VIDEO_MP4, bArrZzi));
                }
                i11 = i10 + 1;
            } else {
                i10 = i11;
            }
            i11 = i10 + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private final void zzo(zzahb zzahbVar, zzagy zzagyVar) {
        this.zzI.zzw(zzahbVar);
        this.zzL = true;
        zzagyVar.zza = this.zzO;
        zzi();
    }

    private static final zzalk zzp(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (zzalk) sparseArray.valueAt(0);
        }
        zzalk zzalkVar = (zzalk) sparseArray.get(i10);
        zzalkVar.getClass();
        return zzalkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) {
        zzahf zzahfVarZza = zzamh.zza(zzafzVar);
        this.zzr = zzahfVarZza != null ? zzgwm.zzj(zzahfVarZza) : zzgwm.zzi();
        return zzahfVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        int i10;
        int i11 = this.zzd;
        if ((i11 & 32) == 0) {
            zzagbVar = new zzanm(zzagbVar, this.zzc);
        }
        this.zzI = zzagbVar;
        zzi();
        zzahk[] zzahkVarArr = new zzahk[2];
        this.zzJ = zzahkVarArr;
        int i12 = 100;
        int i13 = 0;
        if ((i11 & 4) != 0) {
            zzahkVarArr[0] = this.zzI.zzu(100, 5);
            i10 = 1;
            i12 = 101;
        } else {
            i10 = 0;
        }
        zzahk[] zzahkVarArr2 = (zzahk[]) zzfl.zzb(this.zzJ, i10);
        this.zzJ = zzahkVarArr2;
        for (zzahk zzahkVar : zzahkVarArr2) {
            zzahkVar.zzA(zzb);
        }
        List list = this.zze;
        this.zzK = new zzahk[list.size()];
        while (i13 < this.zzK.length) {
            zzahk zzahkVarZzu = this.zzI.zzu(i12, 3);
            zzahkVarZzu.zzA((zzv) list.get(i13));
            this.zzK[i13] = zzahkVarZzu;
            i13++;
            i12++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:381:0x089b  */
    /* JADX WARN: Code duplicated, block: B:383:0x08a4 A[LOOP:1: B:382:0x08a2->B:383:0x08a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:386:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:387:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:482:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:484:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:489:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws zzat {
        int i10;
        zzalq zzalqVar;
        char c10;
        int iZza;
        int iZzc;
        int iZzi;
        int i11;
        int i12;
        long j10;
        long j11;
        long jZzz;
        long j12;
        long jZzv;
        long jZzz2;
        String str;
        String str2;
        long j13;
        int i13;
        long j14;
        long j15;
        SparseArray sparseArray;
        int size;
        int i14;
        while (true) {
            int i15 = this.zzs;
            char c11 = 2;
            i10 = 0;
            if (i15 == 0) {
                if (this.zzv == 0) {
                    zzet zzetVar = this.zzm;
                    if (!zzafzVar.zzb(zzetVar.zzi(), 0, 8, true)) {
                        long j16 = this.zzN;
                        if (j16 == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzagyVar.zza = j16;
                        this.zzN = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        this.zzM = true;
                        return 1;
                    }
                    this.zzv = 8;
                    zzetVar.zzh(0);
                    this.zzu = zzetVar.zzz();
                    this.zzt = zzetVar.zzB();
                }
                long j17 = this.zzu;
                if (j17 == 1) {
                    zzet zzetVar2 = this.zzm;
                    zzafzVar.zzc(zzetVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzetVar2.zzJ();
                } else if (j17 == 0) {
                    long jZzo = zzafzVar.zzo();
                    if (jZzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        jZzo = !arrayDeque.isEmpty() ? ((zzfx) arrayDeque.peek()).zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzu = (jZzo - zzafzVar.zzn()) + ((long) this.zzv);
                    }
                }
                long j18 = this.zzu;
                int i16 = this.zzv;
                long j19 = i16;
                if (j18 < j19) {
                    if (this.zzt != 1718773093 || i16 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzu = j19;
                    j18 = j19;
                }
                if (this.zzN != -1) {
                    if (this.zzt == 1936286840) {
                        zzet zzetVar3 = this.zzk;
                        zzetVar3.zza((int) j18);
                        System.arraycopy(this.zzm.zzi(), 0, zzetVar3.zzi(), 0, 8);
                        zzafzVar.zzc(zzetVar3.zzi(), 8, (int) (this.zzu - ((long) this.zzv)));
                        this.zzq.zza((zzafm) zzm(new zzfy(1936286840, zzetVar3).zza, zzafzVar.zzm()).second);
                    } else {
                        zzafzVar.zze((int) (j18 - j19), true);
                    }
                    zzi();
                } else {
                    long jZzn = zzafzVar.zzn() - j19;
                    int i17 = this.zzt;
                    if (!(i17 == 1836019558 || i17 == 1835295092) || this.zzL) {
                        if (this.zzt == 1836019558) {
                            sparseArray = this.zzf;
                            size = sparseArray.size();
                            for (i14 = 0; i14 < size; i14++) {
                                zzamk zzamkVar = ((zzalq) sparseArray.valueAt(i14)).zzb;
                                zzamkVar.zzc = jZzn;
                                zzamkVar.zzb = jZzn;
                            }
                        }
                        i13 = this.zzt;
                        if (i13 == 1835295092) {
                            this.zzC = null;
                            this.zzx = jZzn + this.zzu;
                            this.zzs = 2;
                        } else if (i13 != 1836019574) {
                            long jZzn2 = zzafzVar.zzn();
                            j14 = this.zzu;
                            long j20 = jZzn2 + j14;
                            if (j14 != this.zzv) {
                                zzet zzetVar4 = this.zzk;
                                zzetVar4.zza(8);
                                zzafzVar.zzi(zzetVar4.zzi(), 0, 8);
                                zzalj.zzf(zzetVar4);
                                zzafzVar.zzf(zzetVar4.zzg());
                                zzafzVar.zzl();
                            }
                            j15 = j20 - 8;
                            this.zzn.push(new zzfx(this.zzt, j15));
                            if (this.zzu == this.zzv) {
                                zzj(j15);
                            } else {
                                zzi();
                            }
                        } else {
                            long jZzn3 = zzafzVar.zzn();
                            j14 = this.zzu;
                            long j21 = jZzn3 + j14;
                            if (j14 != this.zzv) {
                                zzet zzetVar5 = this.zzk;
                                zzetVar5.zza(8);
                                zzafzVar.zzi(zzetVar5.zzi(), 0, 8);
                                zzalj.zzf(zzetVar5);
                                zzafzVar.zzf(zzetVar5.zzg());
                                zzafzVar.zzl();
                            }
                            j15 = j21 - 8;
                            this.zzn.push(new zzfx(this.zzt, j15));
                            if (this.zzu == this.zzv) {
                                zzj(j15);
                            } else {
                                zzi();
                            }
                        }
                    } else if (zzafzVar.zzo() == -1 || this.zzO != -1 || (this.zzd & 512) == 0) {
                        this.zzI.zzw(new zzaha(this.zzA, jZzn));
                        this.zzL = true;
                        if (this.zzt == 1836019558) {
                            sparseArray = this.zzf;
                            size = sparseArray.size();
                            while (i14 < size) {
                                zzamk zzamkVar2 = ((zzalq) sparseArray.valueAt(i14)).zzb;
                                zzamkVar2.zzc = jZzn;
                                zzamkVar2.zzb = jZzn;
                            }
                        }
                        i13 = this.zzt;
                        if (i13 == 1835295092) {
                            this.zzC = null;
                            this.zzx = jZzn + this.zzu;
                            this.zzs = 2;
                        } else if (i13 != 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1836019558 || i13 == 1953653094 || i13 == 1836475768 || i13 == 1701082227 || i13 == 1835365473) {
                            long jZzn4 = zzafzVar.zzn();
                            j14 = this.zzu;
                            long j22 = jZzn4 + j14;
                            if (j14 != this.zzv && i13 == 1835365473) {
                                zzet zzetVar6 = this.zzk;
                                zzetVar6.zza(8);
                                zzafzVar.zzi(zzetVar6.zzi(), 0, 8);
                                zzalj.zzf(zzetVar6);
                                zzafzVar.zzf(zzetVar6.zzg());
                                zzafzVar.zzl();
                            }
                            j15 = j22 - 8;
                            this.zzn.push(new zzfx(this.zzt, j15));
                            if (this.zzu == this.zzv) {
                                zzj(j15);
                            } else {
                                zzi();
                            }
                        } else if (i13 == 1751411826 || i13 == 1835296868 || i13 == 1836476516 || i13 == 1936286840 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1668576371 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1937011571 || i13 == 1952867444 || i13 == 1952868452 || i13 == 1953196132 || i13 == 1953654136 || i13 == 1953658222 || i13 == 1886614376 || i13 == 1935763834 || i13 == 1935763823 || i13 == 1936027235 || i13 == 1970628964 || i13 == 1935828848 || i13 == 1936158820 || i13 == 1701606260 || i13 == 1835362404 || i13 == 1701671783 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                            if (this.zzv != 8) {
                                throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                            }
                            if (this.zzu > 2147483647L) {
                                throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            zzet zzetVar7 = new zzet((int) this.zzu);
                            System.arraycopy(this.zzm.zzi(), 0, zzetVar7.zzi(), 0, 8);
                            this.zzw = zzetVar7;
                            this.zzs = 1;
                        } else {
                            if (this.zzu > 2147483647L) {
                                throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            this.zzw = null;
                            this.zzs = 1;
                        }
                    } else {
                        this.zzO = jZzn;
                        zzagyVar.zza = zzafzVar.zzo() - 16;
                        this.zzs = 5;
                    }
                }
                if (this.zzs == 5) {
                    return 1;
                }
            } else if (i15 != 1) {
                long j23 = Long.MAX_VALUE;
                if (i15 == 2) {
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    zzalq zzalqVar2 = null;
                    for (int i18 = 0; i18 < size2; i18++) {
                        zzamk zzamkVar3 = ((zzalq) sparseArray2.valueAt(i18)).zzb;
                        if (zzamkVar3.zzo) {
                            long j24 = zzamkVar3.zzc;
                            if (j24 < j23) {
                                zzalqVar2 = (zzalq) sparseArray2.valueAt(i18);
                                j23 = j24;
                            }
                        }
                    }
                    if (zzalqVar2 == null) {
                        this.zzs = 3;
                    } else {
                        int iZzn = (int) (j23 - zzafzVar.zzn());
                        if (iZzn < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzafzVar.zzf(iZzn);
                        zzamk zzamkVar4 = zzalqVar2.zzb;
                        zzet zzetVar8 = zzamkVar4.zzn;
                        zzafzVar.zzc(zzetVar8.zzi(), 0, zzetVar8.zze());
                        zzetVar8.zzh(0);
                        zzamkVar4.zzo = false;
                    }
                } else if (i15 == 5) {
                    zzet zzetVar9 = this.zzk;
                    zzetVar9.zza(16);
                    if (zzafzVar.zzb(zzetVar9.zzi(), 0, 16, true)) {
                        zzetVar9.zzh(0);
                        int iZzB = zzetVar9.zzB();
                        int iZzB2 = zzetVar9.zzB();
                        if (iZzB == 16 && iZzB2 == 1835430511) {
                            zzetVar9.zzk(4);
                            long jZzz3 = zzetVar9.zzz();
                            long jZzo2 = zzafzVar.zzo() - jZzz3;
                            if (jZzz3 <= 0 || jZzz3 > 2147483647L || jZzo2 < 0 || jZzo2 < this.zzO) {
                                zzo(new zzaha(this.zzA, this.zzO), zzagyVar);
                            } else {
                                zzagyVar.zza = jZzo2;
                                this.zzs = 6;
                            }
                        } else {
                            zzo(new zzaha(this.zzA, this.zzO), zzagyVar);
                        }
                    } else {
                        zzo(new zzaha(this.zzA, this.zzO), zzagyVar);
                    }
                    int i19 = this.zzs;
                    if (i19 == 6 || i19 == 0) {
                        return 1;
                    }
                } else if (i15 != 6) {
                    zzalqVar = this.zzC;
                    if (zzalqVar != null) {
                        c10 = 2;
                        break;
                    }
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzalq zzalqVar3 = null;
                    int i20 = 0;
                    while (i20 < size3) {
                        char c12 = c11;
                        zzalq zzalqVar4 = (zzalq) sparseArray3.valueAt(i20);
                        if ((zzalqVar4.zzk() || zzalqVar4.zzf != zzalqVar4.zzd.zzb) && (!zzalqVar4.zzk() || zzalqVar4.zzh != zzalqVar4.zzb.zzd)) {
                            long jZze = zzalqVar4.zze();
                            if (jZze < j23) {
                                zzalqVar3 = zzalqVar4;
                                j23 = jZze;
                            }
                        }
                        i20++;
                        c11 = c12;
                    }
                    c10 = c11;
                    if (zzalqVar3 != null) {
                        int iZze = (int) (zzalqVar3.zze() - zzafzVar.zzn());
                        if (iZze < 0) {
                            zzeg.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZze = 0;
                        }
                        zzafzVar.zzf(iZze);
                        this.zzC = zzalqVar3;
                        zzalqVar = zzalqVar3;
                        break;
                    }
                    int iZzn2 = (int) (this.zzx - zzafzVar.zzn());
                    if (iZzn2 < 0) {
                        throw zzat.zzb("Offset to end of mdat was negative.", null);
                    }
                    zzafzVar.zzf(iZzn2);
                    zzi();
                } else {
                    int i21 = 2;
                    int iZzo = (int) (zzafzVar.zzo() - zzafzVar.zzn());
                    zzet zzetVar10 = new zzet(iZzo);
                    zzafzVar.zzc(zzetVar10.zzi(), 0, iZzo);
                    zzetVar10.zzh(0);
                    zzetVar10.zzh(zzetVar10.zzB() == 1 ? 16 : 8);
                    SparseArray sparseArray4 = new SparseArray();
                    SparseArray sparseArray5 = new SparseArray();
                    for (int i22 = 8; zzetVar10.zzd() >= i22; i22 = 8) {
                        int iZzg = zzetVar10.zzg();
                        long jZzz4 = zzetVar10.zzz();
                        int iZzB3 = zzetVar10.zzB();
                        if (jZzz4 == 1) {
                            if (zzetVar10.zzd() < i22) {
                                break;
                            }
                            jZzz4 = zzetVar10.zzD();
                        } else if (jZzz4 == 0) {
                            jZzz4 = ((long) zzetVar10.zze()) - ((long) iZzg);
                        }
                        int i23 = jZzz4 == 1 ? 16 : i22;
                        if (jZzz4 < i23) {
                            break;
                        }
                        long j25 = iZzg;
                        if (jZzz4 > ((long) zzetVar10.zze()) - j25) {
                            break;
                        }
                        if (iZzB3 == 1952871009) {
                            if (jZzz4 < i23 + 16) {
                                zzetVar10.zzh((int) (j25 + jZzz4));
                            } else {
                                int iZza2 = zzalj.zza(zzetVar10.zzB());
                                int iZzB4 = zzetVar10.zzB();
                                zzalq zzalqVar5 = (zzalq) this.zzf.get(iZzB4);
                                if (zzalqVar5 == null) {
                                    zzetVar10.zzh((int) (j25 + jZzz4));
                                } else {
                                    long j26 = zzalqVar5.zzd.zza.zzc;
                                    int iZzB5 = zzetVar10.zzB();
                                    int i24 = iZzB5 >> 4;
                                    int i25 = iZzB5 >> 2;
                                    int i26 = iZzB5 & 3;
                                    j10 = jZzz4;
                                    long jZzz5 = zzetVar10.zzz();
                                    int i27 = (i24 & 3) + 1;
                                    int i28 = (i25 & 3) + 1;
                                    int i29 = i26 + 1;
                                    j11 = j25;
                                    if (((iZza2 == 1 ? 16L : 8L) + ((long) i27) + ((long) i28) + ((long) i29)) * jZzz5 > zzetVar10.zzd()) {
                                        zzetVar10.zzh((int) (j11 + j10));
                                    } else {
                                        int i30 = (int) jZzz5;
                                        long[] jArr = new long[i30];
                                        long[] jArr2 = new long[i30];
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if (iZza2 == 1) {
                                                jZzz = zzetVar10.zzJ();
                                                iZza2 = 1;
                                            } else {
                                                jZzz = zzetVar10.zzz();
                                            }
                                            long jZzJ = iZza2 == 1 ? zzetVar10.zzJ() : zzetVar10.zzz();
                                            zzetVar10.zzk(i27 + i28 + i29);
                                            jArr[i31] = zzfl.zzv(jZzz, 1000000L, j26, RoundingMode.DOWN);
                                            jArr2[i31] = jZzJ;
                                            i31++;
                                            iZza2 = iZza2;
                                        }
                                        sparseArray4.put(iZzB4, jArr);
                                        sparseArray5.put(iZzB4, jArr2);
                                    }
                                }
                            }
                        } else {
                            j10 = jZzz4;
                            j11 = j25;
                        }
                        zzetVar10.zzh((int) (j11 + j10));
                    }
                    if (sparseArray4.size() == 0) {
                        zzo(new zzaha(this.zzA, this.zzO), zzagyVar);
                    } else {
                        int iKeyAt = -1;
                        int i32 = -1;
                        int i33 = 0;
                        while (i33 < sparseArray4.size()) {
                            int iKeyAt2 = sparseArray4.keyAt(i33);
                            zzalq zzalqVar6 = (zzalq) this.zzf.get(iKeyAt2);
                            if (zzalqVar6 != null) {
                                int i34 = zzalqVar6.zzd.zza.zzb;
                                if (iKeyAt != -1) {
                                    i12 = iKeyAt;
                                } else if (i34 == i21) {
                                    iKeyAt = iKeyAt2;
                                } else {
                                    i12 = -1;
                                }
                                if (i32 == -1) {
                                    i32 = i34 == 1 ? iKeyAt2 : -1;
                                }
                                iKeyAt = i12;
                            }
                            i33++;
                            i21 = 2;
                        }
                        if (iKeyAt != -1) {
                            i11 = iKeyAt;
                        } else if (i32 != -1) {
                            i11 = i32;
                        } else {
                            iKeyAt = sparseArray4.keyAt(0);
                            i11 = iKeyAt;
                        }
                        zzo(new zzalp(sparseArray4, sparseArray5, this.zzA, this.zzO, i11, null), zzagyVar);
                    }
                    if (this.zzs == 0) {
                        return 1;
                    }
                }
            } else {
                long j27 = this.zzu - ((long) this.zzv);
                zzet zzetVar11 = this.zzw;
                int i35 = (int) j27;
                if (zzetVar11 != null) {
                    zzafzVar.zzc(zzetVar11.zzi(), 8, i35);
                    zzfy zzfyVar = new zzfy(this.zzt, zzetVar11);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i36 = zzfyVar.zzd;
                        if (i36 == 1936286840) {
                            Pair pairZzm = zzm(zzfyVar.zza, zzafzVar.zzn());
                            zzafn zzafnVar = this.zzq;
                            zzafnVar.zza((zzafm) pairZzm.second);
                            this.zzB = ((Long) pairZzm.first).longValue();
                            if (!this.zzL) {
                                this.zzI.zzw((zzahb) pairZzm.second);
                                this.zzL = true;
                            } else if ((this.zzd & 256) != 0 && !this.zzM && zzafnVar.zzc() > 1) {
                                this.zzN = zzafzVar.zzn();
                            }
                        } else if (i36 == 1701671783) {
                            zzet zzetVar12 = zzfyVar.zza;
                            if (this.zzJ.length != 0) {
                                zzetVar12.zzh(8);
                                int iZza3 = zzalj.zza(zzetVar12.zzB());
                                if (iZza3 == 0) {
                                    String strZzM = zzetVar12.zzM((char) 0);
                                    strZzM.getClass();
                                    String strZzM2 = zzetVar12.zzM((char) 0);
                                    strZzM2.getClass();
                                    long jZzz6 = zzetVar12.zzz();
                                    long jZzz7 = zzetVar12.zzz();
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    long jZzv2 = zzfl.zzv(jZzz7, 1000000L, jZzz6, roundingMode);
                                    long j28 = this.zzB;
                                    long j29 = j28 != C.TIME_UNSET ? j28 + jZzv2 : -9223372036854775807L;
                                    long jZzv3 = zzfl.zzv(zzetVar12.zzz(), 1000L, jZzz6, roundingMode);
                                    long j30 = j29;
                                    j12 = jZzv2;
                                    jZzv = j30;
                                    jZzz2 = zzetVar12.zzz();
                                    str = strZzM;
                                    str2 = strZzM2;
                                    j13 = jZzv3;
                                } else if (iZza3 != 1) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZza3).length() + 35);
                                    sb2.append("Skipping unsupported emsg version: ");
                                    sb2.append(iZza3);
                                    zzeg.zzc("FragmentedMp4Extractor", sb2.toString());
                                } else {
                                    long jZzz8 = zzetVar12.zzz();
                                    long jZzJ2 = zzetVar12.zzJ();
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    jZzv = zzfl.zzv(jZzJ2, 1000000L, jZzz8, roundingMode2);
                                    long jZzv4 = zzfl.zzv(zzetVar12.zzz(), 1000L, jZzz8, roundingMode2);
                                    long jZzz9 = zzetVar12.zzz();
                                    String strZzM3 = zzetVar12.zzM((char) 0);
                                    strZzM3.getClass();
                                    String strZzM4 = zzetVar12.zzM((char) 0);
                                    strZzM4.getClass();
                                    jZzz2 = jZzz9;
                                    str = strZzM3;
                                    str2 = strZzM4;
                                    j13 = jZzv4;
                                    j12 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzetVar12.zzd()];
                                zzetVar12.zzm(bArr, 0, zzetVar12.zzd());
                                zzet zzetVar13 = new zzet(this.zzl.zza(new zzaja(str, str2, j13, jZzz2, bArr)));
                                int iZzd = zzetVar13.zzd();
                                for (zzahk zzahkVar : this.zzJ) {
                                    zzetVar13.zzh(0);
                                    zzahkVar.zzc(zzetVar13, iZzd);
                                }
                                if (jZzv == C.TIME_UNSET) {
                                    this.zzo.addLast(new zzalo(j12, true, iZzd));
                                    this.zzy += iZzd;
                                } else {
                                    ArrayDeque arrayDeque3 = this.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzahk zzahkVar2 : this.zzJ) {
                                            zzahkVar2.zze(jZzv, 1, iZzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzalo(jZzv, false, iZzd));
                                        this.zzy += iZzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzfx) arrayDeque2.peek()).zza(zzfyVar);
                    }
                } else {
                    zzafzVar.zzf(i35);
                }
                zzj(zzafzVar.zzn());
            }
        }
        if (this.zzs == 3) {
            this.zzD = zzalqVar.zzf();
            String str3 = zzalqVar.zzd.zza.zzg.zzp;
            this.zzG = !(!Objects.equals(str3, MimeTypes.VIDEO_H264) ? !Objects.equals(str3, MimeTypes.VIDEO_H265) || (this.zzd & 128) == 0 : (this.zzd & 64) == 0);
            if (zzalqVar.zzf < zzalqVar.zzi) {
                zzafzVar.zzf(this.zzD);
                zzamj zzamjVarZzj = zzalqVar.zzj();
                if (zzamjVarZzj != null) {
                    zzamk zzamkVar5 = zzalqVar.zzb;
                    zzet zzetVar14 = zzamkVar5.zzn;
                    int i37 = zzamjVarZzj.zzd;
                    if (i37 != 0) {
                        zzetVar14.zzk(i37);
                    }
                    if (zzamkVar5.zzb(zzalqVar.zzf)) {
                        zzetVar14.zzk(zzetVar14.zzt() * 6);
                    }
                }
                if (!zzalqVar.zzh()) {
                    this.zzC = null;
                }
                this.zzs = 3;
                return 0;
            }
            if (zzalqVar.zzd.zza.zzh == 1) {
                this.zzD -= 8;
                zzafzVar.zzf(8);
            }
            if ("audio/ac4".equals(zzalqVar.zzd.zza.zzg.zzp)) {
                this.zzE = zzalqVar.zzi(this.zzD, 7);
                int i38 = this.zzD;
                zzet zzetVar15 = this.zzk;
                zzafb.zzc(i38, zzetVar15);
                zzalqVar.zza.zzc(zzetVar15, 7);
                iZzi = this.zzE + 7;
                this.zzE = iZzi;
            } else {
                iZzi = zzalqVar.zzi(this.zzD, 0);
                this.zzE = iZzi;
            }
            this.zzD += iZzi;
            this.zzs = 4;
            this.zzF = 0;
        }
        zzami zzamiVar = zzalqVar.zzd.zza;
        zzahk zzahkVar3 = zzalqVar.zza;
        long jZzd = zzalqVar.zzd();
        int i39 = zzamiVar.zzk;
        if (i39 == 0) {
            while (true) {
                int i40 = this.zzE;
                int i41 = this.zzD;
                if (i40 >= i41) {
                    break;
                }
                this.zzE += zzahkVar3.zza(zzafzVar, i41 - i40, false);
            }
        } else {
            zzet zzetVar16 = this.zzh;
            byte[] bArrZzi = zzetVar16.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[c10] = 0;
            int i42 = 4 - i39;
            while (this.zzE < this.zzD) {
                int i43 = this.zzF;
                if (i43 == 0) {
                    if (this.zzK.length > 0 || !this.zzG) {
                        iZzc = zzgp.zzc(zzamiVar.zzg);
                        if (i39 + iZzc > this.zzD - this.zzE) {
                            iZzc = i10;
                        }
                    } else {
                        iZzc = i10;
                    }
                    zzafzVar.zzc(bArrZzi, i42, i39 + iZzc);
                    zzetVar16.zzh(i10);
                    int iZzB6 = zzetVar16.zzB();
                    if (iZzB6 < 0) {
                        throw zzat.zzb("Invalid NAL length", null);
                    }
                    this.zzF = iZzB6 - iZzc;
                    zzet zzetVar17 = this.zzg;
                    zzetVar17.zzh(i10);
                    zzahkVar3.zzc(zzetVar17, 4);
                    this.zzE += 4;
                    this.zzD += i42;
                    this.zzH = (this.zzK.length <= 0 || iZzc <= 0 || !zzgp.zzb(zzamiVar.zzg, bArrZzi, 4)) ? i10 : 1;
                    zzahkVar3.zzc(zzetVar16, iZzc);
                    this.zzE += iZzc;
                    if (iZzc > 0 && !this.zzG && zzgp.zzd(bArrZzi, 4, iZzc, zzamiVar.zzg)) {
                        this.zzG = true;
                    }
                } else {
                    if (this.zzH) {
                        zzet zzetVar18 = this.zzi;
                        zzetVar18.zza(i43);
                        zzafzVar.zzc(zzetVar18.zzi(), i10, this.zzF);
                        zzahkVar3.zzc(zzetVar18, this.zzF);
                        iZza = this.zzF;
                        int iZza4 = zzgp.zza(zzetVar18.zzi(), zzetVar18.zze());
                        zzetVar18.zzh(i10);
                        zzetVar18.zzf(iZza4);
                        int i44 = zzamiVar.zzg.zzr;
                        if (i44 == -1) {
                            zzgz zzgzVar = this.zzp;
                            if (zzgzVar.zzb() != 0) {
                                zzgzVar.zza(i10);
                            }
                        } else {
                            zzgz zzgzVar2 = this.zzp;
                            if (zzgzVar2.zzb() != i44) {
                                zzgzVar2.zza(i44);
                            }
                        }
                        zzgz zzgzVar3 = this.zzp;
                        zzgzVar3.zzc(jZzd, zzetVar18);
                        if ((zzalqVar.zzg() & 4) != 0) {
                            zzgzVar3.zze();
                        }
                    } else {
                        iZza = zzahkVar3.zza(zzafzVar, i43, i10);
                    }
                    this.zzE += iZza;
                    this.zzF -= iZza;
                    i10 = 0;
                }
            }
        }
        int iZzg2 = zzalqVar.zzg();
        if (!this.zzG) {
            iZzg2 |= 67108864;
        }
        int i45 = iZzg2;
        zzamj zzamjVarZzj2 = zzalqVar.zzj();
        zzahkVar3.zze(jZzd, i45, this.zzD, 0, zzamjVarZzj2 != null ? zzamjVarZzj2.zzc : null);
        while (true) {
            ArrayDeque arrayDeque4 = this.zzo;
            if (arrayDeque4.isEmpty()) {
                break;
            }
            zzalo zzaloVar = (zzalo) arrayDeque4.removeFirst();
            int i46 = this.zzy;
            int i47 = zzaloVar.zzc;
            this.zzy = i46 - i47;
            long j31 = zzaloVar.zza;
            if (zzaloVar.zzb) {
                j31 += jZzd;
            }
            long j32 = j31;
            for (zzahk zzahkVar4 : this.zzJ) {
                zzahkVar4.zze(j32, 1, i47, this.zzy, null);
            }
        }
        if (!zzalqVar.zzh()) {
            this.zzC = null;
        }
        this.zzs = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzalq) sparseArray.valueAt(i10)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j11;
        this.zzn.clear();
        this.zzO = -1L;
        zzi();
    }

    final /* synthetic */ void zzh(long j10, zzet zzetVar) {
        zzafl.zza(j10, zzetVar, this.zzK);
    }

    public zzalr(zzanj zzanjVar, int i10, zzfi zzfiVar, zzami zzamiVar, List list, zzahk zzahkVar) {
        this.zzc = zzanjVar;
        this.zzd = i10;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzajb();
        this.zzm = new zzet(16);
        this.zzg = new zzet(zzgp.zza);
        this.zzh = new zzet(6);
        this.zzi = new zzet();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzet(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgwm.zzi();
        this.zzA = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzI = zzagb.zza;
        this.zzJ = new zzahk[0];
        this.zzK = new zzahk[0];
        this.zzp = new zzgz(new zzgy() { // from class: com.google.android.gms.internal.ads.zzaln
            @Override // com.google.android.gms.internal.ads.zzgy
            public final /* synthetic */ void zza(long j10, zzet zzetVar) {
                this.zza.zzh(j10, zzetVar);
            }
        });
        this.zzq = new zzafn();
        this.zzN = -1L;
        this.zzO = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
