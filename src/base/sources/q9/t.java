package q9;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f50494a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f50495b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f50496c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f50497d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f50498e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f50499f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f50500g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f50502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f50504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f50505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f50506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f50507g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!t.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f50501a = i11;
            this.f50502b = t.f50494a[3 - i12];
            int i15 = t.f50495b[i14];
            this.f50504d = i15;
            if (i11 == 2) {
                this.f50504d = i15 / 2;
            } else if (i11 == 0) {
                this.f50504d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f50507g = t.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? t.f50496c[i13 - 1] : t.f50497d[i13 - 1];
                this.f50506f = i17;
                this.f50503c = (((i17 * 12) / this.f50504d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? t.f50498e[i13 - 1] : t.f50499f[i13 - 1];
                    this.f50506f = i18;
                    this.f50503c = ((i18 * 144) / this.f50504d) + i16;
                } else {
                    int i19 = t.f50500g[i13 - 1];
                    this.f50506f = i19;
                    this.f50503c = (((i12 == 1 ? 72 : 144) * i19) / this.f50504d) + i16;
                }
            }
            this.f50505e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f50495b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f50496c[i13 - 1] : f50497d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f50498e[i13 - 1] : f50499f[i13 - 1];
        } else {
            i15 = f50500g[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
