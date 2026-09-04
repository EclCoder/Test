package com.bumptech.glide.load.data;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f11245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f11246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f11247e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f11248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11249b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f11245c = bArr;
        int length = bArr.length;
        f11246d = length;
        f11247e = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f11248a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f11249b;
        if (i12 < 2 || i12 > (i11 = f11247e)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f11248a : f11245c[i12 - 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (i10 != -1) {
            this.f11249b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f11249b = (int) (((long) this.f11249b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f11249b;
        int i14 = f11247e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f11248a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f11245c, this.f11249b - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f11249b += i12;
        }
        return i12;
    }
}
