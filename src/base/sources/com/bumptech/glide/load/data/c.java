package com.bumptech.glide.load.data;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f11238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f11239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u5.b f11240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11241d;

    public c(OutputStream outputStream, u5.b bVar) {
        this(outputStream, bVar, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    private void d() throws IOException {
        int i10 = this.f11241d;
        if (i10 > 0) {
            this.f11238a.write(this.f11239b, 0, i10);
            this.f11241d = 0;
        }
    }

    private void h() throws IOException {
        if (this.f11241d == this.f11239b.length) {
            d();
        }
    }

    private void release() {
        byte[] bArr = this.f11239b;
        if (bArr != null) {
            this.f11240c.put(bArr);
            this.f11239b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f11238a.close();
            release();
        } catch (Throwable th2) {
            this.f11238a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        d();
        this.f11238a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f11239b;
        int i11 = this.f11241d;
        this.f11241d = i11 + 1;
        bArr[i11] = (byte) i10;
        h();
    }

    c(OutputStream outputStream, u5.b bVar, int i10) {
        this.f11238a = outputStream;
        this.f11240c = bVar;
        this.f11239b = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f11241d;
            if (i15 == 0 && i13 >= this.f11239b.length) {
                this.f11238a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f11239b.length - i15);
            System.arraycopy(bArr, i14, this.f11239b, this.f11241d, iMin);
            this.f11241d += iMin;
            i12 += iMin;
            h();
        } while (i12 < i11);
    }
}
