package com.google.api.client.testing.util;

import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TestableByteArrayInputStream extends ByteArrayInputStream {
    private boolean closed;

    public TestableByteArrayInputStream(byte[] bArr) {
        super(bArr);
    }

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    public final byte[] getBuffer() {
        return ((ByteArrayInputStream) this).buf;
    }

    public final boolean isClosed() {
        return this.closed;
    }

    public TestableByteArrayInputStream(byte[] bArr, int i10, int i11) {
        super(bArr);
    }
}
