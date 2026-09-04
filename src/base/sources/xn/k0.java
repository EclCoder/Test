package xn;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class k0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f56943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f56944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56945c;

    public k0(q0 source) {
        kotlin.jvm.internal.s.h(source, "source");
        this.f56943a = source;
        this.f56944b = new e();
    }

    @Override // xn.g
    public h B0() {
        this.f56944b.C0(this.f56943a);
        return this.f56944b.B0();
    }

    @Override // xn.g
    public long D0(o0 sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        long j10 = 0;
        while (this.f56943a.read(this.f56944b, 8192L) != -1) {
            long jM = this.f56944b.m();
            if (jM > 0) {
                j10 += jM;
                sink.W(this.f56944b, jM);
            }
        }
        if (this.f56944b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f56944b.size();
        e eVar = this.f56944b;
        sink.W(eVar, eVar.size());
        return size;
    }

    @Override // xn.g
    public int H0() throws EOFException {
        Z(4L);
        return this.f56944b.H0();
    }

    @Override // xn.g
    public String I() {
        long jC = c((byte) 10);
        if (jC != -1) {
            return yn.a.g(this.f56944b, jC);
        }
        if (this.f56944b.size() != 0) {
            return e0(this.f56944b.size());
        }
        return null;
    }

    @Override // xn.g
    public String K(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jD = d((byte) 10, 0L, j11);
        if (jD != -1) {
            return yn.a.g(this.f56944b, jD);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && this.f56944b.c0(j11 - 1) == 13 && request(j11 + 1) && this.f56944b.c0(j11) == 10) {
            return yn.a.g(this.f56944b, j11);
        }
        e eVar = new e();
        e eVar2 = this.f56944b;
        eVar2.r(eVar, 0L, Math.min(32, eVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f56944b.size(), j10) + " content=" + eVar.B0().o() + (char) 8230);
    }

    @Override // xn.g
    public String R() {
        return K(Long.MAX_VALUE);
    }

    @Override // xn.g
    public long R0() throws EOFException {
        Z(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte bC0 = this.f56944b.c0(i10);
            if ((bC0 < 48 || bC0 > 57) && ((bC0 < 97 || bC0 > 102) && (bC0 < 65 || bC0 > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bC0, bm.a.a(16));
                kotlin.jvm.internal.s.g(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.f56944b.R0();
    }

    @Override // xn.g
    public short S() throws EOFException {
        Z(2L);
        return this.f56944b.S();
    }

    @Override // xn.g
    public InputStream S0() {
        return new a();
    }

    @Override // xn.g
    public long V() throws EOFException {
        Z(8L);
        return this.f56944b.V();
    }

    @Override // xn.g
    public long X(h bytes) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return h(bytes, 0L);
    }

    @Override // xn.g
    public void Z(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    public long c(byte b10) {
        return d(b10, 0L, Long.MAX_VALUE);
    }

    @Override // xn.q0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f56945c) {
            return;
        }
        this.f56945c = true;
        this.f56943a.close();
        this.f56944b.k();
    }

    public long d(byte b10, long j10, long j11) {
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jG0 = this.f56944b.g0(b11, jMax, j12);
            if (jG0 != -1) {
                return jG0;
            }
            long size = this.f56944b.size();
            if (size >= j12 || this.f56943a.read(this.f56944b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // xn.g
    public String e0(long j10) throws EOFException {
        Z(j10);
        return this.f56944b.e0(j10);
    }

    @Override // xn.g
    public int f(f0 options) throws EOFException {
        kotlin.jvm.internal.s.h(options, "options");
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iH = yn.a.h(this.f56944b, options, true);
            if (iH != -2) {
                if (iH == -1) {
                    return -1;
                }
                this.f56944b.skip(options.m()[iH].D());
                return iH;
            }
        } while (this.f56943a.read(this.f56944b, 8192L) != -1);
        return -1;
    }

    @Override // xn.g
    public h f0(long j10) throws EOFException {
        Z(j10);
        return this.f56944b.f0(j10);
    }

    public long h(h bytes, long j10) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return i(bytes, j10, Long.MAX_VALUE);
    }

    public long i(h bytes, long j10, long j11) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return yn.f.b(this, bytes, 0, 0, j10, j11, 6, null);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f56945c;
    }

    public long j(h targetBytes, long j10) {
        kotlin.jvm.internal.s.h(targetBytes, "targetBytes");
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jP0 = this.f56944b.p0(targetBytes, j10);
            if (jP0 != -1) {
                return jP0;
            }
            long size = this.f56944b.size();
            if (this.f56943a.read(this.f56944b, 8192L) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    public boolean k(long j10, h bytes, int i10, int i11) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        return i11 >= 0 && j10 >= 0 && i10 >= 0 && i10 + i11 <= bytes.D() && (i11 == 0 || yn.f.a(this, bytes, i10, i11, j10, j10 + 1) != -1);
    }

    @Override // xn.g
    public byte[] l0() {
        this.f56944b.C0(this.f56943a);
        return this.f56944b.l0();
    }

    @Override // xn.g
    public boolean n0() {
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        return this.f56944b.n0() && this.f56943a.read(this.f56944b, 8192L) == -1;
    }

    @Override // xn.g
    public long o0(h targetBytes) {
        kotlin.jvm.internal.s.h(targetBytes, "targetBytes");
        return j(targetBytes, 0L);
    }

    @Override // xn.g
    public long q0() throws EOFException {
        Z(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte bC0 = this.f56944b.c0(j10);
            if ((bC0 < 48 || bC0 > 57) && !(j10 == 0 && bC0 == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bC0, bm.a.a(16));
                kotlin.jvm.internal.s.g(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.f56944b.q0();
    }

    @Override // xn.g
    public int read(byte[] sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // xn.g
    public byte readByte() throws EOFException {
        Z(1L);
        return this.f56944b.readByte();
    }

    @Override // xn.g
    public int readInt() throws EOFException {
        Z(4L);
        return this.f56944b.readInt();
    }

    @Override // xn.g
    public short readShort() throws EOFException {
        Z(2L);
        return this.f56944b.readShort();
    }

    @Override // xn.g
    public boolean request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        while (this.f56944b.size() < j10) {
            if (this.f56943a.read(this.f56944b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // xn.g
    public void skip(long j10) throws EOFException {
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f56944b.size() == 0 && this.f56943a.read(this.f56944b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f56944b.size());
            this.f56944b.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // xn.q0
    public r0 timeout() {
        return this.f56943a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f56943a + ')';
    }

    @Override // xn.g, xn.f
    public e u() {
        return this.f56944b;
    }

    @Override // xn.g
    public String x0(Charset charset) {
        kotlin.jvm.internal.s.h(charset, "charset");
        this.f56944b.C0(this.f56943a);
        return this.f56944b.x0(charset);
    }

    @Override // xn.g
    public boolean z0(long j10, h bytes) {
        kotlin.jvm.internal.s.h(bytes, "bytes");
        return k(j10, bytes, 0, bytes.D());
    }

    @Override // xn.q0
    public long read(e sink, long j10) {
        kotlin.jvm.internal.s.h(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f56945c) {
            throw new IllegalStateException("closed");
        }
        if (this.f56944b.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f56943a.read(this.f56944b, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f56944b.read(sink, Math.min(j10, this.f56944b.size()));
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            k0 k0Var = k0.this;
            if (k0Var.f56945c) {
                throw new IOException("closed");
            }
            return (int) Math.min(k0Var.f56944b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            k0.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            k0 k0Var = k0.this;
            if (k0Var.f56945c) {
                throw new IOException("closed");
            }
            if (k0Var.f56944b.size() == 0) {
                k0 k0Var2 = k0.this;
                if (k0Var2.f56943a.read(k0Var2.f56944b, 8192L) == -1) {
                    return -1;
                }
            }
            return k0.this.f56944b.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        public String toString() {
            return k0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream out) throws IOException {
            kotlin.jvm.internal.s.h(out, "out");
            if (k0.this.f56945c) {
                throw new IOException("closed");
            }
            long size = 0;
            while (true) {
                if (k0.this.f56944b.size() == 0) {
                    k0 k0Var = k0.this;
                    if (k0Var.f56943a.read(k0Var.f56944b, 8192L) == -1) {
                        return size;
                    }
                }
                size += k0.this.f56944b.size();
                e.p1(k0.this.f56944b, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            kotlin.jvm.internal.s.h(data, "data");
            if (!k0.this.f56945c) {
                b.b(data.length, i10, i11);
                if (k0.this.f56944b.size() == 0) {
                    k0 k0Var = k0.this;
                    if (k0Var.f56943a.read(k0Var.f56944b, 8192L) == -1) {
                        return -1;
                    }
                }
                return k0.this.f56944b.read(data, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    public int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.s.h(sink, "sink");
        long j10 = i11;
        b.b(sink.length, i10, j10);
        if (this.f56944b.size() == 0) {
            if (i11 == 0) {
                return 0;
            }
            if (this.f56943a.read(this.f56944b, 8192L) == -1) {
                return -1;
            }
        }
        return this.f56944b.read(sink, i10, (int) Math.min(j10, this.f56944b.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        if (this.f56944b.size() == 0 && this.f56943a.read(this.f56944b, 8192L) == -1) {
            return -1;
        }
        return this.f56944b.read(sink);
    }
}
