package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import t1.v;
import ud.qoRq.WwUgngZLNA;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f5620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f5626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f5627k;

    j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f5617a = (String) w1.a.e(str);
        this.f5618b = str2;
        this.f5619c = str3;
        this.f5620d = codecCapabilities;
        this.f5624h = z10;
        this.f5625i = z11;
        this.f5626j = z12;
        this.f5621e = z13;
        this.f5622f = z14;
        this.f5623g = z15;
        this.f5627k = v.k(str2);
    }

    private static boolean A(String str, int i10) {
        if (!MimeTypes.VIDEO_H265.equals(str) || 2 != i10) {
            return false;
        }
        String str2 = c0.f55770b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(c0.f55770b)) ? false : true;
    }

    public static j C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new j(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && q(codecCapabilities)));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((c0.f55769a >= 26 && i10 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i10;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i11 = 6;
        } else {
            i11 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        w1.n.h(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(c0.j(i10, widthAlignment) * widthAlignment, c0.j(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointC = c(videoCapabilities, i10, i11);
        int i12 = pointC.x;
        int i13 = pointC.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
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

    private static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean k(t1.o oVar, boolean z10) {
        Pair pairR = MediaCodecUtil.r(oVar);
        if (pairR == null) {
            return true;
        }
        int iIntValue = ((Integer) pairR.first).intValue();
        int iIntValue2 = ((Integer) pairR.second).intValue();
        if ("video/dolby-vision".equals(oVar.f52757n)) {
            if (!MimeTypes.VIDEO_H264.equals(this.f5618b)) {
                iIntValue = MimeTypes.VIDEO_H265.equals(this.f5618b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f5627k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = g();
        if (c0.f55769a <= 23 && MimeTypes.VIDEO_VP9.equals(this.f5618b) && codecProfileLevelArrG.length == 0) {
            codecProfileLevelArrG = f(this.f5620d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrG) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !A(this.f5618b, iIntValue))) {
                return true;
            }
        }
        w("codec.profileLevel, " + oVar.f52753j + ", " + this.f5619c);
        return false;
    }

    private boolean o(t1.o oVar) {
        return this.f5618b.equals(oVar.f52757n) || this.f5618b.equals(MediaCodecUtil.m(oVar));
    }

    private static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return c0.f55769a >= 21 && r(codecCapabilities);
    }

    private static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return c0.f55769a >= 21 && t(codecCapabilities);
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void v(String str) {
        w1.n.b(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedSupport [" + str + "] [" + this.f5617a + ", " + this.f5618b + "] [" + c0.f55773e + "]");
    }

    private void w(String str) {
        w1.n.b(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "NoSupport [" + str + "] [" + this.f5617a + ", " + this.f5618b + "] [" + c0.f55773e + "]");
    }

    private static boolean x(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean y(String str) {
        return c0.f55772d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5620d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public androidx.media3.exoplayer.j e(t1.o oVar, t1.o oVar2) {
        t1.o oVar3;
        t1.o oVar4;
        int i10 = !c0.c(oVar.f52757n, oVar2.f52757n) ? 8 : 0;
        if (this.f5627k) {
            if (oVar.f52766w != oVar2.f52766w) {
                i10 |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.f5621e && (oVar.f52763t != oVar2.f52763t || oVar.f52764u != oVar2.f52764u)) {
                i10 |= 512;
            }
            if ((!t1.f.h(oVar.A) || !t1.f.h(oVar2.A)) && !c0.c(oVar.A, oVar2.A)) {
                i10 |= 2048;
            }
            if (y(this.f5617a) && !oVar.e(oVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new androidx.media3.exoplayer.j(this.f5617a, oVar, oVar2, oVar.e(oVar2) ? 3 : 2, 0);
            }
            oVar3 = oVar;
            oVar4 = oVar2;
        } else {
            oVar3 = oVar;
            oVar4 = oVar2;
            if (oVar3.B != oVar4.B) {
                i10 |= 4096;
            }
            if (oVar3.C != oVar4.C) {
                i10 |= 8192;
            }
            if (oVar3.D != oVar4.D) {
                i10 |= 16384;
            }
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(this.f5618b)) {
                Pair pairR = MediaCodecUtil.r(oVar3);
                Pair pairR2 = MediaCodecUtil.r(oVar4);
                if (pairR != null && pairR2 != null) {
                    int iIntValue = ((Integer) pairR.first).intValue();
                    int iIntValue2 = ((Integer) pairR2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new androidx.media3.exoplayer.j(this.f5617a, oVar3, oVar4, 3, 0);
                    }
                }
            }
            if (!oVar3.e(oVar4)) {
                i10 |= 32;
            }
            if (x(this.f5618b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new androidx.media3.exoplayer.j(this.f5617a, oVar3, oVar4, 1, 0);
            }
        }
        return new androidx.media3.exoplayer.j(this.f5617a, oVar3, oVar4, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5620d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5620d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        }
        if (a(this.f5617a, this.f5618b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        w("channelCount.support, " + i10);
        return false;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5620d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        w("sampleRate.support, " + i10);
        return false;
    }

    public boolean l(t1.o oVar) {
        return o(oVar) && k(oVar, false);
    }

    public boolean m(t1.o oVar) {
        int i10;
        int i11;
        int i12;
        if (!o(oVar) || !k(oVar, true)) {
            return false;
        }
        if (!this.f5627k) {
            return c0.f55769a < 21 || (((i10 = oVar.C) == -1 || j(i10)) && ((i11 = oVar.B) == -1 || i(i11)));
        }
        int i13 = oVar.f52763t;
        if (i13 <= 0 || (i12 = oVar.f52764u) <= 0) {
            return true;
        }
        if (c0.f55769a >= 21) {
            return u(i13, i12, oVar.f52765v);
        }
        boolean z10 = i13 * i12 <= MediaCodecUtil.L();
        if (!z10) {
            w("legacyFrameSize, " + oVar.f52763t + "x" + oVar.f52764u);
        }
        return z10;
    }

    public boolean n() {
        if (c0.f55769a >= 29 && MimeTypes.VIDEO_VP9.equals(this.f5618b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean p(t1.o oVar) {
        if (this.f5627k) {
            return this.f5621e;
        }
        Pair pairR = MediaCodecUtil.r(oVar);
        return pairR != null && ((Integer) pairR.first).intValue() == 42;
    }

    public String toString() {
        return this.f5617a;
    }

    private static boolean z(String str) {
        if (c0.f55769a > 22) {
            return false;
        }
        String str2 = c0.f55772d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || WwUgngZLNA.gjFDewiKtpEdk.equals(str);
        }
        return false;
    }

    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5620d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w(dOIDCKnIR.cOiNdugAU);
            return false;
        }
        if (c0.f55769a >= 29) {
            int iC = k.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                w("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !B(this.f5617a) || !d(videoCapabilities, i11, i10, d10)) {
                w("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            v("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }
}
