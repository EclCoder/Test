package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f35401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f35403c;

    public m(FileChannel fileChannel, long j10, long j11) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j11)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        this.f35401a = fileChannel;
        this.f35402b = j10;
        this.f35403c = j11;
    }

    @Override // com.pgl.ssdk.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j10, long j11) {
        long jA = a();
        a(j10, j11, jA);
        return (j10 == 0 && j11 == jA) ? this : new m(this.f35401a, this.f35402b + j10, j11);
    }

    private static void a(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j10)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        if (j10 > j12) {
            throw new IndexOutOfBoundsException("offset (" + j10 + ") > source size (" + j12 + ")");
        }
        long j13 = j10 + j11;
        if (j13 < j10) {
            throw new IndexOutOfBoundsException("offset (" + j10 + ") + size (" + j11 + ") overflow");
        }
        if (j13 <= j12) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j10 + ") + size (" + j11 + ") > source size (" + j12 + ")");
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j10 = this.f35403c;
        if (j10 != -1) {
            return j10;
        }
        try {
            return this.f35401a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public void a(long j10, int i10, ByteBuffer byteBuffer) {
        int i11;
        a(j10, i10, a());
        if (i10 == 0) {
            return;
        }
        if (i10 <= byteBuffer.remaining()) {
            long j11 = this.f35402b + j10;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i10);
                while (i10 > 0) {
                    synchronized (this.f35401a) {
                        this.f35401a.position(j11);
                        i11 = this.f35401a.read(byteBuffer);
                    }
                    j11 += (long) i11;
                    i10 -= i11;
                }
                byteBuffer.limit(iLimit);
                return;
            } catch (Throwable th2) {
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j10, int i10) {
        if (i10 >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            a(j10, i10, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i10)));
    }
}
