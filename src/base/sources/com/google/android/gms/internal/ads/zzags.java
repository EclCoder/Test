package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzags {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final String zzn;
    public final zzgm zzo;

    private zzags(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, float f10, int i22, String str, zzgm zzgmVar) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = i18;
        this.zzi = i19;
        this.zzj = i20;
        this.zzk = i21;
        this.zzl = f10;
        this.zzm = i22;
        this.zzn = str;
        this.zzo = zzgmVar;
    }

    public static zzags zza(zzet zzetVar) {
        return zzc(zzetVar, false, null);
    }

    public static zzags zzb(zzet zzetVar, zzgm zzgmVar) {
        return zzc(zzetVar, true, zzgmVar);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x0299  */
    /* JADX WARN: Code duplicated, block: B:39:0x0133 A[PHI: r34
      0x0133: PHI (r34v2 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v3 int) binds: [B:41:0x013c, B:42:0x013e, B:96:0x023e, B:97:0x0240, B:38:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    private static zzags zzc(zzet zzetVar, boolean z10, zzgm zzgmVar) throws zzat {
        boolean z11;
        boolean z12;
        String str;
        int i10;
        int i11;
        zzgi zzgiVar;
        int i12;
        int iMax;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16 = 4;
        boolean z13 = true;
        if (z10) {
            try {
                zzetVar.zzk(4);
            } catch (ArrayIndexOutOfBoundsException e10) {
                e = e10;
                z12 = true;
                if (z12 != z10) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.zzb("Error parsing".concat(str), e);
            }
        } else {
            try {
                zzetVar.zzk(21);
            } catch (ArrayIndexOutOfBoundsException e11) {
                e = e11;
                z11 = z13;
                z12 = z11;
                if (z12 != z10) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.zzb("Error parsing".concat(str), e);
            }
        }
        int iZzs = zzetVar.zzs() & 3;
        int iZzs2 = zzetVar.zzs();
        int iZzg = zzetVar.zzg();
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < iZzs2; i19++) {
            zzetVar.zzk(1);
            int iZzt = zzetVar.zzt();
            for (int i20 = 0; i20 < iZzt; i20++) {
                int iZzt2 = zzetVar.zzt();
                i18 += iZzt2 + 4;
                zzetVar.zzk(iZzt2);
            }
        }
        zzetVar.zzh(iZzg);
        byte[] bArr = new byte[i18];
        zzgm zzgmVar2 = zzgmVar;
        int i21 = 0;
        float f10 = 1.0f;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        String strZzc = null;
        int i34 = 0;
        while (i34 < iZzs2) {
            int iZzs3 = zzetVar.zzs() & 63;
            int iZzt3 = zzetVar.zzt();
            z11 = z13;
            int i35 = i17;
            zzgm zzgmVarZzf = zzgmVar2;
            while (i35 < iZzt3) {
                try {
                    int iZzt4 = zzetVar.zzt();
                    int i36 = i35;
                    System.arraycopy(zzgp.zza, i17, bArr, i21, i16);
                    int i37 = i21 + 4;
                    System.arraycopy(zzetVar.zzi(), zzetVar.zzg(), bArr, i37, iZzt4);
                    int i38 = 32;
                    if (iZzs3 == 32) {
                        if (i36 == 0) {
                            zzgmVarZzf = zzgp.zzf(bArr, i37, i37 + iZzt4);
                            i11 = i37;
                            i10 = iZzs;
                            i15 = 0;
                            i14 = 0;
                        }
                        i21 = i11 + iZzt4;
                        zzetVar.zzk(iZzt4);
                        i35 = i15 + 1;
                        i17 = i14;
                        iZzs = i10;
                        i16 = 4;
                    } else {
                        i38 = iZzs3;
                    }
                    i10 = iZzs;
                    if (i38 != 33) {
                        i11 = i37;
                        int i39 = 8;
                        if (i38 == 39 && i36 == 0) {
                            int i40 = i21 + 6;
                            int i41 = (i11 + iZzt4) - 1;
                            while (true) {
                                byte b10 = bArr[i41];
                                if (b10 != 0) {
                                    if (b10 == 0 || i41 <= i40) {
                                        break;
                                    }
                                    zzgw zzgwVar = new zzgw(bArr, i40, i41 + 1);
                                    while (true) {
                                        if (zzgwVar.zzd(16)) {
                                            int i42 = i39;
                                            int iZzf = zzgwVar.zzf(i42);
                                            int i43 = 0;
                                            while (iZzf == 255) {
                                                i43 += 255;
                                                iZzf = zzgwVar.zzf(i42);
                                            }
                                            int i44 = i43 + iZzf;
                                            int iZzf2 = zzgwVar.zzf(i42);
                                            int i45 = 0;
                                            while (iZzf2 == 255) {
                                                i45 += 255;
                                                iZzf2 = zzgwVar.zzf(8);
                                            }
                                            i39 = 8;
                                            int i46 = i45 + iZzf2;
                                            if (i46 == 0 || !zzgwVar.zzd(i46)) {
                                                break;
                                            }
                                            if (i44 == 176) {
                                                int iZzg2 = zzgwVar.zzg();
                                                boolean zZze = zzgwVar.zze();
                                                int iZzg3 = zZze ? zzgwVar.zzg() : 0;
                                                int iZzg4 = zzgwVar.zzg();
                                                int iZzg5 = -1;
                                                int iZzg6 = -1;
                                                int i47 = -1;
                                                int iZzf3 = -1;
                                                int i48 = -1;
                                                int iZzf4 = -1;
                                                int i49 = 0;
                                                while (true) {
                                                    if (i49 > iZzg4) {
                                                        zzgiVar = new zzgi(iZzg2, iZzg3, iZzg4 + 1, iZzg5, iZzg6, i47, iZzf3, i48, iZzf4);
                                                        break;
                                                    }
                                                    iZzg5 = zzgwVar.zzg();
                                                    iZzg6 = zzgwVar.zzg();
                                                    boolean z14 = zZze;
                                                    int iZzf5 = zzgwVar.zzf(6);
                                                    if (iZzf5 != 63) {
                                                        if (iZzf5 == 0) {
                                                            i12 = iZzf5;
                                                            iMax = Math.max(0, iZzg2 - 30);
                                                        } else {
                                                            i12 = iZzf5;
                                                            iMax = Math.max(0, (i12 + iZzg2) - 31);
                                                        }
                                                        iZzf3 = zzgwVar.zzf(iMax);
                                                        if (z14) {
                                                            int iZzf6 = zzgwVar.zzf(6);
                                                            if (iZzf6 != 63) {
                                                                if (iZzf6 == 0) {
                                                                    i13 = iZzf6;
                                                                    iMax2 = Math.max(0, iZzg3 - 30);
                                                                } else {
                                                                    i13 = iZzf6;
                                                                    iMax2 = Math.max(0, (i13 + iZzg3) - 31);
                                                                }
                                                                iZzf4 = zzgwVar.zzf(iMax2);
                                                                i48 = i13;
                                                            }
                                                        }
                                                        if (zzgwVar.zze()) {
                                                            zzgwVar.zzb(10);
                                                        }
                                                        i49++;
                                                        zZze = z14;
                                                        i47 = i12;
                                                    }
                                                }
                                            } else {
                                                zzgwVar.zzb(i46 * 8);
                                            }
                                        }
                                    }
                                } else if (i41 > i40) {
                                    i41--;
                                }
                                zzgiVar = null;
                                break;
                            }
                            if (zzgiVar == null || zzgmVarZzf == null) {
                                i14 = 0;
                            } else {
                                i14 = 0;
                                if (zzgiVar.zza == ((zzgc) zzgmVarZzf.zza.get(0)).zzb) {
                                    i15 = i36;
                                    i32 = 4;
                                } else {
                                    i32 = 5;
                                }
                            }
                            i15 = i36;
                        } else {
                            i14 = 0;
                            i15 = i36;
                        }
                    } else if (i36 == 0) {
                        zzgj zzgjVarZzg = zzgp.zzg(bArr, i37, i37 + iZzt4, zzgmVarZzf);
                        int i50 = zzgjVarZzg.zza + 1;
                        int i51 = zzgjVarZzg.zze;
                        int i52 = zzgjVarZzg.zzf;
                        int i53 = zzgjVarZzg.zzg;
                        i11 = i37;
                        int i54 = zzgjVarZzg.zzh;
                        int i55 = zzgjVarZzg.zzc + 8;
                        int i56 = zzgjVarZzg.zzd + 8;
                        int i57 = zzgjVarZzg.zzk;
                        int i58 = zzgjVarZzg.zzl;
                        int i59 = zzgjVarZzg.zzm;
                        float f11 = zzgjVarZzg.zzi;
                        int i60 = zzgjVarZzg.zzj;
                        zzge zzgeVar = zzgjVarZzg.zzb;
                        if (zzgeVar != null) {
                            strZzc = zzdq.zzc(zzgeVar.zza, zzgeVar.zzb, zzgeVar.zzc, zzgeVar.zzd, zzgeVar.zze, zzgeVar.zzf);
                        }
                        i31 = i59;
                        f10 = f11;
                        i33 = i60;
                        i15 = i36;
                        i28 = i56;
                        i29 = i57;
                        i30 = i58;
                        i25 = i53;
                        i26 = i54;
                        i27 = i55;
                        i14 = 0;
                        i23 = i51;
                        i24 = i52;
                        i22 = i50;
                    } else {
                        i11 = i37;
                        i14 = 0;
                        i15 = i36;
                    }
                    i21 = i11 + iZzt4;
                    zzetVar.zzk(iZzt4);
                    i35 = i15 + 1;
                    i17 = i14;
                    iZzs = i10;
                    i16 = 4;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    e = e12;
                    z12 = z11;
                    if (z12 != z10) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw zzat.zzb("Error parsing".concat(str), e);
                }
            }
            i34++;
            zzgmVar2 = zzgmVarZzf;
            z13 = z11;
            iZzs = iZzs;
            i16 = 4;
        }
        z11 = z13;
        return new zzags(i18 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZzs + 1, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, f10, i33, strZzc, zzgmVar2);
    }
}
