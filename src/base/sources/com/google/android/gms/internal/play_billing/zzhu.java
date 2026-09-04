package com.google.android.gms.internal.play_billing;

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
final class zzhu<T> implements zzib<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzix.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhr zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zziq zzl;
    private final zzgd zzm;

    private zzhu(int[] iArr, Object[] objArr, int i10, int i11, zzhr zzhrVar, boolean z10, int[] iArr2, int i12, int i13, zzhw zzhwVar, zzhe zzheVar, zziq zziqVar, zzgd zzgdVar, zzhn zzhnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzgdVar != null && (zzhrVar instanceof zzgm)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = zziqVar;
        this.zzm = zzgdVar;
        this.zzg = zzhrVar;
    }

    private final void zzA(Object obj, Object obj2, int i10) {
        if (zzH(obj2, i10)) {
            int iZzq = zzq(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzq;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzib zzibVarZzt = zzt(i10);
            if (!zzH(obj, i10)) {
                if (zzK(object)) {
                    Object objZze = zzibVarZzt.zze();
                    zzibVarZzt.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzC(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzK(object2)) {
                Object objZze2 = zzibVarZzt.zze();
                zzibVarZzt.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzibVarZzt.zzg(object2, object);
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzq = zzq(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzq;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            zzib zzibVarZzt = zzt(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzK(object)) {
                    Object objZze = zzibVarZzt.zze();
                    zzibVarZzt.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzD(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzK(object2)) {
                Object objZze2 = zzibVarZzt.zze();
                zzibVarZzt.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzibVarZzt.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, int i10) {
        int iZzn = zzn(i10);
        long j10 = 1048575 & iZzn;
        if (j10 == 1048575) {
            return;
        }
        zzix.zzn(obj, j10, (1 << (iZzn >>> 20)) | zzix.zzc(obj, j10));
    }

    private final void zzD(Object obj, int i10, int i11) {
        zzix.zzn(obj, zzn(i11) & 1048575, i10);
    }

    private final void zzE(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzq(i10) & 1048575, obj2);
        zzC(obj, i10);
    }

    private final void zzF(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzq(i11) & 1048575, obj2);
        zzD(obj, i10, i11);
    }

    private final boolean zzG(Object obj, Object obj2, int i10) {
        return zzH(obj, i10) == zzH(obj2, i10);
    }

    private final boolean zzH(Object obj, int i10) {
        int iZzn = zzn(i10);
        long j10 = iZzn & 1048575;
        if (j10 != 1048575) {
            return (zzix.zzc(obj, j10) & (1 << (iZzn >>> 20))) != 0;
        }
        int iZzq = zzq(i10);
        long j11 = iZzq & 1048575;
        switch (zzp(iZzq)) {
            case 0:
                return Double.doubleToRawLongBits(zzix.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzix.zzb(obj, j11)) != 0;
            case 2:
                return zzix.zzd(obj, j11) != 0;
            case 3:
                return zzix.zzd(obj, j11) != 0;
            case 4:
                return zzix.zzc(obj, j11) != 0;
            case 5:
                return zzix.zzd(obj, j11) != 0;
            case 6:
                return zzix.zzc(obj, j11) != 0;
            case 7:
                return zzix.zzt(obj, j11);
            case 8:
                Object objZzf = zzix.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzfp) {
                    return !zzfp.zza.equals(objZzf);
                }
                return zzN();
            case 9:
                return zzix.zzf(obj, j11) != null;
            case 10:
                return !zzfp.zza.equals(zzix.zzf(obj, j11));
            case 11:
                return zzix.zzc(obj, j11) != 0;
            case 12:
                return zzix.zzc(obj, j11) != 0;
            case 13:
                return zzix.zzc(obj, j11) != 0;
            case 14:
                return zzix.zzd(obj, j11) != 0;
            case 15:
                return zzix.zzc(obj, j11) != 0;
            case 16:
                return zzix.zzd(obj, j11) != 0;
            case 17:
                return zzix.zzf(obj, j11) != null;
            default:
                return zzN();
        }
    }

    private final boolean zzI(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzH(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzJ(Object obj, int i10, zzib zzibVar) {
        return zzibVar.zzk(zzix.zzf(obj, i10 & 1048575));
    }

    private static boolean zzK(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgp) {
            return ((zzgp) obj).zzF();
        }
        return true;
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        long jZzn = zzn(i10) & 1048575;
        return zzix.zzc(obj, jZzn) == zzix.zzc(obj2, jZzn);
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzix.zzc(obj, (long) (zzn(i11) & 1048575)) == i10;
    }

    private boolean zzN() {
        throw new IllegalArgumentException();
    }

    private static final int zzO(byte[] bArr, int i10, int i11, zzjg zzjgVar, Class cls, zzfd zzfdVar) {
        zzjg zzjgVar2 = zzjg.zza;
        switch (zzjgVar.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                zzfdVar.zzc = Double.valueOf(Double.longBitsToDouble(zzfe.zzp(bArr, i10)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                zzfdVar.zzc = Float.valueOf(Float.intBitsToFloat(zzfe.zzb(bArr, i10)));
                return i13;
            case 2:
            case 3:
                int iZzl = zzfe.zzl(bArr, i10, zzfdVar);
                zzfdVar.zzc = Long.valueOf(zzfdVar.zzb);
                return iZzl;
            case 4:
            case 12:
            case 13:
                int iZzi = zzfe.zzi(bArr, i10, zzfdVar);
                zzfdVar.zzc = Integer.valueOf(zzfdVar.zza);
                return iZzi;
            case 5:
            case 15:
                int i14 = i10 + 8;
                zzfdVar.zzc = Long.valueOf(zzfe.zzp(bArr, i10));
                return i14;
            case 6:
            case 14:
                int i15 = i10 + 4;
                zzfdVar.zzc = Integer.valueOf(zzfe.zzb(bArr, i10));
                return i15;
            case 7:
                int iZzl2 = zzfe.zzl(bArr, i10, zzfdVar);
                zzfdVar.zzc = Boolean.valueOf(zzfdVar.zzb != 0);
                return iZzl2;
            case 8:
                return zzfe.zzg(bArr, i10, zzfdVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzfe.zzd(zzhy.zza().zzb(cls), bArr, i10, i11, zzfdVar);
            case 11:
                return zzfe.zza(bArr, i10, zzfdVar);
            case 16:
                int iZzi2 = zzfe.zzi(bArr, i10, zzfdVar);
                zzfdVar.zzc = Integer.valueOf(zzft.zzb(zzfdVar.zza));
                return iZzi2;
            case 17:
                int iZzl3 = zzfe.zzl(bArr, i10, zzfdVar);
                zzfdVar.zzc = Long.valueOf(zzft.zzc(zzfdVar.zzb));
                return iZzl3;
        }
    }

    private static final void zzP(int i10, Object obj, zzji zzjiVar) {
        if (obj instanceof String) {
            zzjiVar.zzH(i10, (String) obj);
        } else {
            zzjiVar.zzd(i10, (zzfp) obj);
        }
    }

    static zzir zzd(Object obj) {
        zzgp zzgpVar = (zzgp) obj;
        zzir zzirVar = zzgpVar.zzc;
        if (zzirVar != zzir.zzc()) {
            return zzirVar;
        }
        zzir zzirVarZzf = zzir.zzf();
        zzgpVar.zzc = zzirVarZzf;
        return zzirVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0260  */
    /* JADX WARN: Code duplicated, block: B:129:0x0264  */
    /* JADX WARN: Code duplicated, block: B:132:0x0282  */
    /* JADX WARN: Code duplicated, block: B:134:0x0286  */
    static zzhu zzl(Class cls, zzhp zzhpVar, zzhw zzhwVar, zzhe zzheVar, zziq zziqVar, zzgd zzgdVar, zzhn zzhnVar) {
        int i10;
        int iCharAt;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char cCharAt;
        int i17;
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
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        Field fieldZzy;
        int i31;
        char cCharAt8;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field fieldZzy2;
        int i38;
        Object obj2;
        Field fieldZzy3;
        int i39;
        char cCharAt9;
        int i40;
        char cCharAt10;
        int i41;
        char cCharAt11;
        int i42;
        char cCharAt12;
        Unsafe unsafe = zzb;
        if (unsafe == null) {
            throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
        }
        if (!(zzhpVar instanceof zzia)) {
            throw null;
        }
        zzia zziaVar = (zzia) zzhpVar;
        String strZzd = zziaVar.zzd();
        int length = strZzd.length();
        int i43 = 0;
        char c10 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i44 = 1;
            while (true) {
                i10 = i44 + 1;
                if (strZzd.charAt(i44) < 55296) {
                    break;
                }
                i44 = i10;
            }
        } else {
            i10 = 1;
        }
        int i45 = i10 + 1;
        int iCharAt2 = strZzd.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i46 = iCharAt2 & 8191;
            int i47 = 13;
            while (true) {
                i42 = i45 + 1;
                cCharAt12 = strZzd.charAt(i45);
                if (cCharAt12 < 55296) {
                    break;
                }
                i46 |= (cCharAt12 & 8191) << i47;
                i47 += 13;
                i45 = i42;
            }
            iCharAt2 = i46 | (cCharAt12 << i47);
            i45 = i42;
        }
        if (iCharAt2 == 0) {
            iCharAt = 0;
            i14 = 0;
            i15 = 0;
            i11 = 0;
            i13 = 0;
            iArr = zza;
            i12 = 0;
        } else {
            int i48 = i45 + 1;
            int iCharAt3 = strZzd.charAt(i45);
            if (iCharAt3 >= 55296) {
                int i49 = iCharAt3 & 8191;
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
                iCharAt3 = i49 | (cCharAt7 << i50);
                i48 = i23;
            }
            int i51 = i48 + 1;
            int iCharAt4 = strZzd.charAt(i48);
            if (iCharAt4 >= 55296) {
                int i52 = iCharAt4 & 8191;
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
                iCharAt4 = i52 | (cCharAt6 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            int iCharAt5 = strZzd.charAt(i51);
            if (iCharAt5 >= 55296) {
                int i55 = iCharAt5 & 8191;
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
                iCharAt5 = i55 | (cCharAt5 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            int iCharAt6 = strZzd.charAt(i54);
            if (iCharAt6 >= 55296) {
                int i58 = iCharAt6 & 8191;
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
                iCharAt6 = i58 | (cCharAt4 << i59);
                i57 = i20;
            }
            int i60 = i57 + 1;
            iCharAt = strZzd.charAt(i57);
            if (iCharAt >= 55296) {
                int i61 = iCharAt & 8191;
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
                iCharAt = i61 | (cCharAt3 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int iCharAt7 = strZzd.charAt(i60);
            if (iCharAt7 >= 55296) {
                int i64 = iCharAt7 & 8191;
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
                iCharAt7 = i64 | (cCharAt2 << i65);
                i63 = i18;
            }
            int i66 = i63 + 1;
            if (strZzd.charAt(i63) >= 55296) {
                while (true) {
                    i17 = i66 + 1;
                    if (strZzd.charAt(i66) < 55296) {
                        break;
                    }
                    i66 = i17;
                }
                i66 = i17;
            }
            int i67 = i66 + 1;
            int iCharAt8 = strZzd.charAt(i66);
            if (iCharAt8 >= 55296) {
                int i68 = iCharAt8 & 8191;
                int i69 = 13;
                while (true) {
                    i16 = i67 + 1;
                    cCharAt = strZzd.charAt(i67);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i68 |= (cCharAt & 8191) << i69;
                    i69 += 13;
                    i67 = i16;
                }
                iCharAt8 = i68 | (cCharAt << i69);
                i67 = i16;
            }
            i11 = iCharAt3 + iCharAt3 + iCharAt4;
            i43 = iCharAt3;
            iArr = new int[iCharAt8 + iCharAt7 + iCharAt3];
            i12 = iCharAt7;
            i45 = i67;
            i13 = iCharAt8;
            i14 = iCharAt5;
            i15 = iCharAt6;
        }
        Object[] objArrZze = zziaVar.zze();
        Class<?> cls2 = zziaVar.zza().getClass();
        int i70 = i13 + i12;
        int i71 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i71];
        int i72 = i13;
        int i73 = i70;
        int i74 = 0;
        int i75 = 0;
        while (i45 < length) {
            int i76 = i45 + 1;
            int iCharAt9 = strZzd.charAt(i45);
            if (iCharAt9 >= c10) {
                int i77 = iCharAt9 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i41 = i78 + 1;
                    cCharAt11 = strZzd.charAt(i78);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i77 |= (cCharAt11 & 8191) << i79;
                    i79 += 13;
                    i78 = i41;
                }
                iCharAt9 = i77 | (cCharAt11 << i79);
                i24 = i41;
            } else {
                i24 = i76;
            }
            int i80 = i24 + 1;
            int iCharAt10 = strZzd.charAt(i24);
            if (iCharAt10 >= c10) {
                int i81 = iCharAt10 & 8191;
                int i82 = i80;
                int i83 = 13;
                while (true) {
                    i40 = i82 + 1;
                    cCharAt10 = strZzd.charAt(i82);
                    if (cCharAt10 < c10) {
                        break;
                    }
                    i81 |= (cCharAt10 & 8191) << i83;
                    i83 += 13;
                    i82 = i40;
                }
                iCharAt10 = i81 | (cCharAt10 << i83);
                i25 = i40;
            } else {
                i25 = i80;
            }
            if ((iCharAt10 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            int i84 = iCharAt10 & 255;
            zzia zziaVar2 = zziaVar;
            int i85 = iCharAt10 & 2048;
            if (i84 >= 51) {
                int i86 = i25 + 1;
                int iCharAt11 = strZzd.charAt(i25);
                char c11 = 55296;
                if (iCharAt11 >= 55296) {
                    int i87 = iCharAt11 & 8191;
                    int i88 = i86;
                    int i89 = 13;
                    while (true) {
                        i39 = i88 + 1;
                        cCharAt9 = strZzd.charAt(i88);
                        if (cCharAt9 < c11) {
                            break;
                        }
                        i87 |= (cCharAt9 & 8191) << i89;
                        i89 += 13;
                        i88 = i39;
                        c11 = 55296;
                    }
                    iCharAt11 = i87 | (cCharAt9 << i89);
                    i34 = i39;
                } else {
                    i34 = i86;
                }
                int i90 = i34;
                int i91 = i84 - 51;
                i26 = length;
                if (i91 == 9 || i91 == 17) {
                    i35 = i11 + 1;
                    int i92 = i75 / 3;
                    objArr[i92 + i92 + 1] = objArrZze[i11];
                } else {
                    if (i91 != 12) {
                        i36 = i85;
                    } else if (zziaVar2.zzc() == 1 || i85 != 0) {
                        i35 = i11 + 1;
                        int i93 = i75 / 3;
                        objArr[i93 + i93 + 1] = objArrZze[i11];
                    } else {
                        i36 = 0;
                    }
                    i37 = iCharAt11 + iCharAt11;
                    obj = objArrZze[i37];
                    int i94 = i36;
                    if (obj instanceof Field) {
                        fieldZzy2 = (Field) obj;
                    } else {
                        fieldZzy2 = zzy(cls2, (String) obj);
                        objArrZze[i37] = fieldZzy2;
                        iArr[i73] = i75;
                        i73++;
                    }
                    int i95 = i43;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzy2);
                    i38 = i37 + 1;
                    obj2 = objArrZze[i38];
                    i27 = i95;
                    if (obj2 instanceof Field) {
                        fieldZzy3 = (Field) obj2;
                    } else {
                        fieldZzy3 = zzy(cls2, (String) obj2);
                        objArrZze[i38] = fieldZzy3;
                    }
                    i25 = i90;
                    i30 = 0;
                    i28 = i11;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzy3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i29 = i94;
                }
                i11 = i35;
                i36 = i85;
                i37 = iCharAt11 + iCharAt11;
                obj = objArrZze[i37];
                int i96 = i36;
                if (obj instanceof Field) {
                    fieldZzy2 = (Field) obj;
                } else {
                    fieldZzy2 = zzy(cls2, (String) obj);
                    objArrZze[i37] = fieldZzy2;
                    iArr[i73] = i75;
                    i73++;
                }
                int i97 = i43;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzy2);
                i38 = i37 + 1;
                obj2 = objArrZze[i38];
                i27 = i97;
                if (obj2 instanceof Field) {
                    fieldZzy3 = (Field) obj2;
                } else {
                    fieldZzy3 = zzy(cls2, (String) obj2);
                    objArrZze[i38] = fieldZzy3;
                }
                i25 = i90;
                i30 = 0;
                i28 = i11;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzy3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i29 = i96;
            } else {
                i26 = length;
                i27 = i43;
                int i98 = i11 + 1;
                Field fieldZzy4 = zzy(cls2, (String) objArrZze[i11]);
                if (i84 == 9 || i84 == 17) {
                    i28 = i98;
                    int i99 = i75 / 3;
                    objArr[i99 + i99 + 1] = fieldZzy4.getType();
                } else {
                    if (i84 == 27) {
                        i32 = 1;
                        i33 = i11 + 2;
                    } else if (i84 == 49) {
                        i33 = i11 + 2;
                        i32 = 1;
                    } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                        i28 = i98;
                        if (zziaVar2.zzc() == 1 || i85 != 0) {
                            i33 = i11 + 2;
                            int i100 = i75 / 3;
                            objArr[i100 + i100 + 1] = objArrZze[i28];
                            i28 = i33;
                        } else {
                            i85 = 0;
                        }
                    } else if (i84 == 50) {
                        int i101 = i11 + 2;
                        int i102 = i72 + 1;
                        iArr[i72] = i75;
                        int i103 = i75 / 3;
                        int i104 = i103 + i103;
                        objArr[i104] = objArrZze[i98];
                        if (i85 != 0) {
                            i98 = i11 + 3;
                            objArr[i104 + 1] = objArrZze[i101];
                            i72 = i102;
                            i28 = i98;
                        } else {
                            i72 = i102;
                            i85 = 0;
                            i28 = i101;
                        }
                    } else {
                        i28 = i98;
                    }
                    int i105 = i75 / 3;
                    objArr[i105 + i105 + i32] = objArrZze[i98];
                    i28 = i33;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzy4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) == 0 || i84 > 17) {
                    i29 = i85;
                    i30 = 0;
                } else {
                    int i106 = i25 + 1;
                    int iCharAt12 = strZzd.charAt(i25);
                    if (iCharAt12 >= 55296) {
                        int i107 = iCharAt12 & 8191;
                        int i108 = 13;
                        while (true) {
                            i31 = i106 + 1;
                            cCharAt8 = strZzd.charAt(i106);
                            if (cCharAt8 < 55296) {
                                break;
                            }
                            i107 |= (cCharAt8 & 8191) << i108;
                            i108 += 13;
                            i106 = i31;
                        }
                        iCharAt12 = i107 | (cCharAt8 << i108);
                        i106 = i31;
                    }
                    int i109 = i27 + i27 + (iCharAt12 / 32);
                    Object obj3 = objArrZze[i109];
                    if (obj3 instanceof Field) {
                        fieldZzy = (Field) obj3;
                    } else {
                        fieldZzy = zzy(cls2, (String) obj3);
                        objArrZze[i109] = fieldZzy;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzy);
                    i30 = iCharAt12 % 32;
                    i29 = i85;
                    iObjectFieldOffset = iObjectFieldOffset;
                    i25 = i106;
                }
            }
            int i110 = i75 + 1;
            iArr2[i75] = iCharAt9;
            int i111 = i75 + 2;
            iArr2[i110] = ((iCharAt10 & 512) != 0 ? 536870912 : 0) | ((iCharAt10 & 256) != 0 ? 268435456 : 0) | (i29 != 0 ? Integer.MIN_VALUE : 0) | (i84 << 20) | iObjectFieldOffset;
            i75 += 3;
            iArr2[i111] = (i30 << 20) | iObjectFieldOffset2;
            i45 = i25;
            zziaVar = zziaVar2;
            i11 = i28;
            strZzd = strZzd;
            length = i26;
            i43 = i27;
            c10 = 55296;
        }
        return new zzhu(iArr2, objArr, i14, i15, zziaVar.zza(), false, iArr, i13, i70, zzhwVar, zzheVar, zziqVar, zzgdVar, zzhnVar);
    }

    private static int zzm(Object obj, long j10) {
        return ((Integer) zzix.zzf(obj, j10)).intValue();
    }

    private final int zzn(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzo(int i10, int i11) {
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

    private static int zzp(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzq(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzr(Object obj, long j10) {
        return ((Long) zzix.zzf(obj, j10)).longValue();
    }

    private final zzgs zzs(int i10) {
        int i11 = i10 / 3;
        return (zzgs) this.zzd[i11 + i11 + 1];
    }

    private final zzib zzt(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzib zzibVar = (zzib) objArr[i12];
        if (zzibVar != null) {
            return zzibVar;
        }
        zzib zzibVarZzb = zzhy.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzibVarZzb;
        return zzibVarZzb;
    }

    private final Object zzu(Object obj, int i10, Object obj2, zziq zziqVar, Object obj3) {
        zzgs zzgsVarZzs;
        int i11 = this.zzc[i10];
        Object objZzf = zzix.zzf(obj, zzq(i10) & 1048575);
        if (objZzf == null || (zzgsVarZzs = zzs(i10)) == null) {
            return obj2;
        }
        zzhk zzhkVarZzc = ((zzhl) zzv(i10)).zzc();
        Iterator it = ((zzhm) objZzf).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzgsVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzis.zza(obj3);
                }
                int iZzb = zzhl.zzb(zzhkVarZzc, entry.getKey(), entry.getValue());
                zzfp zzfpVar = zzfp.zza;
                byte[] bArr = new byte[iZzb];
                zzfu zzfuVar = new zzfu(bArr, 0, iZzb);
                try {
                    zzhl.zze(zzfuVar, zzhkVarZzc, entry.getKey(), entry.getValue());
                    ((zzir) obj2).zzj((i11 << 3) | 2, zzfl.zza(zzfuVar, bArr));
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    private final Object zzv(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzw(Object obj, int i10) {
        zzib zzibVarZzt = zzt(i10);
        int iZzq = zzq(i10) & 1048575;
        if (!zzH(obj, i10)) {
            return zzibVarZzt.zze();
        }
        Object object = zzb.getObject(obj, iZzq);
        if (zzK(object)) {
            return object;
        }
        Object objZze = zzibVarZzt.zze();
        if (object != null) {
            zzibVarZzt.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzx(Object obj, int i10, int i11) {
        zzib zzibVarZzt = zzt(i11);
        if (!zzM(obj, i10, i11)) {
            return zzibVarZzt.zze();
        }
        Object object = zzb.getObject(obj, zzq(i11) & 1048575);
        if (zzK(object)) {
            return object;
        }
        Object objZze = zzibVarZzt.zze();
        if (object != null) {
            zzibVarZzt.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzy(Class cls, String str) {
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

    private static void zzz(Object obj) {
        if (!zzK(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    @Override // com.google.android.gms.internal.play_billing.zzib
    public final int zza(Object obj) {
        int i10;
        int iZzy;
        int iZzy2;
        int iZzz;
        int iZzy3;
        int iZzy4;
        int iZzy5;
        int iZzb;
        int iZzy6;
        int iZzy7;
        int iZzi;
        int iZzy8;
        int iZza;
        int iZzh;
        int size;
        int iZzl;
        int iZzy9;
        int iZzb2;
        int iZzy10;
        int iZzb3;
        int iZzy11;
        int iZzy12;
        int iZzy13;
        int iZzz2;
        int iZzf;
        int iZzy14;
        int iZzy15;
        int iZza2;
        int iZzy16;
        int iZzy17;
        zzhu<T> zzhuVar = this;
        Unsafe unsafe = zzb;
        int i11 = 0;
        int i12 = 0;
        int iZzy18 = 0;
        int i13 = 1048575;
        while (true) {
            int[] iArr = zzhuVar.zzc;
            if (i11 >= iArr.length) {
                int iZza3 = iZzy18 + ((zzgp) obj).zzc.zza();
                if (!zzhuVar.zzh) {
                    return iZza3;
                }
                zzii zziiVar = ((zzgm) obj).zzb.zza;
                int iZzc = zziiVar.zzc();
                int iZzc2 = 0;
                for (int i14 = 0; i14 < iZzc; i14++) {
                    Map.Entry entryZzg = zziiVar.zzg(i14);
                    iZzc2 += zzgh.zzc(((zzie) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zziiVar.zzd()) {
                    iZzc2 += zzgh.zzc((zzgg) entry.getKey(), entry.getValue());
                }
                return iZza3 + iZzc2;
            }
            int iZzq = zzhuVar.zzq(i11);
            int iZzp = zzp(iZzq);
            int i15 = iArr[i11];
            int i16 = iArr[i11 + 2];
            int i17 = i16 & 1048575;
            if (iZzp <= 17) {
                if (i17 != i13) {
                    i12 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            int i18 = iZzq & 1048575;
            if (iZzp >= zzgi.zzJ.zza()) {
                zzgi.zzW.zza();
            }
            long j10 = i18;
            switch (iZzp) {
                case 0:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZzy18 += zzfx.zzy(i15 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZzy = zzfx.zzy(i15 << 3);
                        iZzy4 = iZzy + 4;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 2:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iZzy2 = zzfx.zzy(i15 << 3);
                        iZzz = zzfx.zzz(j11);
                        iZzy4 = iZzy2 + iZzz;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 3:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        long j12 = unsafe.getLong(obj, j10);
                        iZzy2 = zzfx.zzy(i15 << 3);
                        iZzz = zzfx.zzz(j12);
                        iZzy4 = iZzy2 + iZzz;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 4:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        long j13 = unsafe.getInt(obj, j10);
                        iZzy2 = zzfx.zzy(i15 << 3);
                        iZzz = zzfx.zzz(j13);
                        iZzy4 = iZzy2 + iZzz;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 5:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZzy3 = zzfx.zzy(i15 << 3);
                        iZzy4 = iZzy3 + 8;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 6:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZzy = zzfx.zzy(i15 << 3);
                        iZzy4 = iZzy + 4;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 7:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZzy4 = zzfx.zzy(i15 << 3) + 1;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 8:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzfp) {
                            iZzy5 = zzfx.zzy(i19);
                            iZzb = ((zzfp) object).zzd();
                            iZzy6 = zzfx.zzy(iZzb);
                        } else {
                            iZzy5 = zzfx.zzy(i19);
                            int i20 = zzjc.zza;
                            iZzb = zziz.zzb((String) object);
                            iZzy6 = zzfx.zzy(iZzb);
                        }
                        iZzy4 = iZzy5 + iZzy6 + iZzb;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 9:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        int i21 = i15 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        zzib zzibVarZzt = zzhuVar.zzt(i11);
                        int i22 = zzic.zza;
                        iZzy7 = zzfx.zzy(i21);
                        iZzi = ((zzfa) object2).zzi(zzibVarZzt);
                        iZzy8 = zzfx.zzy(iZzi);
                        iZza = iZzy7 + iZzy8 + iZzi;
                        iZzy18 += iZza;
                    }
                    break;
                case 10:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        zzfp zzfpVar = (zzfp) unsafe.getObject(obj, j10);
                        iZzy5 = zzfx.zzy(i15 << 3);
                        iZzb = zzfpVar.zzd();
                        iZzy6 = zzfx.zzy(iZzb);
                        iZzy4 = iZzy5 + iZzy6 + iZzb;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 11:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        int i23 = unsafe.getInt(obj, j10);
                        iZzy2 = zzfx.zzy(i15 << 3);
                        iZzz = zzfx.zzy(i23);
                        iZzy4 = iZzy2 + iZzz;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 12:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        long j14 = unsafe.getInt(obj, j10);
                        iZzy2 = zzfx.zzy(i15 << 3);
                        iZzz = zzfx.zzz(j14);
                        iZzy4 = iZzy2 + iZzz;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 13:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZzy = zzfx.zzy(i15 << 3);
                        iZzy4 = iZzy + 4;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 14:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZzy3 = zzfx.zzy(i15 << 3);
                        iZzy4 = iZzy3 + 8;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 15:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        int i24 = unsafe.getInt(obj, j10);
                        iZzy2 = zzfx.zzy(i15 << 3);
                        iZzz = zzfx.zzy((i24 >> 31) ^ (i24 + i24));
                        iZzy4 = iZzy2 + iZzz;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 16:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        long j15 = unsafe.getLong(obj, j10);
                        iZzy2 = zzfx.zzy(i15 << 3);
                        iZzz = zzfx.zzz((j15 >> 63) ^ (j15 + j15));
                        iZzy4 = iZzy2 + iZzz;
                        iZzy18 += iZzy4;
                    }
                    zzhuVar = this;
                    break;
                case 17:
                    if (zzhuVar.zzI(obj, i11, i13, i12, i10)) {
                        iZza = zzic.zza(i15, (zzhr) unsafe.getObject(obj, j10), zzhuVar.zzt(i11));
                        iZzy18 += iZza;
                    }
                    break;
                case 18:
                    iZza = zzic.zze(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzy18 += iZza;
                    break;
                case 19:
                    iZza = zzic.zzc(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzy18 += iZza;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i25 = zzic.zza;
                    if (list.size() == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = zzic.zzh(list) + (list.size() * zzfx.zzy(i15 << 3));
                    }
                    iZzy18 += iZzh;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i26 = zzic.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZza = 0;
                    } else {
                        iZzl = zzic.zzl(list2);
                        iZzy9 = zzfx.zzy(i15 << 3);
                        iZzz2 = size * iZzy9;
                        iZza = iZzl + iZzz2;
                    }
                    iZzy18 += iZza;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i27 = zzic.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZza = 0;
                    } else {
                        iZzl = zzic.zzg(list3);
                        iZzy9 = zzfx.zzy(i15 << 3);
                        iZzz2 = size * iZzy9;
                        iZza = iZzl + iZzz2;
                    }
                    iZzy18 += iZza;
                    break;
                case 23:
                    iZza = zzic.zze(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzy18 += iZza;
                    break;
                case 24:
                    iZza = zzic.zzc(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzy18 += iZza;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i28 = zzic.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZza = 0;
                    } else {
                        iZza = size2 * (zzfx.zzy(i15 << 3) + 1);
                    }
                    iZzy18 += iZza;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i29 = zzic.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = zzfx.zzy(i15 << 3) * size3;
                        if (list5 instanceof zzhd) {
                            zzhd zzhdVar = (zzhd) list5;
                            for (int i30 = 0; i30 < size3; i30++) {
                                Object objZza = zzhdVar.zza();
                                if (objZza instanceof zzfp) {
                                    iZzb3 = ((zzfp) objZza).zzd();
                                    iZzy11 = zzfx.zzy(iZzb3);
                                } else {
                                    int i31 = zzjc.zza;
                                    iZzb3 = zziz.zzb((String) objZza);
                                    iZzy11 = zzfx.zzy(iZzb3);
                                }
                                iZzh += iZzy11 + iZzb3;
                            }
                        } else {
                            for (int i32 = 0; i32 < size3; i32++) {
                                Object obj2 = list5.get(i32);
                                if (obj2 instanceof zzfp) {
                                    iZzb2 = ((zzfp) obj2).zzd();
                                    iZzy10 = zzfx.zzy(iZzb2);
                                } else {
                                    int i33 = zzjc.zza;
                                    iZzb2 = zziz.zzb((String) obj2);
                                    iZzy10 = zzfx.zzy(iZzb2);
                                }
                                iZzh += iZzy10 + iZzb2;
                            }
                        }
                    }
                    iZzy18 += iZzh;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    zzib zzibVarZzt2 = zzhuVar.zzt(i11);
                    int i34 = zzic.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzy12 = 0;
                    } else {
                        iZzy12 = zzfx.zzy(i15 << 3) * size4;
                        for (int i35 = 0; i35 < size4; i35++) {
                            int iZzi2 = ((zzfa) list6.get(i35)).zzi(zzibVarZzt2);
                            iZzy12 += zzfx.zzy(iZzi2) + iZzi2;
                        }
                    }
                    iZzy18 += iZzy12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i36 = zzic.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzy13 = 0;
                    } else {
                        iZzy13 = size5 * zzfx.zzy(i15 << 3);
                        for (int i37 = 0; i37 < list7.size(); i37++) {
                            int iZzd = ((zzfp) list7.get(i37)).zzd();
                            iZzy13 += zzfx.zzy(iZzd) + iZzd;
                        }
                    }
                    iZzy18 += iZzy13;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i38 = zzic.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZza = 0;
                    } else {
                        iZzl = zzic.zzk(list8);
                        iZzy9 = zzfx.zzy(i15 << 3);
                        iZzz2 = size * iZzy9;
                        iZza = iZzl + iZzz2;
                    }
                    iZzy18 += iZza;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i39 = zzic.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZza = 0;
                    } else {
                        iZzl = zzic.zzb(list9);
                        iZzy9 = zzfx.zzy(i15 << 3);
                        iZzz2 = size * iZzy9;
                        iZza = iZzl + iZzz2;
                    }
                    iZzy18 += iZza;
                    break;
                case 31:
                    iZza = zzic.zzc(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzy18 += iZza;
                    break;
                case 32:
                    iZza = zzic.zze(i15, (List) unsafe.getObject(obj, j10), false);
                    iZzy18 += iZza;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i40 = zzic.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZza = 0;
                    } else {
                        iZzl = zzic.zzi(list10);
                        iZzy9 = zzfx.zzy(i15 << 3);
                        iZzz2 = size * iZzy9;
                        iZza = iZzl + iZzz2;
                    }
                    iZzy18 += iZza;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i41 = zzic.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZza = 0;
                    } else {
                        iZzl = zzic.zzj(list11);
                        iZzy9 = zzfx.zzy(i15 << 3);
                        iZzz2 = size * iZzy9;
                        iZza = iZzl + iZzz2;
                    }
                    iZzy18 += iZza;
                    break;
                case 35:
                    iZzf = zzic.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 36:
                    iZzf = zzic.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 37:
                    iZzf = zzic.zzh((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 38:
                    iZzf = zzic.zzl((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 39:
                    iZzf = zzic.zzg((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 40:
                    iZzf = zzic.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 41:
                    iZzf = zzic.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i42 = zzic.zza;
                    iZzf = list12.size();
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 43:
                    iZzf = zzic.zzk((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 44:
                    iZzf = zzic.zzb((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case SDK_INIT_API_VALUE:
                    iZzf = zzic.zzd((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case AD_START_EVENT_VALUE:
                    iZzf = zzic.zzf((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case AD_CLICK_EVENT_VALUE:
                    iZzf = zzic.zzi((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 48:
                    iZzf = zzic.zzj((List) unsafe.getObject(obj, j10));
                    if (iZzf > 0) {
                        iZzy14 = zzfx.zzy(i15 << 3);
                        iZzy15 = zzfx.zzy(iZzf);
                        iZzy13 = iZzy14 + iZzy15 + iZzf;
                        iZzy18 += iZzy13;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    zzib zzibVarZzt3 = zzhuVar.zzt(i11);
                    int i43 = zzic.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZza2 = 0;
                    } else {
                        iZza2 = 0;
                        for (int i44 = 0; i44 < size6; i44++) {
                            iZza2 += zzic.zza(i15, (zzhr) list13.get(i44), zzibVarZzt3);
                        }
                    }
                    iZzy18 += iZza2;
                    break;
                case 50:
                    zzhm zzhmVar = (zzhm) unsafe.getObject(obj, j10);
                    zzhl zzhlVar = (zzhl) zzhuVar.zzv(i11);
                    if (zzhmVar.isEmpty()) {
                        iZzh = 0;
                    } else {
                        iZzh = 0;
                        for (Map.Entry entry2 : zzhmVar.entrySet()) {
                            iZzh += zzhlVar.zza(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzy18 += iZzh;
                    break;
                case 51:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZzy16 = zzfx.zzy(i15 << 3);
                        iZza = iZzy16 + 8;
                        iZzy18 += iZza;
                    }
                    break;
                case 52:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZzy17 = zzfx.zzy(i15 << 3);
                        iZza = iZzy17 + 4;
                        iZzy18 += iZza;
                    }
                    break;
                case 53:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        long jZzr = zzr(obj, j10);
                        iZzl = zzfx.zzy(i15 << 3);
                        iZzz2 = zzfx.zzz(jZzr);
                        iZza = iZzl + iZzz2;
                        iZzy18 += iZza;
                    }
                    break;
                case 54:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        long jZzr2 = zzr(obj, j10);
                        iZzl = zzfx.zzy(i15 << 3);
                        iZzz2 = zzfx.zzz(jZzr2);
                        iZza = iZzl + iZzz2;
                        iZzy18 += iZza;
                    }
                    break;
                case 55:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        long jZzm = zzm(obj, j10);
                        iZzl = zzfx.zzy(i15 << 3);
                        iZzz2 = zzfx.zzz(jZzm);
                        iZza = iZzl + iZzz2;
                        iZzy18 += iZza;
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZzy16 = zzfx.zzy(i15 << 3);
                        iZza = iZzy16 + 8;
                        iZzy18 += iZza;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZzy17 = zzfx.zzy(i15 << 3);
                        iZza = iZzy17 + 4;
                        iZzy18 += iZza;
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZza = zzfx.zzy(i15 << 3) + 1;
                        iZzy18 += iZza;
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        int i45 = i15 << 3;
                        Object object3 = unsafe.getObject(obj, j10);
                        if (object3 instanceof zzfp) {
                            iZzy7 = zzfx.zzy(i45);
                            iZzi = ((zzfp) object3).zzd();
                            iZzy8 = zzfx.zzy(iZzi);
                        } else {
                            iZzy7 = zzfx.zzy(i45);
                            int i46 = zzjc.zza;
                            iZzi = zziz.zzb((String) object3);
                            iZzy8 = zzfx.zzy(iZzi);
                        }
                        iZza = iZzy7 + iZzy8 + iZzi;
                        iZzy18 += iZza;
                    }
                    break;
                case 60:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        int i47 = i15 << 3;
                        Object object4 = unsafe.getObject(obj, j10);
                        zzib zzibVarZzt4 = zzhuVar.zzt(i11);
                        int i48 = zzic.zza;
                        iZzy7 = zzfx.zzy(i47);
                        iZzi = ((zzfa) object4).zzi(zzibVarZzt4);
                        iZzy8 = zzfx.zzy(iZzi);
                        iZza = iZzy7 + iZzy8 + iZzi;
                        iZzy18 += iZza;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        zzfp zzfpVar2 = (zzfp) unsafe.getObject(obj, j10);
                        iZzy7 = zzfx.zzy(i15 << 3);
                        iZzi = zzfpVar2.zzd();
                        iZzy8 = zzfx.zzy(iZzi);
                        iZza = iZzy7 + iZzy8 + iZzi;
                        iZzy18 += iZza;
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        int iZzm = zzm(obj, j10);
                        iZzl = zzfx.zzy(i15 << 3);
                        iZzz2 = zzfx.zzy(iZzm);
                        iZza = iZzl + iZzz2;
                        iZzy18 += iZza;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        long jZzm2 = zzm(obj, j10);
                        iZzl = zzfx.zzy(i15 << 3);
                        iZzz2 = zzfx.zzz(jZzm2);
                        iZza = iZzl + iZzz2;
                        iZzy18 += iZza;
                    }
                    break;
                case 64:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZzy17 = zzfx.zzy(i15 << 3);
                        iZza = iZzy17 + 4;
                        iZzy18 += iZza;
                    }
                    break;
                case 65:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZzy16 = zzfx.zzy(i15 << 3);
                        iZza = iZzy16 + 8;
                        iZzy18 += iZza;
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        int iZzm2 = zzm(obj, j10);
                        iZzl = zzfx.zzy(i15 << 3);
                        iZzz2 = zzfx.zzy((iZzm2 >> 31) ^ (iZzm2 + iZzm2));
                        iZza = iZzl + iZzz2;
                        iZzy18 += iZza;
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        long jZzr3 = zzr(obj, j10);
                        iZzl = zzfx.zzy(i15 << 3);
                        iZzz2 = zzfx.zzz((jZzr3 >> 63) ^ (jZzr3 + jZzr3));
                        iZza = iZzl + iZzz2;
                        iZzy18 += iZza;
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i11)) {
                        iZza = zzic.zza(i15, (zzhr) unsafe.getObject(obj, j10), zzhuVar.zzt(i11));
                        iZzy18 += iZza;
                    }
                    break;
            }
            i11 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int iHashCode = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int iZzq = zzq(i12);
            int iZzp = zzp(iZzq);
            if (iZzp <= 50 || iZzp >= 69) {
                long j10 = iZzq & 1048575;
                int iHashCode2 = 37;
                switch (iZzp) {
                    case 0:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzix.zza(obj, j10));
                        byte[] bArr = zzgv.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 1:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzix.zzb(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzix.zzd(obj, j10);
                        byte[] bArr2 = zzgv.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzix.zzd(obj, j10);
                        byte[] bArr3 = zzgv.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 4:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzix.zzd(obj, j10);
                        byte[] bArr4 = zzgv.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 6:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzgv.zza(zzix.zzt(obj, j10));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 8:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = ((String) zzix.zzf(obj, j10)).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 9:
                        i11 = iHashCode * 53;
                        Object objZzf = zzix.zzf(obj, j10);
                        if (objZzf != null) {
                            iHashCode2 = objZzf.hashCode();
                        }
                        iHashCode = i11 + iHashCode2;
                        break;
                    case 10:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzf(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 11:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 12:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 13:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzix.zzd(obj, j10);
                        byte[] bArr5 = zzgv.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 15:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzc(obj, j10);
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = zzix.zzd(obj, j10);
                        byte[] bArr6 = zzgv.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 17:
                        i11 = iHashCode * 53;
                        Object objZzf2 = zzix.zzf(obj, j10);
                        if (objZzf2 != null) {
                            iHashCode2 = objZzf2.hashCode();
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
                        iFloatToIntBits = zzix.zzf(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                    case 50:
                        i10 = iHashCode * 53;
                        iFloatToIntBits = zzix.zzf(obj, j10).hashCode();
                        iHashCode = i10 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i13 = this.zzk;
        while (true) {
            int[] iArr = this.zzi;
            if (i13 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((zzgp) obj).zzc.hashCode();
                return this.zzh ? (iHashCode3 * 53) + ((zzgm) obj).zzb.zza.hashCode() : iHashCode3;
            }
            int i14 = iArr[i13];
            if (!zzM(obj, 0, i14)) {
                iHashCode = (iHashCode * 53) + zzix.zzf(obj, zzq(i14) & 1048575).hashCode();
            }
            i13++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 41481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.play_billing.zzfd r39) {
        /*
            Method dump skipped, instruction units count: 4148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhu.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzfd):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final Object zze() {
        return ((zzgp) this.zzg).zzs();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzf(Object obj) {
        if (zzK(obj)) {
            if (obj instanceof zzgp) {
                zzgp zzgpVar = (zzgp) obj;
                zzgpVar.zzC(Integer.MAX_VALUE);
                zzgpVar.zza = 0;
                zzgpVar.zzA();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int iZzq = zzq(i10);
                int i11 = 1048575 & iZzq;
                int iZzp = zzp(iZzq);
                long j10 = i11;
                if (iZzp != 9) {
                    if (iZzp != 60 && iZzp != 68) {
                        switch (iZzp) {
                            case 17:
                                if (zzH(obj, i10)) {
                                    zzt(i10).zzf(zzb.getObject(obj, j10));
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
                                ((zzgu) zzix.zzf(obj, j10)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((zzhm) object).zzc();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i10], i10)) {
                        zzt(i10).zzf(zzb.getObject(obj, j10));
                    }
                } else if (zzH(obj, i10)) {
                    zzt(i10).zzf(zzb.getObject(obj, j10));
                }
            }
            ((zzgp) obj).zzc.zzh();
            if (this.zzh) {
                ((zzgm) obj).zzb.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzg(Object obj, Object obj2) {
        zzz(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 >= iArr.length) {
                zzic.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzic.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzq = zzq(i10);
            int i11 = 1048575 & iZzq;
            int iZzp = zzp(iZzq);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzp) {
                case 0:
                    if (zzH(obj2, i10)) {
                        zzix.zzl(obj, j10, zzix.zza(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 1:
                    if (zzH(obj2, i10)) {
                        zzix.zzm(obj, j10, zzix.zzb(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 2:
                    if (zzH(obj2, i10)) {
                        zzix.zzo(obj, j10, zzix.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 3:
                    if (zzH(obj2, i10)) {
                        zzix.zzo(obj, j10, zzix.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 4:
                    if (zzH(obj2, i10)) {
                        zzix.zzn(obj, j10, zzix.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 5:
                    if (zzH(obj2, i10)) {
                        zzix.zzo(obj, j10, zzix.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 6:
                    if (zzH(obj2, i10)) {
                        zzix.zzn(obj, j10, zzix.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 7:
                    if (zzH(obj2, i10)) {
                        zzix.zzk(obj, j10, zzix.zzt(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 8:
                    if (zzH(obj2, i10)) {
                        zzix.zzp(obj, j10, zzix.zzf(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 9:
                    zzA(obj, obj2, i10);
                    break;
                case 10:
                    if (zzH(obj2, i10)) {
                        zzix.zzp(obj, j10, zzix.zzf(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 11:
                    if (zzH(obj2, i10)) {
                        zzix.zzn(obj, j10, zzix.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 12:
                    if (zzH(obj2, i10)) {
                        zzix.zzn(obj, j10, zzix.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 13:
                    if (zzH(obj2, i10)) {
                        zzix.zzn(obj, j10, zzix.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 14:
                    if (zzH(obj2, i10)) {
                        zzix.zzo(obj, j10, zzix.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 15:
                    if (zzH(obj2, i10)) {
                        zzix.zzn(obj, j10, zzix.zzc(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 16:
                    if (zzH(obj2, i10)) {
                        zzix.zzo(obj, j10, zzix.zzd(obj2, j10));
                        zzC(obj, i10);
                    }
                    break;
                case 17:
                    zzA(obj, obj2, i10);
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
                    zzgu zzguVarZzd = (zzgu) zzix.zzf(obj, j10);
                    zzgu zzguVar = (zzgu) zzix.zzf(obj2, j10);
                    int size = zzguVarZzd.size();
                    int size2 = zzguVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzguVarZzd.zzc()) {
                            zzguVarZzd = zzguVarZzd.zzd(size2 + size);
                        }
                        zzguVarZzd.addAll(zzguVar);
                    }
                    if (size > 0) {
                        zzguVar = zzguVarZzd;
                    }
                    zzix.zzp(obj, j10, zzguVar);
                    break;
                case 50:
                    int i13 = zzic.zza;
                    zzix.zzp(obj, j10, zzhn.zza(zzix.zzf(obj, j10), zzix.zzf(obj2, j10)));
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
                        zzix.zzp(obj, j10, zzix.zzf(obj2, j10));
                        zzD(obj, i12, i10);
                    }
                    break;
                case 60:
                    zzB(obj, obj2, i10);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case DEPRECATED_API_USED_VALUE:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzM(obj2, i12, i10)) {
                        zzix.zzp(obj, j10, zzix.zzf(obj2, j10));
                        zzD(obj, i12, i10);
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    zzB(obj, obj2, i10);
                    break;
            }
            i10 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzfd zzfdVar) {
        zzc(obj, bArr, i10, i11, 0, zzfdVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.play_billing.zzib
    public final void zzi(Object obj, zzji zzjiVar) {
        Map.Entry entry;
        int i10;
        zzhu<T> zzhuVar = this;
        if (zzhuVar.zzh) {
            zzgh zzghVar = ((zzgm) obj).zzb;
            if (zzghVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzghVar.zzf().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzhuVar.zzc;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < iArr.length) {
            int iZzq = zzhuVar.zzq(i13);
            int iZzp = zzp(iZzq);
            int i15 = iArr[i13];
            if (iZzp <= 17) {
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
            long j10 = iZzq & i11;
            switch (iZzp) {
                case 0:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzf(i15, zzix.zza(obj, j10));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 1:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzo(i15, zzix.zzb(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 2:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzt(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 3:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzL(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 4:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzr(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 5:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzm(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 6:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzk(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 7:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzb(i15, zzix.zzt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 8:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzP(i15, unsafe.getObject(obj, j10), zzjiVar);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 9:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzw(i15, unsafe.getObject(obj, j10), zzhuVar.zzt(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 10:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzd(i15, (zzfp) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 11:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzJ(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 12:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzi(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 13:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzy(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 14:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzA(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 15:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzC(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 16:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzE(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 17:
                    if (zzhuVar.zzI(obj, i13, i12, i14, i10)) {
                        zzjiVar.zzq(i15, unsafe.getObject(obj, j10), zzhuVar.zzt(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 18:
                    zzic.zzr(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 19:
                    zzic.zzv(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 20:
                    zzic.zzx(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 21:
                    zzic.zzD(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 22:
                    zzic.zzw(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 23:
                    zzic.zzu(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 24:
                    zzic.zzt(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 25:
                    zzic.zzq(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 26:
                    int i18 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    int i19 = zzic.zza;
                    if (list != null && !list.isEmpty()) {
                        zzjiVar.zzI(i18, list);
                    }
                    break;
                case 27:
                    int i20 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    zzib zzibVarZzt = zzhuVar.zzt(i13);
                    int i21 = zzic.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((zzfy) zzjiVar).zzw(i20, list2.get(i22), zzibVarZzt);
                        }
                    }
                    break;
                case 28:
                    int i23 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i24 = zzic.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzjiVar.zze(i23, list3);
                    }
                    break;
                case 29:
                    zzic.zzC(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 30:
                    zzic.zzs(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 31:
                    zzic.zzy(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 32:
                    zzic.zzz(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 33:
                    zzic.zzA(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 34:
                    zzic.zzB(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    zzhuVar = this;
                    break;
                case 35:
                    zzic.zzr(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 36:
                    zzic.zzv(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 37:
                    zzic.zzx(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 38:
                    zzic.zzD(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 39:
                    zzic.zzw(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 40:
                    zzic.zzu(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 41:
                    zzic.zzt(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 42:
                    zzic.zzq(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 43:
                    zzic.zzC(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 44:
                    zzic.zzs(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case SDK_INIT_API_VALUE:
                    zzic.zzy(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case AD_START_EVENT_VALUE:
                    zzic.zzz(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case AD_CLICK_EVENT_VALUE:
                    zzic.zzA(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 48:
                    zzic.zzB(iArr[i13], (List) unsafe.getObject(obj, j10), zzjiVar, true);
                    break;
                case 49:
                    int i25 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    zzib zzibVarZzt2 = zzhuVar.zzt(i13);
                    int i26 = zzic.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            ((zzfy) zzjiVar).zzq(i25, list4.get(i27), zzibVarZzt2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j10);
                    if (object != null) {
                        zzjiVar.zzv(i15, ((zzhl) zzhuVar.zzv(i13)).zzc(), (zzhm) object);
                    }
                    break;
                case 51:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzf(i15, ((Double) zzix.zzf(obj, j10)).doubleValue());
                    }
                    break;
                case 52:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzo(i15, ((Float) zzix.zzf(obj, j10)).floatValue());
                    }
                    break;
                case 53:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzt(i15, zzr(obj, j10));
                    }
                    break;
                case 54:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzL(i15, zzr(obj, j10));
                    }
                    break;
                case 55:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzr(i15, zzm(obj, j10));
                    }
                    break;
                case AD_VISIBILITY_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzm(i15, zzr(obj, j10));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzk(i15, zzm(obj, j10));
                    }
                    break;
                case INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzb(i15, ((Boolean) zzix.zzf(obj, j10)).booleanValue());
                    }
                    break;
                case AD_START_TO_BACKGROUND_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzP(i15, unsafe.getObject(obj, j10), zzjiVar);
                    }
                    break;
                case 60:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzw(i15, unsafe.getObject(obj, j10), zzhuVar.zzt(i13));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzd(i15, (zzfp) unsafe.getObject(obj, j10));
                    }
                    break;
                case DEPRECATED_API_USED_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzJ(i15, zzm(obj, j10));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzi(i15, zzm(obj, j10));
                    }
                    break;
                case 64:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzy(i15, zzm(obj, j10));
                    }
                    break;
                case 65:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzA(i15, zzr(obj, j10));
                    }
                    break;
                case BLACK_SCREEN_IS_DETECTED_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzC(i15, zzm(obj, j10));
                    }
                    break;
                case NATIVE_PLAY_ASSET_TYPE_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzE(i15, zzr(obj, j10));
                    }
                    break;
                case NATIVE_VIDEO_PREPARE_DURATION_MS_VALUE:
                    if (zzhuVar.zzM(obj, i15, i13)) {
                        zzjiVar.zzq(i15, unsafe.getObject(obj, j10), zzhuVar.zzt(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
            zzhuVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzgp) obj).zzc.zzl(zzjiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzib
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzE;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzq = zzq(i10);
            int iZzp = zzp(iZzq);
            if (iZzp <= 50 || iZzp >= 69) {
                long j10 = iZzq & 1048575;
                switch (iZzp) {
                    case 0:
                        if (!zzG(obj, obj2, i10) || Double.doubleToLongBits(zzix.zza(obj, j10)) != Double.doubleToLongBits(zzix.zza(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzG(obj, obj2, i10) || Float.floatToIntBits(zzix.zzb(obj, j10)) != Float.floatToIntBits(zzix.zzb(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzG(obj, obj2, i10) || zzix.zzd(obj, j10) != zzix.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzG(obj, obj2, i10) || zzix.zzd(obj, j10) != zzix.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzG(obj, obj2, i10) || zzix.zzc(obj, j10) != zzix.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzG(obj, obj2, i10) || zzix.zzd(obj, j10) != zzix.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzG(obj, obj2, i10) || zzix.zzc(obj, j10) != zzix.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzG(obj, obj2, i10) || zzix.zzt(obj, j10) != zzix.zzt(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzG(obj, obj2, i10) || !zzic.zzE(zzix.zzf(obj, j10), zzix.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzG(obj, obj2, i10) || !zzic.zzE(zzix.zzf(obj, j10), zzix.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzG(obj, obj2, i10) || !zzic.zzE(zzix.zzf(obj, j10), zzix.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzG(obj, obj2, i10) || zzix.zzc(obj, j10) != zzix.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzG(obj, obj2, i10) || zzix.zzc(obj, j10) != zzix.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzG(obj, obj2, i10) || zzix.zzc(obj, j10) != zzix.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzG(obj, obj2, i10) || zzix.zzd(obj, j10) != zzix.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzG(obj, obj2, i10) || zzix.zzc(obj, j10) != zzix.zzc(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzG(obj, obj2, i10) || zzix.zzd(obj, j10) != zzix.zzd(obj2, j10)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzG(obj, obj2, i10) || !zzic.zzE(zzix.zzf(obj, j10), zzix.zzf(obj2, j10))) {
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
                        zZzE = zzic.zzE(zzix.zzf(obj, j10), zzix.zzf(obj2, j10));
                        break;
                    case 50:
                        zZzE = zzic.zzE(zzix.zzf(obj, j10), zzix.zzf(obj2, j10));
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
                        if (!zzL(obj, obj2, i10) || !zzic.zzE(zzix.zzf(obj, j10), zzix.zzf(obj2, j10))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzE) {
                    return false;
                }
            }
        }
        int i11 = this.zzk;
        while (true) {
            int[] iArr = this.zzi;
            if (i11 >= iArr.length) {
                if (!((zzgp) obj).zzc.equals(((zzgp) obj2).zzc)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zzgm) obj).zzb.equals(((zzgm) obj2).zzb);
                }
                return true;
            }
            int i12 = iArr[i11];
            if (!zzL(obj, obj2, i12)) {
                return false;
            }
            if (!zzM(obj, 0, i12)) {
                long jZzq = zzq(i12) & 1048575;
                if (!zzic.zzE(zzix.zzf(obj, jZzq), zzix.zzf(obj2, jZzq))) {
                    return false;
                }
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[LOOP:2: B:52:0x00d2->B:57:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzib
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        List list;
        zzib zzibVarZzt;
        int i12;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i13 < this.zzj) {
            int i16 = this.zzi[i13];
            int iZzq = zzq(i16);
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
            if ((268435456 & iZzq) != 0 && !zzI(obj2, i16, i10, i11, i19)) {
                return false;
            }
            int iZzp = zzp(iZzq);
            if (iZzp == 9 || iZzp == 17) {
                if (zzI(obj2, i16, i10, i11, i19) && !zzJ(obj2, iZzq, zzt(i16))) {
                    return false;
                }
            } else if (iZzp == 27) {
                list = (List) zzix.zzf(obj2, iZzq & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzibVarZzt = zzt(i16);
                    for (i12 = 0; i12 < list.size(); i12++) {
                        if (!zzibVarZzt.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (iZzp == 60 || iZzp == 68) {
                if (zzM(obj2, iArr[i16], i16) && !zzJ(obj2, iZzq, zzt(i16))) {
                    return false;
                }
            } else if (iZzp == 49) {
                list = (List) zzix.zzf(obj2, iZzq & 1048575);
                if (list.isEmpty()) {
                    zzibVarZzt = zzt(i16);
                    while (i12 < list.size()) {
                        if (!zzibVarZzt.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzp != 50) {
                continue;
            } else {
                zzhm zzhmVar = (zzhm) zzix.zzf(obj2, iZzq & 1048575);
                if (!zzhmVar.isEmpty() && ((zzhl) zzv(i16)).zzc().zzc.zzb() == zzjh.MESSAGE) {
                    zzib zzibVarZzb = null;
                    for (Object obj3 : zzhmVar.values()) {
                        if (zzibVarZzb == null) {
                            zzibVarZzb = zzhy.zza().zzb(obj3.getClass());
                        }
                        if (!zzibVarZzb.zzk(obj3)) {
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
        return !this.zzh || ((zzgm) obj).zzb.zzj();
    }
}
