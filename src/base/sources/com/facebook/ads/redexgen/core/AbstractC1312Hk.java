package com.facebook.ads.redexgen.core;

import android.util.Base64;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1312Hk {
    public static byte[] A00;
    public static String[] A01 = {"AQUfun8uWtpAPz6T54JXA8DVdz19i7cg", "A9xQ060X7I53O0IPhfx7pChTdPn89BVs", "HA6OUY8aFXslM4giueBriDg2S", "9RrkKnX7ioGd8UIKmUAG7ayOJ1mW6fCZ", "mjtW7HF4JFIVQBQAuWhSkP1cuiqQ", "mMlJtFouJ3Md3SAWQWV0HJ1iYftjtiDS", "", "7UUPgjEseHhf3IW21ENlLsXr9tr9mert"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1311Hj A06(C10054v c10054v) throws C3K {
        A0C(1, c10054v, false);
        int iA0F = c10054v.A0F();
        int iA0I = c10054v.A0I();
        int iA0F2 = c10054v.A0F();
        int iA0E = c10054v.A0E();
        if (iA0E <= 0) {
            iA0E = -1;
        }
        int iA0E2 = c10054v.A0E();
        if (iA0E2 <= 0) {
            iA0E2 = -1;
        }
        int iA0E3 = c10054v.A0E();
        if (iA0E3 <= 0) {
            iA0E3 = -1;
            String[] strArr = A01;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "";
            strArr2[4] = "hx6vx8O5nOwfxHxHuzSsxOXMbdPf";
        }
        int iA0I2 = c10054v.A0I();
        return new C1311Hj(iA0F, iA0I, iA0F2, iA0E, iA0E2, iA0E3, (int) Math.pow(2.0d, iA0I2 & 15), (int) Math.pow(2.0d, (iA0I2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (c10054v.A0I() & 1) > 0, Arrays.copyOf(c10054v.A0l(), c10054v.A0A()));
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{107, 25, 62, 54, 51, 58, 59, 127, 43, 48, 127, 47, 62, 45, 44, 58, 127, 9, 48, 45, 61, 54, 44, 127, 60, 48, 50, 50, 58, 49, 43, 101, 127, 40, 15, 7, 2, 11, 10, 78, 26, 1, 78, 30, 15, 28, 29, 11, 78, 24, 1, 28, 12, 7, 29, 78, 30, 7, 13, 26, 27, 28, 11, 118, 126, 111, 122, 127, 122, 111, 122, 100, 121, 119, 116, 120, 112, 100, 107, 114, 120, 111, 110, 105, 126, 62, 7, 26, 10, 1, 27, 61, 28, 1, 4, 58, 39, 47, 58, 60, 43, 58, 59, 127, 60, 55, 62, 45, 62, 60, 43, 58, 45, 44, 127, 120, 41, 48, 45, 61, 54, 44, 120, 64, 93, 85, 64, 70, 81, 64, 65, 5, 70, 74, 65, 64, 5, 71, 74, 74, 78, 5, 81, 74, 5, 86, 81, 68, 87, 81, 5, 82, 76, 81, 77, 5, 126, 21, 93, 16, 19, 9, 5, 21, 93, 17, 22, 9, 5, 21, 93, 17, 23, 120, 5, 68, 81, 5, 62, 35, 43, 62, 56, 47, 62, 63, 123, 51, 62, 58, 63, 62, 41, 123, 47, 34, 43, 62, 123, 107, 97, 98, 98, 127, 45, 121, 116, 125, 104, 45, 106, 127, 104, 108, 121, 104, 127, 45, 121, 101, 108, 99, 45, 60, 45, 99, 98, 121, 45, 105, 104, 110, 98, 105, 108, 111, 97, 104, 55, 45, 97, 117, 102, 106, 110, 105, 96, 39, 101, 110, 115, 39, 102, 97, 115, 98, 117, 39, 106, 104, 99, 98, 116, 39, 105, 104, 115, 39, 116, 98, 115, 39, 102, 116, 39, 98, 127, 119, 98, 100, 115, 98, 99, 38, 50, 33, 45, 41, 46, 39, 96, 34, 41, 52, 96, 37, 56, 48, 37, 35, 52, 37, 36, 96, 52, 47, 96, 34, 37, 96, 51, 37, 52, 2, 1, 1, 5, 27, 30, 78, 26, 23, 30, 11, 78, 9, 28, 11, 15, 26, 11, 28, 78, 26, 6, 15, 0, 78, 92, 78, 0, 1, 26, 78, 10, 11, 13, 1, 10, 15, 12, 2, 11, 84, 78, 56, 52, 37, 37, 60, 59, 50, 117, 33, 44, 37, 48, 117, 58, 33, 61, 48, 39, 117, 33, 61, 52, 59, 117, 101, 117, 59, 58, 33, 117, 38, 32, 37, 37, 58, 39, 33, 48, 49, 111, 117, 108, 112, 125, 127, 121, 116, 115, 112, 120, 121, 110, 60, 115, 122, 60, 104, 117, 113, 121, 60, 120, 115, 113, 125, 117, 114, 60, 104, 110, 125, 114, 111, 122, 115, 110, 113, 111, 60, 114, 115, 104, 60, 102, 121, 110, 115, 121, 120, 60, 115, 105, 104, 64, 87, 65, 91, 86, 71, 87, 102, 75, 66, 87, 18, 85, 64, 87, 83, 70, 87, 64, 18, 70, 90, 83, 92, 18, 0, 18, 91, 65, 18, 92, 93, 70, 18, 86, 87, 81, 93, 86, 83, 80, 94, 87, 93, 70, 9, 91, 76, 90, 76, 91, 95, 76, 77, 9, 75, 64, 93, 90, 9, 68, 92, 90, 93, 9, 75, 76, 9, 83, 76, 91, 70, 9, 72, 79, 93, 76, 91, 9, 68, 72, 89, 89, 64, 71, 78, 9, 74, 70, 92, 89, 69, 64, 71, 78, 9, 90, 93, 76, 89, 90, 16, 11, 11, 68, 23, 12, 11, 22, 16, 68, 12, 1, 5, 0, 1, 22, 94, 68};
    }

    static {
        A08();
    }

    public static int A00(int i10) {
        int val = 0;
        while (i10 > 0) {
            val++;
            i10 >>>= 1;
        }
        return val;
    }

    public static long A01(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static Metadata A02(List<String> list) {
        List<String> vorbisComments = new ArrayList<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrA1P = C5C.A1P(str, A07(0, 1, 56));
            int length = strArrA1P.length;
            String strA07 = A07(85, 10, 6);
            if (length != 2) {
                AbstractC09904g.A07(strA07, A07(1, 32, 49) + str);
            } else {
                String[] strArr = A01;
                String str2 = strArr[6];
                String str3 = strArr[4];
                int i11 = str2.length();
                if (i11 == str3.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "";
                strArr2[4] = "IFt3u6Tbn0k1mtPtGSJYRwNJh6dv";
                if (strArrA1P[0].equals(A07(63, 22, 85))) {
                    try {
                        vorbisComments.add(PictureFrame.A00(new C10054v(Base64.decode(strArrA1P[1], 0))));
                    } catch (RuntimeException e10) {
                        AbstractC09904g.A0A(strA07, A07(33, 30, 0), e10);
                    }
                } else {
                    vorbisComments.add(new VorbisComment(strArrA1P[0], strArrA1P[1]));
                }
            }
        }
        if (vorbisComments.isEmpty()) {
            return null;
        }
        return new Metadata(vorbisComments);
    }

    public static C1308Hg A03(C1307Hf c1307Hf) throws C3K {
        long jA01;
        if (c1307Hf.A02(24) == 5653314) {
            int iA02 = c1307Hf.A02(16);
            int lookupType = c1307Hf.A02(24);
            long[] jArr = new long[lookupType];
            boolean zA04 = c1307Hf.A04();
            if (!zA04) {
                boolean zA05 = c1307Hf.A04();
                for (int i10 = 0; i10 < entries; i10++) {
                    if (zA05) {
                        if (c1307Hf.A04()) {
                            int entries = c1307Hf.A02(5);
                            jArr[i10] = entries + 1;
                        } else {
                            String[] strArr = A01;
                            String str = strArr[7];
                            String str2 = strArr[0];
                            int dimensions = str.charAt(2);
                            int entries2 = str2.charAt(2);
                            if (dimensions != entries2) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A01;
                            strArr2[7] = "HkUiXrMYXoP7dmmSwm7TlUKenEWhRSa7";
                            strArr2[0] = "g3UzzRsN8l9NwZbA9Pl4zDU4WOGu2UFV";
                            jArr[i10] = 0;
                        }
                    } else {
                        int i11 = c1307Hf.A02(5);
                        String[] strArr3 = A01;
                        String str3 = strArr3[6];
                        String str4 = strArr3[4];
                        int dimensions2 = str3.length();
                        int entries3 = str4.length();
                        if (dimensions2 != entries3) {
                            String[] strArr4 = A01;
                            strArr4[3] = "YIXxF7uzVQ2KRDIuTFnKuNVMBeAy43Wm";
                            strArr4[1] = "ZNrvF1xji8SwPYIxx9WGKrLEtje0Ya68";
                            jArr[i10] = i11 + 1;
                        } else {
                            A01[2] = "PN1PQj6gHBTdVMYKSOEyBSZrD";
                            jArr[i10] = i11 + 1;
                        }
                    }
                }
            } else {
                int i12 = c1307Hf.A02(5);
                int i13 = i12 + 1;
                int i14 = 0;
                while (i14 < entries) {
                    int entries4 = lookupType - i14;
                    int iA03 = c1307Hf.A02(A00(entries4));
                    for (int length = 0; length < iA03; length++) {
                        int entries5 = jArr.length;
                        if (i14 >= entries5) {
                            break;
                        }
                        jArr[i14] = i13;
                        i14++;
                    }
                    i13++;
                }
            }
            int iA04 = c1307Hf.A02(4);
            if (iA04 <= 2) {
                if (iA04 == 1 || iA04 == 2) {
                    c1307Hf.A03(32);
                    c1307Hf.A03(32);
                    int iA05 = c1307Hf.A02(4) + 1;
                    c1307Hf.A03(1);
                    if (iA04 == 1) {
                        if (iA02 == 0) {
                            jA01 = 0;
                        } else {
                            long j10 = lookupType;
                            String[] strArr5 = A01;
                            String str5 = strArr5[3];
                            String str6 = strArr5[1];
                            int dimensions3 = str5.charAt(14);
                            int entries6 = str6.charAt(14);
                            if (dimensions3 != entries6) {
                                throw new RuntimeException();
                            }
                            A01[5] = "D9mmqqJmTqnxQ2dihdU3MUH7YK6oq28f";
                            jA01 = A01(j10, iA02);
                        }
                    } else {
                        jA01 = ((long) lookupType) * ((long) iA02);
                    }
                    int entries7 = (int) (((long) iA05) * jA01);
                    c1307Hf.A03(entries7);
                }
                return new C1308Hg(iA02, lookupType, jArr, iA04, zA04);
            }
            throw C3K.A01(A07(Sdk$SDKError.b.EVALUATE_JAVASCRIPT_FAILED_VALUE, 42, 0) + iA04, null);
        }
        throw C3K.A01(A07(Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE, 55, 75) + c1307Hf.A01(), null);
    }

    public static C1309Hh A04(C10054v c10054v) throws C3K {
        return A05(c10054v, true, true);
    }

    public static C1309Hh A05(C10054v c10054v, boolean z10, boolean z11) throws C3K {
        if (z10) {
            A0C(3, c10054v, false);
        }
        int length = (int) c10054v.A0O();
        String strA0W = c10054v.A0W(length);
        int length2 = strA0W.length();
        int i10 = 7 + 4 + length2;
        long jA0O = c10054v.A0O();
        int length3 = (int) jA0O;
        String[] comments = new String[length3];
        int i11 = i10 + 4;
        int i12 = 0;
        while (commentListLen < jA0O) {
            long commentListLen = c10054v.A0O();
            int length4 = (int) commentListLen;
            comments[i12] = c10054v.A0W(length4);
            int length5 = comments[i12].length();
            i11 = i11 + 4 + length5;
            i12++;
        }
        if (z11) {
            int length6 = c10054v.A0I();
            if ((length6 & 1) == 0) {
                String vendor = A07(283, 30, 46);
                throw C3K.A01(vendor, null);
            }
        }
        return new C1309Hh(strA0W, comments, i11 + 1);
    }

    public static void A09(int i10, C1307Hf c1307Hf) throws C3K {
        int i11;
        int iA02 = c1307Hf.A02(6) + 1;
        for (int i12 = 0; i12 < iA02; i12++) {
            int iA03 = c1307Hf.A02(16);
            if (iA03 != 0) {
                AbstractC09904g.A05(A07(85, 10, 6), A07(355, 41, 59) + iA03);
            } else {
                if (c1307Hf.A04()) {
                    int iA04 = c1307Hf.A02(4);
                    String[] strArr = A01;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int iCharAt = str.charAt(2);
                    int mappingsCount = str2.charAt(2);
                    if (iCharAt == mappingsCount) {
                        A01[5] = "MSIFAaOSOQQOpmu0PO7aKrLsJb3QFagu";
                        i11 = iA04 + 1;
                    }
                    throw new RuntimeException();
                }
                i11 = 1;
                if (c1307Hf.A04()) {
                    int i13 = c1307Hf.A02(8);
                    int i14 = i13 + 1;
                    for (int i15 = 0; i15 < i14; i15++) {
                        int mappingsCount2 = i10 - 1;
                        c1307Hf.A03(A00(mappingsCount2));
                        int mappingsCount3 = i10 - 1;
                        c1307Hf.A03(A00(mappingsCount3));
                    }
                }
                int mappingsCount4 = c1307Hf.A02(2);
                if (mappingsCount4 == 0) {
                    if (i11 > 1) {
                        for (int mappingsCount5 = 0; mappingsCount5 < i10; mappingsCount5++) {
                            c1307Hf.A03(4);
                        }
                    }
                    for (int i16 = 0; i16 < i11; i16++) {
                        c1307Hf.A03(8);
                        String[] strArr2 = A01;
                        String str3 = strArr2[6];
                        String str4 = strArr2[4];
                        int length = str3.length();
                        int mappingsCount6 = str4.length();
                        if (length == mappingsCount6) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A01;
                        strArr3[3] = "W7H2tgam7pgMqyIqKZRQoufJib3tzvKG";
                        strArr3[1] = "g3J7gwvZXejdWYIpZtqDt0lnx57dRd6J";
                        c1307Hf.A03(8);
                        c1307Hf.A03(8);
                    }
                } else {
                    throw C3K.A01(A07(491, 58, 71), null);
                }
            }
        }
    }

    public static void A0A(C1307Hf c1307Hf) throws C3K {
        int iA02 = c1307Hf.A02(6) + 1;
        for (int i10 = 0; i10 < iA02; i10++) {
            int iA03 = c1307Hf.A02(16);
            switch (iA03) {
                case 0:
                    c1307Hf.A03(8);
                    c1307Hf.A03(16);
                    c1307Hf.A03(16);
                    String[] strArr = A01;
                    String str = strArr[6];
                    String str2 = strArr[4];
                    int floorCount = str.length();
                    if (floorCount == str2.length()) {
                        throw new RuntimeException();
                    }
                    A01[2] = "puZWVQ2pTjmoQkTRd3XFOd7V6";
                    c1307Hf.A03(6);
                    c1307Hf.A03(8);
                    int iA04 = c1307Hf.A02(4) + 1;
                    for (int floorCount2 = 0; floorCount2 < iA04; floorCount2++) {
                        c1307Hf.A03(8);
                    }
                    break;
                    break;
                case 1:
                    int j10 = c1307Hf.A02(5);
                    int i11 = -1;
                    int[] partitionClassList = new int[j10];
                    for (int floorCount3 = 0; floorCount3 < j10; floorCount3++) {
                        partitionClassList[floorCount3] = c1307Hf.A02(4);
                        if (partitionClassList[floorCount3] > i11) {
                            i11 = partitionClassList[floorCount3];
                        }
                    }
                    int[] iArr = new int[i11 + 1];
                    for (int j11 = 0; j11 < iArr.length; j11++) {
                        iArr[j11] = c1307Hf.A02(3) + 1;
                        int iA05 = c1307Hf.A02(2);
                        if (iA05 > 0) {
                            c1307Hf.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << iA05); floorCount4++) {
                            c1307Hf.A03(8);
                        }
                    }
                    c1307Hf.A03(2);
                    int k10 = c1307Hf.A02(4);
                    int j12 = 0;
                    int rangeBits = 0;
                    for (int count = 0; count < j10; count++) {
                        int idx = partitionClassList[count];
                        String[] strArr2 = A01;
                        String str3 = strArr2[7];
                        String str4 = strArr2[0];
                        int floorCount5 = str3.charAt(2);
                        if (floorCount5 != str4.charAt(2)) {
                            throw new RuntimeException();
                        }
                        A01[5] = "4gRGDU2vGyXCYhT5FVmyq5RWvUvygEh7";
                        j12 += iArr[idx];
                        while (rangeBits < j12) {
                            c1307Hf.A03(k10);
                            rangeBits++;
                        }
                    }
                    break;
                default:
                    throw C3K.A01(A07(199, 41, 99) + iA03, null);
            }
        }
    }

    public static void A0B(C1307Hf c1307Hf) throws C3K {
        int iA02 = c1307Hf.A02(6) + 1;
        for (int i10 = 0; i10 < iA02; i10++) {
            int residueCount = c1307Hf.A02(16);
            if (residueCount <= 2) {
                c1307Hf.A03(24);
                c1307Hf.A03(24);
                c1307Hf.A03(24);
                int iA03 = c1307Hf.A02(6) + 1;
                c1307Hf.A03(8);
                int[] iArr = new int[iA03];
                for (int i11 = 0; i11 < iA03; i11++) {
                    int residueCount2 = 0;
                    int iA04 = c1307Hf.A02(3);
                    if (c1307Hf.A04()) {
                        String[] strArr = A01;
                        String str = strArr[7];
                        String str2 = strArr[0];
                        int residueCount3 = str.charAt(2);
                        if (residueCount3 != str2.charAt(2)) {
                            throw new RuntimeException();
                        }
                        A01[5] = "QebxPehykfYMwUhUEUOD533arJF7pEEp";
                        residueCount2 = c1307Hf.A02(5);
                    }
                    iArr[i11] = (residueCount2 * 8) + iA04;
                }
                for (int i12 = 0; i12 < iA03; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        int residueCount4 = iArr[i12];
                        if ((residueCount4 & (1 << i13)) != 0) {
                            c1307Hf.A03(8);
                        }
                    }
                }
            } else {
                throw C3K.A01(A07(448, 43, 92), null);
            }
        }
    }

    public static boolean A0C(int i10, C10054v c10054v, boolean z10) throws C3K {
        if (c10054v.A07() < 7) {
            if (z10) {
                return false;
            }
            throw C3K.A01(A07(549, 18, 10) + c10054v.A07(), null);
        }
        if (c10054v.A0I() != i10) {
            if (z10) {
                return false;
            }
            throw C3K.A01(A07(178, 21, 53) + Integer.toHexString(i10), null);
        }
        if (c10054v.A0I() != 118 || c10054v.A0I() != 111 || c10054v.A0I() != 114 || c10054v.A0I() != 98 || c10054v.A0I() != 105 || c10054v.A0I() != 115) {
            if (z10) {
                return false;
            }
            throw C3K.A01(A07(95, 28, 49), null);
        }
        return true;
    }

    public static C1310Hi[] A0D(C10054v c10054v, int i10) throws C3K {
        A0C(5, c10054v, false);
        int iA0I = c10054v.A0I() + 1;
        C1307Hf c1307Hf = new C1307Hf(c10054v.A0l());
        int numberOfBooks = c10054v.A09();
        c1307Hf.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < iA0I; numberOfBooks2++) {
            A03(c1307Hf);
        }
        int numberOfBooks3 = c1307Hf.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i11 = 0; i11 < timeCount; i11++) {
            int numberOfBooks4 = c1307Hf.A02(16);
            if (numberOfBooks4 != 0) {
                throw C3K.A01(A07(396, 52, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE), null);
            }
        }
        A0A(c1307Hf);
        A0B(c1307Hf);
        A09(i10, c1307Hf);
        C1310Hi[] c1310HiArrA0E = A0E(c1307Hf);
        if (c1307Hf.A04()) {
            return c1310HiArrA0E;
        }
        throw C3K.A01(A07(PsExtractor.VIDEO_STREAM_MASK, 43, 105), null);
    }

    public static C1310Hi[] A0E(C1307Hf c1307Hf) {
        int iA02 = c1307Hf.A02(6) + 1;
        C1310Hi[] c1310HiArr = new C1310Hi[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            boolean zA04 = c1307Hf.A04();
            int iA03 = c1307Hf.A02(16);
            int i10 = c1307Hf.A02(16);
            c1310HiArr[windowType] = new C1310Hi(zA04, iA03, i10, c1307Hf.A02(8));
        }
        return c1310HiArr;
    }
}
