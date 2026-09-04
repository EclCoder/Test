package si;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: si.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class C0802a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52425a;

        static {
            int[] iArr = new int[b.values().length];
            f52425a = iArr;
            try {
                iArr[b.ULTRA_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52425a[b.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52425a[b.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private enum b {
        NORMAL,
        LOW,
        ULTRA_LOW
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public enum c {
        f52430a,
        SOFTWARE,
        HARDWARE
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        VIDEO_CODEC,
        AUDIO_CODEC
    }

    private static b a(String str) {
        if (str.equalsIgnoreCase("c2.sec.aac.encoder")) {
            return b.ULTRA_LOW;
        }
        return str.equalsIgnoreCase("omx.google.aac.encoder") ? b.LOW : b.NORMAL;
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            if (n(mediaCodecInfo.getName())) {
                int i10 = C0802a.f52425a[a(mediaCodecInfo.getName()).ordinal()];
                if (i10 == 1) {
                    arrayList3.add(mediaCodecInfo);
                } else if (i10 != 2) {
                    arrayList.add(mediaCodecInfo);
                } else {
                    arrayList2.add(mediaCodecInfo);
                }
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public static List c(boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(new MediaCodecList(1).getCodecInfos()));
        return z10 ? b(arrayList) : arrayList;
    }

    public static List d(String str) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : c(true)) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        arrayList.add(mediaCodecInfo);
                    }
                }
            }
        }
        return arrayList;
    }

    public static List e(String str, boolean z10) {
        return f(str, z10, false);
    }

    public static List f(String str, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            arrayList.addAll(d(str));
            return arrayList;
        }
        arrayList.addAll(h(str, z11));
        arrayList.addAll(j(str, z11));
        return arrayList;
    }

    public static List g(String str) {
        return h(str, false);
    }

    public static List h(String str, boolean z10) {
        List<MediaCodecInfo> listD = d(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : listD) {
            if (l(mediaCodecInfo)) {
                arrayList.add(mediaCodecInfo);
                if (z10 && k(mediaCodecInfo, str)) {
                    arrayList2.add(mediaCodecInfo);
                }
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    public static List i(String str) {
        return j(str, false);
    }

    public static List j(String str, boolean z10) {
        List<MediaCodecInfo> listD = d(str);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : listD) {
            if (m(mediaCodecInfo)) {
                arrayList.add(mediaCodecInfo);
                if (z10 && k(mediaCodecInfo, str)) {
                    arrayList2.add(mediaCodecInfo);
                }
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    public static boolean k(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities().isBitrateModeSupported(2);
    }

    private static boolean l(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !m(mediaCodecInfo);
    }

    private static boolean m(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return !mediaCodecInfo.isHardwareAccelerated();
        }
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean n(String str) {
        return !str.equalsIgnoreCase("aacencoder");
    }
}
