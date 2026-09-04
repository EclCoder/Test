package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RandomAccessFile f11778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f11779b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f11780c;

    b(File file) throws IOException {
        this.f11780c = file;
        file.getParentFile().mkdirs();
        try {
            this.f11778a = new RandomAccessFile(file, "rw");
        } catch (Exception e10) {
            CloseableUtils.close(this.f11778a);
            throw new IOException("create raf mSwap failed! path: " + file.getAbsolutePath() + " caused by: " + e10.getMessage(), e10);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f11779b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f11778a.length();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f11779b.get()) {
            throw new IOException("released!");
        }
        return this.f11778a.getFilePointer();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.f11779b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f11778a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f11780c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j10) throws IOException {
        if (this.f11779b.get()) {
            throw new IOException("released!");
        }
        if (j10 < 0) {
            j10 = 0;
        }
        this.f11778a.seek(j10);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i10) throws IOException {
        a(new byte[]{(byte) i10});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j10) {
        int i10;
        if (this.f11779b.get()) {
            throw new IOException("released!");
        }
        i10 = (int) j10;
        if (i10 == j10) {
        } else {
            throw new IOException("too large:".concat(String.valueOf(j10)));
        }
        return this.f11778a.skipBytes(i10);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (!this.f11779b.get()) {
            if (bArr == null || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                i12 = this.f11778a.read(bArr, i10, i11);
            }
            return i12;
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f11779b.get()) {
            if (bArr == null || bArr.length == 0 || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                this.f11778a.write(bArr, i10, i11);
            }
            return i11;
        }
        throw new IOException("released!");
    }
}
