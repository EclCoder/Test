package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f11786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11787b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f11786a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        long jB = this.f11786a.b() - this.f11786a.c();
        if (jB > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jB;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f11787b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.f11786a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f11786a.b(this.f11787b);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        return this.f11786a.a(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f11786a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f11786a.d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
