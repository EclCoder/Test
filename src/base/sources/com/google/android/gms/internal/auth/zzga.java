package com.google.android.gms.internal.auth;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i10, int i11, zzfx zzfxVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzj = i14;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i10, int i11) {
        zzhj.zzn(obj, zzl(i11) & 1048575, i10);
    }

    private final void zzB(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzz(obj, i10);
    }

    private final void zzC(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzA(obj, i10, i11);
    }

    private final boolean zzD(Object obj, Object obj2, int i10) {
        return zzE(obj, i10) == zzE(obj2, i10);
    }

    private final boolean zzE(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = iZzl & 1048575;
        if (j10 != 1048575) {
            return (zzhj.zzc(obj, j10) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i10);
        long j11 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j11)) != 0;
            case 2:
                return zzhj.zzd(obj, j11) != 0;
            case 3:
                return zzhj.zzd(obj, j11) != 0;
            case 4:
                return zzhj.zzc(obj, j11) != 0;
            case 5:
                return zzhj.zzd(obj, j11) != 0;
            case 6:
                return zzhj.zzc(obj, j11) != 0;
            case 7:
                return zzhj.zzt(obj, j11);
            case 8:
                Object objZzf = zzhj.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j11) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j11));
            case 11:
                return zzhj.zzc(obj, j11) != 0;
            case 12:
                return zzhj.zzc(obj, j11) != 0;
            case 13:
                return zzhj.zzc(obj, j11) != 0;
            case 14:
                return zzhj.zzd(obj, j11) != 0;
            case 15:
                return zzhj.zzc(obj, j11) != 0;
            case 16:
                return zzhj.zzd(obj, j11) != 0;
            case 17:
                return zzhj.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzE(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzG(Object obj, int i10, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i10 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i10, int i11) {
        return zzhj.zzc(obj, (long) (zzl(i11) & 1048575)) == i10;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x025a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0270  */
    /* JADX WARN: Code duplicated, block: B:129:0x0273  */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
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
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        zzgh zzghVar;
        int i27;
        int i28;
        int i29;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Field fieldZzv;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldZzv2;
        int i33;
        Object obj2;
        Field fieldZzv3;
        int i34;
        char cCharAt10;
        int i35;
        char cCharAt11;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar2 = (zzgh) zzfuVar;
        String strZzd = zzghVar2.zzd();
        int length = strZzd.length();
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (strZzd.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt2 = strZzd.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = strZzd.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i11 = 0;
            i15 = 0;
            iArr = zza;
            i16 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = strZzd.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i24 = i42 + 1;
                    cCharAt8 = strZzd.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i24;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i24;
            }
            int i45 = i42 + 1;
            int iCharAt4 = strZzd.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt7 = strZzd.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt5 = strZzd.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt6 = strZzd.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt6 = strZzd.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt5 = strZzd.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            iCharAt = strZzd.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt4 = strZzd.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            int iCharAt7 = strZzd.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt3 = strZzd.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            int iCharAt8 = strZzd.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt2 = strZzd.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt9 = strZzd.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt = strZzd.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i17;
            }
            i11 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i66 = iCharAt7;
            i12 = iCharAt5;
            i13 = i66;
            iArr = iArr2;
            i14 = iCharAt6;
            i15 = iCharAt9;
            i16 = iCharAt3;
            i39 = i63;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzghVar2.zze();
        Class<?> cls2 = zzghVar2.zza().getClass();
        int i67 = i15 + i13;
        int i68 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i68];
        int i69 = 0;
        int i70 = 0;
        int i71 = i15;
        int i72 = i67;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt10 = strZzd.charAt(i39);
            if (iCharAt10 >= c10) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i36 = i75 + 1;
                    cCharAt12 = strZzd.charAt(i75);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i36;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i25 = i36;
            } else {
                i25 = i73;
            }
            int i77 = i25 + 1;
            int iCharAt11 = strZzd.charAt(i25);
            if (iCharAt11 >= c10) {
                int i78 = iCharAt11 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i35 = i79 + 1;
                    cCharAt11 = strZzd.charAt(i79);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i78 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i79 = i35;
                }
                iCharAt11 = i78 | (cCharAt11 << i80);
                i26 = i35;
            } else {
                i26 = i77;
            }
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i69] = i70;
                i69++;
            }
            int i81 = iCharAt11 & 255;
            if (i81 >= 51) {
                int i82 = i26 + 1;
                int iCharAt12 = strZzd.charAt(i26);
                zzghVar = zzghVar2;
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = 13;
                    while (true) {
                        i34 = i82 + 1;
                        cCharAt10 = strZzd.charAt(i82);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i82 = i34;
                        c11 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i84);
                    i82 = i34;
                }
                int i85 = i81 - 51;
                if (i85 == 9 || i85 == 17) {
                    int i86 = i70 / 3;
                    i31 = i11 + 1;
                    objArr[i86 + i86 + 1] = objArrZze[i11];
                } else {
                    if (i85 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i87 = i70 / 3;
                        i31 = i11 + 1;
                        objArr[i87 + i87 + 1] = objArrZze[i11];
                    }
                    i32 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i32];
                    if (obj instanceof Field) {
                        fieldZzv2 = (Field) obj;
                    } else {
                        fieldZzv2 = zzv(cls2, (String) obj);
                        objArrZze[i32] = fieldZzv2;
                    }
                    int i88 = i82;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                    i33 = i32 + 1;
                    obj2 = objArrZze[i33];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = (Field) obj2;
                    } else {
                        fieldZzv3 = zzv(cls2, (String) obj2);
                        objArrZze[i33] = fieldZzv3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                    strZzd = strZzd;
                    i28 = i88;
                    i29 = 0;
                }
                i11 = i31;
                i32 = iCharAt12 + iCharAt12;
                obj = objArrZze[i32];
                if (obj instanceof Field) {
                    fieldZzv2 = (Field) obj;
                } else {
                    fieldZzv2 = zzv(cls2, (String) obj);
                    objArrZze[i32] = fieldZzv2;
                }
                int i89 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv2);
                i33 = i32 + 1;
                obj2 = objArrZze[i33];
                if (obj2 instanceof Field) {
                    fieldZzv3 = (Field) obj2;
                } else {
                    fieldZzv3 = zzv(cls2, (String) obj2);
                    objArrZze[i33] = fieldZzv3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv3);
                strZzd = strZzd;
                i28 = i89;
                i29 = 0;
            } else {
                zzghVar = zzghVar2;
                int i90 = i11 + 1;
                Field fieldZzv4 = zzv(cls2, (String) objArrZze[i11]);
                if (i81 == 9 || i81 == 17) {
                    i27 = i90;
                    int i91 = i70 / 3;
                    objArr[i91 + i91 + 1] = fieldZzv4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        int i92 = i70 / 3;
                        i30 = i11 + 2;
                        objArr[i92 + i92 + 1] = objArrZze[i90];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i27 = i90;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i93 = i70 / 3;
                            i30 = i11 + 2;
                            objArr[i93 + i93 + 1] = objArrZze[i27];
                        }
                    } else if (i81 == 50) {
                        int i94 = i71 + 1;
                        iArr[i71] = i70;
                        int i95 = i70 / 3;
                        i27 = i11 + 2;
                        int i96 = i95 + i95;
                        objArr[i96] = objArrZze[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i96 + 1] = objArrZze[i27];
                            i27 = i11 + 3;
                        }
                        i71 = i94;
                    } else {
                        i27 = i90;
                    }
                    i27 = i30;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv4);
                int iObjectFieldOffset4 = 1048575;
                if ((iCharAt11 & 4096) == 0 || i81 > 17) {
                    i28 = i26;
                    i29 = 0;
                } else {
                    int i97 = i26 + 1;
                    int iCharAt13 = strZzd.charAt(i26);
                    if (iCharAt13 >= 55296) {
                        int i98 = iCharAt13 & 8191;
                        int i99 = 13;
                        while (true) {
                            i28 = i97 + 1;
                            cCharAt9 = strZzd.charAt(i97);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i98 |= (cCharAt9 & 8191) << i99;
                            i99 += 13;
                            i97 = i28;
                        }
                        iCharAt13 = i98 | (cCharAt9 << i99);
                    } else {
                        i28 = i97;
                    }
                    int i100 = i16 + i16 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i100];
                    if (obj3 instanceof Field) {
                        fieldZzv = (Field) obj3;
                    } else {
                        fieldZzv = zzv(cls2, (String) obj3);
                        objArrZze[i100] = fieldZzv;
                    }
                    i29 = iCharAt13 % 32;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzv);
                }
                if (i81 >= 18 && i81 <= 49) {
                    iArr[i72] = iObjectFieldOffset3;
                    i72++;
                }
                iObjectFieldOffset = iObjectFieldOffset3;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i11 = i27;
            }
            int i101 = i70 + 1;
            iArr3[i70] = iCharAt10;
            int i102 = i70 + 2;
            iArr3[i101] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | iObjectFieldOffset;
            i70 += 3;
            iArr3[i102] = (i29 << 20) | iObjectFieldOffset2;
            i39 = i28;
            zzghVar2 = zzghVar;
            strZzd = strZzd;
            length = length;
            c10 = 55296;
        }
        zzgh zzghVar3 = zzghVar2;
        return new zzga(iArr3, objArr, i12, i14, zzghVar3.zza(), zzghVar3.zzc(), false, iArr, i15, i67, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j10) {
        return ((Integer) zzhj.zzf(obj, j10)).intValue();
    }

    private final int zzl(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzm(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
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

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzhj.zzf(obj, j10)).longValue();
    }

    private final zzey zzq(int i10) {
        int i11 = i10 / 3;
        return (zzey) this.zzd[i11 + i11 + 1];
    }

    private final zzgi zzr(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgi zzgiVar = (zzgi) this.zzd[i12];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzt(Object obj, int i10) {
        zzgi zzgiVarZzr = zzr(i10);
        int iZzo = zzo(i10) & 1048575;
        if (!zzE(obj, i10)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i10, int i11) {
        zzgi zzgiVarZzr = zzr(i11);
        if (!zzI(obj, i10, i11)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i11) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i10) {
        if (zzE(obj2, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzE(obj, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzz(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzI(obj2, i11, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzI(obj, i11, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzA(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = 1048575 & iZzl;
        if (j10 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j10, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iZzo = zzo(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & iZzo;
            int iHashCode = 37;
            switch (zzn(iZzo)) {
                case 0:
                    i10 = i11 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j10));
                    byte[] bArr = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j10));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr2 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr3 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr4 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j10));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr5 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j10);
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i11 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j10);
                    byte[] bArr6 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                    i11 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j10)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j10)).floatValue());
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr8 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr9 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzk(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr10 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzk(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j10)).booleanValue());
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j10)).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzk(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzk(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzk(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr11 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzk(obj, j10);
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr12 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzI(obj, i13, i12)) {
                        i10 = i11 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j10).hashCode();
                        i11 = i10 + iFloatToIntBits;
                    }
                    break;
            }
        }
        return (i11 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzb(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.auth.zzdt r41) throws com.google.android.gms.internal.auth.zzfb {
        /*
            Method dump skipped, instruction units count: 3684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iZzo = zzo(i10);
                int i11 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j10 = i11;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzE(obj, i10)) {
                                    zzr(i10).zze(zzb.getObject(obj, j10));
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
                                this.zzk.zza(obj, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzI(obj, this.zzc[i10], i10)) {
                        zzr(i10).zze(zzb.getObject(obj, j10));
                    }
                } else if (zzE(obj, i10)) {
                    zzr(i10).zze(zzb.getObject(obj, j10));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzo = zzo(i10);
            int i11 = this.zzc[i10];
            long j10 = 1048575 & iZzo;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i10)) {
                        zzhj.zzl(obj, j10, zzhj.zza(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 1:
                    if (zzE(obj2, i10)) {
                        zzhj.zzm(obj, j10, zzhj.zzb(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 2:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 3:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 4:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 5:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 6:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 7:
                    if (zzE(obj2, i10)) {
                        zzhj.zzk(obj, j10, zzhj.zzt(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 8:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 9:
                    zzx(obj, obj2, i10);
                    break;
                case 10:
                    if (zzE(obj2, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 11:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 12:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 13:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 14:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 15:
                    if (zzE(obj2, i10)) {
                        zzhj.zzn(obj, j10, zzhj.zzc(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 16:
                    if (zzE(obj2, i10)) {
                        zzhj.zzo(obj, j10, zzhj.zzd(obj2, j10));
                        zzz(obj, i10);
                    }
                    break;
                case 17:
                    zzx(obj, obj2, i10);
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
                    this.zzk.zzb(obj, obj2, j10);
                    break;
                case 50:
                    int i12 = zzgk.zza;
                    zzhj.zzp(obj, j10, zzfs.zza(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10)));
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
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                    }
                    break;
                case 60:
                    zzy(obj, obj2, i10);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case DEPRECATED_API_USED_VALUE:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzI(obj2, i11, i10)) {
                        zzhj.zzp(obj, j10, zzhj.zzf(obj2, j10));
                        zzA(obj, i11, i10);
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    zzy(obj, obj2, i10);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzdt zzdtVar) throws zzfb {
        zzb(obj, bArr, i10, i11, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzo = zzo(i10);
            long j10 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i10) || Double.doubleToLongBits(zzhj.zza(obj, j10)) != Double.doubleToLongBits(zzhj.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i10) || Float.floatToIntBits(zzhj.zzb(obj, j10)) != Float.floatToIntBits(zzhj.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i10) || zzhj.zzt(obj, j10) != zzhj.zzt(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10));
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
                    long jZzl = zzl(i10) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i10;
        int i11;
        List list;
        zzgi zzgiVarZzr;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.zzi) {
            int i16 = this.zzh[i13];
            int i17 = this.zzc[i16];
            int iZzo = zzo(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i14 = zzb.getInt(obj, i19);
                }
                i11 = i14;
                i10 = i19;
            } else {
                i10 = i15;
                i11 = i14;
            }
            Object obj2 = obj;
            if ((268435456 & iZzo) != 0 && !zzF(obj2, i16, i10, i11, i20)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzF(obj2, i16, i10, i11, i20) && !zzG(obj2, iZzo, zzr(i16))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzhj.zzf(obj2, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgiVarZzr = zzr(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzgiVarZzr.zzi(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzI(obj2, i17, i16) && !zzG(obj2, iZzo, zzr(i16))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzhj.zzf(obj2, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzgiVarZzr = zzr(i16);
                    while (i12 < list.size()) {
                        if (!zzgiVarZzr.zzi(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn == 50 && !((zzfr) zzhj.zzf(obj2, iZzo & 1048575)).isEmpty()) {
                throw null;
            }
            i13++;
            obj = obj2;
            i15 = i10;
            i14 = i11;
        }
        return true;
    }
}
