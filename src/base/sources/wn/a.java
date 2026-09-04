package wn;

import bm.d;
import bm.r;
import com.inmobi.media.core.config.models.AdConfig;
import fl.g0;
import hn.m;
import java.io.EOFException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.s;
import xn.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f56372a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        s.h(str, "<this>");
        s.h(encodeSet, "encodeSet");
        return d(str, i10, i11, encodeSet, z10, z11, z12, z13, null, 128, null);
    }

    public static /* synthetic */ String b(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return a(str, i10, i11, str2, z10, z11, z12, z13);
    }

    public static final String c(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        s.h(str, "<this>");
        s.h(encodeSet, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || r.S(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                e eVar = new e();
                eVar.Q(str, i10, iCharCount);
                h(eVar, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                return eVar.X0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return c(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    public static final boolean e(String str, int i10, int i11) {
        s.h(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && m.z(str.charAt(i10 + 1)) != -1 && m.z(str.charAt(i12)) != -1;
    }

    public static final String f(String str, int i10, int i11, boolean z10) {
        s.h(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                e eVar = new e();
                eVar.Q(str, i10, i12);
                i(eVar, str, i12, i11, z10);
                return eVar.X0();
            }
        }
        String strSubstring = str.substring(i10, i11);
        s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String g(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return f(str, i10, i11, z10);
    }

    public static final void h(e eVar, String input, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        s.h(eVar, "<this>");
        s.h(input, "input");
        s.h(encodeSet, "encodeSet");
        e eVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = input.codePointAt(i10);
            if (z10 && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                g0 g0Var = g0.f38750a;
            } else {
                if (iCodePointAt == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    eVar.N("+");
                } else if (iCodePointAt == 43 && z12) {
                    eVar.N(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || r.S(encodeSet, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z10 || (z11 && !e(input, i10, i11)))))) {
                    if (eVar2 == null) {
                        eVar2 = new e();
                    }
                    if (charset == null || s.c(charset, d.f9079b)) {
                        eVar2.D(iCodePointAt);
                    } else {
                        eVar2.m1(input, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!eVar2.n0()) {
                        byte b10 = eVar2.readByte();
                        int i12 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        eVar.writeByte(37);
                        char[] cArr = f56372a;
                        eVar.writeByte(cArr[(i12 >> 4) & 15]);
                        eVar.writeByte(cArr[b10 & 15]);
                    }
                    g0 g0Var2 = g0.f38750a;
                } else {
                    eVar.D(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static final void i(e eVar, String encoded, int i10, int i11, boolean z10) {
        int i12;
        s.h(eVar, "<this>");
        s.h(encoded, "encoded");
        while (i10 < i11) {
            int iCodePointAt = encoded.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iZ = m.z(encoded.charAt(i10 + 1));
                int iZ2 = m.z(encoded.charAt(i12));
                if (iZ == -1 || iZ2 == -1) {
                    eVar.D(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    eVar.writeByte((iZ << 4) + iZ2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                eVar.writeByte(32);
                i10++;
            } else {
                eVar.D(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
