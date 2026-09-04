package dm;

import bm.f;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class c extends b {
    public static final void f(String str, int i10) {
        s.h(str, "<this>");
        if (str.charAt(i10) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i10 + ", but was '" + str.charAt(i10) + '\'').toString());
    }

    public static final void g(long j10, byte[] dst, int i10, int i11, int i12) {
        s.h(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = f.d()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            dst[i10] = (byte) (i15 >> 8);
            i10 += 2;
            dst[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        s.f(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i10);
        s.g(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    public static final a i(String hexString) {
        s.h(hexString, "hexString");
        return a.f36989c.a(f.f(hexString, 0, 16, null, 4, null), f.f(hexString, 16, 32, null, 4, null));
    }

    public static final a j(String hexDashString) {
        s.h(hexDashString, "hexDashString");
        long jF = f.f(hexDashString, 0, 8, null, 4, null);
        f(hexDashString, 8);
        long jF2 = f.f(hexDashString, 9, 13, null, 4, null);
        f(hexDashString, 13);
        long jF3 = f.f(hexDashString, 14, 18, null, 4, null);
        f(hexDashString, 18);
        long jF4 = f.f(hexDashString, 19, 23, null, 4, null);
        f(hexDashString, 23);
        return a.f36989c.a((jF2 << 16) | (jF << 32) | jF3, (jF4 << 48) | f.f(hexDashString, 24, 36, null, 4, null));
    }
}
