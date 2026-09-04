package q9;

import com.google.android.exoplayer2.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import ob.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f50437a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f50438b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50441c;

        private b(int i10, int i11, String str) {
            this.f50439a = i10;
            this.f50440b = i11;
            this.f50441c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f50437a;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f50438b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL))};
    }

    private static int c(c0 c0Var) {
        int iH = c0Var.h(5);
        return iH == 31 ? c0Var.h(6) + 32 : iH;
    }

    private static int d(c0 c0Var) throws ParserException {
        int iH = c0Var.h(4);
        if (iH == 15) {
            if (c0Var.b() >= 24) {
                return c0Var.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f50437a[iH];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(c0 c0Var, boolean z10) throws ParserException {
        int iC = c(c0Var);
        int iD = d(c0Var);
        int iH = c0Var.h(4);
        String str = "mp4a.40." + iC;
        if (iC == 5 || iC == 29) {
            iD = d(c0Var);
            iC = c(c0Var);
            if (iC == 22) {
                iH = c0Var.h(4);
            }
        }
        if (z10) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.e("Unsupported audio object type: " + iC);
                }
            }
            g(c0Var, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = c0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.e("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f50438b[iH];
        if (i10 != -1) {
            return new b(iD, i10, str);
        }
        throw ParserException.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new c0(bArr), false);
    }

    private static void g(c0 c0Var, int i10, int i11) {
        if (c0Var.g()) {
            ob.u.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c0Var.g()) {
            c0Var.r(14);
        }
        boolean zG = c0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            c0Var.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                c0Var.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                c0Var.r(3);
            }
            c0Var.r(1);
        }
    }
}
