package com.bykv.vk.openvk.preload.geckox.buffer.stream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class BufferOutputStream extends b {
    private com.bykv.vk.openvk.preload.geckox.buffer.a mBuffer;

    public BufferOutputStream(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.mBuffer = aVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.mBuffer.a(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.mBuffer.a(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.mBuffer.a(bArr, i10, i11);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j10, int i10) {
        synchronized (this) {
            this.mBuffer.b(j10);
            this.mBuffer.a(i10);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j10, byte[] bArr) {
        synchronized (this) {
            this.mBuffer.b(j10);
            this.mBuffer.a(bArr);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j10, byte[] bArr, int i10, int i11) {
        synchronized (this) {
            this.mBuffer.b(j10);
            this.mBuffer.a(bArr, i10, i11);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
