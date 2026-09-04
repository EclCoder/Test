package com.google.android.gms.internal.measurement;

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
final class zzaff<T> implements zzafp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzagg.zzp();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzafc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzafz zzm;
    private final zzadg zzn;

    private zzaff(int[] iArr, Object[] objArr, int i10, int i11, zzafc zzafcVar, boolean z10, int[] iArr2, int i12, int i13, zzafh zzafhVar, zzaeo zzaeoVar, zzafz zzafzVar, zzadg zzadgVar, zzaex zzaexVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzafcVar instanceof zzadu;
        boolean z11 = false;
        if (zzadgVar != null && (zzafcVar instanceof zzadr)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzafzVar;
        this.zzn = zzadgVar;
        this.zzg = zzafcVar;
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
        if (obj instanceof zzadu) {
            return ((zzadu) obj).zzch();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static int zzG(Object obj, long j10) {
        return ((Integer) zzagg.zzm(obj, j10)).intValue();
    }

    private static long zzH(Object obj, long j10) {
        return ((Long) zzagg.zzm(obj, j10)).longValue();
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
            return (zzagg.zzc(obj, j10) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i10);
        long j11 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzagg.zzk(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzagg.zzi(obj, j11)) != 0;
            case 2:
                return zzagg.zze(obj, j11) != 0;
            case 3:
                return zzagg.zze(obj, j11) != 0;
            case 4:
                return zzagg.zzc(obj, j11) != 0;
            case 5:
                return zzagg.zze(obj, j11) != 0;
            case 6:
                return zzagg.zzc(obj, j11) != 0;
            case 7:
                return zzagg.zzg(obj, j11);
            case 8:
                Object objZzm = zzagg.zzm(obj, j11);
                if (objZzm instanceof String) {
                    return !((String) objZzm).isEmpty();
                }
                if (objZzm instanceof zzacr) {
                    return !zzacr.zza.equals(objZzm);
                }
                return zzR();
            case 9:
                return zzagg.zzm(obj, j11) != null;
            case 10:
                return !zzacr.zza.equals(zzagg.zzm(obj, j11));
            case 11:
                return zzagg.zzc(obj, j11) != 0;
            case 12:
                return zzagg.zzc(obj, j11) != 0;
            case 13:
                return zzagg.zzc(obj, j11) != 0;
            case 14:
                return zzagg.zze(obj, j11) != 0;
            case 15:
                return zzagg.zzc(obj, j11) != 0;
            case 16:
                return zzagg.zze(obj, j11) != 0;
            case 17:
                return zzagg.zzm(obj, j11) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i10) {
        int iZzB = zzB(i10);
        long j10 = 1048575 & iZzB;
        if (j10 == 1048575) {
            return;
        }
        zzagg.zzd(obj, j10, (1 << (iZzB >>> 20)) | zzagg.zzc(obj, j10));
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzagg.zzc(obj, (long) (zzB(i11) & 1048575)) == i10;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        long jZzB = zzB(i10) & 1048575;
        return zzagg.zzc(obj, jZzB) == zzagg.zzc(obj2, jZzB);
    }

    private final void zzO(Object obj, int i10, int i11) {
        zzagg.zzd(obj, zzB(i11) & 1048575, i10);
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

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final int zzS(byte[] bArr, int i10, int i11, zzagm zzagmVar, Class cls, zzacg zzacgVar) {
        zzagm zzagmVar2 = zzagm.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                zzacgVar.zzc = Double.valueOf(Double.longBitsToDouble(zzach.zze(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                zzacgVar.zzc = Float.valueOf(Float.intBitsToFloat(zzach.zzd(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iZzc = zzach.zzc(bArr, i10, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacgVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzach.zza(bArr, i10, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacgVar.zza);
                return iZza;
            case 5:
            case 15:
                int i14 = i10 + 8;
                zzacgVar.zzc = Long.valueOf(zzach.zze(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                zzacgVar.zzc = Integer.valueOf(zzach.zzd(bArr, i10));
                return i15;
            case 7:
                int iZzc2 = zzach.zzc(bArr, i10, zzacgVar);
                zzacgVar.zzc = Boolean.valueOf(zzacgVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzach.zzf(bArr, i10, zzacgVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzach.zzh(zzafl.zza().zzb(cls), bArr, i10, i11, zzacgVar);
            case 11:
                return zzach.zzg(bArr, i10, zzacgVar);
            case 16:
                int iZza2 = zzach.zza(bArr, i10, zzacgVar);
                zzacgVar.zzc = Integer.valueOf(zzacv.zzR(zzacgVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzach.zzc(bArr, i10, zzacgVar);
                zzacgVar.zzc = Long.valueOf(zzacv.zzS(zzacgVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzT(int i10, Object obj, zzago zzagoVar) {
        if (obj instanceof String) {
            zzagoVar.zzm(i10, (String) obj);
        } else {
            zzagoVar.zzn(i10, (zzacr) obj);
        }
    }

    static zzaga zzh(Object obj) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != zzaga.zza()) {
            return zzagaVar;
        }
        zzaga zzagaVarZzb = zzaga.zzb();
        zzaduVar.zzc = zzagaVarZzb;
        return zzagaVarZzb;
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
    static zzaff zzm(Class cls, zzaez zzaezVar, zzafh zzafhVar, zzaeo zzaeoVar, zzafz zzafzVar, zzadg zzadgVar, zzaex zzaexVar) {
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
        if (!(zzaezVar instanceof zzafn)) {
            throw null;
        }
        zzafn zzafnVar = (zzafn) zzaezVar;
        String strZzd = zzafnVar.zzd();
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
        Object[] objArrZze = zzafnVar.zze();
        Class<?> cls2 = zzafnVar.zzb().getClass();
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
            zzafn zzafnVar2 = zzafnVar;
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
                    } else if (zzafnVar2.zzc() == 1 || i92 != 0) {
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
                            if (zzafnVar2.zzc() == 1 || i92 != 0) {
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
                        zzafnVar = zzafnVar2;
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
                    zzafnVar = zzafnVar2;
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
                zzafnVar = zzafnVar2;
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
            zzafnVar = zzafnVar2;
            i50 = i30;
            length = i27;
            i11 = i28;
        }
        return new zzaff(iArr3, objArr, i14, i12, zzafnVar.zzb(), false, iArr, i16, i77, zzafhVar, zzaeoVar, zzafzVar, zzadgVar, zzaexVar);
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
            zzafp zzafpVarZzq = zzq(i10);
            if (!zzK(obj, i10)) {
                if (zzE(object)) {
                    Object objZza = zzafpVarZzq.zza();
                    zzafpVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzL(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzafpVarZzq.zza();
                zzafpVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzafpVarZzq.zzd(object2, object);
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
            zzafp zzafpVarZzq = zzq(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzE(object)) {
                    Object objZza = zzafpVarZzq.zza();
                    zzafpVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzO(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzE(object2)) {
                Object objZza2 = zzafpVarZzq.zza();
                zzafpVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzafpVarZzq.zzd(object2, object);
        }
    }

    private final zzafp zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzafp zzafpVar = (zzafp) objArr[i12];
        if (zzafpVar != null) {
            return zzafpVar;
        }
        zzafp zzafpVarZzb = zzafl.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzafpVarZzb;
        return zzafpVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzadz zzs(int i10) {
        int i11 = i10 / 3;
        return (zzadz) this.zzd[i11 + i11 + 1];
    }

    private final Object zzt(Object obj, int i10) {
        zzafp zzafpVarZzq = zzq(i10);
        int iZzA = zzA(i10) & 1048575;
        if (!zzK(obj, i10)) {
            return zzafpVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzafpVarZzq.zza();
        if (object != null) {
            zzafpVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzA(i10) & 1048575, obj2);
        zzL(obj, i10);
    }

    private final Object zzv(Object obj, int i10, int i11) {
        zzafp zzafpVarZzq = zzq(i11);
        if (!zzM(obj, i10, i11)) {
            return zzafpVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i11) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzafpVarZzq.zza();
        if (object != null) {
            zzafpVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzA(i11) & 1048575, obj2);
        zzO(obj, i10, i11);
    }

    private final Object zzx(Object obj, int i10, Object obj2, zzafz zzafzVar, Object obj3) {
        zzadz zzadzVarZzs;
        int i11 = this.zzc[i10];
        Object objZzm = zzagg.zzm(obj, zzA(i10) & 1048575);
        if (objZzm == null || (zzadzVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzaeu zzaeuVarZze = ((zzaev) zzr(i10)).zze();
        Iterator it = ((zzaew) objZzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzadzVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzafzVar.zzh(obj3);
                }
                int iZzc = zzaev.zzc(zzaeuVarZze, entry.getKey(), entry.getValue());
                zzacr zzacrVar = zzacr.zza;
                byte[] bArr = new byte[iZzc];
                int i12 = zzada.zzb;
                zzacx zzacxVar = new zzacx(bArr, 0, iZzc);
                try {
                    zzaev.zzb(zzacxVar, zzaeuVarZze, entry.getKey(), entry.getValue());
                    zzafzVar.zzd(obj2, i11, zzaco.zza(zzacxVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i10, zzafp zzafpVar) {
        return zzafpVar.zzl(zzagg.zzm(obj, i10 & 1048575));
    }

    private final void zzz(Object obj, int i10, zzafo zzafoVar) {
        long j10 = i10 & 1048575;
        if (zzD(i10)) {
            zzagg.zzn(obj, j10, zzafoVar.zzn());
        } else if (this.zzi) {
            zzagg.zzn(obj, j10, zzafoVar.zzm());
        } else {
            zzagg.zzn(obj, j10, zzafoVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final Object zza() {
        return ((zzadu) this.zzg).zzck();
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzC;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzA = zzA(i10);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j10 = iZzA & 1048575;
                switch (iZzC) {
                    case 0:
                        if (!zzI(obj, obj2, i10) || Double.doubleToLongBits(zzagg.zzk(obj, j10)) != Double.doubleToLongBits(zzagg.zzk(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzI(obj, obj2, i10) || Float.floatToIntBits(zzagg.zzi(obj, j10)) != Float.floatToIntBits(zzagg.zzi(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzI(obj, obj2, i10) || zzagg.zzg(obj, j10) != zzagg.zzg(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzI(obj, obj2, i10) || zzagg.zzc(obj, j10) != zzagg.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzI(obj, obj2, i10) || zzagg.zze(obj, j10) != zzagg.zze(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzI(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
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
                        zZzC = zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10));
                        break;
                    case 50:
                        zZzC = zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10));
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
                        if (!zzN(obj, obj2, i10) || !zzafq.zzC(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzC) {
                    return false;
                }
            }
        }
        int i11 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i11 >= iArr.length) {
                if (!((zzadu) obj).zzc.equals(((zzadu) obj2).zzc)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzadr) obj).zzb.equals(((zzadr) obj2).zzb);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!zzN(obj, obj2, i12)) {
                return false;
            }
            if (!zzM(obj, 0, i12)) {
                long jZzA = zzA(i12) & 1048575;
                if (!zzafq.zzC(zzagg.zzm(obj, jZzA), zzagg.zzm(obj2, jZzA))) {
                    return false;
                }
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
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
                        jDoubleToLongBits = Double.doubleToLongBits(zzagg.zzk(obj, j10));
                        byte[] bArr = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzagg.zzi(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr2 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr3 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr4 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzaed.zza(zzagg.zzg(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzagg.zzm(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzm = zzagg.zzm(obj, j10);
                        if (objZzm != null) {
                            iHashCode2 = objZzm.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr5 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzagg.zze(obj, j10);
                        byte[] bArr6 = zzaed.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzm2 = zzagg.zzm(obj, j10);
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
                        iFloatToIntBits = zzagg.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzagg.zzm(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((zzadu) obj).zzc.hashCode();
                return this.zzh ? (iHashCode3 * 53) + ((zzadr) obj).zzb.zza.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!zzM(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + zzagg.zzm(obj, zzA(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzafq.zzE(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzafq.zzD(this.zzn, obj, obj2);
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
                        zzagg.zzl(obj, j10, zzagg.zzk(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 1:
                    if (zzK(obj2, i10)) {
                        zzagg.zzj(obj, j10, zzagg.zzi(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 2:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 3:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 4:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 5:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 6:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 7:
                    if (zzK(obj2, i10)) {
                        zzagg.zzh(obj, j10, zzagg.zzg(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 8:
                    if (zzK(obj2, i10)) {
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i10);
                    break;
                case 10:
                    if (zzK(obj2, i10)) {
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 11:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 12:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 13:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 14:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 15:
                    if (zzK(obj2, i10)) {
                        zzagg.zzd(obj, j10, zzagg.zzc(obj2, j10));
                        zzL(obj, i10);
                    }
                    break;
                case 16:
                    if (zzK(obj2, i10)) {
                        zzagg.zzf(obj, j10, zzagg.zze(obj2, j10));
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
                    zzaef zzaefVarZzg = (zzaef) zzagg.zzm(obj, j10);
                    zzaef zzaefVar = (zzaef) zzagg.zzm(obj2, j10);
                    int size = zzaefVarZzg.size();
                    int size2 = zzaefVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzaefVarZzg.zza()) {
                            zzaefVarZzg = zzaefVarZzg.zzg(size2 + size);
                        }
                        zzaefVarZzg.addAll(zzaefVar);
                    }
                    if (size > 0) {
                        zzaefVar = zzaefVarZzg;
                    }
                    zzagg.zzn(obj, j10, zzaefVar);
                    break;
                case 50:
                    int i13 = zzafq.zza;
                    zzagg.zzn(obj, j10, zzaex.zzb(zzagg.zzm(obj, j10), zzagg.zzm(obj2, j10)));
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
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
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
                        zzagg.zzn(obj, j10, zzagg.zzm(obj2, j10));
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
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final int zze(Object obj) {
        int i10;
        int iZzE;
        int iZzE2;
        int iZzF;
        int iZzE3;
        int iZzE4;
        int iZzE5;
        int iZzb;
        int iZzE6;
        int iZzz;
        int iZzo;
        int size;
        int iZzp;
        int iZzE7;
        int iZzb2;
        int iZzE8;
        int iZzb3;
        int iZzE9;
        int iZzE10;
        int iZzcf;
        int iZzE11;
        int iZzE12;
        int iZzF2;
        int iZzx;
        int iZzE13;
        int iZzE14;
        int iZzA;
        int iZzE15;
        int iZzE16;
        int iZzE17;
        int iZzb4;
        int iZzE18;
        zzaff<T> zzaffVar = this;
        Unsafe unsafe = zzb;
        int i11 = 0;
        int i12 = 0;
        int iZzE19 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = zzaffVar.zzc;
            if (i11 >= iArr.length) {
                int iZzi = iZzE19 + ((zzadu) obj).zzc.zzi();
                if (!zzaffVar.zzh) {
                    return iZzi;
                }
                zzafv zzafvVar = ((zzadr) obj).zzb.zza;
                int iZzc = zzafvVar.zzc();
                int iZzj = 0;
                for (int i14 = 0; i14 < iZzc; i14++) {
                    Map.Entry entryZzd = zzafvVar.zzd(i14);
                    iZzj += zzadk.zzj((zzadj) ((zzafs) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzafvVar.zze()) {
                    iZzj += zzadk.zzj((zzadj) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA2 = zzaffVar.zzA(i11);
            int iZzC = zzC(iZzA2);
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
            int i18 = iZzA2 & 1048575;
            if (iZzC >= zzadl.zzJ.zza()) {
                zzadl.zzW.zza();
            }
            long j10 = i18;
            switch (iZzC) {
                case 0:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzE19 += zzada.zzE(i15 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzE = zzada.zzE(i15 << 3);
                        iZzE4 = iZzE + 4;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 2:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzE2 = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j11);
                        iZzE4 = iZzE2 + iZzF;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 3:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzE2 = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j12);
                        iZzE4 = iZzE2 + iZzF;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 4:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzE2 = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j13);
                        iZzE4 = iZzE2 + iZzF;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 5:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = iZzE3 + 8;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 6:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzE = zzada.zzE(i15 << 3);
                        iZzE4 = iZzE + 4;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 7:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzE4 = zzada.zzE(i15 << 3) + 1;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 8:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzacr) {
                            iZzE5 = zzada.zzE(i19);
                            iZzb = ((zzacr) object).zzb();
                            iZzE6 = zzada.zzE(iZzb);
                        } else {
                            iZzE5 = zzada.zzE(i19);
                            iZzb = zzagl.zzb((String) object);
                            iZzE6 = zzada.zzE(iZzb);
                        }
                        iZzE4 = iZzE5 + iZzE6 + iZzb;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 9:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzz = zzafq.zzz(i15, unsafe.getObject(obj, j10), zzaffVar.zzq(i11));
                        iZzE19 += iZzz;
                    }
                    break;
                case 10:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        zzacr zzacrVar = (zzacr) unsafe.getObject(obj, j10);
                        iZzE5 = zzada.zzE(i15 << 3);
                        iZzb = zzacrVar.zzb();
                        iZzE6 = zzada.zzE(iZzb);
                        iZzE4 = iZzE5 + iZzE6 + iZzb;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 11:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        int i20 = unsafe.getInt(obj, j10);
                        iZzE2 = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzE(i20);
                        iZzE4 = iZzE2 + iZzF;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 12:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzE2 = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF(j14);
                        iZzE4 = iZzE2 + iZzF;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 13:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzE = zzada.zzE(i15 << 3);
                        iZzE4 = iZzE + 4;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 14:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzE3 = zzada.zzE(i15 << 3);
                        iZzE4 = iZzE3 + 8;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 15:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzE2 = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzE((i21 >> 31) ^ (i21 + i21));
                        iZzE4 = iZzE2 + iZzF;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 16:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzE2 = zzada.zzE(i15 << 3);
                        iZzF = zzada.zzF((j15 >> 63) ^ (j15 + j15));
                        iZzE4 = iZzE2 + iZzF;
                        iZzE19 += iZzE4;
                    }
                    zzaffVar = this;
                    break;
                case 17:
                    if (zzaffVar.zzJ(obj, i11, i13, i12, i10)) {
                        iZzz = zzafq.zzA(i15, (zzafc) unsafe.getObject(obj, j10), zzaffVar.zzq(i11));
                        iZzE19 += iZzz;
                    }
                    break;
                case 18:
                    iZzz = zzafq.zzy(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzE19 += iZzz;
                    break;
                case 19:
                    iZzz = zzafq.zzw(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzE19 += iZzz;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i22 = zzafq.zza;
                    if (list.size() == 0) {
                        iZzo = 0;
                    } else {
                        iZzo = zzafq.zzo(list) + (list.size() * zzada.zzE(i15 << 3));
                    }
                    iZzE19 += iZzo;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i23 = zzafq.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zzafq.zzp(list2);
                        iZzE7 = zzada.zzE(i15 << 3);
                        iZzF2 = size * iZzE7;
                        iZzz = iZzp + iZzF2;
                    }
                    iZzE19 += iZzz;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzafq.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zzafq.zzs(list3);
                        iZzE7 = zzada.zzE(i15 << 3);
                        iZzF2 = size * iZzE7;
                        iZzz = iZzp + iZzF2;
                    }
                    iZzE19 += iZzz;
                    break;
                case 23:
                    iZzz = zzafq.zzy(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzE19 += iZzz;
                    break;
                case 24:
                    iZzz = zzafq.zzw(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzE19 += iZzz;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzafq.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzz = 0;
                    } else {
                        iZzz = size2 * (zzada.zzE(i15 << 3) + 1);
                    }
                    iZzE19 += iZzz;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzafq.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzo = 0;
                    } else {
                        iZzo = zzada.zzE(i15 << 3) * size3;
                        if (list5 instanceof zzaen) {
                            zzaen zzaenVar = (zzaen) list5;
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object objZzc = zzaenVar.zzc();
                                if (objZzc instanceof zzacr) {
                                    iZzb3 = ((zzacr) objZzc).zzb();
                                    iZzE9 = zzada.zzE(iZzb3);
                                } else {
                                    iZzb3 = zzagl.zzb((String) objZzc);
                                    iZzE9 = zzada.zzE(iZzb3);
                                }
                                iZzo += iZzE9 + iZzb3;
                            }
                        } else {
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj2 = list5.get(i28);
                                if (obj2 instanceof zzacr) {
                                    iZzb2 = ((zzacr) obj2).zzb();
                                    iZzE8 = zzada.zzE(iZzb2);
                                } else {
                                    iZzb2 = zzagl.zzb((String) obj2);
                                    iZzE8 = zzada.zzE(iZzb2);
                                }
                                iZzo += iZzE8 + iZzb2;
                            }
                        }
                    }
                    iZzE19 += iZzo;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq = zzaffVar.zzq(i11);
                    int i29 = zzafq.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzE10 = 0;
                    } else {
                        iZzE10 = zzada.zzE(i15 << 3) * size4;
                        for (int i30 = 0; i30 < size4; i30++) {
                            Object obj3 = list6.get(i30);
                            if (obj3 instanceof zzaem) {
                                iZzcf = ((zzaem) obj3).zzb();
                                iZzE11 = zzada.zzE(iZzcf);
                            } else {
                                iZzcf = ((zzacb) obj3).zzcf(zzafpVarZzq);
                                iZzE11 = zzada.zzE(iZzcf);
                            }
                            iZzE10 += iZzE11 + iZzcf;
                        }
                    }
                    iZzE19 += iZzE10;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzafq.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzE12 = 0;
                    } else {
                        iZzE12 = size5 * zzada.zzE(i15 << 3);
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzb5 = ((zzacr) list7.get(i32)).zzb();
                            iZzE12 += zzada.zzE(iZzb5) + iZzb5;
                        }
                    }
                    iZzE19 += iZzE12;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzafq.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zzafq.zzt(list8);
                        iZzE7 = zzada.zzE(i15 << 3);
                        iZzF2 = size * iZzE7;
                        iZzz = iZzp + iZzF2;
                    }
                    iZzE19 += iZzz;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzafq.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zzafq.zzr(list9);
                        iZzE7 = zzada.zzE(i15 << 3);
                        iZzF2 = size * iZzE7;
                        iZzz = iZzp + iZzF2;
                    }
                    iZzE19 += iZzz;
                    break;
                case 31:
                    iZzz = zzafq.zzw(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzE19 += iZzz;
                    break;
                case 32:
                    iZzz = zzafq.zzy(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzE19 += iZzz;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i35 = zzafq.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zzafq.zzu(list10);
                        iZzE7 = zzada.zzE(i15 << 3);
                        iZzF2 = size * iZzE7;
                        iZzz = iZzp + iZzF2;
                    }
                    iZzE19 += iZzz;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i36 = zzafq.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzz = 0;
                    } else {
                        iZzp = zzafq.zzq(list11);
                        iZzE7 = zzada.zzE(i15 << 3);
                        iZzF2 = size * iZzE7;
                        iZzz = iZzp + iZzF2;
                    }
                    iZzE19 += iZzz;
                    break;
                case 35:
                    iZzx = zzafq.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 36:
                    iZzx = zzafq.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 37:
                    iZzx = zzafq.zzo((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 38:
                    iZzx = zzafq.zzp((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 39:
                    iZzx = zzafq.zzs((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 40:
                    iZzx = zzafq.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 41:
                    iZzx = zzafq.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzafq.zza;
                    iZzx = list12.size();
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 43:
                    iZzx = zzafq.zzt((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 44:
                    iZzx = zzafq.zzr((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case SDK_INIT_API_VALUE:
                    iZzx = zzafq.zzv((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case AD_START_EVENT_VALUE:
                    iZzx = zzafq.zzx((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case AD_CLICK_EVENT_VALUE:
                    iZzx = zzafq.zzu((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 48:
                    iZzx = zzafq.zzq((List) unsafe.getObject(obj, j10));
                    if (iZzx > 0) {
                        iZzE13 = zzada.zzE(i15 << 3);
                        iZzE14 = zzada.zzE(iZzx);
                        iZzE12 = iZzE13 + iZzE14 + iZzx;
                        iZzE19 += iZzE12;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq2 = zzaffVar.zzq(i11);
                    int i38 = zzafq.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzA = 0;
                    } else {
                        iZzA = 0;
                        for (int i39 = 0; i39 < size6; i39++) {
                            iZzA += zzafq.zzA(i15, (zzafc) list13.get(i39), zzafpVarZzq2);
                        }
                    }
                    iZzE19 += iZzA;
                    break;
                case 50:
                    zzaew zzaewVar = (zzaew) unsafe.getObject(obj, j10);
                    zzaev zzaevVar = (zzaev) zzaffVar.zzr(i11);
                    if (zzaewVar.isEmpty()) {
                        iZzo = 0;
                    } else {
                        iZzo = 0;
                        for (Map.Entry entry2 : zzaewVar.entrySet()) {
                            iZzo += zzaevVar.zzd(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzE19 += iZzo;
                    break;
                case 51:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzE15 = zzada.zzE(i15 << 3);
                        iZzz = iZzE15 + 8;
                        iZzE19 += iZzz;
                    }
                    break;
                case 52:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzE16 = zzada.zzE(i15 << 3);
                        iZzz = iZzE16 + 4;
                        iZzE19 += iZzz;
                    }
                    break;
                case 53:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzH = zzH(obj, j10);
                        iZzp = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzH);
                        iZzz = iZzp + iZzF2;
                        iZzE19 += iZzz;
                    }
                    break;
                case 54:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzH2 = zzH(obj, j10);
                        iZzp = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzH2);
                        iZzz = iZzp + iZzF2;
                        iZzE19 += iZzz;
                    }
                    break;
                case 55:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzG = zzG(obj, j10);
                        iZzp = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzG);
                        iZzz = iZzp + iZzF2;
                        iZzE19 += iZzz;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzE15 = zzada.zzE(i15 << 3);
                        iZzz = iZzE15 + 8;
                        iZzE19 += iZzz;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzE16 = zzada.zzE(i15 << 3);
                        iZzz = iZzE16 + 4;
                        iZzE19 += iZzz;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzz = zzada.zzE(i15 << 3) + 1;
                        iZzE19 += iZzz;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        int i40 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzacr) {
                            iZzE17 = zzada.zzE(i40);
                            iZzb4 = ((zzacr) object2).zzb();
                            iZzE18 = zzada.zzE(iZzb4);
                        } else {
                            iZzE17 = zzada.zzE(i40);
                            iZzb4 = zzagl.zzb((String) object2);
                            iZzE18 = zzada.zzE(iZzb4);
                        }
                        iZzz = iZzE17 + iZzE18 + iZzb4;
                        iZzE19 += iZzz;
                    }
                    break;
                case 60:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzz = zzafq.zzz(i15, unsafe.getObject(obj, j10), zzaffVar.zzq(i11));
                        iZzE19 += iZzz;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        zzacr zzacrVar2 = (zzacr) unsafe.getObject(obj, j10);
                        iZzE17 = zzada.zzE(i15 << 3);
                        iZzb4 = zzacrVar2.zzb();
                        iZzE18 = zzada.zzE(iZzb4);
                        iZzz = iZzE17 + iZzE18 + iZzb4;
                        iZzE19 += iZzz;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        int iZzG = zzG(obj, j10);
                        iZzp = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzE(iZzG);
                        iZzz = iZzp + iZzF2;
                        iZzE19 += iZzz;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzG2 = zzG(obj, j10);
                        iZzp = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF(jZzG2);
                        iZzz = iZzp + iZzF2;
                        iZzE19 += iZzz;
                    }
                    break;
                case 64:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzE16 = zzada.zzE(i15 << 3);
                        iZzz = iZzE16 + 4;
                        iZzE19 += iZzz;
                    }
                    break;
                case 65:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzE15 = zzada.zzE(i15 << 3);
                        iZzz = iZzE15 + 8;
                        iZzE19 += iZzz;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        int iZzG2 = zzG(obj, j10);
                        iZzp = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzE((iZzG2 >> 31) ^ (iZzG2 + iZzG2));
                        iZzz = iZzp + iZzF2;
                        iZzE19 += iZzz;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        long jZzH3 = zzH(obj, j10);
                        iZzp = zzada.zzE(i15 << 3);
                        iZzF2 = zzada.zzF((jZzH3 >> 63) ^ (jZzH3 + jZzH3));
                        iZzz = iZzp + iZzF2;
                        iZzE19 += iZzz;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i11)) {
                        iZzz = zzafq.zzA(i15, (zzafc) unsafe.getObject(obj, j10), zzaffVar.zzq(i11));
                        iZzE19 += iZzz;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzf(Object obj, zzago zzagoVar) {
        Map.Entry entry;
        int i10;
        zzaff<T> zzaffVar = this;
        if (zzaffVar.zzh) {
            zzadk zzadkVar = ((zzadr) obj).zzb;
            if (zzadkVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzadkVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzaffVar.zzc;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iZzA = zzaffVar.zzA(i13);
            int iZzC = zzC(iZzA);
            int i15 = iArr[i13];
            if (iZzC <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j10 = iZzA & i11;
            switch (iZzC) {
                case 0:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzf(i15, zzagg.zzk(obj, j10));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 1:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zze(i15, zzagg.zzi(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 2:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzc(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 3:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzh(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 4:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzi(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 5:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzj(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 6:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzk(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 7:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzl(i15, zzagg.zzg(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 8:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzagoVar);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 9:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzr(i15, unsafe.getObject(obj, j10), zzaffVar.zzq(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 10:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzn(i15, (zzacr) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 11:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzo(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 12:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzg(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 13:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzb(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 14:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzd(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 15:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzp(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 16:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzq(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 17:
                    if (zzaffVar.zzJ(obj, i13, i12, i14, i10)) {
                        zzagoVar.zzs(i15, unsafe.getObject(obj, j10), zzaffVar.zzq(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 18:
                    zzafq.zza(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 19:
                    zzafq.zzb(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 20:
                    zzafq.zzc(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 21:
                    zzafq.zzd(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 22:
                    zzafq.zzh(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 23:
                    zzafq.zzf(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 24:
                    zzafq.zzk(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 25:
                    zzafq.zzn(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 26:
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i19 = zzafq.zza;
                    if (list != null && !list.isEmpty()) {
                        zzagoVar.zzF(i18, list);
                    }
                    break;
                case 27:
                    int i20 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq = zzaffVar.zzq(i13);
                    int i21 = zzafq.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((zzadb) zzagoVar).zzr(i20, list2.get(i22), zzafpVarZzq);
                        }
                    }
                    break;
                case 28:
                    int i23 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzafq.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzagoVar.zzG(i23, list3);
                    }
                    break;
                case 29:
                    zzafq.zzi(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 30:
                    zzafq.zzm(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 31:
                    zzafq.zzl(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 32:
                    zzafq.zzg(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 33:
                    zzafq.zzj(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 34:
                    zzafq.zze(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzaffVar = this;
                    break;
                case 35:
                    zzafq.zza(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 36:
                    zzafq.zzb(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 37:
                    zzafq.zzc(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 38:
                    zzafq.zzd(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 39:
                    zzafq.zzh(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 40:
                    zzafq.zzf(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 41:
                    zzafq.zzk(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 42:
                    zzafq.zzn(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 43:
                    zzafq.zzi(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 44:
                    zzafq.zzm(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case SDK_INIT_API_VALUE:
                    zzafq.zzl(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case AD_START_EVENT_VALUE:
                    zzafq.zzg(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    zzafq.zzj(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 48:
                    zzafq.zze(iArr[i13], (List) unsafe.getObject(obj, j10), zzagoVar, true);
                    break;
                case 49:
                    int i25 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzafp zzafpVarZzq2 = zzaffVar.zzq(i13);
                    int i26 = zzafq.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            ((zzadb) zzagoVar).zzs(i25, list4.get(i27), zzafpVarZzq2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zzagoVar.zzM(i15, ((zzaev) zzaffVar.zzr(i13)).zze(), (zzaew) object);
                    }
                    break;
                case 51:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzf(i15, ((Double) zzagg.zzm(obj, j10)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zze(i15, ((Float) zzagg.zzm(obj, j10)).floatValue());
                    }
                    break;
                case 53:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzc(i15, zzH(obj, j10));
                    }
                    break;
                case 54:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzh(i15, zzH(obj, j10));
                    }
                    break;
                case 55:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzi(i15, zzG(obj, j10));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzj(i15, zzH(obj, j10));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzk(i15, zzG(obj, j10));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzl(i15, ((Boolean) zzagg.zzm(obj, j10)).booleanValue());
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzT(i15, unsafe.getObject(obj, j10), zzagoVar);
                    }
                    break;
                case 60:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzr(i15, unsafe.getObject(obj, j10), zzaffVar.zzq(i13));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzn(i15, (zzacr) unsafe.getObject(obj, j10));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzo(i15, zzG(obj, j10));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzg(i15, zzG(obj, j10));
                    }
                    break;
                case 64:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzb(i15, zzG(obj, j10));
                    }
                    break;
                case 65:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzd(i15, zzH(obj, j10));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzp(i15, zzG(obj, j10));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzq(i15, zzH(obj, j10));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzaffVar.zzM(obj, i15, i13)) {
                        zzagoVar.zzs(i15, unsafe.getObject(obj, j10), zzaffVar.zzq(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            zzaffVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzadu) obj).zzc.zzg(zzagoVar);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0579 A[LOOP:1: B:173:0x0575->B:175:0x0579, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x058b  */
    /* JADX WARN: Code duplicated, block: B:180:0x058f  */
    /* JADX WARN: Code duplicated, block: B:191:0x05a5 A[LOOP:2: B:189:0x05a1->B:191:0x05a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:203:0x0562 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzg(Object obj, zzafo zzafoVar, zzadf zzadfVar) throws Throwable {
        zzaff<T> zzaffVar;
        Object obj2;
        Throwable th2;
        int i10;
        Object objZzx;
        zzafz zzafzVar;
        Object objZzx2;
        Object obj3;
        zzaff<T> zzaffVar2;
        int i11;
        zzadfVar.getClass();
        zzF(obj);
        zzafz zzafzVar2 = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzafoVar.zzb();
                int iZzP = zzP(iZzb);
                if (iZzP >= 0) {
                    obj3 = obj;
                    zzaffVar2 = this;
                    try {
                        int iZzA = zzA(iZzP);
                        try {
                            try {
                                switch (zzC(iZzA)) {
                                    case 0:
                                        obj2 = obj3;
                                        zzagg.zzl(obj2, iZzA & 1048575, zzafoVar.zze());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        zzagg.zzj(obj2, iZzA & 1048575, zzafoVar.zzf());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzh());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzg());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzi());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzj());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzk());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        zzagg.zzh(obj2, iZzA & 1048575, zzafoVar.zzl());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        zzz(obj2, iZzA, zzafoVar);
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        zzafc zzafcVar = (zzafc) zzt(obj2, iZzP);
                                        zzafoVar.zzo(zzafcVar, zzq(iZzP), zzadfVar);
                                        zzu(obj2, iZzP, zzafcVar);
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        zzagg.zzn(obj2, iZzA & 1048575, zzafoVar.zzq());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzr());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZzs = zzafoVar.zzs();
                                        zzadz zzadzVarZzs = zzs(iZzP);
                                        if (zzadzVarZzs == null || zzadzVarZzs.zza(iZzs)) {
                                            zzagg.zzd(obj2, iZzA & 1048575, iZzs);
                                            zzL(obj2, iZzP);
                                        } else {
                                            objZzh = zzafq.zzG(obj2, iZzb, iZzs, objZzh, zzafzVar2);
                                        }
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzt());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzu());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        zzagg.zzd(obj2, iZzA & 1048575, zzafoVar.zzv());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        zzagg.zzf(obj2, iZzA & 1048575, zzafoVar.zzw());
                                        zzL(obj2, iZzP);
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        zzafc zzafcVar2 = (zzafc) zzt(obj2, iZzP);
                                        zzafoVar.zzp(zzafcVar2, zzq(iZzP), zzadfVar);
                                        zzu(obj2, iZzP, zzafcVar2);
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        zzafoVar.zzx(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        zzafoVar.zzy(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        zzafoVar.zzA(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 21:
                                        obj2 = obj3;
                                        zzafoVar.zzz(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        zzafoVar.zzB(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        zzafoVar.zzC(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        zzafoVar.zzD(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 25:
                                        obj2 = obj3;
                                        zzafoVar.zzE(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        if (zzD(iZzA)) {
                                            ((zzacw) zzafoVar).zzF(zzaeo.zza(obj2, iZzA & 1048575), true);
                                        } else {
                                            ((zzacw) zzafoVar).zzF(zzaeo.zza(obj2, iZzA & 1048575), false);
                                        }
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        zzafoVar.zzG(zzaeo.zza(obj2, iZzA & 1048575), zzq(iZzP), zzadfVar);
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        zzafoVar.zzI(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        zzafoVar.zzJ(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 30:
                                        List listZza = zzaeo.zza(obj3, iZzA & 1048575);
                                        zzafoVar.zzK(listZza);
                                        objZzh = zzafq.zzF(obj3, iZzb, listZza, zzs(iZzP), objZzh, zzafzVar2);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        zzafoVar.zzL(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        zzafoVar.zzM(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        zzafoVar.zzN(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        zzafoVar.zzO(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        zzafoVar.zzx(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        zzafoVar.zzy(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        zzafoVar.zzA(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 38:
                                        obj2 = obj3;
                                        zzafoVar.zzz(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        zzafoVar.zzB(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        zzafoVar.zzC(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        zzafoVar.zzD(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 42:
                                        obj2 = obj3;
                                        zzafoVar.zzE(zzaeo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            zzafoVar.zzJ(zzaeo.zza(obj2, iZzA & 1048575));
                                            break;
                                        } catch (zzaeg unused) {
                                            if (objZzh == null) {
                                                try {
                                                    objZzh = zzafzVar2.zzh(obj2);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th2 = th;
                                                    zzaffVar = zzaffVar2;
                                                    i10 = zzaffVar.zzk;
                                                    objZzx = objZzh;
                                                    while (i10 < zzaffVar.zzl) {
                                                        zzafz zzafzVar3 = zzafzVar2;
                                                        objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i10], objZzx, zzafzVar3, obj2);
                                                        i10++;
                                                        zzaffVar = this;
                                                        zzafzVar2 = zzafzVar3;
                                                    }
                                                    zzafzVar = zzafzVar2;
                                                    if (objZzx != null) {
                                                        throw th2;
                                                    }
                                                    zzafzVar.zzi(obj2, objZzx);
                                                    throw th2;
                                                }
                                            }
                                            try {
                                                if (!zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                                                    objZzx2 = objZzh;
                                                    for (i11 = zzaffVar2.zzk; i11 < zzaffVar2.zzl; i11++) {
                                                        zzafz zzafzVar4 = zzafzVar2;
                                                        objZzx2 = zzaffVar2.zzx(obj2, zzaffVar2.zzj[i11], objZzx2, zzafzVar4, obj2);
                                                        zzafzVar2 = zzafzVar4;
                                                    }
                                                    if (objZzx2 != null) {
                                                        zzafzVar2.zzi(obj2, objZzx2);
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                zzaffVar = zzaffVar2;
                                                th2 = th;
                                                i10 = zzaffVar.zzk;
                                                objZzx = objZzh;
                                                while (i10 < zzaffVar.zzl) {
                                                    zzafz zzafzVar5 = zzafzVar2;
                                                    objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i10], objZzx, zzafzVar5, obj2);
                                                    i10++;
                                                    zzaffVar = this;
                                                    zzafzVar2 = zzafzVar5;
                                                }
                                                zzafzVar = zzafzVar2;
                                                if (objZzx != null) {
                                                    throw th2;
                                                }
                                                zzafzVar.zzi(obj2, objZzx);
                                                throw th2;
                                            }
                                        }
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listZza2 = zzaeo.zza(obj3, iZzA & 1048575);
                                        zzafoVar.zzK(listZza2);
                                        try {
                                            objZzh = zzafq.zzF(obj3, iZzb, listZza2, zzs(iZzP), objZzh, zzafzVar2);
                                            obj2 = obj3;
                                        } catch (zzaeg unused2) {
                                            obj2 = obj3;
                                            if (objZzh == null) {
                                                objZzh = zzafzVar2.zzh(obj2);
                                            }
                                            if (!zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                                                objZzx2 = objZzh;
                                                while (i11 < zzaffVar2.zzl) {
                                                    zzafz zzafzVar6 = zzafzVar2;
                                                    objZzx2 = zzaffVar2.zzx(obj2, zzaffVar2.zzj[i11], objZzx2, zzafzVar6, obj2);
                                                    zzafzVar2 = zzafzVar6;
                                                }
                                                if (objZzx2 != null) {
                                                    zzafzVar2.zzi(obj2, objZzx2);
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = obj3;
                                            th2 = th;
                                            zzaffVar = zzaffVar2;
                                            i10 = zzaffVar.zzk;
                                            objZzx = objZzh;
                                            while (i10 < zzaffVar.zzl) {
                                                zzafz zzafzVar7 = zzafzVar2;
                                                objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i10], objZzx, zzafzVar7, obj2);
                                                i10++;
                                                zzaffVar = this;
                                                zzafzVar2 = zzafzVar7;
                                            }
                                            zzafzVar = zzafzVar2;
                                            if (objZzx != null) {
                                                throw th2;
                                            }
                                            zzafzVar.zzi(obj2, objZzx);
                                            throw th2;
                                        }
                                        obj = obj2;
                                        break;
                                    case SDK_INIT_API_VALUE:
                                        zzafoVar.zzL(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_START_EVENT_VALUE:
                                        zzafoVar.zzM(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_CLICK_EVENT_VALUE:
                                        zzafoVar.zzN(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        zzafoVar.zzO(zzaeo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 49:
                                        zzafoVar.zzH(zzaeo.zza(obj3, iZzA & 1048575), zzq(iZzP), zzadfVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objZzr = zzr(iZzP);
                                        long jZzA = zzA(iZzP) & 1048575;
                                        Object objZzm = zzagg.zzm(obj3, jZzA);
                                        if (objZzm == null) {
                                            objZzm = zzaew.zza().zzc();
                                            zzagg.zzn(obj3, jZzA, objZzm);
                                        } else if (zzaex.zza(objZzm)) {
                                            Object objZzc = zzaew.zza().zzc();
                                            zzaex.zzb(objZzc, objZzm);
                                            zzagg.zzn(obj3, jZzA, objZzc);
                                            objZzm = objZzc;
                                        }
                                        zzafoVar.zzP((zzaew) objZzm, ((zzaev) objZzr).zze(), zzadfVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 51:
                                        zzagg.zzn(obj3, iZzA & 1048575, Double.valueOf(zzafoVar.zze()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 52:
                                        zzagg.zzn(obj3, iZzA & 1048575, Float.valueOf(zzafoVar.zzf()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzh()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 54:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzg()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 55:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzi()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_VISIBILITY_VALUE:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzj()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzk()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                                        zzagg.zzn(obj3, iZzA & 1048575, Boolean.valueOf(zzafoVar.zzl()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                                        zzz(obj3, iZzA, zzafoVar);
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 60:
                                        zzafc zzafcVar3 = (zzafc) zzv(obj3, iZzb, iZzP);
                                        zzafoVar.zzo(zzafcVar3, zzq(iZzP), zzadfVar);
                                        zzw(obj3, iZzb, iZzP, zzafcVar3);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                        zzagg.zzn(obj3, iZzA & 1048575, zzafoVar.zzq());
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case DEPRECATED_API_USED_VALUE:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzr()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                        int iZzs2 = zzafoVar.zzs();
                                        zzadz zzadzVarZzs2 = zzs(iZzP);
                                        if (zzadzVarZzs2 != null && !zzadzVarZzs2.zza(iZzs2)) {
                                            objZzh = zzafq.zzG(obj3, iZzb, iZzs2, objZzh, zzafzVar2);
                                            obj = obj3;
                                        }
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(iZzs2));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzt()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 65:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzu()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case BLACK_SCREEN_IS_DETECTED_VALUE:
                                        zzagg.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzafoVar.zzv()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case NATIVE_PLAY_ASSET_TYPE_VALUE:
                                        zzagg.zzn(obj3, iZzA & 1048575, Long.valueOf(zzafoVar.zzw()));
                                        zzO(obj3, iZzb, iZzP);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                                        zzafc zzafcVar4 = (zzafc) zzv(obj3, iZzb, iZzP);
                                        zzafoVar.zzp(zzafcVar4, zzq(iZzP), zzadfVar);
                                        zzw(obj3, iZzb, iZzP, zzafcVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objZzh == null) {
                                            try {
                                                objZzh = zzafzVar2.zzh(obj3);
                                            } catch (Throwable th6) {
                                                th2 = th6;
                                                zzaffVar = zzaffVar2;
                                                obj2 = obj3;
                                                i10 = zzaffVar.zzk;
                                                objZzx = objZzh;
                                                while (i10 < zzaffVar.zzl) {
                                                    zzafz zzafzVar8 = zzafzVar2;
                                                    objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i10], objZzx, zzafzVar8, obj2);
                                                    i10++;
                                                    zzaffVar = this;
                                                    zzafzVar2 = zzafzVar8;
                                                }
                                                zzafzVar = zzafzVar2;
                                                if (objZzx != null) {
                                                    throw th2;
                                                }
                                                zzafzVar.zzi(obj2, objZzx);
                                                throw th2;
                                            }
                                        }
                                        if (!zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                                            objZzx2 = objZzh;
                                            for (int i12 = zzaffVar2.zzk; i12 < zzaffVar2.zzl; i12++) {
                                                zzafz zzafzVar9 = zzafzVar2;
                                                Object obj4 = obj3;
                                                objZzx2 = zzaffVar2.zzx(obj4, zzaffVar2.zzj[i12], objZzx2, zzafzVar9, obj3);
                                                obj3 = obj4;
                                                zzafzVar2 = zzafzVar9;
                                            }
                                            obj2 = obj3;
                                        }
                                        obj = obj3;
                                        break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj2 = obj3;
                            }
                        } catch (zzaeg unused3) {
                            obj2 = obj3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzaffVar = zzaffVar2;
                        obj2 = obj3;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx2 = objZzh;
                    for (int i13 = this.zzk; i13 < this.zzl; i13++) {
                        zzafz zzafzVar10 = zzafzVar2;
                        objZzx2 = zzx(obj, this.zzj[i13], objZzx2, zzafzVar10, obj);
                        zzafzVar2 = zzafzVar10;
                    }
                    obj2 = obj;
                } else {
                    zzaffVar = this;
                    try {
                        if ((!zzaffVar.zzh ? null : zzadfVar.zzc(zzaffVar.zzg, iZzb)) != null) {
                            obj3 = obj;
                            zzaffVar2 = zzaffVar;
                            throw null;
                        }
                        if (objZzh == null) {
                            try {
                                objZzh = zzafzVar2.zzh(obj);
                            } catch (Throwable th9) {
                                th2 = th9;
                                obj2 = obj;
                                i10 = zzaffVar.zzk;
                                objZzx = objZzh;
                                while (i10 < zzaffVar.zzl) {
                                    zzafz zzafzVar11 = zzafzVar2;
                                    objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i10], objZzx, zzafzVar11, obj2);
                                    i10++;
                                    zzaffVar = this;
                                    zzafzVar2 = zzafzVar11;
                                }
                                zzafzVar = zzafzVar2;
                                if (objZzx != null) {
                                    throw th2;
                                }
                                zzafzVar.zzi(obj2, objZzx);
                                throw th2;
                            }
                        }
                        if (zzafzVar2.zzk(objZzh, zzafoVar, 0)) {
                            obj3 = obj;
                            obj = obj3;
                        } else {
                            int i14 = zzaffVar.zzk;
                            objZzx2 = objZzh;
                            while (i14 < zzaffVar.zzl) {
                                zzafz zzafzVar12 = zzafzVar2;
                                Object obj5 = obj;
                                objZzx2 = zzaffVar.zzx(obj5, zzaffVar.zzj[i14], objZzx2, zzafzVar12, obj);
                                zzafzVar2 = zzafzVar12;
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
                        i10 = zzaffVar.zzk;
                        objZzx = objZzh;
                        while (i10 < zzaffVar.zzl) {
                            zzafz zzafzVar13 = zzafzVar2;
                            objZzx = zzaffVar.zzx(obj2, zzaffVar.zzj[i10], objZzx, zzafzVar13, obj2);
                            i10++;
                            zzaffVar = this;
                            zzafzVar2 = zzafzVar13;
                        }
                        zzafzVar = zzafzVar2;
                        if (objZzx != null) {
                            throw th2;
                        }
                        zzafzVar.zzi(obj2, objZzx);
                        throw th2;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                zzaffVar = this;
                obj2 = obj;
            }
        }
        if (objZzx2 != null) {
            zzafzVar2.zzi(obj2, objZzx2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzi(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.zzacg r37) {
        /*
            Method dump skipped, instruction units count: 3792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzaff.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzacg):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzj(Object obj, byte[] bArr, int i10, int i11, zzacg zzacgVar) {
        zzi(obj, bArr, i10, i11, 0, zzacgVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzadu) {
                zzadu zzaduVar = (zzadu) obj;
                zzaduVar.zzcp(Integer.MAX_VALUE);
                zzaduVar.zza = 0;
                zzaduVar.zzci();
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
                                ((zzaef) zzagg.zzm(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzaew) object).zzd();
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
    @Override // com.google.android.gms.internal.measurement.zzafp
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        List list;
        zzafp zzafpVarZzq;
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
                list = (List) zzagg.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzafpVarZzq = zzq(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzafpVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzM(obj2, iArr[i16], i16) && !zzy(obj2, iZzA, zzq(i16))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzagg.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzafpVarZzq = zzq(i16);
                    while (i12 < list.size()) {
                        if (!zzafpVarZzq.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzaew zzaewVar = (zzaew) zzagg.zzm(obj2, iZzA & 1048575);
                if (!zzaewVar.isEmpty() && ((zzaev) zzr(i16)).zze().zzc.zza() == zzagn.MESSAGE) {
                    zzafp zzafpVarZzb = null;
                    for (Object obj3 : zzaewVar.values()) {
                        if (zzafpVarZzb == null) {
                            zzafpVarZzb = zzafl.zza().zzb(obj3.getClass());
                        }
                        if (!zzafpVarZzb.zzl(obj3)) {
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
        return !this.zzh || ((zzadr) obj).zzb.zze();
    }
}
