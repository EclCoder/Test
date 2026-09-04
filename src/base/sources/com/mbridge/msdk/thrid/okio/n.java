package com.mbridge.msdk.thrid.okio;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f33667a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f33668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f33669c;

    n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f33668b = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f33667a;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f33669c) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f33667a;
        if (cVar2.f33639b == 0 && this.f33668b.b(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f33667a.b(cVar, Math.min(j10, this.f33667a.f33639b));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws EOFException {
        e(j10);
        return this.f33667a.c(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f33669c) {
            return;
        }
        this.f33669c = true;
        this.f33668b.close();
        this.f33667a.k();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return this.f33667a.h(jA);
        }
        if (j11 < Long.MAX_VALUE && f(j11) && this.f33667a.f(j11 - 1) == 13 && f(j11 + 1) && this.f33667a.f(j11) == 10) {
            return this.f33667a.h(j11);
        }
        c cVar = new c();
        c cVar2 = this.f33667a;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f33667a.size(), j10) + " content=" + cVar.o().g() + (char) 8230);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws EOFException {
        if (!f(j10)) {
            throw new EOFException();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        if (this.f33669c) {
            throw new IllegalStateException("closed");
        }
        return this.f33667a.f() && this.f33668b.b(this.f33667a, 8192L) == -1;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() throws EOFException {
        e(2L);
        return this.f33667a.g();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f33669c;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f33667a;
        if (cVar.f33639b == 0 && this.f33668b.b(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f33667a.read(byteBuffer);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() throws EOFException {
        e(1L);
        return this.f33667a.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        try {
            e(bArr.length);
            this.f33667a.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                c cVar = this.f33667a;
                long j10 = cVar.f33639b;
                if (j10 <= 0) {
                    throw e10;
                }
                int i11 = cVar.read(bArr, i10, (int) j10);
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() throws EOFException {
        e(4L);
        return this.f33667a.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() throws EOFException {
        e(2L);
        return this.f33667a.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws EOFException {
        if (this.f33669c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            c cVar = this.f33667a;
            if (cVar.f33639b == 0 && this.f33668b.b(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f33667a.size());
            this.f33667a.skip(jMin);
            j10 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f33668b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f33667a.a(this.f33668b);
        return this.f33667a.a(charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() throws EOFException {
        e(4L);
        return this.f33667a.e();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long i() throws EOFException {
        e(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!f(i11)) {
                break;
            }
            byte bF = this.f33667a.f(i10);
            if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                if (i10 != 0) {
                    break;
                }
                throw new NumberFormatException(String.format(qEagQqzJZsd.UuKJwHVACWBX, Byte.valueOf(bF)));
            }
            i10 = i11;
        }
        return this.f33667a.i();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() {
        return d(Long.MAX_VALUE);
    }

    public boolean f(long j10) {
        c cVar;
        if (j10 >= 0) {
            if (this.f33669c) {
                throw new IllegalStateException("closed");
            }
            do {
                cVar = this.f33667a;
                if (cVar.f33639b >= j10) {
                    return true;
                }
            } while (this.f33668b.b(cVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            n nVar = n.this;
            if (nVar.f33669c) {
                throw new IOException("closed");
            }
            return (int) Math.min(nVar.f33667a.f33639b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            n nVar = n.this;
            if (nVar.f33669c) {
                throw new IOException("closed");
            }
            c cVar = nVar.f33667a;
            if (cVar.f33639b == 0 && nVar.f33668b.b(cVar, 8192L) == -1) {
                return -1;
            }
            return n.this.f33667a.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        public String toString() {
            return n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!n.this.f33669c) {
                u.a(bArr.length, i10, i11);
                n nVar = n.this;
                c cVar = nVar.f33667a;
                if (cVar.f33639b == 0 && nVar.f33668b.b(cVar, 8192L) == -1) {
                    return -1;
                }
                return n.this.f33667a.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) {
        if (this.f33669c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jA = this.f33667a.a(b11, jMax, j12);
            if (jA != -1) {
                return jA;
            }
            c cVar = this.f33667a;
            long j13 = cVar.f33639b;
            if (j13 >= j12 || this.f33668b.b(cVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws EOFException {
        e(j10);
        return this.f33667a.b(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f33668b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j10, f fVar) {
        return a(j10, fVar, 0, fVar.j());
    }

    public boolean a(long j10, f fVar, int i10, int i11) {
        if (!this.f33669c) {
            if (j10 < 0 || i10 < 0 || i11 < 0 || fVar.j() - i10 < i11) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = ((long) i12) + j10;
                if (!f(1 + j11) || this.f33667a.f(j11) != fVar.a(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }
}
