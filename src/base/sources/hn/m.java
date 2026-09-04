package hn;

import bm.r;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import fl.g0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import tn.xQIL.Saucuwx;
import xn.f0;
import xn.h0;
import xn.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f40716a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f0 f40717b;

    static {
        f0.a aVar = f0.f56907d;
        xn.h.a aVar2 = xn.h.f56912d;
        f40717b = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe0000"), aVar2.b("fffe"), aVar2.b("0000feff"));
    }

    public static final int A(xn.g gVar) {
        s.h(gVar, "<this>");
        return b(gVar.readByte(), 255) | (b(gVar.readByte(), 255) << 16) | (b(gVar.readByte(), 255) << 8);
    }

    public static final int B(xn.e eVar, byte b10) throws EOFException {
        s.h(eVar, "<this>");
        int i10 = 0;
        while (!eVar.n0() && eVar.c0(0L) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final long C(String str, long j10) {
        s.h(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int D(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String E(String str, int i10, int i11) {
        s.h(str, "<this>");
        int iQ = q(str, i10, i11);
        String strSubstring = str.substring(iQ, s(str, iQ, i11));
        s.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String F(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return E(str, i10, i11);
    }

    public static final Throwable G(Exception exc, List suppressed) {
        s.h(exc, "<this>");
        s.h(suppressed, "suppressed");
        Iterator it = suppressed.iterator();
        while (it.hasNext()) {
            fl.e.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void H(xn.f fVar, int i10) {
        s.h(fVar, "<this>");
        fVar.writeByte((i10 >>> 16) & 255);
        fVar.writeByte((i10 >>> 8) & 255);
        fVar.writeByte(i10 & 255);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void f(Closeable closeable) {
        s.h(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] g(String[] strArr, String value) {
        s.h(strArr, "<this>");
        s.h(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        s.g(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[gl.j.W(strArr2)] = value;
        return strArr2;
    }

    public static final void h(xn.l lVar, h0 directory) throws IOException {
        s.h(lVar, "<this>");
        s.h(directory, "directory");
        try {
            IOException iOException = null;
            for (h0 h0Var : lVar.r(directory)) {
                try {
                    if (lVar.s(h0Var).e()) {
                        h(lVar, h0Var);
                    }
                    lVar.l(h0Var);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(xn.l lVar, h0 path) {
        s.h(lVar, "<this>");
        s.h(path, "path");
        try {
            lVar.l(path);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(String str, char c10, int i10, int i11) {
        s.h(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int k(String str, String delimiters, int i10, int i11) {
        s.h(str, "<this>");
        s.h(delimiters, "delimiters");
        while (i10 < i11) {
            if (r.S(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int l(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return j(str, c10, i10, i11);
    }

    public static final f0 m() {
        return f40717b;
    }

    public static final boolean n(String[] strArr, String[] strArr2, Comparator comparator) {
        s.h(strArr, "<this>");
        s.h(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int o(String[] strArr, String value, Comparator comparator) {
        s.h(strArr, "<this>");
        s.h(value, "value");
        s.h(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int p(String str) {
        s.h(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (s.i(cCharAt, 31) <= 0 || s.i(cCharAt, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int q(String str, int i10, int i11) {
        s.h(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return q(str, i10, i11);
    }

    public static final int s(String str, int i10, int i11) {
        s.h(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int t(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return s(str, i10, i11);
    }

    public static final int u(String str, int i10) {
        s.h(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final List v(Iterable a10, Iterable b10) {
        s.h(a10, "a");
        s.h(b10, "b");
        Iterator it = a10.iterator();
        Iterator it2 = b10.iterator();
        List listC = gl.r.c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return gl.r.a(listC);
            }
            if (it.hasNext()) {
                listC.add(it.next());
            }
            if (it2.hasNext()) {
                listC.add(it2.next());
            }
        }
    }

    public static final String[] w(String[] strArr, String[] other, Comparator comparator) {
        s.h(strArr, "<this>");
        s.h(other, "other");
        s.h(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    /* JADX WARN: Code duplicated, block: B:26:0x0038  */
    public static final boolean x(xn.l lVar, h0 file) throws Throwable {
        Throwable th2;
        s.h(lVar, "<this>");
        s.h(file, "file");
        o0 o0VarD0 = lVar.d0(file);
        try {
            try {
                lVar.l(file);
                if (o0VarD0 != null) {
                    try {
                        o0VarD0.close();
                    } catch (Throwable unused) {
                    }
                }
                return true;
            } catch (IOException unused2) {
                g0 g0Var = g0.f38750a;
                if (o0VarD0 != null) {
                    try {
                        o0VarD0.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                        if (th2 != null) {
                            throw th2;
                        }
                        lVar.l(file);
                        return false;
                    }
                }
                th2 = null;
                if (th2 != null) {
                    throw th2;
                }
                lVar.l(file);
                return false;
            }
        } catch (Throwable th4) {
            if (o0VarD0 != null) {
                try {
                    o0VarD0.close();
                } catch (Throwable th5) {
                    fl.e.a(th4, th5);
                }
            }
            th2 = th4;
            if (th2 != null) {
                throw th2;
            }
            lVar.l(file);
            return false;
        }
    }

    public static final boolean y(String name) {
        s.h(name, "name");
        return r.A(name, "Authorization", true) || r.A(name, "Cookie", true) || r.A(name, "Proxy-Authorization", true) || r.A(name, "Set-Cookie", true);
    }

    public static final int z(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final void a(List list, Object obj) {
        s.h(list, Saucuwx.SmioUB);
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }
}
