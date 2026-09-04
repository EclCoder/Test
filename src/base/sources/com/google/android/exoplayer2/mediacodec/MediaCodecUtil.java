package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import c1.pGX.geAgcEazw;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.common.collect.c0;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.r0;
import ob.u;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaCodecUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f17226a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f17227b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17228c = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f17230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f17231c;

        public b(String str, boolean z10, boolean z11) {
            this.f17229a = str;
            this.f17230b = z10;
            this.f17231c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f17229a, bVar.f17229a) && this.f17230b == bVar.f17230b && this.f17231c == bVar.f17231c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f17229a.hashCode() + 31) * 31) + (this.f17230b ? 1231 : 1237)) * 31) + (this.f17231c ? 1231 : 1237);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface c {
        boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i10);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d implements c {
        private d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo getCodecInfoAt(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f17233b;

        public e(boolean z10, boolean z11) {
            this.f17232a = (z10 || z11) ? 1 : 0;
        }

        private void c() {
            if (this.f17233b == null) {
                this.f17233b = new MediaCodecList(this.f17232a).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public int getCodecCount() {
            c();
            return this.f17233b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo getCodecInfoAt(int i10) {
            c();
            return this.f17233b[i10];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.c
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface f {
        int a(Object obj);
    }

    private static Pair A(String str, String[] strArr) {
        if (strArr.length < 3) {
            u.i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iP = P(i10);
            if (iP == -1) {
                u.i("MediaCodecUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int iO = O(i11);
            if (iO != -1) {
                return new Pair(Integer.valueOf(iP), Integer.valueOf(iO));
            }
            u.i("MediaCodecUtil", "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Integer B(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return 8192;
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return 524288;
            case "H180":
                return 2097152;
            case "H183":
                return 8388608;
            case "H186":
                return Integer.valueOf(MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
            case "L120":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
            case "L156":
                return Integer.valueOf(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
            case "L180":
                return Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            case "L183":
                return 4194304;
            case "L186":
                return Integer.valueOf(C.DEFAULT_MUXED_BUFFER_SIZE);
            default:
                return null;
        }
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo) {
        return r0.f48425a >= 29 && D(mediaCodecInfo);
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = r0.f48425a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = r0.f48426b;
            if ("a70".equals(str3) || ("Xiaomi".equals(r0.f48427c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = r0.f48426b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = r0.f48426b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(r0.f48427c))) {
            String str6 = r0.f48426b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(r0.f48427c)) {
            String str7 = r0.f48426b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && r0.f48426b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        return r0.f48425a >= 29 ? G(mediaCodecInfo) : !H(mediaCodecInfo, str);
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean J(MediaCodecInfo mediaCodecInfo) {
        if (r0.f48425a >= 29) {
            return K(mediaCodecInfo);
        }
        String strE = sc.c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    private static boolean K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int L() {
        if (f17228c == -1) {
            int iMax = 0;
            k kVarS = s(MimeTypes.VIDEO_H264, false, false);
            if (kVarS != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = kVarS.h();
                int length = codecProfileLevelArrH.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(h(codecProfileLevelArrH[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, r0.f48425a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f17228c = iMax;
        }
        return f17228c;
    }

    private static int M(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static void N(List list, final f fVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.a(fVar, obj, obj2);
            }
        });
    }

    private static int O(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                return 4096;
            case DEPRECATED_API_USED_VALUE:
                return 8192;
            default:
                return -1;
        }
    }

    private static int P(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int b(k kVar) {
        String str = kVar.f17293a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (r0.f48425a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int c(k kVar) {
        return kVar.f17293a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int d(v0 v0Var, k kVar) {
        return kVar.n(v0Var) ? 1 : 0;
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return UserVerificationMethods.USER_VERIFY_ALL;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
            case 17:
                return 131072;
            case 18:
                return MediaHttpUploader.MINIMUM_CHUNK_SIZE;
            case 19:
                return 524288;
            case 20:
                return ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return UserVerificationMethods.USER_VERIFY_ALL;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case UserVerificationMethods.USER_VERIFY_ALL /* 1024 */:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return 9437184;
            case 131072:
            case MediaHttpUploader.MINIMUM_CHUNK_SIZE /* 262144 */:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    private static Integer k(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            default:
                return null;
        }
    }

    private static Pair l(String str, String[] strArr) {
        int iM;
        if (strArr.length != 3) {
            u.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(y.h(Integer.parseInt(strArr[1], 16))) && (iM = M(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(iM), 0);
            }
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static String m(v0 v0Var) {
        Pair pairR;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(v0Var.f18868l)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!"video/dolby-vision".equals(v0Var.f18868l) || (pairR = r(v0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairR.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (iIntValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        return null;
    }

    public static List n(l lVar, v0 v0Var, boolean z10, boolean z11) {
        String strM = m(v0Var);
        return strM == null ? c0.C() : lVar.a(strM, z10, z11);
    }

    private static Pair o(String str, String[] strArr, pb.c cVar) {
        int i10;
        if (strArr.length < 4) {
            u.i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i11 = 1;
        try {
            int i12 = Integer.parseInt(strArr[1]);
            int i13 = Integer.parseInt(strArr[2].substring(0, 2));
            int i14 = Integer.parseInt(strArr[3]);
            if (i12 != 0) {
                u.i("MediaCodecUtil", "Unknown AV1 profile: " + i12);
                return null;
            }
            if (i14 != 8 && i14 != 10) {
                u.i("MediaCodecUtil", "Unknown AV1 bit depth: " + i14);
                return null;
            }
            if (i14 != 8) {
                i11 = (cVar == null || !(cVar.f49833d != null || (i10 = cVar.f49832c) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int iF = f(i13);
            if (iF != -1) {
                return new Pair(Integer.valueOf(i11), Integer.valueOf(iF));
            }
            u.i("MediaCodecUtil", "Unknown AV1 level: " + i13);
            return null;
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair p(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            u.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    u.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int i13 = i(i11);
            if (i13 == -1) {
                u.i("MediaCodecUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int iG = g(i10);
            if (iG != -1) {
                return new Pair(Integer.valueOf(i13), Integer.valueOf(iG));
            }
            u.i("MediaCodecUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            u.i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static String q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair r(v0 v0Var) {
        String str = v0Var.f18865i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(v0Var.f18868l)) {
            return y(v0Var.f18865i, strArrSplit);
        }
        byte b10 = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b10 = -1;
                }
                break;
            case 3006243:
                b10 = !str2.equals(VisualSampleEntry.TYPE3) ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b10 = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b10 = !str2.equals(VisualSampleEntry.TYPE7) ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b10 = !str2.equals(VisualSampleEntry.TYPE6) ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b10 = !str2.equals(AudioSampleEntry.TYPE3) ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b10 = !str2.equals("vp09") ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return o(v0Var.f18865i, strArrSplit, v0Var.f18880x);
            case 1:
            case 2:
                return p(v0Var.f18865i, strArrSplit);
            case 3:
            case 4:
                return z(v0Var.f18865i, strArrSplit, v0Var.f18880x);
            case 5:
                return l(v0Var.f18865i, strArrSplit);
            case 6:
                return A(v0Var.f18865i, strArrSplit);
            default:
                return null;
        }
    }

    public static k s(String str, boolean z10, boolean z11) {
        List listT = t(str, z10, z11);
        if (listT.isEmpty()) {
            return null;
        }
        return (k) listT.get(0);
    }

    public static synchronized List t(String str, boolean z10, boolean z11) {
        try {
            b bVar = new b(str, z10, z11);
            HashMap map = f17227b;
            List list = (List) map.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = r0.f48425a;
            ArrayList arrayListU = u(bVar, i10 >= 21 ? new e(z10, z11) : new d());
            if (z10 && arrayListU.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListU = u(bVar, new d());
                if (!arrayListU.isEmpty()) {
                    u.i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((k) arrayListU.get(0)).f17293a);
                }
            }
            e(str, arrayListU);
            c0 c0VarX = c0.x(arrayListU);
            map.put(bVar, c0VarX);
            return c0VarX;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[PHI: r16
      0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList u(b bVar, c cVar) throws DecoderQueryException {
        int i10;
        boolean z10;
        boolean z11;
        b bVar2 = bVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = bVar2.f17229a;
            int codecCount = cVar.getCodecCount();
            boolean zSecureDecodersExplicit = cVar.secureDecodersExplicit();
            int i11 = 0;
            while (i11 < codecCount) {
                MediaCodecInfo codecInfoAt = cVar.getCodecInfoAt(i11);
                if (C(codecInfoAt)) {
                    z10 = zSecureDecodersExplicit;
                    i10 = i11;
                } else {
                    String name = codecInfoAt.getName();
                    if (E(codecInfoAt, name, zSecureDecodersExplicit, str)) {
                        int i12 = i11;
                        String strQ = q(codecInfoAt, name, str);
                        if (strQ == null) {
                            z10 = zSecureDecodersExplicit;
                            i10 = i12;
                        } else {
                            boolean z12 = zSecureDecodersExplicit;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(strQ);
                                boolean zA = cVar.a("tunneled-playback", strQ, capabilitiesForType);
                                boolean zB = cVar.b("tunneled-playback", strQ, capabilitiesForType);
                                boolean z13 = bVar2.f17231c;
                                if ((z13 || !zB) && (!z13 || zA)) {
                                    boolean zA2 = cVar.a("secure-playback", strQ, capabilitiesForType);
                                    boolean zB2 = cVar.b("secure-playback", strQ, capabilitiesForType);
                                    boolean z14 = bVar2.f17230b;
                                    if ((z14 || !zB2) && (!z14 || zA2)) {
                                        try {
                                            boolean zF = F(codecInfoAt, str);
                                            try {
                                                boolean zH = H(codecInfoAt, str);
                                                boolean zJ = J(codecInfoAt);
                                                if (z12) {
                                                    z11 = zJ;
                                                    if (bVar2.f17230b == zA2) {
                                                        z10 = z12;
                                                        boolean z15 = z11;
                                                        i10 = i12;
                                                        try {
                                                            arrayList.add(k.F(name, str, strQ, capabilitiesForType, zF, zH, z15, false, false));
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            if (r0.f48425a <= 23) {
                                                            }
                                                            u.c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strQ + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z11 = zJ;
                                                }
                                                if (!z12) {
                                                    try {
                                                        if (!bVar2.f17230b) {
                                                            z10 = z12;
                                                            boolean z16 = z11;
                                                            i10 = i12;
                                                            arrayList.add(k.F(name, str, strQ, capabilitiesForType, zF, zH, z16, false, false));
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        i10 = i12;
                                                        z10 = z12;
                                                        if (r0.f48425a <= 23 || arrayList.isEmpty()) {
                                                            u.c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strQ + ")");
                                                            throw e;
                                                        }
                                                        u.c("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                                        i11 = i10 + 1;
                                                        bVar2 = bVar;
                                                        zSecureDecodersExplicit = z10;
                                                    }
                                                }
                                                z10 = z12;
                                                boolean z17 = z11;
                                                i10 = i12;
                                                if (!z10 && zA2) {
                                                    try {
                                                        arrayList.add(k.F(name + ".secure", str, strQ, capabilitiesForType, zF, zH, z17, false, true));
                                                        break;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        if (r0.f48425a <= 23) {
                                                        }
                                                        u.c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strQ + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                i10 = i12;
                                                z10 = z12;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            z10 = z12;
                                            i10 = i12;
                                        }
                                    } else {
                                        i10 = i12;
                                        z10 = z12;
                                    }
                                } else {
                                    i10 = i12;
                                    z10 = z12;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                i10 = i12;
                                z10 = z12;
                            }
                        }
                    } else {
                        z10 = zSecureDecodersExplicit;
                        i10 = i11;
                    }
                }
                i11 = i10 + 1;
                bVar2 = bVar;
                zSecureDecodersExplicit = z10;
            }
            return arrayList;
        } catch (Exception e16) {
            throw new DecoderQueryException(e16);
        }
    }

    public static List v(l lVar, v0 v0Var, boolean z10, boolean z11) {
        List listA = lVar.a(v0Var.f18868l, z10, z11);
        return c0.r().k(listA).k(n(lVar, v0Var, z10, z11)).m();
    }

    public static List w(List list, final v0 v0Var) {
        ArrayList arrayList = new ArrayList(list);
        N(arrayList, new f() { // from class: com.google.android.exoplayer2.mediacodec.o
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
            public final int a(Object obj) {
                return MediaCodecUtil.d(v0Var, (k) obj);
            }
        });
        return arrayList;
    }

    public static k x() {
        return s(MimeTypes.AUDIO_RAW, false, false);
    }

    private static Pair y(String str, String[] strArr) {
        if (strArr.length < 3) {
            u.i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f17226a.matcher(strArr[1]);
        if (!matcher.matches()) {
            u.i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numK = k(strGroup);
        if (numK == null) {
            u.i("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numJ = j(str2);
        if (numJ != null) {
            return new Pair(numK, numJ);
        }
        u.i("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair z(String str, String[] strArr, pb.c cVar) {
        if (strArr.length < 4) {
            u.i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f17226a.matcher(strArr[1]);
        if (!matcher.matches()) {
            u.i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(strGroup)) {
                u.i("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i10 = (cVar == null || cVar.f49832c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numB = B(str2);
        if (numB != null) {
            return new Pair(Integer.valueOf(i10), numB);
        }
        u.i("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo, String str) {
        if (r0.f48425a >= 29) {
            return I(mediaCodecInfo);
        }
        if (y.o(str)) {
            return true;
        }
        String strE = sc.c.e(mediaCodecInfo.getName());
        if (strE.startsWith(Lykgign.TRMJANkIwLrpJNJ)) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    private static void e(String str, List list) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (r0.f48425a < 26 && r0.f48426b.equals("R9") && list.size() == 1 && ((k) list.get(0)).f17293a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(k.F("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            N(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.m
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                public final int a(Object obj) {
                    return MediaCodecUtil.b((k) obj);
                }
            });
        }
        int i10 = r0.f48425a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = ((k) list.get(0)).f17293a;
            if (geAgcEazw.cFcVX.equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                N(list, new f() { // from class: com.google.android.exoplayer2.mediacodec.n
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.f
                    public final int a(Object obj) {
                        return MediaCodecUtil.c((k) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((k) list.get(0)).f17293a)) {
            return;
        }
        list.add((k) list.remove(0));
    }
}
