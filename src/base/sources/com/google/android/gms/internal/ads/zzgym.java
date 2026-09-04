package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgym extends zzgwp {
    static final zzgwp zza = new zzgym(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzgym(Object obj, Object[] objArr, int i10) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i10;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static zzgym zzk(int i10, Object[] objArr, zzgwo zzgwoVar) {
        boolean z10;
        int i11;
        char c10;
        ?? r10;
        char c11;
        short[] sArr;
        boolean z11;
        int i12;
        ?? r16;
        boolean z12;
        ?? r11;
        Object[] objArr2;
        zzgwn zzgwnVar;
        boolean z13;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (zzgym) zza;
        }
        zzgwn zzgwnVar2 = null;
        ?? r12 = 0;
        zzgwn zzgwnVar3 = null;
        zzgwn zzgwnVar4 = null;
        boolean z14 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzgvi.zza(obj, obj2);
            return new zzgym(null, objArrCopyOf, 1);
        }
        zzgtj.zzn(i13, objArrCopyOf.length >> 1, "index");
        int iZzo = zzgww.zzo(i13);
        char c12 = 2;
        if (i13 != 1) {
            int i15 = iZzo - 1;
            if (iZzo <= 128) {
                byte[] bArr = new byte[iZzo];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj3 = objArrCopyOf[i19];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i19 ^ i14];
                    Objects.requireNonNull(obj4);
                    zzgvi.zza(obj3, obj4);
                    int iZza = zzgwf.zza(obj3.hashCode());
                    while (true) {
                        int i20 = iZza & i15;
                        z11 = z14;
                        i12 = i14;
                        int i21 = bArr[i20] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj3;
                                objArrCopyOf[i18 ^ 1] = obj4;
                            }
                            i17++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                            int i22 = ~i21;
                            Object obj5 = objArrCopyOf[i22 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzgwn zzgwnVar5 = new zzgwn(obj3, obj4, obj5);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj4;
                            zzgwnVar3 = zzgwnVar5;
                            break;
                        }
                        iZza = i20 + 1;
                        z14 = z11;
                        i14 = i12;
                    }
                    i16++;
                    z14 = z11;
                    i14 = i12;
                }
                z10 = z14;
                i11 = i14;
                if (i17 == i13) {
                    r12 = bArr;
                    z13 = z10;
                } else {
                    sArr = new Object[3];
                    sArr[z10 ? 1 : 0] = bArr;
                    sArr[i11] = Integer.valueOf(i17);
                    sArr[2] = zzgwnVar3;
                    r12 = sArr;
                    z13 = z10;
                }
            } else {
                z10 = false;
                i11 = 1;
                if (iZzo <= 32768) {
                    sArr = new short[iZzo];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj6 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzgvi.zza(obj6, obj7);
                        int iZza2 = zzgwf.zza(obj6.hashCode());
                        while (true) {
                            int i27 = iZza2 & i15;
                            char c13 = (char) sArr[i27];
                            if (c13 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArrCopyOf[i25] = obj6;
                                    objArrCopyOf[i25 ^ 1] = obj7;
                                }
                                i23++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c13])) {
                                int i28 = c13 ^ 1;
                                Object obj8 = objArrCopyOf[i28 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzgwn zzgwnVar6 = new zzgwn(obj6, obj7, obj8);
                                objArrCopyOf[i28 == true ? 1 : 0] = obj7;
                                zzgwnVar4 = zzgwnVar6;
                                break;
                            }
                            iZza2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r12 = sArr;
                        z13 = z10;
                    } else {
                        r12 = new Object[]{sArr, Integer.valueOf(i23), zzgwnVar4};
                        z13 = z10;
                    }
                } else {
                    int[] iArr = new int[iZzo];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj9 = objArrCopyOf[i32];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i32 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzgvi.zza(obj9, obj10);
                        int iZza3 = zzgwf.zza(obj9.hashCode());
                        while (true) {
                            int i33 = iZza3 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArrCopyOf[i31] = obj9;
                                    objArrCopyOf[i31 ^ 1] = obj10;
                                }
                                i30++;
                                c11 = c12;
                                break;
                            }
                            c11 = c12;
                            if (obj9.equals(objArrCopyOf[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj11 = objArrCopyOf[i35];
                                Objects.requireNonNull(obj11);
                                zzgwn zzgwnVar7 = new zzgwn(obj9, obj10, obj11);
                                objArrCopyOf[i35] = obj10;
                                zzgwnVar2 = zzgwnVar7;
                                break;
                            }
                            iZza3 = i33 + 1;
                            c12 = c11;
                        }
                        i29++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i30 == i13) {
                        r10 = iArr;
                        r16 = z10;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i30);
                        objArr3[c10] = zzgwnVar2;
                        r10 = objArr3;
                        r16 = z10;
                    }
                }
            }
            z12 = r10 instanceof Object[];
            r11 = r10;
            if (z12) {
                objArr2 = (Object[]) r10;
                zzgwnVar = (zzgwn) objArr2[c10];
                if (zzgwoVar != null) {
                    throw zzgwnVar.zza();
                }
                zzgwoVar.zzc = zzgwnVar;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r11 = obj12;
                i13 = iIntValue;
            }
            return new zzgym(r11, objArrCopyOf, i13);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzgvi.zza(obj13, obj14);
        z13 = false;
        i13 = 1;
        i11 = 1;
        c10 = 2;
        r10 = r12;
        r16 = z13;
        z12 = r10 instanceof Object[];
        r11 = r10;
        if (z12) {
            objArr2 = (Object[]) r10;
            zzgwnVar = (zzgwn) objArr2[c10];
            if (zzgwoVar != null) {
                throw zzgwnVar.zza();
            }
            zzgwoVar.zzc = zzgwnVar;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r11 = obj15;
            i13 = iIntValue2;
        }
        return new zzgym(r11, objArrCopyOf, i13);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.zzd;
            Object[] objArr = this.zzb;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzgwf.zza(obj.hashCode());
                    while (true) {
                        int i11 = iZza & length;
                        int i12 = bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iZza = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzgwf.zza(obj.hashCode());
                    while (true) {
                        int i13 = iZza2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iZza2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzgwf.zza(obj.hashCode());
                    while (true) {
                        int i14 = iZza3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iZza3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final zzgww zze() {
        return new zzgyj(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final zzgww zzg() {
        return new zzgyk(this, new zzgyl(this.zzb, 0, this.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final zzgwi zzi() {
        return new zzgyl(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final boolean zzj() {
        return false;
    }
}
