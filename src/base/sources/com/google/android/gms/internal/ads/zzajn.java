package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajn {
    public static final zzajk zza = zzajl.zza;

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0112 A[SYNTHETIC] */
    public static final zzap zza(byte[] bArr, int i10, zzajk zzajkVar, zzaiy zzaiyVar) {
        boolean z10;
        zzajm zzajmVar;
        int i11;
        boolean zZzb;
        int iZzc;
        zzajo zzajoVarZzc;
        ArrayList arrayList = new ArrayList();
        zzet zzetVar = new zzet(bArr, i10);
        boolean z11 = false;
        if (zzetVar.zzd() < 10) {
            zzeg.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzx = zzetVar.zzx();
            if (iZzx == 4801587) {
                int iZzs = zzetVar.zzs();
                zzetVar.zzk(1);
                int iZzs2 = zzetVar.zzs();
                int iZzG = zzetVar.zzG();
                if (iZzs != 2) {
                    if (iZzs == 3) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzB = zzetVar.zzB();
                            zzetVar.zzk(iZzB);
                            iZzG -= iZzB + 4;
                        }
                    } else if (iZzs == 4) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzG2 = zzetVar.zzG();
                            zzetVar.zzk(iZzG2 - 4);
                            iZzG -= iZzG2;
                        }
                        if ((iZzs2 & 16) != 0) {
                            iZzG -= 10;
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzs).length() + 46);
                        sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb2.append(iZzs);
                        zzeg.zzc("Id3Decoder", sb2.toString());
                    }
                    if (iZzs < 4) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zzajmVar = new zzajm(iZzs, z10, iZzG);
                } else if ((iZzs2 & 64) != 0) {
                    zzeg.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzs < 4 || (iZzs2 & 128) == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zzajmVar = new zzajm(iZzs, z10, iZzG);
                }
                if (zzajmVar == null) {
                    return null;
                }
                int iZzg = zzetVar.zzg();
                i11 = zzajmVar.zza() == 2 ? 6 : 10;
                zZzb = zzajmVar.zzb();
                iZzc = zzajmVar.zzc();
                if (zZzb) {
                    iZzc = zze(zzetVar, zzajmVar.zzc());
                }
                zzetVar.zzf(iZzg + iZzc);
                if (!zzb(zzetVar, zzajmVar.zza(), i11, false)) {
                    if (zzajmVar.zza() == 4 || !zzb(zzetVar, 4, i11, true)) {
                        int iZza = zzajmVar.zza();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 45);
                        sb3.append("Failed to validate ID3 tag with majorVersion=");
                        sb3.append(iZza);
                        zzeg.zzc("Id3Decoder", sb3.toString());
                        return null;
                    }
                    z11 = true;
                }
                while (zzetVar.zzd() >= i11) {
                    zzajoVarZzc = zzc(zzajmVar.zza(), zzetVar, z11, i11, zzajkVar);
                    if (zzajoVarZzc != null) {
                        arrayList.add(zzajoVarZzc);
                    }
                }
                return new zzap(arrayList);
            }
            zzeg.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(iZzx))));
        }
        zzajmVar = null;
        if (zzajmVar == null) {
            return null;
        }
        int iZzg2 = zzetVar.zzg();
        if (zzajmVar.zza() == 2) {
        }
        zZzb = zzajmVar.zzb();
        iZzc = zzajmVar.zzc();
        if (zZzb) {
            iZzc = zze(zzetVar, zzajmVar.zzc());
        }
        zzetVar.zzf(iZzg2 + iZzc);
        if (!zzb(zzetVar, zzajmVar.zza(), i11, false)) {
            if (zzajmVar.zza() == 4) {
            }
            int iZza2 = zzajmVar.zza();
            StringBuilder sb4 = new StringBuilder(String.valueOf(iZza2).length() + 45);
            sb4.append("Failed to validate ID3 tag with majorVersion=");
            sb4.append(iZza2);
            zzeg.zzc("Id3Decoder", sb4.toString());
            return null;
        }
        while (zzetVar.zzd() >= i11) {
            zzajoVarZzc = zzc(zzajmVar.zza(), zzetVar, z11, i11, zzajkVar);
            if (zzajoVarZzc != null) {
                arrayList.add(zzajoVarZzc);
            }
        }
        return new zzap(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008f A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0008, B:7:0x0015, B:20:0x0040, B:23:0x004b, B:25:0x006d, B:29:0x0073, B:41:0x008f, B:42:0x0091, B:45:0x0097, B:48:0x00a1, B:31:0x007d, B:35:0x0084, B:10:0x0025), top: B:54:0x0008 }] */
    private static boolean zzb(zzet zzetVar, int i10, int i11, boolean z10) {
        boolean z11;
        int iZzx;
        long jZzx;
        int iZzt;
        int i12;
        int iZzg = zzetVar.zzg();
        while (true) {
            try {
                z11 = true;
                z11 = true;
                int i13 = 1;
                int i14 = 1;
                if (zzetVar.zzd() >= i11) {
                    if (i10 >= 3) {
                        iZzx = zzetVar.zzB();
                        jZzx = zzetVar.zzz();
                        iZzt = zzetVar.zzt();
                    } else {
                        iZzx = zzetVar.zzx();
                        jZzx = zzetVar.zzx();
                        iZzt = 0;
                    }
                    if (iZzx != 0 || jZzx != 0 || iZzt != 0) {
                        if (i10 != 4 || z10) {
                            if (i10 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i13 = 0;
                                }
                                int i15 = i13;
                                i14 = iZzt & 1;
                                i12 = i15;
                            } else if (i10 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i14 = 0;
                                }
                            } else {
                                i12 = 0;
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                i12 += 4;
                            }
                            if (jZzx >= i12 && zzetVar.zzd() >= jZzx) {
                                zzetVar.zzk((int) jZzx);
                            }
                        } else if ((8421504 & jZzx) == 0) {
                            long j10 = ((jZzx >> 16) & 255) << 14;
                            jZzx = ((jZzx >> 24) << 21) | j10 | (jZzx & 255) | (((jZzx >> 8) & 255) << 7);
                            if (i10 == 4) {
                                if ((iZzt & 64) != 0) {
                                    i13 = 0;
                                }
                                int i16 = i13;
                                i14 = iZzt & 1;
                                i12 = i16;
                            } else if (i10 == 3) {
                                if ((iZzt & 32) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i14 = 0;
                                }
                            } else {
                                i12 = 0;
                                i14 = 0;
                            }
                            if (i14 != 0) {
                                i12 += 4;
                            }
                            if (jZzx >= i12) {
                                zzetVar.zzk((int) jZzx);
                            }
                        }
                        z11 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th2) {
                zzetVar.zzh(iZzg);
                throw th2;
            }
        }
        zzetVar.zzh(iZzg);
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0278  */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0287  */
    /* JADX WARN: Code duplicated, block: B:155:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02a7 A[Catch: all -> 0x013e, Exception -> 0x0262, OutOfMemoryError -> 0x0267, TRY_LEAVE, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x0397, B:200:0x03a6, B:203:0x03b7, B:204:0x03bf, B:206:0x03c5, B:208:0x03cc, B:210:0x03d1, B:218:0x03f7, B:222:0x0422, B:224:0x042d, B:225:0x0462, B:226:0x046f, B:228:0x0475, B:230:0x047c, B:231:0x0480, B:235:0x0496, B:243:0x04a9, B:245:0x04d3, B:246:0x04e2, B:247:0x04ed), top: B:260:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cf A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x0397, B:200:0x03a6, B:203:0x03b7, B:204:0x03bf, B:206:0x03c5, B:208:0x03cc, B:210:0x03d1, B:218:0x03f7, B:222:0x0422, B:224:0x042d, B:225:0x0462, B:226:0x046f, B:228:0x0475, B:230:0x047c, B:231:0x0480, B:235:0x0496, B:243:0x04a9, B:245:0x04d3, B:246:0x04e2, B:247:0x04ed), top: B:260:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02e9 A[Catch: all -> 0x013e, Exception -> 0x02c9, OutOfMemoryError -> 0x02cc, TryCatch #7 {all -> 0x013e, blocks: (B:82:0x0110, B:92:0x014c, B:95:0x0153, B:107:0x0185, B:110:0x01b7, B:118:0x01e3, B:132:0x0218, B:134:0x022f, B:158:0x0293, B:160:0x02a7, B:162:0x02ae, B:174:0x02ef, B:170:0x02cf, B:172:0x02e9, B:187:0x032b, B:194:0x036e, B:197:0x0397, B:200:0x03a6, B:203:0x03b7, B:204:0x03bf, B:206:0x03c5, B:208:0x03cc, B:210:0x03d1, B:218:0x03f7, B:222:0x0422, B:224:0x042d, B:225:0x0462, B:226:0x046f, B:228:0x0475, B:230:0x047c, B:231:0x0480, B:235:0x0496, B:243:0x04a9, B:245:0x04d3, B:246:0x04e2, B:247:0x04ed), top: B:260:0x00fc }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:178:0x031b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0364  */
    /* JADX WARN: Code duplicated, block: B:212:0x03eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:236:0x049b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x049d  */
    /* JADX WARN: Code duplicated, block: B:254:0x050e  */
    private static zzajo zzc(int i10, zzet zzetVar, boolean z10, int i11, zzajk zzajkVar) {
        int iZzH;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        zzajo zzajoVar;
        int i14;
        zzajo zzajfVar;
        zzajo zzajrVar;
        zzajo zzajiVar;
        byte[] bArr;
        int iZzi;
        String strZza;
        String strConcat;
        int iZzs = zzetVar.zzs();
        int iZzs2 = zzetVar.zzs();
        int iZzs3 = zzetVar.zzs();
        int i15 = 0;
        int iZzs4 = i10 >= 3 ? zzetVar.zzs() : 0;
        if (i10 == 4) {
            iZzH = zzetVar.zzH();
            if (!z10) {
                iZzH = ((iZzH >> 24) << 21) | (iZzH & 255) | (((iZzH >> 8) & 255) << 7) | (((iZzH >> 16) & 255) << 14);
            }
        } else {
            iZzH = i10 == 3 ? zzetVar.zzH() : zzetVar.zzx();
        }
        int iZzt = i10 >= 3 ? zzetVar.zzt() : 0;
        if (iZzs == 0 && iZzs2 == 0 && iZzs3 == 0 && iZzs4 == 0 && iZzH == 0 && iZzt == 0) {
            zzetVar.zzh(zzetVar.zze());
            return null;
        }
        int iZzg = zzetVar.zzg() + iZzH;
        String str = "Id3Decoder";
        if (iZzg > zzetVar.zze()) {
            zzeg.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzetVar.zzh(zzetVar.zze());
            return null;
        }
        if (zzajkVar != null) {
            zzetVar.zzh(iZzg);
            return null;
        }
        if (i10 == 3) {
            int i16 = iZzt & 64;
            i12 = (iZzt & 128) != 0 ? 1 : 0;
            iZzs = 0;
            z12 = i16 != 0;
            z11 = (iZzt & 32) != 0;
            i13 = i12;
        } else if (i10 == 4) {
            boolean z13 = (iZzt & 64) != 0;
            int i17 = (iZzt & 8) != 0 ? 1 : 0;
            z12 = (iZzt & 4) != 0;
            iZzs = (iZzt & 2) != 0 ? 1 : 0;
            i13 = iZzt & 1;
            int i18 = i17;
            z11 = z13;
            i12 = i18;
        } else {
            i12 = 0;
            i13 = 0;
            z11 = false;
            z12 = false;
            iZzs = 0;
        }
        if (i12 != 0 || z12) {
            zzeg.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzetVar.zzh(iZzg);
            return null;
        }
        if (z11) {
            zzetVar.zzk(1);
            iZzH--;
        }
        if (i13 != 0) {
            zzetVar.zzk(4);
            iZzH -= 4;
        }
        if (iZzs != 0) {
            iZzH = zze(zzetVar, iZzH);
        }
        try {
            try {
                if (iZzs == 84 && iZzs2 == 88 && iZzs3 == 88 && (i10 == 2 || iZzs4 == 88)) {
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzajiVar = null;
                    } else {
                        int iZzs5 = zzetVar.zzs();
                        int i19 = iZzH - 1;
                        byte[] bArr2 = new byte[i19];
                        zzetVar.zzm(bArr2, 0, i19);
                        int iZzh = zzh(bArr2, 0, iZzs5);
                        zzajiVar = new zzajt("TXXX", new String(bArr2, 0, iZzh, zzf(iZzs5)), zzd(bArr2, iZzs5, iZzh + zzj(iZzs5)));
                        str = "Id3Decoder";
                    }
                } else if (iZzs == 84) {
                    String strZzg = zzg(i10, 84, iZzs2, iZzs3, iZzs4);
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzajiVar = null;
                    } else {
                        int iZzs6 = zzetVar.zzs();
                        int i20 = iZzH - 1;
                        byte[] bArr3 = new byte[i20];
                        zzetVar.zzm(bArr3, 0, i20);
                        zzajiVar = new zzajt(strZzg, null, zzd(bArr3, iZzs6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iZzs == 87) {
                        if (iZzs2 != 88 || iZzs3 != 88 || (i10 != 2 && iZzs4 != 88)) {
                            i14 = 87;
                        }
                        if (iZzH <= 0) {
                            iZzs = iZzs;
                            str = "Id3Decoder";
                            zzajiVar = null;
                        } else {
                            int iZzs7 = zzetVar.zzs();
                            int i21 = iZzH - 1;
                            byte[] bArr4 = new byte[i21];
                            zzetVar.zzm(bArr4, 0, i21);
                            int iZzh2 = zzh(bArr4, 0, iZzs7);
                            String str2 = new String(bArr4, 0, iZzh2, zzf(iZzs7));
                            int iZzj = iZzh2 + zzj(iZzs7);
                            zzajiVar = new zzaju("WXXX", str2, zzl(bArr4, iZzj, zzi(bArr4, iZzj), StandardCharsets.ISO_8859_1));
                            str = "Id3Decoder";
                        }
                    } else {
                        i14 = iZzs;
                    }
                    if (i14 == 87) {
                        String strZzg2 = zzg(i10, 87, iZzs2, iZzs3, iZzs4);
                        byte[] bArr5 = new byte[iZzH];
                        zzetVar.zzm(bArr5, 0, iZzH);
                        zzajiVar = new zzaju(strZzg2, null, new String(bArr5, 0, zzi(bArr5, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i14 == 80) {
                            if (iZzs2 == 82 && iZzs3 == 73 && iZzs4 == 86) {
                                byte[] bArr6 = new byte[iZzH];
                                zzetVar.zzm(bArr6, 0, iZzH);
                                int iZzi2 = zzi(bArr6, 0);
                                zzajiVar = new zzajs(new String(bArr6, 0, iZzi2, StandardCharsets.ISO_8859_1), zzk(bArr6, iZzi2 + 1, iZzH));
                            } else {
                                i14 = 80;
                            }
                        }
                        try {
                            if (i14 != 71) {
                                try {
                                    if (i10 != 2) {
                                        if (i14 != 65 && iZzs2 == 80 && iZzs3 == 73 && iZzs4 == 67) {
                                            int iZzs8 = zzetVar.zzs();
                                            Charset charsetZzf = zzf(iZzs8);
                                            int i22 = iZzH - 1;
                                            bArr = new byte[i22];
                                            zzetVar.zzm(bArr, 0, i22);
                                            if (i10 == 2) {
                                                iZzs = iZzs;
                                                strConcat = "image/".concat(String.valueOf(zzgss.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iZzi = 2;
                                            } else {
                                                iZzs = iZzs;
                                                iZzi = zzi(bArr, 0);
                                                strZza = zzgss.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                                if (strZza.indexOf(47) == -1) {
                                                    strConcat = "image/".concat(strZza);
                                                } else {
                                                    strConcat = strZza;
                                                }
                                            }
                                            int i23 = bArr[iZzi + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                            int i24 = iZzi + 2;
                                            int iZzh3 = zzh(bArr, i24, iZzs8);
                                            zzajfVar = new zzaje(strConcat, new String(bArr, i24, iZzh3 - i24, charsetZzf), i23, zzk(bArr, iZzh3 + zzj(iZzs8), i22));
                                        } else {
                                            iZzs = iZzs;
                                            if (i14 == 67) {
                                                if (i14 != 67) {
                                                    if (i14 != 67) {
                                                        if (i14 != 77) {
                                                        }
                                                        String strZzg3 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr7 = new byte[iZzH];
                                                        zzetVar.zzm(bArr7, 0, iZzH);
                                                        zzajfVar = new zzajf(strZzg3, bArr7);
                                                    } else {
                                                        if (i14 != 77) {
                                                        }
                                                        String strZzg4 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr8 = new byte[iZzH];
                                                        zzetVar.zzm(bArr8, 0, iZzH);
                                                        zzajfVar = new zzajf(strZzg4, bArr8);
                                                    }
                                                } else if (i14 != 67) {
                                                    if (i14 != 77) {
                                                    }
                                                    String strZzg5 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr9 = new byte[iZzH];
                                                    zzetVar.zzm(bArr9, 0, iZzH);
                                                    zzajfVar = new zzajf(strZzg5, bArr9);
                                                } else {
                                                    if (i14 != 77) {
                                                    }
                                                    String strZzg6 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr10 = new byte[iZzH];
                                                    zzetVar.zzm(bArr10, 0, iZzH);
                                                    zzajfVar = new zzajf(strZzg6, bArr10);
                                                }
                                                zzajiVar = zzajrVar;
                                            } else {
                                                if (i14 != 67) {
                                                    if (i14 != 67) {
                                                        if (i14 != 77) {
                                                        }
                                                        String strZzg7 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr11 = new byte[iZzH];
                                                        zzetVar.zzm(bArr11, 0, iZzH);
                                                        zzajfVar = new zzajf(strZzg7, bArr11);
                                                    } else {
                                                        if (i14 != 77) {
                                                        }
                                                        String strZzg8 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr12 = new byte[iZzH];
                                                        zzetVar.zzm(bArr12, 0, iZzH);
                                                        zzajfVar = new zzajf(strZzg8, bArr12);
                                                    }
                                                } else if (i14 != 67) {
                                                    if (i14 != 77) {
                                                    }
                                                    String strZzg9 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr13 = new byte[iZzH];
                                                    zzetVar.zzm(bArr13, 0, iZzH);
                                                    zzajfVar = new zzajf(strZzg9, bArr13);
                                                } else {
                                                    if (i14 != 77) {
                                                    }
                                                    String strZzg10 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr14 = new byte[iZzH];
                                                    zzetVar.zzm(bArr14, 0, iZzH);
                                                    zzajfVar = new zzajf(strZzg10, bArr14);
                                                }
                                                zzajiVar = zzajrVar;
                                            }
                                        }
                                        zzajiVar = zzajfVar;
                                    } else if (i14 != 80 && iZzs2 == 73 && iZzs3 == 67) {
                                        int iZzs9 = zzetVar.zzs();
                                        Charset charsetZzf2 = zzf(iZzs9);
                                        int i25 = iZzH - 1;
                                        bArr = new byte[i25];
                                        zzetVar.zzm(bArr, 0, i25);
                                        if (i10 == 2) {
                                            iZzs = iZzs;
                                            strConcat = "image/".concat(String.valueOf(zzgss.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1))));
                                            if ("image/jpg".equals(strConcat)) {
                                                strConcat = "image/jpeg";
                                            }
                                            iZzi = 2;
                                        } else {
                                            iZzs = iZzs;
                                            iZzi = zzi(bArr, 0);
                                            strZza = zzgss.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                            if (strZza.indexOf(47) == -1) {
                                                strConcat = "image/".concat(strZza);
                                            } else {
                                                strConcat = strZza;
                                            }
                                        }
                                        int i26 = bArr[iZzi + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                        int i27 = iZzi + 2;
                                        int iZzh4 = zzh(bArr, i27, iZzs9);
                                        zzajfVar = new zzaje(strConcat, new String(bArr, i27, iZzh4 - i27, charsetZzf2), i26, zzk(bArr, iZzh4 + zzj(iZzs9), i25));
                                        zzajiVar = zzajfVar;
                                    } else {
                                        iZzs = iZzs;
                                        if (i14 == 67 || iZzs2 != 79 || iZzs3 != 77 || (iZzs4 != 77 && i10 != 2)) {
                                            if (i14 != 67 && iZzs2 == 72 && iZzs3 == 65 && iZzs4 == 80) {
                                                int iZzg2 = zzetVar.zzg();
                                                int iZzi3 = zzi(zzetVar.zzi(), iZzg2);
                                                String str3 = new String(zzetVar.zzi(), iZzg2, iZzi3 - iZzg2, StandardCharsets.ISO_8859_1);
                                                zzetVar.zzh(iZzi3 + 1);
                                                int iZzB = zzetVar.zzB();
                                                int iZzB2 = zzetVar.zzB();
                                                if (iZzB > iZzB2) {
                                                    zzajiVar = null;
                                                } else {
                                                    long jZzz = zzetVar.zzz();
                                                    if (jZzz == 4294967295L) {
                                                        jZzz = -1;
                                                    }
                                                    long j10 = jZzz;
                                                    long jZzz2 = zzetVar.zzz();
                                                    if (jZzz2 == 4294967295L) {
                                                        jZzz2 = -1;
                                                    }
                                                    long j11 = jZzz2;
                                                    ArrayList arrayList = new ArrayList();
                                                    int i28 = iZzg2 + iZzH;
                                                    while (zzetVar.zzg() < i28) {
                                                        zzajo zzajoVarZzc = zzc(i10, zzetVar, z10, i11, null);
                                                        if (zzajoVarZzc != null) {
                                                            arrayList.add(zzajoVarZzc);
                                                        }
                                                        i15 = 0;
                                                    }
                                                    zzajrVar = new zzajg(str3, iZzB, iZzB2, j10, j11, (zzajo[]) arrayList.toArray(new zzajo[i15]));
                                                }
                                            } else if (i14 != 67 && iZzs2 == 84 && iZzs3 == 79 && iZzs4 == 67) {
                                                int iZzg3 = zzetVar.zzg();
                                                int iZzi4 = zzi(zzetVar.zzi(), iZzg3);
                                                String str4 = new String(zzetVar.zzi(), iZzg3, iZzi4 - iZzg3, StandardCharsets.ISO_8859_1);
                                                zzetVar.zzh(iZzi4 + 1);
                                                int iZzs10 = zzetVar.zzs();
                                                boolean z14 = (iZzs10 & 2) != 0;
                                                int i29 = iZzs10 & 1;
                                                int iZzs11 = zzetVar.zzs();
                                                String[] strArr = new String[iZzs11];
                                                int i30 = 0;
                                                while (i30 < iZzs11) {
                                                    int iZzg4 = zzetVar.zzg();
                                                    int i31 = iZzg3;
                                                    int iZzi5 = zzi(zzetVar.zzi(), iZzg4);
                                                    String[] strArr2 = strArr;
                                                    strArr2[i30] = new String(zzetVar.zzi(), iZzg4, iZzi5 - iZzg4, StandardCharsets.ISO_8859_1);
                                                    zzetVar.zzh(iZzi5 + 1);
                                                    i30++;
                                                    iZzg3 = i31;
                                                    iZzs11 = iZzs11;
                                                    str4 = str4;
                                                    strArr = strArr2;
                                                }
                                                int i32 = iZzg3;
                                                String str5 = str4;
                                                String[] strArr3 = strArr;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i33 = i32 + iZzH;
                                                while (zzetVar.zzg() < i33) {
                                                    zzajo zzajoVarZzc2 = zzc(i10, zzetVar, z10, i11, null);
                                                    if (zzajoVarZzc2 != null) {
                                                        arrayList2.add(zzajoVarZzc2);
                                                    }
                                                }
                                                zzajrVar = new zzajh(str5, z14, 1 == i29, strArr3, (zzajo[]) arrayList2.toArray(new zzajo[0]));
                                            } else if (i14 != 77 && iZzs2 == 76 && iZzs3 == 76 && iZzs4 == 84) {
                                                int iZzt2 = zzetVar.zzt();
                                                int iZzx = zzetVar.zzx();
                                                int iZzx2 = zzetVar.zzx();
                                                int iZzs12 = zzetVar.zzs();
                                                int iZzs13 = zzetVar.zzs();
                                                zzes zzesVar = new zzes();
                                                zzesVar.zza(zzetVar);
                                                int i34 = ((iZzH - 10) * 8) / (iZzs12 + iZzs13);
                                                int[] iArr = new int[i34];
                                                int[] iArr2 = new int[i34];
                                                for (int i35 = 0; i35 < i34; i35++) {
                                                    int iZzj2 = zzesVar.zzj(iZzs12);
                                                    int iZzj3 = zzesVar.zzj(iZzs13);
                                                    iArr[i35] = iZzj2;
                                                    iArr2[i35] = iZzj3;
                                                }
                                                zzajrVar = new zzajr(iZzt2, iZzx, iZzx2, iArr, iArr2);
                                            } else {
                                                String strZzg11 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr15 = new byte[iZzH];
                                                zzetVar.zzm(bArr15, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg11, bArr15);
                                                zzajiVar = zzajfVar;
                                            }
                                            zzajiVar = zzajrVar;
                                        } else if (iZzH < 4) {
                                            zzajiVar = null;
                                        } else {
                                            int iZzs14 = zzetVar.zzs();
                                            Charset charsetZzf3 = zzf(iZzs14);
                                            byte[] bArr16 = new byte[3];
                                            zzetVar.zzm(bArr16, 0, 3);
                                            String str6 = new String(bArr16, 0, 3);
                                            int i36 = iZzH - 4;
                                            byte[] bArr17 = new byte[i36];
                                            zzetVar.zzm(bArr17, 0, i36);
                                            int iZzh5 = zzh(bArr17, 0, iZzs14);
                                            String str7 = new String(bArr17, 0, iZzh5, charsetZzf3);
                                            int iZzj4 = iZzh5 + zzj(iZzs14);
                                            zzajiVar = new zzaji(str6, str7, zzl(bArr17, iZzj4, zzh(bArr17, iZzj4, iZzs14), charsetZzf3));
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    zzetVar.zzh(iZzg);
                                    zzajoVar = null;
                                } catch (OutOfMemoryError e11) {
                                    e = e11;
                                    zzetVar.zzh(iZzg);
                                    zzajoVar = null;
                                }
                                if (zzajoVar == null) {
                                    String strZzg12 = zzg(i10, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZzg12).length() + 39 + String.valueOf(iZzH).length());
                                    sb2.append("Failed to decode frame: id=");
                                    sb2.append(strZzg12);
                                    sb2.append(", frameSize=");
                                    sb2.append(iZzH);
                                    zzeg.zzd(str, sb2.toString(), e);
                                }
                                return zzajoVar;
                            }
                            if (iZzs2 != 69 || iZzs3 != 79) {
                                i14 = 71;
                                if (i10 != 2) {
                                    if (i14 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg13 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr18 = new byte[iZzH];
                                                zzetVar.zzm(bArr18, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg13, bArr18);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg14 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr19 = new byte[iZzH];
                                                zzetVar.zzm(bArr19, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg14, bArr19);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg15 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr110 = new byte[iZzH];
                                            zzetVar.zzm(bArr110, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg15, bArr110);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg16 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr111 = new byte[iZzH];
                                            zzetVar.zzm(bArr111, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg16, bArr111);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg17 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr112 = new byte[iZzH];
                                                zzetVar.zzm(bArr112, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg17, bArr112);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg18 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr113 = new byte[iZzH];
                                                zzetVar.zzm(bArr113, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg18, bArr113);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg19 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr114 = new byte[iZzH];
                                            zzetVar.zzm(bArr114, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg19, bArr114);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg110 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr115 = new byte[iZzH];
                                            zzetVar.zzm(bArr115, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg110, bArr115);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    }
                                } else {
                                    if (i14 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg111 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr116 = new byte[iZzH];
                                                zzetVar.zzm(bArr116, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg111, bArr116);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg112 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr117 = new byte[iZzH];
                                                zzetVar.zzm(bArr117, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg112, bArr117);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg113 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr118 = new byte[iZzH];
                                            zzetVar.zzm(bArr118, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg113, bArr118);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg114 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr119 = new byte[iZzH];
                                            zzetVar.zzm(bArr119, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg114, bArr119);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg115 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1110 = new byte[iZzH];
                                                zzetVar.zzm(bArr1110, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg115, bArr1110);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg116 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1111 = new byte[iZzH];
                                                zzetVar.zzm(bArr1111, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg116, bArr1111);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg117 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1112 = new byte[iZzH];
                                            zzetVar.zzm(bArr1112, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg117, bArr1112);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg118 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1113 = new byte[iZzH];
                                            zzetVar.zzm(bArr1113, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg118, bArr1113);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    }
                                }
                                if (zzajoVar == null) {
                                    String strZzg119 = zzg(i10, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZzg119).length() + 39 + String.valueOf(iZzH).length());
                                    sb3.append("Failed to decode frame: id=");
                                    sb3.append(strZzg119);
                                    sb3.append(", frameSize=");
                                    sb3.append(iZzH);
                                    zzeg.zzd(str, sb3.toString(), e);
                                }
                                return zzajoVar;
                            }
                            if (iZzs4 != 66 && i10 != 2) {
                                i14 = 71;
                                if (i10 != 2) {
                                    if (i14 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg1110 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1114 = new byte[iZzH];
                                                zzetVar.zzm(bArr1114, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg1110, bArr1114);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg1111 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1115 = new byte[iZzH];
                                                zzetVar.zzm(bArr1115, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg1111, bArr1115);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg1112 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1116 = new byte[iZzH];
                                            zzetVar.zzm(bArr1116, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg1112, bArr1116);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg1113 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1117 = new byte[iZzH];
                                            zzetVar.zzm(bArr1117, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg1113, bArr1117);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg1114 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1118 = new byte[iZzH];
                                                zzetVar.zzm(bArr1118, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg1114, bArr1118);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg1115 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1119 = new byte[iZzH];
                                                zzetVar.zzm(bArr1119, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg1115, bArr1119);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg1116 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11110 = new byte[iZzH];
                                            zzetVar.zzm(bArr11110, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg1116, bArr11110);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg1117 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11111 = new byte[iZzH];
                                            zzetVar.zzm(bArr11111, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg1117, bArr11111);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    }
                                } else {
                                    if (i14 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i14 == 67) {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg1118 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11112 = new byte[iZzH];
                                                zzetVar.zzm(bArr11112, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg1118, bArr11112);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg1119 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11113 = new byte[iZzH];
                                                zzetVar.zzm(bArr11113, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg1119, bArr11113);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg11110 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11114 = new byte[iZzH];
                                            zzetVar.zzm(bArr11114, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg11110, bArr11114);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg11111 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11115 = new byte[iZzH];
                                            zzetVar.zzm(bArr11115, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg11111, bArr11115);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    } else {
                                        if (i14 != 67) {
                                            if (i14 != 67) {
                                                if (i14 != 77) {
                                                }
                                                String strZzg11112 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11116 = new byte[iZzH];
                                                zzetVar.zzm(bArr11116, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg11112, bArr11116);
                                                zzajiVar = zzajfVar;
                                            } else {
                                                if (i14 != 77) {
                                                }
                                                String strZzg11113 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11117 = new byte[iZzH];
                                                zzetVar.zzm(bArr11117, 0, iZzH);
                                                zzajfVar = new zzajf(strZzg11113, bArr11117);
                                                zzajiVar = zzajfVar;
                                            }
                                        } else if (i14 != 67) {
                                            if (i14 != 77) {
                                            }
                                            String strZzg11114 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11118 = new byte[iZzH];
                                            zzetVar.zzm(bArr11118, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg11114, bArr11118);
                                            zzajiVar = zzajfVar;
                                        } else {
                                            if (i14 != 77) {
                                            }
                                            String strZzg11115 = zzg(i10, i14, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11119 = new byte[iZzH];
                                            zzetVar.zzm(bArr11119, 0, iZzH);
                                            zzajfVar = new zzajf(strZzg11115, bArr11119);
                                            zzajiVar = zzajfVar;
                                        }
                                        zzajiVar = zzajrVar;
                                    }
                                }
                                if (zzajoVar == null) {
                                    String strZzg1120 = zzg(i10, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(strZzg1120).length() + 39 + String.valueOf(iZzH).length());
                                    sb4.append("Failed to decode frame: id=");
                                    sb4.append(strZzg1120);
                                    sb4.append(", frameSize=");
                                    sb4.append(iZzH);
                                    zzeg.zzd(str, sb4.toString(), e);
                                }
                                return zzajoVar;
                            }
                            try {
                                int iZzs15 = zzetVar.zzs();
                                Charset charsetZzf4 = zzf(iZzs15);
                                int i37 = iZzH - 1;
                                byte[] bArr20 = new byte[i37];
                                zzetVar.zzm(bArr20, 0, i37);
                                int iZzi6 = zzi(bArr20, 0);
                                str = "Id3Decoder";
                                String strZzh = zzas.zzh(new String(bArr20, 0, iZzi6, StandardCharsets.ISO_8859_1));
                                int i38 = iZzi6 + 1;
                                int iZzh6 = zzh(bArr20, i38, iZzs15);
                                String strZzl = zzl(bArr20, i38, iZzh6, charsetZzf4);
                                int iZzj5 = iZzh6 + zzj(iZzs15);
                                int iZzh7 = zzh(bArr20, iZzj5, iZzs15);
                                iZzs = iZzs;
                                zzajiVar = new zzajj(strZzh, strZzl, zzl(bArr20, iZzj5, iZzh7, charsetZzf4), zzk(bArr20, iZzh7 + zzj(iZzs15), i37));
                            } catch (Exception e12) {
                                e = e12;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzetVar.zzh(iZzg);
                                zzajoVar = null;
                            } catch (OutOfMemoryError e13) {
                                e = e13;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzetVar.zzh(iZzg);
                                zzajoVar = null;
                            }
                        } catch (Exception e14) {
                            e = e14;
                        } catch (OutOfMemoryError e15) {
                            e = e15;
                        }
                    }
                    str = "Id3Decoder";
                }
                zzetVar.zzh(iZzg);
                zzajoVar = zzajiVar;
                e = null;
            } catch (Throwable th2) {
                zzetVar.zzh(iZzg);
                throw th2;
            }
        } catch (Exception e16) {
            e = e16;
            iZzs = iZzs;
            str = "Id3Decoder";
            zzetVar.zzh(iZzg);
            zzajoVar = null;
            if (zzajoVar == null) {
                String strZzg1121 = zzg(i10, iZzs, iZzs2, iZzs3, iZzs4);
                StringBuilder sb5 = new StringBuilder(String.valueOf(strZzg1121).length() + 39 + String.valueOf(iZzH).length());
                sb5.append("Failed to decode frame: id=");
                sb5.append(strZzg1121);
                sb5.append(", frameSize=");
                sb5.append(iZzH);
                zzeg.zzd(str, sb5.toString(), e);
            }
            return zzajoVar;
        } catch (OutOfMemoryError e17) {
            e = e17;
            iZzs = iZzs;
            str = "Id3Decoder";
            zzetVar.zzh(iZzg);
            zzajoVar = null;
            if (zzajoVar == null) {
                String strZzg1122 = zzg(i10, iZzs, iZzs2, iZzs3, iZzs4);
                StringBuilder sb6 = new StringBuilder(String.valueOf(strZzg1122).length() + 39 + String.valueOf(iZzH).length());
                sb6.append("Failed to decode frame: id=");
                sb6.append(strZzg1122);
                sb6.append(", frameSize=");
                sb6.append(iZzH);
                zzeg.zzd(str, sb6.toString(), e);
            }
            return zzajoVar;
        }
        if (zzajoVar == null) {
            String strZzg1123 = zzg(i10, iZzs, iZzs2, iZzs3, iZzs4);
            StringBuilder sb7 = new StringBuilder(String.valueOf(strZzg1123).length() + 39 + String.valueOf(iZzH).length());
            sb7.append("Failed to decode frame: id=");
            sb7.append(strZzg1123);
            sb7.append(", frameSize=");
            sb7.append(iZzH);
            zzeg.zzd(str, sb7.toString(), e);
        }
        return zzajoVar;
    }

    private static zzgwm zzd(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return zzgwm.zzj("");
        }
        int i12 = zzgwm.zzd;
        zzgwj zzgwjVar = new zzgwj();
        int iZzh = zzh(bArr, i11, i10);
        while (i11 < iZzh) {
            zzgwjVar.zzf(new String(bArr, i11, iZzh - i11, zzf(i10)));
            i11 = zzj(i10) + iZzh;
            iZzh = zzh(bArr, i11, i10);
        }
        zzgwm zzgwmVarZzi = zzgwjVar.zzi();
        return zzgwmVarZzi.isEmpty() ? zzgwm.zzj("") : zzgwmVarZzi;
    }

    private static int zze(zzet zzetVar, int i10) {
        byte[] bArrZzi = zzetVar.zzi();
        int iZzg = zzetVar.zzg();
        int i11 = iZzg;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iZzg + i10) {
                return i10;
            }
            if ((bArrZzi[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && bArrZzi[i12] == 0) {
                System.arraycopy(bArrZzi, i11 + 2, bArrZzi, i12, (i10 - (i11 - iZzg)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    private static Charset zzf(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String zzg(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int zzh(byte[] bArr, int i10, int i11) {
        int iZzi = zzi(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZzi;
        }
        while (true) {
            int length = bArr.length;
            if (iZzi >= length - 1) {
                return length;
            }
            int i12 = iZzi + 1;
            if ((iZzi - i10) % 2 == 0 && bArr[i12] == 0) {
                return iZzi;
            }
            iZzi = zzi(bArr, i12);
        }
    }

    private static int zzi(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static int zzj(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? zzfl.zzb : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static String zzl(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }
}
