package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import f8.Ygx.FuoITeVPeXAj;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakg {
    public byte[] zzN;
    public zzahl zzT;
    public boolean zzV;
    public zzahk zzX;
    public zzv zzY;
    public int zzZ;
    public boolean zza;
    private int zzaa;
    public String zzb;
    public String zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public boolean zzh;
    public byte[] zzi;
    public zzahj zzj;
    public byte[] zzk;
    public zzq zzl;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = -1;
    public int zzr = 0;
    public int zzs = -1;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public float zzv = 0.0f;
    public byte[] zzw = null;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzU = false;
    public boolean zzW = true;
    private String zzab = "eng";

    protected zzakg() {
    }

    private static Pair zzf(zzet zzetVar) throws zzat {
        try {
            zzetVar.zzk(16);
            long jZzA = zzetVar.zzA();
            if (jZzA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzA == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (jZzA != 826496599) {
                zzeg.zzc("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int iZzg = zzetVar.zzg() + 20;
            byte[] bArrZzi = zzetVar.zzi();
            while (true) {
                int length = bArrZzi.length;
                if (iZzg >= length - 4) {
                    throw zzat.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                int i10 = iZzg + 1;
                if (bArrZzi[iZzg] == 0 && bArrZzi[i10] == 0 && bArrZzi[iZzg + 2] == 1 && bArrZzi[iZzg + 3] == 15) {
                    return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArrZzi, iZzg, length)));
                }
                iZzg = i10;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzat {
        int i10;
        int i11;
        try {
            if (bArr[0] != 2) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i12 = 0;
            int i13 = 1;
            while (true) {
                int i14 = bArr[i13];
                i13++;
                i10 = i14 & 255;
                if (i10 != 255) {
                    break;
                }
                i12 += 255;
            }
            int i15 = i12 + i10;
            int i16 = 0;
            while (true) {
                int i17 = bArr[i13];
                i13++;
                i11 = i17 & 255;
                if (i11 != 255) {
                    break;
                }
                i16 += 255;
            }
            int i18 = i16 + i11;
            if (bArr[i13] != 1) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            int i19 = i13 + i15;
            if (bArr[i19] != 3) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int i20 = i19 + i18;
            if (bArr[i20] != 5) {
                throw zzat.zzb("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i20;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i20, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzet zzetVar) throws zzat {
        try {
            int iZzu = zzetVar.zzu();
            if (iZzu == 1) {
                return true;
            }
            if (iZzu == 65534) {
                zzetVar.zzh(24);
                if (zzetVar.zzD() == zzakh.zzf.getMostSignificantBits() && zzetVar.zzD() == zzakh.zzf.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzat.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzat {
        byte[] bArr = this.zzk;
        if (bArr != null) {
            return bArr;
        }
        throw zzat.zzb("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    final /* synthetic */ void zzb() {
        this.zzX.getClass();
    }

    final /* synthetic */ int zzc() {
        return this.zzaa;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zzaa = i10;
    }

    final /* synthetic */ void zze(String str) {
        this.zzab = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0199  */
    /* JADX WARN: Code duplicated, block: B:128:0x023a A[PHI: r1
      0x023a: PHI (r1v57 int) = (r1v46 int), (r1v50 int), (r1v54 int), (r1v59 int) binds: [B:138:0x02b3, B:133:0x0274, B:130:0x0246, B:125:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0460  */
    /* JADX WARN: Code duplicated, block: B:187:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x0489  */
    /* JADX WARN: Code duplicated, block: B:192:0x048c  */
    /* JADX WARN: Code duplicated, block: B:195:0x049b  */
    /* JADX WARN: Code duplicated, block: B:196:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:202:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:210:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:213:0x04db  */
    /* JADX WARN: Code duplicated, block: B:215:0x04de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:223:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:227:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:229:0x0501  */
    /* JADX WARN: Code duplicated, block: B:230:0x0504  */
    /* JADX WARN: Code duplicated, block: B:233:0x050b  */
    /* JADX WARN: Code duplicated, block: B:253:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:256:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:259:0x0607  */
    /* JADX WARN: Code duplicated, block: B:262:0x060c  */
    /* JADX WARN: Code duplicated, block: B:280:0x0658  */
    /* JADX WARN: Code duplicated, block: B:282:0x0677  */
    /* JADX WARN: Code duplicated, block: B:284:0x067d  */
    /* JADX WARN: Code duplicated, block: B:299:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:304:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:305:0x06c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v104, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v35, types: [com.google.android.gms.internal.ads.zzt] */
    public final void zza(int i10) {
        byte b10;
        String str;
        Object objZzj;
        String str2;
        String str3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iZzB;
        int i16;
        List list;
        int i17;
        String str4;
        List listZzg;
        String str5;
        int i18;
        String str6;
        String str7;
        String str8;
        Object obj;
        int i19;
        ?? zztVar;
        int i20;
        int i21;
        float f10;
        int i22;
        int i23;
        byte[] bArr;
        String str9;
        int iIntValue;
        int i24;
        int i25;
        int i26;
        int i27;
        String str10;
        String str11;
        zzfu zzfuVarZza;
        String str12 = this.zzc;
        switch (str12.hashCode()) {
            case -2095576542:
                if (!str12.equals("V_MPEG4/ISO/AP")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case -2095575984:
                if (!str12.equals("V_MPEG4/ISO/SP")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1985379776:
                if (!str12.equals("A_MS/ACM")) {
                    b10 = -1;
                } else {
                    b10 = 23;
                }
                break;
            case -1784763192:
                if (!str12.equals("A_TRUEHD")) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case -1730367663:
                if (!str12.equals("A_VORBIS")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case -1482641358:
                if (!str12.equals("A_MPEG/L2")) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            case -1482641357:
                if (!str12.equals("A_MPEG/L3")) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -1373388978:
                if (!str12.equals("V_MS/VFW/FOURCC")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case -933872740:
                if (!str12.equals("S_DVBSUB")) {
                    b10 = -1;
                } else {
                    b10 = 33;
                }
                break;
            case -538363189:
                if (!str12.equals("V_MPEG4/ISO/ASP")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -538363109:
                if (!str12.equals("V_MPEG4/ISO/AVC")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case -425012669:
                if (!str12.equals("S_VOBSUB")) {
                    b10 = -1;
                } else {
                    b10 = 31;
                }
                break;
            case -356037306:
                if (!str12.equals(FuoITeVPeXAj.wnAEzi)) {
                    b10 = -1;
                } else {
                    b10 = 21;
                }
                break;
            case 62923557:
                if (!str12.equals("A_AAC")) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case 62923603:
                if (!str12.equals("A_AC3")) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            case 62927045:
                if (!str12.equals("A_DTS")) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case 82318131:
                if (!str12.equals("V_AV1")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 82338133:
                if (!str12.equals("V_VP8")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 82338134:
                if (!str12.equals("V_VP9")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 99146302:
                if (!str12.equals("S_HDMV/PGS")) {
                    b10 = -1;
                } else {
                    b10 = 32;
                }
                break;
            case 444813526:
                if (!str12.equals("V_THEORA")) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case 542569478:
                if (!str12.equals("A_DTS/EXPRESS")) {
                    b10 = -1;
                } else {
                    b10 = 20;
                }
                break;
            case 635596514:
                if (!str12.equals("A_PCM/FLOAT/IEEE")) {
                    b10 = -1;
                } else {
                    b10 = 26;
                }
                break;
            case 725948237:
                if (!str12.equals("A_PCM/INT/BIG")) {
                    b10 = -1;
                } else {
                    b10 = 25;
                }
                break;
            case 725957860:
                if (!str12.equals("A_PCM/INT/LIT")) {
                    b10 = -1;
                } else {
                    b10 = 24;
                }
                break;
            case 738597099:
                if (!str12.equals("S_TEXT/ASS")) {
                    b10 = -1;
                } else {
                    b10 = 28;
                }
                break;
            case 738614379:
                if (!str12.equals("S_TEXT/SSA")) {
                    b10 = -1;
                } else {
                    b10 = 29;
                }
                break;
            case 855502857:
                if (!str12.equals("V_MPEGH/ISO/HEVC")) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case 1045209816:
                if (!str12.equals("S_TEXT/WEBVTT")) {
                    b10 = -1;
                } else {
                    b10 = 30;
                }
                break;
            case 1422270023:
                if (!str12.equals("S_TEXT/UTF8")) {
                    b10 = -1;
                } else {
                    b10 = 27;
                }
                break;
            case 1809237540:
                if (!str12.equals("V_MPEG2")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case 1950749482:
                if (!str12.equals("A_EAC3")) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 1950789798:
                if (!str12.equals("A_FLAC")) {
                    b10 = -1;
                } else {
                    b10 = 22;
                }
                break;
            case 1951062397:
                if (!str12.equals("A_OPUS")) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        Object obj2 = null;
        switch (b10) {
            case 0:
                str = MimeTypes.VIDEO_VP8;
                str3 = str;
                iZzB = -1;
                i13 = -1;
                obj2 = null;
                obj2 = null;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null || (zzfuVarZza = zzfu.zza(new zzet(this.zzN))) == null) {
                    str8 = str3;
                    obj = obj2;
                } else {
                    str8 = "video/dolby-vision";
                    obj = zzfuVarZza.zza;
                }
                boolean z10 = this.zzW;
                ?? r23 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i28 = (z10 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20 || (i25 = this.zzq) == i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = (this.zzn * i21) / (this.zzm * i25);
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20 && this.zzA == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20 && (i16 = this.zzo) == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else if (this.zzM == -1.0f) {
                        bArr = null;
                        i23 = 0;
                    } else {
                        bArr = new byte[25];
                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                        i23 = 0;
                        byteBufferOrder.put((byte) 0);
                        byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                        byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                        byteBufferOrder.putShort((short) this.zzB);
                        byteBufferOrder.putShort((short) this.zzC);
                    }
                    zzh zzhVar = new zzh();
                    zzhVar.zza(i15);
                    zzhVar.zzb(i11);
                    zzhVar.zzc(i14);
                    zzhVar.zzd(bArr);
                    zzhVar.zze(i16);
                    zzhVar.zzf(i22);
                    zzi zziVarZzg = zzhVar.zzg();
                    str9 = this.zzb;
                    if (str9 == null && zzakh.zzg.containsKey(str9)) {
                        iIntValue = ((Integer) zzakh.zzg.get(this.zzb)).intValue();
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0 || Float.compare(this.zzt, 0.0f) != 0 || Float.compare(this.zzu, 0.0f) != 0) {
                        i24 = iIntValue;
                    } else if (Float.compare(this.zzv, 0.0f) == 0) {
                        i24 = i23;
                    } else if (Float.compare(this.zzv, 90.0f) == 0) {
                        i24 = 90;
                    } else {
                        i24 = 180;
                        if (Float.compare(this.zzv, -180.0f) != 0 && Float.compare(this.zzv, 180.0f) != 0) {
                            if (Float.compare(this.zzv, -90.0f) == 0) {
                                i24 = 270;
                            } else {
                                i24 = iIntValue;
                            }
                        }
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8) && !MimeTypes.TEXT_SSA.equals(str8) && !MimeTypes.TEXT_VTT.equals(str8) && !MimeTypes.APPLICATION_VOBSUB.equals(str8) && !MimeTypes.APPLICATION_PGS.equals(str8) && !MimeTypes.APPLICATION_DVBSUBS.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null && !zzakh.zzg.containsKey(str10)) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i28);
                zztVar.zzr(r23);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 1:
                byte[] bArr2 = this.zzk;
                objZzj = bArr2 == null ? null : zzgwm.zzj(bArr2);
                str2 = MimeTypes.VIDEO_VP9;
                obj2 = objZzj;
                str3 = str2;
                iZzB = -1;
                i13 = -1;
                obj2 = null;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z11 = this.zzW;
                ?? r24 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i29 = (z11 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar2 = new zzh();
                    zzhVar2.zza(i15);
                    zzhVar2.zzb(i11);
                    zzhVar2.zzc(i14);
                    zzhVar2.zzd(bArr);
                    zzhVar2.zze(i16);
                    zzhVar2.zzf(i22);
                    zzi zziVarZzg2 = zzhVar2.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg2);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i29);
                zztVar.zzr(r24);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 2:
                byte[] bArr3 = this.zzk;
                if (bArr3 != null) {
                    zzafc zzafcVarZza = zzafc.zza(bArr3);
                    obj2 = zzafcVarZza.zza;
                    int i30 = zzafcVarZza.zzc;
                    int i31 = zzafcVarZza.zze;
                    str3 = "video/av01";
                    i11 = zzafcVarZza.zzd;
                    obj2 = null;
                    i12 = -1;
                    i13 = zzafcVarZza.zzb;
                    i14 = i31;
                    i15 = i30;
                    iZzB = -1;
                    i16 = i13;
                } else {
                    str3 = "video/av01";
                    iZzB = -1;
                    i13 = -1;
                    obj2 = null;
                    obj2 = null;
                    i16 = -1;
                    i11 = -1;
                    i15 = -1;
                    i14 = -1;
                    i12 = -1;
                }
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z12 = this.zzW;
                ?? r25 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i210 = (z12 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar3 = new zzh();
                    zzhVar3.zza(i15);
                    zzhVar3.zzb(i11);
                    zzhVar3.zzc(i14);
                    zzhVar3.zzd(bArr);
                    zzhVar3.zze(i16);
                    zzhVar3.zzf(i22);
                    zzi zziVarZzg3 = zzhVar3.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg3);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i210);
                zztVar.zzr(r25);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 3:
                str = MimeTypes.VIDEO_MPEG2;
                str3 = str;
                iZzB = -1;
                i13 = -1;
                obj2 = null;
                obj2 = null;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z13 = this.zzW;
                ?? r26 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i211 = (z13 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar4 = new zzh();
                    zzhVar4.zza(i15);
                    zzhVar4.zzb(i11);
                    zzhVar4.zzc(i14);
                    zzhVar4.zzd(bArr);
                    zzhVar4.zze(i16);
                    zzhVar4.zzf(i22);
                    zzi zziVarZzg4 = zzhVar4.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg4);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i211);
                zztVar.zzr(r26);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr4 = this.zzk;
                objZzj = bArr4 == null ? null : Collections.singletonList(bArr4);
                str2 = MimeTypes.VIDEO_MP4V;
                obj2 = objZzj;
                str3 = str2;
                iZzB = -1;
                i13 = -1;
                obj2 = null;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z14 = this.zzW;
                ?? r27 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i212 = (z14 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar5 = new zzh();
                    zzhVar5.zza(i15);
                    zzhVar5.zzb(i11);
                    zzhVar5.zzc(i14);
                    zzhVar5.zzd(bArr);
                    zzhVar5.zze(i16);
                    zzhVar5.zzf(i22);
                    zzi zziVarZzg5 = zzhVar5.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg5);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i212);
                zztVar.zzr(r27);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 7:
                zzafd zzafdVarZza = zzafd.zza(new zzet(zzi(this.zzc)));
                list = zzafdVarZza.zza;
                this.zzZ = zzafdVarZza.zzb;
                String str13 = zzafdVarZza.zzl;
                int i32 = zzafdVarZza.zzg;
                int i33 = zzafdVarZza.zzi;
                int i34 = zzafdVarZza.zzh;
                int i35 = zzafdVarZza.zze;
                i17 = zzafdVarZza.zzf;
                i11 = i34;
                str3 = MimeTypes.VIDEO_H264;
                i12 = -1;
                i14 = i33;
                i15 = i32;
                i16 = i35;
                obj2 = str13;
                obj2 = list;
                i13 = i17;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z15 = this.zzW;
                ?? r28 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i213 = (z15 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar6 = new zzh();
                    zzhVar6.zza(i15);
                    zzhVar6.zzb(i11);
                    zzhVar6.zzc(i14);
                    zzhVar6.zzd(bArr);
                    zzhVar6.zze(i16);
                    zzhVar6.zzf(i22);
                    zzi zziVarZzg6 = zzhVar6.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg6);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i213);
                zztVar.zzr(r28);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 8:
                zzags zzagsVarZza = zzags.zza(new zzet(zzi(this.zzc)));
                list = zzagsVarZza.zza;
                this.zzZ = zzagsVarZza.zzb;
                obj2 = zzagsVarZza.zzn;
                int i36 = zzagsVarZza.zzh;
                int i37 = zzagsVarZza.zzj;
                int i38 = zzagsVarZza.zzi;
                int i39 = zzagsVarZza.zzf;
                i17 = zzagsVarZza.zzg;
                i11 = i38;
                str3 = MimeTypes.VIDEO_H265;
                i12 = -1;
                i14 = i37;
                i15 = i36;
                i16 = i39;
                obj2 = list;
                i13 = i17;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z16 = this.zzW;
                ?? r29 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i214 = (z16 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar7 = new zzh();
                    zzhVar7.zza(i15);
                    zzhVar7.zzb(i11);
                    zzhVar7.zzc(i14);
                    zzhVar7.zzd(bArr);
                    zzhVar7.zze(i16);
                    zzhVar7.zzf(i22);
                    zzi zziVarZzg7 = zzhVar7.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg7);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i214);
                zztVar.zzr(r29);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 9:
                Pair pairZzf = zzf(new zzet(zzi(this.zzc)));
                str4 = (String) pairZzf.first;
                listZzg = (List) pairZzf.second;
                str3 = str4;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                obj2 = listZzg;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z17 = this.zzW;
                ?? r210 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i215 = (z17 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar8 = new zzh();
                    zzhVar8.zza(i15);
                    zzhVar8.zzb(i11);
                    zzhVar8.zzc(i14);
                    zzhVar8.zzd(bArr);
                    zzhVar8.zze(i16);
                    zzhVar8.zzf(i22);
                    zzi zziVarZzg8 = zzhVar8.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg8);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i215);
                zztVar.zzr(r210);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 10:
                str5 = MimeTypes.VIDEO_UNKNOWN;
                obj2 = null;
                str3 = str5;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z18 = this.zzW;
                ?? r211 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i216 = (z18 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar9 = new zzh();
                    zzhVar9.zza(i15);
                    zzhVar9.zzb(i11);
                    zzhVar9.zzc(i14);
                    zzhVar9.zzd(bArr);
                    zzhVar9.zze(i16);
                    zzhVar9.zzf(i22);
                    zzi zziVarZzg9 = zzhVar9.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg9);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i216);
                zztVar.zzr(r211);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 11:
                listZzg = zzg(zzi(str12));
                i18 = 8192;
                str6 = MimeTypes.AUDIO_VORBIS;
                obj2 = null;
                i12 = i18;
                str3 = str6;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                obj2 = listZzg;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z19 = this.zzW;
                ?? r212 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i217 = (z19 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar10 = new zzh();
                    zzhVar10.zza(i15);
                    zzhVar10.zzb(i11);
                    zzhVar10.zzc(i14);
                    zzhVar10.zzd(bArr);
                    zzhVar10.zze(i16);
                    zzhVar10.zzf(i22);
                    zzi zziVarZzg10 = zzhVar10.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg10);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i217);
                zztVar.zzr(r212);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 12:
                listZzg = new ArrayList(3);
                listZzg.add(zzi(this.zzc));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                listZzg.add(byteBufferAllocate.order(byteOrder).putLong(this.zzR).array());
                listZzg.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzS).array());
                i18 = 5760;
                str6 = MimeTypes.AUDIO_OPUS;
                obj2 = null;
                i12 = i18;
                str3 = str6;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                obj2 = listZzg;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z110 = this.zzW;
                ?? r213 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i218 = (z110 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar11 = new zzh();
                    zzhVar11.zza(i15);
                    zzhVar11.zzb(i11);
                    zzhVar11.zzc(i14);
                    zzhVar11.zzd(bArr);
                    zzhVar11.zze(i16);
                    zzhVar11.zzf(i22);
                    zzi zziVarZzg11 = zzhVar11.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg11);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i218);
                zztVar.zzr(r213);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 13:
                List listSingletonList = Collections.singletonList(zzi(str12));
                zzaev zzaevVarZza = zzaew.zza(this.zzk);
                this.zzQ = zzaevVarZza.zza;
                this.zzO = zzaevVarZza.zzb;
                String str14 = zzaevVarZza.zzc;
                str5 = MimeTypes.AUDIO_AAC;
                obj2 = listSingletonList;
                obj2 = str14;
                str3 = str5;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z111 = this.zzW;
                ?? r214 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i219 = (z111 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar12 = new zzh();
                    zzhVar12.zza(i15);
                    zzhVar12.zzb(i11);
                    zzhVar12.zzc(i14);
                    zzhVar12.zzd(bArr);
                    zzhVar12.zze(i16);
                    zzhVar12.zzf(i22);
                    zzi zziVarZzg12 = zzhVar12.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg12);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i219);
                zztVar.zzr(r214);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 14:
                str7 = MimeTypes.AUDIO_MPEG_L2;
                obj2 = null;
                str3 = str7;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = 4096;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z112 = this.zzW;
                ?? r215 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2110 = (z112 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar13 = new zzh();
                    zzhVar13.zza(i15);
                    zzhVar13.zzb(i11);
                    zzhVar13.zzc(i14);
                    zzhVar13.zzd(bArr);
                    zzhVar13.zze(i16);
                    zzhVar13.zzf(i22);
                    zzi zziVarZzg13 = zzhVar13.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg13);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2110);
                zztVar.zzr(r215);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 15:
                str7 = MimeTypes.AUDIO_MPEG;
                obj2 = null;
                str3 = str7;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = 4096;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z113 = this.zzW;
                ?? r216 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2111 = (z113 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar14 = new zzh();
                    zzhVar14.zza(i15);
                    zzhVar14.zzb(i11);
                    zzhVar14.zzc(i14);
                    zzhVar14.zzd(bArr);
                    zzhVar14.zze(i16);
                    zzhVar14.zzf(i22);
                    zzi zziVarZzg14 = zzhVar14.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg14);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2111);
                zztVar.zzr(r216);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 16:
                str5 = MimeTypes.AUDIO_AC3;
                obj2 = null;
                str3 = str5;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z114 = this.zzW;
                ?? r217 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2112 = (z114 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar15 = new zzh();
                    zzhVar15.zza(i15);
                    zzhVar15.zzb(i11);
                    zzhVar15.zzc(i14);
                    zzhVar15.zzd(bArr);
                    zzhVar15.zze(i16);
                    zzhVar15.zzf(i22);
                    zzi zziVarZzg15 = zzhVar15.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg15);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2112);
                zztVar.zzr(r217);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 17:
                str5 = MimeTypes.AUDIO_E_AC3;
                obj2 = null;
                str3 = str5;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z115 = this.zzW;
                ?? r218 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2113 = (z115 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar16 = new zzh();
                    zzhVar16.zza(i15);
                    zzhVar16.zzb(i11);
                    zzhVar16.zzc(i14);
                    zzhVar16.zzd(bArr);
                    zzhVar16.zze(i16);
                    zzhVar16.zzf(i22);
                    zzi zziVarZzg16 = zzhVar16.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg16);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2113);
                zztVar.zzr(r218);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 18:
                this.zzT = new zzahl();
                str5 = MimeTypes.AUDIO_TRUEHD;
                obj2 = null;
                str3 = str5;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z116 = this.zzW;
                ?? r219 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2114 = (z116 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar17 = new zzh();
                    zzhVar17.zza(i15);
                    zzhVar17.zzb(i11);
                    zzhVar17.zzc(i14);
                    zzhVar17.zzd(bArr);
                    zzhVar17.zze(i16);
                    zzhVar17.zzf(i22);
                    zzi zziVarZzg17 = zzhVar17.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg17);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2114);
                zztVar.zzr(r219);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 19:
            case 20:
                this.zzU = true;
                str5 = MimeTypes.AUDIO_DTS;
                obj2 = null;
                str3 = str5;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z117 = this.zzW;
                ?? r2110 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2115 = (z117 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar18 = new zzh();
                    zzhVar18.zza(i15);
                    zzhVar18.zzb(i11);
                    zzhVar18.zzc(i14);
                    zzhVar18.zzd(bArr);
                    zzhVar18.zze(i16);
                    zzhVar18.zzf(i22);
                    zzi zziVarZzg18 = zzhVar18.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg18);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2115);
                zztVar.zzr(r2110);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 21:
                str5 = MimeTypes.AUDIO_DTS_HD;
                obj2 = null;
                str3 = str5;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z118 = this.zzW;
                ?? r2111 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2116 = (z118 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar19 = new zzh();
                    zzhVar19.zza(i15);
                    zzhVar19.zzb(i11);
                    zzhVar19.zzc(i14);
                    zzhVar19.zzd(bArr);
                    zzhVar19.zze(i16);
                    zzhVar19.zzf(i22);
                    zzi zziVarZzg19 = zzhVar19.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg19);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2116);
                zztVar.zzr(r2111);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 22:
                listZzg = Collections.singletonList(zzi(str12));
                str4 = MimeTypes.AUDIO_FLAC;
                str3 = str4;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                obj2 = listZzg;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z119 = this.zzW;
                ?? r2112 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2117 = (z119 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar110 = new zzh();
                    zzhVar110.zza(i15);
                    zzhVar110.zzb(i11);
                    zzhVar110.zzc(i14);
                    zzhVar110.zzd(bArr);
                    zzhVar110.zze(i16);
                    zzhVar110.zzf(i22);
                    zzi zziVarZzg110 = zzhVar110.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg110);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2117);
                zztVar.zzr(r2112);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 23:
                if (zzh(new zzet(zzi(this.zzc)))) {
                    iZzB = zzfl.zzB(this.zzP, ByteOrder.LITTLE_ENDIAN);
                    if (iZzB == 0) {
                        int i40 = this.zzP;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i40).length() + 64);
                        sb2.append("Unsupported PCM bit depth: ");
                        sb2.append(i40);
                        sb2.append(". Setting mimeType to audio/x-unknown");
                        zzeg.zzc("MatroskaExtractor", sb2.toString());
                    } else {
                        obj2 = null;
                        str3 = MimeTypes.AUDIO_RAW;
                    }
                    i13 = -1;
                    i16 = -1;
                    i11 = -1;
                    i15 = -1;
                    i14 = -1;
                    i12 = -1;
                    if (this.zzN != null) {
                        break;
                    }
                    str8 = str3;
                    obj = obj2;
                    boolean z1110 = this.zzW;
                    ?? r2113 = obj2;
                    if (true != this.zzV) {
                        i19 = 0;
                    } else {
                        i19 = 2;
                    }
                    int i2118 = (z1110 ? 1 : 0) | i19;
                    zztVar = new zzt();
                    if (zzas.zza(str8)) {
                        zztVar.zzG(this.zzO);
                        zztVar.zzH(this.zzQ);
                        zztVar.zzI(iZzB);
                    } else if (zzas.zzb(str8)) {
                        if (this.zzr == 0) {
                            i26 = this.zzp;
                            i20 = -1;
                            if (i26 == -1) {
                                i26 = this.zzm;
                            }
                            this.zzp = i26;
                            i27 = this.zzq;
                            if (i27 == -1) {
                                i27 = this.zzn;
                            }
                            this.zzq = i27;
                        } else {
                            i20 = -1;
                        }
                        i21 = this.zzp;
                        if (i21 != i20) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (i15 == i20) {
                            if (i14 != i20) {
                                i15 = i20;
                            } else if (i11 == i20) {
                                i15 = this.zzy;
                                i14 = this.zzz;
                                i11 = this.zzA;
                            } else {
                                i15 = this.zzy;
                                i14 = this.zzz;
                                i11 = this.zzA;
                            }
                        }
                        if (i16 == i20) {
                            i16 = 8;
                        }
                        if (i13 == i20) {
                            i22 = this.zzo;
                            if (i22 == i20) {
                                i22 = 8;
                            }
                        } else {
                            i22 = i13;
                        }
                        if (this.zzD != -1.0f) {
                            i23 = 0;
                            bArr = null;
                        } else {
                            i23 = 0;
                            bArr = null;
                        }
                        zzh zzhVar111 = new zzh();
                        zzhVar111.zza(i15);
                        zzhVar111.zzb(i11);
                        zzhVar111.zzc(i14);
                        zzhVar111.zzd(bArr);
                        zzhVar111.zze(i16);
                        zzhVar111.zzf(i22);
                        zzi zziVarZzg111 = zzhVar111.zzg();
                        str9 = this.zzb;
                        if (str9 == null) {
                            iIntValue = i20;
                        } else {
                            iIntValue = i20;
                        }
                        if (this.zzs == 0) {
                            i24 = iIntValue;
                        } else {
                            i24 = iIntValue;
                        }
                        zztVar.zzv(this.zzm);
                        zztVar.zzw(this.zzn);
                        zztVar.zzB(f10);
                        zztVar.zzA(i24);
                        zztVar.zzC(this.zzw);
                        zztVar.zzD(this.zzx);
                        zztVar.zzE(zziVarZzg111);
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                        throw zzat.zzb("Unexpected MIME type.", null);
                    }
                    str10 = this.zzb;
                    if (str10 != null) {
                        zztVar.zzc(this.zzb);
                    }
                    zztVar.zzb(i10);
                    if (true != this.zza) {
                        str11 = "video/x-matroska";
                    } else {
                        str11 = MimeTypes.VIDEO_WEBM;
                    }
                    zztVar.zzn(str11);
                    zztVar.zzo(str8);
                    zztVar.zzp(i12);
                    zztVar.zze(this.zzab);
                    zztVar.zzf(i2118);
                    zztVar.zzr(r2113);
                    zztVar.zzk(obj);
                    zztVar.zzs(this.zzl);
                    this.zzY = zztVar.zzO();
                    return;
                }
                zzeg.zzc("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                obj2 = null;
                str3 = MimeTypes.AUDIO_UNKNOWN;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1111 = this.zzW;
                ?? r2114 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i2119 = (z1111 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar112 = new zzh();
                    zzhVar112.zza(i15);
                    zzhVar112.zzb(i11);
                    zzhVar112.zzc(i14);
                    zzhVar112.zzd(bArr);
                    zzhVar112.zze(i16);
                    zzhVar112.zzf(i22);
                    zzi zziVarZzg112 = zzhVar112.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg112);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i2119);
                zztVar.zzr(r2114);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 24:
                iZzB = zzfl.zzB(this.zzP, ByteOrder.LITTLE_ENDIAN);
                if (iZzB == 0) {
                    int i41 = this.zzP;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i41).length() + 78);
                    sb3.append("Unsupported little endian PCM bit depth: ");
                    sb3.append(i41);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    zzeg.zzc("MatroskaExtractor", sb3.toString());
                    obj2 = null;
                    str3 = MimeTypes.AUDIO_UNKNOWN;
                    iZzB = -1;
                } else {
                    obj2 = null;
                    str3 = MimeTypes.AUDIO_RAW;
                }
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1112 = this.zzW;
                ?? r2115 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21110 = (z1112 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar113 = new zzh();
                    zzhVar113.zza(i15);
                    zzhVar113.zzb(i11);
                    zzhVar113.zzc(i14);
                    zzhVar113.zzd(bArr);
                    zzhVar113.zze(i16);
                    zzhVar113.zzf(i22);
                    zzi zziVarZzg113 = zzhVar113.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg113);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21110);
                zztVar.zzr(r2115);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 25:
                iZzB = zzfl.zzB(this.zzP, ByteOrder.BIG_ENDIAN);
                if (iZzB == 0) {
                    int i42 = this.zzP;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i42).length() + 75);
                    sb4.append("Unsupported big endian PCM bit depth: ");
                    sb4.append(i42);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    zzeg.zzc("MatroskaExtractor", sb4.toString());
                    obj2 = null;
                    str3 = MimeTypes.AUDIO_UNKNOWN;
                    iZzB = -1;
                } else {
                    obj2 = null;
                    str3 = MimeTypes.AUDIO_RAW;
                }
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1113 = this.zzW;
                ?? r2116 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21111 = (z1113 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar114 = new zzh();
                    zzhVar114.zza(i15);
                    zzhVar114.zzb(i11);
                    zzhVar114.zzc(i14);
                    zzhVar114.zzd(bArr);
                    zzhVar114.zze(i16);
                    zzhVar114.zzf(i22);
                    zzi zziVarZzg114 = zzhVar114.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg114);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21111);
                zztVar.zzr(r2116);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 26:
                iZzB = zzfl.zzC(this.zzP);
                if (iZzB == 0) {
                    int i43 = this.zzP;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i43).length() + 79);
                    sb5.append("Unsupported floating point PCM bit depth: ");
                    sb5.append(i43);
                    sb5.append(". Setting mimeType to audio/x-unknown");
                    zzeg.zzc("MatroskaExtractor", sb5.toString());
                    obj2 = null;
                    str3 = MimeTypes.AUDIO_UNKNOWN;
                    iZzB = -1;
                } else {
                    obj2 = null;
                    str3 = MimeTypes.AUDIO_RAW;
                }
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1114 = this.zzW;
                ?? r2117 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21112 = (z1114 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar115 = new zzh();
                    zzhVar115.zza(i15);
                    zzhVar115.zzb(i11);
                    zzhVar115.zzc(i14);
                    zzhVar115.zzd(bArr);
                    zzhVar115.zze(i16);
                    zzhVar115.zzf(i22);
                    zzi zziVarZzg115 = zzhVar115.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg115);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21112);
                zztVar.zzr(r2117);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 27:
                obj2 = null;
                str3 = MimeTypes.APPLICATION_SUBRIP;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1115 = this.zzW;
                ?? r2118 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21113 = (z1115 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar116 = new zzh();
                    zzhVar116.zza(i15);
                    zzhVar116.zzb(i11);
                    zzhVar116.zzc(i14);
                    zzhVar116.zzd(bArr);
                    zzhVar116.zze(i16);
                    zzhVar116.zzf(i22);
                    zzi zziVarZzg116 = zzhVar116.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg116);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21113);
                zztVar.zzr(r2118);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 28:
            case 29:
                int i44 = zzakh.zza;
                listZzg = zzgwm.zzk(zzakh.zzc, zzi(this.zzc));
                str3 = MimeTypes.TEXT_SSA;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                obj2 = listZzg;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1116 = this.zzW;
                ?? r2119 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21114 = (z1116 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar117 = new zzh();
                    zzhVar117.zza(i15);
                    zzhVar117.zzb(i11);
                    zzhVar117.zzc(i14);
                    zzhVar117.zzd(bArr);
                    zzhVar117.zze(i16);
                    zzhVar117.zzf(i22);
                    zzi zziVarZzg117 = zzhVar117.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg117);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21114);
                zztVar.zzr(r2119);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 30:
                obj2 = null;
                str3 = MimeTypes.TEXT_VTT;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1117 = this.zzW;
                ?? r21110 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21115 = (z1117 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar118 = new zzh();
                    zzhVar118.zza(i15);
                    zzhVar118.zzb(i11);
                    zzhVar118.zzc(i14);
                    zzhVar118.zzd(bArr);
                    zzhVar118.zze(i16);
                    zzhVar118.zzf(i22);
                    zzi zziVarZzg118 = zzhVar118.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg118);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21115);
                zztVar.zzr(r21110);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 31:
                listZzg = zzgwm.zzj(zzi(str12));
                str3 = MimeTypes.APPLICATION_VOBSUB;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                obj2 = listZzg;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1118 = this.zzW;
                ?? r21111 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21116 = (z1118 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar119 = new zzh();
                    zzhVar119.zza(i15);
                    zzhVar119.zzb(i11);
                    zzhVar119.zzc(i14);
                    zzhVar119.zzd(bArr);
                    zzhVar119.zze(i16);
                    zzhVar119.zzf(i22);
                    zzi zziVarZzg119 = zzhVar119.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg119);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21116);
                zztVar.zzr(r21111);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 32:
                str3 = MimeTypes.APPLICATION_PGS;
                obj2 = null;
                iZzB = -1;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z1119 = this.zzW;
                ?? r21112 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21117 = (z1119 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1110 = new zzh();
                    zzhVar1110.zza(i15);
                    zzhVar1110.zzb(i11);
                    zzhVar1110.zzc(i14);
                    zzhVar1110.zzd(bArr);
                    zzhVar1110.zze(i16);
                    zzhVar1110.zzf(i22);
                    zzi zziVarZzg1110 = zzhVar1110.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg1110);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21117);
                zztVar.zzr(r21112);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            case 33:
                byte[] bArr5 = new byte[4];
                System.arraycopy(zzi(str12), 0, bArr5, 0, 4);
                listZzg = zzgwm.zzj(bArr5);
                str3 = MimeTypes.APPLICATION_DVBSUBS;
                i13 = -1;
                i16 = -1;
                i11 = -1;
                i15 = -1;
                i14 = -1;
                i12 = -1;
                obj2 = listZzg;
                iZzB = -1;
                if (this.zzN != null) {
                    break;
                }
                str8 = str3;
                obj = obj2;
                boolean z11110 = this.zzW;
                ?? r21113 = obj2;
                if (true != this.zzV) {
                    i19 = 0;
                } else {
                    i19 = 2;
                }
                int i21118 = (z11110 ? 1 : 0) | i19;
                zztVar = new zzt();
                if (zzas.zza(str8)) {
                    zztVar.zzG(this.zzO);
                    zztVar.zzH(this.zzQ);
                    zztVar.zzI(iZzB);
                } else if (zzas.zzb(str8)) {
                    if (this.zzr == 0) {
                        i26 = this.zzp;
                        i20 = -1;
                        if (i26 == -1) {
                            i26 = this.zzm;
                        }
                        this.zzp = i26;
                        i27 = this.zzq;
                        if (i27 == -1) {
                            i27 = this.zzn;
                        }
                        this.zzq = i27;
                    } else {
                        i20 = -1;
                    }
                    i21 = this.zzp;
                    if (i21 != i20) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i15 == i20) {
                        if (i14 != i20) {
                            i15 = i20;
                        } else if (i11 == i20) {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        } else {
                            i15 = this.zzy;
                            i14 = this.zzz;
                            i11 = this.zzA;
                        }
                    }
                    if (i16 == i20) {
                        i16 = 8;
                    }
                    if (i13 == i20) {
                        i22 = this.zzo;
                        if (i22 == i20) {
                            i22 = 8;
                        }
                    } else {
                        i22 = i13;
                    }
                    if (this.zzD != -1.0f) {
                        i23 = 0;
                        bArr = null;
                    } else {
                        i23 = 0;
                        bArr = null;
                    }
                    zzh zzhVar1111 = new zzh();
                    zzhVar1111.zza(i15);
                    zzhVar1111.zzb(i11);
                    zzhVar1111.zzc(i14);
                    zzhVar1111.zzd(bArr);
                    zzhVar1111.zze(i16);
                    zzhVar1111.zzf(i22);
                    zzi zziVarZzg1111 = zzhVar1111.zzg();
                    str9 = this.zzb;
                    if (str9 == null) {
                        iIntValue = i20;
                    } else {
                        iIntValue = i20;
                    }
                    if (this.zzs == 0) {
                        i24 = iIntValue;
                    } else {
                        i24 = iIntValue;
                    }
                    zztVar.zzv(this.zzm);
                    zztVar.zzw(this.zzn);
                    zztVar.zzB(f10);
                    zztVar.zzA(i24);
                    zztVar.zzC(this.zzw);
                    zztVar.zzD(this.zzx);
                    zztVar.zzE(zziVarZzg1111);
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str8)) {
                    throw zzat.zzb("Unexpected MIME type.", null);
                }
                str10 = this.zzb;
                if (str10 != null) {
                    zztVar.zzc(this.zzb);
                }
                zztVar.zzb(i10);
                if (true != this.zza) {
                    str11 = "video/x-matroska";
                } else {
                    str11 = MimeTypes.VIDEO_WEBM;
                }
                zztVar.zzn(str11);
                zztVar.zzo(str8);
                zztVar.zzp(i12);
                zztVar.zze(this.zzab);
                zztVar.zzf(i21118);
                zztVar.zzr(r21113);
                zztVar.zzk(obj);
                zztVar.zzs(this.zzl);
                this.zzY = zztVar.zzO();
                return;
            default:
                throw zzat.zzb("Unrecognized codec identifier.", null);
        }
    }
}
