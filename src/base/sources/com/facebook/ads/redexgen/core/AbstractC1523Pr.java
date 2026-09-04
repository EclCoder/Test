package com.facebook.ads.redexgen.core;

import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC1523Pr {
    public static int[] A00;
    public static byte[] A01;
    public static String[] A02 = {"xE1uVhGB69CiXPpHcJa10wbSlC3W3Pqt", "6IpI1YgYEWBIhrDPxczszndZYzSCWcQF", "bz", "MzPVaMVFsogiMWrn4KMw3MbbkZJMuH", "2ugKETTJdLvfYrUKb1TohGbXSYfe6n6C", "hmUXQG87xVCBxVGQbZ2KvW4kNx5lzwQm", "IXb1TBLYeY5D6VfxvuWbchUwU2o2Kpep", "MzSHxO025yCTKgxZvpDu7SYsFbhNKTLL"};
    public static final byte[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[0].charAt(20) != '0') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "Wzlt7pC9sZ6E4twls83s4vi3o8ZTUgJv";
            strArr[5] = "VyCJESJZLvIfYV7xXyp1DHPmX8SMlxdC";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-46, -61, 5, 28, -61, 29, 8, 21, 18};
    }

    static {
        A02();
        A03 = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
        A05 = new int[]{1, 10, 100, 1000, 10000, DefaultOggSeeker.MATCH_BYTE_RANGE, 1000000, 10000000, 100000000, 1000000000};
        A04 = new int[]{3, 31, Sdk$SDKError.b.GENERATE_JSON_DATA_ERROR_VALUE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
        A06 = new int[]{1, 1, 2, 6, 24, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
        A00 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, C.DEFAULT_BUFFER_SEGMENT_SIZE, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0061  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static int A00(int p10, int q10, RoundingMode mode) {
        AbstractC2428ki.A04(mode);
        if (q10 != 0) {
            int i10 = p10 / q10;
            int div = q10 * i10;
            int i11 = p10 - div;
            if (i11 == 0) {
                return i10;
            }
            boolean z10 = true;
            int i12 = ((p10 ^ q10) >> 31) | 1;
            int[] iArr = C1177Cc.A00;
            int div2 = mode.ordinal();
            switch (iArr[div2]) {
                case 1:
                    AbstractC2182gS.A02(i11 == 0);
                case 2:
                    z10 = false;
                    if (z10) {
                        return i10 + i12;
                    }
                    return i10;
                case 3:
                    if (i12 >= 0) {
                        z10 = false;
                    }
                    if (z10) {
                        return i10 + i12;
                    }
                    return i10;
                case 4:
                    z10 = true;
                    if (z10) {
                        return i10 + i12;
                    }
                    return i10;
                case 5:
                    if (i12 <= 0) {
                        z10 = false;
                    }
                    if (z10) {
                        return i10 + i12;
                    }
                    return i10;
                case 6:
                case 7:
                case 8:
                    int rem = Math.abs(i11);
                    int div3 = Math.abs(q10);
                    int rem2 = rem - (div3 - rem);
                    if (rem2 == 0) {
                        if (mode != RoundingMode.HALF_UP) {
                            int rem3 = mode == RoundingMode.HALF_EVEN ? 1 : 0;
                            int div4 = i10 & 1;
                            int div5 = div4 != 0 ? 1 : 0;
                            if ((rem3 & div5) == 0) {
                                z10 = false;
                            }
                        }
                    } else if (rem2 <= 0) {
                        z10 = false;
                    }
                    if (z10) {
                        return i10 + i12;
                    }
                    return i10;
                default:
                    throw new AssertionError();
            }
        } else {
            throw new ArithmeticException(A01(0, 9, 66));
        }
    }
}
