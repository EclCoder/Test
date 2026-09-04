package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzifs<T> implements zzigh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zziha.zzr();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzifp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzigt zzm;
    private final zzidp zzn;

    private zzifs(int[] iArr, Object[] objArr, int i10, int i11, zzifp zzifpVar, boolean z10, int[] iArr2, int i12, int i13, zzifv zzifvVar, zzifb zzifbVar, zzigt zzigtVar, zzidp zzidpVar, zzifk zzifkVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzifpVar instanceof zziee;
        boolean z11 = false;
        if (zzidpVar != null && (zzifpVar instanceof zziea)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzigtVar;
        this.zzn = zzidpVar;
        this.zzg = zzifpVar;
    }

    private final int zzA(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzC(int i10) {
        return (i10 >>> 20) & 255;
    }

    private static boolean zzD(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zziee) {
            return ((zziee) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int zzG(Object obj, long j10) {
        return ((Integer) zziha.zzm(obj, j10)).intValue();
    }

    private static long zzH(Object obj, long j10) {
        return ((Long) zziha.zzm(obj, j10)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i10) {
        return zzK(obj, i10) == zzK(obj2, i10);
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzK(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private final boolean zzK(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = iZzB & 1048575;
        if (j10 != 1048575) {
            return (zziha.zzc(obj, j10) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i10);
        long j11 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zziha.zzk(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zziha.zzi(obj, j11)) != 0;
            case 2:
                return zziha.zze(obj, j11) != 0;
            case 3:
                return zziha.zze(obj, j11) != 0;
            case 4:
                return zziha.zzc(obj, j11) != 0;
            case 5:
                return zziha.zze(obj, j11) != 0;
            case 6:
                return zziha.zzc(obj, j11) != 0;
            case 7:
                return zziha.zzg(obj, j11);
            case 8:
                Object objZzm = zziha.zzm(obj, j11);
                if (objZzm instanceof String) {
                    return !((String) objZzm).isEmpty();
                }
                if (objZzm instanceof zzida) {
                    return !zzida.zza.equals(objZzm);
                }
                throw new IllegalArgumentException();
            case 9:
                return zziha.zzm(obj, j11) != null;
            case 10:
                return !zzida.zza.equals(zziha.zzm(obj, j11));
            case 11:
                return zziha.zzc(obj, j11) != 0;
            case 12:
                return zziha.zzc(obj, j11) != 0;
            case 13:
                return zziha.zzc(obj, j11) != 0;
            case 14:
                return zziha.zze(obj, j11) != 0;
            case 15:
                return zziha.zzc(obj, j11) != 0;
            case 16:
                return zziha.zze(obj, j11) != 0;
            case 17:
                return zziha.zzm(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzL(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zziha.zzd(obj, j10, (1 << (iZzB >>> 20)) | zziha.zzc(obj, j10));
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zziha.zzc(obj, (long) (zzB(i11) & 1048575)) == i10;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        return zziha.zzc(obj, jZzB) == zziha.zzc(obj2, jZzB);
    }

    private final void zzO(Object obj, int i10, int i11) {
        zziha.zzd(obj, zzB(i11) & 1048575, i10);
    }

    private final int zzP(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzQ(i10, 0);
    }

    private final int zzQ(int i10, int i11) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static final int zzR(byte[] bArr, int i10, int i11, zzihg zzihgVar, Class cls, zzico zzicoVar) {
        zzihg zzihgVar2 = zzihg.zza;
        switch (zzihgVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                zzicoVar.zzc = Double.valueOf(Double.longBitsToDouble(zzicp.zze(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                zzicoVar.zzc = Float.valueOf(Float.intBitsToFloat(zzicp.zzd(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iZzc = zzicp.zzc(bArr, i10, zzicoVar);
                zzicoVar.zzc = Long.valueOf(zzicoVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzicp.zza(bArr, i10, zzicoVar);
                zzicoVar.zzc = Integer.valueOf(zzicoVar.zza);
                return iZza;
            case 5:
            case 15:
                int i14 = i10 + 8;
                zzicoVar.zzc = Long.valueOf(zzicp.zze(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                zzicoVar.zzc = Integer.valueOf(zzicp.zzd(bArr, i10));
                return i15;
            case 7:
                int iZzc2 = zzicp.zzc(bArr, i10, zzicoVar);
                zzicoVar.zzc = Boolean.valueOf(zzicoVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzicp.zzf(bArr, i10, zzicoVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzicp.zzh(zzifz.zza().zzb(cls), bArr, i10, i11, zzicoVar);
            case 11:
                return zzicp.zzg(bArr, i10, zzicoVar);
            case 16:
                int iZza2 = zzicp.zza(bArr, i10, zzicoVar);
                zzicoVar.zzc = Integer.valueOf(zzide.zzM(zzicoVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzicp.zzc(bArr, i10, zzicoVar);
                zzicoVar.zzc = Long.valueOf(zzide.zzN(zzicoVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzS(int i10, Object obj, zzihi zzihiVar) {
        if (obj instanceof String) {
            zzihiVar.zzm(i10, (String) obj);
        } else {
            zzihiVar.zzn(i10, (zzida) obj);
        }
    }

    static zzigu zzh(Object obj) {
        zziee zzieeVar = (zziee) obj;
        zzigu zziguVar = zzieeVar.zzt;
        if (zziguVar != zzigu.zza()) {
            return zziguVar;
        }
        zzigu zziguVarZzb = zzigu.zzb();
        zzieeVar.zzt = zziguVarZzb;
        return zziguVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0261  */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    /* JADX WARN: Code duplicated, block: B:130:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:171:0x0347  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:194:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:196:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c3  */
    static zzifs zzm(Class cls, zzifm zzifmVar, zzifv zzifvVar, zzifb zzifbVar, zzigt zzigtVar, zzidp zzidpVar, zzifk zzifkVar) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        int i19;
        char cCharAt2;
        int i20;
        char cCharAt3;
        int i21;
        char cCharAt4;
        int i22;
        char cCharAt5;
        int i23;
        char cCharAt6;
        int i24;
        char cCharAt7;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int i29;
        char c10;
        int i30;
        int i31;
        int i32;
        int i33;
        Field fieldZzn;
        int iObjectFieldOffset2;
        int i34;
        char cCharAt8;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        Object obj;
        Field fieldZzn2;
        int i44;
        Object obj2;
        Field fieldZzn3;
        int i45;
        char cCharAt9;
        int i46;
        char cCharAt10;
        int i47;
        char cCharAt11;
        int i48;
        char cCharAt12;
        if (!(zzifmVar instanceof zzigb)) {
            throw null;
        }
        zzigb zzigbVar = (zzigb) zzifmVar;
        String strZzd = zzigbVar.zzd();
        int length = strZzd.length();
        char c11 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i49 = 1;
            while (true) {
                i10 = i49 + 1;
                if (strZzd.charAt(i49) < 55296) {
                    break;
                }
                i49 = i10;
            }
        } else {
            i10 = 1;
        }
        int i50 = i10 + 1;
        int iCharAt2 = strZzd.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i51 = iCharAt2 & 8191;
            int i52 = 13;
            while (true) {
                i48 = i50 + 1;
                cCharAt12 = strZzd.charAt(i50);
                if (cCharAt12 < 55296) {
                    break;
                }
                i51 |= (cCharAt12 & 8191) << i52;
                i52 += 13;
                i50 = i48;
            }
            iCharAt2 = i51 | (cCharAt12 << i52);
            i50 = i48;
        }
        if (iCharAt2 == 0) {
            i15 = 0;
            i13 = 0;
            iCharAt = 0;
            i14 = 0;
            i12 = 0;
            i16 = 0;
            iArr = zza;
            i11 = 0;
        } else {
            int i53 = i50 + 1;
            int iCharAt3 = strZzd.charAt(i50);
            if (iCharAt3 >= 55296) {
                int i54 = iCharAt3 & 8191;
                int i55 = 13;
                while (true) {
                    i24 = i53 + 1;
                    cCharAt7 = strZzd.charAt(i53);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt7 & 8191) << i55;
                    i55 += 13;
                    i53 = i24;
                }
                iCharAt3 = i54 | (cCharAt7 << i55);
                i53 = i24;
            }
            int i56 = i53 + 1;
            int iCharAt4 = strZzd.charAt(i53);
            if (iCharAt4 >= 55296) {
                int i57 = iCharAt4 & 8191;
                int i58 = 13;
                while (true) {
                    i23 = i56 + 1;
                    cCharAt6 = strZzd.charAt(i56);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt6 & 8191) << i58;
                    i58 += 13;
                    i56 = i23;
                }
                iCharAt4 = i57 | (cCharAt6 << i58);
                i56 = i23;
            }
            int i59 = i56 + 1;
            int iCharAt5 = strZzd.charAt(i56);
            if (iCharAt5 >= 55296) {
                int i60 = iCharAt5 & 8191;
                int i61 = 13;
                while (true) {
                    i22 = i59 + 1;
                    cCharAt5 = strZzd.charAt(i59);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt5 & 8191) << i61;
                    i61 += 13;
                    i59 = i22;
                }
                iCharAt5 = i60 | (cCharAt5 << i61);
                i59 = i22;
            }
            int i62 = i59 + 1;
            int iCharAt6 = strZzd.charAt(i59);
            if (iCharAt6 >= 55296) {
                int i63 = iCharAt6 & 8191;
                int i64 = 13;
                while (true) {
                    i21 = i62 + 1;
                    cCharAt4 = strZzd.charAt(i62);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt4 & 8191) << i64;
                    i64 += 13;
                    i62 = i21;
                }
                iCharAt6 = i63 | (cCharAt4 << i64);
                i62 = i21;
            }
            int i65 = i62 + 1;
            iCharAt = strZzd.charAt(i62);
            if (iCharAt >= 55296) {
                int i66 = iCharAt & 8191;
                int i67 = 13;
                while (true) {
                    i20 = i65 + 1;
                    cCharAt3 = strZzd.charAt(i65);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt3 & 8191) << i67;
                    i67 += 13;
                    i65 = i20;
                }
                iCharAt = i66 | (cCharAt3 << i67);
                i65 = i20;
            }
            int i68 = i65 + 1;
            int iCharAt7 = strZzd.charAt(i65);
            if (iCharAt7 >= 55296) {
                int i69 = iCharAt7 & 8191;
                int i70 = 13;
                while (true) {
                    i19 = i68 + 1;
                    cCharAt2 = strZzd.charAt(i68);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt2 & 8191) << i70;
                    i70 += 13;
                    i68 = i19;
                }
                iCharAt7 = i69 | (cCharAt2 << i70);
                i68 = i19;
            }
            int i71 = i68 + 1;
            if (strZzd.charAt(i68) >= 55296) {
                while (true) {
                    i18 = i71 + 1;
                    if (strZzd.charAt(i71) < 55296) {
                        break;
                    }
                    i71 = i18;
                }
                i71 = i18;
            }
            int i72 = i71 + 1;
            int iCharAt8 = strZzd.charAt(i71);
            if (iCharAt8 >= 55296) {
                int i73 = iCharAt8 & 8191;
                int i74 = 13;
                while (true) {
                    i17 = i72 + 1;
                    cCharAt = strZzd.charAt(i72);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i73 |= (cCharAt & 8191) << i74;
                    i74 += 13;
                    i72 = i17;
                }
                iCharAt8 = i73 | (cCharAt << i74);
                i72 = i17;
            }
            int i75 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            i11 = iCharAt3;
            i50 = i72;
            i12 = iCharAt6;
            i13 = i75;
            iArr = iArr2;
            int i76 = iCharAt7;
            i14 = iCharAt5;
            i15 = i76;
            i16 = iCharAt8;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzigbVar.zze();
        Class<?> cls2 = zzigbVar.zzb().getClass();
        int i77 = i16 + i15;
        int i78 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i78];
        int i79 = i16;
        int i80 = i77;
        int i81 = 0;
        int i82 = 0;
        while (i50 < length) {
            int i83 = i50 + 1;
            int iCharAt9 = strZzd.charAt(i50);
            if (iCharAt9 >= c11) {
                int i84 = iCharAt9 & 8191;
                int i85 = i83;
                int i86 = 13;
                while (true) {
                    i47 = i85 + 1;
                    cCharAt11 = strZzd.charAt(i85);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i84 |= (cCharAt11 & 8191) << i86;
                    i86 += 13;
                    i85 = i47;
                }
                iCharAt9 = i84 | (cCharAt11 << i86);
                i25 = i47;
            } else {
                i25 = i83;
            }
            int i87 = i25 + 1;
            int iCharAt10 = strZzd.charAt(i25);
            if (iCharAt10 >= c11) {
                int i88 = iCharAt10 & 8191;
                int i89 = i87;
                int i90 = 13;
                while (true) {
                    i46 = i89 + 1;
                    cCharAt10 = strZzd.charAt(i89);
                    if (cCharAt10 < c11) {
                        break;
                    }
                    i88 |= (cCharAt10 & 8191) << i90;
                    i90 += 13;
                    i89 = i46;
                }
                iCharAt10 = i88 | (cCharAt10 << i90);
                i26 = i46;
            } else {
                i26 = i87;
            }
            if ((iCharAt10 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i81] = i82;
                i81++;
            }
            int i91 = iCharAt10 & 255;
            zzigb zzigbVar2 = zzigbVar;
            int i92 = iCharAt10 & 2048;
            if (i91 >= 51) {
                int i93 = i26 + 1;
                int iCharAt11 = strZzd.charAt(i26);
                char c12 = 55296;
                if (iCharAt11 >= 55296) {
                    int i94 = iCharAt11 & 8191;
                    int i95 = i93;
                    int i96 = 13;
                    while (true) {
                        i45 = i95 + 1;
                        cCharAt9 = strZzd.charAt(i95);
                        if (cCharAt9 < c12) {
                            break;
                        }
                        i94 |= (cCharAt9 & 8191) << i96;
                        i96 += 13;
                        i95 = i45;
                        c12 = 55296;
                    }
                    iCharAt11 = i94 | (cCharAt9 << i96);
                    i40 = i45;
                } else {
                    i40 = i93;
                }
                i30 = i40;
                int i97 = i91 - 51;
                i27 = length;
                if (i97 == 9 || i97 == 17) {
                    i41 = i13 + 1;
                    int i98 = i82 / 3;
                    objArr[i98 + i98 + 1] = objArrZze[i13];
                } else {
                    if (i97 != 12) {
                        i42 = i92;
                    } else if (zzigbVar2.zzc() == 1 || i92 != 0) {
                        i41 = i13 + 1;
                        int i99 = i82 / 3;
                        objArr[i99 + i99 + 1] = objArrZze[i13];
                    } else {
                        i42 = 0;
                    }
                    i43 = iCharAt11 + iCharAt11;
                    obj = objArrZze[i43];
                    i92 = i42;
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i43] = fieldZzn2;
                        iArr[i80] = i82;
                        i80++;
                    }
                    int i100 = i11;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i44 = i43 + 1;
                    obj2 = objArrZze[i44];
                    i28 = i100;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i44] = fieldZzn3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    strZzd = strZzd;
                    i32 = iObjectFieldOffset3;
                    i33 = 0;
                    c10 = 55296;
                }
                i13 = i41;
                i42 = i92;
                i43 = iCharAt11 + iCharAt11;
                obj = objArrZze[i43];
                i92 = i42;
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i43] = fieldZzn2;
                    iArr[i80] = i82;
                    i80++;
                }
                int i101 = i11;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzn2);
                i44 = i43 + 1;
                obj2 = objArrZze[i44];
                i28 = i101;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i44] = fieldZzn3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i32 = iObjectFieldOffset4;
                i33 = 0;
                c10 = 55296;
            } else {
                i27 = length;
                i28 = i11;
                int i102 = i13 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i13]);
                if (i91 == 9 || i91 == 17) {
                    int i103 = i82 / 3;
                    objArr[i103 + i103 + 1] = fieldZzn4.getType();
                } else {
                    if (i91 != 27) {
                        if (i91 == 49) {
                            i13 += 2;
                            i35 = 1;
                        } else if (i91 == 12 || i91 == 30 || i91 == 44) {
                            if (zzigbVar2.zzc() == 1 || i92 != 0) {
                                i13 += 2;
                                int i104 = i82 / 3;
                                objArr[i104 + i104 + 1] = objArrZze[i102];
                            } else {
                                i13 = i102;
                                i92 = 0;
                            }
                        } else if (i91 == 50) {
                            int i105 = i13 + 2;
                            int i106 = i79 + 1;
                            iArr[i79] = i82;
                            int i107 = i82 / 3;
                            int i108 = i107 + i107;
                            objArr[i108] = objArrZze[i102];
                            if (i92 != 0) {
                                objArr[i108 + 1] = objArrZze[i105];
                                i13 += 3;
                                i79 = i106;
                            } else {
                                i13 = i105;
                                i79 = i106;
                                i92 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                        i29 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i91 > 17) {
                            c10 = 55296;
                            i30 = i26;
                            i31 = i92;
                            i32 = iObjectFieldOffset;
                            i33 = 0;
                        } else {
                            int i109 = i26 + 1;
                            int iCharAt12 = strZzd.charAt(i26);
                            if (iCharAt12 >= 55296) {
                                int i110 = iCharAt12 & 8191;
                                int i111 = 13;
                                while (true) {
                                    i34 = i109 + 1;
                                    cCharAt8 = strZzd.charAt(i109);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i110 |= (cCharAt8 & 8191) << i111;
                                    i111 += 13;
                                    i109 = i34;
                                }
                                iCharAt12 = i110 | (cCharAt8 << i111);
                                i109 = i34;
                            }
                            int i112 = i28 + i28 + (iCharAt12 / 32);
                            Object obj3 = objArrZze[i112];
                            int i113 = i109;
                            if (obj3 instanceof Field) {
                                fieldZzn = (Field) obj3;
                            } else {
                                fieldZzn = zzn(cls2, (String) obj3);
                                objArrZze[i112] = fieldZzn;
                            }
                            int i114 = iCharAt12;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn);
                            int i115 = i114 % 32;
                            i32 = iObjectFieldOffset;
                            i30 = i113;
                            c10 = 55296;
                            i33 = i115;
                        }
                        int i116 = i82 + 1;
                        iArr3[i82] = iCharAt9;
                        int i117 = i82 + 2;
                        i36 = i31;
                        if ((iCharAt10 & 512) != 0) {
                            i37 = 536870912;
                        } else {
                            i37 = 0;
                        }
                        if ((iCharAt10 & 256) != 0) {
                            i38 = 268435456;
                        } else {
                            i38 = 0;
                        }
                        if (i36 != 0) {
                            i39 = Integer.MIN_VALUE;
                        } else {
                            i39 = 0;
                        }
                        iArr3[i116] = i37 | i38 | i39 | (i91 << 20) | i32;
                        i82 += 3;
                        iArr3[i117] = (i33 << 20) | i29;
                        strZzd = strZzd;
                        c11 = c10;
                        zzigbVar = zzigbVar2;
                        i50 = i30;
                        length = i27;
                        i11 = i28;
                    } else {
                        i35 = 1;
                        i13 += 2;
                    }
                    int i118 = i82 / 3;
                    objArr[i118 + i118 + i35] = objArrZze[i102];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    i29 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    c10 = 55296;
                    i30 = i26;
                    i31 = i92;
                    i32 = iObjectFieldOffset;
                    i33 = 0;
                    int i119 = i82 + 1;
                    iArr3[i82] = iCharAt9;
                    int i1110 = i82 + 2;
                    i36 = i31;
                    if ((iCharAt10 & 512) != 0) {
                        i37 = 536870912;
                    } else {
                        i37 = 0;
                    }
                    if ((iCharAt10 & 256) != 0) {
                        i38 = 268435456;
                    } else {
                        i38 = 0;
                    }
                    if (i36 != 0) {
                        i39 = Integer.MIN_VALUE;
                    } else {
                        i39 = 0;
                    }
                    iArr3[i119] = i37 | i38 | i39 | (i91 << 20) | i32;
                    i82 += 3;
                    iArr3[i1110] = (i33 << 20) | i29;
                    strZzd = strZzd;
                    c11 = c10;
                    zzigbVar = zzigbVar2;
                    i50 = i30;
                    length = i27;
                    i11 = i28;
                }
                i13 = i102;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                i29 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                }
                c10 = 55296;
                i30 = i26;
                i31 = i92;
                i32 = iObjectFieldOffset;
                i33 = 0;
                int i1111 = i82 + 1;
                iArr3[i82] = iCharAt9;
                int i1112 = i82 + 2;
                i36 = i31;
                if ((iCharAt10 & 512) != 0) {
                    i37 = 536870912;
                } else {
                    i37 = 0;
                }
                if ((iCharAt10 & 256) != 0) {
                    i38 = 268435456;
                } else {
                    i38 = 0;
                }
                if (i36 != 0) {
                    i39 = Integer.MIN_VALUE;
                } else {
                    i39 = 0;
                }
                iArr3[i1111] = i37 | i38 | i39 | (i91 << 20) | i32;
                i82 += 3;
                iArr3[i1112] = (i33 << 20) | i29;
                strZzd = strZzd;
                c11 = c10;
                zzigbVar = zzigbVar2;
                i50 = i30;
                length = i27;
                i11 = i28;
            }
            i29 = iObjectFieldOffset2;
            i31 = i92;
            int i1113 = i82 + 1;
            iArr3[i82] = iCharAt9;
            int i1114 = i82 + 2;
            i36 = i31;
            if ((iCharAt10 & 512) != 0) {
                i37 = 536870912;
            } else {
                i37 = 0;
            }
            if ((iCharAt10 & 256) != 0) {
                i38 = 268435456;
            } else {
                i38 = 0;
            }
            if (i36 != 0) {
                i39 = Integer.MIN_VALUE;
            } else {
                i39 = 0;
            }
            iArr3[i1113] = i37 | i38 | i39 | (i91 << 20) | i32;
            i82 += 3;
            iArr3[i1114] = (i33 << 20) | i29;
            strZzd = strZzd;
            c11 = c10;
            zzigbVar = zzigbVar2;
            i50 = i30;
            length = i27;
            i11 = i28;
        }
        return new zzifs(iArr3, objArr, i14, i12, zzigbVar.zzb(), false, iArr, i16, i77, zzifvVar, zzifbVar, zzigtVar, zzidpVar, zzifkVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void zzo(Object obj, Object obj2, int i10) {
        if (zzK(obj2, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.zzc[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzigh zzighVarZzq = zzq(i10);
            if (!zzK(obj, i10)) {
                if (zzE(object)) {
                    Object objZza = zzighVarZzq.zza();
                    zzighVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzL(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzighVarZzq.zza();
                zzighVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzighVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzA = zzA(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzA;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzigh zzighVarZzq = zzq(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zzighVarZzq.zza();
                    zzighVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzO(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzighVarZzq.zza();
                zzighVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzighVarZzq.zzd(object2, object);
        }
    }

    private final zzigh zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzigh zzighVar = (zzigh) objArr[i12];
        if (zzighVar != null) {
            return zzighVar;
        }
        zzigh zzighVarZzb = zzifz.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzighVarZzb;
        return zzighVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zziek zzs(int i10) {
        int i11 = i10 / 3;
        return (zziek) this.zzd[i11 + i11 + 1];
    }

    private final Object zzt(Object obj, int i10) {
        zzigh zzighVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzK(obj, i10)) {
            return zzighVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzighVarZzq.zza();
        if (object != null) {
            zzighVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzL(obj, i10);
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzigh zzighVarZzq = zzq(i11);
        if (!zzM(obj, i10, i11)) {
            return zzighVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzighVarZzq.zza();
        if (object != null) {
            zzighVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzO(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzigt zzigtVar, Object obj3) {
        zziek zziekVarZzs;
        int i11 = this.zzc[i10];
        Object objZzm = zziha.zzm(obj, zzA(i10) & 1048575);
        if (objZzm == null || (zziekVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzifh zzifhVarZze = ((zzifi) zzr(i10)).zze();
        Iterator it = ((zzifj) objZzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zziekVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzigtVar.zzh(obj3);
                }
                int iZzc = zzifi.zzc(zzifhVarZze, entry.getKey(), entry.getValue());
                zzida zzidaVar = zzida.zza;
                byte[] bArr = new byte[iZzc];
                int i12 = zzidj.zzb;
                zzidg zzidgVar = new zzidg(bArr, 0, iZzc);
                try {
                    zzifi.zzb(zzidgVar, zzifhVarZze, entry.getKey(), entry.getValue());
                    zzigtVar.zzd(obj2, i11, zzicw.zza(zzidgVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i10, zzigh zzighVar) {
        return zzighVar.zzl(zziha.zzm(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzigc zzigcVar) {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zziha.zzn(obj, j10, zzigcVar.zzn());
        } else if (this.zzi) {
            zziha.zzn(obj, j10, zzigcVar.zzm());
        } else {
            zziha.zzn(obj, j10, zzigcVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final Object zza() {
        return ((zziee) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j10 = iZzA & 1048575;
                switch (iZzC) {
                    case 0:
                        if (!zzI(obj, obj2, i10) || Double.doubleToLongBits(zziha.zzk(obj, j10)) != Double.doubleToLongBits(zziha.zzk(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzI(obj, obj2, i10) || Float.floatToIntBits(zziha.zzi(obj, j10)) != Float.floatToIntBits(zziha.zzi(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzI(obj, obj2, i10) || zziha.zzg(obj, j10) != zziha.zzg(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzI(obj, obj2, i10) || zziha.zzc(obj, j10) != zziha.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzI(obj, obj2, i10) || zziha.zze(obj, j10) != zziha.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzI(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case SDK_INIT_API_VALUE:
                    case AD_START_EVENT_VALUE:
                    case AD_CLICK_EVENT_VALUE:
                    case 48:
                    case 49:
                        zZzG = zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10));
                        break;
                    case 50:
                        zZzG = zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case AD_VISIBILITY_VALUE:
                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    case 60:
                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    case DEPRECATED_API_USED_VALUE:
                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    case 64:
                    case 65:
                    case BLACK_SCREEN_IS_DETECTED_VALUE:
                    case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                        if (!zzN(obj, obj2, i10) || !zzigi.zzG(zziha.zzm(obj, j10), zziha.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzG) {
                    return false;
                }
            }
        }
        int i11 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i11 >= iArr.length) {
                if (!((zziee) obj).zzt.equals(((zziee) obj2).zzt)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zziea) obj).zza.equals(((zziea) obj2).zza);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!zzN(obj, obj2, i12)) {
                return false;
            }
            if (!zzM(obj, 0, i12)) {
                long jZzA = zzA(i12) & 1048575;
                if (!zzigi.zzG(zziha.zzm(obj, jZzA), zziha.zzm(obj2, jZzA))) {
                    return false;
                }
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzA = zzA(i12);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j10 = iZzA & 1048575;
                int iHashCode2 = 37;
                switch (iZzC) {
                    case 0:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zziha.zzk(obj, j10));
                        byte[] bArr = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zziha.zzi(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr2 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr3 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr4 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzier.zza(zziha.zzg(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zziha.zzm(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzm = zziha.zzm(obj, j10);
                        if (objZzm != null) {
                            iHashCode2 = objZzm.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr5 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zziha.zze(obj, j10);
                        byte[] bArr6 = zzier.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzm2 = zziha.zzm(obj, j10);
                        if (objZzm2 != null) {
                            iHashCode2 = objZzm2.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case SDK_INIT_API_VALUE:
                    case AD_START_EVENT_VALUE:
                    case AD_CLICK_EVENT_VALUE:
                    case 48:
                    case 49:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zziha.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((zziee) obj).zzt.hashCode();
                return this.zzh ? (iHashCode3 * 53) + ((zziea) obj).zza.zza.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!zzM(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + zziha.zzm(obj, zzA(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzigi.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzigi.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i10);
            int i11 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzC) {
                case 0:
                    if (zzK(obj2, i10)) {
                        zziha.zzl(obj, j10, zziha.zzk(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 1:
                    if (zzK(obj2, i10)) {
                        zziha.zzj(obj, j10, zziha.zzi(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 2:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 3:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 4:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 5:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 6:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 7:
                    if (zzK(obj2, i10)) {
                        zziha.zzh(obj, j10, zziha.zzg(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 8:
                    if (zzK(obj2, i10)) {
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i10);
                    break;
                case 10:
                    if (zzK(obj2, i10)) {
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 11:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 12:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 13:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 14:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 15:
                    if (zzK(obj2, i10)) {
                        zziha.zzd(obj, j10, zziha.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 16:
                    if (zzK(obj2, i10)) {
                        zziha.zzf(obj, j10, zziha.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case SDK_INIT_API_VALUE:
                case AD_START_EVENT_VALUE:
                case AD_CLICK_EVENT_VALUE:
                case 48:
                case 49:
                    zzieq zzieqVarZzh = (zzieq) zziha.zzm(obj, j10);
                    zzieq zzieqVar = (zzieq) zziha.zzm(obj2, j10);
                    int size = zzieqVarZzh.size();
                    int size2 = zzieqVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzieqVarZzh.zza()) {
                            zzieqVarZzh = zzieqVarZzh.zzh(size2 + size);
                        }
                        zzieqVarZzh.addAll(zzieqVar);
                    }
                    if (size > 0) {
                        zzieqVar = zzieqVarZzh;
                    }
                    zziha.zzn(obj, j10, zzieqVar);
                    break;
                case 50:
                    int i13 = zzigi.zza;
                    zziha.zzn(obj, j10, zzifk.zzb(zziha.zzm(obj, j10), zziha.zzm(obj2, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case AD_VISIBILITY_VALUE:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzM(obj2, i12, i10)) {
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
                        zzO(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzp(obj, obj2, i10);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case DEPRECATED_API_USED_VALUE:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzM(obj2, i12, i10)) {
                        zziha.zzn(obj, j10, zziha.zzm(obj2, j10));
                        zzO(obj, i12, i10);
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    zzp(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0391  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e2  */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final int zze(Object obj) {
        int i10;
        int iZzF;
        int iZzF2;
        int iZzG;
        int iZzF3;
        int iZzF4;
        int iZzF5;
        int iZzc;
        int iZzF6;
        int iZzD;
        int iZzs;
        int size;
        int iZzt;
        int iZzF7;
        int iZzc2;
        int iZzF8;
        int iZzc3;
        int iZzF9;
        int iZzF10;
        int iZzaT;
        int iZzF11;
        int iZzF12;
        int iZzG2;
        int iZzB;
        int iZzF13;
        int iZzF14;
        int iZzE;
        int iZzF15;
        int iZzF16;
        int iZzF17;
        int iZzc4;
        int iZzF18;
        zzifs<T> zzifsVar = this;
        Unsafe unsafe = zzb;
        int i11 = 0;
        int i12 = 0;
        int iZzF19 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = zzifsVar.zzc;
            if (i11 >= iArr.length) {
                int iZzi = iZzF19 + ((zziee) obj).zzt.zzi();
                if (!zzifsVar.zzh) {
                    return iZzi;
                }
                zzign zzignVar = ((zziea) obj).zza.zza;
                int iZzc5 = zzignVar.zzc();
                int iZzj = 0;
                for (int i14 = 0; i14 < iZzc5; i14++) {
                    Map.Entry entryZzd = zzignVar.zzd(i14);
                    iZzj += zzidt.zzj((zzids) ((zzigk) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzignVar.zze()) {
                    iZzj += zzidt.zzj((zzids) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA = zzifsVar.zzA(i11);
            int iZzC = zzC(iZzA);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            if (iZzC <= 17) {
                if (i17 != i13) {
                    i12 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = iZzA & 1048575;
            if (iZzC >= zzidu.zzJ.zza()) {
                zzidu.zzW.zza();
            }
            long j10 = i18;
            switch (iZzC) {
                case 0:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzF19 += zzidj.zzF(i15 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzF = zzidj.zzF(i15 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 2:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzF2 = zzidj.zzF(i15 << 3);
                        iZzG = zzidj.zzG(j11);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 3:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzF2 = zzidj.zzF(i15 << 3);
                        iZzG = zzidj.zzG(j12);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 4:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzF2 = zzidj.zzF(i15 << 3);
                        iZzG = zzidj.zzG(j13);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 5:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzF3 = zzidj.zzF(i15 << 3);
                        iZzF4 = iZzF3 + 8;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 6:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzF = zzidj.zzF(i15 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 7:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzF4 = zzidj.zzF(i15 << 3) + 1;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 8:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzida) {
                            iZzF5 = zzidj.zzF(i19);
                            iZzc = ((zzida) object).zzb();
                            iZzF6 = zzidj.zzF(iZzc);
                        } else {
                            iZzF5 = zzidj.zzF(i19);
                            iZzc = zzihf.zzc((String) object);
                            iZzF6 = zzidj.zzF(iZzc);
                        }
                        iZzF4 = iZzF5 + iZzF6 + iZzc;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 9:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzD = zzigi.zzD(i15, unsafe.getObject(obj, j10), zzifsVar.zzq(i11));
                        iZzF19 += iZzD;
                    }
                    break;
                case 10:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        zzida zzidaVar = (zzida) unsafe.getObject(obj, j10);
                        iZzF5 = zzidj.zzF(i15 << 3);
                        iZzc = zzidaVar.zzb();
                        iZzF6 = zzidj.zzF(iZzc);
                        iZzF4 = iZzF5 + iZzF6 + iZzc;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 11:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        int i20 = unsafe.getInt(obj, j10);
                        iZzF2 = zzidj.zzF(i15 << 3);
                        iZzG = zzidj.zzF(i20);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 12:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzF2 = zzidj.zzF(i15 << 3);
                        iZzG = zzidj.zzG(j14);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 13:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzF = zzidj.zzF(i15 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 14:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzF3 = zzidj.zzF(i15 << 3);
                        iZzF4 = iZzF3 + 8;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 15:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzF2 = zzidj.zzF(i15 << 3);
                        iZzG = zzidj.zzF((i21 >> 31) ^ (i21 + i21));
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 16:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzF2 = zzidj.zzF(i15 << 3);
                        iZzG = zzidj.zzG((j15 >> 63) ^ (j15 + j15));
                        iZzF4 = iZzF2 + iZzG;
                        iZzF19 += iZzF4;
                    }
                    zzifsVar = this;
                    break;
                case 17:
                    if (zzifsVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzD = zzigi.zzE(i15, (zzifp) unsafe.getObject(obj, j10), zzifsVar.zzq(i11));
                        iZzF19 += iZzD;
                    }
                    break;
                case 18:
                    iZzD = zzigi.zzC(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzF19 += iZzD;
                    break;
                case 19:
                    iZzD = zzigi.zzA(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzF19 += iZzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i22 = zzigi.zza;
                    if (list.size() == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzigi.zzs(list) + (list.size() * zzidj.zzF(i15 << 3));
                    }
                    iZzF19 += iZzs;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i23 = zzigi.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigi.zzt(list2);
                        iZzF7 = zzidj.zzF(i15 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzigi.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigi.zzw(list3);
                        iZzF7 = zzidj.zzF(i15 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 23:
                    iZzD = zzigi.zzC(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzF19 += iZzD;
                    break;
                case 24:
                    iZzD = zzigi.zzA(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzF19 += iZzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzigi.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzD = 0;
                    } else {
                        iZzD = size2 * (zzidj.zzF(i15 << 3) + 1);
                    }
                    iZzF19 += iZzD;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzigi.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzidj.zzF(i15 << 3) * size3;
                        if (list5 instanceof zzifa) {
                            zzifa zzifaVar = (zzifa) list5;
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object objZzc = zzifaVar.zzc();
                                if (objZzc instanceof zzida) {
                                    iZzc3 = ((zzida) objZzc).zzb();
                                    iZzF9 = zzidj.zzF(iZzc3);
                                } else {
                                    iZzc3 = zzihf.zzc((String) objZzc);
                                    iZzF9 = zzidj.zzF(iZzc3);
                                }
                                iZzs += iZzF9 + iZzc3;
                            }
                        } else {
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj2 = list5.get(i28);
                                if (obj2 instanceof zzida) {
                                    iZzc2 = ((zzida) obj2).zzb();
                                    iZzF8 = zzidj.zzF(iZzc2);
                                } else {
                                    iZzc2 = zzihf.zzc((String) obj2);
                                    iZzF8 = zzidj.zzF(iZzc2);
                                }
                                iZzs += iZzF8 + iZzc2;
                            }
                        }
                    }
                    iZzF19 += iZzs;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    zzigh zzighVarZzq = zzifsVar.zzq(i11);
                    int i29 = zzigi.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzF10 = 0;
                    } else {
                        iZzF10 = zzidj.zzF(i15 << 3) * size4;
                        for (int i30 = 0; i30 < size4; i30++) {
                            Object obj3 = list6.get(i30);
                            if (obj3 instanceof zziez) {
                                iZzaT = ((zziez) obj3).zzb();
                                iZzF11 = zzidj.zzF(iZzaT);
                            } else {
                                iZzaT = ((zzicj) obj3).zzaT(zzighVarZzq);
                                iZzF11 = zzidj.zzF(iZzaT);
                            }
                            iZzF10 += iZzF11 + iZzaT;
                        }
                    }
                    iZzF19 += iZzF10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzigi.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzF12 = 0;
                    } else {
                        iZzF12 = size5 * zzidj.zzF(i15 << 3);
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzb = ((zzida) list7.get(i32)).zzb();
                            iZzF12 += zzidj.zzF(iZzb) + iZzb;
                        }
                    }
                    iZzF19 += iZzF12;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzigi.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigi.zzx(list8);
                        iZzF7 = zzidj.zzF(i15 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzigi.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigi.zzv(list9);
                        iZzF7 = zzidj.zzF(i15 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 31:
                    iZzD = zzigi.zzA(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzF19 += iZzD;
                    break;
                case 32:
                    iZzD = zzigi.zzC(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzF19 += iZzD;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i35 = zzigi.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigi.zzy(list10);
                        iZzF7 = zzidj.zzF(i15 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i36 = zzigi.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigi.zzu(list11);
                        iZzF7 = zzidj.zzF(i15 << 3);
                        iZzG2 = size * iZzF7;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF19 += iZzD;
                    break;
                case 35:
                    iZzB = zzigi.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 36:
                    iZzB = zzigi.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 37:
                    iZzB = zzigi.zzs((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 38:
                    iZzB = zzigi.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 39:
                    iZzB = zzigi.zzw((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 40:
                    iZzB = zzigi.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 41:
                    iZzB = zzigi.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzigi.zza;
                    iZzB = list12.size();
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 43:
                    iZzB = zzigi.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 44:
                    iZzB = zzigi.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case SDK_INIT_API_VALUE:
                    iZzB = zzigi.zzz((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case AD_START_EVENT_VALUE:
                    iZzB = zzigi.zzB((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case AD_CLICK_EVENT_VALUE:
                    iZzB = zzigi.zzy((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 48:
                    iZzB = zzigi.zzu((List) unsafe.getObject(obj, j10));
                    if (iZzB > 0) {
                        iZzF13 = zzidj.zzF(i15 << 3);
                        iZzF14 = zzidj.zzF(iZzB);
                        iZzF12 = iZzF13 + iZzF14 + iZzB;
                        iZzF19 += iZzF12;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    zzigh zzighVarZzq2 = zzifsVar.zzq(i11);
                    int i38 = zzigi.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzE = 0;
                    } else {
                        iZzE = 0;
                        for (int i39 = 0; i39 < size6; i39++) {
                            iZzE += zzigi.zzE(i15, (zzifp) list13.get(i39), zzighVarZzq2);
                        }
                    }
                    iZzF19 += iZzE;
                    break;
                case 50:
                    zzifj zzifjVar = (zzifj) unsafe.getObject(obj, j10);
                    zzifi zzifiVar = (zzifi) zzifsVar.zzr(i11);
                    if (zzifjVar.isEmpty()) {
                        iZzs = 0;
                    } else {
                        iZzs = 0;
                        for (Map.Entry entry2 : zzifjVar.entrySet()) {
                            iZzs += zzifiVar.zzd(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzF19 += iZzs;
                    break;
                case 51:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzF15 = zzidj.zzF(i15 << 3);
                        iZzD = iZzF15 + 8;
                        iZzF19 += iZzD;
                    }
                    break;
                case 52:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzF16 = zzidj.zzF(i15 << 3);
                        iZzD = iZzF16 + 4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 53:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        long jZzH = zzH(obj, j10);
                        iZzt = zzidj.zzF(i15 << 3);
                        iZzG2 = zzidj.zzG(jZzH);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 54:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        long jZzH2 = zzH(obj, j10);
                        iZzt = zzidj.zzF(i15 << 3);
                        iZzG2 = zzidj.zzG(jZzH2);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 55:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        long jZzG = zzG(obj, j10);
                        iZzt = zzidj.zzF(i15 << 3);
                        iZzG2 = zzidj.zzG(jZzG);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzF15 = zzidj.zzF(i15 << 3);
                        iZzD = iZzF15 + 8;
                        iZzF19 += iZzD;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzF16 = zzidj.zzF(i15 << 3);
                        iZzD = iZzF16 + 4;
                        iZzF19 += iZzD;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzD = zzidj.zzF(i15 << 3) + 1;
                        iZzF19 += iZzD;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        int i40 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzida) {
                            iZzF17 = zzidj.zzF(i40);
                            iZzc4 = ((zzida) object2).zzb();
                            iZzF18 = zzidj.zzF(iZzc4);
                        } else {
                            iZzF17 = zzidj.zzF(i40);
                            iZzc4 = zzihf.zzc((String) object2);
                            iZzF18 = zzidj.zzF(iZzc4);
                        }
                        iZzD = iZzF17 + iZzF18 + iZzc4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 60:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzD = zzigi.zzD(i15, unsafe.getObject(obj, j10), zzifsVar.zzq(i11));
                        iZzF19 += iZzD;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        zzida zzidaVar2 = (zzida) unsafe.getObject(obj, j10);
                        iZzF17 = zzidj.zzF(i15 << 3);
                        iZzc4 = zzidaVar2.zzb();
                        iZzF18 = zzidj.zzF(iZzc4);
                        iZzD = iZzF17 + iZzF18 + iZzc4;
                        iZzF19 += iZzD;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        int iZzG3 = zzG(obj, j10);
                        iZzt = zzidj.zzF(i15 << 3);
                        iZzG2 = zzidj.zzF(iZzG3);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        long jZzG2 = zzG(obj, j10);
                        iZzt = zzidj.zzF(i15 << 3);
                        iZzG2 = zzidj.zzG(jZzG2);
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case 64:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzF16 = zzidj.zzF(i15 << 3);
                        iZzD = iZzF16 + 4;
                        iZzF19 += iZzD;
                    }
                    break;
                case 65:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzF15 = zzidj.zzF(i15 << 3);
                        iZzD = iZzF15 + 8;
                        iZzF19 += iZzD;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        int iZzG4 = zzG(obj, j10);
                        iZzt = zzidj.zzF(i15 << 3);
                        iZzG2 = zzidj.zzF((iZzG4 >> 31) ^ (iZzG4 + iZzG4));
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        long jZzH3 = zzH(obj, j10);
                        iZzt = zzidj.zzF(i15 << 3);
                        iZzG2 = zzidj.zzG((jZzH3 >> 63) ^ (jZzH3 + jZzH3));
                        iZzD = iZzt + iZzG2;
                        iZzF19 += iZzD;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i15, i11)) {
                        iZzD = zzigi.zzE(i15, (zzifp) unsafe.getObject(obj, j10), zzifsVar.zzq(i11));
                        iZzF19 += iZzD;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzf(Object obj, zzihi zzihiVar) {
        Map.Entry entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        zzifs<T> zzifsVar = this;
        if (zzifsVar.zzh) {
            zzidt zzidtVar = ((zziea) obj).zza;
            if (zzidtVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzc = zzidtVar.zzc();
                entry = (Map.Entry) itZzc.next();
                it = itZzc;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzifsVar.zzc;
        Unsafe unsafe = zzb;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < iArr.length) {
            int iZzA = zzifsVar.zzA(i15);
            int iZzC = zzC(iZzA);
            int i17 = iArr[i15];
            if (iZzC <= 17) {
                int i18 = iArr[i15 + 2];
                z10 = true;
                int i19 = i18 & i13;
                if (i19 != i14) {
                    i16 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i10 = i14;
                i11 = i16;
                i12 = 1 << (i18 >>> 20);
            } else {
                z10 = true;
                i10 = i14;
                i11 = i16;
                i12 = 0;
            }
            while (true) {
                if (entry != null) {
                    zzidp zzidpVar = zzifsVar.zzn;
                    i13 = i13;
                    if (((zzieb) entry.getKey()).zza <= i17) {
                        zzidpVar.zzb(zzihiVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                } else {
                    i13 = i13;
                }
            }
            long j10 = iZzA & i13;
            switch (iZzC) {
                case 0:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzf(i17, zziha.zzk(obj, j10));
                    }
                    break;
                case 1:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zze(i17, zziha.zzi(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 2:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzc(i17, unsafe.getLong(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 3:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzh(i17, unsafe.getLong(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 4:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzi(i17, unsafe.getInt(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 5:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzj(i17, unsafe.getLong(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 6:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzk(i17, unsafe.getInt(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 7:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzl(i17, zziha.zzg(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 8:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzS(i17, unsafe.getObject(obj, j10), zzihiVar);
                    }
                    zzifsVar = this;
                    break;
                case 9:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzr(i17, unsafe.getObject(obj, j10), zzifsVar.zzq(i15));
                    }
                    break;
                case 10:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzn(i17, (zzida) unsafe.getObject(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 11:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzo(i17, unsafe.getInt(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 12:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzg(i17, unsafe.getInt(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 13:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzb(i17, unsafe.getInt(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 14:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzd(i17, unsafe.getLong(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 15:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzp(i17, unsafe.getInt(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 16:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzq(i17, unsafe.getLong(obj, j10));
                    }
                    zzifsVar = this;
                    break;
                case 17:
                    if (zzifsVar.zzJ(obj, i15, i10, i11, i12)) {
                        zzihiVar.zzs(i17, unsafe.getObject(obj, j10), zzifsVar.zzq(i15));
                    }
                    break;
                case 18:
                    zzigi.zza(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 19:
                    zzigi.zzb(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 20:
                    zzigi.zzc(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 21:
                    zzigi.zzd(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 22:
                    zzigi.zzh(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 23:
                    zzigi.zzf(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 24:
                    zzigi.zzk(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 25:
                    zzigi.zzn(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 26:
                    zzigi.zzo(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar);
                    break;
                case 27:
                    zzigi.zzq(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, zzifsVar.zzq(i15));
                    break;
                case 28:
                    zzigi.zzp(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar);
                    break;
                case 29:
                    zzigi.zzi(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 30:
                    zzigi.zzm(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 31:
                    zzigi.zzl(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 32:
                    zzigi.zzg(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 33:
                    zzigi.zzj(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 34:
                    zzigi.zze(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, false);
                    break;
                case 35:
                    zzigi.zza(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 36:
                    zzigi.zzb(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 37:
                    zzigi.zzc(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 38:
                    zzigi.zzd(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 39:
                    zzigi.zzh(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 40:
                    zzigi.zzf(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 41:
                    zzigi.zzk(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 42:
                    zzigi.zzn(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 43:
                    zzigi.zzi(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 44:
                    zzigi.zzm(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case SDK_INIT_API_VALUE:
                    zzigi.zzl(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case AD_START_EVENT_VALUE:
                    zzigi.zzg(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    zzigi.zzj(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 48:
                    zzigi.zze(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, z10);
                    break;
                case 49:
                    zzigi.zzr(iArr[i15], (List) unsafe.getObject(obj, j10), zzihiVar, zzifsVar.zzq(i15));
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zzihiVar.zzM(i17, ((zzifi) zzifsVar.zzr(i15)).zze(), (zzifj) object);
                    }
                    break;
                case 51:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzf(i17, ((Double) zziha.zzm(obj, j10)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zze(i17, ((Float) zziha.zzm(obj, j10)).floatValue());
                    }
                    break;
                case 53:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzc(i17, zzH(obj, j10));
                    }
                    break;
                case 54:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzh(i17, zzH(obj, j10));
                    }
                    break;
                case 55:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzi(i17, zzG(obj, j10));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzj(i17, zzH(obj, j10));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzk(i17, zzG(obj, j10));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzl(i17, ((Boolean) zziha.zzm(obj, j10)).booleanValue());
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzS(i17, unsafe.getObject(obj, j10), zzihiVar);
                    }
                    break;
                case 60:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzr(i17, unsafe.getObject(obj, j10), zzifsVar.zzq(i15));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzn(i17, (zzida) unsafe.getObject(obj, j10));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzo(i17, zzG(obj, j10));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzg(i17, zzG(obj, j10));
                    }
                    break;
                case 64:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzb(i17, zzG(obj, j10));
                    }
                    break;
                case 65:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzd(i17, zzH(obj, j10));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzp(i17, zzG(obj, j10));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzq(i17, zzH(obj, j10));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzifsVar.zzM(obj, i17, i15)) {
                        zzihiVar.zzs(i17, unsafe.getObject(obj, j10), zzifsVar.zzq(i15));
                    }
                    break;
                default:
                    break;
            }
            i15 += 3;
            i16 = i11;
            i13 = i13;
            i14 = i10;
            entry = entry;
        }
        while (entry != null) {
            zzifsVar.zzn.zzb(zzihiVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zziee) obj).zzt.zzg(zzihiVar);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0579 A[LOOP:1: B:173:0x0575->B:175:0x0579, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x058b  */
    /* JADX WARN: Code duplicated, block: B:180:0x058f  */
    /* JADX WARN: Code duplicated, block: B:191:0x05a5 A[LOOP:2: B:189:0x05a1->B:191:0x05a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:206:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzg(Object obj, zzigc zzigcVar, zzido zzidoVar) throws Throwable {
        zzifs<T> zzifsVar;
        Object obj2;
        Throwable th2;
        int i10;
        Object objZzx;
        zzigt zzigtVar;
        Object objZzx2;
        Object obj3;
        zzifs<T> zzifsVar2;
        int i11;
        zzidoVar.getClass();
        zzF(obj);
        zzigt zzigtVar2 = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzigcVar.zzb();
                int iZzP = zzP(iZzb);
                if (iZzP >= 0) {
                    obj3 = obj;
                    zzifsVar2 = this;
                    try {
                        int iZzA = zzA(iZzP);
                        try {
                            try {
                                switch (zzC(iZzA)) {
                                    case 0:
                                        obj2 = obj3;
                                        zziha.zzl(obj2, iZzA & 1048575, zzigcVar.zze());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        zziha.zzj(obj2, iZzA & 1048575, zzigcVar.zzf());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        zziha.zzf(obj2, iZzA & 1048575, zzigcVar.zzh());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        zziha.zzf(obj2, iZzA & 1048575, zzigcVar.zzg());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        zziha.zzd(obj2, iZzA & 1048575, zzigcVar.zzi());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        zziha.zzf(obj2, iZzA & 1048575, zzigcVar.zzj());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        zziha.zzd(obj2, iZzA & 1048575, zzigcVar.zzk());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        zziha.zzh(obj2, iZzA & 1048575, zzigcVar.zzl());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        zzz(obj2, iZzA, zzigcVar);
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        zzifp zzifpVar = (zzifp) zzt(obj2, iZzP);
                                        zzigcVar.zzo(zzifpVar, zzq(iZzP), zzidoVar);
                                        zzu(obj2, iZzP, zzifpVar);
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        zziha.zzn(obj2, iZzA & 1048575, zzigcVar.zzq());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        zziha.zzd(obj2, iZzA & 1048575, zzigcVar.zzr());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZzs = zzigcVar.zzs();
                                        zziek zziekVarZzs = zzs(iZzP);
                                        if (zziekVarZzs == null || zziekVarZzs.zza(iZzs)) {
                                            zziha.zzd(obj2, iZzA & 1048575, iZzs);
                                            zzL(obj2, iZzP);
                                        } else {
                                            objZzh = zzigi.zzK(obj2, iZzb, iZzs, objZzh, zzigtVar2);
                                        }
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        zziha.zzd(obj2, iZzA & 1048575, zzigcVar.zzt());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        zziha.zzf(obj2, iZzA & 1048575, zzigcVar.zzu());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        zziha.zzd(obj2, iZzA & 1048575, zzigcVar.zzv());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        zziha.zzf(obj2, iZzA & 1048575, zzigcVar.zzw());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        zzifp zzifpVar2 = (zzifp) zzt(obj2, iZzP);
                                        zzigcVar.zzp(zzifpVar2, zzq(iZzP), zzidoVar);
                                        zzu(obj2, iZzP, zzifpVar2);
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        zzigcVar.zzx(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        zzigcVar.zzy(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        zzigcVar.zzA(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 21:
                                        obj2 = obj3;
                                        zzigcVar.zzz(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        zzigcVar.zzB(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        zzigcVar.zzC(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        zzigcVar.zzD(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 25:
                                        obj2 = obj3;
                                        zzigcVar.zzE(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        if (zzD(iZzA)) {
                                            ((zzidf) zzigcVar).zzF(zzifb.zza(obj2, iZzA & 1048575), true);
                                        } else {
                                            ((zzidf) zzigcVar).zzF(zzifb.zza(obj2, iZzA & 1048575), false);
                                        }
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        zzigcVar.zzG(zzifb.zza(obj2, iZzA & 1048575), zzq(iZzP), zzidoVar);
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        zzigcVar.zzI(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        zzigcVar.zzJ(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 30:
                                        List listZza = zzifb.zza(obj3, iZzA & 1048575);
                                        zzigcVar.zzK(listZza);
                                        objZzh = zzigi.zzJ(obj3, iZzb, listZza, zzs(iZzP), objZzh, zzigtVar2);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        zzigcVar.zzL(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        zzigcVar.zzM(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        zzigcVar.zzN(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        zzigcVar.zzO(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        zzigcVar.zzx(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        zzigcVar.zzy(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        zzigcVar.zzA(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 38:
                                        obj2 = obj3;
                                        zzigcVar.zzz(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        zzigcVar.zzB(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        zzigcVar.zzC(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        zzigcVar.zzD(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 42:
                                        obj2 = obj3;
                                        zzigcVar.zzE(zzifb.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            zzigcVar.zzJ(zzifb.zza(obj2, iZzA & 1048575));
                                            break;
                                        } catch (zzies unused) {
                                            if (objZzh == null) {
                                                try {
                                                    objZzh = zzigtVar2.zzh(obj2);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th2 = th;
                                                    zzifsVar = zzifsVar2;
                                                    i10 = zzifsVar.zzk;
                                                    objZzx = objZzh;
                                                    while (i10 < zzifsVar.zzl) {
                                                        zzigt zzigtVar3 = zzigtVar2;
                                                        objZzx = zzifsVar.zzx(obj2, zzifsVar.zzj[i10], objZzx, zzigtVar3, obj2);
                                                        i10++;
                                                        zzifsVar = this;
                                                        zzigtVar2 = zzigtVar3;
                                                    }
                                                    zzigtVar = zzigtVar2;
                                                    if (objZzx != null) {
                                                        throw th2;
                                                    }
                                                    zzigtVar.zzi(obj2, objZzx);
                                                    throw th2;
                                                }
                                            }
                                            try {
                                                if (!zzigtVar2.zzk(objZzh, zzigcVar, 0)) {
                                                    objZzx2 = objZzh;
                                                    for (i11 = zzifsVar2.zzk; i11 < zzifsVar2.zzl; i11++) {
                                                        zzigt zzigtVar4 = zzigtVar2;
                                                        objZzx2 = zzifsVar2.zzx(obj2, zzifsVar2.zzj[i11], objZzx2, zzigtVar4, obj2);
                                                        zzigtVar2 = zzigtVar4;
                                                    }
                                                    if (objZzx2 != null) {
                                                        zzigtVar2.zzi(obj2, objZzx2);
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                zzifsVar = zzifsVar2;
                                                th2 = th;
                                                i10 = zzifsVar.zzk;
                                                objZzx = objZzh;
                                                while (i10 < zzifsVar.zzl) {
                                                    zzigt zzigtVar5 = zzigtVar2;
                                                    objZzx = zzifsVar.zzx(obj2, zzifsVar.zzj[i10], objZzx, zzigtVar5, obj2);
                                                    i10++;
                                                    zzifsVar = this;
                                                    zzigtVar2 = zzigtVar5;
                                                }
                                                zzigtVar = zzigtVar2;
                                                if (objZzx != null) {
                                                    throw th2;
                                                }
                                                zzigtVar.zzi(obj2, objZzx);
                                                throw th2;
                                            }
                                        }
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listZza2 = zzifb.zza(obj3, iZzA & 1048575);
                                        zzigcVar.zzK(listZza2);
                                        try {
                                            objZzh = zzigi.zzJ(obj3, iZzb, listZza2, zzs(iZzP), objZzh, zzigtVar2);
                                            obj2 = obj3;
                                        } catch (zzies unused2) {
                                            obj2 = obj3;
                                            if (objZzh == null) {
                                                objZzh = zzigtVar2.zzh(obj2);
                                            }
                                            if (!zzigtVar2.zzk(objZzh, zzigcVar, 0)) {
                                                objZzx2 = objZzh;
                                                while (i11 < zzifsVar2.zzl) {
                                                    zzigt zzigtVar6 = zzigtVar2;
                                                    objZzx2 = zzifsVar2.zzx(obj2, zzifsVar2.zzj[i11], objZzx2, zzigtVar6, obj2);
                                                    zzigtVar2 = zzigtVar6;
                                                }
                                                if (objZzx2 != null) {
                                                    zzigtVar2.zzi(obj2, objZzx2);
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = obj3;
                                            th2 = th;
                                            zzifsVar = zzifsVar2;
                                            i10 = zzifsVar.zzk;
                                            objZzx = objZzh;
                                            while (i10 < zzifsVar.zzl) {
                                                zzigt zzigtVar7 = zzigtVar2;
                                                objZzx = zzifsVar.zzx(obj2, zzifsVar.zzj[i10], objZzx, zzigtVar7, obj2);
                                                i10++;
                                                zzifsVar = this;
                                                zzigtVar2 = zzigtVar7;
                                            }
                                            zzigtVar = zzigtVar2;
                                            if (objZzx != null) {
                                                throw th2;
                                            }
                                            zzigtVar.zzi(obj2, objZzx);
                                            throw th2;
                                        }
                                        obj = obj2;
                                        break;
                                    case SDK_INIT_API_VALUE:
                                        zzigcVar.zzL(zzifb.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_START_EVENT_VALUE:
                                        zzigcVar.zzM(zzifb.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_CLICK_EVENT_VALUE:
                                        zzigcVar.zzN(zzifb.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        zzigcVar.zzO(zzifb.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 49:
                                        zzigcVar.zzH(zzifb.zza(obj3, iZzA & 1048575), zzq(iZzP), zzidoVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objZzr = zzr(iZzP);
                                        long jZzA = zzA(iZzP) & 1048575;
                                        Object objZzm = zziha.zzm(obj3, jZzA);
                                        if (objZzm == null) {
                                            objZzm = zzifj.zza().zzc();
                                            zziha.zzn(obj3, jZzA, objZzm);
                                        } else if (zzifk.zza(objZzm)) {
                                            Object objZzc = zzifj.zza().zzc();
                                            zzifk.zzb(objZzc, objZzm);
                                            zziha.zzn(obj3, jZzA, objZzc);
                                            objZzm = objZzc;
                                        }
                                        zzigcVar.zzP((zzifj) objZzm, ((zzifi) objZzr).zze(), zzidoVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 51:
                                        zziha.zzn(obj3, iZzA & 1048575, Double.valueOf(zzigcVar.zze()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 52:
                                        zziha.zzn(obj3, iZzA & 1048575, Float.valueOf(zzigcVar.zzf()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        zziha.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigcVar.zzh()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 54:
                                        zziha.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigcVar.zzg()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 55:
                                        zziha.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigcVar.zzi()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_VISIBILITY_VALUE:
                                        zziha.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigcVar.zzj()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                        zziha.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigcVar.zzk()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                                        zziha.zzn(obj3, iZzA & 1048575, Boolean.valueOf(zzigcVar.zzl()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                                        zzz(obj3, iZzA, zzigcVar);
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 60:
                                        zzifp zzifpVar3 = (zzifp) zzv(obj3, iZzb, iZzP);
                                        zzigcVar.zzo(zzifpVar3, zzq(iZzP), zzidoVar);
                                        zzw(obj3, iZzb, iZzP, zzifpVar3);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                        zziha.zzn(obj3, iZzA & 1048575, zzigcVar.zzq());
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case DEPRECATED_API_USED_VALUE:
                                        zziha.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigcVar.zzr()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                        int iZzs2 = zzigcVar.zzs();
                                        zziek zziekVarZzs2 = zzs(iZzP);
                                        if (zziekVarZzs2 != null && !zziekVarZzs2.zza(iZzs2)) {
                                            objZzh = zzigi.zzK(obj3, iZzb, iZzs2, objZzh, zzigtVar2);
                                            obj = obj3;
                                        }
                                        zziha.zzn(obj3, iZzA & 1048575, Integer.valueOf(iZzs2));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        zziha.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigcVar.zzt()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 65:
                                        zziha.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigcVar.zzu()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case BLACK_SCREEN_IS_DETECTED_VALUE:
                                        zziha.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigcVar.zzv()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case NATIVE_PLAY_ASSET_TYPE_VALUE:
                                        zziha.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigcVar.zzw()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                                        zzifp zzifpVar4 = (zzifp) zzv(obj3, iZzb, iZzP);
                                        zzigcVar.zzp(zzifpVar4, zzq(iZzP), zzidoVar);
                                        zzw(obj3, iZzb, iZzP, zzifpVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objZzh == null) {
                                            try {
                                                objZzh = zzigtVar2.zzh(obj3);
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                zzifsVar = zzifsVar2;
                                                obj2 = obj3;
                                                i10 = zzifsVar.zzk;
                                                objZzx = objZzh;
                                                while (i10 < zzifsVar.zzl) {
                                                    zzigt zzigtVar8 = zzigtVar2;
                                                    objZzx = zzifsVar.zzx(obj2, zzifsVar.zzj[i10], objZzx, zzigtVar8, obj2);
                                                    i10++;
                                                    zzifsVar = this;
                                                    zzigtVar2 = zzigtVar8;
                                                }
                                                zzigtVar = zzigtVar2;
                                                if (objZzx != null) {
                                                    throw th2;
                                                }
                                                zzigtVar.zzi(obj2, objZzx);
                                                throw th2;
                                            }
                                        }
                                        if (!zzigtVar2.zzk(objZzh, zzigcVar, 0)) {
                                            objZzx2 = objZzh;
                                            for (int i12 = zzifsVar2.zzk; i12 < zzifsVar2.zzl; i12++) {
                                                zzigt zzigtVar9 = zzigtVar2;
                                                Object obj4 = obj3;
                                                objZzx2 = zzifsVar2.zzx(obj4, zzifsVar2.zzj[i12], objZzx2, zzigtVar9, obj3);
                                                obj3 = obj4;
                                                zzigtVar2 = zzigtVar9;
                                            }
                                            obj2 = obj3;
                                        }
                                        obj = obj3;
                                        break;
                                }
                            } catch (zzies unused3) {
                                obj2 = obj3;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            obj2 = obj3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzifsVar = zzifsVar2;
                        obj2 = obj3;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx2 = objZzh;
                    for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                        zzigt zzigtVar10 = zzigtVar2;
                        objZzx2 = zzx(obj, this.zzj[i13], objZzx2, zzigtVar10, obj);
                        zzigtVar2 = zzigtVar10;
                    }
                    obj2 = obj;
                } else {
                    zzifsVar = this;
                    try {
                        if ((!zzifsVar.zzh ? null : zzidoVar.zzc(zzifsVar.zzg, iZzb)) != null) {
                            obj3 = obj;
                            zzifsVar2 = zzifsVar;
                            throw null;
                        }
                        if (objZzh == null) {
                            try {
                                objZzh = zzigtVar2.zzh(obj);
                            } catch (Throwable th9) {
                                th2 = th9;
                                obj2 = obj;
                                i10 = zzifsVar.zzk;
                                objZzx = objZzh;
                                while (i10 < zzifsVar.zzl) {
                                    zzigt zzigtVar11 = zzigtVar2;
                                    objZzx = zzifsVar.zzx(obj2, zzifsVar.zzj[i10], objZzx, zzigtVar11, obj2);
                                    i10++;
                                    zzifsVar = this;
                                    zzigtVar2 = zzigtVar11;
                                }
                                zzigtVar = zzigtVar2;
                                if (objZzx != null) {
                                    throw th2;
                                }
                                zzigtVar.zzi(obj2, objZzx);
                                throw th2;
                            }
                        }
                        if (zzigtVar2.zzk(objZzh, zzigcVar, 0)) {
                            obj3 = obj;
                            obj = obj3;
                        } else {
                            int i14 = zzifsVar.zzk;
                            objZzx2 = objZzh;
                            while (i14 < zzifsVar.zzl) {
                                zzigt zzigtVar12 = zzigtVar2;
                                Object obj5 = obj;
                                objZzx2 = zzifsVar.zzx(obj5, zzifsVar.zzj[i14], objZzx2, zzigtVar12, obj);
                                zzigtVar2 = zzigtVar12;
                                i14++;
                                obj = obj5;
                            }
                            obj3 = obj;
                            obj2 = obj3;
                        }
                    } catch (Throwable th10) {
                        obj3 = obj;
                        th2 = th10;
                        obj2 = obj3;
                        i10 = zzifsVar.zzk;
                        objZzx = objZzh;
                        while (i10 < zzifsVar.zzl) {
                            zzigt zzigtVar13 = zzigtVar2;
                            objZzx = zzifsVar.zzx(obj2, zzifsVar.zzj[i10], objZzx, zzigtVar13, obj2);
                            i10++;
                            zzifsVar = this;
                            zzigtVar2 = zzigtVar13;
                        }
                        zzigtVar = zzigtVar2;
                        if (objZzx != null) {
                            throw th2;
                        }
                        zzigtVar.zzi(obj2, objZzx);
                        throw th2;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                zzifsVar = this;
                obj2 = obj;
            }
        }
        if (objZzx2 != null) {
            zzigtVar2.zzi(obj2, objZzx2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzi(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.ads.zzico r37) {
        /*
            Method dump skipped, instruction units count: 3790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzifs.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzico):int");
    }

    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zzico zzicoVar) {
        zzi(obj, bArr, i10, i11, 0, zzicoVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zziee) {
                zziee zzieeVar = (zziee) obj;
                zzieeVar.zzbq();
                zzieeVar.zzbb();
                zzieeVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzA = zzA(i10);
                int i11 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j10 = i11;
                if (iZzC != 9) {
                    if (iZzC != 60 && iZzC != 68) {
                        switch (iZzC) {
                            case 17:
                                if (zzK(obj, i10)) {
                                    zzq(i10).zzk(zzb.getObject(obj, j10));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case SDK_INIT_API_VALUE:
                            case AD_START_EVENT_VALUE:
                            case AD_CLICK_EVENT_VALUE:
                            case 48:
                            case 49:
                                ((zzieq) zziha.zzm(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzifj) object).zzd();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i10], i10)) {
                        zzq(i10).zzk(zzb.getObject(obj, j10));
                    }
                } else if (zzK(obj, i10)) {
                    zzq(i10).zzk(zzb.getObject(obj, j10));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[LOOP:2: B:52:0x00d2->B:57:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigh
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        List list;
        zzigh zzighVarZzq;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.zzk) {
            int i16 = this.zzj[i13];
            int iZzA = zzA(i16);
            int[] iArr = this.zzc;
            int i17 = iArr[i16 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i15) {
                if (i18 != 1048575) {
                    i14 = zzb.getInt(obj, i18);
                }
                i11 = i14;
                i10 = i18;
            } else {
                i10 = i15;
                i11 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & iZzA) != 0 && !zzJ(obj2, i16, i10, i11, i19)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzJ(obj2, i16, i10, i11, i19) && !zzy(obj2, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zziha.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzighVarZzq = zzq(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzighVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzM(obj2, iArr[i16], i16) && !zzy(obj2, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zziha.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzighVarZzq = zzq(i16);
                    while (i12 < list.size()) {
                        if (!zzighVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzifj zzifjVar = (zzifj) zziha.zzm(obj2, iZzA & 1048575);
                if (!zzifjVar.isEmpty() && ((zzifi) zzr(i16)).zze().zzc.zza() == zzihh.MESSAGE) {
                    zzigh zzighVarZzb = null;
                    for (Object obj3 : zzifjVar.values()) {
                        if (zzighVarZzb == null) {
                            zzighVarZzb = zzifz.zza().zzb(obj3.getClass());
                        }
                        if (!zzighVarZzb.zzl(obj3)) {
                            return false;
                        }
                    }
                }
            }
            i13++;
            obj = obj2;
            i15 = i10;
            i14 = i11;
        }
        return !this.zzh || ((zziea) obj).zza.zze();
    }
}
