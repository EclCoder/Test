package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1297Gv {
    public static byte[] A06;
    public static String[] A07 = {"f", "7N0kip4m3flPJ4wRylUb66l3ycty4bLO", "ZrqOCWQk631j6sxAoqisBRdwge9gr5QF", "2DRaKiCosA9Zs551XHqRbpaUmywwD6L7", "dzNr4lbarI8PqRX9M2ICRMrM1SnLdD", "nBYqh81NM1tC", "zWHuac", "46iX5XNzwkY5yhjGLtKEm3XHMbBVctSm"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1297Gv A00(C10054v c10054v) throws C3K {
        try {
            c10054v.A0g(4);
            int iA0I = (c10054v.A0I() & 3) + 1;
            if (iA0I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0I2 = c10054v.A0I() & 31;
            for (int i10 = 0; i10 < iA0I2; i10++) {
                arrayList.add(A03(c10054v));
            }
            int iA0I3 = c10054v.A0I();
            String[] strArr = A07;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[1] = "rQ6g8gs4UtzNEdd6WIb5nHQ3c92ce055";
            for (int i11 = 0; i11 < iA0I3; i11++) {
                arrayList.add(A03(c10054v));
            }
            int i12 = -1;
            int i13 = -1;
            float f10 = 1.0f;
            String strA01 = null;
            if (iA0I2 > 0) {
                HR hrA09 = HS.A09((byte[]) arrayList.get(0), iA0I, ((byte[]) arrayList.get(0)).length);
                i12 = hrA09.A0A;
                i13 = hrA09.A03;
                f10 = hrA09.A00;
                strA01 = AnonymousClass46.A01(hrA09.A08, hrA09.A01, hrA09.A04);
            }
            return new C1297Gv(arrayList, iA0I, i12, i13, f10, strA01);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C3K.A01(A01(0, 24, 51), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-106, -61, -61, -64, -61, 113, -63, -78, -61, -60, -70, -65, -72, 113, -110, -89, -108, 113, -76, -64, -65, -73, -70, -72};
    }

    static {
        A02();
    }

    public C1297Gv(List<byte[]> initializationData, int i10, int i11, int i12, float f10, String str) {
        this.A05 = initializationData;
        this.A02 = i10;
        this.A03 = i11;
        this.A01 = i12;
        this.A00 = f10;
        this.A04 = str;
    }

    public static byte[] A03(C10054v c10054v) {
        int iA0M = c10054v.A0M();
        int offset = c10054v.A09();
        c10054v.A0g(iA0M);
        return AnonymousClass46.A07(c10054v.A0l(), offset, iA0M);
    }
}
