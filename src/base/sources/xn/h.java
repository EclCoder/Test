package xn;

import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class h implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56912d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f56913e = new h(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f56914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f56915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient String f56916c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ h g(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = bArr.length;
            }
            return aVar.f(bArr, i10, i11);
        }

        public final h a(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            byte[] bArrA = xn.a.a(str);
            if (bArrA != null) {
                return new h(bArrA);
            }
            return null;
        }

        public final h b(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((yn.c.b(str.charAt(i11)) << 4) + yn.c.b(str.charAt(i11 + 1)));
            }
            return new h(bArr);
        }

        public final h c(String str, Charset charset) {
            kotlin.jvm.internal.s.h(str, "<this>");
            kotlin.jvm.internal.s.h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
            return new h(bytes);
        }

        public final h d(String str) {
            kotlin.jvm.internal.s.h(str, "<this>");
            h hVar = new h(u0.a(str));
            hVar.B(str);
            return hVar;
        }

        public final h e(byte... data) {
            kotlin.jvm.internal.s.h(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.s.g(bArrCopyOf, "copyOf(...)");
            return new h(bArrCopyOf);
        }

        public final h f(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.s.h(bArr, "<this>");
            b.b(bArr.length, i10, i11);
            return new h(gl.j.p(bArr, i10, i11 + i10));
        }

        public final h h(InputStream inputStream, int i10) throws IOException {
            kotlin.jvm.internal.s.h(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new h(bArr);
        }

        private a() {
        }
    }

    public h(byte[] data) {
        kotlin.jvm.internal.s.h(data, "data");
        this.f56914a = data;
    }

    public static /* synthetic */ h H(h hVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = hVar.D();
        }
        return hVar.G(i10, i11);
    }

    public static final h h(String str) {
        return f56912d.d(str);
    }

    public static /* synthetic */ int r(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return hVar.p(hVar2, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        h hVarH = f56912d.h(objectInputStream, objectInputStream.readInt());
        Field declaredField = h.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, hVarH.f56914a);
    }

    public static /* synthetic */ int w(h hVar, h hVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = hVar.D();
        }
        return hVar.u(hVar2, i10);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f56914a.length);
        objectOutputStream.write(this.f56914a);
    }

    public final void A(int i10) {
        this.f56915b = i10;
    }

    public final void B(String str) {
        this.f56916c = str;
    }

    public final h C() {
        return g("SHA-256");
    }

    public final int D() {
        return m();
    }

    public final boolean E(h prefix) {
        kotlin.jvm.internal.s.h(prefix, "prefix");
        return y(0, prefix, 0, prefix.D());
    }

    public String F(Charset charset) {
        kotlin.jvm.internal.s.h(charset, "charset");
        return new String(this.f56914a, charset);
    }

    public h G(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (i11 <= k().length) {
            if (i11 - i10 >= 0) {
                return (i10 == 0 && i11 == k().length) ? this : new h(gl.j.p(k(), i10, i11));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + k().length + ')').toString());
    }

    public h I() {
        for (int i10 = 0; i10 < k().length; i10++) {
            byte b10 = k()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrK = k();
                byte[] bArrCopyOf = Arrays.copyOf(bArrK, bArrK.length);
                kotlin.jvm.internal.s.g(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] J() {
        byte[] bArrK = k();
        byte[] bArrCopyOf = Arrays.copyOf(bArrK, bArrK.length);
        kotlin.jvm.internal.s.g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public String K() {
        String strN = n();
        if (strN != null) {
            return strN;
        }
        String strC = u0.c(s());
        B(strC);
        return strC;
    }

    public void L(e buffer, int i10, int i11) {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        yn.b.c(this, buffer, i10, i11);
    }

    public String d() {
        return xn.a.c(k(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(h other) {
        kotlin.jvm.internal.s.h(other, "other");
        int iD = D();
        int iD2 = other.D();
        int iMin = Math.min(iD, iD2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iJ = j(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iJ2 = other.j(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iJ != iJ2) {
                return iJ < iJ2 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.D() == k().length && hVar.z(0, k(), 0, k().length)) {
                return true;
            }
        }
        return false;
    }

    public h g(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.s.h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f56914a, 0, D());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.s.e(bArrDigest);
        return new h(bArrDigest);
    }

    public int hashCode() {
        int iL = l();
        if (iL != 0) {
            return iL;
        }
        int iHashCode = Arrays.hashCode(k());
        A(iHashCode);
        return iHashCode;
    }

    public final boolean i(h suffix) {
        kotlin.jvm.internal.s.h(suffix, "suffix");
        return y(D() - suffix.D(), suffix, 0, suffix.D());
    }

    public final byte j(int i10) {
        return t(i10);
    }

    public final byte[] k() {
        return this.f56914a;
    }

    public final int l() {
        return this.f56915b;
    }

    public int m() {
        return k().length;
    }

    public final String n() {
        return this.f56916c;
    }

    public String o() {
        char[] cArr = new char[k().length * 2];
        int i10 = 0;
        for (byte b10 : k()) {
            int i11 = i10 + 1;
            cArr[i10] = yn.b.d()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = yn.b.d()[b10 & 15];
        }
        return bm.r.u(cArr);
    }

    public final int p(h other, int i10) {
        kotlin.jvm.internal.s.h(other, "other");
        return q(other.s(), i10);
    }

    public int q(byte[] other, int i10) {
        kotlin.jvm.internal.s.h(other, "other");
        int length = k().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(k(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] s() {
        return k();
    }

    public byte t(int i10) {
        return k()[i10];
    }

    public String toString() {
        if (k().length == 0) {
            return "[size=0]";
        }
        int iB = yn.b.b(k(), 64);
        if (iB != -1) {
            String strK = K();
            String strSubstring = strK.substring(0, iB);
            kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
            String strI = bm.r.I(bm.r.I(bm.r.I(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iB >= strK.length()) {
                return "[text=" + strI + ']';
            }
            return "[size=" + k().length + " text=" + strI + "…]";
        }
        if (k().length <= 64) {
            return "[hex=" + o() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(k().length);
        sb2.append(" hex=");
        if (64 <= k().length) {
            sb2.append((64 == k().length ? this : new h(gl.j.p(k(), 0, 64))).o());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + k().length + ')').toString());
    }

    public final int u(h other, int i10) {
        kotlin.jvm.internal.s.h(other, "other");
        return v(other.s(), i10);
    }

    public int v(byte[] other, int i10) {
        kotlin.jvm.internal.s.h(other, "other");
        for (int iMin = Math.min(i10, k().length - other.length); -1 < iMin; iMin--) {
            if (b.a(k(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean y(int i10, h other, int i11, int i12) {
        kotlin.jvm.internal.s.h(other, "other");
        return other.z(i11, k(), i10, i12);
    }

    public boolean z(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.s.h(other, "other");
        return i10 >= 0 && i10 <= k().length - i12 && i11 >= 0 && i11 <= other.length - i12 && b.a(k(), i10, other, i11, i12);
    }

    public final h x() {
        return g(UHbHibBvYxKnPE.goikunTbBym);
    }
}
