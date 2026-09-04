package com.fasterxml.jackson.core.io;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f16251a = 1000000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f16252b = 1000000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f16253c = 1000000000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f16254d = -2147483648L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f16255e = 2147483647L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f16256f = String.valueOf(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f16257g = String.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f16258h = new int[1000];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f16259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f16260j;

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 10; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                int i13 = 0;
                while (i13 < 10) {
                    f16258h[i10] = ((i11 + 48) << 16) | ((i12 + 48) << 8) | (i13 + 48);
                    i13++;
                    i10++;
                }
            }
        }
        f16259i = new String[]{MBridgeConstans.ENDCARD_URL_TYPE_PL, "1", MBridgeConstans.API_REUQEST_CATEGORY_APP, "3", "4", CampaignEx.CLICKMODE_ON, "6", "7", "8", "9", "10"};
        f16260j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int a(int i10, byte[] bArr, int i11) {
        int i12 = f16258h[i10];
        bArr[i11] = (byte) (i12 >> 16);
        int i13 = i11 + 2;
        bArr[i11 + 1] = (byte) (i12 >> 8);
        int i14 = i11 + 3;
        bArr[i13] = (byte) i12;
        return i14;
    }

    private static int b(int i10, char[] cArr, int i11) {
        int i12 = f16258h[i10];
        cArr[i11] = (char) (i12 >> 16);
        int i13 = i11 + 2;
        cArr[i11 + 1] = (char) ((i12 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i14 = i11 + 3;
        cArr[i13] = (char) (i12 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        return i14;
    }

    private static int c(int i10, byte[] bArr, int i11) {
        int i12 = f16258h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                bArr[i11] = (byte) (i12 >> 16);
                i11++;
            }
            bArr[i11] = (byte) (i12 >> 8);
            i11++;
        }
        int i13 = i11 + 1;
        bArr[i11] = (byte) i12;
        return i13;
    }

    private static int d(int i10, char[] cArr, int i11) {
        int i12 = f16258h[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i11] = (char) (i12 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i12 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            i11++;
        }
        int i13 = i11 + 1;
        cArr[i11] = (char) (i12 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        return i13;
    }

    private static int e(int i10, byte[] bArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int[] iArr = f16258h;
        int i16 = iArr[i14];
        bArr[i11] = (byte) (i16 >> 16);
        bArr[i11 + 1] = (byte) (i16 >> 8);
        bArr[i11 + 2] = (byte) i16;
        int i17 = iArr[i15];
        bArr[i11 + 3] = (byte) (i17 >> 16);
        bArr[i11 + 4] = (byte) (i17 >> 8);
        bArr[i11 + 5] = (byte) i17;
        int i18 = iArr[i13];
        bArr[i11 + 6] = (byte) (i18 >> 16);
        int i19 = i11 + 8;
        bArr[i11 + 7] = (byte) (i18 >> 8);
        int i20 = i11 + 9;
        bArr[i19] = (byte) i18;
        return i20;
    }

    private static int f(int i10, char[] cArr, int i11) {
        int i12 = i10 / 1000;
        int i13 = i10 - (i12 * 1000);
        int i14 = i12 / 1000;
        int[] iArr = f16258h;
        int i15 = iArr[i14];
        cArr[i11] = (char) (i15 >> 16);
        cArr[i11 + 1] = (char) ((i15 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        cArr[i11 + 2] = (char) (i15 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i16 = iArr[i12 - (i14 * 1000)];
        cArr[i11 + 3] = (char) (i16 >> 16);
        cArr[i11 + 4] = (char) ((i16 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        cArr[i11 + 5] = (char) (i16 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i17 = iArr[i13];
        cArr[i11 + 6] = (char) (i17 >> 16);
        int i18 = i11 + 8;
        cArr[i11 + 7] = (char) ((i17 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i19 = i11 + 9;
        cArr[i18] = (char) (i17 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        return i19;
    }

    private static int g(byte[] bArr, int i10) {
        int length = f16256f.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) f16256f.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    private static int h(char[] cArr, int i10) {
        String str = f16256f;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int i(byte[] bArr, int i10) {
        int length = f16257g.length();
        int i11 = 0;
        while (i11 < length) {
            bArr[i10] = (byte) f16257g.charAt(i11);
            i11++;
            i10++;
        }
        return i10;
    }

    private static int j(char[] cArr, int i10) {
        String str = f16257g;
        int length = str.length();
        str.getChars(0, length, cArr, i10);
        return i10 + length;
    }

    private static int k(int i10, byte[] bArr, int i11) {
        if (i10 < f16251a) {
            if (i10 < 1000) {
                return c(i10, bArr, i11);
            }
            int i12 = i10 / 1000;
            return m(bArr, i11, i12, i10 - (i12 * 1000));
        }
        int i13 = i10 / 1000;
        int i14 = i10 - (i13 * 1000);
        int i15 = i13 / 1000;
        int i16 = i13 - (i15 * 1000);
        int iC = c(i15, bArr, i11);
        int[] iArr = f16258h;
        int i17 = iArr[i16];
        bArr[iC] = (byte) (i17 >> 16);
        bArr[iC + 1] = (byte) (i17 >> 8);
        bArr[iC + 2] = (byte) i17;
        int i18 = iArr[i14];
        bArr[iC + 3] = (byte) (i18 >> 16);
        int i19 = iC + 5;
        bArr[iC + 4] = (byte) (i18 >> 8);
        int i20 = iC + 6;
        bArr[i19] = (byte) i18;
        return i20;
    }

    private static int l(int i10, char[] cArr, int i11) {
        if (i10 < f16251a) {
            if (i10 < 1000) {
                return d(i10, cArr, i11);
            }
            int i12 = i10 / 1000;
            return n(cArr, i11, i12, i10 - (i12 * 1000));
        }
        int i13 = i10 / 1000;
        int i14 = i10 - (i13 * 1000);
        int i15 = i13 / 1000;
        int i16 = i13 - (i15 * 1000);
        int iD = d(i15, cArr, i11);
        int[] iArr = f16258h;
        int i17 = iArr[i16];
        cArr[iD] = (char) (i17 >> 16);
        cArr[iD + 1] = (char) ((i17 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        cArr[iD + 2] = (char) (i17 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i18 = iArr[i14];
        cArr[iD + 3] = (char) (i18 >> 16);
        int i19 = iD + 5;
        cArr[iD + 4] = (char) ((i18 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i20 = iD + 6;
        cArr[i19] = (char) (i18 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        return i20;
    }

    private static int m(byte[] bArr, int i10, int i11, int i12) {
        int[] iArr = f16258h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                bArr[i10] = (byte) (i13 >> 16);
                i10++;
            }
            bArr[i10] = (byte) (i13 >> 8);
            i10++;
        }
        bArr[i10] = (byte) i13;
        int i14 = iArr[i12];
        bArr[i10 + 1] = (byte) (i14 >> 16);
        int i15 = i10 + 3;
        bArr[i10 + 2] = (byte) (i14 >> 8);
        int i16 = i10 + 4;
        bArr[i15] = (byte) i14;
        return i16;
    }

    private static int n(char[] cArr, int i10, int i11, int i12) {
        int[] iArr = f16258h;
        int i13 = iArr[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i10] = (char) (i13 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i13 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
            i10++;
        }
        cArr[i10] = (char) (i13 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i14 = iArr[i12];
        cArr[i10 + 1] = (char) (i14 >> 16);
        int i15 = i10 + 3;
        cArr[i10 + 2] = (char) ((i14 >> 8) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        int i16 = i10 + 4;
        cArr[i15] = (char) (i14 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        return i16;
    }

    public static boolean o(double d10) {
        return Double.isNaN(d10) || Double.isInfinite(d10);
    }

    public static boolean p(float f10) {
        return Float.isNaN(f10) || Float.isInfinite(f10);
    }

    public static int q(int i10, byte[] bArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return g(bArr, i11);
            }
            bArr[i11] = 45;
            i10 = -i10;
            i11++;
        }
        if (i10 < f16251a) {
            if (i10 >= 1000) {
                int i13 = i10 / 1000;
                return a(i10 - (i13 * 1000), bArr, c(i13, bArr, i11));
            }
            if (i10 >= 10) {
                return c(i10, bArr, i11);
            }
            int i14 = i11 + 1;
            bArr[i11] = (byte) (i10 + 48);
            return i14;
        }
        int i15 = f16252b;
        if (i10 < i15) {
            int i16 = i10 / 1000;
            int i17 = i16 / 1000;
            return a(i10 - (i16 * 1000), bArr, a(i16 - (i17 * 1000), bArr, c(i17, bArr, i11)));
        }
        int i18 = i10 - i15;
        if (i18 >= i15) {
            i18 -= i15;
            i12 = i11 + 1;
            bArr[i11] = 50;
        } else {
            i12 = i11 + 1;
            bArr[i11] = 49;
        }
        return e(i18, bArr, i12);
    }

    public static int r(int i10, char[] cArr, int i11) {
        int i12;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                return h(cArr, i11);
            }
            cArr[i11] = '-';
            i10 = -i10;
            i11++;
        }
        if (i10 < f16251a) {
            if (i10 >= 1000) {
                int i13 = i10 / 1000;
                return b(i10 - (i13 * 1000), cArr, d(i13, cArr, i11));
            }
            if (i10 >= 10) {
                return d(i10, cArr, i11);
            }
            cArr[i11] = (char) (i10 + 48);
            return i11 + 1;
        }
        int i14 = f16252b;
        if (i10 < i14) {
            int i15 = i10 / 1000;
            int i16 = i15 / 1000;
            return b(i10 - (i15 * 1000), cArr, b(i15 - (i16 * 1000), cArr, d(i16, cArr, i11)));
        }
        int i17 = i10 - i14;
        if (i17 >= i14) {
            i17 -= i14;
            i12 = i11 + 1;
            cArr[i11] = '2';
        } else {
            i12 = i11 + 1;
            cArr[i11] = '1';
        }
        return f(i17, cArr, i12);
    }

    public static int s(long j10, byte[] bArr, int i10) {
        int iE;
        if (j10 < 0) {
            if (j10 > f16254d) {
                return q((int) j10, bArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return i(bArr, i10);
            }
            bArr[i10] = 45;
            j10 = -j10;
            i10++;
        } else if (j10 <= f16255e) {
            return q((int) j10, bArr, i10);
        }
        long j11 = f16253c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            iE = k((int) j12, bArr, i10);
        } else {
            long j14 = j12 / j11;
            int iC = c((int) j14, bArr, i10);
            iE = e((int) (j12 - (j11 * j14)), bArr, iC);
        }
        return e((int) j13, bArr, iE);
    }

    public static int t(long j10, char[] cArr, int i10) {
        int iF;
        if (j10 < 0) {
            if (j10 > f16254d) {
                return r((int) j10, cArr, i10);
            }
            if (j10 == Long.MIN_VALUE) {
                return j(cArr, i10);
            }
            cArr[i10] = '-';
            j10 = -j10;
            i10++;
        } else if (j10 <= f16255e) {
            return r((int) j10, cArr, i10);
        }
        long j11 = f16253c;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        if (j12 < j11) {
            iF = l((int) j12, cArr, i10);
        } else {
            long j14 = j12 / j11;
            int iD = d((int) j14, cArr, i10);
            iF = f((int) (j12 - (j11 * j14)), cArr, iD);
        }
        return f((int) j13, cArr, iF);
    }
}
