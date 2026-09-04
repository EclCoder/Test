package xn;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class n0 extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f56966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f56967g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(byte[][] segments, int[] directory) {
        super(h.f56913e.k());
        kotlin.jvm.internal.s.h(segments, "segments");
        kotlin.jvm.internal.s.h(directory, "directory");
        this.f56966f = segments;
        this.f56967g = directory;
    }

    private final h O() {
        return new h(J());
    }

    private final Object writeReplace() {
        h hVarO = O();
        kotlin.jvm.internal.s.f(hVarO, "null cannot be cast to non-null type java.lang.Object");
        return hVarO;
    }

    @Override // xn.h
    public String F(Charset charset) {
        kotlin.jvm.internal.s.h(charset, "charset");
        return O().F(charset);
    }

    @Override // xn.h
    public h G(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (i11 > D()) {
            throw new IllegalArgumentException(("endIndex=" + i11 + " > length(" + D() + ')').toString());
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + i11 + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && i11 == D()) {
            return this;
        }
        if (i10 == i11) {
            return h.f56913e;
        }
        int iB = yn.g.b(this, i10);
        int iB2 = yn.g.b(this, i11 - 1);
        byte[][] bArr = (byte[][]) gl.j.q(N(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(M()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = M()[N().length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? M()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new n0(bArr, iArr);
    }

    @Override // xn.h
    public h I() {
        return O().I();
    }

    @Override // xn.h
    public byte[] J() {
        byte[] bArr = new byte[D()];
        int length = N().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = M()[length + i10];
            int i14 = M()[i10];
            int i15 = i14 - i11;
            gl.j.f(N()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // xn.h
    public void L(e buffer, int i10, int i11) {
        kotlin.jvm.internal.s.h(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = yn.g.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : M()[iB - 1];
            int i14 = M()[iB] - i13;
            int i15 = M()[N().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            l0 l0Var = new l0(N()[iB], i16, i16 + iMin, true, false);
            l0 l0Var2 = buffer.f56903a;
            if (l0Var2 == null) {
                l0Var.f56958g = l0Var;
                l0Var.f56957f = l0Var;
                buffer.f56903a = l0Var;
            } else {
                kotlin.jvm.internal.s.e(l0Var2);
                l0 l0Var3 = l0Var2.f56958g;
                kotlin.jvm.internal.s.e(l0Var3);
                l0Var3.c(l0Var);
            }
            i10 += iMin;
            iB++;
        }
        buffer.Z0(buffer.size() + ((long) i11));
    }

    public final int[] M() {
        return this.f56967g;
    }

    public final byte[][] N() {
        return this.f56966f;
    }

    @Override // xn.h
    public String d() {
        return O().d();
    }

    @Override // xn.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.D() == D() && y(0, hVar, 0, D())) {
                return true;
            }
        }
        return false;
    }

    @Override // xn.h
    public h g(String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.s.h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = N().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = M()[length + i10];
            int i13 = M()[i10];
            messageDigest.update(N()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.s.e(bArrDigest);
        return new h(bArrDigest);
    }

    @Override // xn.h
    public int hashCode() {
        int iL = l();
        if (iL != 0) {
            return iL;
        }
        int length = N().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = M()[length + i10];
            int i14 = M()[i10];
            byte[] bArr = N()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        A(i11);
        return i11;
    }

    @Override // xn.h
    public int m() {
        return M()[N().length - 1];
    }

    @Override // xn.h
    public String o() {
        return O().o();
    }

    @Override // xn.h
    public int q(byte[] other, int i10) {
        kotlin.jvm.internal.s.h(other, "other");
        return O().q(other, i10);
    }

    @Override // xn.h
    public byte[] s() {
        return J();
    }

    @Override // xn.h
    public byte t(int i10) {
        b.b(M()[N().length - 1], i10, 1L);
        int iB = yn.g.b(this, i10);
        return N()[iB][(i10 - (iB == 0 ? 0 : M()[iB - 1])) + M()[N().length + iB]];
    }

    @Override // xn.h
    public String toString() {
        return O().toString();
    }

    @Override // xn.h
    public int v(byte[] other, int i10) {
        kotlin.jvm.internal.s.h(other, "other");
        return O().v(other, i10);
    }

    @Override // xn.h
    public boolean y(int i10, h other, int i11, int i12) {
        kotlin.jvm.internal.s.h(other, "other");
        if (i10 < 0 || i10 > D() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = yn.g.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : M()[iB - 1];
            int i15 = M()[iB] - i14;
            int i16 = M()[N().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.z(i11, N()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // xn.h
    public boolean z(int i10, byte[] other, int i11, int i12) {
        kotlin.jvm.internal.s.h(other, "other");
        if (i10 < 0 || i10 > D() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = yn.g.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : M()[iB - 1];
            int i15 = M()[iB] - i14;
            int i16 = M()[N().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!b.a(N()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }
}
