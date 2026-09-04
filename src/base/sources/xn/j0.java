package xn;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class j0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f56932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f56933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56934c;

    public j0(o0 sink) {
        kotlin.jvm.internal.s.h(sink, "sink");
        this.f56932a = sink;
        this.f56933b = new e();
    }

    @Override // xn.f
    public f A0(long j10) {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.A0(j10);
        return J();
    }

    @Override // xn.f
    public f C() {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f56933b.size();
        if (size > 0) {
            this.f56932a.W(this.f56933b, size);
        }
        return this;
    }

    @Override // xn.f
    public long C0(q0 source) {
        kotlin.jvm.internal.s.h(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.f56933b, 8192L);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            J();
        }
    }

    @Override // xn.f
    public f D(int i10) {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.D(i10);
        return J();
    }

    @Override // xn.f
    public f J() {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f56933b.m();
        if (jM > 0) {
            this.f56932a.W(this.f56933b, jM);
        }
        return this;
    }

    @Override // xn.f
    public f N(String string) {
        kotlin.jvm.internal.s.h(string, "string");
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.N(string);
        return J();
    }

    @Override // xn.f
    public f Q(String string, int i10, int i11) {
        kotlin.jvm.internal.s.h(string, "string");
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.Q(string, i10, i11);
        return J();
    }

    @Override // xn.o0
    public void W(e source, long j10) {
        kotlin.jvm.internal.s.h(source, "source");
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.W(source, j10);
        J();
    }

    public f a(int i10) {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.k1(i10);
        return J();
    }

    @Override // xn.f
    public f a0(long j10) {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.a0(j10);
        return J();
    }

    @Override // xn.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f56934c) {
            return;
        }
        if (this.f56933b.size() > 0) {
            o0 o0Var = this.f56932a;
            e eVar = this.f56933b;
            o0Var.W(eVar, eVar.size());
        }
        th = null;
        try {
            this.f56932a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f56934c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // xn.f, xn.o0, java.io.Flushable
    public void flush() {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        if (this.f56933b.size() > 0) {
            o0 o0Var = this.f56932a;
            e eVar = this.f56933b;
            o0Var.W(eVar, eVar.size());
        }
        this.f56932a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f56934c;
    }

    @Override // xn.f
    public f k0(h byteString) {
        kotlin.jvm.internal.s.h(byteString, "byteString");
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.k0(byteString);
        return J();
    }

    @Override // xn.o0
    public r0 timeout() {
        return this.f56932a.timeout();
    }

    public String toString() {
        return "buffer(" + this.f56932a + ')';
    }

    @Override // xn.f
    public e u() {
        return this.f56933b;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.s.h(source, "source");
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f56933b.write(source);
        J();
        return iWrite;
    }

    @Override // xn.f
    public f writeByte(int i10) {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.writeByte(i10);
        return J();
    }

    @Override // xn.f
    public f writeInt(int i10) {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.writeInt(i10);
        return J();
    }

    @Override // xn.f
    public f writeShort(int i10) {
        if (this.f56934c) {
            throw new IllegalStateException("closed");
        }
        this.f56933b.writeShort(i10);
        return J();
    }

    @Override // xn.f
    public f write(byte[] source) {
        kotlin.jvm.internal.s.h(source, "source");
        if (!this.f56934c) {
            this.f56933b.write(source);
            return J();
        }
        throw new IllegalStateException("closed");
    }

    @Override // xn.f
    public f write(byte[] source, int i10, int i11) {
        kotlin.jvm.internal.s.h(source, "source");
        if (!this.f56934c) {
            this.f56933b.write(source, i10, i11);
            return J();
        }
        throw new IllegalStateException("closed");
    }
}
