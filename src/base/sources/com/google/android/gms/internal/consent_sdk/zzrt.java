package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i10, int i11, zzrq zzrqVar, boolean z10, int[] iArr2, int i12, int i13, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z11 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z11 = true;
        }
        this.zzf = z11;
        this.zzg = iArr2;
        this.zzh = i12;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i10, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i10 & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i10, int i11) {
        return zzsw.zzc(obj, (long) (zzm(i11) & 1048575)) == i10;
    }

    private static boolean zzD(Object obj, long j10) {
        return ((Boolean) zzsw.zzf(obj, j10)).booleanValue();
    }

    private static final void zzE(int i10, Object obj, zztb zztbVar) {
        if (obj instanceof String) {
            zztbVar.zzF(i10, (String) obj);
        } else {
            zztbVar.zzd(i10, (zzpm) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    static zzrt zzi(Class cls, zzrn zzrnVar, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
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
        int i27;
        int iObjectFieldOffset;
        char c10;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldZzs;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field fieldZzs2;
        int i36;
        Object obj2;
        Field fieldZzs3;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(zzrnVar instanceof zzrz)) {
            throw null;
        }
        zzrz zzrzVar = (zzrz) zzrnVar;
        String strZzd = zzrzVar.zzd();
        int length = strZzd.length();
        char c11 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (strZzd.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt2 = strZzd.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i43 = iCharAt2 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = strZzd.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt2 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i13 = 0;
            i14 = 0;
            iArr = zza;
            i16 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt3 = strZzd.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i24 = i45 + 1;
                    cCharAt8 = strZzd.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i24;
                }
                iCharAt3 = i46 | (cCharAt8 << i47);
                i45 = i24;
            }
            int i48 = i45 + 1;
            int iCharAt4 = strZzd.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i23 = i48 + 1;
                    cCharAt7 = strZzd.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i23;
                }
                iCharAt4 = i49 | (cCharAt7 << i50);
                i48 = i23;
            }
            int i51 = i48 + 1;
            int iCharAt5 = strZzd.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    cCharAt6 = strZzd.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i22;
                }
                iCharAt5 = i52 | (cCharAt6 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            int iCharAt6 = strZzd.charAt(i51);
            if (iCharAt6 >= 55296) {
                int i55 = iCharAt6 & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    cCharAt5 = strZzd.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i21;
                }
                iCharAt6 = i55 | (cCharAt5 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            iCharAt = strZzd.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i20 = i57 + 1;
                    cCharAt4 = strZzd.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i20;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i20;
            }
            int i60 = i57 + 1;
            int iCharAt7 = strZzd.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    cCharAt3 = strZzd.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i19;
                }
                iCharAt7 = i61 | (cCharAt3 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int iCharAt8 = strZzd.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    cCharAt2 = strZzd.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i18;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i18;
            }
            int i66 = i63 + 1;
            int iCharAt9 = strZzd.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i17 = i66 + 1;
                    cCharAt = strZzd.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i17;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i17;
            }
            int i69 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i70 = iCharAt7;
            i11 = iCharAt5;
            i12 = i70;
            i13 = iCharAt6;
            i14 = iCharAt9;
            i15 = i69;
            iArr = iArr2;
            i16 = iCharAt3;
            i42 = i66;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzrzVar.zze();
        Class<?> cls2 = zzrzVar.zza().getClass();
        int i71 = i14 + i12;
        int i72 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i72];
        int i73 = i14;
        int i74 = i71;
        int i75 = 0;
        int i76 = 0;
        while (i42 < length) {
            int i77 = i42 + 1;
            int iCharAt10 = strZzd.charAt(i42);
            if (iCharAt10 >= c11) {
                int i78 = iCharAt10 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i39 = i79 + 1;
                    cCharAt12 = strZzd.charAt(i79);
                    if (cCharAt12 < c11) {
                        break;
                    }
                    i78 |= (cCharAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i39;
                }
                iCharAt10 = i78 | (cCharAt12 << i80);
                i25 = i39;
            } else {
                i25 = i77;
            }
            int i81 = i25 + 1;
            int iCharAt11 = strZzd.charAt(i25);
            if (iCharAt11 >= c11) {
                int i82 = iCharAt11 & 8191;
                int i83 = i81;
                int i84 = 13;
                while (true) {
                    i38 = i83 + 1;
                    cCharAt11 = strZzd.charAt(i83);
                    if (cCharAt11 < c11) {
                        break;
                    }
                    i82 |= (cCharAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i38;
                }
                iCharAt11 = i82 | (cCharAt11 << i84);
                i26 = i38;
            } else {
                i26 = i81;
            }
            if ((iCharAt11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i85 = iCharAt11 & 255;
            zzrz zzrzVar2 = zzrzVar;
            int i86 = iCharAt11 & 2048;
            if (i85 >= 51) {
                int i87 = i26 + 1;
                int iCharAt12 = strZzd.charAt(i26);
                char c12 = 55296;
                if (iCharAt12 >= 55296) {
                    int i88 = iCharAt12 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i37 = i89 + 1;
                        cCharAt10 = strZzd.charAt(i89);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i88 |= (cCharAt10 & 8191) << i90;
                        i90 += 13;
                        i89 = i37;
                        c12 = 55296;
                    }
                    iCharAt12 = i88 | (cCharAt10 << i90);
                    i32 = i37;
                } else {
                    i32 = i87;
                }
                int i91 = i32;
                int i92 = i85 - 51;
                if (i92 == 9 || i92 == 17) {
                    i33 = i15 + 1;
                    int i93 = i76 / 3;
                    objArr[i93 + i93 + 1] = objArrZze[i15];
                } else {
                    if (i92 != 12) {
                        i34 = i86;
                    } else if (zzrzVar2.zzc() == 1 || i86 != 0) {
                        i33 = i15 + 1;
                        int i94 = i76 / 3;
                        objArr[i94 + i94 + 1] = objArrZze[i15];
                    } else {
                        i34 = 0;
                    }
                    i35 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i35];
                    int i95 = i34;
                    if (obj instanceof Field) {
                        fieldZzs2 = (Field) obj;
                    } else {
                        fieldZzs2 = zzs(cls2, (String) obj);
                        objArrZze[i35] = fieldZzs2;
                    }
                    int i96 = i16;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs2);
                    i36 = i35 + 1;
                    obj2 = objArrZze[i36];
                    i27 = i96;
                    if (obj2 instanceof Field) {
                        fieldZzs3 = (Field) obj2;
                    } else {
                        fieldZzs3 = zzs(cls2, (String) obj2);
                        objArrZze[i36] = fieldZzs3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzs3);
                    strZzd = strZzd;
                    i29 = i95;
                    i26 = i91;
                    i28 = 0;
                    c10 = 55296;
                }
                i15 = i33;
                i34 = i86;
                i35 = iCharAt12 + iCharAt12;
                obj = objArrZze[i35];
                int i97 = i34;
                if (obj instanceof Field) {
                    fieldZzs2 = (Field) obj;
                } else {
                    fieldZzs2 = zzs(cls2, (String) obj);
                    objArrZze[i35] = fieldZzs2;
                }
                int i98 = i16;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs2);
                i36 = i35 + 1;
                obj2 = objArrZze[i36];
                i27 = i98;
                if (obj2 instanceof Field) {
                    fieldZzs3 = (Field) obj2;
                } else {
                    fieldZzs3 = zzs(cls2, (String) obj2);
                    objArrZze[i36] = fieldZzs3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzs3);
                strZzd = strZzd;
                i29 = i97;
                i26 = i91;
                i28 = 0;
                c10 = 55296;
            } else {
                i27 = i16;
                int i99 = i15 + 1;
                Field fieldZzs4 = zzs(cls2, (String) objArrZze[i15]);
                if (i85 == 9 || i85 == 17) {
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = fieldZzs4.getType();
                } else {
                    if (i85 != 27) {
                        if (i85 == 49) {
                            i15 += 2;
                            i31 = 1;
                        } else if (i85 == 12 || i85 == 30 || i85 == 44) {
                            if (zzrzVar2.zzc() == 1 || i86 != 0) {
                                i15 += 2;
                                int i101 = i76 / 3;
                                objArr[i101 + i101 + 1] = objArrZze[i99];
                            } else {
                                i15 = i99;
                                i86 = 0;
                            }
                        } else if (i85 == 50) {
                            int i102 = i15 + 2;
                            int i103 = i73 + 1;
                            iArr[i73] = i76;
                            int i104 = i76 / 3;
                            int i105 = i104 + i104;
                            objArr[i105] = objArrZze[i99];
                            if (i86 != 0) {
                                objArr[i105 + 1] = objArrZze[i102];
                                i15 += 3;
                                i73 = i103;
                            } else {
                                i15 = i102;
                                i73 = i103;
                                i86 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                        if ((iCharAt11 & 4096) != 0 || i85 > 17) {
                            c10 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i28 = 0;
                        } else {
                            int i106 = i26 + 1;
                            int iCharAt13 = strZzd.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i107 = iCharAt13 & 8191;
                                int i108 = 13;
                                while (true) {
                                    i30 = i106 + 1;
                                    cCharAt9 = strZzd.charAt(i106);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i107 |= (cCharAt9 & 8191) << i108;
                                    i108 += 13;
                                    i106 = i30;
                                }
                                iCharAt13 = i107 | (cCharAt9 << i108);
                            } else {
                                i30 = i106;
                            }
                            int i109 = i27 + i27 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i109];
                            if (obj3 instanceof Field) {
                                fieldZzs = (Field) obj3;
                            } else {
                                fieldZzs = zzs(cls2, (String) obj3);
                                objArrZze[i109] = fieldZzs;
                            }
                            int i110 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzs);
                            i28 = i110 % 32;
                            i26 = i30;
                            c10 = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i85 >= 18 && i85 <= 49) {
                            iArr[i74] = iObjectFieldOffset;
                            i74++;
                        }
                        i29 = i86;
                    } else {
                        i31 = 1;
                        i15 += 2;
                    }
                    int i111 = i76 / 3;
                    objArr[i111 + i111 + i31] = objArrZze[i99];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                    if ((iCharAt11 & 4096) != 0) {
                        c10 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    } else {
                        c10 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i28 = 0;
                    }
                    if (i85 >= 18) {
                        iArr[i74] = iObjectFieldOffset;
                        i74++;
                    }
                    i29 = i86;
                }
                i15 = i99;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                if ((iCharAt11 & 4096) != 0) {
                    c10 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                } else {
                    c10 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i28 = 0;
                }
                if (i85 >= 18) {
                    iArr[i74] = iObjectFieldOffset;
                    i74++;
                }
                i29 = i86;
            }
            int i112 = i76 + 1;
            iArr3[i76] = iCharAt10;
            int i113 = i76 + 2;
            iArr3[i112] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i29 != 0 ? Integer.MIN_VALUE : 0) | (i85 << 20) | iObjectFieldOffset;
            i76 += 3;
            iArr3[i113] = (i28 << 20) | iObjectFieldOffset2;
            i42 = i26;
            strZzd = strZzd;
            c11 = c10;
            zzrzVar = zzrzVar2;
            length = length;
            i16 = i27;
        }
        return new zzrt(iArr3, objArr, i11, i13, zzrzVar.zza(), false, iArr, i14, i71, zzrvVar, zzrcVar, zzspVar, zzqbVar, zzrlVar);
    }

    private static double zzj(Object obj, long j10) {
        return ((Double) zzsw.zzf(obj, j10)).doubleValue();
    }

    private static float zzk(Object obj, long j10) {
        return ((Float) zzsw.zzf(obj, j10)).floatValue();
    }

    private static int zzl(Object obj, long j10) {
        return ((Integer) zzsw.zzf(obj, j10)).intValue();
    }

    private final int zzm(int i10) {
        return this.zzc[i10 + 2];
    }

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzsw.zzf(obj, j10)).longValue();
    }

    private final zzsa zzq(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzsa zzsaVar = (zzsa) objArr[i12];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzsaVarZzb = zzrx.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzsaVarZzb;
        return zzsaVarZzb;
    }

    private final Object zzr(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzs(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e10);
        }
    }

    private final void zzt(Object obj, Object obj2, int i10) {
        if (zzy(obj2, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i10);
            if (!zzy(obj, i10)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzv(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzC(obj2, i11, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i10);
            if (!zzC(obj, i11, i10)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j10, objZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzw(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j10, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i10) {
        int iZzm = zzm(i10);
        long j10 = 1048575 & iZzm;
        if (j10 == 1048575) {
            return;
        }
        zzsw.zzq(obj, j10, (1 << (iZzm >>> 20)) | zzsw.zzc(obj, j10));
    }

    private final void zzw(Object obj, int i10, int i11) {
        zzsw.zzq(obj, zzm(i11) & 1048575, i10);
    }

    private final boolean zzx(Object obj, Object obj2, int i10) {
        return zzy(obj, i10) == zzy(obj2, i10);
    }

    private final boolean zzy(Object obj, int i10) {
        int iZzm = zzm(i10);
        long j10 = iZzm & 1048575;
        if (j10 != 1048575) {
            return (zzsw.zzc(obj, j10) & (1 << (iZzm >>> 20))) != 0;
        }
        int iZzo = zzo(i10);
        long j11 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j11)) != 0;
            case 2:
                return zzsw.zzd(obj, j11) != 0;
            case 3:
                return zzsw.zzd(obj, j11) != 0;
            case 4:
                return zzsw.zzc(obj, j11) != 0;
            case 5:
                return zzsw.zzd(obj, j11) != 0;
            case 6:
                return zzsw.zzc(obj, j11) != 0;
            case 7:
                return zzsw.zzw(obj, j11);
            case 8:
                Object objZzf = zzsw.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzpm) {
                    return !zzpm.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j11) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j11));
            case 11:
                return zzsw.zzc(obj, j11) != 0;
            case 12:
                return zzsw.zzc(obj, j11) != 0;
            case 13:
                return zzsw.zzc(obj, j11) != 0;
            case 14:
                return zzsw.zzd(obj, j11) != 0;
            case 15:
                return zzsw.zzc(obj, j11) != 0;
            case 16:
                return zzsw.zzd(obj, j11) != 0;
            case 17:
                return zzsw.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzy(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x038e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(Object obj) {
        int i10;
        int iZzC;
        int iZzC2;
        int iZzD;
        int iZzC3;
        int iZzC4;
        int iZzC5;
        int iZzd;
        int iZzC6;
        int iZzi;
        int iZzh;
        int size;
        int iZzm;
        int iZzC7;
        int iZzC8;
        int iZzj;
        int iZzC9;
        int iZzC10;
        int iZzD2;
        int iZzf;
        int iZzC11;
        int iZzC12;
        int iZza;
        int iZzC13;
        int iZzC14;
        int iZzC15;
        int iZzd2;
        int iZzC16;
        zzrt<T> zzrtVar = this;
        Unsafe unsafe = zzb;
        int i11 = 0;
        int i12 = 0;
        int iZzC17 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = zzrtVar.zzc;
            if (i11 >= iArr.length) {
                int iZza2 = iZzC17 + ((zzqm) obj).zzc.zza();
                if (!zzrtVar.zzf) {
                    return iZza2;
                }
                zzsi zzsiVar = ((zzqk) obj).zzb.zza;
                int iZzc = zzsiVar.zzc();
                int iZzc2 = 0;
                for (int i14 = 0; i14 < iZzc; i14++) {
                    Map.Entry entryZzg = zzsiVar.zzg(i14);
                    iZzc2 += zzqf.zzc((zzqe) ((zzse) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzsiVar.zzd()) {
                    iZzc2 += zzqf.zzc((zzqe) entry.getKey(), entry.getValue());
                }
                return iZza2 + iZzc2;
            }
            int iZzo = zzrtVar.zzo(i11);
            int iZzn = zzn(iZzo);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            if (iZzn <= 17) {
                if (i17 != i13) {
                    i12 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = iZzo & 1048575;
            if (iZzn >= zzqg.zzJ.zza()) {
                zzqg.zzW.zza();
            }
            long j10 = i18;
            switch (iZzn) {
                case 0:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzC17 += zzpv.zzC(i15 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzC = zzpv.zzC(i15 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 2:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzC2 = zzpv.zzC(i15 << 3);
                        iZzD = zzpv.zzD(j11);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzC2 = zzpv.zzC(i15 << 3);
                        iZzD = zzpv.zzD(j12);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzC2 = zzpv.zzC(i15 << 3);
                        iZzD = zzpv.zzD(j13);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzC3 = zzpv.zzC(i15 << 3);
                        iZzC4 = iZzC3 + 8;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 6:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzC = zzpv.zzC(i15 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 7:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzC4 = zzpv.zzC(i15 << 3) + 1;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 8:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzpm) {
                            iZzC5 = zzpv.zzC(i19);
                            iZzd = ((zzpm) object).zzd();
                            iZzC6 = zzpv.zzC(iZzd);
                            iZzC4 = iZzC5 + iZzC6 + iZzd;
                            iZzC17 += iZzC4;
                        } else {
                            iZzC2 = zzpv.zzC(i19);
                            iZzD = zzpv.zzB((String) object);
                            iZzC4 = iZzC2 + iZzD;
                            iZzC17 += iZzC4;
                        }
                    }
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzi = zzsc.zzi(i15, unsafe.getObject(obj, j10), zzrtVar.zzq(i11));
                        iZzC17 += iZzi;
                    }
                    break;
                case 10:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(obj, j10);
                        iZzC5 = zzpv.zzC(i15 << 3);
                        iZzd = zzpmVar.zzd();
                        iZzC6 = zzpv.zzC(iZzd);
                        iZzC4 = iZzC5 + iZzC6 + iZzd;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        int i20 = unsafe.getInt(obj, j10);
                        iZzC2 = zzpv.zzC(i15 << 3);
                        iZzD = zzpv.zzC(i20);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzC2 = zzpv.zzC(i15 << 3);
                        iZzD = zzpv.zzD(j14);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzC = zzpv.zzC(i15 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 14:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzC3 = zzpv.zzC(i15 << 3);
                        iZzC4 = iZzC3 + 8;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 15:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        int i21 = unsafe.getInt(obj, j10);
                        iZzC2 = zzpv.zzC(i15 << 3);
                        iZzD = zzpv.zzC((i21 >> 31) ^ (i21 + i21));
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzC2 = zzpv.zzC(i15 << 3);
                        iZzD = zzpv.zzD((j15 >> 63) ^ (j15 + j15));
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.zzz(obj, i11, i13, i12, i10)) {
                        iZzi = zzsc.zza(i15, (zzrq) unsafe.getObject(obj, j10), zzrtVar.zzq(i11));
                        iZzC17 += iZzi;
                    }
                    break;
                case 18:
                    iZzi = zzsc.zze(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzC17 += iZzi;
                    break;
                case 19:
                    iZzi = zzsc.zzc(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzC17 += iZzi;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i22 = zzsc.zza;
                    if (list.size() == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = zzsc.zzh(list) + (list.size() * zzpv.zzC(i15 << 3));
                    }
                    iZzC17 += iZzh;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i23 = zzsc.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzm(list2);
                        iZzC7 = zzpv.zzC(i15 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzsc.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzg(list3);
                        iZzC7 = zzpv.zzC(i15 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 23:
                    iZzi = zzsc.zze(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzC17 += iZzi;
                    break;
                case 24:
                    iZzi = zzsc.zzc(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzC17 += iZzi;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i25 = zzsc.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzi = 0;
                    } else {
                        iZzi = size2 * (zzpv.zzC(i15 << 3) + 1);
                    }
                    iZzC17 += iZzi;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzsc.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = zzpv.zzC(i15 << 3) * size3;
                        if (list5 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) list5;
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object objZza = zzrbVar.zza();
                                if (objZza instanceof zzpm) {
                                    int iZzd3 = ((zzpm) objZza).zzd();
                                    iZzh += zzpv.zzC(iZzd3) + iZzd3;
                                } else {
                                    iZzh += zzpv.zzB((String) objZza);
                                }
                            }
                        } else {
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj2 = list5.get(i28);
                                if (obj2 instanceof zzpm) {
                                    int iZzd4 = ((zzpm) obj2).zzd();
                                    iZzh += zzpv.zzC(iZzd4) + iZzd4;
                                } else {
                                    iZzh += zzpv.zzB((String) obj2);
                                }
                            }
                        }
                    }
                    iZzC17 += iZzh;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq = zzrtVar.zzq(i11);
                    int i29 = zzsc.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzC8 = 0;
                    } else {
                        iZzC8 = zzpv.zzC(i15 << 3) * size4;
                        for (int i30 = 0; i30 < size4; i30++) {
                            Object obj3 = list6.get(i30);
                            if (obj3 instanceof zzra) {
                                iZzj = ((zzra) obj3).zza();
                                iZzC9 = zzpv.zzC(iZzj);
                            } else {
                                iZzj = ((zzpa) obj3).zzj(zzsaVarZzq);
                                iZzC9 = zzpv.zzC(iZzj);
                            }
                            iZzC8 += iZzC9 + iZzj;
                        }
                    }
                    iZzC17 += iZzC8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i31 = zzsc.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzC10 = 0;
                    } else {
                        iZzC10 = size5 * zzpv.zzC(i15 << 3);
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int iZzd5 = ((zzpm) list7.get(i32)).zzd();
                            iZzC10 += zzpv.zzC(iZzd5) + iZzd5;
                        }
                    }
                    iZzC17 += iZzC10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i33 = zzsc.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzl(list8);
                        iZzC7 = zzpv.zzC(i15 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i34 = zzsc.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzb(list9);
                        iZzC7 = zzpv.zzC(i15 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 31:
                    iZzi = zzsc.zzc(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzC17 += iZzi;
                    break;
                case 32:
                    iZzi = zzsc.zze(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzC17 += iZzi;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i35 = zzsc.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzj(list10);
                        iZzC7 = zzpv.zzC(i15 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i36 = zzsc.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzk(list11);
                        iZzC7 = zzpv.zzC(i15 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 35:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 36:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 37:
                    iZzf = zzsc.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 38:
                    iZzf = zzsc.zzm((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 39:
                    iZzf = zzsc.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 40:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 41:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i37 = zzsc.zza;
                    iZzf = list12.size();
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 43:
                    iZzf = zzsc.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 44:
                    iZzf = zzsc.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case SDK_INIT_API_VALUE:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case AD_START_EVENT_VALUE:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case AD_CLICK_EVENT_VALUE:
                    iZzf = zzsc.zzj((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 48:
                    iZzf = zzsc.zzk((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i15 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq2 = zzrtVar.zzq(i11);
                    int i38 = zzsc.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZza = 0;
                    } else {
                        iZza = 0;
                        for (int i39 = 0; i39 < size6; i39++) {
                            iZza += zzsc.zza(i15, (zzrq) list13.get(i39), zzsaVarZzq2);
                        }
                    }
                    iZzC17 += iZza;
                    break;
                case 50:
                    zzrk zzrkVar = (zzrk) unsafe.getObject(obj, j10);
                    zzrj zzrjVar = (zzrj) zzrtVar.zzr(i11);
                    if (zzrkVar.isEmpty()) {
                        iZzh = 0;
                    } else {
                        iZzh = 0;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            iZzh += zzrjVar.zza(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzC17 += iZzh;
                    break;
                case 51:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzC13 = zzpv.zzC(i15 << 3);
                        iZzi = iZzC13 + 8;
                        iZzC17 += iZzi;
                    }
                    break;
                case 52:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzC14 = zzpv.zzC(i15 << 3);
                        iZzi = iZzC14 + 4;
                        iZzC17 += iZzi;
                    }
                    break;
                case 53:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        long jZzp = zzp(obj, j10);
                        iZzm = zzpv.zzC(i15 << 3);
                        iZzD2 = zzpv.zzD(jZzp);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 54:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        long jZzp2 = zzp(obj, j10);
                        iZzm = zzpv.zzC(i15 << 3);
                        iZzD2 = zzpv.zzD(jZzp2);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 55:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        long jZzl = zzl(obj, j10);
                        iZzm = zzpv.zzC(i15 << 3);
                        iZzD2 = zzpv.zzD(jZzl);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzC13 = zzpv.zzC(i15 << 3);
                        iZzi = iZzC13 + 8;
                        iZzC17 += iZzi;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzC14 = zzpv.zzC(i15 << 3);
                        iZzi = iZzC14 + 4;
                        iZzC17 += iZzi;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzi = zzpv.zzC(i15 << 3) + 1;
                        iZzC17 += iZzi;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        int i40 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzpm) {
                            iZzC15 = zzpv.zzC(i40);
                            iZzd2 = ((zzpm) object2).zzd();
                            iZzC16 = zzpv.zzC(iZzd2);
                            iZzi = iZzC15 + iZzC16 + iZzd2;
                            iZzC17 += iZzi;
                        } else {
                            iZzm = zzpv.zzC(i40);
                            iZzD2 = zzpv.zzB((String) object2);
                            iZzi = iZzm + iZzD2;
                            iZzC17 += iZzi;
                        }
                    }
                    break;
                case 60:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzi = zzsc.zzi(i15, unsafe.getObject(obj, j10), zzrtVar.zzq(i11));
                        iZzC17 += iZzi;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(obj, j10);
                        iZzC15 = zzpv.zzC(i15 << 3);
                        iZzd2 = zzpmVar2.zzd();
                        iZzC16 = zzpv.zzC(iZzd2);
                        iZzi = iZzC15 + iZzC16 + iZzd2;
                        iZzC17 += iZzi;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        int iZzl = zzl(obj, j10);
                        iZzm = zzpv.zzC(i15 << 3);
                        iZzD2 = zzpv.zzC(iZzl);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        long jZzl2 = zzl(obj, j10);
                        iZzm = zzpv.zzC(i15 << 3);
                        iZzD2 = zzpv.zzD(jZzl2);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 64:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzC14 = zzpv.zzC(i15 << 3);
                        iZzi = iZzC14 + 4;
                        iZzC17 += iZzi;
                    }
                    break;
                case 65:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzC13 = zzpv.zzC(i15 << 3);
                        iZzi = iZzC13 + 8;
                        iZzC17 += iZzi;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        int iZzl2 = zzl(obj, j10);
                        iZzm = zzpv.zzC(i15 << 3);
                        iZzD2 = zzpv.zzC((iZzl2 >> 31) ^ (iZzl2 + iZzl2));
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        long jZzp3 = zzp(obj, j10);
                        iZzm = zzpv.zzC(i15 << 3);
                        iZzD2 = zzpv.zzD((jZzp3 >> 63) ^ (jZzp3 + jZzp3));
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i11)) {
                        iZzi = zzsc.zza(i15, (zzrq) unsafe.getObject(obj, j10), zzrtVar.zzq(i11));
                        iZzC17 += iZzi;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((zzqm) obj).zzc.hashCode();
                return this.zzf ? (iHashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzo = zzo(i12);
            int i14 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iZzn) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j10));
                    byte[] bArr = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr2 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr3 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr4 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzqs.zza(zzsw.zzw(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zzsw.zzf(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzf = zzsw.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr5 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j10);
                    byte[] bArr6 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzf2 = zzsw.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
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
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzj(obj, j10));
                        byte[] bArr7 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzk(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr8 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr9 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr10 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzqs.zza(zzD(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zzsw.zzf(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr11 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzl(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzp(obj, j10);
                        byte[] bArr12 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzC(obj, i15, i12)) {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                    }
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zzqm) {
                zzqm zzqmVar = (zzqm) obj;
                zzqmVar.zzA(Integer.MAX_VALUE);
                zzqmVar.zza = 0;
                zzqmVar.zzy();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzo = zzo(i10);
                int i11 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j10 = i11;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzy(obj, i10)) {
                                    zzq(i10).zzd(zzb.getObject(obj, j10));
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
                                ((zzqr) zzsw.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzrk) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzC(obj, iArr[i10], i10)) {
                        zzq(i10).zzd(zzb.getObject(obj, j10));
                    }
                } else if (zzy(obj, i10)) {
                    zzq(i10).zzd(zzb.getObject(obj, j10));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int iZzo = zzo(i10);
            int i11 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzn) {
                case 0:
                    if (zzy(obj2, i10)) {
                        zzsw.zzo(obj, j10, zzsw.zza(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 1:
                    if (zzy(obj2, i10)) {
                        zzsw.zzp(obj, j10, zzsw.zzb(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 2:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 3:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 4:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 5:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 6:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 7:
                    if (zzy(obj2, i10)) {
                        zzsw.zzm(obj, j10, zzsw.zzw(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 8:
                    if (zzy(obj2, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 9:
                    zzt(obj, obj2, i10);
                    break;
                case 10:
                    if (zzy(obj2, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 11:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 12:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 13:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 14:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 15:
                    if (zzy(obj2, i10)) {
                        zzsw.zzq(obj, j10, zzsw.zzc(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 16:
                    if (zzy(obj2, i10)) {
                        zzsw.zzr(obj, j10, zzsw.zzd(obj2, j10));
                        zzv(obj, i10);
                    }
                    break;
                case 17:
                    zzt(obj, obj2, i10);
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
                    zzqr zzqrVarZzd = (zzqr) zzsw.zzf(obj, j10);
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj2, j10);
                    int size = zzqrVarZzd.size();
                    int size2 = zzqrVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVarZzd.zzc()) {
                            zzqrVarZzd = zzqrVarZzd.zzd(size2 + size);
                        }
                        zzqrVarZzd.addAll(zzqrVar);
                    }
                    if (size > 0) {
                        zzqrVar = zzqrVarZzd;
                    }
                    zzsw.zzs(obj, j10, zzqrVar);
                    break;
                case 50:
                    int i13 = zzsc.zza;
                    zzrk zzrkVarZzb = (zzrk) zzsw.zzf(obj, j10);
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj2, j10);
                    if (!zzrkVar.isEmpty()) {
                        if (!zzrkVarZzb.zze()) {
                            zzrkVarZzb = zzrkVarZzb.zzb();
                        }
                        zzrkVarZzb.zzd(zzrkVar);
                    }
                    zzsw.zzs(obj, j10, zzrkVarZzb);
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
                    if (zzC(obj2, i12, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzw(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzu(obj, obj2, i10);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case DEPRECATED_API_USED_VALUE:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzC(obj2, i12, i10)) {
                        zzsw.zzs(obj, j10, zzsw.zzf(obj2, j10));
                        zzw(obj, i12, i10);
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    zzu(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzf(Object obj, zztb zztbVar) {
        Map.Entry entry;
        int i10;
        zzrt<T> zzrtVar = this;
        if (zzrtVar.zzf) {
            zzqf zzqfVar = ((zzqk) obj).zzb;
            if (zzqfVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzqfVar.zzf().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzrtVar.zzc;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iZzo = zzrtVar.zzo(i13);
            int iZzn = zzn(iZzo);
            int i15 = iArr[i13];
            if (iZzn <= 17) {
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
            long j10 = iZzo & i11;
            switch (iZzn) {
                case 0:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzf(i15, zzsw.zza(obj, j10));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 1:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzn(i15, zzsw.zzb(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 2:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzs(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzJ(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzq(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzl(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 6:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzj(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 7:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzb(i15, zzsw.zzw(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 8:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zzE(i15, unsafe.getObject(obj, j10), zztbVar);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzv(i15, unsafe.getObject(obj, j10), zzrtVar.zzq(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 10:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzd(i15, (zzpm) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzH(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzh(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzx(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 14:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzz(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 15:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzB(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzD(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.zzz(obj, i13, i12, i14, i10)) {
                        zztbVar.zzp(i15, unsafe.getObject(obj, j10), zzrtVar.zzq(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 18:
                    zzsc.zzr(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 19:
                    zzsc.zzv(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 20:
                    zzsc.zzx(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 21:
                    zzsc.zzD(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 22:
                    zzsc.zzw(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 23:
                    zzsc.zzu(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 24:
                    zzsc.zzt(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 25:
                    zzsc.zzq(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 26:
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i19 = zzsc.zza;
                    if (list != null && !list.isEmpty()) {
                        zztbVar.zzG(i18, list);
                    }
                    break;
                case 27:
                    int i20 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq = zzrtVar.zzq(i13);
                    int i21 = zzsc.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((zzpw) zztbVar).zzv(i20, list2.get(i22), zzsaVarZzq);
                        }
                    }
                    break;
                case 28:
                    int i23 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzsc.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zztbVar.zze(i23, list3);
                    }
                    break;
                case 29:
                    zzsc.zzC(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 30:
                    zzsc.zzs(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 31:
                    zzsc.zzy(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 32:
                    zzsc.zzz(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 33:
                    zzsc.zzA(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 34:
                    zzsc.zzB(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzrtVar = this;
                    break;
                case 35:
                    zzsc.zzr(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 36:
                    zzsc.zzv(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 37:
                    zzsc.zzx(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 38:
                    zzsc.zzD(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 39:
                    zzsc.zzw(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 40:
                    zzsc.zzu(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 41:
                    zzsc.zzt(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 42:
                    zzsc.zzq(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 43:
                    zzsc.zzC(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 44:
                    zzsc.zzs(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case SDK_INIT_API_VALUE:
                    zzsc.zzy(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case AD_START_EVENT_VALUE:
                    zzsc.zzz(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    zzsc.zzA(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 48:
                    zzsc.zzB(iArr[i13], (List) unsafe.getObject(obj, j10), zztbVar, true);
                    break;
                case 49:
                    int i25 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzsa zzsaVarZzq2 = zzrtVar.zzq(i13);
                    int i26 = zzsc.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            ((zzpw) zztbVar).zzp(i25, list4.get(i27), zzsaVarZzq2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zztbVar.zzu(i15, ((zzrj) zzrtVar.zzr(i13)).zzc(), (zzrk) object);
                    }
                    break;
                case 51:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzf(i15, zzj(obj, j10));
                    }
                    break;
                case 52:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzn(i15, zzk(obj, j10));
                    }
                    break;
                case 53:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzs(i15, zzp(obj, j10));
                    }
                    break;
                case 54:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzJ(i15, zzp(obj, j10));
                    }
                    break;
                case 55:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzq(i15, zzl(obj, j10));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzl(i15, zzp(obj, j10));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzj(i15, zzl(obj, j10));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzb(i15, zzD(obj, j10));
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zzE(i15, unsafe.getObject(obj, j10), zztbVar);
                    }
                    break;
                case 60:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzv(i15, unsafe.getObject(obj, j10), zzrtVar.zzq(i13));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzd(i15, (zzpm) unsafe.getObject(obj, j10));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzH(i15, zzl(obj, j10));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzh(i15, zzl(obj, j10));
                    }
                    break;
                case 64:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzx(i15, zzl(obj, j10));
                    }
                    break;
                case 65:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzz(i15, zzp(obj, j10));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzB(i15, zzl(obj, j10));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzD(i15, zzp(obj, j10));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzrtVar.zzC(obj, i15, i13)) {
                        zztbVar.zzp(i15, unsafe.getObject(obj, j10), zzrtVar.zzq(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            zzrtVar = this;
        }
        if (entry != null) {
            throw null;
        }
        zzsq zzsqVar = ((zzqm) obj).zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzE;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzo = zzo(i10);
            long j10 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzx(obj, obj2, i10) || Double.doubleToLongBits(zzsw.zza(obj, j10)) != Double.doubleToLongBits(zzsw.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzx(obj, obj2, i10) || Float.floatToIntBits(zzsw.zzb(obj, j10)) != Float.floatToIntBits(zzsw.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzx(obj, obj2, i10) || zzsw.zzw(obj, j10) != zzsw.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzx(obj, obj2, i10) || zzsw.zzc(obj, j10) != zzsw.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzx(obj, obj2, i10) || zzsw.zzd(obj, j10) != zzsw.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzx(obj, obj2, i10) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
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
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10));
                    break;
                case 50:
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10));
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
                    long jZzm = zzm(i10) & 1048575;
                    if (zzsw.zzc(obj, jZzm) != zzsw.zzc(obj2, jZzm) || !zzsc.zzE(zzsw.zzf(obj, j10), zzsw.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzh(Object obj) {
        int i10;
        int i11;
        List list;
        zzsa zzsaVarZzq;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i14 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i16 = iArr[i14];
            int i17 = iArr2[i16];
            int iZzo = zzo(i16);
            int i18 = iArr2[i16 + 2];
            int i19 = i18 & 1048575;
            int i20 = 1 << (i18 >>> 20);
            if (i19 != i15) {
                if (i19 != 1048575) {
                    i13 = zzb.getInt(obj, i19);
                }
                i11 = i13;
                i10 = i19;
            } else {
                int i21 = i13;
                i10 = i15;
                i11 = i21;
            }
            if ((268435456 & iZzo) != 0 && !zzz(obj, i16, i10, i11, i20)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzz(obj, i16, i10, i11, i20) && !zzA(obj, iZzo, zzq(i16))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzsw.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzsaVarZzq = zzq(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzsaVarZzq.zzh(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzC(obj, i17, i16) && !zzA(obj, iZzo, zzq(i16))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzsw.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzsaVarZzq = zzq(i16);
                    while (i12 < list.size()) {
                        if (!zzsaVarZzq.zzh(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn != 50) {
                continue;
            } else {
                zzrk zzrkVar = (zzrk) zzsw.zzf(obj, iZzo & 1048575);
                if (!zzrkVar.isEmpty() && ((zzrj) zzr(i16)).zzc().zzb.zzb() == zzta.MESSAGE) {
                    zzsa zzsaVarZzb = null;
                    for (Object obj2 : zzrkVar.values()) {
                        if (zzsaVarZzb == null) {
                            zzsaVarZzb = zzrx.zza().zzb(obj2.getClass());
                        }
                        if (!zzsaVarZzb.zzh(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i14++;
            i15 = i10;
            i13 = i11;
        }
        return !this.zzf || ((zzqk) obj).zzb.zzj();
    }
}
