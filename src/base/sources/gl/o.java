package gl;

import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import wc.XtO.NpmRNZ;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends m {
    public static List A0(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final List B0(long[] jArr) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static List C0(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return new ArrayList(t.i(objArr, false, 1, null));
    }

    public static final List D0(boolean[] zArr) {
        kotlin.jvm.internal.s.h(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static final Set E0(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? (Set) s0(objArr, new LinkedHashSet(n0.e(objArr.length))) : t0.c(objArr[0]);
        }
        return u0.d();
    }

    public static Iterable F0(final Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return new h0(new tl.a() { // from class: gl.n
            @Override // tl.a
            public final Object invoke() {
                return o.G0(objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator G0(Object[] objArr) {
        return kotlin.jvm.internal.c.a(objArr);
    }

    public static boolean L(byte[] bArr, byte b10) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        return Y(bArr, b10) >= 0;
    }

    public static boolean M(char[] cArr, char c10) {
        kotlin.jvm.internal.s.h(cArr, "<this>");
        return Z(cArr, c10) >= 0;
    }

    public static boolean N(int[] iArr, int i10) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        return a0(iArr, i10) >= 0;
    }

    public static boolean O(long[] jArr, long j10) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        return b0(jArr, j10) >= 0;
    }

    public static boolean P(Object[] objArr, Object obj) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return c0(objArr, obj) >= 0;
    }

    public static boolean Q(short[] sArr, short s10) {
        kotlin.jvm.internal.s.h(sArr, "<this>");
        return d0(sArr, s10) >= 0;
    }

    public static List R(Object[] objArr, int i10) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        if (i10 >= 0) {
            return r0(objArr, yl.g.d(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List S(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return (List) T(objArr, new ArrayList());
    }

    public static final Collection T(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static int U(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int V(long[] jArr) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int W(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object X(Object[] objArr, int i10) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static final int Y(byte[] bArr, byte b10) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static int a0(int[] iArr, int i10) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int b0(long[] jArr, long j10) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static int c0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (kotlin.jvm.internal.s.c(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int d0(short[] sArr, short s10) {
        kotlin.jvm.internal.s.h(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final Appendable e0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        kotlin.jvm.internal.s.h(buffer, "buffer");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable g0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        kotlin.jvm.internal.s.h(buffer, "buffer");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            bm.r.a(buffer, obj, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String h0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        return ((StringBuilder) e0(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static final String i0(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        kotlin.jvm.internal.s.h(fArr, "<this>");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        return ((StringBuilder) f0(fArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static final String j0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        kotlin.jvm.internal.s.h(separator, "separator");
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        return ((StringBuilder) g0(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String k0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return h0(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public static /* synthetic */ String l0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return i0(fArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }

    public static char n0(char[] cArr) {
        kotlin.jvm.internal.s.h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object o0(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static byte[] p0(byte[] bArr, yl.f indices) {
        kotlin.jvm.internal.s.h(bArr, "<this>");
        kotlin.jvm.internal.s.h(indices, "indices");
        return indices.isEmpty() ? new byte[0] : m.p(bArr, indices.m().intValue(), indices.k().intValue() + 1);
    }

    public static List q0(Object[] objArr, int i10) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return t.l();
        }
        if (i10 >= objArr.length) {
            return x0(objArr);
        }
        if (i10 == 1) {
            return s.e(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    public static final List r0(Object[] objArr, int i10) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return t.l();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return x0(objArr);
        }
        if (i10 == 1) {
            return s.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static final Collection s0(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        kotlin.jvm.internal.s.h(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static HashSet t0(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        return (HashSet) s0(objArr, new HashSet(n0.e(objArr.length)));
    }

    public static List u0(float[] fArr) {
        kotlin.jvm.internal.s.h(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? z0(fArr) : s.e(Float.valueOf(fArr[0]));
        }
        return t.l();
    }

    public static List v0(int[] iArr) {
        kotlin.jvm.internal.s.h(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? A0(iArr) : s.e(Integer.valueOf(iArr[0]));
        }
        return t.l();
    }

    public static List w0(long[] jArr) {
        kotlin.jvm.internal.s.h(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? B0(jArr) : s.e(Long.valueOf(jArr[0]));
        }
        return t.l();
    }

    public static List x0(Object[] objArr) {
        kotlin.jvm.internal.s.h(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? C0(objArr) : s.e(objArr[0]);
        }
        return t.l();
    }

    public static List y0(boolean[] zArr) {
        kotlin.jvm.internal.s.h(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? D0(zArr) : s.e(Boolean.valueOf(zArr[0]));
        }
        return t.l();
    }

    public static final List z0(float[] fArr) {
        kotlin.jvm.internal.s.h(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final int Z(char[] cArr, char c10) {
        kotlin.jvm.internal.s.h(cArr, mTFeqtajA.vcdhPlpZAEHDta);
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final Appendable f0(float[] fArr, Appendable buffer, CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) throws IOException {
        kotlin.jvm.internal.s.h(fArr, "<this>");
        kotlin.jvm.internal.s.h(buffer, "buffer");
        kotlin.jvm.internal.s.h(charSequence, NpmRNZ.PTfuvDzMaIBb);
        kotlin.jvm.internal.s.h(prefix, "prefix");
        kotlin.jvm.internal.s.h(postfix, "postfix");
        kotlin.jvm.internal.s.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (float f10 : fArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append((CharSequence) function1.invoke(Float.valueOf(f10)));
            } else {
                buffer.append(String.valueOf(f10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String m0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        int i12 = i11 & 2;
        String str = mDXVAtwcaFMHJ.yNAdKWH;
        if (i12 != 0) {
            charSequence2 = str;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = str;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return j0(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function2);
    }
}
