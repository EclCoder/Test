package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1371Js {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, 13, 1, 32, 21, 24, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A04(long j10, C10054v c10054v, InterfaceC1305Hd[] interfaceC1305HdArr) {
        int iA0I = c10054v.A0I();
        if ((iA0I & 64) != 0) {
            c10054v.A0g(1);
            int i10 = (iA0I & 31) * 3;
            int iA09 = c10054v.A09();
            for (InterfaceC1305Hd interfaceC1305Hd : interfaceC1305HdArr) {
                c10054v.A0f(iA09);
                interfaceC1305Hd.AIr(c10054v, i10);
                interfaceC1305Hd.AIu(j10, 1, i10, 0, null);
            }
        }
    }

    static {
        A02();
    }

    public static int A00(C10054v c10054v) {
        int i10 = 0;
        while (value != 0) {
            int iA0I = c10054v.A0I();
            i10 += iA0I;
            int b10 = A01[3].length();
            if (b10 == 4) {
                throw new RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (iA0I != 255) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j10, C10054v c10054v, InterfaceC1305Hd[] interfaceC1305HdArr) {
        while (true) {
            if (c10054v.A07() > 1) {
                int iA00 = A00(c10054v);
                int iA01 = A00(c10054v);
                int iA09 = c10054v.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c10054v.A07();
                    if (iA01 > payloadType) {
                        AbstractC09904g.A07(A01(0, 7, 109), A01(7, 45, 69));
                        iA09 = c10054v.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int userIdentifier = c10054v.A0I();
                        int providerCode = c10054v.A0M();
                        int countryCode = 0;
                        if (providerCode == 49) {
                            countryCode = c10054v.A0C();
                        }
                        int iA0I = c10054v.A0I();
                        if (providerCode == 47) {
                            c10054v.A0g(1);
                        }
                        int i10 = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && iA0I == 3) ? 1 : 0;
                        if (providerCode == 49) {
                            int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                            i10 &= userDataTypeCode;
                        }
                        if (i10 != 0) {
                            A04(j10, c10054v, interfaceC1305HdArr);
                        }
                    }
                } else {
                    AbstractC09904g.A07(A01(0, 7, 109), A01(7, 45, 69));
                    iA09 = c10054v.A0A();
                }
                c10054v.A0f(iA09);
            } else {
                return;
            }
        }
    }
}
