package com.google.api.client.testing.util;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TestableByteArrayOutputStream extends ByteArrayOutputStream {
    private boolean closed;

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    public final byte[] getBuffer() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public final boolean isClosed() {
        return this.closed;
    }
}
