package hn;

import bm.r;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.EOFException;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bm.o f40715a = new bm.o("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean a(String str) {
        s.h(str, "<this>");
        return f40715a.h(str);
    }

    public static final byte[] b(byte[] address) {
        s.h(address, "address");
        return j(address) ? gl.j.p0(address, yl.g.m(12, 16)) : address;
    }

    public static final boolean c(String str) {
        s.h(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (s.i(cCharAt, 31) <= 0 || s.i(cCharAt, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) >= 0 || r.e0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(String str) {
        s.h(str, "<this>");
        int length = str.length();
        if (1 <= length && length < 254) {
            int i10 = 0;
            while (true) {
                String str2 = str;
                int iE0 = r.e0(str2, '.', i10, false, 4, null);
                int length2 = iE0 == -1 ? str2.length() - i10 : iE0 - i10;
                if (1 <= length2 && length2 < 64) {
                    if (iE0 == -1 || iE0 == str2.length() - 1) {
                        break;
                    }
                    i10 = iE0 + 1;
                    str = str2;
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean e(String input, int i10, int i11, byte[] address, int i12) {
        s.h(input, "input");
        s.h(address, "address");
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == address.length) {
                return false;
            }
            if (i13 != i12) {
                if (input.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = input.charAt(i14);
                if (s.i(cCharAt, 48) < 0 || s.i(cCharAt, 57) > 0) {
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
            address[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:1: B:30:0x0069->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x007b A[EDGE_INSN: B:53:0x007b->B:34:0x007b BREAK  A[LOOP:1: B:30:0x0069->B:33:0x0075], SYNTHETIC] */
    public static final byte[] f(String input, int i10, int i11) {
        int i12;
        int i13;
        int iZ;
        input = input;
        s.h(input, "input");
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i14 < i11) {
            if (i15 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && r.M(input, "::", i14, false, 4, null)) {
                if (i16 != -1) {
                    return null;
                }
                i15 += 2;
                if (i18 == i11) {
                    i16 = i15;
                    break;
                }
                i16 = i15;
                i17 = i18;
                i12 = 0;
                i14 = i17;
                while (i14 < i11) {
                    iZ = m.z(input.charAt(i14));
                    if (iZ != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iZ;
                    i14++;
                }
                i13 = i14 - i17;
                if (i13 != 0) {
                }
                return null;
            }
            if (i15 != 0) {
                if (!r.M(input, ":", i14, false, 4, null)) {
                    if (!r.M(input, ".", i14, false, 4, null) || !e(input, i17, i11, bArr, i15 - 2)) {
                        return null;
                    }
                    i15 += 2;
                    break;
                }
                i14++;
            }
            i17 = i14;
            i12 = 0;
            i14 = i17;
            while (i14 < i11) {
                iZ = m.z(input.charAt(i14));
                if (iZ != -1) {
                    break;
                }
                i12 = (i12 << 4) + iZ;
                i14++;
            }
            i13 = i14 - i17;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i19 = i15 + 1;
            bArr[i15] = (byte) ((i12 >>> 8) & 255);
            i15 += 2;
            bArr[i19] = (byte) (i12 & 255);
        }
        if (i15 != 16) {
            if (i16 == -1) {
                return null;
            }
            gl.j.f(bArr, bArr, 16 - (i15 - i16), i16, i15);
            gl.j.r(bArr, (byte) 0, i16, (16 - i15) + i16);
        }
        return bArr;
    }

    public static final String g(String host) throws EOFException {
        s.h(host, "host");
        xn.e eVarN = new xn.e().N(host);
        xn.e eVar = new xn.e();
        while (!eVarN.n0()) {
            if (!qn.b.a().c(eVarN.Y0(), eVar)) {
                return null;
            }
        }
        eVarN.N(l.a(eVar.X0()));
        qn.d dVar = qn.d.f50919a;
        String strC = dVar.c(eVarN.X0());
        if (strC != null && s.c(strC, l.a(strC))) {
            return dVar.e(strC);
        }
        return null;
    }

    public static final String h(byte[] address) {
        s.h(address, "address");
        if (address.length == 4) {
            return new xn.e().a0(m.b(address[0], 255)).writeByte(46).a0(m.b(address[1], 255)).writeByte(46).a0(m.b(address[2], 255)).writeByte(46).a0(m.b(address[3], 255)).X0();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final String i(byte[] address) {
        s.h(address, "address");
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < address.length) {
            int i14 = i12;
            while (i14 < 16 && address[i14] == 0 && address[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        xn.e eVar = new xn.e();
        while (i11 < address.length) {
            if (i11 == i10) {
                eVar.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    eVar.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    eVar.writeByte(58);
                }
                eVar.A0((m.b(address[i11], 255) << 8) | m.b(address[i11 + 1], 255));
                i11 += 2;
            }
        }
        return eVar.X0();
    }

    private static final boolean j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i10 = 0; i10 < 10; i10++) {
            if (bArr[i10] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final String k(String str) {
        s.h(str, "<this>");
        if (!r.T(str, ":", false, 2, null)) {
            String strG = g(str);
            if (strG == null || strG.length() == 0 || c(strG) || d(strG)) {
                return null;
            }
            return strG;
        }
        byte[] bArrF = (r.N(str, "[", false, 2, null) && r.z(str, "]", false, 2, null)) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (bArrF == null) {
            return null;
        }
        byte[] bArrB = b(bArrF);
        if (bArrB.length == 16) {
            return i(bArrB);
        }
        if (bArrB.length == 4) {
            return h(bArrB);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
