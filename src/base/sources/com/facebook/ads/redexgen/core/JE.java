package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class JE {
    public static byte[] A05;
    public static String[] A06 = {"OUufb3XpwzKYnlflZdZ6sRl07O4y2xde", "sKTdS4Xom3soESmXE0UV17qKIdPOParu", "kk23Dr8l3bATGrEguhsdZQtf", "3jRjB5CH7VItg40f0wyJnaKmLrgr1NBM", "BH8vD2JIXWvofCU6hHaybnU4mVSHqFOc", "vohsQcTTzwLv029o6bcJNqcBVW1DxWoo", "Jn5KmPxuP80vuetXL26eN8MkgXOAz5Tn", "UdULkD"};
    public int A00;
    public final InterfaceC1305Hd A01;
    public final C1306He A02;
    public final JO A03;
    public final JR A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].charAt(29) == strArr[4].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "SmGAr1wQXpWbqjnIPPUcEk3V";
            strArr2[7] = "BndLoX";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
            i13++;
        }
    }

    public static void A01() {
        A05 = new byte[]{-20, 0, -17, -12, -6, -70, -1, -3, 0, -16, -72, -13, -17};
    }

    static {
        A01();
    }

    public JE(JO jo2, JR jr, InterfaceC1305Hd interfaceC1305Hd) {
        C1306He c1306He;
        this.A03 = jo2;
        this.A04 = jr;
        this.A01 = interfaceC1305Hd;
        if (A00(0, 13, 34).equals(jo2.A07.A0W)) {
            c1306He = new C1306He();
        } else {
            c1306He = null;
        }
        this.A02 = c1306He;
    }
}
