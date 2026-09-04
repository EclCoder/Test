package xn;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f56903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f56904b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends OutputStream {
        b() {
        }

        public String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            e.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) {
            kotlin.jvm.internal.s.h(data, "data");
            e.this.write(data, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    private final void U0(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            l0 l0VarC1 = c1(1);
            int i10 = inputStream.read(l0VarC1.f56952a, l0VarC1.f56954c, (int) Math.min(j10, 8192 - l0VarC1.f56954c));
            if (i10 == -1) {
                if (l0VarC1.f56953b == l0VarC1.f56954c) {
                    this.f56903a = l0VarC1.b();
                    m0.b(l0VarC1);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            l0VarC1.f56954c += i10;
            long j11 = i10;
            this.f56904b += j11;
            j10 -= j11;
        }
    }

    public static /* synthetic */ e p1(e eVar, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = eVar.f56904b;
        }
        return eVar.o1(outputStream, j10);
    }

    @Override // xn.g
    public h B0() {
        return f0(size());
    }

    @Override // xn.f
    public long C0(q0 source) {
        kotlin.jvm.internal.s.h(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // xn.g
    public long D0(o0 sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.W(this, size);
        }
        return size;
    }

    public OutputStream F0() {
        return new b();
    }

    @Override // xn.g
    public int H0() {
        return xn.b.c(readInt());
    }

    @Override // xn.g
    public String I() {
        long jD0 = d0((byte) 10);
        if (jD0 != -1) {
            return yn.a.g(this, jD0);
        }
        if (size() != 0) {
            return e0(size());
        }
        return null;
    }

    @Override // xn.g
    public String K(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jG0 = g0((byte) 10, 0L, j11);
        if (jG0 != -1) {
            return yn.a.g(this, jG0);
        }
        if (j11 < size() && c0(j11 - 1) == 13 && c0(j11) == 10) {
            return yn.a.g(this, j11);
        }
        e eVar = new e();
        r(eVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + eVar.B0().o() + (char) 8230);
    }

    public boolean K0(long j10, h bytes, int i10, int i11) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return i11 >= 0 && j10 >= 0 && ((long) i11) + j10 <= size() && i10 >= 0 && i10 + i11 <= bytes.D() && (i11 == 0 || yn.a.b(this, bytes, j10, j10 + 1, i10, i11) != -1);
    }

    public byte[] N0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // xn.g
    public String R() {
        return K(Long.MAX_VALUE);
    }

    @Override // xn.g
    public long R0() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            l0 l0Var = this.f56903a;
            kotlin.jvm.internal.s.e(l0Var);
            byte[] bArr = l0Var.f56952a;
            int i12 = l0Var.f56953b;
            int i13 = l0Var.f56954c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + xn.b.f(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new e().A0(j10).writeByte(b10).X0());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f56903a = l0Var.b();
                m0.b(l0Var);
            } else {
                l0Var.f56953b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f56903a != null);
        Z0(size() - ((long) i11));
        return j10;
    }

    @Override // xn.g
    public short S() {
        return xn.b.e(readShort());
    }

    @Override // xn.g
    public InputStream S0() {
        return new a();
    }

    public final e T0(InputStream input) throws IOException {
        kotlin.jvm.internal.s.h(input, "input");
        U0(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // xn.g
    public long V() {
        return xn.b.d(V0());
    }

    public long V0() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        int i10 = l0Var.f56953b;
        int i11 = l0Var.f56954c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = l0Var.f56952a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        Z0(size() - 8);
        if (i13 != i11) {
            l0Var.f56953b = i13;
            return j11;
        }
        this.f56903a = l0Var.b();
        m0.b(l0Var);
        return j11;
    }

    @Override // xn.o0
    public void W(e source, long j10) {
        l0 l0Var;
        kotlin.jvm.internal.s.h(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        xn.b.b(source.size(), 0L, j10);
        while (j10 > 0) {
            l0 l0Var2 = source.f56903a;
            kotlin.jvm.internal.s.e(l0Var2);
            int i10 = l0Var2.f56954c;
            l0 l0Var3 = source.f56903a;
            kotlin.jvm.internal.s.e(l0Var3);
            if (j10 < i10 - l0Var3.f56953b) {
                l0 l0Var4 = this.f56903a;
                if (l0Var4 != null) {
                    kotlin.jvm.internal.s.e(l0Var4);
                    l0Var = l0Var4.f56958g;
                } else {
                    l0Var = null;
                }
                if (l0Var != null && l0Var.f56956e) {
                    if ((((long) l0Var.f56954c) + j10) - ((long) (l0Var.f56955d ? 0 : l0Var.f56953b)) <= 8192) {
                        l0 l0Var5 = source.f56903a;
                        kotlin.jvm.internal.s.e(l0Var5);
                        l0Var5.f(l0Var, (int) j10);
                        source.Z0(source.size() - j10);
                        Z0(size() + j10);
                        return;
                    }
                }
                l0 l0Var6 = source.f56903a;
                kotlin.jvm.internal.s.e(l0Var6);
                source.f56903a = l0Var6.e((int) j10);
            }
            l0 l0Var7 = source.f56903a;
            kotlin.jvm.internal.s.e(l0Var7);
            long j11 = l0Var7.f56954c - l0Var7.f56953b;
            source.f56903a = l0Var7.b();
            l0 l0Var8 = this.f56903a;
            if (l0Var8 == null) {
                this.f56903a = l0Var7;
                l0Var7.f56958g = l0Var7;
                l0Var7.f56957f = l0Var7;
            } else {
                kotlin.jvm.internal.s.e(l0Var8);
                l0 l0Var9 = l0Var8.f56958g;
                kotlin.jvm.internal.s.e(l0Var9);
                l0Var9.c(l0Var7).a();
            }
            source.Z0(source.size() - j11);
            Z0(size() + j11);
            j10 -= j11;
        }
    }

    public String W0(long j10, Charset charset) throws EOFException {
        kotlin.jvm.internal.s.h(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f56904b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        int i10 = l0Var.f56953b;
        if (((long) i10) + j10 > l0Var.f56954c) {
            return new String(N0(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(l0Var.f56952a, i10, i11, charset);
        int i12 = l0Var.f56953b + i11;
        l0Var.f56953b = i12;
        this.f56904b -= j10;
        if (i12 == l0Var.f56954c) {
            this.f56903a = l0Var.b();
            m0.b(l0Var);
        }
        return str;
    }

    @Override // xn.g
    public long X(h bytes) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return i0(bytes, 0L);
    }

    public String X0() {
        return W0(this.f56904b, bm.d.f9079b);
    }

    public int Y0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte bC0 = c0(0L);
        if ((bC0 & 128) == 0) {
            i10 = bC0 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bC0 & 224) == 192) {
            i10 = bC0 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bC0 & 240) == 224) {
            i10 = bC0 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bC0 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bC0 & 7;
            i11 = 4;
            i12 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + xn.b.f(bC0) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bC1 = c0(j11);
            if ((bC1 & 192) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bC1 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Override // xn.g
    public void Z(long j10) throws EOFException {
        if (this.f56904b < j10) {
            throw new EOFException();
        }
    }

    public final void Z0(long j10) {
        this.f56904b = j10;
    }

    public final h a1() {
        if (size() <= 2147483647L) {
            return b1((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final h b1(int i10) {
        if (i10 == 0) {
            return h.f56913e;
        }
        xn.b.b(size(), 0L, i10);
        l0 l0Var = this.f56903a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.s.e(l0Var);
            int i14 = l0Var.f56954c;
            int i15 = l0Var.f56953b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            l0Var = l0Var.f56957f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        l0 l0Var2 = this.f56903a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.s.e(l0Var2);
            bArr[i16] = l0Var2.f56952a;
            i11 += l0Var2.f56954c - l0Var2.f56953b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = l0Var2.f56953b;
            l0Var2.f56955d = true;
            i16++;
            l0Var2 = l0Var2.f56957f;
        }
        return new n0(bArr, iArr);
    }

    public final byte c0(long j10) {
        xn.b.b(size(), j10, 1L);
        l0 l0Var = this.f56903a;
        if (l0Var == null) {
            kotlin.jvm.internal.s.e(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                l0Var = l0Var.f56958g;
                kotlin.jvm.internal.s.e(l0Var);
                size -= (long) (l0Var.f56954c - l0Var.f56953b);
            }
            kotlin.jvm.internal.s.e(l0Var);
            return l0Var.f56952a[(int) ((((long) l0Var.f56953b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (l0Var.f56954c - l0Var.f56953b)) + j11;
            if (j12 > j10) {
                kotlin.jvm.internal.s.e(l0Var);
                return l0Var.f56952a[(int) ((((long) l0Var.f56953b) + j10) - j11)];
            }
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
            j11 = j12;
        }
    }

    public final l0 c1(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        l0 l0Var = this.f56903a;
        if (l0Var != null) {
            kotlin.jvm.internal.s.e(l0Var);
            l0 l0Var2 = l0Var.f56958g;
            kotlin.jvm.internal.s.e(l0Var2);
            return (l0Var2.f56954c + i10 > 8192 || !l0Var2.f56956e) ? l0Var2.c(m0.c()) : l0Var2;
        }
        l0 l0VarC = m0.c();
        this.f56903a = l0VarC;
        l0VarC.f56958g = l0VarC;
        l0VarC.f56957f = l0VarC;
        return l0VarC;
    }

    public long d0(byte b10) {
        return g0(b10, 0L, Long.MAX_VALUE);
    }

    @Override // xn.f
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public e k0(h byteString) {
        kotlin.jvm.internal.s.h(byteString, "byteString");
        byteString.L(this, 0, byteString.D());
        return this;
    }

    @Override // xn.g
    public String e0(long j10) throws EOFException {
        return W0(j10, bm.d.f9079b);
    }

    @Override // xn.f
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source) {
        kotlin.jvm.internal.s.h(source, "source");
        return write(source, 0, source.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (size() != eVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        l0 l0Var2 = eVar.f56903a;
        kotlin.jvm.internal.s.e(l0Var2);
        int i10 = l0Var.f56953b;
        int i11 = l0Var2.f56953b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(l0Var.f56954c - i10, l0Var2.f56954c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (l0Var.f56952a[i10] != l0Var2.f56952a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == l0Var.f56954c) {
                l0Var = l0Var.f56957f;
                kotlin.jvm.internal.s.e(l0Var);
                i10 = l0Var.f56953b;
            }
            if (i11 == l0Var2.f56954c) {
                l0Var2 = l0Var2.f56957f;
                kotlin.jvm.internal.s.e(l0Var2);
                i11 = l0Var2.f56953b;
            }
            j10 += jMin;
        }
        return true;
    }

    @Override // xn.g
    public int f(f0 options) throws EOFException {
        kotlin.jvm.internal.s.h(options, "options");
        int i10 = yn.a.i(this, options, false, 2, null);
        if (i10 == -1) {
            return -1;
        }
        skip(options.m()[i10].D());
        return i10;
    }

    @Override // xn.g
    public h f0(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new h(N0(j10));
        }
        h hVarB1 = b1((int) j10);
        skip(j10);
        return hVarB1;
    }

    @Override // xn.f
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public e write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.s.h(source, "source");
        long j10 = i11;
        xn.b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            l0 l0VarC1 = c1(1);
            int iMin = Math.min(i12 - i10, 8192 - l0VarC1.f56954c);
            int i13 = i10 + iMin;
            gl.j.f(source, l0VarC1.f56952a, l0VarC1.f56954c, i10, i13);
            l0VarC1.f56954c += iMin;
            i10 = i13;
        }
        Z0(size() + j10);
        return this;
    }

    public long g0(byte b10, long j10, long j11) {
        l0 l0Var;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (l0Var = this.f56903a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                l0Var = l0Var.f56958g;
                kotlin.jvm.internal.s.e(l0Var);
                size -= (long) (l0Var.f56954c - l0Var.f56953b);
            }
            while (size < j11) {
                byte[] bArr = l0Var.f56952a;
                int iMin = (int) Math.min(l0Var.f56954c, (((long) l0Var.f56953b) + j11) - size);
                i10 = (int) ((((long) l0Var.f56953b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (l0Var.f56954c - l0Var.f56953b);
                l0Var = l0Var.f56957f;
                kotlin.jvm.internal.s.e(l0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (l0Var.f56954c - l0Var.f56953b)) + size;
            if (j12 > j10) {
                break;
            }
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = l0Var.f56952a;
            int iMin2 = (int) Math.min(l0Var.f56954c, (((long) l0Var.f56953b) + j11) - size);
            i10 = (int) ((((long) l0Var.f56953b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (l0Var.f56954c - l0Var.f56953b);
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - l0Var.f56953b)) + size;
    }

    @Override // xn.f
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public e writeByte(int i10) {
        l0 l0VarC1 = c1(1);
        byte[] bArr = l0VarC1.f56952a;
        int i11 = l0VarC1.f56954c;
        l0VarC1.f56954c = i11 + 1;
        bArr[i11] = (byte) i10;
        Z0(size() + 1);
        return this;
    }

    @Override // xn.f
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public e a0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return N("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iD = yn.a.d(j10);
        if (z10) {
            iD++;
        }
        l0 l0VarC1 = c1(iD);
        byte[] bArr = l0VarC1.f56952a;
        int i10 = l0VarC1.f56954c + iD;
        while (j10 != 0) {
            long j11 = 10;
            i10--;
            bArr[i10] = yn.a.e()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i10 - 1] = 45;
        }
        l0VarC1.f56954c += iD;
        Z0(size() + ((long) iD));
        return this;
    }

    public int hashCode() {
        l0 l0Var = this.f56903a;
        if (l0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = l0Var.f56954c;
            for (int i12 = l0Var.f56953b; i12 < i11; i12++) {
                i10 = (i10 * 31) + l0Var.f56952a[i12];
            }
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
        } while (l0Var != this.f56903a);
        return i10;
    }

    public long i0(h bytes, long j10) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return m0(bytes, j10, Long.MAX_VALUE);
    }

    @Override // xn.f
    /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
    public e A0(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        l0 l0VarC1 = c1(i10);
        byte[] bArr = l0VarC1.f56952a;
        int i11 = l0VarC1.f56954c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = yn.a.e()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        l0VarC1.f56954c += i10;
        Z0(size() + ((long) i10));
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // xn.f
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i10) {
        l0 l0VarC1 = c1(4);
        byte[] bArr = l0VarC1.f56952a;
        int i11 = l0VarC1.f56954c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        l0VarC1.f56954c = i11 + 4;
        Z0(size() + 4);
        return this;
    }

    public final void k() throws EOFException {
        skip(size());
    }

    public e k1(int i10) {
        return writeInt(xn.b.c(i10));
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return q();
    }

    @Override // xn.g
    public byte[] l0() {
        return N0(size());
    }

    @Override // xn.f
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public e writeShort(int i10) {
        l0 l0VarC1 = c1(2);
        byte[] bArr = l0VarC1.f56952a;
        int i11 = l0VarC1.f56954c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        l0VarC1.f56954c = i11 + 2;
        Z0(size() + 2);
        return this;
    }

    public final long m() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        l0 l0Var2 = l0Var.f56958g;
        kotlin.jvm.internal.s.e(l0Var2);
        int i10 = l0Var2.f56954c;
        return (i10 >= 8192 || !l0Var2.f56956e) ? size : size - ((long) (i10 - l0Var2.f56953b));
    }

    public long m0(h bytes, long j10, long j11) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return yn.a.c(this, bytes, j10, j11, 0, 0, 24, null);
    }

    public e m1(String string, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.s.h(string, "string");
        kotlin.jvm.internal.s.h(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.s.c(charset, bm.d.f9079b)) {
            return Q(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.s.g(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // xn.g
    public boolean n0() {
        return this.f56904b == 0;
    }

    public e n1(String string, Charset charset) {
        kotlin.jvm.internal.s.h(string, "string");
        kotlin.jvm.internal.s.h(charset, "charset");
        return m1(string, 0, string.length(), charset);
    }

    @Override // xn.g
    public long o0(h targetBytes) {
        kotlin.jvm.internal.s.h(targetBytes, "targetBytes");
        return p0(targetBytes, 0L);
    }

    public final e o1(OutputStream out, long j10) throws IOException {
        kotlin.jvm.internal.s.h(out, "out");
        xn.b.b(this.f56904b, 0L, j10);
        l0 l0Var = this.f56903a;
        long j11 = j10;
        while (j11 > 0) {
            kotlin.jvm.internal.s.e(l0Var);
            int iMin = (int) Math.min(j11, l0Var.f56954c - l0Var.f56953b);
            out.write(l0Var.f56952a, l0Var.f56953b, iMin);
            int i10 = l0Var.f56953b + iMin;
            l0Var.f56953b = i10;
            long j12 = iMin;
            this.f56904b -= j12;
            j11 -= j12;
            if (i10 == l0Var.f56954c) {
                l0 l0VarB = l0Var.b();
                this.f56903a = l0VarB;
                m0.b(l0Var);
                l0Var = l0VarB;
            }
        }
        return this;
    }

    public long p0(h targetBytes, long j10) {
        int i10;
        int i11;
        kotlin.jvm.internal.s.h(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        l0 l0Var = this.f56903a;
        if (l0Var == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                l0Var = l0Var.f56958g;
                kotlin.jvm.internal.s.e(l0Var);
                size -= (long) (l0Var.f56954c - l0Var.f56953b);
            }
            if (targetBytes.D() == 2) {
                byte bJ = targetBytes.j(0);
                byte bJ2 = targetBytes.j(1);
                while (size < size()) {
                    byte[] bArr = l0Var.f56952a;
                    i10 = (int) ((((long) l0Var.f56953b) + j10) - size);
                    int i12 = l0Var.f56954c;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (l0Var.f56954c - l0Var.f56953b);
                            l0Var = l0Var.f56957f;
                            kotlin.jvm.internal.s.e(l0Var);
                            j10 = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bJ || b10 == bJ2) {
                                i11 = l0Var.f56953b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrS = targetBytes.s();
                while (size < size()) {
                    byte[] bArr2 = l0Var.f56952a;
                    i10 = (int) ((((long) l0Var.f56953b) + j10) - size);
                    int i13 = l0Var.f56954c;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrS.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrS[i14]) {
                                    i11 = l0Var.f56953b;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (l0Var.f56954c - l0Var.f56953b);
                            l0Var = l0Var.f56957f;
                            kotlin.jvm.internal.s.e(l0Var);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (l0Var.f56954c - l0Var.f56953b)) + size;
            if (j11 > j10) {
                break;
            }
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
            size = j11;
        }
        if (targetBytes.D() == 2) {
            byte bJ3 = targetBytes.j(0);
            byte bJ4 = targetBytes.j(1);
            while (size < size()) {
                byte[] bArr3 = l0Var.f56952a;
                i10 = (int) ((((long) l0Var.f56953b) + j10) - size);
                int i15 = l0Var.f56954c;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (l0Var.f56954c - l0Var.f56953b);
                        l0Var = l0Var.f56957f;
                        kotlin.jvm.internal.s.e(l0Var);
                        j10 = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bJ3 || b12 == bJ4) {
                            i11 = l0Var.f56953b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrS2 = targetBytes.s();
            while (size < size()) {
                byte[] bArr4 = l0Var.f56952a;
                i10 = (int) ((((long) l0Var.f56953b) + j10) - size);
                int i16 = l0Var.f56954c;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrS2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrS2[i17]) {
                                i11 = l0Var.f56953b;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (l0Var.f56954c - l0Var.f56953b);
                        l0Var = l0Var.f56957f;
                        kotlin.jvm.internal.s.e(l0Var);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public final e q() {
        e eVar = new e();
        if (size() == 0) {
            return eVar;
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        l0 l0VarD = l0Var.d();
        eVar.f56903a = l0VarD;
        l0VarD.f56958g = l0VarD;
        l0VarD.f56957f = l0VarD;
        for (l0 l0Var2 = l0Var.f56957f; l0Var2 != l0Var; l0Var2 = l0Var2.f56957f) {
            l0 l0Var3 = l0VarD.f56958g;
            kotlin.jvm.internal.s.e(l0Var3);
            kotlin.jvm.internal.s.e(l0Var2);
            l0Var3.c(l0Var2.d());
        }
        eVar.Z0(size());
        return eVar;
    }

    @Override // xn.g
    public long q0() throws EOFException {
        long j10;
        byte b10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            l0 l0Var = this.f56903a;
            kotlin.jvm.internal.s.e(l0Var);
            byte[] bArr = l0Var.f56952a;
            int i11 = l0Var.f56953b;
            int i12 = l0Var.f56954c;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                this.f56903a = l0Var.b();
                m0.b(l0Var);
            } else {
                l0Var.f56953b = i11;
            }
            if (z11 || this.f56903a == null) {
                Z0(size() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (size() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + xn.b.f(c0(j10)));
            }
            j11 = j10;
        }
        e eVarWriteByte = new e().a0(j12).writeByte(b10);
        if (!z10) {
            eVarWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + eVarWriteByte.X0());
    }

    @Override // xn.f
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public e N(String string) {
        kotlin.jvm.internal.s.h(string, "string");
        return Q(string, 0, string.length());
    }

    public final e r(e out, long j10, long j11) {
        kotlin.jvm.internal.s.h(out, "out");
        long j12 = j10;
        xn.b.b(size(), j12, j11);
        if (j11 != 0) {
            out.Z0(out.size() + j11);
            l0 l0Var = this.f56903a;
            while (true) {
                kotlin.jvm.internal.s.e(l0Var);
                int i10 = l0Var.f56954c;
                int i11 = l0Var.f56953b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                l0Var = l0Var.f56957f;
            }
            l0 l0Var2 = l0Var;
            long j13 = j11;
            while (j13 > 0) {
                kotlin.jvm.internal.s.e(l0Var2);
                l0 l0VarD = l0Var2.d();
                int i12 = l0VarD.f56953b + ((int) j12);
                l0VarD.f56953b = i12;
                l0VarD.f56954c = Math.min(i12 + ((int) j13), l0VarD.f56954c);
                l0 l0Var3 = out.f56903a;
                if (l0Var3 == null) {
                    l0VarD.f56958g = l0VarD;
                    l0VarD.f56957f = l0VarD;
                    out.f56903a = l0VarD;
                } else {
                    kotlin.jvm.internal.s.e(l0Var3);
                    l0 l0Var4 = l0Var3.f56958g;
                    kotlin.jvm.internal.s.e(l0Var4);
                    l0Var4.c(l0VarD);
                }
                j13 -= (long) (l0VarD.f56954c - l0VarD.f56953b);
                l0Var2 = l0Var2.f56957f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // xn.f
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public e Q(String string, int i10, int i11) {
        char cCharAt;
        kotlin.jvm.internal.s.h(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                l0 l0VarC1 = c1(1);
                byte[] bArr = l0VarC1.f56952a;
                int i12 = l0VarC1.f56954c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = l0VarC1.f56954c;
                int i15 = (i12 + i10) - i14;
                l0VarC1.f56954c = i14 + i15;
                Z0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    l0 l0VarC2 = c1(2);
                    byte[] bArr2 = l0VarC2.f56952a;
                    int i16 = l0VarC2.f56954c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    l0VarC2.f56954c = i16 + 2;
                    Z0(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    l0 l0VarC3 = c1(3);
                    byte[] bArr3 = l0VarC3.f56952a;
                    int i17 = l0VarC3.f56954c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    l0VarC3.f56954c = i17 + 3;
                    Z0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        l0 l0VarC4 = c1(4);
                        byte[] bArr4 = l0VarC4.f56952a;
                        int i20 = l0VarC4.f56954c;
                        bArr4[i20] = (byte) ((i19 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        l0VarC4.f56954c = i20 + 4;
                        Z0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        l0 l0Var = this.f56903a;
        if (l0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), l0Var.f56954c - l0Var.f56953b);
        sink.put(l0Var.f56952a, l0Var.f56953b, iMin);
        int i10 = l0Var.f56953b + iMin;
        l0Var.f56953b = i10;
        this.f56904b -= (long) iMin;
        if (i10 == l0Var.f56954c) {
            this.f56903a = l0Var.b();
            m0.b(l0Var);
        }
        return iMin;
    }

    @Override // xn.g
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        int i10 = l0Var.f56953b;
        int i11 = l0Var.f56954c;
        int i12 = i10 + 1;
        byte b10 = l0Var.f56952a[i10];
        Z0(size() - 1);
        if (i12 != i11) {
            l0Var.f56953b = i12;
            return b10;
        }
        this.f56903a = l0Var.b();
        m0.b(l0Var);
        return b10;
    }

    public void readFully(byte[] sink) throws EOFException {
        kotlin.jvm.internal.s.h(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // xn.g
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        int i10 = l0Var.f56953b;
        int i11 = l0Var.f56954c;
        if (i11 - i10 < 4) {
            return ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        byte[] bArr = l0Var.f56952a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        Z0(size() - 4);
        if (i14 != i11) {
            l0Var.f56953b = i14;
            return i15;
        }
        this.f56903a = l0Var.b();
        m0.b(l0Var);
        return i15;
    }

    @Override // xn.g
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        l0 l0Var = this.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        int i10 = l0Var.f56953b;
        int i11 = l0Var.f56954c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        byte[] bArr = l0Var.f56952a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13;
        Z0(size() - 2);
        if (i14 == i11) {
            this.f56903a = l0Var.b();
            m0.b(l0Var);
        } else {
            l0Var.f56953b = i14;
        }
        return (short) i15;
    }

    @Override // xn.g
    public boolean request(long j10) {
        return this.f56904b >= j10;
    }

    @Override // xn.f
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public e D(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            l0 l0VarC1 = c1(2);
            byte[] bArr = l0VarC1.f56952a;
            int i11 = l0VarC1.f56954c;
            bArr[i11] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            l0VarC1.f56954c = i11 + 2;
            Z0(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            l0 l0VarC2 = c1(3);
            byte[] bArr2 = l0VarC2.f56952a;
            int i12 = l0VarC2.f56954c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            l0VarC2.f56954c = i12 + 3;
            Z0(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + xn.b.g(i10));
        }
        l0 l0VarC3 = c1(4);
        byte[] bArr3 = l0VarC3.f56952a;
        int i13 = l0VarC3.f56954c;
        bArr3[i13] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        l0VarC3.f56954c = i13 + 4;
        Z0(size() + 4);
        return this;
    }

    public final long size() {
        return this.f56904b;
    }

    @Override // xn.g
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            l0 l0Var = this.f56903a;
            if (l0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, l0Var.f56954c - l0Var.f56953b);
            long j11 = iMin;
            Z0(size() - j11);
            j10 -= j11;
            int i10 = l0Var.f56953b + iMin;
            l0Var.f56953b = i10;
            if (i10 == l0Var.f56954c) {
                this.f56903a = l0Var.b();
                m0.b(l0Var);
            }
        }
    }

    @Override // xn.q0
    public r0 timeout() {
        return r0.f56980e;
    }

    public String toString() {
        return a1().toString();
    }

    @Override // xn.g
    public String x0(Charset charset) {
        kotlin.jvm.internal.s.h(charset, "charset");
        return W0(this.f56904b, charset);
    }

    @Override // xn.g
    public boolean z0(long j10, h bytes) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return K0(j10, bytes, 0, bytes.D());
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.size() > 0) {
                return e.this.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            kotlin.jvm.internal.s.h(sink, "sink");
            return e.this.read(sink, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.s.h(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            l0 l0VarC1 = c1(1);
            int iMin = Math.min(i10, 8192 - l0VarC1.f56954c);
            source.get(l0VarC1.f56952a, l0VarC1.f56954c, iMin);
            i10 -= iMin;
            l0VarC1.f56954c += iMin;
        }
        this.f56904b += (long) iRemaining;
        return iRemaining;
    }

    @Override // xn.g
    public int read(byte[] sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        return read(sink, 0, sink.length);
    }

    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.s.h(sink, "sink");
        xn.b.b(sink.length, i10, i11);
        l0 l0Var = this.f56903a;
        if (l0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, l0Var.f56954c - l0Var.f56953b);
        byte[] bArr = l0Var.f56952a;
        int i12 = l0Var.f56953b;
        gl.j.f(bArr, sink, i10, i12, i12 + iMin);
        l0Var.f56953b += iMin;
        Z0(size() - ((long) iMin));
        if (l0Var.f56953b == l0Var.f56954c) {
            this.f56903a = l0Var.b();
            m0.b(l0Var);
        }
        return iMin;
    }

    @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // xn.f, xn.o0, java.io.Flushable
    public void flush() {
    }

    @Override // xn.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e C() {
        return this;
    }

    @Override // xn.f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e J() {
        return this;
    }

    @Override // xn.g, xn.f
    public e u() {
        return this;
    }

    @Override // xn.q0
    public long read(e sink, long j10) {
        kotlin.jvm.internal.s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.W(this, j10);
        return j10;
    }
}
