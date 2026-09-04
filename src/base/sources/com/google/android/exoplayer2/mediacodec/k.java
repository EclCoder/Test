package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import ob.r0;
import ob.u;
import ob.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f17296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f17303k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || k.C()) {
                return 0;
            }
            g2.d.a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointA = g2.c.a(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                if (g2.e.a(supportedPerformancePoints.get(i12)).covers(performancePointA)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    k(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f17293a = (String) ob.a.e(str);
        this.f17294b = str2;
        this.f17295c = str3;
        this.f17296d = codecCapabilities;
        this.f17300h = z10;
        this.f17301i = z11;
        this.f17302j = z12;
        this.f17297e = z13;
        this.f17298f = z14;
        this.f17299g = z15;
        this.f17303k = y.s(str2);
    }

    private static boolean A(String str) {
        return r0.f48428d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean B(String str) {
        if (r0.f48425a > 22) {
            return false;
        }
        String str2 = r0.f48428d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean C() {
        String str = r0.f48426b;
        if (str.equals("sabrina") || str.equals("boreal")) {
            return true;
        }
        String str2 = r0.f48428d;
        return str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616");
    }

    private static boolean D(String str, int i10) {
        if (!MimeTypes.VIDEO_H265.equals(str) || 2 != i10) {
            return false;
        }
        String str2 = r0.f48426b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(r0.f48426b)) ? false : true;
    }

    public static k F(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new k(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && s(codecCapabilities)));
    }

    private static int b(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((r0.f48425a >= 26 && i10 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i10;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i11 = 6;
        } else {
            i11 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        u.i(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(r0.l(i10, widthAlignment) * widthAlignment, r0.l(i11, heightAlignment) * heightAlignment);
    }

    private static boolean e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointD = d(videoCapabilities, i10, i11);
        int i12 = pointD.x;
        int i13 = pointD.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i10 = UserVerificationMethods.USER_VERIFY_ALL;
        } else if (iIntValue >= 120000000) {
            i10 = 512;
        } else if (iIntValue >= 60000000) {
            i10 = 256;
        } else if (iIntValue >= 30000000) {
            i10 = 128;
        } else if (iIntValue >= 18000000) {
            i10 = 64;
        } else if (iIntValue >= 12000000) {
            i10 = 32;
        } else if (iIntValue >= 7200000) {
            i10 = 16;
        } else if (iIntValue >= 3600000) {
            i10 = 8;
        } else if (iIntValue >= 1800000) {
            i10 = 4;
        } else {
            i10 = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return r0.f48425a >= 19 && j(codecCapabilities);
    }

    private static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean m(v0 v0Var, boolean z10) {
        Pair pairR = MediaCodecUtil.r(v0Var);
        if (pairR == null) {
            return true;
        }
        int iIntValue = ((Integer) pairR.first).intValue();
        int iIntValue2 = ((Integer) pairR.second).intValue();
        if ("video/dolby-vision".equals(v0Var.f18868l)) {
            if (!MimeTypes.VIDEO_H264.equals(this.f17294b)) {
                iIntValue = MimeTypes.VIDEO_H265.equals(this.f17294b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f17303k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = h();
        if (r0.f48425a <= 23 && MimeTypes.VIDEO_VP9.equals(this.f17294b) && codecProfileLevelArrH.length == 0) {
            codecProfileLevelArrH = g(this.f17296d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrH) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !D(this.f17294b, iIntValue))) {
                return true;
            }
        }
        y("codec.profileLevel, " + v0Var.f18865i + ", " + this.f17295c);
        return false;
    }

    private boolean q(v0 v0Var) {
        return this.f17294b.equals(v0Var.f18868l) || this.f17294b.equals(MediaCodecUtil.m(v0Var));
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return r0.f48425a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return r0.f48425a >= 21 && v(codecCapabilities);
    }

    private static boolean v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void x(String str) {
        u.b(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedSupport [" + str + "] [" + this.f17293a + ", " + this.f17294b + "] [" + r0.f48429e + "]");
    }

    private void y(String str) {
        u.b(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "NoSupport [" + str + "] [" + this.f17293a + ", " + this.f17294b + "] [" + r0.f48429e + "]");
    }

    private static boolean z(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17296d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return d(videoCapabilities, i10, i11);
    }

    public s9.g f(v0 v0Var, v0 v0Var2) {
        v0 v0Var3;
        v0 v0Var4;
        int i10 = !r0.c(v0Var.f18868l, v0Var2.f18868l) ? 8 : 0;
        if (this.f17303k) {
            if (v0Var.f18876t != v0Var2.f18876t) {
                i10 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.f17297e && (v0Var.f18873q != v0Var2.f18873q || v0Var.f18874r != v0Var2.f18874r)) {
                i10 |= 512;
            }
            if (!r0.c(v0Var.f18880x, v0Var2.f18880x)) {
                i10 |= 2048;
            }
            if (A(this.f17293a) && !v0Var.g(v0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new s9.g(this.f17293a, v0Var, v0Var2, v0Var.g(v0Var2) ? 3 : 2, 0);
            }
            v0Var3 = v0Var;
            v0Var4 = v0Var2;
        } else {
            v0Var3 = v0Var;
            v0Var4 = v0Var2;
            if (v0Var3.f18881y != v0Var4.f18881y) {
                i10 |= 4096;
            }
            if (v0Var3.f18882z != v0Var4.f18882z) {
                i10 |= 8192;
            }
            if (v0Var3.A != v0Var4.A) {
                i10 |= 16384;
            }
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(this.f17294b)) {
                Pair pairR = MediaCodecUtil.r(v0Var3);
                Pair pairR2 = MediaCodecUtil.r(v0Var4);
                if (pairR != null && pairR2 != null) {
                    int iIntValue = ((Integer) pairR.first).intValue();
                    int iIntValue2 = ((Integer) pairR2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new s9.g(this.f17293a, v0Var3, v0Var4, 3, 0);
                    }
                }
            }
            if (!v0Var3.g(v0Var4)) {
                i10 |= 32;
            }
            if (z(this.f17294b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new s9.g(this.f17293a, v0Var3, v0Var4, 1, 0);
            }
        }
        return new s9.g(this.f17293a, v0Var3, v0Var4, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17296d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17296d;
        if (codecCapabilities == null) {
            y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("channelCount.aCaps");
            return false;
        }
        if (b(this.f17293a, this.f17294b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        y("channelCount.support, " + i10);
        return false;
    }

    public boolean l(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17296d;
        if (codecCapabilities == null) {
            y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        y("sampleRate.support, " + i10);
        return false;
    }

    public boolean n(v0 v0Var) {
        return q(v0Var) && m(v0Var, false);
    }

    public boolean o(v0 v0Var) {
        int i10;
        int i11;
        int i12;
        if (!q(v0Var) || !m(v0Var, true)) {
            return false;
        }
        if (!this.f17303k) {
            return r0.f48425a < 21 || (((i10 = v0Var.f18882z) == -1 || l(i10)) && ((i11 = v0Var.f18881y) == -1 || k(i11)));
        }
        int i13 = v0Var.f18873q;
        if (i13 <= 0 || (i12 = v0Var.f18874r) <= 0) {
            return true;
        }
        if (r0.f48425a >= 21) {
            return w(i13, i12, v0Var.f18875s);
        }
        boolean z10 = i13 * i12 <= MediaCodecUtil.L();
        if (!z10) {
            y("legacyFrameSize, " + v0Var.f18873q + "x" + v0Var.f18874r);
        }
        return z10;
    }

    public boolean p() {
        if (r0.f48425a >= 29 && MimeTypes.VIDEO_VP9.equals(this.f17294b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean r(v0 v0Var) {
        if (this.f17303k) {
            return this.f17297e;
        }
        Pair pairR = MediaCodecUtil.r(v0Var);
        return pairR != null && ((Integer) pairR.first).intValue() == 42;
    }

    public String toString() {
        return this.f17293a;
    }

    public boolean w(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f17296d;
        if (codecCapabilities == null) {
            y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            y("sizeAndRate.vCaps");
            return false;
        }
        if (r0.f48425a >= 29) {
            int iA = a.a(videoCapabilities, i10, i11, d10);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                y("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!e(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !E(this.f17293a) || !e(videoCapabilities, i11, i10, d10)) {
                y("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            x("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }
}
