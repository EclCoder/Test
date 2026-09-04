package vi;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum a {
    YUV420FLEXIBLE,
    YUV420PLANAR,
    YUV420SEMIPLANAR,
    YUV420PACKEDPLANAR,
    YUV420PACKEDSEMIPLANAR,
    YUV422FLEXIBLE,
    YUV422PLANAR,
    YUV422SEMIPLANAR,
    YUV422PACKEDPLANAR,
    YUV422PACKEDSEMIPLANAR,
    YUV444FLEXIBLE,
    YUV444INTERLEAVED,
    SURFACE,
    YUV420Dynamical;

    /* JADX INFO: renamed from: vi.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class C0841a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55639a;

        static {
            int[] iArr = new int[a.values().length];
            f55639a = iArr;
            try {
                iArr[a.YUV420FLEXIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55639a[a.YUV420PLANAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55639a[a.YUV420SEMIPLANAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55639a[a.YUV420PACKEDPLANAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55639a[a.YUV420PACKEDSEMIPLANAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55639a[a.YUV422FLEXIBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55639a[a.YUV422PLANAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55639a[a.YUV422SEMIPLANAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55639a[a.YUV422PACKEDPLANAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55639a[a.YUV422PACKEDSEMIPLANAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55639a[a.YUV444FLEXIBLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55639a[a.YUV444INTERLEAVED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55639a[a.SURFACE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public int g() {
        switch (C0841a.f55639a[ordinal()]) {
            case 1:
                return 2135033992;
            case 2:
                return 19;
            case 3:
                return 21;
            case 4:
                return 20;
            case 5:
                return 39;
            case 6:
                return 2135042184;
            case 7:
                return 22;
            case 8:
                return 24;
            case 9:
                return 23;
            case 10:
                return 40;
            case 11:
                return 2135181448;
            case 12:
                return 29;
            case 13:
                return 2130708361;
            default:
                return -1;
        }
    }
}
