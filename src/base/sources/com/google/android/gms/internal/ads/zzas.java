package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzas {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(zzj(str));
    }

    public static boolean zzb(String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(zzj(str));
    }

    public static boolean zzc(String str) {
        return "image".equals(zzj(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec A[RETURN] */
    public static boolean zzd(String str, String str2) {
        zzar zzarVarZzi;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    return true;
                }
                return false;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    return true;
                }
                return false;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    return true;
                }
                return false;
            case -1265048566:
                if (str.equals(MimeTypes.APPLICATION_CAMERA_MOTION)) {
                    return true;
                }
                return false;
            case -1248341703:
                if (str.equals(MimeTypes.APPLICATION_ID3)) {
                    return true;
                }
                return false;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    return true;
                }
                return false;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    return true;
                }
                return false;
            case -53558318:
                return (!str.equals(MimeTypes.AUDIO_AAC) || str2 == null || (zzarVarZzi = zzi(str2)) == null || (iZza = zzarVarZzi.zza()) == 0 || iZza == 16) ? false : true;
            case -43764892:
                if (str.equals("application/meta")) {
                    return true;
                }
                return false;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    return true;
                }
                return false;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    return true;
                }
                return false;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    return true;
                }
                return false;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    return true;
                }
                return false;
            case 1154383568:
                if (str.equals(MimeTypes.APPLICATION_EMSG)) {
                    return true;
                }
                return false;
            case 1331836563:
                if (str.equals("video/apv")) {
                    return true;
                }
                return false;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    return true;
                }
                return false;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    return true;
                }
                return false;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    return true;
                }
                return false;
            case 1652648887:
                if (str.equals(MimeTypes.APPLICATION_SCTE35)) {
                    return true;
                }
                return false;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    return true;
                }
                return false;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public static String zze(int i10) {
        if (i10 == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i10 == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i10 == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i10 == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i10 == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i10 == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i10 == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i10 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i10 == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0 A[RETURN] */
    public static int zzg(String str, String str2) {
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (!str.equals(MimeTypes.AUDIO_AAC) || str2 == null || (r3 = zzi(str2)) == null) {
                    return 0;
                }
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String strZza = zzgss.zza(str);
        switch (strZza.hashCode()) {
            case -1833600100:
                return strZza.equals("video/x-mvhevc") ? "video/mv-hevc" : strZza;
            case -1007807498:
                return strZza.equals("audio/x-flac") ? MimeTypes.AUDIO_FLAC : strZza;
            case -979095690:
                return strZza.equals("application/x-mpegurl") ? MimeTypes.APPLICATION_M3U8 : strZza;
            case -586683234:
                return strZza.equals("audio/x-wav") ? "audio/wav" : strZza;
            case -432836268:
                return strZza.equals("audio/mpeg-l1") ? MimeTypes.AUDIO_MPEG_L1 : strZza;
            case -432836267:
                return strZza.equals("audio/mpeg-l2") ? MimeTypes.AUDIO_MPEG_L2 : strZza;
            case 187090231:
                return strZza.equals("audio/mp3") ? MimeTypes.AUDIO_MPEG : strZza;
            default:
                return strZza;
        }
    }

    static zzar zzi(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzar(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String zzj(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (!zzb(str)) {
            if (!"text".equals(zzj(str)) && !"application/x-media3-cues".equals(str) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !HqKnbV.RehaNhfbctR.equals(str) && !MimeTypes.APPLICATION_RAWCC.equals(str) && !MimeTypes.APPLICATION_VOBSUB.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str) && !MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
                if (zzc(str)) {
                    return 4;
                }
                if (!MimeTypes.APPLICATION_ID3.equals(str) && !MimeTypes.APPLICATION_EMSG.equals(str) && !MimeTypes.APPLICATION_SCTE35.equals(str) && !"application/x-icy".equals(str) && !UoyZyZEcGYBpIg.yIPamIcHQvsmOm.equals(str) && !"application/meta".equals(str) && !"application/x-itut-t35".equals(str)) {
                    if (!MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
                        ArrayList arrayList = zzb;
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String str2 = ((zzaq) arrayList.get(i10)).zza;
                            if (str.equals(null)) {
                                return 0;
                            }
                        }
                        return -1;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 2;
    }
}
