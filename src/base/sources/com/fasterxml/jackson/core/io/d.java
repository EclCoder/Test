package com.fasterxml.jackson.core.io;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f16245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f16246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16248e;

    public d(b bVar, InputStream inputStream, byte[] bArr, int i10, int i11) {
        this.f16244a = bVar;
        this.f16245b = inputStream;
        this.f16246c = bArr;
        this.f16247d = i10;
        this.f16248e = i11;
    }

    private void d() {
        byte[] bArr = this.f16246c;
        if (bArr != null) {
            this.f16246c = null;
            b bVar = this.f16244a;
            if (bVar != null) {
                bVar.o(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f16246c != null ? this.f16248e - this.f16247d : this.f16245b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d();
        this.f16245b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        if (this.f16246c == null) {
            this.f16245b.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f16246c == null && this.f16245b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f16246c;
        if (bArr == null) {
            return this.f16245b.read();
        }
        int i10 = this.f16247d;
        int i11 = i10 + 1;
        this.f16247d = i11;
        int i12 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 >= this.f16248e) {
            d();
        }
        return i12;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.f16246c == null) {
            this.f16245b.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        long j11;
        if (this.f16246c != null) {
            int i10 = this.f16248e;
            int i11 = this.f16247d;
            j11 = i10 - i11;
            if (j11 > j10) {
                this.f16247d = i11 + ((int) j10);
                return j10;
            }
            d();
            j10 -= j11;
        } else {
            j11 = 0;
        }
        return j10 > 0 ? j11 + this.f16245b.skip(j10) : j11;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.f16246c;
        if (bArr2 != null) {
            int i12 = this.f16248e;
            int i13 = this.f16247d;
            int i14 = i12 - i13;
            if (i11 > i14) {
                i11 = i14;
            }
            System.arraycopy(bArr2, i13, bArr, i10, i11);
            int i15 = this.f16247d + i11;
            this.f16247d = i15;
            if (i15 >= this.f16248e) {
                d();
            }
            return i11;
        }
        return this.f16245b.read(bArr, i10, i11);
    }
}
