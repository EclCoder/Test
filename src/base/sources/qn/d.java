package qn;

import bm.r;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s;
import xn.e;
import xn.h;
import yl.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f50919a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50920b = "xn--";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f50921c = h.f56912d.d("xn--");

    private d() {
    }

    private final int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / 700 : i10 / 2;
        int i13 = i12 + (i12 / i11);
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return i14 + ((i13 * 36) / (i13 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List b(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (bm.a.f(iCharAt)) {
                int i12 = i10 + 1;
                char cCharAt = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = C.DEFAULT_BUFFER_SEGMENT_SIZE + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i10++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean d(String str, int i10, int i11, e eVar) {
        int i12;
        int i13;
        int i14;
        int i15 = 1;
        if (!r.D(str, i10, f50920b, 0, 4, true)) {
            eVar.Q(str, i10, i11);
            return true;
        }
        int i16 = i10 + 4;
        ArrayList arrayList = new ArrayList();
        int iK0 = r.k0(str, '-', i11, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        int i17 = 0;
        if (iK0 >= i16) {
            while (i16 < iK0) {
                int i18 = i16 + 1;
                char cCharAt = str.charAt(i16);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i16 = i18;
            }
            i16++;
        }
        int i19 = 128;
        int iA = 72;
        int i20 = 0;
        while (i16 < i11) {
            int i21 = i15;
            boolean z10 = i17;
            yl.d dVarL = g.l(g.m(36, Integer.MAX_VALUE), 36);
            int iA2 = dVarL.a();
            int iB = dVarL.b();
            int iD = dVarL.d();
            if ((iD > 0 && iA2 <= iB) || (iD < 0 && iB <= iA2)) {
                i12 = i20;
                int i22 = i21;
                while (i16 != i11) {
                    int i23 = i16 + 1;
                    char cCharAt2 = str.charAt(i16);
                    if ('a' <= cCharAt2 && cCharAt2 < c12) {
                        i13 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c11) {
                        i13 = cCharAt2 - 'A';
                    } else {
                        if (c10 > cCharAt2 || cCharAt2 >= ':') {
                            return z10;
                        }
                        i13 = cCharAt2 - 22;
                    }
                    int i24 = i22;
                    int i25 = i13 * i24;
                    int i26 = i12;
                    if (i26 > Integer.MAX_VALUE - i25) {
                        return z10;
                    }
                    i12 = i26 + i25;
                    if (iA2 <= iA) {
                        i14 = i21;
                    } else {
                        i14 = iA2 >= iA + 26 ? 26 : iA2 - iA;
                    }
                    if (i13 >= i14) {
                        int i27 = 36 - i14;
                        if (i24 > Integer.MAX_VALUE / i27) {
                            return z10;
                        }
                        i22 = i24 * i27;
                        if (iA2 != iB) {
                            iA2 += iD;
                            i16 = i23;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i16 = i23;
                }
                return z10;
            }
            i12 = i20;
            iA = a(i12 - i20, arrayList.size() + 1, i20 == 0 ? i21 : z10 ? 1 : 0);
            int size = i12 / (arrayList.size() + 1);
            if (i19 > Integer.MAX_VALUE - size) {
                return z10;
            }
            i19 += size;
            int size2 = i12 % (arrayList.size() + 1);
            if (i19 > 1114111) {
                return z10;
            }
            arrayList.add(size2, Integer.valueOf(i19));
            i20 = size2 + 1;
            i17 = z10 ? 1 : 0;
            i15 = i21;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        boolean z11 = i15;
        int size3 = arrayList.size();
        while (i17 < size3) {
            Object obj = arrayList.get(i17);
            i17++;
            eVar.D(((Number) obj).intValue());
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean f(String str, int i10, int i11, e eVar) {
        int i12;
        int i13;
        int i14;
        int i15 = 1;
        if (!h(str, i10, i11)) {
            eVar.Q(str, i10, i11);
            return true;
        }
        eVar.k0(f50921c);
        List listB = b(str, i10, i11);
        Iterator it = listB.iterator();
        int i16 = 0;
        while (true) {
            i12 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue < 128) {
                eVar.writeByte(iIntValue);
                i16++;
            }
        }
        if (i16 > 0) {
            eVar.writeByte(45);
        }
        int iA = 72;
        int i17 = 0;
        int i18 = i16;
        while (i18 < listB.size()) {
            Iterator it2 = listB.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i12) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i12) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i19 = (iIntValue4 - i12) * (i18 + 1);
            if (i17 > Integer.MAX_VALUE - i19) {
                return false;
            }
            int i20 = i17 + i19;
            Iterator it3 = listB.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = ((Number) it3.next()).intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i20 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i20++;
                } else if (iIntValue5 == iIntValue4) {
                    yl.d dVarL = g.l(g.m(36, Integer.MAX_VALUE), 36);
                    int iA2 = dVarL.a();
                    int iB = dVarL.b();
                    int iD = dVarL.d();
                    if ((iD > 0 && iA2 <= iB) || (iD < 0 && iB <= iA2)) {
                        i14 = i20;
                        while (true) {
                            if (iA2 <= iA) {
                                i13 = i15;
                            } else {
                                i13 = i15;
                                i15 = iA2 >= iA + 26 ? 26 : iA2 - iA;
                            }
                            if (i14 < i15) {
                                break;
                            }
                            int i21 = i14 - i15;
                            int i22 = 36 - i15;
                            eVar.writeByte(g(i15 + (i21 % i22)));
                            i14 = i21 / i22;
                            if (iA2 == iB) {
                                break;
                            }
                            iA2 += iD;
                            i15 = i13;
                        }
                    } else {
                        i13 = i15;
                        i14 = i20;
                    }
                    eVar.writeByte(g(i14));
                    int i23 = i18 + 1;
                    iA = a(i20, i23, i18 == i16 ? i13 : false);
                    i18 = i23;
                    i20 = 0;
                    i15 = i13;
                }
            }
            i17 = i20 + 1;
            i12 = iIntValue4 + 1;
        }
        return i15;
    }

    private final int g(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    private final boolean h(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final String c(String string) {
        s.h(string, "string");
        int length = string.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iE0 = r.e0(str, '.', i10, false, 4, null);
            if (iE0 == -1) {
                iE0 = length;
            }
            if (!d(str, i10, iE0, eVar)) {
                return null;
            }
            if (iE0 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = iE0 + 1;
            string = str;
        }
        return eVar.X0();
    }

    public final String e(String string) {
        s.h(string, "string");
        int length = string.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iE0 = r.e0(str, '.', i10, false, 4, null);
            if (iE0 == -1) {
                iE0 = length;
            }
            if (!f(str, i10, iE0, eVar)) {
                return null;
            }
            if (iE0 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = iE0 + 1;
            string = str;
        }
        return eVar.X0();
    }
}
