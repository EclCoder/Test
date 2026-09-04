package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdq {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static zzgwm zza(byte b10, byte b11, byte b12, byte b13) {
        return zzgwm.zzj(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    public static String zzb(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String zzc(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        int i14;
        Object[] objArr = {zzc[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(true != z10 ? 'L' : 'H'), Integer.valueOf(i13)};
        String str = zzfl.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i15 = 6;
        while (true) {
            if (i15 <= 0) {
                break;
            }
            int i16 = i15 - 1;
            if (iArr[i16] != 0) {
                break;
            }
            i15 = i16;
        }
        for (i14 = 0; i14 < i15; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzgtj.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b10 = bArr[0];
        zzgtj.zzd(b10 == 1, "Invalid APV CSD version: %s", b10);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzfl.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    public static Pair zze(zzv zzvVar) {
        zzdp zzdpVarZzf = zzf(zzvVar);
        if (zzdpVarZzf == null || !zzdpVarZzf.zzc()) {
            return null;
        }
        return new Pair(Integer.valueOf(zzdpVarZzf.zza()), Integer.valueOf(zzdpVarZzf.zzb()));
    }

    public static zzdp zzg(String str, String[] strArr, zzi zziVar) {
        int i10;
        Integer numValueOf = null;
        if (strArr.length < 4) {
            zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i10 = 1;
        } else {
            if (!MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(strGroup)) {
                zzeg.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return zzdp.zza;
            }
            i10 = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    numValueOf = 2;
                }
                break;
            case 70914:
                if (str2.equals("H60")) {
                    numValueOf = 8;
                }
                break;
            case 70917:
                if (str2.equals(Lykgign.LcJWolNla)) {
                    numValueOf = 32;
                }
                break;
            case 71007:
                if (str2.equals("H90")) {
                    numValueOf = 128;
                }
                break;
            case 71010:
                if (str2.equals("H93")) {
                    numValueOf = 512;
                }
                break;
            case 74665:
                if (str2.equals("L30")) {
                    numValueOf = 1;
                }
                break;
            case 74758:
                if (str2.equals("L60")) {
                    numValueOf = 4;
                }
                break;
            case 74761:
                if (str2.equals("L63")) {
                    numValueOf = 16;
                }
                break;
            case 74851:
                if (str2.equals("L90")) {
                    numValueOf = 64;
                }
                break;
            case 74854:
                if (str2.equals("L93")) {
                    numValueOf = 256;
                }
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    numValueOf = 2048;
                }
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    numValueOf = 8192;
                }
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    numValueOf = 32768;
                }
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    numValueOf = 131072;
                }
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    numValueOf = 524288;
                }
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    numValueOf = 2097152;
                }
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    numValueOf = 8388608;
                }
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    numValueOf = Integer.valueOf(MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
                }
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    numValueOf = Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
                }
                break;
            case 2312806:
                if (str2.equals("L123")) {
                    numValueOf = 4096;
                }
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    numValueOf = 16384;
                }
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    numValueOf = Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                }
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    numValueOf = Integer.valueOf(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
                }
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    numValueOf = Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                }
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    numValueOf = 4194304;
                }
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    numValueOf = Integer.valueOf(C.DEFAULT_MUXED_BUFFER_SIZE);
                }
                break;
        }
        if (numValueOf != null) {
            return new zzdp(i10, numValueOf.intValue());
        }
        zzeg.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return zzdp.zza;
    }

    public static byte[] zzh(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    private static int zzi(int i10, int i11) {
        switch (i10) {
            case 30:
                if (i11 == 0) {
                    return 257;
                }
                if (i11 == 1) {
                    return 258;
                }
                if (i11 == 2) {
                    return 260;
                }
                if (i11 == 3) {
                    return 264;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb2.append("Unrecognized APV band: ");
                sb2.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb2.toString());
                return -1;
            case 33:
                if (i11 == 0) {
                    return 513;
                }
                if (i11 == 1) {
                    return 514;
                }
                if (i11 == 2) {
                    return 516;
                }
                if (i11 == 3) {
                    return 520;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb3.append("Unrecognized APV band: ");
                sb3.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb3.toString());
                return -1;
            case 60:
                if (i11 == 0) {
                    return 1025;
                }
                if (i11 == 1) {
                    return 1026;
                }
                if (i11 == 2) {
                    return 1028;
                }
                if (i11 == 3) {
                    return 1032;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb4.append("Unrecognized APV band: ");
                sb4.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb4.toString());
                return -1;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                if (i11 == 0) {
                    return 2049;
                }
                if (i11 == 1) {
                    return 2050;
                }
                if (i11 == 2) {
                    return 2052;
                }
                if (i11 == 3) {
                    return 2056;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb5.append("Unrecognized APV band: ");
                sb5.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb5.toString());
                return -1;
            case 90:
                if (i11 == 0) {
                    return 4097;
                }
                if (i11 == 1) {
                    return 4098;
                }
                if (i11 == 2) {
                    return 4100;
                }
                if (i11 == 3) {
                    return 4104;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb6.append("Unrecognized APV band: ");
                sb6.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb6.toString());
                return -1;
            case 93:
                if (i11 == 0) {
                    return 8193;
                }
                if (i11 == 1) {
                    return 8194;
                }
                if (i11 == 2) {
                    return 8196;
                }
                if (i11 == 3) {
                    return 8200;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb7.append("Unrecognized APV band: ");
                sb7.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb7.toString());
                return -1;
            case AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL /* 120 */:
                if (i11 == 0) {
                    return 16385;
                }
                if (i11 == 1) {
                    return 16386;
                }
                if (i11 == 2) {
                    return 16388;
                }
                if (i11 == 3) {
                    return 16392;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb8.append("Unrecognized APV band: ");
                sb8.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb8.toString());
                return -1;
            case INVALID_RI_ENDPOINT_VALUE:
                if (i11 == 0) {
                    return 32769;
                }
                if (i11 == 1) {
                    return 32770;
                }
                if (i11 == 2) {
                    return 32772;
                }
                if (i11 == 3) {
                    return 32776;
                }
                StringBuilder sb9 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb9.append("Unrecognized APV band: ");
                sb9.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb9.toString());
                return -1;
            case 150:
                if (i11 == 0) {
                    return 65537;
                }
                if (i11 == 1) {
                    return 65538;
                }
                if (i11 == 2) {
                    return 65540;
                }
                if (i11 == 3) {
                    return 65544;
                }
                StringBuilder sb10 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb10.append("Unrecognized APV band: ");
                sb10.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb10.toString());
                return -1;
            case 153:
                if (i11 == 0) {
                    return 131073;
                }
                if (i11 == 1) {
                    return 131074;
                }
                if (i11 == 2) {
                    return 131076;
                }
                if (i11 == 3) {
                    return 131080;
                }
                StringBuilder sb11 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb11.append("Unrecognized APV band: ");
                sb11.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb11.toString());
                return -1;
            case 180:
                if (i11 == 0) {
                    return 262145;
                }
                if (i11 == 1) {
                    return 262146;
                }
                if (i11 == 2) {
                    return 262148;
                }
                if (i11 == 3) {
                    return 262152;
                }
                StringBuilder sb12 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb12.append("Unrecognized APV band: ");
                sb12.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb12.toString());
                return -1;
            case 183:
                if (i11 == 0) {
                    return 524289;
                }
                if (i11 == 1) {
                    return 524290;
                }
                if (i11 == 2) {
                    return 524292;
                }
                if (i11 == 3) {
                    return 524296;
                }
                StringBuilder sb13 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb13.append("Unrecognized APV band: ");
                sb13.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb13.toString());
                return -1;
            case AD_NOT_LOADED_VALUE:
                if (i11 == 0) {
                    return 1048577;
                }
                if (i11 == 1) {
                    return 1048578;
                }
                if (i11 == 2) {
                    return 1048580;
                }
                if (i11 == 3) {
                    return 1048584;
                }
                StringBuilder sb14 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb14.append("Unrecognized APV band: ");
                sb14.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb14.toString());
                return -1;
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                if (i11 == 0) {
                    return 2097153;
                }
                if (i11 == 1) {
                    return 2097154;
                }
                if (i11 == 2) {
                    return 2097156;
                }
                if (i11 == 3) {
                    return 2097160;
                }
                StringBuilder sb15 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb15.append("Unrecognized APV band: ");
                sb15.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb15.toString());
                return -1;
            default:
                StringBuilder sb16 = new StringBuilder(String.valueOf(i10).length() + 30);
                sb16.append("Unrecognized APV level index: ");
                sb16.append(i10);
                zzeg.zzc("CodecSpecificDataUtil", sb16.toString());
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:113:0x0206  */
    /* JADX WARN: Code duplicated, block: B:117:0x021a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0223 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0225  */
    /* JADX WARN: Code duplicated, block: B:125:0x022d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0230  */
    /* JADX WARN: Code duplicated, block: B:128:0x0234  */
    /* JADX WARN: Code duplicated, block: B:132:0x0240  */
    /* JADX WARN: Code duplicated, block: B:134:0x0248  */
    /* JADX WARN: Code duplicated, block: B:135:0x0250  */
    /* JADX WARN: Code duplicated, block: B:137:0x0258  */
    /* JADX WARN: Code duplicated, block: B:138:0x0260  */
    /* JADX WARN: Code duplicated, block: B:140:0x0268  */
    /* JADX WARN: Code duplicated, block: B:141:0x0270  */
    /* JADX WARN: Code duplicated, block: B:143:0x0278  */
    /* JADX WARN: Code duplicated, block: B:144:0x0280  */
    /* JADX WARN: Code duplicated, block: B:146:0x0288  */
    /* JADX WARN: Code duplicated, block: B:147:0x0290  */
    /* JADX WARN: Code duplicated, block: B:149:0x0298  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:165:0x02df  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:174:0x0303  */
    /* JADX WARN: Code duplicated, block: B:176:0x030b  */
    /* JADX WARN: Code duplicated, block: B:177:0x030f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0317  */
    /* JADX WARN: Code duplicated, block: B:180:0x031a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0322  */
    /* JADX WARN: Code duplicated, block: B:183:0x0325  */
    /* JADX WARN: Code duplicated, block: B:185:0x032d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0334  */
    /* JADX WARN: Code duplicated, block: B:188:0x033c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0343  */
    /* JADX WARN: Code duplicated, block: B:191:0x034b  */
    /* JADX WARN: Code duplicated, block: B:192:0x034d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0355  */
    /* JADX WARN: Code duplicated, block: B:195:0x0357  */
    /* JADX WARN: Code duplicated, block: B:197:0x035f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0361  */
    /* JADX WARN: Code duplicated, block: B:200:0x0369  */
    /* JADX WARN: Code duplicated, block: B:201:0x036b  */
    /* JADX WARN: Code duplicated, block: B:203:0x036f  */
    /* JADX WARN: Code duplicated, block: B:205:0x037b  */
    /* JADX WARN: Code duplicated, block: B:207:0x0385  */
    /* JADX WARN: Code duplicated, block: B:413:0x0714  */
    /* JADX WARN: Code duplicated, block: B:433:0x0768  */
    /* JADX WARN: Code duplicated, block: B:435:0x0770  */
    /* JADX WARN: Code duplicated, block: B:439:0x0784 A[Catch: NumberFormatException -> 0x0886, TryCatch #0 {NumberFormatException -> 0x0886, blocks: (B:437:0x077c, B:439:0x0784, B:442:0x07a2, B:495:0x0869), top: B:621:0x077c }] */
    /* JADX WARN: Code duplicated, block: B:440:0x079e  */
    /* JADX WARN: Code duplicated, block: B:442:0x07a2 A[Catch: NumberFormatException -> 0x0886, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0886, blocks: (B:437:0x077c, B:439:0x0784, B:442:0x07a2, B:495:0x0869), top: B:621:0x077c }] */
    /* JADX WARN: Code duplicated, block: B:445:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:447:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:449:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:451:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:453:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:455:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:457:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:458:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:459:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:460:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:461:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:462:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:463:0x07db  */
    /* JADX WARN: Code duplicated, block: B:464:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:466:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:468:0x0802  */
    /* JADX WARN: Code duplicated, block: B:469:0x0805  */
    /* JADX WARN: Code duplicated, block: B:470:0x0808  */
    /* JADX WARN: Code duplicated, block: B:471:0x080b  */
    /* JADX WARN: Code duplicated, block: B:472:0x080e  */
    /* JADX WARN: Code duplicated, block: B:473:0x0811  */
    /* JADX WARN: Code duplicated, block: B:474:0x0813  */
    /* JADX WARN: Code duplicated, block: B:475:0x0816  */
    /* JADX WARN: Code duplicated, block: B:476:0x081a  */
    /* JADX WARN: Code duplicated, block: B:477:0x081d  */
    /* JADX WARN: Code duplicated, block: B:478:0x0820  */
    /* JADX WARN: Code duplicated, block: B:479:0x0823  */
    /* JADX WARN: Code duplicated, block: B:480:0x0826  */
    /* JADX WARN: Code duplicated, block: B:481:0x0829  */
    /* JADX WARN: Code duplicated, block: B:482:0x082c  */
    /* JADX WARN: Code duplicated, block: B:483:0x082f  */
    /* JADX WARN: Code duplicated, block: B:484:0x0832  */
    /* JADX WARN: Code duplicated, block: B:485:0x0835  */
    /* JADX WARN: Code duplicated, block: B:486:0x0838  */
    /* JADX WARN: Code duplicated, block: B:487:0x083a  */
    /* JADX WARN: Code duplicated, block: B:488:0x083d  */
    /* JADX WARN: Code duplicated, block: B:489:0x083f  */
    /* JADX WARN: Code duplicated, block: B:491:0x0842  */
    /* JADX WARN: Code duplicated, block: B:493:0x0863  */
    /* JADX WARN: Code duplicated, block: B:495:0x0869 A[Catch: NumberFormatException -> 0x0886, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0886, blocks: (B:437:0x077c, B:439:0x0784, B:442:0x07a2, B:495:0x0869), top: B:621:0x077c }] */
    /* JADX WARN: Code duplicated, block: B:588:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:621:0x077c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:? A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0629, code lost:
    
        if (r2.equals(com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.TYPE3) != true) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0650, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0668, code lost:
    
        if (r2.equals("ipcm") != true) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06a5, code lost:
    
        if (r2.equals("fLaC") != true) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x06df, code lost:
    
        if (r2.equals("Opus") != true) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0743, code lost:
    
        if (r5.equals(com.coremedia.iso.boxes.sampleentry.VisualSampleEntry.TYPE6) != false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x074c, code lost:
    
        if (r5.equals(com.coremedia.iso.boxes.sampleentry.VisualSampleEntry.TYPE7) != false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0756, code lost:
    
        return zzg(r30.zzk, r13, r30.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0166, code lost:
    
        if (r0.equals("09") != true) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
    
        if (r0.equals("08") != true) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        if (r0.equals("07") != true) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0184, code lost:
    
        if (r0.equals("06") != true) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018f, code lost:
    
        if (r0.equals("05") != true) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019a, code lost:
    
        if (r0.equals("04") != true) goto L657;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a5, code lost:
    
        if (r0.equals("03") != true) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b0, code lost:
    
        if (r0.equals("02") != true) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
    
        if (r0.equals("01") != true) goto L660;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v119 int, still in use, count: 1, list:
      (r1v119 int) from 0x0099: IF  (r1v119 int) != (1567 int)  -> B:17:0x009b A[HIDDEN] (LINE:155)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v119 int, still in use, count: 1, list:
      (r1v119 int) from 0x0099: IF  (r1v119 int) != (1567 int)  -> B:17:0x009b A[HIDDEN] (LINE:155)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzdp zzf(com.google.android.gms.internal.ads.zzv r30) {
        /*
            Method dump skipped, instruction units count: 3198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdq.zzf(com.google.android.gms.internal.ads.zzv):com.google.android.gms.internal.ads.zzdp");
    }
}
