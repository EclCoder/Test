package o2;

import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f47962a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f47963b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f47966c;

        private b(int i10, int i11, String str) {
            this.f47964a = i10;
            this.f47965b = i11;
            this.f47966c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL))};
    }

    private static int b(w1.t tVar) {
        int iH = tVar.h(5);
        return iH == 31 ? tVar.h(6) + 32 : iH;
    }

    private static int c(w1.t tVar) throws ParserException {
        int iH = tVar.h(4);
        if (iH == 15) {
            if (tVar.b() >= 24) {
                return tVar.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f47962a[iH];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(w1.t tVar, boolean z10) throws ParserException {
        int iB = b(tVar);
        int iC = c(tVar);
        int iH = tVar.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(tVar);
            iB = b(tVar);
            if (iB == 22) {
                iH = tVar.h(4);
            }
        }
        if (z10) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + iB);
                }
            }
            f(tVar, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = tVar.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f47963b[iH];
        if (i10 != -1) {
            return new b(iC, i10, str);
        }
        throw ParserException.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new w1.t(bArr), false);
    }

    private static void f(w1.t tVar, int i10, int i11) {
        if (tVar.g()) {
            w1.n.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (tVar.g()) {
            tVar.r(14);
        }
        boolean zG = tVar.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            tVar.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                tVar.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                tVar.r(3);
            }
            tVar.r(1);
        }
    }
}
