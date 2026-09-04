package com.bytedance.sdk.component.hn.hnj.hn;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ojm {
    public static final Charset hnj = Charset.forName(C.UTF8_NAME);

    public static int hn(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static int hnj(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059 A[LOOP:1: B:30:0x004d->B:33:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x005f A[EDGE_INSN: B:58:0x005f->B:34:0x005f BREAK  A[LOOP:1: B:30:0x004d->B:33:0x0059], SYNTHETIC] */
    private static InetAddress qor(String str, int i10, int i11) {
        int i12;
        int i13;
        int iHnj;
        byte[] bArr = new byte[16];
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (i10 < i11) {
            if (i14 == 16) {
                return null;
            }
            int i17 = i10 + 2;
            if (i17 <= i11 && str.regionMatches(i10, "::", 0, 2)) {
                if (i15 != -1) {
                    return null;
                }
                i14 += 2;
                i15 = i14;
                if (i17 == i11) {
                    break;
                }
                i16 = i17;
                i12 = 0;
                i10 = i16;
                while (i10 < i11) {
                    iHnj = hnj(str.charAt(i10));
                    if (iHnj != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iHnj;
                    i10++;
                }
                i13 = i10 - i16;
                if (i13 != 0) {
                }
                return null;
            }
            if (i14 != 0) {
                if (!str.regionMatches(i10, ":", 0, 1)) {
                    if (!str.regionMatches(i10, ".", 0, 1) || !hnj(str, i16, i11, bArr, i14 - 2)) {
                        return null;
                    }
                    i14 += 2;
                    break;
                }
                i10++;
            }
            i16 = i10;
            i12 = 0;
            i10 = i16;
            while (i10 < i11) {
                iHnj = hnj(str.charAt(i10));
                if (iHnj != -1) {
                    break;
                }
                i12 = (i12 << 4) + iHnj;
                i10++;
            }
            i13 = i10 - i16;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i18 = i14 + 1;
            bArr[i14] = (byte) ((i12 >>> 8) & 255);
            i14 += 2;
            bArr[i18] = (byte) (i12 & 255);
        }
        if (i14 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i19 = i14 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i19, i19);
            Arrays.fill(bArr, i15, (16 - i14) + i15, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    private static boolean hn(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static void hnj(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static int hnj(String str, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int hnj(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int hnj(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String hnj(String str) {
        InetAddress inetAddressQor;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                inetAddressQor = qor(str, 1, str.length() - 1);
            } else {
                inetAddressQor = qor(str, 0, str.length());
            }
            if (inetAddressQor == null) {
                return null;
            }
            byte[] address = inetAddressQor.getAddress();
            if (address.length == 16) {
                return hnj(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty() || hn(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean hnj(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    private static String hnj(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        hnj hnjVar = new hnj();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                hnjVar.hn(58);
                i11 += i13;
                if (i11 == 16) {
                    hnjVar.hn(58);
                }
            } else {
                if (i11 > 0) {
                    hnjVar.hn(58);
                }
                hnjVar.hn(((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i11 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                i11 += 2;
            }
        }
        return hnjVar.qor();
    }

    public static boolean hnj(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }
}
