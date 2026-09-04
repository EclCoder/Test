package com.mbridge.msdk.foundation.tools;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f30947a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f30948b = new byte[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f30949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f30950d;

    static {
        HashMap map = new HashMap();
        f30949c = map;
        map.put('A', 'v');
        f30949c.put('B', 'S');
        f30949c.put('C', 'o');
        f30949c.put('D', 'a');
        f30949c.put('E', 'j');
        f30949c.put('F', 'c');
        f30949c.put('G', '7');
        f30949c.put('H', 'd');
        f30949c.put('I', 'R');
        f30949c.put('J', 'z');
        f30949c.put('K', 'p');
        f30949c.put('L', 'W');
        f30949c.put('M', 'i');
        f30949c.put('N', 'f');
        f30949c.put('O', 'G');
        f30949c.put('P', 'y');
        f30949c.put('Q', 'N');
        f30949c.put('R', 'x');
        f30949c.put('S', 'Z');
        f30949c.put('T', 'n');
        f30949c.put('U', 'V');
        f30949c.put('V', '5');
        f30949c.put('W', 'k');
        f30949c.put('X', '+');
        f30949c.put('Y', 'D');
        f30949c.put('Z', 'H');
        f30949c.put('a', 'L');
        f30949c.put('b', 'Y');
        f30949c.put('c', 'h');
        f30949c.put('d', 'J');
        f30949c.put('e', '4');
        f30949c.put('f', '6');
        f30949c.put('g', 'l');
        f30949c.put('h', 't');
        f30949c.put('i', '0');
        f30949c.put('j', 'U');
        f30949c.put('k', '3');
        f30949c.put('l', 'Q');
        f30949c.put('m', 'r');
        f30949c.put('n', 'g');
        f30949c.put('o', 'E');
        f30949c.put('p', 'u');
        f30949c.put('q', 'q');
        f30949c.put('r', '8');
        f30949c.put('s', 's');
        f30949c.put('t', 'w');
        f30949c.put('u', '/');
        f30949c.put('v', 'X');
        f30949c.put('w', 'M');
        f30949c.put('x', 'e');
        f30949c.put('y', 'B');
        f30949c.put('z', 'A');
        f30949c.put('0', 'T');
        f30949c.put('1', '2');
        f30949c.put('2', 'F');
        f30949c.put('3', 'b');
        f30949c.put('4', '9');
        f30949c.put('5', 'P');
        f30949c.put('6', '1');
        f30949c.put('7', 'O');
        f30949c.put('8', 'I');
        f30949c.put('9', 'K');
        f30949c.put('+', 'm');
        f30949c.put('/', 'C');
        f30950d = new char[64];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = f30947a;
            if (i11 >= cArr.length) {
                break;
            }
            f30950d[i11] = f30949c.get(Character.valueOf(cArr[i11])).charValue();
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr = f30948b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 127;
            i12++;
        }
        while (true) {
            char[] cArr2 = f30950d;
            if (i10 >= cArr2.length) {
                return;
            }
            f30948b[cArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f30948b;
            byte b10 = bArr2[cArr[0]];
            byte b11 = bArr2[cArr[1]];
            byte b12 = bArr2[c12];
            byte b13 = bArr2[c10];
            if (c11 == 1) {
                bArr[i10] = (byte) (((b11 >> 4) & 3) | ((b10 << 2) & 252));
                return 1;
            }
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b11 >> 4)) | ((b10 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b11 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b12 >> 2) & 15));
                return 2;
            }
            if (c11 != 3) {
                throw new RuntimeException("Internal Error");
            }
            bArr[i10] = (byte) (((b10 << 2) & 252) | ((b11 >> 4) & 3));
            bArr[i10 + 1] = (byte) (((b11 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b12 >> 2) & 15));
            bArr[i10 + 2] = (byte) (((b12 << 6) & PsExtractor.AUDIO_STREAM) | (b13 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length <= 0) {
            return null;
        }
        return new String(bArrA);
    }

    public static String c(String str) {
        return a(str.getBytes());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    public static byte[] a(String str) {
        int i10;
        int i11;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i12 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i12];
            int i13 = 0;
            int iA = 0;
            int i14 = 0;
            while (i13 < length) {
                int i15 = i13 + 256;
                if (i15 <= length) {
                    str.getChars(i13, i15, cArr, i14);
                    i10 = i14 + 256;
                } else {
                    str.getChars(i13, length, cArr, i14);
                    i10 = (length - i13) + i14;
                }
                int i16 = i14;
                while (i14 < i10) {
                    char c10 = cArr[i14];
                    if (c10 != '=') {
                        byte[] bArr2 = f30948b;
                        if (c10 < bArr2.length && bArr2[c10] != 127) {
                            i11 = i16 + 1;
                            cArr[i16] = c10;
                            if (i11 == 4) {
                                iA += a(cArr, bArr, iA);
                                i16 = 0;
                            } else {
                                i16 = i11;
                            }
                        }
                    } else {
                        i11 = i16 + 1;
                        cArr[i16] = c10;
                        if (i11 == 4) {
                            iA += a(cArr, bArr, iA);
                            i16 = 0;
                        } else {
                            i16 = i11;
                        }
                    }
                    i14++;
                }
                i13 = i15;
                i14 = i16;
            }
            if (iA == i12) {
                return bArr;
            }
            byte[] bArr3 = new byte[iA];
            System.arraycopy(bArr, 0, bArr3, 0, iA);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i11 / 3) << 2) + 4];
            int i12 = 0;
            while (i11 >= 3) {
                int i13 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr2 = f30950d;
                cArr[i12] = cArr2[i13 >> 18];
                cArr[i12 + 1] = cArr2[(i13 >> 12) & 63];
                int i14 = i12 + 3;
                cArr[i12 + 2] = cArr2[(i13 >> 6) & 63];
                i12 += 4;
                cArr[i14] = cArr2[i13 & 63];
                i10 += 3;
                i11 -= 3;
            }
            if (i11 == 1) {
                int i15 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                char[] cArr3 = f30950d;
                cArr[i12] = cArr3[i15 >> 2];
                cArr[i12 + 1] = cArr3[(i15 << 4) & 63];
                int i16 = i12 + 3;
                cArr[i12 + 2] = '=';
                i12 += 4;
                cArr[i16] = '=';
            } else if (i11 == 2) {
                int i17 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr4 = f30950d;
                cArr[i12] = cArr4[i17 >> 10];
                cArr[i12 + 1] = cArr4[(i17 >> 4) & 63];
                int i18 = i12 + 3;
                cArr[i12 + 2] = cArr4[(i17 << 2) & 63];
                i12 += 4;
                cArr[i18] = '=';
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }
}
