package wc;

import com.google.common.primitives.g;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.math.RoundingMode;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f56171a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f56172b = {1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f56173c = {3, 31, Sdk$SDKError.b.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f56174d = {1, 1, 2, 6, 24, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int[] f56175e = {Integer.MAX_VALUE, Integer.MAX_VALUE, C.DEFAULT_BUFFER_SEGMENT_SIZE, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56176a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f56176a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56176a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56176a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56176a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f56176a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f56176a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f56176a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f56176a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        int i12 = (int) j10;
        f.b(j10 == ((long) i12), "checkedAdd", i10, i11);
        return i12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(int i10, int i11, RoundingMode roundingMode) {
        p.o(roundingMode);
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (a.f56176a[roundingMode.ordinal()]) {
            case 1:
                f.f(i13 == 0);
                return i12;
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                return i12 + i14;
            case 4:
                return i12 + i14;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                return i12 + i14;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i12 & 1) != 0))) {
                            return i12;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i12;
                }
                return i12 + i14;
            default:
                throw new AssertionError();
        }
    }

    public static boolean c(int i10) {
        return (i10 > 0) & ((i10 & (i10 + (-1))) == 0);
    }

    static int d(int i10, int i11) {
        return (~(~(i10 - i11))) >>> 31;
    }

    public static int e(int i10, RoundingMode roundingMode) {
        f.e("x", i10);
        switch (a.f56176a[roundingMode.ordinal()]) {
            case 1:
                f.f(c(i10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
                return (31 - iNumberOfLeadingZeros) + d((-1257966797) >>> iNumberOfLeadingZeros, i10);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static int f(int i10, int i11) {
        if (i11 > 0) {
            int i12 = i10 % i11;
            return i12 >= 0 ? i12 : i12 + i11;
        }
        throw new ArithmeticException("Modulus " + i11 + " must be > 0");
    }

    public static int g(int i10, int i11) {
        return g.m(((long) i10) * ((long) i11));
    }
}
