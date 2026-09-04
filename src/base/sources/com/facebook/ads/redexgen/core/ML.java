package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ML {
    public static byte[] A0V;
    public static String[] A0W = {"lVJcyHuE1PJb579Sb1LAAlg5vS4NZYMV", "qyLkbqfl0JpOOnDgJdZjiTPjgkzmhXwK", "qCNdEz7ripOZNNb3yCY8Ki49zW8UWRt4", "Cjqz4QIw8w0k6KevPFem8GYP4yUKgFOK", "ptM4eVx6M57F8Ll6MNcW2L659ErB2sOY", "McIwIiSAB", "OKPGVpQZykPiX00cv", "DTBK8GKi"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final MJ A0G;
    public final MK A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final Map<String, String> A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 89);
            if (A0W[4].charAt(24) == 'w') {
                throw new RuntimeException();
            }
            A0W[3] = "PXVGXjtmkErHxa13ZrhtcOEvw3ek";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0V = new byte[]{72, 68};
    }

    static {
        A01();
    }

    public ML() {
        this(A00(0, 0, 39), -1L, false, -1, -1, -1, -1, false, false, -1, -1L, new MK(), false, -1, -1, -1L, -1L, -1, null, -1, null, null, MJ.A02, -1, false, A00(0, 0, 39), A00(0, 0, 39), A00(0, 0, 39), null, -1L, -1L);
    }

    public ML(ML ml2) {
        this(ml2, ml2.A0M);
    }

    public ML(ML ml2, String str) {
        this(ml2.A0L, ml2.A0A, ml2.A0S, ml2.A08, ml2.A07, ml2.A00, ml2.A09, ml2.A0U, ml2.A0R, ml2.A05, ml2.A0C, ml2.A0H, ml2.A0T, ml2.A06, ml2.A02, ml2.A0E, ml2.A0B, ml2.A01, ml2.A0P, ml2.A04, ml2.A0J, ml2.A0I, ml2.A0G, ml2.A03, ml2.A0Q, ml2.A0N, ml2.A0K, ml2.A0O, str, -1L, -1L);
    }

    public ML(String str, long j10, boolean z10, int i10, int i11, int i12, int i13, boolean z11, boolean z12, int i14, long j11, MK mk2, boolean z13, int i15, int i16, long j12, long j13, int i17, Map<String, String> map, int i18, String str2, String str3, MJ mj2, int i19, boolean z14, String str4, String str5, String str6, String str7, long j14, long j15) {
        this.A0P = new HashMap();
        this.A0L = str;
        this.A0A = j10;
        this.A0S = z10;
        this.A08 = i10;
        this.A07 = i11;
        this.A00 = i12;
        this.A09 = i13;
        this.A0U = z11;
        this.A0R = z12;
        this.A05 = i14;
        this.A0C = j11;
        this.A0H = mk2;
        this.A0T = z13;
        this.A06 = i15;
        this.A02 = i16;
        this.A0E = j12;
        this.A0B = j13;
        this.A01 = i17;
        this.A04 = i18;
        this.A0I = str3;
        this.A0J = str2;
        if (map != null) {
            this.A0P.putAll(map);
        }
        this.A0G = mj2;
        this.A03 = i19;
        this.A0Q = z14;
        this.A0N = str4;
        this.A0K = str5;
        this.A0O = str6;
        this.A0M = str7;
        this.A0F = j14;
        this.A0D = j15;
    }

    public final String toString() {
        StringBuilder sbAppend = new StringBuilder().append(this.A0L);
        String strA00 = A00(0, 2, 61);
        return sbAppend.append(strA00).append(this.A0A).append(strA00).append(this.A0S).append(strA00).append(this.A08).append(strA00).append(this.A07).append(strA00).append(this.A00).append(strA00).append(this.A09).append(strA00).append(this.A0U).append(strA00).append(this.A0R).append(strA00).append(this.A05).append(strA00).append(this.A0E).append(strA00).append(this.A0B).append(strA00).append(this.A01).append(strA00).append(this.A04).append(strA00).append(this.A06).append(strA00).append(this.A02).append(strA00).append(this.A03).append(strA00).append(this.A0Q).append(strA00).append(this.A0N).toString();
    }
}
