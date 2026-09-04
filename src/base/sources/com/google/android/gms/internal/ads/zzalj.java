package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzalj {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfl.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i10) {
        return (i10 >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:616:0x0dd9  */
    /* JADX WARN: Code duplicated, block: B:617:0x0ddd  */
    /* JADX WARN: Code duplicated, block: B:619:0x0de1  */
    /* JADX WARN: Code duplicated, block: B:621:0x0dee  */
    /* JADX WARN: Code duplicated, block: B:622:0x0dfa  */
    /* JADX WARN: Code duplicated, block: B:627:0x0e44  */
    /* JADX WARN: Code duplicated, block: B:628:0x0e6f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e A[PHI: r13
      0x014e: PHI (r13v7 int) = (r13v8 int), (r13v4 int) binds: [B:84:0x0158, B:74:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0154  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x015d A[DONT_INVERT, PHI: r9 r12 r13
      0x015d: PHI (r9v4 int) = (r9v3 int), (r9v5 int) binds: [B:71:0x013e, B:80:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r12v2 int) = (r12v1 int), (r12v4 int) binds: [B:71:0x013e, B:80:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r13v5 int) = (r13v4 int), (r13v6 int) binds: [B:71:0x013e, B:80:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    public static List zzb(zzfx zzfxVar, zzagr zzagrVar, long j10, zzq zzqVar, boolean z10, boolean z11, zzgta zzgtaVar, boolean z12) {
        int i10;
        int i11;
        long jZzz;
        int i12;
        int i13;
        boolean z13;
        long j11;
        long jZzv;
        int i14;
        long jZzv2;
        String str;
        zzfx zzfxVar2;
        long[] jArr;
        long[] jArr2;
        zzv zzvVarZzO;
        zzami zzamiVar;
        zzfw zzfwVar;
        zzap zzapVar;
        zzap zzapVar2;
        Pair pairZzn;
        zzet zzetVar;
        short s10;
        String str2;
        zzq zzqVar2;
        String str3;
        int i15;
        String str4;
        String str5;
        int i16;
        int i17;
        int i18;
        String str6;
        String str7;
        zzalf zzalfVar;
        zzgm zzgmVar;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int iIntValue;
        zzq zzqVarZzb;
        zzgwm zzgwmVarZzj;
        long j12;
        boolean z18;
        zzami zzamiVar2;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i19 = 0;
        while (true) {
            List list = zzfxVar.zzc;
            if (i19 >= list.size()) {
                return arrayList2;
            }
            zzfx zzfxVar3 = (zzfx) list.get(i19);
            if (zzfxVar3.zzd != 1953653099) {
                arrayList = arrayList2;
                i11 = i19;
            } else {
                zzfy zzfyVarZzc = zzfxVar.zzc(1836476516);
                zzfyVarZzc.getClass();
                zzfx zzfxVarZzd = zzfxVar3.zzd(1835297121);
                zzfxVarZzd.getClass();
                zzfy zzfyVarZzc2 = zzfxVarZzd.zzc(1751411826);
                zzfyVarZzc2.getClass();
                int iZzj = zzj(zzfyVarZzc2.zza);
                int i20 = 1;
                if (iZzj == 1936684398) {
                    i10 = 1;
                } else if (iZzj == 1986618469) {
                    i10 = 2;
                } else if (iZzj == 1952807028 || iZzj == 1935832172 || iZzj == 1937072756 || iZzj == 1668047728 || iZzj == 1937072752) {
                    i10 = 3;
                } else {
                    i10 = iZzj == 1835365473 ? 5 : -1;
                }
                if (i10 == -1) {
                    arrayList2 = arrayList2;
                    i11 = i19;
                } else {
                    zzfy zzfyVarZzc3 = zzfxVar3.zzc(1953196132);
                    zzfyVarZzc3.getClass();
                    zzet zzetVar2 = zzfyVarZzc3.zza;
                    zzetVar2.zzh(8);
                    int iZza = zza(zzetVar2.zzB());
                    char c10 = 0;
                    zzetVar2.zzk(iZza == 0 ? 8 : 16);
                    int iZzB = zzetVar2.zzB();
                    zzetVar2.zzk(4);
                    int iZzg = zzetVar2.zzg();
                    int i21 = 0;
                    while (true) {
                        int i22 = iZza == 0 ? 4 : 8;
                        i11 = i19;
                        if (i21 >= i22) {
                            zzetVar2.zzk(i22);
                        } else {
                            if (zzetVar2.zzi()[iZzg + i21] != -1) {
                                jZzz = iZza == 0 ? zzetVar2.zzz() : zzetVar2.zzJ();
                                if (jZzz != 0) {
                                    break;
                                }
                                break;
                            }
                            i21++;
                            i19 = i11;
                        }
                        jZzz = C.TIME_UNSET;
                        break;
                    }
                    zzetVar2.zzk(10);
                    int iZzt = zzetVar2.zzt();
                    zzetVar2.zzk(4);
                    int iZzB2 = zzetVar2.zzB();
                    int iZzB3 = zzetVar2.zzB();
                    zzetVar2.zzk(4);
                    int iZzB4 = zzetVar2.zzB();
                    int iZzB5 = zzetVar2.zzB();
                    if (iZzB2 == 0) {
                        if (iZzB3 == 65536) {
                            if (iZzB4 != -65536) {
                                if (iZzB4 == 65536) {
                                    z18 = iZzB5 != 0;
                                    iZzB4 = 65536;
                                }
                                iZzB3 = 65536;
                            } else {
                                z18 = iZzB5 != 0;
                            }
                            if (true != z18) {
                                i12 = 90;
                            } else {
                                iZzB3 = 65536;
                            }
                            i13 = i12;
                        }
                        iZzB2 = 0;
                        if (iZzB2 == 0) {
                            if (iZzB2 != -65536) {
                                i12 = 180;
                                i13 = i12;
                            } else {
                                i12 = 180;
                                i13 = i12;
                            }
                            i13 = 0;
                        } else {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            z13 = false;
                                        } else {
                                            z13 = true;
                                        }
                                        iZzB4 = -65536;
                                    }
                                    iZzB3 = -65536;
                                } else if (iZzB5 == 0) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (true != z13) {
                                    i12 = 270;
                                } else {
                                    iZzB3 = -65536;
                                }
                                i13 = i12;
                            }
                            iZzB2 = 0;
                            if (iZzB2 != -65536) {
                                i12 = 180;
                                i13 = i12;
                            } else {
                                i12 = 180;
                                i13 = i12;
                            }
                            i13 = 0;
                        }
                    } else if (iZzB2 == 0) {
                        if (iZzB3 == -65536) {
                            if (iZzB4 != 65536) {
                                if (iZzB4 == -65536) {
                                    if (iZzB5 == 0) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    iZzB4 = -65536;
                                }
                                iZzB3 = -65536;
                            } else if (iZzB5 == 0) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (true != z13) {
                                i12 = 270;
                            } else {
                                iZzB3 = -65536;
                            }
                            i13 = i12;
                        }
                        iZzB2 = 0;
                        if (iZzB2 != -65536) {
                            i12 = 180;
                            i13 = i12;
                        } else {
                            i12 = 180;
                            i13 = i12;
                        }
                        i13 = 0;
                    } else if ((iZzB2 != -65536 || iZzB2 == 65536) && iZzB3 == 0 && iZzB4 == 0 && iZzB5 == -65536) {
                        i12 = 180;
                        i13 = i12;
                    } else {
                        i13 = 0;
                    }
                    zzetVar2.zzk(16);
                    short sZzv = zzetVar2.zzv();
                    zzetVar2.zzk(2);
                    short sZzv2 = zzetVar2.zzv();
                    long j13 = j10 == C.TIME_UNSET ? jZzz : j10;
                    long j14 = zzd(zzfyVarZzc.zza).zzc;
                    if (j13 == C.TIME_UNSET) {
                        j11 = j14;
                        jZzv = -9223372036854775807L;
                    } else {
                        j11 = j14;
                        jZzv = zzfl.zzv(j13, 1000000L, j11, RoundingMode.DOWN);
                    }
                    zzfx zzfxVarZzd2 = zzfxVarZzd.zzd(1835626086);
                    zzfxVarZzd2.getClass();
                    zzfx zzfxVarZzd3 = zzfxVarZzd2.zzd(1937007212);
                    zzfxVarZzd3.getClass();
                    zzfy zzfyVarZzc4 = zzfxVarZzd.zzc(1835296868);
                    zzfyVarZzc4.getClass();
                    zzet zzetVar3 = zzfyVarZzc4.zza;
                    zzetVar3.zzh(8);
                    int iZza2 = zza(zzetVar3.zzB());
                    zzetVar3.zzk(iZza2 == 0 ? 8 : 16);
                    long jZzz2 = zzetVar3.zzz();
                    int iZzg2 = zzetVar3.zzg();
                    int i23 = 0;
                    while (true) {
                        int i24 = iZza2 == 0 ? 4 : 8;
                        if (i23 >= i24) {
                            i14 = i20;
                            arrayList2 = arrayList2;
                            i13 = i13;
                            zzetVar3.zzk(i24);
                            jZzv2 = -9223372036854775807L;
                            break;
                        }
                        i14 = i20;
                        if (zzetVar3.zzi()[iZzg2 + i23] != -1) {
                            long jZzz3 = iZza2 == 0 ? zzetVar3.zzz() : zzetVar3.zzJ();
                            jZzv2 = jZzz3 == 0 ? -9223372036854775807L : zzfl.zzv(jZzz3, 1000000L, jZzz2, RoundingMode.DOWN);
                            break;
                        }
                        i23++;
                        i13 = i13;
                        i20 = i14;
                        arrayList2 = arrayList2;
                    }
                    int iZzt2 = zzetVar3.zzt();
                    char[] cArr = new char[3];
                    cArr[0] = (char) (((iZzt2 >> 10) & 31) + 96);
                    cArr[i14] = (char) (((iZzt2 >> 5) & 31) + 96);
                    char c11 = 2;
                    cArr[2] = (char) ((iZzt2 & 31) + 96);
                    int i25 = 0;
                    while (true) {
                        if (i25 >= 3) {
                            str = new String(cArr);
                            break;
                        }
                        char c12 = cArr[i25];
                        if (c12 < 'a' || c12 > 'z') {
                            str = null;
                            break;
                        }
                        i25++;
                    }
                    zzfy zzfyVarZzc5 = zzfxVarZzd3.zzc(1937011556);
                    String str8 = "BoxParsers";
                    if (zzfyVarZzc5 == null) {
                        zzeg.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        String strZzc = zzalc.zzc(jZzz2, jZzv2, str);
                        zzet zzetVar4 = zzfyVarZzc5.zza;
                        zzetVar4.zzh(12);
                        int iZzB6 = zzetVar4.zzB();
                        long j15 = jZzv2;
                        zzalf zzalfVar2 = new zzalf(iZzB6);
                        int i26 = 0;
                        while (i26 < iZzB6) {
                            int i27 = i10;
                            int iZzg3 = zzetVar4.zzg();
                            int i28 = iZzt;
                            int iZzB7 = zzetVar4.zzB();
                            String str9 = str8;
                            zzagc.zza(iZzB7 > 0 ? i14 : c10, "childAtomSize must be positive");
                            String str10 = "childAtomSize must be positive";
                            int iZzB8 = zzetVar4.zzB();
                            int i29 = iZzg3;
                            if (iZzB8 == 1635148593 || iZzB8 == 1635148595 || iZzB8 == 1701733238 || iZzB8 == 1831958048 || iZzB8 == 1836070006 || iZzB8 == 1752589105 || iZzB8 == 1751479857 || iZzB8 == 1987470129 || iZzB8 == 1987471665 || iZzB8 == 1932670515 || iZzB8 == 1211250227 || iZzB8 == 1748121139 || iZzB8 == 1987063864 || iZzB8 == 1987063865 || iZzB8 == 1635135537 || iZzB8 == 1685479798 || iZzB8 == 1685479729 || iZzB8 == 1685481573 || iZzB8 == 1685481521 || iZzB8 == 1634760241 || iZzB8 == 1684108849) {
                                iZzB6 = iZzB6;
                                sZzv = sZzv;
                                i27 = i27;
                                i28 = i28;
                                j15 = j15;
                                String str11 = str9;
                                int i30 = 8;
                                int i31 = iZzB8;
                                zzetVar = zzetVar4;
                                zzetVar.zzh(i29 + 16);
                                zzetVar.zzk(16);
                                int iZzt3 = zzetVar.zzt();
                                i26 = i26;
                                int iZzt4 = zzetVar.zzt();
                                s10 = sZzv2;
                                zzetVar.zzk(50);
                                int iZzg4 = zzetVar.zzg();
                                str2 = str;
                                if (i31 == 1701733238) {
                                    Pair pairZzr = zzr(zzetVar, i29, iZzB7);
                                    if (pairZzr != null) {
                                        iIntValue = ((Integer) pairZzr.first).intValue();
                                        zzqVarZzb = zzqVar == null ? null : zzqVar.zzb(((zzamj) pairZzr.second).zzb);
                                        zzalfVar2.zza[i26] = (zzamj) pairZzr.second;
                                    } else {
                                        iIntValue = 1701733238;
                                        zzqVarZzb = zzqVar;
                                    }
                                    zzetVar.zzh(iZzg4);
                                    i31 = iIntValue;
                                    zzqVar2 = zzqVarZzb;
                                } else {
                                    zzqVar2 = zzqVar;
                                }
                                if (i31 == 1831958048) {
                                    str3 = MimeTypes.VIDEO_MPEG;
                                } else if (i31 == 1211250227) {
                                    i31 = 1211250227;
                                    str3 = MimeTypes.VIDEO_H263;
                                } else {
                                    str3 = null;
                                }
                                zzq zzqVar3 = zzqVar2;
                                i29 = i29;
                                int i32 = iZzB;
                                String str12 = strZzc;
                                jZzz2 = jZzz2;
                                int i33 = iZzg4;
                                int i34 = 8;
                                float fZzH = 1.0f;
                                int i35 = -1;
                                int i36 = -1;
                                int iZzc = -1;
                                List listZzj = null;
                                zzgm zzgmVar2 = null;
                                int i37 = -1;
                                int i38 = -1;
                                boolean z19 = false;
                                int i39 = -1;
                                int i40 = -1;
                                int i41 = -1;
                                String str13 = null;
                                byte[] bArrCopyOfRange = null;
                                ByteBuffer byteBufferZzm = null;
                                zzaky zzakyVarZzq = null;
                                zzala zzalaVar = null;
                                zzfu zzfuVarZza = null;
                                zzfxVar3 = zzfxVar3;
                                int i42 = 8;
                                while (i33 - i29 < iZzB7) {
                                    zzetVar.zzh(i33);
                                    int iZzg5 = zzetVar.zzg();
                                    int iZzB9 = zzetVar.zzB();
                                    if (iZzB9 != 0) {
                                        i17 = iZzB9;
                                    } else {
                                        if (zzetVar.zzg() - i29 == iZzB7) {
                                            break;
                                        }
                                        i17 = 0;
                                    }
                                    zzagc.zza(i17 > 0, str10);
                                    int iZzB10 = zzetVar.zzB();
                                    if (iZzB10 == 1635148611) {
                                        int i43 = iZzg5 + 8;
                                        zzagc.zza(str3 == null, null);
                                        zzetVar.zzh(i43);
                                        zzafd zzafdVarZza = zzafd.zza(zzetVar);
                                        List list2 = zzafdVarZza.zza;
                                        zzalfVar2.zzc = zzafdVarZza.zzb;
                                        if (z19) {
                                            z17 = true;
                                        } else {
                                            fZzH = zzafdVarZza.zzk;
                                            z17 = false;
                                        }
                                        String str14 = zzafdVarZza.zzl;
                                        int i44 = zzafdVarZza.zzj;
                                        int i45 = zzafdVarZza.zzg;
                                        int i46 = zzafdVarZza.zzh;
                                        int i47 = zzafdVarZza.zzi;
                                        int i48 = zzafdVarZza.zze;
                                        int i49 = zzafdVarZza.zzf;
                                        str13 = str14;
                                        i39 = i44;
                                        i18 = i31;
                                        str7 = str10;
                                        zzalfVar = zzalfVar2;
                                        i36 = i45;
                                        zzgmVar = zzgmVar2;
                                        i34 = i48;
                                        str6 = MimeTypes.VIDEO_H264;
                                        i42 = i49;
                                        z19 = z17;
                                        i35 = i46;
                                        iZzc = i47;
                                        listZzj = list2;
                                    } else {
                                        i18 = i31;
                                        if (iZzB10 == 1752589123) {
                                            int i50 = iZzg5 + 8;
                                            zzagc.zza(str3 == null, null);
                                            zzetVar.zzh(i50);
                                            zzags zzagsVarZza = zzags.zza(zzetVar);
                                            List list3 = zzagsVarZza.zza;
                                            zzalfVar2.zzc = zzagsVarZza.zzb;
                                            if (z19) {
                                                z16 = true;
                                            } else {
                                                fZzH = zzagsVarZza.zzl;
                                                z16 = false;
                                            }
                                            int i51 = zzagsVarZza.zzm;
                                            int i52 = zzagsVarZza.zzc;
                                            String str15 = zzagsVarZza.zzn;
                                            int i53 = zzagsVarZza.zzk;
                                            if (i53 == -1) {
                                                i53 = i37;
                                            }
                                            int i54 = zzagsVarZza.zzd;
                                            int i55 = zzagsVarZza.zze;
                                            int i56 = zzagsVarZza.zzh;
                                            int i57 = zzagsVarZza.zzi;
                                            int i58 = zzagsVarZza.zzj;
                                            int i59 = zzagsVarZza.zzf;
                                            int i60 = zzagsVarZza.zzg;
                                            zzgmVar = zzagsVarZza.zzo;
                                            str6 = MimeTypes.VIDEO_H265;
                                            str7 = str10;
                                            zzalfVar = zzalfVar2;
                                            str13 = str15;
                                            i41 = i54;
                                            i40 = i55;
                                            i35 = i57;
                                            listZzj = list3;
                                            i34 = i59;
                                            i39 = i51;
                                            i38 = i52;
                                            i37 = i53;
                                            i36 = i56;
                                            iZzc = i58;
                                            i42 = i60;
                                            z19 = z16;
                                            str11 = str11;
                                        } else {
                                            if (iZzB10 == 1818785347) {
                                                int i61 = iZzg5 + 8;
                                                zzagc.zza(MimeTypes.VIDEO_H265.equals(str3), "lhvC must follow hvcC atom");
                                                if (zzgmVar2 != null) {
                                                    z15 = zzgmVar2.zza.size() >= 2;
                                                } else {
                                                    z15 = false;
                                                    zzgmVar2 = null;
                                                }
                                                zzagc.zza(z15, "must have at least two layers");
                                                zzetVar.zzh(i61);
                                                zzgmVar2.getClass();
                                                zzags zzagsVarZzb = zzags.zzb(zzetVar, zzgmVar2);
                                                zzagc.zza(zzalfVar2.zzc == zzagsVarZzb.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                int i62 = zzagsVarZzb.zzh;
                                                if (i62 != -1) {
                                                    zzagc.zza(i36 == i62, "colorSpace must be the same for both views");
                                                }
                                                int i63 = zzagsVarZzb.zzi;
                                                if (i63 != -1) {
                                                    zzagc.zza(i35 == i63, "colorRange must be the same for both views");
                                                }
                                                int i64 = zzagsVarZzb.zzj;
                                                if (i64 != -1) {
                                                    zzagc.zza(iZzc == i64, "colorTransfer must be the same for both views");
                                                }
                                                zzagc.zza(i34 == zzagsVarZzb.zzf, "bitdepthLuma must be the same for both views");
                                                zzagc.zza(i42 == zzagsVarZzb.zzg, "bitdepthChroma must be the same for both views");
                                                if (listZzj != null) {
                                                    int i65 = zzgwm.zzd;
                                                    zzgwj zzgwjVar = new zzgwj();
                                                    zzgwjVar.zzh(listZzj);
                                                    zzgwjVar.zzh(zzagsVarZzb.zza);
                                                    listZzj = zzgwjVar.zzi();
                                                } else {
                                                    zzagc.zza(false, "initializationData must be already set from hvcC atom");
                                                }
                                                str13 = zzagsVarZzb.zzn;
                                                str6 = "video/mv-hevc";
                                                str7 = str10;
                                            } else if (iZzB10 == 1987470147) {
                                                int i66 = iZzg5 + 8;
                                                zzagc.zza(str3 == null, null);
                                                zzetVar.zzh(i66);
                                                zzahn zzahnVarZza = zzahn.zza(zzetVar);
                                                List list4 = zzahnVarZza.zza;
                                                zzalfVar2.zzc = zzahnVarZza.zzb;
                                                String str16 = zzahnVarZza.zzc;
                                                i42 = zzahnVarZza.zzd;
                                                i34 = i42;
                                                listZzj = list4;
                                                str13 = str16;
                                                str6 = "video/vvc";
                                                str7 = str10;
                                                zzalfVar = zzalfVar2;
                                                zzgmVar = zzgmVar2;
                                                str11 = str11;
                                                i39 = 16;
                                            } else if (iZzB10 == 1986361461) {
                                                zzetVar.zzh(iZzg5 + 8);
                                                int iZzg6 = zzetVar.zzg();
                                                zzalb zzalbVar = null;
                                                while (iZzg6 - iZzg5 < i17) {
                                                    zzetVar.zzh(iZzg6);
                                                    int iZzB11 = zzetVar.zzB();
                                                    zzagc.zza(iZzB11 > 0, str10);
                                                    int i67 = iZzg6;
                                                    if (zzetVar.zzB() == 1702454643) {
                                                        zzetVar.zzh(i67 + 8);
                                                        int iZzg7 = zzetVar.zzg();
                                                        while (true) {
                                                            if (iZzg7 - i67 >= iZzB11) {
                                                                zzalbVar = null;
                                                                break;
                                                            }
                                                            zzetVar.zzh(iZzg7);
                                                            int iZzB12 = zzetVar.zzB();
                                                            zzagc.zza(iZzB12 > 0, str10);
                                                            int i68 = iZzg7;
                                                            if (zzetVar.zzB() == 1937011305) {
                                                                zzetVar.zzk(4);
                                                                int iZzs = zzetVar.zzs();
                                                                zzalbVar = new zzalb(new zzale(1 == (iZzs & 1), (iZzs & 2) == 2, (iZzs & 8) == i30));
                                                                break;
                                                            }
                                                            iZzg7 = i68 + iZzB12;
                                                            i30 = 8;
                                                        }
                                                    }
                                                    iZzg6 = i67 + iZzB11;
                                                    str3 = str3;
                                                    str10 = str10;
                                                    i30 = 8;
                                                }
                                                str6 = str3;
                                                str7 = str10;
                                                zzali zzaliVar = zzalbVar == null ? null : new zzali(zzalbVar);
                                                if (zzaliVar != null) {
                                                    if (zzgmVar2 == null) {
                                                        zzgmVar2 = null;
                                                    } else if (zzgmVar2.zza.size() >= 2) {
                                                        zzagc.zza(zzaliVar.zza(), "both eye views must be marked as available");
                                                        zzagc.zza(!zzaliVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                    }
                                                    if (i37 == -1) {
                                                        i34 = i34;
                                                        zzalfVar = zzalfVar2;
                                                        zzgmVar = zzgmVar2;
                                                        if (true != zzaliVar.zzb().zza().zzc()) {
                                                            str11 = str11;
                                                            i37 = 4;
                                                        } else {
                                                            i37 = 5;
                                                        }
                                                    } else {
                                                        i34 = i34;
                                                        zzalfVar = zzalfVar2;
                                                        zzgmVar = zzgmVar2;
                                                        str11 = str11;
                                                    }
                                                }
                                                i35 = i35;
                                                i34 = i34;
                                                zzalfVar = zzalfVar2;
                                                zzgmVar = zzgmVar2;
                                                i42 = i42;
                                                str11 = str11;
                                                i42 = i42;
                                                i35 = i35;
                                            } else {
                                                str6 = str3;
                                                str7 = str10;
                                                if (iZzB10 == 1685480259 || iZzB10 == 1685485123 || iZzB10 == 1685485379) {
                                                    i35 = i35;
                                                    i34 = i34;
                                                    zzalfVar = zzalfVar2;
                                                    zzgmVar = zzgmVar2;
                                                    i42 = i42;
                                                    str11 = str11;
                                                    zzfuVarZza = zzfu.zza(zzetVar);
                                                } else if (iZzB10 == 1987076931) {
                                                    int i69 = iZzg5 + 12;
                                                    zzagc.zza(str6 == null, null);
                                                    zzetVar.zzh(i69);
                                                    byte bZzs = (byte) zzetVar.zzs();
                                                    byte bZzs2 = (byte) zzetVar.zzs();
                                                    int iZzs2 = zzetVar.zzs();
                                                    int i70 = iZzs2 >> 4;
                                                    int i71 = iZzs2 >> 1;
                                                    String str17 = i18 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                                    if (str17.equals(MimeTypes.VIDEO_VP9)) {
                                                        listZzj = zzdq.zza(bZzs, bZzs2, (byte) i70, (byte) (i71 & 7));
                                                    }
                                                    int i72 = iZzs2 & 1;
                                                    int iZzs3 = zzetVar.zzs();
                                                    int iZzs4 = zzetVar.zzs();
                                                    int iZzb = zzi.zzb(iZzs3);
                                                    int i73 = 1 != i72 ? 2 : 1;
                                                    i42 = i70;
                                                    i34 = i42;
                                                    i18 = i18;
                                                    zzalfVar = zzalfVar2;
                                                    str6 = str17;
                                                    zzgmVar = zzgmVar2;
                                                    iZzc = zzi.zzc(iZzs4);
                                                    i35 = i73;
                                                    i36 = iZzb;
                                                } else if (iZzB10 == 1635135811) {
                                                    int i74 = i17 - 8;
                                                    byte[] bArr = new byte[i74];
                                                    zzetVar.zzm(bArr, 0, i74);
                                                    zzafc zzafcVarZza = zzafc.zza(bArr);
                                                    List list5 = zzafcVarZza.zza;
                                                    int i75 = zzafcVarZza.zzb;
                                                    int i76 = zzafcVarZza.zzc;
                                                    int i77 = zzafcVarZza.zzd;
                                                    iZzc = zzafcVarZza.zze;
                                                    listZzj = list5;
                                                    i42 = i75;
                                                    i34 = i42;
                                                    i35 = i77;
                                                    str6 = "video/av01";
                                                    i18 = i18;
                                                    zzalfVar = zzalfVar2;
                                                    zzgmVar = zzgmVar2;
                                                    str11 = str11;
                                                    i36 = i76;
                                                } else if (iZzB10 == 1668050025) {
                                                    if (byteBufferZzm == null) {
                                                        byteBufferZzm = zzm();
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferZzm;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(zzetVar.zzv());
                                                    byteBuffer.putShort(zzetVar.zzv());
                                                    byteBufferZzm = byteBuffer;
                                                    i18 = i18;
                                                } else if (iZzB10 == 1835295606) {
                                                    if (byteBufferZzm == null) {
                                                        byteBufferZzm = zzm();
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBufferZzm;
                                                    short sZzv3 = zzetVar.zzv();
                                                    short sZzv4 = zzetVar.zzv();
                                                    short sZzv5 = zzetVar.zzv();
                                                    i18 = i18;
                                                    short sZzv6 = zzetVar.zzv();
                                                    zzgmVar = zzgmVar2;
                                                    short sZzv7 = zzetVar.zzv();
                                                    zzalfVar = zzalfVar2;
                                                    short sZzv8 = zzetVar.zzv();
                                                    int i78 = i42;
                                                    short sZzv9 = zzetVar.zzv();
                                                    i34 = i34;
                                                    short sZzv10 = zzetVar.zzv();
                                                    long jZzz4 = zzetVar.zzz();
                                                    long jZzz5 = zzetVar.zzz();
                                                    byteBuffer2.position(1);
                                                    byteBuffer2.putShort(sZzv7);
                                                    byteBuffer2.putShort(sZzv8);
                                                    byteBuffer2.putShort(sZzv3);
                                                    byteBuffer2.putShort(sZzv4);
                                                    byteBuffer2.putShort(sZzv5);
                                                    byteBuffer2.putShort(sZzv6);
                                                    byteBuffer2.putShort(sZzv9);
                                                    byteBuffer2.putShort(sZzv10);
                                                    byteBuffer2.putShort((short) (jZzz4 / 10000));
                                                    byteBuffer2.putShort((short) (jZzz5 / 10000));
                                                    byteBufferZzm = byteBuffer2;
                                                    i42 = i78;
                                                    i35 = i35;
                                                } else {
                                                    i35 = i35;
                                                    i34 = i34;
                                                    zzalfVar = zzalfVar2;
                                                    zzgmVar = zzgmVar2;
                                                    i42 = i42;
                                                    if (iZzB10 == 1681012275) {
                                                        zzagc.zza(str6 == null, null);
                                                        str6 = MimeTypes.VIDEO_H263;
                                                    } else if (iZzB10 == 1702061171) {
                                                        zzagc.zza(str6 == null, null);
                                                        zzala zzalaVarZzp = zzp(zzetVar, iZzg5);
                                                        String strZza = zzalaVarZzp.zza();
                                                        byte[] bArrZzb = zzalaVarZzp.zzb();
                                                        if (bArrZzb != null) {
                                                            zzalaVar = zzalaVarZzp;
                                                            str6 = strZza;
                                                            listZzj = zzgwm.zzj(bArrZzb);
                                                        } else {
                                                            zzalaVar = zzalaVarZzp;
                                                            str6 = strZza;
                                                        }
                                                    } else if (iZzB10 == 1651798644) {
                                                        i18 = i18;
                                                        zzakyVarZzq = zzq(zzetVar, iZzg5);
                                                    } else if (iZzB10 == 1885434736) {
                                                        i18 = i18;
                                                        zzetVar.zzh(iZzg5 + 8);
                                                        fZzH = zzetVar.zzH() / zzetVar.zzH();
                                                        str11 = str11;
                                                        i42 = i42;
                                                        i35 = i35;
                                                        z19 = true;
                                                    } else if (iZzB10 == 1937126244) {
                                                        i18 = i18;
                                                        int i79 = iZzg5 + 8;
                                                        while (true) {
                                                            if (i79 - iZzg5 >= i17) {
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            zzetVar.zzh(i79);
                                                            int iZzB13 = zzetVar.zzB() + i79;
                                                            if (zzetVar.zzB() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(zzetVar.zzi(), i79, iZzB13);
                                                                break;
                                                            }
                                                            i79 = iZzB13;
                                                        }
                                                    } else if (iZzB10 == 1936995172) {
                                                        int iZzs5 = zzetVar.zzs();
                                                        zzetVar.zzk(3);
                                                        if (iZzs5 == 0) {
                                                            int iZzs6 = zzetVar.zzs();
                                                            if (iZzs6 == 0) {
                                                                i18 = i18;
                                                                str11 = str11;
                                                                i42 = i42;
                                                                i35 = i35;
                                                                i37 = 0;
                                                            } else if (iZzs6 == 1) {
                                                                i18 = i18;
                                                                str11 = str11;
                                                                i42 = i42;
                                                                i35 = i35;
                                                                i37 = 1;
                                                            } else if (iZzs6 == 2) {
                                                                i18 = i18;
                                                                str11 = str11;
                                                                i42 = i42;
                                                                i35 = i35;
                                                                i37 = 2;
                                                            } else if (iZzs6 == 3) {
                                                                i37 = 3;
                                                                str11 = str11;
                                                                i42 = i42;
                                                                i35 = i35;
                                                            }
                                                        }
                                                        i18 = i18;
                                                        i18 = i18;
                                                    } else if (iZzB10 == 1634760259) {
                                                        i18 = i18;
                                                        int i80 = i17 - 12;
                                                        byte[] bArr2 = new byte[i80];
                                                        zzetVar.zzh(iZzg5 + 12);
                                                        zzetVar.zzm(bArr2, 0, i80);
                                                        String strZzd = zzdq.zzd(bArr2);
                                                        zzgwm zzgwmVarZzj2 = zzgwm.zzj(bArr2);
                                                        zzi zziVarZzl = zzl(new zzet(bArr2));
                                                        str13 = strZzd;
                                                        listZzj = zzgwmVarZzj2;
                                                        i34 = zziVarZzl.zzf;
                                                        i42 = zziVarZzl.zzg;
                                                        i36 = zziVarZzl.zzb;
                                                        i35 = zziVarZzl.zzc;
                                                        str6 = "video/apv";
                                                        iZzc = zziVarZzl.zzd;
                                                    } else if (iZzB10 != 1668246642) {
                                                        i18 = i18;
                                                        i18 = i18;
                                                    } else if (i36 != -1) {
                                                        i18 = i18;
                                                    } else if (iZzc == -1) {
                                                        int iZzB14 = zzetVar.zzB();
                                                        if (iZzB14 == 1852009592 || iZzB14 == 1852009571) {
                                                            str11 = str11;
                                                            int iZzt5 = zzetVar.zzt();
                                                            int iZzt6 = zzetVar.zzt();
                                                            zzetVar.zzk(2);
                                                            if (i17 != 19) {
                                                                z14 = false;
                                                            } else if ((zzetVar.zzs() & 128) != 0) {
                                                                i17 = 19;
                                                                z14 = true;
                                                            } else {
                                                                i17 = 19;
                                                                z14 = false;
                                                            }
                                                            int iZzb2 = zzi.zzb(iZzt5);
                                                            int i81 = true != z14 ? 2 : 1;
                                                            i36 = iZzb2;
                                                            i35 = i81;
                                                            iZzc = zzi.zzc(iZzt6);
                                                            i42 = i42;
                                                        } else {
                                                            str11 = str11;
                                                            zzeg.zzc(str11, "Unsupported color type: ".concat(zzfz.zze(iZzB14)));
                                                            i36 = -1;
                                                            iZzc = -1;
                                                            i42 = i42;
                                                            i35 = i35;
                                                        }
                                                    } else {
                                                        str11 = str11;
                                                        i36 = -1;
                                                    }
                                                }
                                                i42 = i42;
                                                i35 = i35;
                                            }
                                            zzalfVar = zzalfVar2;
                                            zzgmVar = zzgmVar2;
                                        }
                                        i33 += i17;
                                        str11 = str11;
                                        iZzB7 = iZzB7;
                                        i31 = i18;
                                        str3 = str6;
                                        zzgmVar2 = zzgmVar;
                                        zzalfVar2 = zzalfVar;
                                        str10 = str7;
                                        i34 = i34;
                                        i30 = 8;
                                    }
                                    str11 = str11;
                                    i33 += i17;
                                    str11 = str11;
                                    iZzB7 = iZzB7;
                                    i31 = i18;
                                    str3 = str6;
                                    zzgmVar2 = zzgmVar;
                                    zzalfVar2 = zzalfVar;
                                    str10 = str7;
                                    i34 = i34;
                                    i30 = 8;
                                }
                                int i82 = i35;
                                String str18 = str3;
                                int i83 = i34;
                                i15 = iZzB7;
                                zzalf zzalfVar3 = zzalfVar2;
                                int i84 = i42;
                                str9 = str11;
                                c11 = 2;
                                if (zzfuVarZza != null) {
                                    str4 = zzfuVarZza.zza;
                                    str5 = "video/dolby-vision";
                                } else {
                                    str4 = str13;
                                    str5 = str18;
                                }
                                if (str5 == null) {
                                    i16 = i13;
                                    strZzc = str12;
                                    iZzB = i32;
                                    zzalfVar2 = zzalfVar3;
                                } else {
                                    zzt zztVar = new zzt();
                                    iZzB = i32;
                                    zztVar.zzb(iZzB);
                                    zztVar.zzo(str5);
                                    zztVar.zzk(str4);
                                    zztVar.zzv(iZzt3);
                                    zztVar.zzw(iZzt4);
                                    zztVar.zzx(i41);
                                    zztVar.zzy(i40);
                                    zztVar.zzB(fZzH);
                                    i16 = i13;
                                    zztVar.zzA(i16);
                                    zztVar.zzC(bArrCopyOfRange);
                                    zztVar.zzD(i37);
                                    zztVar.zzr(listZzj);
                                    zztVar.zzq(i39);
                                    zztVar.zzF(i38);
                                    zztVar.zzs(zzqVar3);
                                    strZzc = str12;
                                    zztVar.zze(strZzc);
                                    zzh zzhVar = new zzh();
                                    zzhVar.zza(i36);
                                    zzhVar.zzb(i82);
                                    zzhVar.zzc(iZzc);
                                    zzhVar.zzd(byteBufferZzm != null ? byteBufferZzm.array() : null);
                                    zzhVar.zze(i83);
                                    zzhVar.zzf(i84);
                                    zztVar.zzE(zzhVar.zzg());
                                    if (zzakyVarZzq != null) {
                                        zztVar.zzi(zzhah.zzb(zzakyVarZzq.zza()));
                                        zztVar.zzj(zzhah.zzb(zzakyVarZzq.zzb()));
                                    } else if (zzalaVar != null) {
                                        zztVar.zzi(zzhah.zzb(zzalaVar.zzc()));
                                        zztVar.zzj(zzhah.zzb(zzalaVar.zzd()));
                                    }
                                    zzalfVar2 = zzalfVar3;
                                    zzalfVar2.zzb = zztVar.zzO();
                                }
                            } else if (iZzB8 == 1836069985 || iZzB8 == 1701733217 || iZzB8 == 1633889587 || iZzB8 == 1700998451 || iZzB8 == 1633889588 || iZzB8 == 1835823201 || iZzB8 == 1685353315 || iZzB8 == 1685353317 || iZzB8 == 1685353320 || iZzB8 == 1685353324 || iZzB8 == 1685353336 || iZzB8 == 1935764850 || iZzB8 == 1935767394 || iZzB8 == 1819304813 || iZzB8 == 1936684916 || iZzB8 == 1953984371 || iZzB8 == 778924082 || iZzB8 == 778924083 || iZzB8 == 1835557169 || iZzB8 == 1835560241 || iZzB8 == 1634492771 || iZzB8 == 1634492791 || iZzB8 == 1970037111 || iZzB8 == 1332770163 || iZzB8 == 1716281667 || iZzB8 == 1767992678 || iZzB8 == 1768973165 || iZzB8 == 1718641517) {
                                iZzB6 = iZzB6;
                                sZzv = sZzv;
                                i27 = i27;
                                i28 = i28;
                                j15 = j15;
                                zzo(zzetVar4, iZzB8, i29, iZzB7, iZzB, strZzc, z11, zzqVar, zzalfVar2, i26);
                                zzetVar = zzetVar4;
                                str2 = str;
                                i29 = i29;
                                i15 = iZzB7;
                                strZzc = strZzc;
                                zzalfVar2 = zzalfVar2;
                                i26 = i26;
                                jZzz2 = jZzz2;
                                zzfxVar3 = zzfxVar3;
                                s10 = sZzv2;
                                i16 = i13;
                                str9 = str9;
                                c11 = 2;
                            } else {
                                if (iZzB8 == 1414810956 || iZzB8 == 1954034535 || iZzB8 == 2004251764 || iZzB8 == 1937010800 || iZzB8 == 1664495672 || iZzB8 == 1836070003) {
                                    zzetVar4.zzh(i29 + 16);
                                    String str19 = MimeTypes.APPLICATION_TTML;
                                    if (iZzB8 != 1414810956) {
                                        if (iZzB8 == 1954034535) {
                                            int i85 = iZzB7 - 16;
                                            byte[] bArr3 = new byte[i85];
                                            zzetVar4.zzm(bArr3, 0, i85);
                                            zzgwmVarZzj = zzgwm.zzj(bArr3);
                                            str19 = MimeTypes.APPLICATION_TX3G;
                                        } else {
                                            if (iZzB8 == 2004251764) {
                                                str19 = MimeTypes.APPLICATION_MP4VTT;
                                            } else {
                                                if (iZzB8 == 1937010800) {
                                                    j12 = 0;
                                                } else {
                                                    int i86 = i14;
                                                    if (iZzB8 == 1664495672) {
                                                        zzalfVar2.zzd = i86;
                                                        str19 = MimeTypes.APPLICATION_MP4CEA608;
                                                    } else {
                                                        int iZzg8 = zzetVar4.zzg();
                                                        zzetVar4.zzk(4);
                                                        if (zzetVar4.zzB() == 1702061171) {
                                                            zzala zzalaVarZzp2 = zzp(zzetVar4, iZzg8);
                                                            if (zzalaVarZzp2.zzb() != null && zzalaVarZzp2.zzb().length == 64) {
                                                                String strZzk = zzk(zzalaVarZzp2.zzb(), sZzv, sZzv2);
                                                                String str20 = zzfl.zza;
                                                                zzgwmVarZzj = zzgwm.zzj(strZzk.getBytes(StandardCharsets.UTF_8));
                                                                str19 = MimeTypes.APPLICATION_VOBSUB;
                                                            }
                                                            str2 = str;
                                                            s10 = sZzv2;
                                                            i16 = i13;
                                                        } else {
                                                            zzgwmVarZzj = null;
                                                            str19 = null;
                                                        }
                                                    }
                                                }
                                                zzgwmVarZzj = null;
                                            }
                                            j12 = Long.MAX_VALUE;
                                            zzgwmVarZzj = null;
                                        }
                                        iZzB7 = iZzB7;
                                        j12 = Long.MAX_VALUE;
                                    } else {
                                        j12 = Long.MAX_VALUE;
                                        zzgwmVarZzj = null;
                                    }
                                    if (str19 != null) {
                                        zzet zzetVar5 = zzetVar4;
                                        zzt zztVar2 = new zzt();
                                        zztVar2.zzb(iZzB);
                                        zztVar2.zzo(str19);
                                        zztVar2.zze(strZzc);
                                        zztVar2.zzt(j12);
                                        zztVar2.zzr(zzgwmVarZzj);
                                        zzalfVar2.zzb = zztVar2.zzO();
                                        i15 = iZzB7;
                                        zzetVar = zzetVar5;
                                    } else {
                                        zzetVar = zzetVar4;
                                        i15 = iZzB7;
                                    }
                                    str2 = str;
                                    s10 = sZzv2;
                                    i16 = i13;
                                } else if (iZzB8 == 1835365492) {
                                    zzetVar4.zzh(i29 + 16);
                                    char c13 = c10;
                                    zzetVar4.zzM(c13);
                                    String strZzM = zzetVar4.zzM(c13);
                                    if (strZzM != null) {
                                        zzt zztVar3 = new zzt();
                                        zztVar3.zzb(iZzB);
                                        zztVar3.zzo(strZzM);
                                        zzalfVar2.zzb = zztVar3.zzO();
                                    }
                                } else if (iZzB8 == 1667329389) {
                                    zzt zztVar4 = new zzt();
                                    zztVar4.zzb(iZzB);
                                    zztVar4.zzo(MimeTypes.APPLICATION_CAMERA_MOTION);
                                    zzalfVar2.zzb = zztVar4.zzO();
                                }
                                zzetVar = zzetVar4;
                                i15 = iZzB7;
                                str2 = str;
                                s10 = sZzv2;
                                i16 = i13;
                            }
                            zzetVar.zzh(i29 + i15);
                            i26++;
                            zzet zzetVar6 = zzetVar;
                            str8 = str9;
                            zzetVar4 = zzetVar6;
                            i13 = i16;
                            c11 = c11;
                            iZzB6 = iZzB6;
                            sZzv2 = s10;
                            str = str2;
                            zzfxVar3 = zzfxVar3;
                            jZzz2 = jZzz2;
                            sZzv = sZzv;
                            iZzt = i28;
                            j15 = j15;
                            i14 = 1;
                            c10 = 0;
                            zzalfVar2 = zzalfVar2;
                            strZzc = strZzc;
                            i10 = i27;
                        }
                        int i87 = i10;
                        int i88 = iZzt;
                        zzalf zzalfVar4 = zzalfVar2;
                        long j16 = jZzz2;
                        zzfx zzfxVar4 = zzfxVar3;
                        long j17 = j15;
                        String str21 = str;
                        if (z10) {
                            zzfxVar2 = zzfxVar4;
                        } else {
                            zzfxVar2 = zzfxVar4;
                            zzfx zzfxVarZzd4 = zzfxVar2.zzd(1701082227);
                            if (zzfxVarZzd4 != null && (pairZzn = zzn(zzfxVarZzd4)) != null) {
                                long[] jArr3 = (long[]) pairZzn.first;
                                jArr2 = (long[]) pairZzn.second;
                                jArr = jArr3;
                            }
                            zzvVarZzO = zzalfVar4.zzb;
                            if (zzvVarZzO == null) {
                                zzgtaVar = zzgtaVar;
                                zzamiVar = null;
                            } else {
                                if (i88 != 0) {
                                    zzfwVar = new zzfw(i88);
                                    zzt zztVarZza = zzvVarZzO.zza();
                                    zzapVar = zzvVarZzO.zzl;
                                    if (zzapVar != null) {
                                        zzapVar2 = zzapVar.zzg(zzfwVar);
                                    } else {
                                        zzapVar2 = new zzap(C.TIME_UNSET, zzfwVar);
                                    }
                                    zztVarZza.zzl(zzapVar2);
                                    zzvVarZzO = zztVarZza.zzO();
                                }
                                zzami zzamiVar3 = new zzami(iZzB, i87, zzalc.zza(j16, j17, str21), j11, jZzv, zzalc.zzb(j16, j17, str21), zzvVarZzO, zzalfVar4.zzd, zzalfVar4.zza, zzalfVar4.zzc, jArr, jArr2);
                                zzgtaVar = zzgtaVar;
                                zzamiVar = zzamiVar3;
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        zzvVarZzO = zzalfVar4.zzb;
                        if (zzvVarZzO == null) {
                            zzgtaVar = zzgtaVar;
                            zzamiVar = null;
                        } else {
                            if (i88 != 0) {
                                zzfwVar = new zzfw(i88);
                                zzt zztVarZza2 = zzvVarZzO.zza();
                                zzapVar = zzvVarZzO.zzl;
                                if (zzapVar != null) {
                                    zzapVar2 = zzapVar.zzg(zzfwVar);
                                } else {
                                    zzapVar2 = new zzap(C.TIME_UNSET, zzfwVar);
                                }
                                zztVarZza2.zzl(zzapVar2);
                                zzvVarZzO = zztVarZza2.zzO();
                            }
                            zzami zzamiVar4 = new zzami(iZzB, i87, zzalc.zza(j16, j17, str21), j11, jZzv, zzalc.zzb(j16, j17, str21), zzvVarZzO, zzalfVar4.zzd, zzalfVar4.zza, zzalfVar4.zzc, jArr, jArr2);
                            zzgtaVar = zzgtaVar;
                            zzamiVar = zzamiVar4;
                        }
                    }
                    zzamiVar2 = (zzami) zzgtaVar.apply(zzamiVar);
                    if (zzamiVar2 != null) {
                        zzfx zzfxVarZzd5 = zzfxVar2.zzd(1835297121);
                        zzfxVarZzd5.getClass();
                        zzfx zzfxVarZzd6 = zzfxVarZzd5.zzd(1835626086);
                        zzfxVarZzd6.getClass();
                        zzfx zzfxVarZzd7 = zzfxVarZzd6.zzd(1937007212);
                        zzfxVarZzd7.getClass();
                        zzaml zzamlVarZzg = zzg(zzamiVar2, zzfxVarZzd7, zzagrVar, false);
                        arrayList = arrayList2;
                        arrayList.add(zzamlVarZzg);
                    } else {
                        arrayList = arrayList2;
                    }
                    i19 = i11 + 1;
                    arrayList2 = arrayList;
                }
                zzfxVar2 = zzfxVar3;
                zzamiVar = null;
                zzamiVar2 = (zzami) zzgtaVar.apply(zzamiVar);
                if (zzamiVar2 != null) {
                    zzfx zzfxVarZzd8 = zzfxVar2.zzd(1835297121);
                    zzfxVarZzd8.getClass();
                    zzfx zzfxVarZzd9 = zzfxVarZzd8.zzd(1835626086);
                    zzfxVarZzd9.getClass();
                    zzfx zzfxVarZzd10 = zzfxVarZzd9.zzd(1937007212);
                    zzfxVarZzd10.getClass();
                    zzaml zzamlVarZzg2 = zzg(zzamiVar2, zzfxVarZzd10, zzagrVar, false);
                    arrayList = arrayList2;
                    arrayList.add(zzamlVarZzg2);
                } else {
                    arrayList = arrayList2;
                }
                i19 = i11 + 1;
                arrayList2 = arrayList;
            }
            i19 = i11 + 1;
            arrayList2 = arrayList;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static zzap zzc(zzfy zzfyVar) {
        int iZzF;
        zzet zzetVar = zzfyVar.zza;
        zzetVar.zzh(8);
        zzap zzapVar = new zzap(C.TIME_UNSET, new zzao[0]);
        while (zzetVar.zzd() >= 8) {
            int iZzg = zzetVar.zzg();
            int iZzB = zzetVar.zzB() + iZzg;
            int iZzB2 = zzetVar.zzB();
            zzap zzapVar2 = null;
            if (iZzB2 == 1835365473) {
                zzetVar.zzh(iZzg);
                zzetVar.zzk(8);
                zzf(zzetVar);
                while (zzetVar.zzg() < iZzB) {
                    int iZzg2 = zzetVar.zzg();
                    int iZzB3 = zzetVar.zzB() + iZzg2;
                    if (zzetVar.zzB() == 1768715124) {
                        zzetVar.zzh(iZzg2);
                        zzetVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzetVar.zzg() < iZzB3) {
                            zzao zzaoVarZzc = zzalt.zzc(zzetVar);
                            if (zzaoVarZzc != null) {
                                arrayList.add(zzaoVarZzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                            break;
                        }
                        break;
                    }
                    zzetVar.zzh(iZzB3);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == 1936553057) {
                zzetVar.zzh(iZzg);
                zzetVar.zzk(12);
                while (zzetVar.zzg() < iZzB) {
                    int iZzg3 = zzetVar.zzg();
                    int iZzB4 = zzetVar.zzB();
                    if (zzetVar.zzB() == 1935766900) {
                        if (iZzB4 < 16) {
                            break;
                        }
                        zzetVar.zzk(4);
                        int i10 = -1;
                        int i11 = 0;
                        for (int i12 = 0; i12 < 2; i12++) {
                            int iZzs = zzetVar.zzs();
                            int iZzs2 = zzetVar.zzs();
                            if (iZzs == 0) {
                                i10 = iZzs2;
                            } else if (iZzs == 1) {
                                i11 = iZzs2;
                            }
                        }
                        if (i10 == 12) {
                            iZzF = PsExtractor.VIDEO_STREAM_MASK;
                        } else if (i10 == 13) {
                            iZzF = AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
                        } else if (i10 == 21 && zzetVar.zzd() >= 8 && zzetVar.zzg() + 8 <= iZzB) {
                            int iZzB5 = zzetVar.zzB();
                            int iZzB6 = zzetVar.zzB();
                            if (iZzB5 < 12 || iZzB6 != 1936877170) {
                                iZzF = -2147483647;
                            } else {
                                iZzF = zzetVar.zzF();
                            }
                        } else {
                            iZzF = -2147483647;
                        }
                        if (iZzF == -2147483647) {
                            break;
                        }
                        zzapVar2 = new zzap(C.TIME_UNSET, new zzajx(iZzF, i11));
                        break;
                    }
                    zzetVar.zzh(iZzg3 + iZzB4);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzi(zzetVar));
            } else if (iZzB2 == 1667788908) {
                zzapVar = zzapVar.zzf(zzh(zzetVar));
            }
            zzetVar.zzh(iZzB);
        }
        return zzapVar;
    }

    public static zzgb zzd(zzet zzetVar) {
        long jZzD;
        long jZzD2;
        zzetVar.zzh(8);
        if (zza(zzetVar.zzB()) == 0) {
            jZzD = zzetVar.zzz();
            jZzD2 = zzetVar.zzz();
        } else {
            jZzD = zzetVar.zzD();
            jZzD2 = zzetVar.zzD();
        }
        return new zzgb(jZzD, jZzD2, zzetVar.zzz());
    }

    public static zzap zze(zzfx zzfxVar) {
        zzfv zzfvVar;
        zzfy zzfyVarZzc = zzfxVar.zzc(1751411826);
        zzfy zzfyVarZzc2 = zzfxVar.zzc(1801812339);
        zzfy zzfyVarZzc3 = zzfxVar.zzc(1768715124);
        if (zzfyVarZzc != null && zzfyVarZzc2 != null && zzfyVarZzc3 != null && zzj(zzfyVarZzc.zza) == 1835299937) {
            zzet zzetVar = zzfyVarZzc2.zza;
            zzetVar.zzh(12);
            int iZzB = zzetVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i10 = 0; i10 < iZzB; i10++) {
                int iZzB2 = zzetVar.zzB();
                zzetVar.zzk(4);
                strArr[i10] = zzetVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzet zzetVar2 = zzfyVarZzc3.zza;
            zzetVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzetVar2.zzd() > 8) {
                int iZzg = zzetVar2.zzg() + zzetVar2.zzB();
                int iZzB3 = zzetVar2.zzB() - 1;
                if (iZzB3 < 0 || iZzB3 >= iZzB) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB3).length() + 41);
                    sb2.append("Skipped metadata with unknown key index: ");
                    sb2.append(iZzB3);
                    zzeg.zzc("BoxParsers", sb2.toString());
                } else {
                    String str = strArr[iZzB3];
                    while (true) {
                        int iZzg2 = zzetVar2.zzg();
                        if (iZzg2 < iZzg) {
                            int iZzB4 = zzetVar2.zzB();
                            if (zzetVar2.zzB() == 1684108385) {
                                int iZzB5 = zzetVar2.zzB();
                                int iZzB6 = zzetVar2.zzB();
                                int i11 = iZzB4 - 16;
                                byte[] bArr = new byte[i11];
                                zzetVar2.zzm(bArr, 0, i11);
                                try {
                                    zzfvVar = new zzfv(str, bArr, iZzB6, iZzB5);
                                    break;
                                } catch (Exception unused) {
                                    zzeg.zzc("MetadataUtil", "Failed to parse metadata entry with key: ".concat(String.valueOf(str)));
                                    zzfvVar = null;
                                    break;
                                }
                            }
                            zzetVar2.zzh(iZzg2 + iZzB4);
                        }
                        zzfvVar = null;
                        break;
                    }
                    if (zzfvVar != null) {
                        arrayList.add(zzfvVar);
                    }
                }
                zzetVar2.zzh(iZzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzet zzetVar) {
        int iZzg = zzetVar.zzg();
        zzetVar.zzk(4);
        if (zzetVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzetVar.zzh(iZzg);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0284  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Code duplicated, block: B:106:0x029f  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x02db A[DONT_INVERT, LOOP:14: B:116:0x02db->B:120:0x02e6, LOOP_START, PHI: r33
      0x02db: PHI (r33v2 int) = (r33v1 int), (r33v3 int) binds: [B:115:0x02d9, B:120:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e6 A[LOOP:14: B:116:0x02db->B:120:0x02e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x02ec A[EDGE_INSN: B:121:0x02ec->B:122:0x02ee BREAK  A[LOOP:14: B:116:0x02db->B:120:0x02e6]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x0307  */
    /* JADX WARN: Code duplicated, block: B:130:0x030f  */
    /* JADX WARN: Code duplicated, block: B:132:0x031c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0328  */
    /* JADX WARN: Code duplicated, block: B:136:0x0333  */
    /* JADX WARN: Code duplicated, block: B:137:0x033d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0396  */
    /* JADX WARN: Code duplicated, block: B:141:0x0399  */
    /* JADX WARN: Code duplicated, block: B:146:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:153:0x0438  */
    /* JADX WARN: Code duplicated, block: B:155:0x0447  */
    /* JADX WARN: Code duplicated, block: B:157:0x044d  */
    /* JADX WARN: Code duplicated, block: B:183:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:184:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:196:0x0554  */
    /* JADX WARN: Code duplicated, block: B:197:0x0556  */
    /* JADX WARN: Code duplicated, block: B:201:0x0569  */
    /* JADX WARN: Code duplicated, block: B:203:0x0573  */
    /* JADX WARN: Code duplicated, block: B:206:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:208:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:209:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:221:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:223:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:229:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:232:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:233:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:235:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:239:0x061c  */
    /* JADX WARN: Code duplicated, block: B:240:0x061e  */
    /* JADX WARN: Code duplicated, block: B:243:0x0624  */
    /* JADX WARN: Code duplicated, block: B:244:0x0627  */
    /* JADX WARN: Code duplicated, block: B:246:0x062a  */
    /* JADX WARN: Code duplicated, block: B:248:0x062e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0632  */
    /* JADX WARN: Code duplicated, block: B:252:0x0636  */
    /* JADX WARN: Code duplicated, block: B:253:0x0639  */
    /* JADX WARN: Code duplicated, block: B:255:0x063c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0650  */
    /* JADX WARN: Code duplicated, block: B:261:0x065c  */
    /* JADX WARN: Code duplicated, block: B:263:0x0669  */
    /* JADX WARN: Code duplicated, block: B:265:0x068c  */
    /* JADX WARN: Code duplicated, block: B:267:0x0691  */
    /* JADX WARN: Code duplicated, block: B:282:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:295:0x05b4 A[EDGE_INSN: B:295:0x05b4->B:213:0x05b4 BREAK  A[LOOP:6: B:204:0x059d->B:212:0x05b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x014b A[LOOP:0: B:61:0x0145->B:63:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x015f A[LOOP:1: B:65:0x015d->B:66:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197 A[LOOP:3: B:70:0x0195->B:71:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0213  */
    /* JADX WARN: Code duplicated, block: B:80:0x0219  */
    /* JADX WARN: Code duplicated, block: B:82:0x021f A[LOOP:12: B:79:0x0217->B:82:0x021f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0254 A[ADDED_TO_REGION, LOOP:13: B:90:0x0254->B:92:0x0258, LOOP_START, PHI: r9 r33 r34
      0x0254: PHI (r9v9 int) = (r9v3 int), (r9v10 int) binds: [B:88:0x0251, B:92:0x0258] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r33v5 int) = (r33v1 int), (r33v6 int) binds: [B:88:0x0251, B:92:0x0258] A[DONT_GENERATE, DONT_INLINE]
      0x0254: PHI (r34v4 int) = (r34v1 int), (r34v8 int) binds: [B:88:0x0251, B:92:0x0258] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0256 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0258 A[LOOP:13: B:90:0x0254->B:92:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0274  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r23v31 */
    /* JADX WARN: Type inference failed for: r23v32 */
    /* JADX WARN: Type inference failed for: r23v33 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r29v2, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r45v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r45v15 */
    /* JADX WARN: Type inference failed for: r45v16 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    public static zzaml zzg(zzami zzamiVar, zzfx zzfxVar, zzagr zzagrVar, boolean z10) throws zzat {
        zzald zzalhVar;
        boolean z11;
        int iZzH;
        int iZzH2;
        int i10;
        int iZzH3;
        int i11;
        int i12;
        ArrayList arrayList;
        ?? r31;
        long[] jArr;
        int[] iArr;
        zzet zzetVar;
        long[] jArrCopyOf;
        int i13;
        zzald zzaldVar;
        int iZzH4;
        int i14;
        int i15;
        long j10;
        long j11;
        long j12;
        int i16;
        int i17;
        int i18;
        int iZzH5;
        int iZzB;
        int iZzB2;
        ?? r10;
        long[] jArr2;
        ?? CopyOf;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        long[] jArr3;
        int i25;
        int[] iArr2;
        long j13;
        long j14;
        int i26;
        String str;
        long j15;
        ?? r23;
        int i27;
        ?? r24;
        int i28;
        int iZzc;
        ?? r38;
        int i29;
        boolean zZza;
        ?? r15;
        long[] jArr4;
        long j16;
        long j17;
        long jZzv;
        int[] iArrZzf;
        long[] jArr5;
        ?? r29;
        int length;
        long j18;
        int i30;
        long j19;
        int[] iArr3;
        int i31;
        boolean z12;
        long[] jArr6;
        int[] iArr4;
        int[] iArr5;
        int i32;
        int i33;
        boolean z13;
        int i34;
        int[] iArr6;
        int[] iArr7;
        boolean z14;
        boolean z15;
        long[] jArr7;
        int[] iArr8;
        ?? r11;
        long[] jArr8;
        int i35;
        boolean z16;
        int i36;
        int i37;
        long j20;
        ?? r12;
        long j21;
        int i38;
        int i39;
        long[] jArr9;
        long jZzv2;
        boolean z17;
        int[] iArr9;
        int[] iArr10;
        long j22;
        int[] iArr11;
        int i40;
        long jZzv3;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        boolean z18;
        boolean z19;
        int length2;
        long jZzv4;
        int i46;
        long[] jArr10;
        int[] iArr12;
        long j23;
        int i47;
        int i48;
        int i49;
        int[] iArr13;
        int[] iArr14;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        long j24;
        int iMax;
        int i55;
        int i56;
        zzami zzamiVarZzb = zzamiVar;
        zzfy zzfyVarZzc = zzfxVar.zzc(1937011578);
        if (zzfyVarZzc != null) {
            zzalhVar = new zzalg(zzfyVarZzc, zzamiVarZzb.zzg);
        } else {
            zzfy zzfyVarZzc2 = zzfxVar.zzc(1937013298);
            if (zzfyVarZzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzalhVar = new zzalh(zzfyVarZzc2);
        }
        int iZza = zzalhVar.zza();
        if (iZza == 0) {
            return new zzaml(zzamiVarZzb, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzamiVarZzb.zzb == 2) {
            long j25 = zzamiVarZzb.zzf;
            if (j25 > 0) {
                zzt zztVarZza = zzamiVarZzb.zzg.zza();
                zztVarZza.zzz(iZza / (j25 / 1000000.0f));
                zzamiVarZzb = zzamiVarZzb.zzb(zztVarZza.zzO());
            }
        }
        zzfy zzfyVarZzc3 = zzfxVar.zzc(1937007471);
        if (zzfyVarZzc3 == null) {
            zzfyVarZzc3 = zzfxVar.zzc(1668232756);
            zzfyVarZzc3.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        zzfy zzfyVarZzc4 = zzfxVar.zzc(1937011555);
        zzfyVarZzc4.getClass();
        zzet zzetVar2 = zzfyVarZzc4.zza;
        zzfy zzfyVarZzc5 = zzfxVar.zzc(1937011827);
        zzfyVarZzc5.getClass();
        zzet zzetVar3 = zzfyVarZzc5.zza;
        zzfy zzfyVarZzc6 = zzfxVar.zzc(1937011571);
        zzet zzetVar4 = zzfyVarZzc6 != null ? zzfyVarZzc6.zza : null;
        zzfy zzfyVarZzc7 = zzfxVar.zzc(1668576371);
        zzet zzetVar5 = zzfyVarZzc7 != null ? zzfyVarZzc7.zza : null;
        zzakz zzakzVar = new zzakz(zzetVar2, zzfyVarZzc3.zza, z11);
        zzetVar3.zzh(12);
        int iZzH6 = zzetVar3.zzH() - 1;
        int iZzH7 = zzetVar3.zzH();
        int iZzH8 = zzetVar3.zzH();
        if (zzetVar5 != null) {
            zzetVar5.zzh(12);
            iZzH = zzetVar5.zzH();
        } else {
            iZzH = 0;
        }
        if (zzetVar4 != null) {
            zzetVar4.zzh(12);
            iZzH2 = zzetVar4.zzH();
            if (iZzH2 > 0) {
                iZzH3 = zzetVar4.zzH() - 1;
                i10 = 0;
            } else {
                i10 = 0;
                iZzH3 = -1;
                zzetVar4 = null;
            }
        } else {
            iZzH2 = 0;
            i10 = 0;
            iZzH3 = -1;
        }
        int iZzb = zzalhVar.zzb();
        zzv zzvVar = zzamiVarZzb.zzg;
        if (iZzb != -1) {
            String str2 = zzvVar.zzp;
            i11 = 1;
            if ((MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2)) && iZzH6 == 0) {
                if (iZzH == 0 && iZzH2 == 0) {
                    iZzH6 = i10;
                    i12 = 1;
                } else {
                    i12 = i10;
                    iZzH6 = i12;
                }
            }
            arrayList = new ArrayList();
            if (zzetVar4 == null) {
                r31 = i11;
            } else {
                r31 = i10;
            }
            if (i12 != 0) {
                i46 = zzakzVar.zza;
                jArr10 = new long[i46];
                iArr12 = new int[i46];
                while (zzakzVar.zza()) {
                    int i57 = zzakzVar.zzb;
                    jArr10[i57] = zzakzVar.zzd;
                    iArr12[i57] = zzakzVar.zzc;
                }
                j23 = iZzH8;
                i47 = 8192 / iZzb;
                i48 = i10;
                i49 = i48;
                while (i48 < i46) {
                    int i58 = iArr12[i48];
                    String str3 = zzfl.zza;
                    i49 += ((i58 + i47) - 1) / i47;
                    i48++;
                }
                jArr2 = new long[i49];
                iArr13 = new int[i49];
                jArr3 = new long[i49];
                iArr14 = new int[i49];
                i50 = i10;
                i51 = i50;
                i52 = i51;
                i53 = i52;
                i54 = i53;
                while (i50 < i46) {
                    int i59 = iArr12[i50];
                    j24 = jArr10[i50];
                    int i60 = i54;
                    int i61 = i46;
                    iMax = i53;
                    i55 = i60;
                    int i62 = i50;
                    i56 = i59;
                    while (i56 > 0) {
                        int iMin = Math.min(i47, i56);
                        jArr2[i55] = j24;
                        int i63 = i56;
                        int i64 = iZzb * iMin;
                        iArr13[i55] = i64;
                        int i65 = i52 + i64;
                        iMax = Math.max(iMax, i64);
                        long j26 = j23;
                        jArr3[i55] = j26 * ((long) i51);
                        iArr14[i55] = i11;
                        j24 += (long) iArr13[i55];
                        i51 += iMin;
                        i56 = i63 - iMin;
                        i55++;
                        i52 = i65;
                        j23 = j26;
                    }
                    long j27 = j23;
                    i50 = i62 + 1;
                    int i66 = i55;
                    i53 = iMax;
                    i46 = i61;
                    i54 = i66;
                    j23 = j27;
                }
                j14 = i52;
                j13 = j23 * ((long) i51);
                i25 = i49;
                iArr2 = iArr13;
                i26 = i53;
                r15 = iArr14;
            } else {
                jArr = new long[iZza];
                iArr = new int[iZza];
                zzetVar = zzetVar5;
                jArrCopyOf = new long[iZza];
                i13 = iZzH2;
                int i67 = iZzH3;
                zzaldVar = zzalhVar;
                iZzH4 = i67;
                i14 = iZzH;
                i15 = iZzH6;
                j10 = 0;
                j11 = 0;
                j12 = 0;
                i16 = i10;
                i17 = i16;
                i18 = i17;
                iZzH5 = i18;
                iZzB = iZzH8;
                iZzB2 = iZzH5;
                r10 = new int[iZza];
                while (true) {
                    if (i16 < iZza) {
                        jArr2 = jArr;
                        CopyOf = r10;
                        break;
                    }
                    j15 = j10;
                    r23 = i11;
                    while (true) {
                        if (i18 != 0) {
                            i27 = i18;
                            r24 = r23;
                            break;
                        }
                        zZza = zzakzVar.zza();
                        if (zZza) {
                            i27 = i10;
                            r24 = zZza;
                            break;
                        }
                        j15 = zzakzVar.zzd;
                        i18 = zzakzVar.zzc;
                        iZza = iZza;
                        r23 = zZza;
                    }
                    i28 = iZza;
                    if (r24 == 0) {
                        zzeg.zzc("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr, i16);
                        int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                        jArr2 = jArrCopyOf2;
                        iArr = iArrCopyOf;
                        CopyOf = Arrays.copyOf((int[]) r10, i16);
                        iZza = i16;
                        break;
                    }
                    if (zzetVar != null) {
                        while (iZzH5 == 0) {
                            if (i14 > 0) {
                                iZzH5 = i10;
                                break;
                            }
                            i14--;
                            iZzH5 = zzetVar.zzH();
                            iZzB2 = zzetVar.zzB();
                        }
                        iZzH5--;
                    }
                    iZzc = zzaldVar.zzc();
                    r38 = r10;
                    long[] jArr11 = jArr;
                    long j28 = iZzc;
                    j12 += j28;
                    if (iZzc > i17) {
                        i17 = iZzc;
                    }
                    jArr11[i16] = j15;
                    iArr[i16] = iZzc;
                    int i68 = i27;
                    jArrCopyOf[i16] = j11 + ((long) iZzB2);
                    r38[i16] = r31;
                    if (i16 == iZzH4) {
                        r38[i16] = i11;
                        arrayList.add(Integer.valueOf(i16));
                    }
                    if (zzetVar4 != null && i16 == iZzH4) {
                        i29 = i13 - 1;
                        if (i29 > 0) {
                            i13 = i29;
                            iZzH4 = zzetVar4.zzH() - 1;
                        } else {
                            i13 = i29;
                        }
                    }
                    j11 += (long) iZzB;
                    iZzH7--;
                    if (iZzH7 != 0) {
                        if (i15 > 0) {
                            i15--;
                            iZzH7 = zzetVar3.zzH();
                            iZzB = zzetVar3.zzB();
                        } else {
                            iZzH7 = i10;
                        }
                    }
                    long j29 = j15 + j28;
                    i18 = i68 - 1;
                    i16++;
                    jArr = jArr11;
                    r10 = r38;
                    iZza = i28;
                    j10 = j29;
                }
                long j30 = j11 + ((long) iZzB2);
                if (zzetVar != null) {
                    i19 = i11;
                    break;
                }
                while (true) {
                    if (i14 > 0) {
                        i19 = i11;
                        break;
                    }
                    if (zzetVar.zzH() != 0) {
                        i19 = i10;
                        break;
                    }
                    zzetVar.zzB();
                    i14--;
                }
                if (i13 == 0) {
                    if (iZzH7 == 0) {
                        if (i18 == 0) {
                            i24 = i10;
                            i20 = i24;
                        } else if (i15 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            i19 = i19;
                            iZza = iZza;
                            i24 = i10;
                            i20 = i24;
                            i21 = i20;
                            i22 = i15;
                            i23 = iZzH5;
                        } else if (iZzH5 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            i19 = i19;
                            iZza = iZza;
                            i24 = i10;
                            i20 = i24;
                            i21 = i20;
                            i22 = i21;
                            i23 = iZzH5;
                        } else if (i19 == 0) {
                            jArrCopyOf = jArrCopyOf;
                            iZza = iZza;
                            i19 = i10;
                            i24 = i19;
                            i20 = i24;
                            i21 = i20;
                            i22 = i21;
                            i23 = i22;
                        } else {
                            jArrCopyOf = jArrCopyOf;
                            iZza = iZza;
                        }
                        jArr3 = jArrCopyOf;
                        i25 = iZza;
                        iArr2 = iArr;
                        j13 = j30;
                        j14 = j12;
                        i26 = i17;
                        r15 = CopyOf;
                    } else {
                        i20 = iZzH7;
                        i24 = i10;
                    }
                    i21 = i18;
                    i22 = i15;
                    i23 = iZzH5;
                } else {
                    jArrCopyOf = jArrCopyOf;
                    i19 = i19;
                    iZza = iZza;
                    i20 = iZzH7;
                    i21 = i18;
                    i22 = i15;
                    i23 = iZzH5;
                    i24 = i13;
                }
                int i69 = zzamiVarZzb.zza;
                int length3 = String.valueOf(i69).length() + 66 + String.valueOf(i24).length() + 35 + String.valueOf(i20).length() + 26 + String.valueOf(i21).length() + 33 + String.valueOf(i22).length() + 36;
                int length4 = String.valueOf(i23).length();
                if (i11 != i19) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder(length3 + length4 + str.length());
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(i69);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i24);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i20);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i21);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i22);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i23);
                sb2.append(str);
                zzeg.zzc("BoxParsers", sb2.toString());
                jArr3 = jArrCopyOf;
                i25 = iZza;
                iArr2 = iArr;
                j13 = j30;
                j14 = j12;
                i26 = i17;
                r15 = CopyOf;
            }
            jArr4 = jArr2;
            j16 = zzamiVarZzb.zzf;
            if (j16 > 0) {
                jZzv4 = zzfl.zzv(j14 * 8, 1000000L, j16, RoundingMode.HALF_DOWN);
                if (jZzv4 > 0 && jZzv4 < 2147483647L) {
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzi((int) jZzv4);
                    zzamiVarZzb = zzamiVarZzb.zzb(zztVarZza2.zzO());
                }
            }
            j17 = zzamiVarZzb.zzc;
            RoundingMode roundingMode = RoundingMode.DOWN;
            jZzv = zzfl.zzv(j13, 1000000L, j17, roundingMode);
            iArrZzf = zzhah.zzf(arrayList);
            jArr5 = zzamiVarZzb.zzi;
            if (jArr5 == null) {
                zzfl.zzw(jArr3, 1000000L, j17);
                return new zzaml(zzamiVarZzb, jArr4, iArr2, i26, jArr3, r15, iArrZzf, r31, jZzv, i25);
            }
            r29 = r15;
            length = jArr5.length;
            if (length == 1) {
                if (zzamiVarZzb.zzb == 1 || (length2 = jArr3.length) < 2) {
                    j18 = j17;
                } else {
                    long[] jArr12 = zzamiVarZzb.zzj;
                    jArr12.getClass();
                    long j31 = jArr12[i10];
                    long j32 = jArr5[i10];
                    long j33 = zzamiVarZzb.zzd;
                    long jZzv5 = zzfl.zzv(j32, j17, j33, roundingMode) + j31;
                    int i70 = length2 - 1;
                    int i71 = i10;
                    int iMax2 = Math.max(i71, Math.min(4, i70));
                    int iMax3 = Math.max(i71, Math.min(length2 - 4, i70));
                    if (jArr3[i71] > j31 || j31 >= jArr3[iMax2] || jArr3[iMax3] >= jZzv5 || jZzv5 > 2 + j13) {
                        j18 = j17;
                    } else {
                        long jMax = Math.max(0L, j13 - jZzv5);
                        long j34 = j31 - jArr3[0];
                        long j35 = zzamiVarZzb.zzg.zzI;
                        long jZzv6 = zzfl.zzv(j34, j35, j17, roundingMode);
                        long jZzv7 = zzfl.zzv(jMax, j35, j17, roundingMode);
                        j18 = j17;
                        if (jZzv6 != 0) {
                            if (jZzv6 <= 2147483647L && jZzv7 <= 2147483647L) {
                                zzagrVar.zza = (int) jZzv6;
                                zzagrVar.zzb = (int) jZzv7;
                                zzfl.zzw(jArr3, 1000000L, j18);
                                return new zzaml(zzamiVarZzb, jArr4, iArr2, i26, jArr3, r29, iArrZzf, r31, zzfl.zzv(jArr5[0], 1000000L, j33, roundingMode), i25);
                            }
                        } else if (jZzv7 != 0) {
                            jZzv6 = 0;
                            if (jZzv6 <= 2147483647L) {
                                zzagrVar.zza = (int) jZzv6;
                                zzagrVar.zzb = (int) jZzv7;
                                zzfl.zzw(jArr3, 1000000L, j18);
                                return new zzaml(zzamiVarZzb, jArr4, iArr2, i26, jArr3, r29, iArrZzf, r31, zzfl.zzv(jArr5[0], 1000000L, j33, roundingMode), i25);
                            }
                        }
                    }
                }
                i30 = 1;
                length = 1;
            } else {
                j18 = j17;
                i30 = 1;
            }
            if (length != i30 && jArr5[0] == 0) {
                long[] jArr13 = zzamiVarZzb.zzj;
                jArr13.getClass();
                long j36 = jArr13[0];
                int i72 = 0;
                while (i72 < jArr3.length) {
                    long j37 = j18;
                    jArr3[i72] = zzfl.zzv(jArr3[i72] - j36, 1000000L, j37, RoundingMode.DOWN);
                    i72++;
                    j18 = j37;
                }
                return new zzaml(zzamiVarZzb, jArr4, iArr2, i26, jArr3, r29, iArrZzf, r31, zzfl.zzv(j13 - j36, 1000000L, j18, RoundingMode.DOWN), i25);
            }
            j19 = j18;
            iArr3 = iArr2;
            i31 = i25;
            if (zzamiVarZzb.zzb == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            jArr6 = zzamiVarZzb.zzj;
            iArr4 = new int[length];
            iArr5 = new int[length];
            jArr6.getClass();
            i32 = 0;
            i33 = 0;
            z13 = false;
            i34 = 0;
            while (i32 < jArr5.length) {
                iArr10 = iArr5;
                j22 = jArr6[i32];
                if (j22 != -1) {
                    iArr11 = iArr4;
                    i40 = i32;
                    long j38 = j19;
                    j19 = j38;
                    jZzv3 = zzfl.zzv(jArr5[i32], j38, zzamiVarZzb.zzd, RoundingMode.DOWN) + j22;
                    boolean z20 = z13;
                    iArr11[i40] = zzfl.zzo(jArr3, j22, true, true);
                    int iZzq = zzfl.zzq(jArr3, jZzv3, z12, false);
                    i42 = iZzq - 1;
                    i43 = 0;
                    for (i41 = iZzq; i41 < jArr3.length; i41++) {
                        if (jArr3[i41] < jZzv3) {
                            i43++;
                            if (i43 > zzamiVarZzb.zzg.zzr) {
                                break;
                            }
                        } else {
                            i42 = i41;
                        }
                    }
                    iArr10[i40] = i42 + 1;
                    i44 = iArr11[i40];
                    while (true) {
                        i45 = iArr11[i40];
                        if (i45 > 0 || (r29[i45] & 1) != 0) {
                            break;
                            break;
                        }
                        iArr11[i40] = i45 - 1;
                    }
                    if (i45 == 0) {
                        z18 = false;
                        if ((r29[0] & 1) == 0) {
                            iArr11[i40] = i44;
                            while (true) {
                                i45 = iArr11[i40];
                                if (i45 >= iArr10[i40] || (r29[i45] & 1) != 0) {
                                    break;
                                }
                                iArr11[i40] = i45 + 1;
                            }
                        }
                    } else {
                        z18 = false;
                    }
                    int i73 = iArr10[i40];
                    i33 += i73 - i45;
                    if (i34 != i45) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    i34 = i73;
                    z13 = z20 | z19;
                } else {
                    iArr11 = iArr4;
                    i40 = i32;
                }
                i32 = i40 + 1;
                iArr5 = iArr10;
                iArr4 = iArr11;
                z12 = z12;
            }
            iArr6 = iArr5;
            iArr7 = iArr4;
            boolean z21 = z13;
            if (i33 != i31) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z21 | z14;
            if (z15) {
                jArr7 = new long[i33];
            } else {
                jArr7 = jArr4;
            }
            if (z15) {
                iArr8 = new int[i33];
            } else {
                iArr8 = iArr3;
            }
            if (true == z15) {
                i26 = 0;
            }
            if (z15) {
                iArr9 = new int[i33];
            } else {
                r11 = r29;
            }
            if (z15) {
                r11 = iArr9;
                arrayList = new ArrayList();
            }
            r11 = iArr9;
            jArr8 = new long[i33];
            i35 = 0;
            z16 = false;
            i36 = 0;
            i37 = i26;
            j20 = 0;
            r12 = r11;
            while (i35 < jArr5.length) {
                j21 = jArr6[i35];
                i38 = iArr7[i35];
                long[] jArr14 = jArr5;
                i39 = iArr6[i35];
                jArr9 = jArr8;
                if (z15) {
                    int i74 = i39 - i38;
                    System.arraycopy(jArr4, i38, jArr7, i36, i74);
                    System.arraycopy(iArr3, i38, iArr8, i36, i74);
                    System.arraycopy(r29, i38, r12, i36, i74);
                }
                while (i38 < i39) {
                    int[] iArr15 = iArr8;
                    ?? r45 = r12;
                    long j39 = zzamiVarZzb.zzd;
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    long jZzv8 = zzfl.zzv(j20, 1000000L, j39, roundingMode2);
                    jZzv2 = zzfl.zzv(jArr3[i38] - j21, 1000000L, j19, roundingMode2);
                    if (jZzv2 < 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    z16 = (!z17) | z16;
                    jArr9[i36] = jZzv8 + jZzv2;
                    if (z15 && iArr15[i36] > i37) {
                        i37 = iArr3[i38];
                    }
                    if (!z15 && r31 == 0 && (r45[i36] & 1) != 0) {
                        arrayList.add(Integer.valueOf(i36));
                    }
                    i36++;
                    i38++;
                    r12 = r45;
                    iArr8 = iArr15;
                }
                j20 += jArr14[i35];
                i35++;
                r12 = r12;
                iArr8 = iArr8;
                jArr5 = jArr14;
                jArr8 = jArr9;
            }
            ?? r46 = r12;
            long[] jArr15 = jArr8;
            int[] iArr16 = iArr8;
            long jZzv9 = zzfl.zzv(j20, 1000000L, zzamiVarZzb.zzd, RoundingMode.DOWN);
            if (z16) {
                zzt zztVarZza3 = zzamiVarZzb.zzg.zza();
                zztVarZza3.zzu(true);
                zzamiVarZzb = zzamiVarZzb.zzb(zztVarZza3.zzO());
            }
            return new zzaml(zzamiVarZzb, jArr7, iArr16, i37, jArr15, r46, zzhah.zzf(arrayList), r31, jZzv9, jArr7.length);
        }
        i11 = 1;
        i12 = i10;
        arrayList = new ArrayList();
        if (zzetVar4 == null) {
            r31 = i11;
        } else {
            r31 = i10;
        }
        if (i12 != 0) {
            i46 = zzakzVar.zza;
            jArr10 = new long[i46];
            iArr12 = new int[i46];
            while (zzakzVar.zza()) {
                int i510 = zzakzVar.zzb;
                jArr10[i510] = zzakzVar.zzd;
                iArr12[i510] = zzakzVar.zzc;
            }
            j23 = iZzH8;
            i47 = 8192 / iZzb;
            i48 = i10;
            i49 = i48;
            while (i48 < i46) {
                int i511 = iArr12[i48];
                String str4 = zzfl.zza;
                i49 += ((i511 + i47) - 1) / i47;
                i48++;
            }
            jArr2 = new long[i49];
            iArr13 = new int[i49];
            jArr3 = new long[i49];
            iArr14 = new int[i49];
            i50 = i10;
            i51 = i50;
            i52 = i51;
            i53 = i52;
            i54 = i53;
            while (i50 < i46) {
                int i512 = iArr12[i50];
                j24 = jArr10[i50];
                int i610 = i54;
                int i611 = i46;
                iMax = i53;
                i55 = i610;
                int i612 = i50;
                i56 = i512;
                while (i56 > 0) {
                    int iMin2 = Math.min(i47, i56);
                    jArr2[i55] = j24;
                    int i613 = i56;
                    int i614 = iZzb * iMin2;
                    iArr13[i55] = i614;
                    int i615 = i52 + i614;
                    iMax = Math.max(iMax, i614);
                    long j210 = j23;
                    jArr3[i55] = j210 * ((long) i51);
                    iArr14[i55] = i11;
                    j24 += (long) iArr13[i55];
                    i51 += iMin2;
                    i56 = i613 - iMin2;
                    i55++;
                    i52 = i615;
                    j23 = j210;
                }
                long j211 = j23;
                i50 = i612 + 1;
                int i616 = i55;
                i53 = iMax;
                i46 = i611;
                i54 = i616;
                j23 = j211;
            }
            j14 = i52;
            j13 = j23 * ((long) i51);
            i25 = i49;
            iArr2 = iArr13;
            i26 = i53;
            r15 = iArr14;
        } else {
            jArr = new long[iZza];
            iArr = new int[iZza];
            zzetVar = zzetVar5;
            jArrCopyOf = new long[iZza];
            i13 = iZzH2;
            int i617 = iZzH3;
            zzaldVar = zzalhVar;
            iZzH4 = i617;
            i14 = iZzH;
            i15 = iZzH6;
            j10 = 0;
            j11 = 0;
            j12 = 0;
            i16 = i10;
            i17 = i16;
            i18 = i17;
            iZzH5 = i18;
            iZzB = iZzH8;
            iZzB2 = iZzH5;
            r10 = new int[iZza];
            while (true) {
                if (i16 < iZza) {
                    jArr2 = jArr;
                    CopyOf = r10;
                    break;
                }
                j15 = j10;
                r23 = i11;
                while (true) {
                    if (i18 != 0) {
                        i27 = i18;
                        r24 = r23;
                        break;
                    }
                    zZza = zzakzVar.zza();
                    if (zZza) {
                        i27 = i10;
                        r24 = zZza;
                        break;
                    }
                    j15 = zzakzVar.zzd;
                    i18 = zzakzVar.zzc;
                    iZza = iZza;
                    r23 = zZza;
                }
                i28 = iZza;
                if (r24 == 0) {
                    zzeg.zzc("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr, i16);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                    jArr2 = jArrCopyOf3;
                    iArr = iArrCopyOf2;
                    CopyOf = Arrays.copyOf((int[]) r10, i16);
                    iZza = i16;
                    break;
                }
                if (zzetVar != null) {
                    while (iZzH5 == 0) {
                        if (i14 > 0) {
                            iZzH5 = i10;
                            break;
                        }
                        i14--;
                        iZzH5 = zzetVar.zzH();
                        iZzB2 = zzetVar.zzB();
                    }
                    iZzH5--;
                }
                iZzc = zzaldVar.zzc();
                r38 = r10;
                long[] jArr16 = jArr;
                long j212 = iZzc;
                j12 += j212;
                if (iZzc > i17) {
                    i17 = iZzc;
                }
                jArr16[i16] = j15;
                iArr[i16] = iZzc;
                int i618 = i27;
                jArrCopyOf[i16] = j11 + ((long) iZzB2);
                r38[i16] = r31;
                if (i16 == iZzH4) {
                    r38[i16] = i11;
                    arrayList.add(Integer.valueOf(i16));
                }
                if (zzetVar4 != null) {
                    i29 = i13 - 1;
                    if (i29 > 0) {
                        i13 = i29;
                        iZzH4 = zzetVar4.zzH() - 1;
                    } else {
                        i13 = i29;
                    }
                }
                j11 += (long) iZzB;
                iZzH7--;
                if (iZzH7 != 0) {
                    if (i15 > 0) {
                        i15--;
                        iZzH7 = zzetVar3.zzH();
                        iZzB = zzetVar3.zzB();
                    } else {
                        iZzH7 = i10;
                    }
                }
                long j213 = j15 + j212;
                i18 = i618 - 1;
                i16++;
                jArr = jArr16;
                r10 = r38;
                iZza = i28;
                j10 = j213;
            }
            long j310 = j11 + ((long) iZzB2);
            if (zzetVar != null) {
                i19 = i11;
                break;
            }
            while (true) {
                if (i14 > 0) {
                    i19 = i11;
                    break;
                }
                if (zzetVar.zzH() != 0) {
                    i19 = i10;
                    break;
                }
                zzetVar.zzB();
                i14--;
            }
            if (i13 == 0) {
                if (iZzH7 == 0) {
                    if (i18 == 0) {
                        i24 = i10;
                        i20 = i24;
                    } else if (i15 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        i19 = i19;
                        iZza = iZza;
                        i24 = i10;
                        i20 = i24;
                        i21 = i20;
                        i22 = i15;
                        i23 = iZzH5;
                    } else if (iZzH5 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        i19 = i19;
                        iZza = iZza;
                        i24 = i10;
                        i20 = i24;
                        i21 = i20;
                        i22 = i21;
                        i23 = iZzH5;
                    } else if (i19 == 0) {
                        jArrCopyOf = jArrCopyOf;
                        iZza = iZza;
                        i19 = i10;
                        i24 = i19;
                        i20 = i24;
                        i21 = i20;
                        i22 = i21;
                        i23 = i22;
                    } else {
                        jArrCopyOf = jArrCopyOf;
                        iZza = iZza;
                    }
                    jArr3 = jArrCopyOf;
                    i25 = iZza;
                    iArr2 = iArr;
                    j13 = j310;
                    j14 = j12;
                    i26 = i17;
                    r15 = CopyOf;
                } else {
                    i20 = iZzH7;
                    i24 = i10;
                }
                i21 = i18;
                i22 = i15;
                i23 = iZzH5;
            } else {
                jArrCopyOf = jArrCopyOf;
                i19 = i19;
                iZza = iZza;
                i20 = iZzH7;
                i21 = i18;
                i22 = i15;
                i23 = iZzH5;
                i24 = i13;
            }
            int i619 = zzamiVarZzb.zza;
            int length5 = String.valueOf(i619).length() + 66 + String.valueOf(i24).length() + 35 + String.valueOf(i20).length() + 26 + String.valueOf(i21).length() + 33 + String.valueOf(i22).length() + 36;
            int length6 = String.valueOf(i23).length();
            if (i11 != i19) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            StringBuilder sb3 = new StringBuilder(length5 + length6 + str.length());
            sb3.append("Inconsistent stbl box for track ");
            sb3.append(i619);
            sb3.append(": remainingSynchronizationSamples ");
            sb3.append(i24);
            sb3.append(", remainingSamplesAtTimestampDelta ");
            sb3.append(i20);
            sb3.append(", remainingSamplesInChunk ");
            sb3.append(i21);
            sb3.append(", remainingTimestampDeltaChanges ");
            sb3.append(i22);
            sb3.append(", remainingSamplesAtTimestampOffset ");
            sb3.append(i23);
            sb3.append(str);
            zzeg.zzc("BoxParsers", sb3.toString());
            jArr3 = jArrCopyOf;
            i25 = iZza;
            iArr2 = iArr;
            j13 = j310;
            j14 = j12;
            i26 = i17;
            r15 = CopyOf;
        }
        jArr4 = jArr2;
        j16 = zzamiVarZzb.zzf;
        if (j16 > 0) {
            jZzv4 = zzfl.zzv(j14 * 8, 1000000L, j16, RoundingMode.HALF_DOWN);
            if (jZzv4 > 0) {
                zzt zztVarZza4 = zzvVar.zza();
                zztVarZza4.zzi((int) jZzv4);
                zzamiVarZzb = zzamiVarZzb.zzb(zztVarZza4.zzO());
            }
        }
        j17 = zzamiVarZzb.zzc;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        jZzv = zzfl.zzv(j13, 1000000L, j17, roundingMode3);
        iArrZzf = zzhah.zzf(arrayList);
        jArr5 = zzamiVarZzb.zzi;
        if (jArr5 == null) {
            zzfl.zzw(jArr3, 1000000L, j17);
            return new zzaml(zzamiVarZzb, jArr4, iArr2, i26, jArr3, r15, iArrZzf, r31, jZzv, i25);
        }
        r29 = r15;
        length = jArr5.length;
        if (length == 1) {
            if (zzamiVarZzb.zzb == 1) {
                j18 = j17;
            } else {
                j18 = j17;
            }
            i30 = 1;
            length = 1;
        } else {
            j18 = j17;
            i30 = 1;
        }
        if (length != i30) {
        }
        j19 = j18;
        iArr3 = iArr2;
        i31 = i25;
        if (zzamiVarZzb.zzb == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        jArr6 = zzamiVarZzb.zzj;
        iArr4 = new int[length];
        iArr5 = new int[length];
        jArr6.getClass();
        i32 = 0;
        i33 = 0;
        z13 = false;
        i34 = 0;
        while (i32 < jArr5.length) {
            iArr10 = iArr5;
            j22 = jArr6[i32];
            if (j22 != -1) {
                iArr11 = iArr4;
                i40 = i32;
                long j311 = j19;
                j19 = j311;
                jZzv3 = zzfl.zzv(jArr5[i32], j311, zzamiVarZzb.zzd, RoundingMode.DOWN) + j22;
                boolean z22 = z13;
                iArr11[i40] = zzfl.zzo(jArr3, j22, true, true);
                int iZzq2 = zzfl.zzq(jArr3, jZzv3, z12, false);
                i42 = iZzq2 - 1;
                i43 = 0;
                while (i41 < jArr3.length) {
                    if (jArr3[i41] < jZzv3) {
                        i43++;
                        if (i43 > zzamiVarZzb.zzg.zzr) {
                            break;
                            break;
                        }
                    } else {
                        i42 = i41;
                    }
                }
                iArr10[i40] = i42 + 1;
                i44 = iArr11[i40];
                while (true) {
                    i45 = iArr11[i40];
                    if (i45 > 0) {
                        break;
                    }
                    iArr11[i40] = i45 - 1;
                }
                if (i45 == 0) {
                    z18 = false;
                    if ((r29[0] & 1) == 0) {
                        iArr11[i40] = i44;
                        while (true) {
                            i45 = iArr11[i40];
                            if (i45 >= iArr10[i40]) {
                                break;
                            }
                            break;
                            break;
                            iArr11[i40] = i45 + 1;
                        }
                    }
                } else {
                    z18 = false;
                }
                int i75 = iArr10[i40];
                i33 += i75 - i45;
                if (i34 != i45) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                i34 = i75;
                z13 = z22 | z19;
            } else {
                iArr11 = iArr4;
                i40 = i32;
            }
            i32 = i40 + 1;
            iArr5 = iArr10;
            iArr4 = iArr11;
            z12 = z12;
        }
        iArr6 = iArr5;
        iArr7 = iArr4;
        boolean z23 = z13;
        if (i33 != i31) {
            z14 = true;
        } else {
            z14 = false;
        }
        z15 = z23 | z14;
        if (z15) {
            jArr7 = new long[i33];
        } else {
            jArr7 = jArr4;
        }
        if (z15) {
            iArr8 = new int[i33];
        } else {
            iArr8 = iArr3;
        }
        if (true == z15) {
            i26 = 0;
        }
        if (z15) {
            iArr9 = new int[i33];
        } else {
            r11 = r29;
        }
        if (z15) {
            r11 = iArr9;
            arrayList = new ArrayList();
        }
        r11 = iArr9;
        jArr8 = new long[i33];
        i35 = 0;
        z16 = false;
        i36 = 0;
        i37 = i26;
        j20 = 0;
        r12 = r11;
        while (i35 < jArr5.length) {
            j21 = jArr6[i35];
            i38 = iArr7[i35];
            long[] jArr17 = jArr5;
            i39 = iArr6[i35];
            jArr9 = jArr8;
            if (z15) {
                int i76 = i39 - i38;
                System.arraycopy(jArr4, i38, jArr7, i36, i76);
                System.arraycopy(iArr3, i38, iArr8, i36, i76);
                System.arraycopy(r29, i38, r12, i36, i76);
            }
            while (i38 < i39) {
                int[] iArr17 = iArr8;
                ?? r47 = r12;
                long j312 = zzamiVarZzb.zzd;
                RoundingMode roundingMode4 = RoundingMode.DOWN;
                long jZzv10 = zzfl.zzv(j20, 1000000L, j312, roundingMode4);
                jZzv2 = zzfl.zzv(jArr3[i38] - j21, 1000000L, j19, roundingMode4);
                if (jZzv2 < 0) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                z16 = (!z17) | z16;
                jArr9[i36] = jZzv10 + jZzv2;
                if (z15) {
                    i37 = iArr3[i38];
                }
                if (!z15) {
                }
                i36++;
                i38++;
                r12 = r47;
                iArr8 = iArr17;
            }
            j20 += jArr17[i35];
            i35++;
            r12 = r12;
            iArr8 = iArr8;
            jArr5 = jArr17;
            jArr8 = jArr9;
        }
        ?? r48 = r12;
        long[] jArr18 = jArr8;
        int[] iArr18 = iArr8;
        long jZzv11 = zzfl.zzv(j20, 1000000L, zzamiVarZzb.zzd, RoundingMode.DOWN);
        if (z16) {
            zzt zztVarZza5 = zzamiVarZzb.zzg.zza();
            zztVarZza5.zzu(true);
            zzamiVarZzb = zzamiVarZzb.zzb(zztVarZza5.zzO());
        }
        return new zzaml(zzamiVarZzb, jArr7, iArr18, i37, jArr18, r48, zzhah.zzf(arrayList), r31, jZzv11, jArr7.length);
    }

    static zzap zzh(zzet zzetVar) {
        try {
            zzetVar.zzk(5);
            int iZzB = zzetVar.zzB();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < iZzB; i10++) {
                long jZzD = zzetVar.zzD() / 10000;
                if (jZzD < 0) {
                    jZzD = -9223372036854775807L;
                }
                arrayList.add(zzaiv.zzb(jZzD, C.TIME_UNSET, zzetVar.zzK(zzetVar.zzs(), StandardCharsets.UTF_8)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new zzap(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static zzap zzi(zzet zzetVar) {
        short sZzv = zzetVar.zzv();
        zzetVar.zzk(2);
        String strZzK = zzetVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(C.TIME_UNSET, new zzga(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzj(zzet zzetVar) {
        zzetVar.zzh(16);
        return zzetVar.zzB();
    }

    private static String zzk(byte[] bArr, int i10, int i11) {
        zzgtj.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            int iZze = zzhah.zze(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3]);
            String str = zzfl.zza;
            int i13 = ((iZze >> 8) & 255) - 128;
            int i14 = (iZze >> 16) & 255;
            int i15 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i14 + ((i15 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i13 * 14075) / 10000) + i14, 255)) << 16) | (Math.max(0, Math.min((i14 - ((i15 * 3455) / 10000)) - ((i13 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzgtd.zzd(arrayList, ", ");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 7 + String.valueOf(i11).length() + 10 + strZzd.length() + 1);
        sb2.append("size: ");
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        sb2.append("\npalette: ");
        sb2.append(strZzd);
        sb2.append("\n");
        return sb2.toString();
    }

    private static zzi zzl(zzet zzetVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzetVar.zzi();
        zzes zzesVar = new zzes(bArrZzi, bArrZzi.length);
        zzesVar.zzf(zzetVar.zzg() * 8);
        zzesVar.zzo(1);
        int iZzj = zzesVar.zzj(8);
        for (int i10 = 0; i10 < iZzj; i10++) {
            zzesVar.zzo(1);
            int iZzj2 = zzesVar.zzj(8);
            for (int i11 = 0; i11 < iZzj2; i11++) {
                zzesVar.zzh(6);
                boolean zZzi = zzesVar.zzi();
                zzesVar.zzg();
                zzesVar.zzo(11);
                zzesVar.zzh(4);
                int iZzj3 = zzesVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzesVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzesVar.zzj(8);
                    int iZzj5 = zzesVar.zzj(8);
                    zzesVar.zzo(1);
                    boolean zZzi2 = zzesVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzfx zzfxVar) {
        zzfy zzfyVarZzc = zzfxVar.zzc(1701606260);
        if (zzfyVarZzc == null) {
            return null;
        }
        zzet zzetVar = zzfyVarZzc.zza;
        zzetVar.zzh(8);
        int iZza = zza(zzetVar.zzB());
        int iZzH = zzetVar.zzH();
        long[] jArr = new long[iZzH];
        long[] jArr2 = new long[iZzH];
        for (int i10 = 0; i10 < iZzH; i10++) {
            jArr[i10] = iZza == 1 ? zzetVar.zzJ() : zzetVar.zzz();
            jArr2[i10] = iZza == 1 ? zzetVar.zzD() : zzetVar.zzB();
            if (zzetVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzetVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    private static void zzo(zzet zzetVar, int i10, int i11, int i12, int i13, String str, boolean z10, zzq zzqVar, zzalf zzalfVar, int i14) throws zzat {
        int iZzt;
        int iZzB;
        int iZzH;
        int iRound;
        int iZzC;
        String strZza;
        int i15;
        int i16;
        int i17 = i10;
        int i18 = i12;
        zzq zzqVarZzb = zzqVar;
        zzetVar.zzh(i11 + 16);
        if (z10) {
            iZzt = zzetVar.zzt();
            zzetVar.zzk(6);
        } else {
            zzetVar.zzk(8);
            iZzt = 0;
        }
        int i19 = 2;
        if (iZzt == 0 || iZzt == 1) {
            int iZzt2 = zzetVar.zzt();
            zzetVar.zzk(6);
            int iZzF = zzetVar.zzF();
            zzetVar.zzh(zzetVar.zzg() - 4);
            iZzB = zzetVar.zzB();
            if (iZzt == 1) {
                zzetVar.zzk(16);
            }
            iZzH = iZzt2;
            iRound = iZzF;
            iZzC = -1;
        } else {
            if (iZzt != 2) {
                return;
            }
            zzetVar.zzk(16);
            iRound = (int) Math.round(Double.longBitsToDouble(zzetVar.zzD()));
            iZzH = zzetVar.zzH();
            zzetVar.zzk(4);
            int iZzH2 = zzetVar.zzH();
            int iZzH3 = zzetVar.zzH();
            int i20 = iZzH3 & 1;
            int i21 = iZzH3 & 2;
            if (i20 == 0) {
                iZzC = zzfl.zzB(iZzH2, i21 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            } else {
                iZzC = i21 == 0 ? zzfl.zzC(iZzH2) : -1;
            }
            if (iZzC == 0) {
                iZzC = -1;
            }
            zzetVar.zzk(8);
            iZzB = 0;
        }
        if (i17 == 1767992678) {
            iRound = -1;
            iZzH = -1;
        } else {
            if (i17 == 1935764850) {
                iRound = 8000;
            } else if (i17 == 1935767394) {
                iRound = 16000;
                i17 = 1935767394;
            }
            iZzH = 1;
        }
        int iZzg = zzetVar.zzg();
        int iIntValue = 1701733217;
        if (i17 == 1701733217) {
            Pair pairZzr = zzr(zzetVar, i11, i18);
            if (pairZzr != null) {
                iIntValue = ((Integer) pairZzr.first).intValue();
                zzqVarZzb = zzqVarZzb == null ? null : zzqVarZzb.zzb(((zzamj) pairZzr.second).zzb);
                zzalfVar.zza[i14] = (zzamj) pairZzr.second;
            }
            i17 = iIntValue;
            zzetVar.zzh(iZzg);
        }
        String str2 = "audio/mhm1";
        if (i17 == 1633889587) {
            strZza = MimeTypes.AUDIO_AC3;
        } else if (i17 == 1700998451) {
            strZza = MimeTypes.AUDIO_E_AC3;
        } else if (i17 == 1633889588) {
            strZza = "audio/ac4";
        } else if (i17 == 1685353315) {
            strZza = MimeTypes.AUDIO_DTS;
        } else if (i17 == 1685353320 || i17 == 1685353324) {
            strZza = MimeTypes.AUDIO_DTS_HD;
        } else if (i17 == 1685353317) {
            strZza = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i17 == 1685353336) {
            strZza = "audio/vnd.dts.uhd;profile=p2";
        } else if (i17 == 1935764850) {
            strZza = MimeTypes.AUDIO_AMR_NB;
        } else if (i17 == 1935767394) {
            strZza = MimeTypes.AUDIO_AMR_WB;
        } else if (i17 != 1936684916) {
            if (i17 == 1953984371) {
                iZzC = 268435456;
            } else if (i17 == 1819304813) {
                if (iZzC == -1) {
                    iZzC = i19;
                }
            } else if (i17 == 778924082 || i17 == 778924083) {
                strZza = MimeTypes.AUDIO_MPEG;
            } else if (i17 == 1835557169) {
                strZza = "audio/mha1";
            } else if (i17 == 1835560241) {
                strZza = "audio/mhm1";
            } else if (i17 == 1634492771) {
                strZza = MimeTypes.AUDIO_ALAC;
            } else if (i17 == 1634492791) {
                strZza = MimeTypes.AUDIO_ALAW;
            } else if (i17 == 1970037111) {
                strZza = MimeTypes.AUDIO_MLAW;
            } else if (i17 == 1332770163) {
                strZza = MimeTypes.AUDIO_OPUS;
            } else if (i17 == 1716281667) {
                strZza = MimeTypes.AUDIO_FLAC;
            } else if (i17 == 1835823201) {
                strZza = MimeTypes.AUDIO_TRUEHD;
            } else if (i17 == 1767992678) {
                strZza = "audio/iamf";
                i17 = 1767992678;
            } else {
                strZza = null;
            }
            strZza = MimeTypes.AUDIO_RAW;
        } else {
            iZzC = i19;
            strZza = MimeTypes.AUDIO_RAW;
        }
        int iZzC2 = iZzC;
        List listZzj = null;
        String string = null;
        zzala zzalaVarZzp = null;
        zzaky zzakyVarZzq = null;
        while (iZzg - i11 < i18) {
            zzetVar.zzh(iZzg);
            int iZzB2 = zzetVar.zzB();
            String str3 = string;
            String str4 = "childAtomSize must be positive";
            zzagc.zza(iZzB2 > 0, "childAtomSize must be positive");
            int iZzB3 = zzetVar.zzB();
            iRound = iRound;
            if (iZzB3 == 1835557187) {
                zzetVar.zzh(iZzg + 8);
                zzetVar.zzk(1);
                int iZzs = zzetVar.zzs();
                zzetVar.zzk(1);
                String str5 = Objects.equals(strZza, str2) ? String.format("mhm1.%02X", Integer.valueOf(iZzs)) : String.format("mha1.%02X", Integer.valueOf(iZzs));
                int iZzt3 = zzetVar.zzt();
                byte[] bArr = new byte[iZzt3];
                str3 = str5;
                zzetVar.zzm(bArr, 0, iZzt3);
                if (listZzj == null) {
                    listZzj = zzgwm.zzj(bArr);
                    iZzC2 = iZzC2;
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    iRound = iRound;
                    string = str3;
                } else {
                    listZzj = zzgwm.zzk(bArr, (byte[]) listZzj.get(0));
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    string = str3;
                    iRound = iRound;
                }
            } else if (iZzB3 == 1835557200) {
                zzetVar.zzh(iZzg + 8);
                int iZzs2 = zzetVar.zzs();
                if (iZzs2 > 0) {
                    byte[] bArr2 = new byte[iZzs2];
                    zzetVar.zzm(bArr2, 0, iZzs2);
                    if (listZzj == null) {
                        listZzj = zzgwm.zzj(bArr2);
                        iZzC2 = iZzC2;
                        iZzB2 = iZzB2;
                        iZzB = iZzB;
                        str2 = str2;
                        string = str3;
                        iRound = iRound;
                    } else {
                        listZzj = zzgwm.zzk((byte[]) listZzj.get(0), bArr2);
                        iZzB2 = iZzB2;
                        iZzB = iZzB;
                        string = str3;
                        iRound = iRound;
                    }
                } else {
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    iRound = iRound;
                    iZzC2 = iZzC2;
                    string = str3;
                }
            } else {
                if (iZzB3 == 1702061171) {
                    i15 = iZzg;
                    i16 = -1;
                } else if (z10 && iZzB3 == 2002876005) {
                    int iZzg2 = zzetVar.zzg();
                    zzagc.zza(iZzg2 >= iZzg, null);
                    int i22 = iZzg2;
                    while (true) {
                        if (i22 - iZzg >= iZzB2) {
                            i15 = -1;
                            i16 = -1;
                            break;
                        }
                        zzetVar.zzh(i22);
                        int iZzB4 = zzetVar.zzB();
                        zzagc.zza(iZzB4 > 0, str4);
                        String str6 = str4;
                        if (zzetVar.zzB() == 1702061171) {
                            i15 = i22;
                            i16 = -1;
                            break;
                        } else {
                            i22 += iZzB4;
                            str4 = str6;
                        }
                    }
                } else if (iZzB3 == 1651798644) {
                    zzakyVarZzq = zzq(zzetVar, iZzg);
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    string = str3;
                    iRound = iRound;
                } else {
                    if (iZzB3 == 1684103987) {
                        zzetVar.zzh(iZzg + 8);
                        zzalfVar.zzb = zzaey.zza(zzetVar, Integer.toString(i13), str, zzqVarZzb);
                    } else if (iZzB3 == 1684366131) {
                        zzetVar.zzh(iZzg + 8);
                        zzalfVar.zzb = zzaey.zzb(zzetVar, Integer.toString(i13), str, zzqVarZzb);
                    } else if (iZzB3 == 1684103988) {
                        zzetVar.zzh(iZzg + 8);
                        zzalfVar.zzb = zzafb.zza(zzetVar, Integer.toString(i13), str, zzqVarZzb);
                    } else if (iZzB3 != 1684892784) {
                        if (iZzB3 == 1684305011 || iZzB3 == 1969517683) {
                            iZzB2 = iZzB2;
                            iZzB = iZzB;
                            str2 = str2;
                            zzt zztVar = new zzt();
                            zztVar.zzb(i13);
                            zztVar.zzo(strZza);
                            zztVar.zzG(iZzH);
                            iRound = iRound;
                            zztVar.zzH(iRound);
                            zztVar.zzs(zzqVarZzb);
                            zztVar.zze(str);
                            zzalfVar.zzb = zztVar.zzO();
                        } else {
                            if (iZzB3 == 1682927731) {
                                int i23 = iZzB2 - 8;
                                byte[] bArr3 = zzb;
                                int length = bArr3.length;
                                iZzB2 = iZzB2;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i23);
                                zzetVar.zzh(iZzg + 8);
                                zzetVar.zzm(bArrCopyOf, length, i23);
                                listZzj = zzgv.zza(bArrCopyOf);
                            } else {
                                iZzB2 = iZzB2;
                                if (iZzB3 == 1684425825) {
                                    byte[] bArr4 = new byte[iZzB2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[i19] = 97;
                                    bArr4[3] = 67;
                                    zzetVar.zzh(iZzg + 12);
                                    zzetVar.zzm(bArr4, 4, iZzB2 - 12);
                                    listZzj = zzgwm.zzj(bArr4);
                                } else if (iZzB3 == 1634492771) {
                                    int i24 = iZzB2 - 12;
                                    byte[] bArr5 = new byte[i24];
                                    zzetVar.zzh(iZzg + 12);
                                    zzetVar.zzm(bArr5, 0, i24);
                                    int i25 = zzdq.zza;
                                    zzet zzetVar2 = new zzet(bArr5);
                                    zzetVar2.zzh(5);
                                    int iZzs3 = zzetVar2.zzs();
                                    zzetVar2.zzh(9);
                                    int iZzs4 = zzetVar2.zzs();
                                    zzetVar2.zzh(20);
                                    int[] iArr = {zzetVar2.zzH(), iZzs4, iZzs3};
                                    int i26 = iArr[0];
                                    int i27 = iArr[1];
                                    int iZzB5 = zzfl.zzB(iZzs3, ByteOrder.LITTLE_ENDIAN);
                                    if (iZzB5 == 0) {
                                        iZzB5 = -1;
                                    }
                                    iRound = i26;
                                    iZzB = iZzB;
                                    str2 = str2;
                                    iZzH = i27;
                                    listZzj = zzgwm.zzj(bArr5);
                                    iZzC2 = iZzB5;
                                    string = str3;
                                } else {
                                    if (iZzB3 == 1767990114) {
                                        zzetVar.zzh(iZzg + 9);
                                        int iZza = zzhah.zza(zzetVar.zzP());
                                        byte[] bArr6 = new byte[iZza];
                                        zzetVar.zzm(bArr6, 0, iZza);
                                        int i28 = zzdq.zza;
                                        zzet zzetVar3 = new zzet(bArr6);
                                        String str7 = null;
                                        String str8 = null;
                                        while (zzetVar3.zzd() > 0 && (str8 == null || str7 == null)) {
                                            int iZzs5 = zzetVar3.zzs();
                                            int i29 = iZzs5 >> 3;
                                            int i30 = iZzs5 & 2;
                                            int i31 = iZzs5 & 1;
                                            int iZza2 = zzhah.zza(zzetVar3.zzP());
                                            byte[] bArr7 = bArr6;
                                            if (i29 > 4 && i29 < 24 && i30 != 0) {
                                                zzetVar3.zzQ();
                                                zzetVar3.zzQ();
                                            }
                                            if (i31 != 0) {
                                                zzetVar3.zzk(zzhah.zza(zzetVar3.zzP()));
                                            }
                                            int iZzg3 = zzetVar3.zzg() + iZza2;
                                            int i32 = iZzB;
                                            if (i29 == 31) {
                                                zzetVar3.zzk(4);
                                                Object[] objArr = {Integer.valueOf(zzetVar3.zzs()), Integer.valueOf(zzetVar3.zzs())};
                                                String str9 = zzfl.zza;
                                                str8 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                            } else {
                                                if (i29 == 0) {
                                                    zzetVar3.zzQ();
                                                    String strZzK = zzetVar3.zzK(4, StandardCharsets.UTF_8);
                                                    if (strZzK.equals(AudioSampleEntry.TYPE3)) {
                                                        zzetVar3.zzQ();
                                                        zzetVar3.zzk(i19);
                                                        zzes zzesVar = new zzes();
                                                        zzesVar.zza(zzetVar3);
                                                        int iZzj = zzesVar.zzj(5);
                                                        if (iZzj == 31) {
                                                            iZzj = zzesVar.zzj(6) + 32;
                                                        }
                                                        StringBuilder sb2 = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
                                                        sb2.append(strZzK);
                                                        sb2.append(".40.");
                                                        sb2.append(iZzj);
                                                        strZzK = sb2.toString();
                                                    }
                                                    str7 = strZzK;
                                                }
                                                zzetVar3.zzh(iZzg3);
                                                str2 = str2;
                                                iZzB = i32;
                                                bArr6 = bArr7;
                                                i19 = 2;
                                            }
                                            str2 = str2;
                                            zzetVar3.zzh(iZzg3);
                                            str2 = str2;
                                            iZzB = i32;
                                            bArr6 = bArr7;
                                            i19 = 2;
                                        }
                                        byte[] bArr8 = bArr6;
                                        iZzB = iZzB;
                                        str2 = str2;
                                        if (str8 == null || str7 == null) {
                                            string = null;
                                        } else {
                                            StringBuilder sb3 = new StringBuilder(str8.length() + 1 + str7.length());
                                            sb3.append(str8);
                                            sb3.append(".");
                                            sb3.append(str7);
                                            string = sb3.toString();
                                        }
                                        listZzj = zzgwm.zzj(bArr8);
                                        iZzC2 = iZzC2;
                                    } else {
                                        iZzB = iZzB;
                                        str2 = str2;
                                        if (iZzB3 == 1885564227) {
                                            zzetVar.zzh(iZzg + 12);
                                            ByteOrder byteOrder = (zzetVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iZzs6 = zzetVar.zzs();
                                            if (i17 == 1768973165) {
                                                iZzC2 = zzfl.zzB(iZzs6, byteOrder);
                                            } else {
                                                iZzC2 = (i17 == 1718641517 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? zzfl.zzC(iZzs6) : iZzC2;
                                            }
                                            if (iZzC2 == 0) {
                                                iZzC2 = -1;
                                            }
                                            if (iZzC2 != -1) {
                                                strZza = MimeTypes.AUDIO_RAW;
                                            }
                                            string = str3;
                                        } else {
                                            iRound = iRound;
                                        }
                                    }
                                    iRound = iRound;
                                }
                            }
                            iZzB = iZzB;
                            string = str3;
                            iRound = iRound;
                        }
                        iZzC2 = iZzC2;
                        string = str3;
                    } else {
                        if (iZzB <= 0) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzB).length() + 49);
                            sb4.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                            sb4.append(iZzB);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        iZzC2 = iZzC2;
                        iZzB2 = iZzB2;
                        iRound = iZzB;
                        iZzB = iRound;
                        iZzH = i19;
                        string = str3;
                    }
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    iRound = iRound;
                    iZzC2 = iZzC2;
                    string = str3;
                }
                if (i15 != i16) {
                    zzalaVarZzp = zzp(zzetVar, i15);
                    strZza = zzalaVarZzp.zza();
                    byte[] bArrZzb = zzalaVarZzp.zzb();
                    if (bArrZzb != null) {
                        if (MimeTypes.AUDIO_VORBIS.equals(strZza)) {
                            int i33 = zzahm.zza;
                            zzet zzetVar4 = new zzet(bArrZzb);
                            int i34 = 1;
                            zzetVar4.zzk(1);
                            int i35 = 0;
                            while (zzetVar4.zzd() > 0 && zzetVar4.zzn() == 255) {
                                zzetVar4.zzk(i34);
                                i35 += 255;
                                i34 = 1;
                            }
                            int iZzs7 = i35 + zzetVar4.zzs();
                            int i36 = 0;
                            while (zzetVar4.zzd() > 0 && zzetVar4.zzn() == 255) {
                                zzetVar4.zzk(1);
                                i36 += 255;
                            }
                            int iZzs8 = i36 + zzetVar4.zzs();
                            byte[] bArr9 = new byte[iZzs7];
                            int iZzg4 = zzetVar4.zzg();
                            System.arraycopy(bArrZzb, iZzg4, bArr9, 0, iZzs7);
                            int i37 = iZzg4 + iZzs7 + iZzs8;
                            int length2 = bArrZzb.length - i37;
                            byte[] bArr10 = new byte[length2];
                            System.arraycopy(bArrZzb, i37, bArr10, 0, length2);
                            listZzj = zzgwm.zzk(bArr9, bArr10);
                        } else {
                            if (MimeTypes.AUDIO_AAC.equals(strZza)) {
                                zzaev zzaevVarZza = zzaew.zza(bArrZzb);
                                iRound = zzaevVarZza.zza;
                                iZzH = zzaevVarZza.zzb;
                                string = zzaevVarZza.zzc;
                            } else {
                                string = str3;
                            }
                            listZzj = zzgwm.zzj(bArrZzb);
                        }
                        iZzC2 = iZzC2;
                    }
                    string = str3;
                    iZzC2 = iZzC2;
                } else {
                    iZzC2 = iZzC2;
                    string = str3;
                }
            }
            iZzg += iZzB2;
            iZzC2 = iZzC2;
            str2 = str2;
            iZzB = iZzB;
            i19 = 2;
            i18 = i12;
        }
        String str10 = string;
        if (zzalfVar.zzb != null || strZza == null) {
            return;
        }
        zzt zztVar2 = new zzt();
        zztVar2.zzb(i13);
        zztVar2.zzo(strZza);
        zztVar2.zzk(str10);
        zztVar2.zzG(iZzH);
        zztVar2.zzH(iRound);
        zztVar2.zzI(iZzC2);
        zztVar2.zzr(listZzj);
        zztVar2.zzs(zzqVarZzb);
        zztVar2.zze(str);
        if (zzalaVarZzp != null) {
            zztVar2.zzi(zzhah.zzb(zzalaVarZzp.zzc()));
            zztVar2.zzj(zzhah.zzb(zzalaVarZzp.zzd()));
        } else if (zzakyVarZzq != null) {
            zztVar2.zzi(zzhah.zzb(zzakyVarZzq.zza()));
            zztVar2.zzj(zzhah.zzb(zzakyVarZzq.zzb()));
        }
        zzalfVar.zzb = zztVar2.zzO();
    }

    private static zzala zzp(zzet zzetVar, int i10) {
        zzetVar.zzh(i10 + 12);
        zzetVar.zzk(1);
        zzs(zzetVar);
        zzetVar.zzk(2);
        int iZzs = zzetVar.zzs();
        if ((iZzs & 128) != 0) {
            zzetVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzetVar.zzk(zzetVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzetVar.zzk(2);
        }
        zzetVar.zzk(1);
        zzs(zzetVar);
        String strZze = zzas.zze(zzetVar.zzs());
        if (MimeTypes.AUDIO_MPEG.equals(strZze) || MimeTypes.AUDIO_DTS.equals(strZze) || MimeTypes.AUDIO_DTS_HD.equals(strZze)) {
            return new zzala(strZze, null, -1L, -1L);
        }
        zzetVar.zzk(4);
        long jZzz = zzetVar.zzz();
        long jZzz2 = zzetVar.zzz();
        zzetVar.zzk(1);
        int iZzs2 = zzs(zzetVar);
        long j10 = jZzz2;
        byte[] bArr = new byte[iZzs2];
        zzetVar.zzm(bArr, 0, iZzs2);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new zzala(strZze, bArr, j10, jZzz > 0 ? jZzz : -1L);
    }

    private static zzaky zzq(zzet zzetVar, int i10) {
        zzetVar.zzh(i10 + 8);
        zzetVar.zzk(4);
        return new zzaky(zzetVar.zzz(), zzetVar.zzz());
    }

    private static Pair zzr(zzet zzetVar, int i10, int i11) throws zzat {
        zzamj zzamjVar;
        Pair pairCreate;
        int i12;
        int i13;
        int iZzg = zzetVar.zzg();
        while (iZzg - i10 < i11) {
            zzetVar.zzh(iZzg);
            int iZzB = zzetVar.zzB();
            zzagc.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzetVar.zzB() == 1936289382) {
                int i14 = iZzg + 8;
                int i15 = 0;
                int i16 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i14 - iZzg < iZzB) {
                    zzetVar.zzh(i14);
                    int iZzB2 = zzetVar.zzB();
                    int iZzB3 = zzetVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzetVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzetVar.zzk(4);
                        strZzK = zzetVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i16 = i14;
                        i15 = iZzB2;
                    }
                    i14 += iZzB2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(strZzK) || C.CENC_TYPE_cbc1.equals(strZzK) || C.CENC_TYPE_cens.equals(strZzK) || C.CENC_TYPE_cbcs.equals(strZzK)) {
                    zzagc.zza(numValueOf != null, "frma atom is mandatory");
                    zzagc.zza(i16 != -1, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 >= i15) {
                            zzamjVar = null;
                            break;
                        }
                        zzetVar.zzh(i17);
                        int iZzB4 = zzetVar.zzB();
                        if (zzetVar.zzB() == 1952804451) {
                            int iZza = zza(zzetVar.zzB());
                            zzetVar.zzk(1);
                            if (iZza == 0) {
                                zzetVar.zzk(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iZzs = zzetVar.zzs();
                                i12 = iZzs & 15;
                                i13 = (iZzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            boolean z10 = zzetVar.zzs() == 1;
                            int iZzs2 = zzetVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzetVar.zzm(bArr2, 0, 16);
                            if (z10 && iZzs2 == 0) {
                                int iZzs3 = zzetVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzetVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            zzamjVar = new zzamj(z10, strZzK, iZzs2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i17 += iZzB4;
                    }
                    zzagc.zza(zzamjVar != null, "tenc atom is mandatory");
                    String str = zzfl.zza;
                    pairCreate = Pair.create(numValueOf, zzamjVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzs(zzet zzetVar) {
        int iZzs = zzetVar.zzs();
        int i10 = iZzs & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while ((iZzs & 128) == 128) {
            iZzs = zzetVar.zzs();
            i10 = (i10 << 7) | (iZzs & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return i10;
    }
}
