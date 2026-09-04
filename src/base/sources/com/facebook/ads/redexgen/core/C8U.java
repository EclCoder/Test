package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C8U implements InterfaceC2522mF {
    public static byte[] A06;
    public static String[] A07 = {"QubeI9WU03qBZcNvE4IUkWvlw0NRrBK6", "F1d068LLA73yClDAGmhas6o", "9YpbVeLOd0f6m", "7Ycu3nAZXESMUbUrutcG9271koISuOhT", "QjcyZL4t35rbWMpE5hp6oYgD7sVhkS0D", "M48I8dHdEQTg0rHaHaNT6qI1", "cVfJzOsNywAlxLknvQSr1dDTMZn5TIAU", "kJeh17rnzHgOQ2HfO7oDpw4wPPnH7lFe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C8U A01(long j10, long j11, HN hn2, C10054v c10054v) {
        int iA0L;
        int i10 = hn2.A04;
        int i11 = hn2.A03;
        int iA0C = c10054v.A0C();
        if ((iA0C & 1) != 1 || (iA0L = c10054v.A0L()) == 0) {
            return null;
        }
        long jA0U = C5C.A0U(iA0L, ((long) i10) * 1000000, i11);
        if ((iA0C & 6) != 6) {
            return new C8U(j11, hn2.A02, jA0U);
        }
        long jA0Q = c10054v.A0Q();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c10054v.A0I();
        }
        if (j10 != -1 && j10 != j11 + jA0Q) {
            AbstractC09904g.A07(A02(27, 10, 78), A02(2, 25, 105) + j10 + A02(0, 2, 40) + (j11 + jA0Q));
        }
        return new C8U(j11, hn2.A02, jA0U, jA0Q, jArr);
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[2] = "La6";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 30);
            i13++;
        }
    }

    public static void A03() {
        A06 = new byte[]{114, 102, -33, -48, -43, -50, -89, -21, -24, -5, -24, -89, -6, -16, 1, -20, -89, -12, -16, -6, -12, -24, -5, -22, -17, -63, -89, -60, -43, -38, -45, -65, -47, -47, -41, -47, -34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j10) {
        double d10;
        if (!AAj()) {
            return new HX(new HZ(0L, this.A03 + ((long) this.A00)));
        }
        long jA0T = C5C.A0T(j10, 0L, this.A04);
        double d11 = (jA0T * 100.0d) / this.A04;
        if (d11 <= 0.0d) {
            d10 = 0.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
        } else {
            int i10 = (int) d11;
            long[] jArr = (long[]) AbstractC09823y.A02(this.A05);
            double d12 = jArr[i10];
            d10 = (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d11 - ((double) i10))) + d12;
        }
        return new HX(new HZ(jA0T, this.A03 + C5C.A0T(Math.round((d10 / 256.0d) * this.A02), this.A00, this.A02 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2522mF
    public final long A9H(long j10) {
        long j11 = j10 - this.A03;
        if (!AAj() || j11 <= this.A00) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC09823y.A02(this.A05);
        double d10 = (j11 * 256.0d) / this.A02;
        int iA0L = C5C.A0L(jArr, (long) d10, true, true);
        long jA00 = A00(iA0L);
        long j12 = jArr[iA0L];
        long jA01 = A00(iA0L + 1);
        long j13 = iA0L == 99 ? 256L : jArr[iA0L + 1];
        String[] strArr = A07;
        if (strArr[0].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A07[6] = "PlWtaQzxKmV3LAe12cSeUsJTirSwbfkK";
        return Math.round((jA01 - jA00) * (j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12))) + jA00;
    }

    static {
        A03();
    }

    public C8U(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public C8U(long j10, int i10, long j11, long j12, long[] jArr) {
        this.A03 = j10;
        this.A00 = i10;
        this.A04 = j11;
        this.A05 = jArr;
        this.A02 = j12;
        this.A01 = j12 != -1 ? j10 + j12 : -1L;
    }

    private long A00(int i10) {
        return (this.A04 * ((long) i10)) / 100;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return this.A05 != null;
    }
}
