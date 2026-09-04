package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RandomAccessFile f11783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicBoolean f11784d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f11785e;

    c(long j10, File file) throws IOException {
        this.f11781a = j10;
        this.f11785e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f11783c = randomAccessFile;
            randomAccessFile.setLength(j10);
        } catch (Exception e10) {
            CloseableUtils.close(this.f11783c);
            throw new IOException("create raf swap failed! path: " + file.getAbsolutePath() + " caused by: " + e10.getMessage(), e10);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.f11784d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.f11781a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (this.f11784d.get()) {
            throw new IOException("released!");
        }
        return this.f11782b;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.f11784d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.f11783c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.f11785e;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r0
      0x000e: PHI (r0v5 long) = (r0v2 long), (r0v3 long) binds: [B:5:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j10) throws IOException {
        if (this.f11784d.get()) {
            throw new IOException("released!");
        }
        long j11 = 0;
        if (j10 < 0) {
            j10 = j11;
        } else {
            j11 = this.f11781a;
            if (j10 > j11) {
                j10 = j11;
            }
        }
        this.f11782b = j10;
        this.f11783c.seek(j10);
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
        int iSkipBytes;
        if (this.f11784d.get()) {
            throw new IOException("released!");
        }
        int i10 = (int) j10;
        if (i10 == j10) {
            iSkipBytes = this.f11783c.skipBytes(i10);
            this.f11782b = this.f11783c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j10)));
        }
        return iSkipBytes;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f11784d.get()) {
            if (bArr == null || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                try {
                    long j10 = this.f11782b;
                    long j11 = this.f11781a;
                    if (j10 == j11) {
                        return -1;
                    }
                    if (((long) i11) + j10 > j11) {
                        i11 = (int) (j11 - j10);
                    }
                    int i12 = this.f11783c.read(bArr, i10, i11);
                    if (i12 == -1) {
                        return -1;
                    }
                    this.f11782b += (long) i12;
                    return i12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IOException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f11784d.get()) {
            if (bArr == null || bArr.length == 0 || i11 <= 0 || i10 < 0 || i10 >= bArr.length) {
                return 0;
            }
            if (i10 + i11 > bArr.length) {
                i11 = bArr.length - i10;
            }
            synchronized (this) {
                try {
                    long j10 = this.f11782b;
                    long j11 = this.f11781a;
                    if (j10 == j11) {
                        return 0;
                    }
                    if (((long) i11) + j10 > j11) {
                        i11 = (int) (j11 - j10);
                    }
                    this.f11783c.write(bArr, i10, i11);
                    this.f11782b += (long) i11;
                    return i11;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IOException("released!");
    }
}
