package com.mbridge.msdk.thrid.okio;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f33664a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f33665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f33666c;

    m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f33665b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f33664a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f33665b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f33666c) {
            return;
        }
        c cVar = this.f33664a;
        long j10 = cVar.f33639b;
        if (j10 > 0) {
            this.f33665b.a(cVar, j10);
        }
        th = null;
        try {
            this.f33665b.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f33666c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() {
        if (this.f33666c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f33664a.m();
        if (jM > 0) {
            this.f33665b.a(this.f33664a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
        if (this.f33666c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f33664a;
        long j10 = cVar.f33639b;
        if (j10 > 0) {
            this.f33665b.a(cVar, j10);
        }
        this.f33665b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f33666c;
    }

    public String toString() {
        return "buffer(" + this.f33665b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) {
        if (this.f33666c) {
            throw new IllegalStateException("closed");
        }
        this.f33664a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) {
        if (this.f33666c) {
            throw new IllegalStateException("closed");
        }
        this.f33664a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) {
        if (this.f33666c) {
            throw new IllegalStateException("closed");
        }
        this.f33664a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) {
        if (this.f33666c) {
            throw new IllegalStateException("closed");
        }
        this.f33664a.writeShort(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        if (this.f33666c) {
            throw new IllegalStateException("closed");
        }
        this.f33664a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) {
        if (!this.f33666c) {
            this.f33664a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) {
        if (!this.f33666c) {
            this.f33664a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.f33666c) {
            int iWrite = this.f33664a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) {
        if (!this.f33666c) {
            this.f33664a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
