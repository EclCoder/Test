package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f5628a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            g2.d.a();
            int iB = b(supportedPerformancePoints, g2.c.a(i10, i11, (int) d10));
            if (iB == 1 && k.f5628a == null) {
                Boolean unused = k.f5628a = Boolean.valueOf(c());
                if (k.f5628a.booleanValue()) {
                    return 0;
                }
            }
            return iB;
        }

        private static int b(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (g2.e.a(list.get(i10)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean c() {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            if (c0.f55769a >= 35) {
                return false;
            }
            try {
                t1.o oVarK = new t1.o.b().o0(MimeTypes.VIDEO_H264).K();
                if (oVarK.f52757n != null) {
                    List listV = MediaCodecUtil.v(l.f5629a, oVarK, false, false);
                    for (int i10 = 0; i10 < listV.size(); i10++) {
                        if (((j) listV.get(i10)).f5620d != null && ((j) listV.get(i10)).f5620d.getVideoCapabilities() != null && (supportedPerformancePoints = ((j) listV.get(i10)).f5620d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            g2.d.a();
                            return b(supportedPerformancePoints, g2.c.a(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return true;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (c0.f55769a < 29) {
            return 0;
        }
        Boolean bool = f5628a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
