package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgp {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i10) {
        int i11;
        synchronized (zzc) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    try {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        int i14 = i12 + 1;
                        if (bArr[i12] == 0 && bArr[i14] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12 = i14;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i13) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = zzd[i17] - i15;
                System.arraycopy(bArr, i15, bArr, i16, i18);
                int i19 = i16 + i18;
                int i20 = i19 + 1;
                bArr[i19] = 0;
                i16 = i19 + 2;
                bArr[i20] = 0;
                i15 += i18 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i16, i11 - i16);
        }
        return i11;
    }

    public static boolean zzb(zzv zzvVar, byte[] bArr, int i10) {
        String strZzq = zzq(zzvVar);
        if (strZzq == null) {
            return false;
        }
        int iHashCode = strZzq.hashCode();
        if (iHashCode != -1662541442) {
            if (iHashCode != 1331836730) {
                return iHashCode == 1331856911 && strZzq.equals("video/vvc") && ((bArr[5] & 248) >> 3) == 23;
            }
            return strZzq.equals(MimeTypes.VIDEO_H264) && (bArr[4] & 31) == 6;
        }
        if (strZzq.equals(MimeTypes.VIDEO_H265) && ((bArr[4] & 126) >> 1) == 39) {
            return true;
        }
        return false;
    }

    public static int zzc(zzv zzvVar) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return (Objects.equals(strZzq, MimeTypes.VIDEO_H265) || Objects.equals(strZzq, "video/vvc")) ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i10, int i11, zzv zzvVar) {
        String str = zzvVar.zzp;
        if (Objects.equals(str, MimeTypes.VIDEO_H264)) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) != 0) {
                return true;
            }
            int i12 = b10 & 31;
            return (i12 == 1 || i12 == 9 || i12 == 14) ? false : true;
        }
        if (Objects.equals(str, MimeTypes.VIDEO_H265)) {
            zzgd zzgdVarZzl = zzl(new zzgw(bArr, 4, i11 + 4));
            int i13 = zzgdVarZzl.zza;
            if (i13 == 35) {
                return false;
            }
            return (i13 <= 14 && i13 % 2 == 0 && zzgdVarZzl.zzc == zzvVar.zzG + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:105:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x0208  */
    /* JADX WARN: Code duplicated, block: B:117:0x020c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x0221  */
    /* JADX WARN: Code duplicated, block: B:126:0x022c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0235  */
    /* JADX WARN: Code duplicated, block: B:132:0x023c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[PHI: r2
      0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x016f A[PHI: r2
      0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a1  */
    public static zzgo zze(byte[] bArr, int i10, int i11) {
        int iZzg;
        int i12;
        boolean zZze;
        int i13;
        int iZzg2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iZzh;
        int i19;
        int i20;
        int iZzg3;
        boolean z10;
        boolean zZze2;
        int i21;
        int i22;
        int i23;
        int iZzg4;
        float f10;
        int i24;
        int i25;
        float f11;
        int i26;
        int i27;
        int iZzb;
        int iZzc;
        boolean zZze3;
        boolean zZze4;
        int i28;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int i29;
        int i30;
        zzgw zzgwVar = new zzgw(bArr, i10, i11);
        int iZzf4 = zzgwVar.zzf(8);
        int iZzf5 = zzgwVar.zzf(8);
        int iZzf6 = zzgwVar.zzf(8);
        int iZzg5 = zzgwVar.zzg();
        if (iZzf4 == 100 || iZzf4 == 110 || iZzf4 == 122 || iZzf4 == 244 || iZzf4 == 44 || iZzf4 == 83 || iZzf4 == 86 || iZzf4 == 118 || iZzf4 == 128) {
            iZzg = zzgwVar.zzg();
            if (iZzg == 3) {
                zZze = zzgwVar.zze();
                i12 = 3;
            } else {
                i12 = iZzg;
                zZze = false;
            }
            i13 = 16;
            int iZzg6 = zzgwVar.zzg();
            iZzg2 = zzgwVar.zzg();
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                if (i12 != 3) {
                    i15 = 8;
                } else {
                    i15 = 12;
                }
                for (i16 = 0; i16 < i15; i16++) {
                    if (!zzgwVar.zze()) {
                        if (i16 < 6) {
                            i17 = 16;
                        } else {
                            i17 = 64;
                        }
                        iZzh = 8;
                        i19 = 8;
                        for (i18 = 0; i18 < i17; i18++) {
                            if (iZzh != 0) {
                                iZzh = ((i19 + zzgwVar.zzh()) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i19 = iZzh;
                            }
                        }
                    }
                }
            }
            i14 = iZzg6;
        } else if (iZzf4 == 138) {
            iZzf4 = 138;
            iZzg = zzgwVar.zzg();
            if (iZzg == 3) {
                zZze = zzgwVar.zze();
                i12 = 3;
            } else {
                i12 = iZzg;
                zZze = false;
            }
            i13 = 16;
            int iZzg7 = zzgwVar.zzg();
            iZzg2 = zzgwVar.zzg();
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                if (i12 != 3) {
                    i15 = 8;
                } else {
                    i15 = 12;
                }
                while (i16 < i15) {
                    if (!zzgwVar.zze()) {
                        if (i16 < 6) {
                            i17 = 16;
                        } else {
                            i17 = 64;
                        }
                        iZzh = 8;
                        i19 = 8;
                        while (i18 < i17) {
                            if (iZzh != 0) {
                                iZzh = ((i19 + zzgwVar.zzh()) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i19 = iZzh;
                            }
                        }
                    }
                }
            }
            i14 = iZzg7;
        } else {
            iZzg = 1;
            i13 = 16;
            i14 = 0;
            zZze = false;
            iZzg2 = 0;
        }
        int iZzg8 = zzgwVar.zzg() + 4;
        int iZzg9 = zzgwVar.zzg();
        if (iZzg9 != 0) {
            if (iZzg9 == 1) {
                boolean zZze5 = zzgwVar.zze();
                zzgwVar.zzh();
                zzgwVar.zzh();
                long jZzg = zzgwVar.zzg();
                for (int i31 = 0; i31 < jZzg; i31++) {
                    zzgwVar.zzg();
                }
                z10 = zZze5;
                iZzg9 = 1;
                i20 = 244;
                iZzg3 = 0;
            } else {
                i20 = 244;
                iZzg3 = 0;
            }
            int iZzg10 = zzgwVar.zzg();
            zzgwVar.zza();
            int iZzg11 = zzgwVar.zzg() + 1;
            int iZzg12 = zzgwVar.zzg() + 1;
            zZze2 = zzgwVar.zze();
            i21 = 2 - (zZze2 ? 1 : 0);
            if (!zZze2) {
                zzgwVar.zza();
            }
            zzgwVar.zza();
            i22 = iZzg11 * 16;
            i23 = iZzg12 * i21 * 16;
            if (zzgwVar.zze()) {
                int iZzg13 = zzgwVar.zzg();
                int iZzg14 = zzgwVar.zzg();
                int iZzg15 = zzgwVar.zzg();
                int iZzg16 = zzgwVar.zzg();
                if (iZzg == 0) {
                    i29 = 1;
                } else {
                    if (iZzg == 3) {
                        i29 = 1;
                    } else {
                        i29 = 2;
                    }
                    if (iZzg == 1) {
                        i30 = 2;
                    } else {
                        i30 = 1;
                    }
                    i21 *= i30;
                }
                i22 -= (iZzg13 + iZzg14) * i29;
                i23 -= (iZzg15 + iZzg16) * i21;
            }
            if (iZzf4 != 44 || iZzf4 == 86 || iZzf4 == 100 || iZzf4 == 110 || iZzf4 == 122) {
                if ((iZzf5 & 16) != 0) {
                    iZzg4 = 0;
                } else {
                    iZzg4 = i13;
                }
            } else if (iZzf4 == i20) {
                iZzf4 = i20;
                if ((iZzf5 & 16) != 0) {
                    iZzg4 = 0;
                } else {
                    iZzg4 = i13;
                }
            } else {
                iZzg4 = i13;
            }
            f10 = 1.0f;
            i24 = -1;
            if (zzgwVar.zze()) {
                if (zzgwVar.zze()) {
                    iZzf = zzgwVar.zzf(8);
                    if (iZzf == 255) {
                        int i32 = i13;
                        iZzf2 = zzgwVar.zzf(i32);
                        iZzf3 = zzgwVar.zzf(i32);
                        if (iZzf2 != 0 && iZzf3 != 0) {
                            f10 = iZzf2 / iZzf3;
                        }
                    } else if (iZzf < 17) {
                        f10 = zzb[iZzf];
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzf).length() + 35);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(iZzf);
                        zzeg.zzc("NalUnitUtil", sb2.toString());
                    }
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zza();
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zzb(3);
                    if (true != zzgwVar.zze()) {
                        i28 = 2;
                    } else {
                        i28 = 1;
                    }
                    if (zzgwVar.zze()) {
                        int iZzf7 = zzgwVar.zzf(8);
                        int iZzf8 = zzgwVar.zzf(8);
                        zzgwVar.zzb(8);
                        iZzb = zzi.zzb(iZzf7);
                        iZzc = zzi.zzc(iZzf8);
                    } else {
                        iZzb = -1;
                        iZzc = -1;
                    }
                    i24 = i28;
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                }
                if (zzgwVar.zze()) {
                    zzgwVar.zzb(65);
                }
                zZze3 = zzgwVar.zze();
                if (zZze3) {
                    zzp(zzgwVar);
                }
                zZze4 = zzgwVar.zze();
                if (zZze4) {
                    zzp(zzgwVar);
                }
                if (zZze3 || zZze4) {
                    zzgwVar.zza();
                }
                zzgwVar.zza();
                if (zzgwVar.zze()) {
                    zzgwVar.zza();
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                    iZzg4 = zzgwVar.zzg();
                    zzgwVar.zzg();
                }
                i27 = iZzc;
                i25 = iZzg4;
                f11 = f10;
                i26 = i24;
                i24 = iZzb;
            } else {
                i25 = iZzg4;
                f11 = 1.0f;
                i26 = -1;
                i27 = -1;
            }
            return new zzgo(iZzf4, iZzf5, iZzf6, iZzg5, iZzg10, i22, i23, f11, i14, iZzg2, zZze, zZze2, iZzg8, iZzg9, iZzg3, z10, i24, i26, i27, i25);
        }
        iZzg3 = zzgwVar.zzg() + 4;
        i20 = 244;
        z10 = false;
        int iZzg17 = zzgwVar.zzg();
        zzgwVar.zza();
        int iZzg18 = zzgwVar.zzg() + 1;
        int iZzg19 = zzgwVar.zzg() + 1;
        zZze2 = zzgwVar.zze();
        i21 = 2 - (zZze2 ? 1 : 0);
        if (!zZze2) {
            zzgwVar.zza();
        }
        zzgwVar.zza();
        i22 = iZzg18 * 16;
        i23 = iZzg19 * i21 * 16;
        if (zzgwVar.zze()) {
            int iZzg110 = zzgwVar.zzg();
            int iZzg111 = zzgwVar.zzg();
            int iZzg112 = zzgwVar.zzg();
            int iZzg113 = zzgwVar.zzg();
            if (iZzg == 0) {
                i29 = 1;
            } else {
                if (iZzg == 3) {
                    i29 = 1;
                } else {
                    i29 = 2;
                }
                if (iZzg == 1) {
                    i30 = 2;
                } else {
                    i30 = 1;
                }
                i21 *= i30;
            }
            i22 -= (iZzg110 + iZzg111) * i29;
            i23 -= (iZzg112 + iZzg113) * i21;
        }
        if (iZzf4 != 44) {
            if ((iZzf5 & 16) != 0) {
                iZzg4 = 0;
            } else {
                iZzg4 = i13;
            }
        } else if ((iZzf5 & 16) != 0) {
            iZzg4 = 0;
        } else {
            iZzg4 = i13;
        }
        f10 = 1.0f;
        i24 = -1;
        if (zzgwVar.zze()) {
            if (zzgwVar.zze()) {
                iZzf = zzgwVar.zzf(8);
                if (iZzf == 255) {
                    int i33 = i13;
                    iZzf2 = zzgwVar.zzf(i33);
                    iZzf3 = zzgwVar.zzf(i33);
                    if (iZzf2 != 0) {
                        f10 = iZzf2 / iZzf3;
                    }
                } else if (iZzf < 17) {
                    f10 = zzb[iZzf];
                } else {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzf).length() + 35);
                    sb3.append("Unexpected aspect_ratio_idc value: ");
                    sb3.append(iZzf);
                    zzeg.zzc("NalUnitUtil", sb3.toString());
                }
            }
            if (zzgwVar.zze()) {
                zzgwVar.zza();
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzb(3);
                if (true != zzgwVar.zze()) {
                    i28 = 2;
                } else {
                    i28 = 1;
                }
                if (zzgwVar.zze()) {
                    int iZzf9 = zzgwVar.zzf(8);
                    int iZzf10 = zzgwVar.zzf(8);
                    zzgwVar.zzb(8);
                    iZzb = zzi.zzb(iZzf9);
                    iZzc = zzi.zzc(iZzf10);
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
                i24 = i28;
            } else {
                iZzb = -1;
                iZzc = -1;
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzg();
                zzgwVar.zzg();
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzb(65);
            }
            zZze3 = zzgwVar.zze();
            if (zZze3) {
                zzp(zzgwVar);
            }
            zZze4 = zzgwVar.zze();
            if (zZze4) {
                zzp(zzgwVar);
            }
            if (zZze3) {
                zzgwVar.zza();
            } else {
                zzgwVar.zza();
            }
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                zzgwVar.zza();
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                iZzg4 = zzgwVar.zzg();
                zzgwVar.zzg();
            }
            i27 = iZzc;
            i25 = iZzg4;
            f11 = f10;
            i26 = i24;
            i24 = iZzb;
        } else {
            i25 = iZzg4;
            f11 = 1.0f;
            i26 = -1;
            i27 = -1;
        }
        return new zzgo(iZzf4, iZzf5, iZzf6, iZzg5, iZzg17, i22, i23, f11, i14, iZzg2, zZze, zZze2, iZzg8, iZzg9, iZzg3, z10, i24, i26, i27, i25);
    }

    /* JADX WARN: Code duplicated, block: B:458:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgm zzf(byte[] bArr, int i10, int i11) {
        int i12;
        zzgl zzglVar;
        boolean z10;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int iZzf4;
        int i13;
        int i14;
        int i15;
        boolean[][] zArr;
        int[] iArr;
        boolean[][] zArr2;
        int[] iArr2;
        int i16;
        int i17;
        boolean zZze;
        int i18;
        int i19;
        int i20;
        int iZzg;
        int i21;
        int i22;
        int i23;
        boolean z11;
        boolean z12;
        zzgw zzgwVar = new zzgw(bArr, i10, i11);
        zzgd zzgdVarZzl = zzl(zzgwVar);
        zzgwVar.zzb(4);
        boolean zZze2 = zzgwVar.zze();
        boolean zZze3 = zzgwVar.zze();
        int iZzf5 = zzgwVar.zzf(6);
        int i24 = iZzf5 + 1;
        int iZzf6 = zzgwVar.zzf(3);
        zzgwVar.zzb(17);
        zzge zzgeVarZzm = zzm(zzgwVar, true, iZzf6, null);
        for (int i25 = true != zzgwVar.zze() ? iZzf6 : 0; i25 <= iZzf6; i25++) {
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zzg();
        }
        int iZzf7 = zzgwVar.zzf(6);
        int iZzg2 = zzgwVar.zzg() + 1;
        int i26 = 6;
        zzgf zzgfVar = new zzgf(zzgwm.zzj(zzgeVarZzm), new int[1]);
        boolean z13 = i24 >= 2 && iZzg2 >= 2;
        boolean z14 = zZze2 && zZze3;
        int i27 = 1;
        int i28 = iZzf7 + 1;
        if (!z13 || !z14 || i28 < i24) {
            return new zzgm(zzgdVarZzl, null, zzgfVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iZzg2, i28);
        int[] iArr4 = new int[iZzg2];
        int[] iArr5 = new int[iZzg2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i29 = 1; i29 < iZzg2; i29++) {
            int i30 = 0;
            for (int i31 = 0; i31 <= iZzf7; i31++) {
                if (zzgwVar.zze()) {
                    iArr3[i29][i30] = i31;
                    iArr5[i29] = i31;
                    i30++;
                }
                iArr4[i29] = i30;
            }
        }
        if (zzgwVar.zze()) {
            zzgwVar.zzb(64);
            if (zzgwVar.zze()) {
                zzgwVar.zzg();
            }
            int iZzg3 = zzgwVar.zzg();
            int i32 = 0;
            while (i32 < iZzg3) {
                zzgwVar.zzg();
                if (i32 == 0 || zzgwVar.zze()) {
                    boolean zZze4 = zzgwVar.zze();
                    boolean zZze5 = zzgwVar.zze();
                    if (zZze4 || zZze5) {
                        zZze = zzgwVar.zze();
                        iZzg3 = iZzg3;
                        if (zZze) {
                            zzgwVar.zzb(19);
                        }
                        zzgwVar.zzb(8);
                        if (zZze) {
                            zzgwVar.zzb(4);
                        }
                        zzgwVar.zzb(15);
                        i19 = zZze4;
                        i18 = zZze5;
                    } else {
                        z12 = zZze4;
                        z11 = zZze5;
                    }
                    i20 = 0;
                    while (i20 <= iZzf6) {
                        if (!zzgwVar.zze() || zzgwVar.zze()) {
                            zzgwVar.zzg();
                        } else {
                            if (zzgwVar.zze()) {
                                iZzg = 0;
                            }
                            zzgd zzgdVar = zzgdVarZzl;
                            i21 = i19 + i18;
                            int[][] iArr6 = iArr3;
                            i22 = 0;
                            while (i22 < i21) {
                                int i33 = i21;
                                for (i23 = 0; i23 <= iZzg; i23++) {
                                    zzgwVar.zzg();
                                    zzgwVar.zzg();
                                    if (zZze) {
                                        zzgwVar.zzg();
                                        zzgwVar.zzg();
                                    }
                                    zzgwVar.zza();
                                }
                                i22++;
                                i21 = i33;
                            }
                            i20++;
                            zzgdVarZzl = zzgdVar;
                            iArr3 = iArr6;
                        }
                        iZzg = zzgwVar.zzg();
                        zzgd zzgdVar2 = zzgdVarZzl;
                        i21 = i19 + i18;
                        int[][] iArr7 = iArr3;
                        i22 = 0;
                        while (i22 < i21) {
                            int i34 = i21;
                            while (i23 <= iZzg) {
                                zzgwVar.zzg();
                                zzgwVar.zzg();
                                if (zZze) {
                                    zzgwVar.zzg();
                                    zzgwVar.zzg();
                                }
                                zzgwVar.zza();
                            }
                            i22++;
                            i21 = i34;
                        }
                        i20++;
                        zzgdVarZzl = zzgdVar2;
                        iArr3 = iArr7;
                    }
                    i32++;
                    iZzg3 = iZzg3;
                } else {
                    z12 = false;
                    z11 = false;
                }
                zZze = false;
                i19 = z12;
                i18 = z11;
                i20 = 0;
                while (i20 <= iZzf6) {
                    if (zzgwVar.zze()) {
                        zzgwVar.zzg();
                        iZzg = zzgwVar.zzg();
                    } else {
                        zzgwVar.zzg();
                        iZzg = zzgwVar.zzg();
                    }
                    zzgd zzgdVar3 = zzgdVarZzl;
                    i21 = i19 + i18;
                    int[][] iArr8 = iArr3;
                    i22 = 0;
                    while (i22 < i21) {
                        int i35 = i21;
                        while (i23 <= iZzg) {
                            zzgwVar.zzg();
                            zzgwVar.zzg();
                            if (zZze) {
                                zzgwVar.zzg();
                                zzgwVar.zzg();
                            }
                            zzgwVar.zza();
                        }
                        i22++;
                        i21 = i35;
                    }
                    i20++;
                    zzgdVarZzl = zzgdVar3;
                    iArr3 = iArr8;
                }
                i32++;
                iZzg3 = iZzg3;
            }
        }
        zzgd zzgdVar4 = zzgdVarZzl;
        int[][] iArr9 = iArr3;
        if (!zzgwVar.zze()) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        zzgwVar.zzc();
        zzge zzgeVarZzm2 = zzm(zzgwVar, false, iZzf6, zzgeVarZzm);
        boolean zZze6 = zzgwVar.zze();
        boolean[] zArr3 = new boolean[16];
        int i36 = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            boolean zZze7 = zzgwVar.zze();
            zArr3[i37] = zZze7;
            if (zZze7) {
                i36++;
            }
        }
        if (i36 == 0 || !zArr3[1]) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        int i38 = i36 + 1;
        int[] iArr10 = new int[i36];
        for (int i39 = 0; i39 < i36 - (zZze6 ? 1 : 0); i39++) {
            iArr10[i39] = zzgwVar.zzf(3);
        }
        int[] iArr11 = new int[i38];
        if (zZze6) {
            for (int i40 = 1; i40 < i36; i40++) {
                for (int i41 = 0; i41 < i40; i41++) {
                    iArr11[i40] = iArr11[i40] + iArr10[i41] + 1;
                }
            }
            iArr11[i36] = 6;
        }
        int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) cls, i24, i36);
        int[] iArr13 = new int[i24];
        iArr13[0] = 0;
        boolean zZze8 = zzgwVar.zze();
        int i42 = 1;
        while (i42 < i24) {
            if (zZze8) {
                iArr13[i42] = zzgwVar.zzf(i26);
            } else {
                iArr13[i42] = i42;
            }
            if (zZze6) {
                i17 = i42;
                int i43 = 0;
                while (i43 < i36) {
                    int i44 = i43 + 1;
                    iArr12[i17][i43] = (iArr13[i17] & ((1 << iArr11[i44]) - 1)) >> iArr11[i43];
                    i43 = i44;
                }
            } else {
                int i45 = 0;
                while (i45 < i36) {
                    iArr12[i42][i45] = zzgwVar.zzf(iArr10[i45] + 1);
                    i45++;
                    i42 = i42;
                }
                i17 = i42;
            }
            i42 = i17 + 1;
            i26 = 6;
        }
        int[] iArr14 = new int[i28];
        int i46 = 1;
        int i47 = 0;
        while (i47 < i24) {
            iArr14[iArr13[i47]] = -1;
            int[] iArr15 = iArr14;
            int i48 = 0;
            int i49 = 0;
            while (i48 < 16) {
                if (zArr3[i48]) {
                    i16 = i27;
                    if (i48 == i16) {
                        iArr15[iArr13[i47]] = iArr12[i47][i49];
                        i48 = i16;
                    }
                    i49++;
                } else {
                    i16 = i27;
                }
                i48 += i16;
                i27 = i16;
            }
            if (i47 > 0) {
                int i50 = 0;
                while (true) {
                    if (i50 >= i47) {
                        i46++;
                        break;
                    }
                    if (iArr15[iArr13[i47]] == iArr15[iArr13[i50]]) {
                        break;
                    }
                    i50++;
                }
            }
            i47++;
            iArr14 = iArr15;
            i27 = 1;
        }
        int[] iArr16 = iArr14;
        int iZzf8 = zzgwVar.zzf(4);
        if (i46 < 2 || iZzf8 == 0) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        int[] iArr17 = new int[i46];
        for (int i51 = 0; i51 < i46; i51++) {
            iArr17[i51] = zzgwVar.zzf(iZzf8);
        }
        int[] iArr18 = new int[i28];
        for (int i52 = 0; i52 < i24; i52++) {
            iArr18[Math.min(iArr13[i52], iZzf7)] = i52;
        }
        zzgwj zzgwjVar = new zzgwj();
        int i53 = 0;
        while (i53 <= iZzf7) {
            int[] iArr19 = iArr17;
            int i54 = i46;
            int iMin = Math.min(iArr16[i53], i54 - 1);
            int[] iArr20 = iArr18;
            zzgwjVar.zzf(new zzgc(iArr20[i53], iMin >= 0 ? iArr19[iMin] : -1));
            i53++;
            i46 = i54;
            iArr17 = iArr19;
            iArr18 = iArr20;
        }
        zzgwm zzgwmVarZzi = zzgwjVar.zzi();
        if (((zzgc) zzgwmVarZzi.get(0)).zzb == -1) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        int i55 = 1;
        while (true) {
            zzgd zzgdVar5 = zzgdVar4;
            if (i55 > iZzf7) {
                zzgdVar4 = zzgdVar5;
                i12 = -1;
                i55 = -1;
                break;
            }
            zzgdVar4 = zzgdVar5;
            i12 = -1;
            if (((zzgc) zzgwmVarZzi.get(i55)).zzb != -1) {
                break;
            }
            i55++;
        }
        if (i55 == i12) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i24, i24);
        int i56 = 1;
        while (i56 < i24) {
            boolean[][] zArr6 = zArr5;
            for (int i57 = 0; i57 < i56; i57++) {
                boolean[] zArr7 = zArr4[i56];
                boolean[] zArr8 = zArr6[i56];
                boolean zZze9 = zzgwVar.zze();
                zArr8[i57] = zZze9;
                zArr7[i57] = zZze9;
            }
            i56++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i58 = 1; i58 < i24; i58++) {
            int i59 = 0;
            while (i59 < iZzf5) {
                int i60 = i59;
                for (int i61 = 0; i61 < i58; i61++) {
                    boolean[] zArr10 = zArr9[i58];
                    if (zArr10[i61] && zArr9[i61][i60]) {
                        zArr10[i60] = true;
                        break;
                    }
                }
                i59 = i60 + 1;
            }
        }
        int[] iArr21 = new int[i28];
        int i62 = 0;
        while (i62 < i24) {
            int[] iArr22 = iArr21;
            int i63 = 0;
            for (int i64 = 0; i64 < i62; i64++) {
                i63 += zArr4[i62][i64] ? 1 : 0;
            }
            iArr22[iArr13[i62]] = i63;
            i62++;
            iArr21 = iArr22;
        }
        int[] iArr23 = iArr21;
        int i65 = 0;
        for (int i66 = 0; i66 < i24; i66++) {
            if (iArr23[iArr13[i66]] == 0) {
                i65++;
            }
        }
        if (i65 > 1) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        int[] iArr24 = new int[i24];
        int[] iArr25 = new int[iZzg2];
        if (zzgwVar.zze()) {
            int i67 = 0;
            while (i67 < i24) {
                int i68 = i67;
                iArr24[i68] = zzgwVar.zzf(3);
                i67 = i68 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i24, iZzf6);
        }
        int i69 = 0;
        while (i69 < iZzg2) {
            int[] iArr26 = iArr24;
            int i70 = i69;
            int[] iArr27 = iArr13;
            int iMax = 0;
            for (int i71 = 0; i71 < iArr4[i70]; i71++) {
                iMax = Math.max(iMax, iArr26[((zzgc) zzgwmVarZzi.get(iArr9[i70][i71])).zza]);
            }
            iArr25[i70] = iMax + 1;
            i69 = i70 + 1;
            iArr24 = iArr26;
            iArr13 = iArr27;
        }
        int[] iArr28 = iArr13;
        if (zzgwVar.zze()) {
            int i72 = 0;
            while (i72 < iZzf5) {
                int i73 = i72 + 1;
                int i74 = i73;
                while (i74 < i24) {
                    if (zArr4[i74][i72]) {
                        zzgwVar.zzb(3);
                    }
                    i74++;
                    i72 = i72;
                }
                i72 = i73;
            }
        }
        zzgwVar.zza();
        int iZzg4 = zzgwVar.zzg() + 1;
        zzgwj zzgwjVar2 = new zzgwj();
        zzgwjVar2.zzf(zzgeVarZzm);
        if (iZzg4 > 1) {
            zzgwjVar2.zzf(zzgeVarZzm2);
            for (int i75 = 2; i75 < iZzg4; i75++) {
                zzgeVarZzm2 = zzm(zzgwVar, zzgwVar.zze(), iZzf6, zzgeVarZzm2);
                zzgwjVar2.zzf(zzgeVarZzm2);
            }
        }
        zzgwm zzgwmVarZzi2 = zzgwjVar2.zzi();
        int iZzg5 = zzgwVar.zzg() + iZzg2;
        if (iZzg5 > iZzg2) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        int iZzf9 = zzgwVar.zzf(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iZzg5, i28);
        int[] iArr29 = new int[iZzg5];
        int i76 = 0;
        int[] iArr30 = new int[iZzg5];
        int i77 = 0;
        while (i77 < iZzg2) {
            iArr29[i77] = i76;
            int i78 = i77;
            int i79 = iArr5[i78];
            iArr30[i78] = i79;
            if (iZzf9 == 0) {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                Arrays.fill(zArr11[i78], i76, iArr4[i78], true);
                iArr2[i78] = iArr4[i78];
            } else {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                if (iZzf9 == 1) {
                    for (int i80 = 0; i80 < iArr4[i78]; i80++) {
                        zArr2[i78][i80] = iArr9[i78][i80] == i79;
                    }
                    iArr2[i78] = 1;
                } else {
                    i76 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i77 = i78 + 1;
                iArr5 = iArr;
                zArr11 = zArr2;
                iArr29 = iArr2;
            }
            i76 = 0;
            i77 = i78 + 1;
            iArr5 = iArr;
            zArr11 = zArr2;
            iArr29 = iArr2;
        }
        boolean[][] zArr12 = zArr11;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i28];
        int i81 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i28;
        iArr33[i76] = iZzg5;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i82 = 1;
        int i83 = 0;
        while (i82 < iZzg5) {
            if (iZzf9 == i81) {
                for (int i84 = 0; i84 < iArr4[i82]; i84++) {
                    zArr12[i82][i84] = zzgwVar.zze();
                    int i85 = iArr31[i82];
                    boolean z15 = zArr12[i82][i84];
                    iArr31[i82] = i85 + (z15 ? 1 : 0);
                    if (z15) {
                        iArr30[i82] = iArr9[i82][i84];
                    }
                }
            }
            if (i83 == 0) {
                i13 = 0;
                if (iArr9[i82][0] == 0 && zArr12[i82][0]) {
                    i83 = 0;
                    for (int i86 = 1; i86 < iArr4[i82]; i86++) {
                        if (iArr9[i82][i86] == i55 && zArr12[i82][i55]) {
                            i83 = i82;
                        }
                    }
                } else {
                    i83 = 0;
                }
            } else {
                i13 = 0;
            }
            int i87 = i13;
            while (i87 < iArr4[i82]) {
                if (iZzg4 > 1) {
                    zArr13[i82][i87] = zArr12[i82][i87];
                    zArr = zArr4;
                    i14 = iZzg4;
                    int iZzc = zzgzw.zzc(iZzg4, RoundingMode.CEILING);
                    if (zArr13[i82][i87]) {
                        i15 = iZzf9;
                        break;
                    }
                    int i88 = ((zzgc) zzgwmVarZzi.get(iArr9[i82][i87])).zza;
                    int i89 = i13;
                    while (true) {
                        if (i89 >= i87) {
                            i15 = iZzf9;
                            break;
                        }
                        i15 = iZzf9;
                        if (zArr9[i88][((zzgc) zzgwmVarZzi.get(iArr9[i82][i89])).zza]) {
                            zArr13[i82][i87] = true;
                            break;
                        }
                        i89++;
                        iZzf9 = i15;
                    }
                    if (zArr13[i82][i87]) {
                        if (i83 <= 0 || i82 != i83) {
                            zzgwVar.zzb(iZzc);
                        } else {
                            iArr32[i87] = zzgwVar.zzf(iZzc);
                        }
                    }
                } else {
                    i14 = iZzg4;
                    i15 = iZzf9;
                    zArr = zArr4;
                }
                i87++;
                zArr4 = zArr;
                iZzg4 = i14;
                iZzf9 = i15;
            }
            int i90 = iZzg4;
            int i91 = iZzf9;
            boolean[][] zArr14 = zArr4;
            if (iArr31[i82] == 1 && iArr23[iArr30[i82]] > 0) {
                zzgwVar.zza();
            }
            i82++;
            zArr4 = zArr14;
            iZzg4 = i90;
            iZzf9 = i91;
            i81 = 2;
        }
        boolean[][] zArr15 = zArr4;
        if (i83 == 0) {
            return new zzgm(zzgdVar4, null, zzgfVar, null, null);
        }
        zzgd zzgdVar6 = zzgdVar4;
        int iZzg6 = zzgwVar.zzg();
        int i92 = iZzg6 + 1;
        zzgwj zzgwjVarZzv = zzgwm.zzv(i92);
        int[] iArr34 = new int[i24];
        int i93 = 0;
        while (i93 < i92) {
            int iZzf10 = zzgwVar.zzf(16);
            zzgwm zzgwmVar = zzgwmVarZzi;
            int iZzf11 = zzgwVar.zzf(16);
            if (zzgwVar.zze()) {
                iZzf2 = zzgwVar.zzf(2);
                if (iZzf2 == 3) {
                    zzgwVar.zza();
                }
                iZzf3 = zzgwVar.zzf(4);
                iZzf4 = zzgwVar.zzf(4);
            } else {
                iZzf2 = 0;
                iZzf3 = 0;
                iZzf4 = 0;
            }
            if (zzgwVar.zze()) {
                int iZzg7 = zzgwVar.zzg();
                int iZzg8 = zzgwVar.zzg();
                int iZzg9 = zzgwVar.zzg();
                int iZzg10 = zzgwVar.zzg();
                iZzf10 = zzn(iZzf10, iZzf2, iZzg7, iZzg8);
                iZzf11 = zzo(iZzf11, iZzf2, iZzg9, iZzg10);
            }
            zzgwjVarZzv.zzf(new zzgg(iZzf2, iZzf3, iZzf4, iZzf10, iZzf11));
            i93++;
            zzgwmVarZzi = zzgwmVar;
            zArr13 = zArr13;
            zzgdVar6 = zzgdVar6;
            zzgwmVarZzi2 = zzgwmVarZzi2;
        }
        zzgwm zzgwmVar2 = zzgwmVarZzi;
        zzgd zzgdVar7 = zzgdVar6;
        zzgwm zzgwmVar3 = zzgwmVarZzi2;
        boolean[][] zArr16 = zArr13;
        if (i92 <= 1 || !zzgwVar.zze()) {
            for (int i94 = 1; i94 < i24; i94++) {
                iArr34[i94] = Math.min(i94, iZzg6);
            }
        } else {
            int iZzc2 = zzgzw.zzc(i92, RoundingMode.CEILING);
            for (int i95 = 1; i95 < i24; i95++) {
                iArr34[i95] = zzgwVar.zzf(iZzc2);
            }
        }
        zzgh zzghVar = new zzgh(zzgwjVarZzv.zzi(), iArr34);
        zzgwVar.zzb(2);
        for (int i96 = 1; i96 < i24; i96++) {
            if (iArr23[iArr28[i96]] == 0) {
                zzgwVar.zza();
            }
        }
        for (int i97 = 1; i97 < iZzg5; i97++) {
            boolean zZze10 = zzgwVar.zze();
            int i98 = 0;
            while (i98 < iArr25[i97]) {
                if ((i98 <= 0 || !zZze10) ? i98 == 0 : zzgwVar.zze()) {
                    for (int i99 = 0; i99 < iArr4[i97]; i99++) {
                        if (zArr16[i97][i99]) {
                            zzgwVar.zzg();
                        }
                    }
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                }
                i98++;
            }
        }
        int iZzg11 = zzgwVar.zzg() + 2;
        if (zzgwVar.zze()) {
            zzgwVar.zzb(iZzg11);
        } else {
            for (int i100 = 1; i100 < i24; i100++) {
                for (int i101 = 0; i101 < i100; i101++) {
                    if (zArr15[i100][i101]) {
                        zzgwVar.zzb(iZzg11);
                    }
                }
            }
        }
        int iZzg12 = zzgwVar.zzg();
        for (int i102 = 1; i102 <= iZzg12; i102++) {
            zzgwVar.zzb(8);
        }
        if (zzgwVar.zze()) {
            zzgwVar.zzc();
            if (zzgwVar.zze() || zzgwVar.zze()) {
                zzgwVar.zza();
            }
            boolean zZze11 = zzgwVar.zze();
            boolean zZze12 = zzgwVar.zze();
            if (zZze11 || zZze12) {
                for (int i103 = 0; i103 < iZzg2; i103++) {
                    for (int i104 = 0; i104 < iArr25[i103]; i104++) {
                        boolean zZze13 = zZze11 ? zzgwVar.zze() : false;
                        boolean zZze14 = zZze12 ? zzgwVar.zze() : false;
                        if (zZze13) {
                            zzgwVar.zzb(32);
                        }
                        if (zZze14) {
                            zzgwVar.zzb(18);
                        }
                    }
                }
            }
            boolean zZze15 = zzgwVar.zze();
            if (zZze15) {
                z10 = true;
                iZzf = zzgwVar.zzf(4) + 1;
            } else {
                z10 = true;
                iZzf = i24;
            }
            zzgwj zzgwjVarZzv2 = zzgwm.zzv(iZzf);
            int[] iArr35 = new int[i24];
            int i105 = 0;
            while (i105 < iZzf) {
                zzgwVar.zzb(3);
                int i106 = z10 != zzgwVar.zze() ? 2 : 1;
                int iZzb = zzi.zzb(zzgwVar.zzf(8));
                int iZzc3 = zzi.zzc(zzgwVar.zzf(8));
                zzgwVar.zzb(8);
                zzgwjVarZzv2.zzf(new zzgk(iZzb, i106, iZzc3));
                i105++;
                z10 = true;
            }
            if (zZze15 && iZzf > 1) {
                for (int i107 = 0; i107 < i24; i107++) {
                    iArr35[i107] = zzgwVar.zzf(4);
                }
            }
            zzglVar = new zzgl(zzgwjVarZzv2.zzi(), iArr35);
        } else {
            zzglVar = null;
        }
        return new zzgm(zzgdVar7, zzgwmVar2, new zzgf(zzgwmVar3, iArr32), zzghVar, zzglVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:195:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    public static zzgj zzg(byte[] bArr, int i10, int i11, zzgm zzgmVar) {
        boolean z10;
        int i12;
        int i13;
        int iZzo;
        int iZzn;
        int iZzg;
        int i14;
        int i15;
        int i16;
        int i17;
        int iZzg2;
        int i18;
        int iMax;
        float f10;
        int i19;
        int i20;
        int i21;
        int iZzb;
        int iZzc;
        int i22;
        zzgl zzglVar;
        int i23;
        zzgh zzghVar;
        zzgd zzgdVarZzl = zzl(new zzgw(bArr, i10, i11));
        zzgw zzgwVar = new zzgw(bArr, i10 + 2, i11);
        zzgwVar.zzb(4);
        int iZzf = zzgwVar.zzf(3);
        int i24 = zzgdVarZzl.zzb;
        if (i24 == 0 || iZzf != 7) {
            z10 = false;
        } else {
            iZzf = 7;
            z10 = true;
        }
        if (zzgmVar != null) {
            zzgwm zzgwmVar = zzgmVar.zza;
            if (zzgwmVar.isEmpty()) {
                i12 = 0;
            } else {
                i12 = ((zzgc) zzgwmVar.get(Math.min(i24, zzgwmVar.size() - 1))).zza;
            }
        } else {
            i12 = 0;
        }
        zzge zzgeVarZzm = null;
        if (!z10) {
            zzgwVar.zza();
            zzgeVarZzm = zzm(zzgwVar, true, iZzf, null);
        } else if (zzgmVar != null) {
            zzgf zzgfVar = zzgmVar.zzb;
            int i25 = zzgfVar.zzb[i12];
            zzgwm zzgwmVar2 = zzgfVar.zza;
            if (zzgwmVar2.size() > i25) {
                zzgeVarZzm = (zzge) zzgwmVar2.get(i25);
            }
        }
        int iZzg3 = zzgwVar.zzg();
        if (z10) {
            int iZzf2 = zzgwVar.zze() ? zzgwVar.zzf(8) : -1;
            if (zzgmVar == null || (zzghVar = zzgmVar.zzc) == null) {
                i15 = 0;
                i17 = 0;
                iZzg = 0;
                i18 = 0;
                iZzg2 = 0;
                i14 = 0;
                i16 = 0;
            } else {
                if (iZzf2 == -1) {
                    iZzf2 = zzghVar.zzb[i12];
                }
                if (iZzf2 != -1) {
                    zzgwm zzgwmVar3 = zzghVar.zza;
                    if (zzgwmVar3.size() > iZzf2) {
                        zzgg zzggVar = (zzgg) zzgwmVar3.get(iZzf2);
                        int i26 = zzggVar.zza;
                        i16 = zzggVar.zzd;
                        i14 = zzggVar.zze;
                        iZzg = zzggVar.zzb;
                        iZzg2 = zzggVar.zzc;
                        i18 = i26;
                        i15 = i14;
                        i17 = i16;
                    } else {
                        i15 = 0;
                        i17 = 0;
                        iZzg = 0;
                        i18 = 0;
                        iZzg2 = 0;
                        i14 = 0;
                        i16 = 0;
                    }
                } else {
                    i15 = 0;
                    i17 = 0;
                    iZzg = 0;
                    i18 = 0;
                    iZzg2 = 0;
                    i14 = 0;
                    i16 = 0;
                }
            }
        } else {
            int iZzg4 = zzgwVar.zzg();
            if (iZzg4 == 3) {
                zzgwVar.zza();
                i13 = 3;
            } else {
                i13 = iZzg4;
            }
            int iZzg5 = zzgwVar.zzg();
            int iZzg6 = zzgwVar.zzg();
            if (zzgwVar.zze()) {
                int iZzg7 = zzgwVar.zzg();
                int iZzg8 = zzgwVar.zzg();
                int iZzg9 = zzgwVar.zzg();
                int iZzg10 = zzgwVar.zzg();
                iZzn = zzn(iZzg5, i13, iZzg7, iZzg8);
                iZzo = zzo(iZzg6, i13, iZzg9, iZzg10);
            } else {
                iZzo = iZzg6;
                iZzn = iZzg5;
            }
            iZzg = zzgwVar.zzg();
            i14 = iZzo;
            i15 = iZzg6;
            i16 = iZzn;
            i17 = iZzg5;
            iZzg2 = zzgwVar.zzg();
            i18 = iZzg4;
        }
        int iZzg11 = zzgwVar.zzg();
        if (z10) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i27 = true != zzgwVar.zze() ? iZzf : 0; i27 <= iZzf; i27++) {
                zzgwVar.zzg();
                iMax = Math.max(zzgwVar.zzg(), iMax);
                zzgwVar.zzg();
            }
        }
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        if (zzgwVar.zze()) {
            if (z10 && zzgwVar.zze()) {
                zzgwVar.zzb(6);
            } else if (zzgwVar.zze()) {
                int i28 = 4;
                int i29 = 0;
                while (i29 < i28) {
                    int i30 = i28;
                    int i31 = iMax;
                    for (int i32 = 0; i32 < 6; i32 += i29 == 3 ? 3 : 1) {
                        if (zzgwVar.zze()) {
                            int iMin = Math.min(64, 1 << ((i29 + i29) + 4));
                            if (i29 > 1) {
                                zzgwVar.zzh();
                            }
                            for (int i33 = 0; i33 < iMin; i33++) {
                                zzgwVar.zzh();
                            }
                        } else {
                            zzgwVar.zzg();
                        }
                    }
                    i29++;
                    iMax = i31;
                    i28 = i30;
                }
            }
        }
        int i34 = iMax;
        zzgwVar.zzb(2);
        if (zzgwVar.zze()) {
            zzgwVar.zzb(8);
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zza();
        }
        int iZzg12 = zzgwVar.zzg();
        int i35 = 0;
        int[] iArr = new int[0];
        int i36 = iZzf;
        int[] iArrCopyOf = new int[0];
        int i37 = iZzg;
        int i38 = -1;
        int i39 = -1;
        while (i35 < iZzg12) {
            if (i35 == 0 || !zzgwVar.zze()) {
                int iZzg13 = zzgwVar.zzg();
                int iZzg14 = zzgwVar.zzg();
                int[] iArr2 = new int[iZzg13];
                int i40 = 0;
                while (i40 < iZzg13) {
                    iArr2[i40] = (i40 > 0 ? iArr2[i40 - 1] : 0) - (zzgwVar.zzg() + 1);
                    zzgwVar.zza();
                    i40++;
                }
                int[] iArr3 = new int[iZzg14];
                int i41 = 0;
                while (i41 < iZzg14) {
                    iArr3[i41] = (i41 > 0 ? iArr3[i41 - 1] : 0) + zzgwVar.zzg() + 1;
                    zzgwVar.zza();
                    i41++;
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i38 = iZzg13;
                i39 = iZzg14;
            } else {
                int i42 = i38 + i39;
                boolean zZze = zzgwVar.zze();
                boolean z11 = true;
                int iZzg15 = zzgwVar.zzg() + 1;
                int i43 = 1 - ((zZze ? 1 : 0) + (zZze ? 1 : 0));
                int i44 = i42 + 1;
                boolean[] zArr = new boolean[i44];
                int i45 = 0;
                while (i45 <= i42) {
                    if (zzgwVar.zze()) {
                        zArr[i45] = z11;
                    } else {
                        zArr[i45] = zzgwVar.zze();
                    }
                    i45++;
                    z11 = true;
                }
                int i46 = i39 - 1;
                int[] iArr4 = new int[i44];
                int[] iArr5 = new int[i44];
                int i47 = 0;
                while (true) {
                    i23 = i43 * iZzg15;
                    if (i46 < 0) {
                        break;
                    }
                    int i48 = iArrCopyOf[i46] + i23;
                    if (i48 < 0 && zArr[i38 + i46]) {
                        iArr4[i47] = i48;
                        i47++;
                    }
                    i46--;
                }
                if (i23 < 0 && zArr[i42]) {
                    iArr4[i47] = i23;
                    i47++;
                }
                int i49 = i47;
                for (int i50 = 0; i50 < i38; i50++) {
                    int i51 = iArr[i50] + i23;
                    if (i51 < 0 && zArr[i50]) {
                        iArr4[i49] = i51;
                        i49++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i49);
                int i52 = 0;
                for (int i53 = i38 - 1; i53 >= 0; i53--) {
                    int i54 = iArr[i53] + i23;
                    if (i54 > 0 && zArr[i53]) {
                        iArr5[i52] = i54;
                        i52++;
                    }
                }
                if (i23 > 0 && zArr[i42]) {
                    iArr5[i52] = i23;
                    i52++;
                }
                int i55 = i52;
                for (int i56 = 0; i56 < i39; i56++) {
                    int i57 = iArrCopyOf[i56] + i23;
                    if (i57 > 0 && zArr[i38 + i56]) {
                        iArr5[i55] = i57;
                        i55++;
                    }
                }
                iArr = iArrCopyOf2;
                iArrCopyOf = Arrays.copyOf(iArr5, i55);
                i38 = i49;
                i39 = i55;
            }
            i35++;
            iZzg12 = iZzg12;
            i12 = i12;
            zzgdVarZzl = zzgdVarZzl;
        }
        zzgd zzgdVar = zzgdVarZzl;
        int i58 = i12;
        if (zzgwVar.zze()) {
            int iZzg16 = zzgwVar.zzg();
            for (int i59 = 0; i59 < iZzg16; i59++) {
                zzgwVar.zzb(iZzg11 + 5);
            }
        }
        zzgwVar.zzb(2);
        float f11 = 1.0f;
        if (zzgwVar.zze()) {
            if (zzgwVar.zze()) {
                int iZzf3 = zzgwVar.zzf(8);
                if (iZzf3 == 255) {
                    int iZzf4 = zzgwVar.zzf(16);
                    int iZzf5 = zzgwVar.zzf(16);
                    if (iZzf4 != 0 && iZzf5 != 0) {
                        f11 = iZzf4 / iZzf5;
                    }
                } else if (iZzf3 < 17) {
                    f11 = zzb[iZzf3];
                } else {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzf3).length() + 35);
                    sb2.append("Unexpected aspect_ratio_idc value: ");
                    sb2.append(iZzf3);
                    zzeg.zzc("NalUnitUtil", sb2.toString());
                }
            }
            if (zzgwVar.zze()) {
                zzgwVar.zza();
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzb(3);
                i22 = true != zzgwVar.zze() ? 2 : 1;
                if (zzgwVar.zze()) {
                    int iZzf6 = zzgwVar.zzf(8);
                    int iZzf7 = zzgwVar.zzf(8);
                    zzgwVar.zzb(8);
                    iZzb = zzi.zzb(iZzf6);
                    iZzc = zzi.zzc(iZzf7);
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
            } else if (zzgmVar == null || (zzglVar = zzgmVar.zzd) == null) {
                iZzb = -1;
                iZzc = -1;
                i22 = -1;
            } else {
                int i60 = zzglVar.zzb[i58];
                zzgwm zzgwmVar4 = zzglVar.zza;
                if (zzgwmVar4.size() > i60) {
                    zzgk zzgkVar = (zzgk) zzgwmVar4.get(i60);
                    int i61 = zzgkVar.zza;
                    int i62 = zzgkVar.zzb;
                    iZzc = zzgkVar.zzc;
                    iZzb = i61;
                    i22 = i62;
                } else {
                    iZzb = -1;
                    iZzc = -1;
                    i22 = -1;
                }
            }
            if (zzgwVar.zze()) {
                zzgwVar.zzg();
                zzgwVar.zzg();
            }
            zzgwVar.zza();
            if (zzgwVar.zze()) {
                i14 += i14;
            }
            i19 = iZzb;
            f10 = f11;
            i21 = iZzc;
            i20 = i22;
        } else {
            f10 = 1.0f;
            i19 = -1;
            i20 = -1;
            i21 = -1;
        }
        return new zzgj(zzgdVar, i36, zzgeVarZzm, i18, i37, iZzg2, iZzg3, i16, i14, i17, i15, f10, i34, i19, i20, i21);
    }

    public static zzgn zzh(byte[] bArr, int i10, int i11) {
        zzgw zzgwVar = new zzgw(bArr, 4, i11);
        int iZzg = zzgwVar.zzg();
        int iZzg2 = zzgwVar.zzg();
        zzgwVar.zza();
        return new zzgn(iZzg, iZzg2, zzgwVar.zze());
    }

    public static int zzi(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        zzgtj.zzi(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            zzj(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            zzj(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    zzj(zArr);
                    return i15;
                }
                i14 = i15;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzk(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            byte[] bArr = (byte[]) list.get(i10);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i11 = zzgwm.zzd;
                zzgwj zzgwjVar = new zzgwj();
                int i12 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i12 >= length2) {
                        break;
                    }
                    int iZzi = zzi(bArr, i12, length2, zArr);
                    if (iZzi != length2) {
                        zzgwjVar.zzf(Integer.valueOf(iZzi));
                    }
                    i12 = iZzi + 3;
                }
                zzgwm zzgwmVarZzi = zzgwjVar.zzi();
                for (int i13 = 0; i13 < zzgwmVarZzi.size(); i13++) {
                    if (((Integer) zzgwmVarZzi.get(i13)).intValue() + 3 < length) {
                        zzgw zzgwVar = new zzgw(bArr, ((Integer) zzgwmVarZzi.get(i13)).intValue() + 3, length);
                        zzgd zzgdVarZzl = zzl(zzgwVar);
                        if (zzgdVarZzl.zza == 33 && zzgdVarZzl.zzb == 0) {
                            zzgwVar.zzb(4);
                            int iZzf = zzgwVar.zzf(3);
                            zzgwVar.zza();
                            zzge zzgeVarZzm = zzm(zzgwVar, true, iZzf, null);
                            return zzdq.zzc(zzgeVarZzm.zza, zzgeVarZzm.zzb, zzgeVarZzm.zzc, zzgeVarZzm.zzd, zzgeVarZzm.zze, zzgeVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzgd zzl(zzgw zzgwVar) {
        zzgwVar.zza();
        return new zzgd(zzgwVar.zzf(6), zzgwVar.zzf(6), zzgwVar.zzf(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzge zzm(zzgw zzgwVar, boolean z10, int i10, zzge zzgeVar) {
        int[] iArr;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean zZze;
        int iZzf;
        int i14;
        int i15;
        int[] iArr2 = new int[6];
        if (!z10) {
            if (zzgeVar != null) {
                int i16 = zzgeVar.zza;
                zZze = zzgeVar.zzb;
                iZzf = zzgeVar.zzc;
                i14 = zzgeVar.zzd;
                iArr2 = zzgeVar.zze;
                i11 = i16;
            } else {
                iArr = iArr2;
                i11 = 0;
                z11 = false;
                i12 = 0;
                i13 = 0;
            }
            int iZzf2 = zzgwVar.zzf(8);
            i15 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                if (zzgwVar.zze()) {
                    i15 += 88;
                }
                if (zzgwVar.zze()) {
                    i15 += 8;
                }
            }
            zzgwVar.zzb(i15);
            if (i10 > 0) {
                int i18 = 8 - i10;
                zzgwVar.zzb(i18 + i18);
            }
            return new zzge(i11, z11, i12, i13, iArr, iZzf2);
        }
        int iZzf3 = zzgwVar.zzf(2);
        zZze = zzgwVar.zze();
        iZzf = zzgwVar.zzf(5);
        i14 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (zzgwVar.zze()) {
                i14 |= 1 << i19;
            }
        }
        for (int i20 = 0; i20 < 6; i20++) {
            iArr2[i20] = zzgwVar.zzf(8);
        }
        i11 = iZzf3;
        iArr = iArr2;
        z11 = zZze;
        i12 = iZzf;
        i13 = i14;
        int iZzf4 = zzgwVar.zzf(8);
        i15 = 0;
        while (i17 < i10) {
            if (zzgwVar.zze()) {
                i15 += 88;
            }
            if (zzgwVar.zze()) {
                i15 += 8;
            }
        }
        zzgwVar.zzb(i15);
        if (i10 > 0) {
            int i110 = 8 - i10;
            zzgwVar.zzb(i110 + i110);
        }
        return new zzge(i11, z11, i12, i13, iArr, iZzf4);
    }

    private static int zzn(int i10, int i11, int i12, int i13) {
        int i14 = 2;
        if (i11 != 1 && i11 != 2) {
            i14 = 1;
        }
        return i10 - (i14 * (i12 + i13));
    }

    private static int zzo(int i10, int i11, int i12, int i13) {
        return i10 - ((i11 == 1 ? 2 : 1) * (i12 + i13));
    }

    private static void zzp(zzgw zzgwVar) {
        int iZzg = zzgwVar.zzg() + 1;
        zzgwVar.zzb(8);
        for (int i10 = 0; i10 < iZzg; i10++) {
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zza();
        }
        zzgwVar.zzb(20);
    }

    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzp;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return MimeTypes.VIDEO_H264;
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return MimeTypes.VIDEO_H265;
            }
        }
        return str2;
    }
}
