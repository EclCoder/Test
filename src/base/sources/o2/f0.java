package o2;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f48042a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f48043b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f48044c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f48045d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f48046e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f48047f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f48048g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f48049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f48052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f48053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f48054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f48055g;

        public a() {
        }

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!f0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f48049a = i11;
            this.f48050b = f0.f48042a[3 - i12];
            int i15 = f0.f48043b[i14];
            this.f48052d = i15;
            if (i11 == 2) {
                this.f48052d = i15 / 2;
            } else if (i11 == 0) {
                this.f48052d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f48055g = f0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? f0.f48044c[i13 - 1] : f0.f48045d[i13 - 1];
                this.f48054f = i17;
                this.f48051c = (((i17 * 12) / this.f48052d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? f0.f48046e[i13 - 1] : f0.f48047f[i13 - 1];
                    this.f48054f = i18;
                    this.f48051c = ((i18 * 144) / this.f48052d) + i16;
                } else {
                    int i19 = f0.f48048g[i13 - 1];
                    this.f48054f = i19;
                    this.f48051c = (((i12 == 1 ? 72 : 144) * i19) / this.f48052d) + i16;
                }
            }
            this.f48053e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }

        public a(a aVar) {
            this.f48049a = aVar.f48049a;
            this.f48050b = aVar.f48050b;
            this.f48051c = aVar.f48051c;
            this.f48052d = aVar.f48052d;
            this.f48053e = aVar.f48053e;
            this.f48054f = aVar.f48054f;
            this.f48055g = aVar.f48055g;
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
        int i16 = f48043b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f48044c[i13 - 1] : f48045d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f48046e[i13 - 1] : f48047f[i13 - 1];
        } else {
            i15 = f48048g[i13 - 1];
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
