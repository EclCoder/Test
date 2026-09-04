package com.bumptech.glide.load.resource.bitmap;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f11513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u5.b f11518f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        a(String str) {
            super(str);
        }
    }

    public e0(InputStream inputStream, u5.b bVar) {
        this(inputStream, bVar, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f11516d;
        if (i10 != -1) {
            int i11 = this.f11517e - i10;
            int i12 = this.f11515c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f11514b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f11518f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f11513a = bArr2;
                    this.f11518f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f11517e - this.f11516d;
                this.f11517e = i13;
                this.f11516d = 0;
                this.f11514b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f11517e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f11514b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f11516d = -1;
            this.f11517e = 0;
            this.f11514b = i16;
        }
        return i16;
    }

    private static IOException h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f11513a == null || inputStream == null) {
            throw h();
        }
        return (this.f11514b - this.f11517e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f11513a != null) {
            this.f11518f.put(this.f11513a);
            this.f11513a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        this.f11515c = this.f11513a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f11515c = Math.max(this.f11515c, i10);
        this.f11516d = this.f11517e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f11513a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw h();
        }
        if (this.f11517e >= this.f11514b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f11513a && (bArr = this.f11513a) == null) {
            throw h();
        }
        int i10 = this.f11514b;
        int i11 = this.f11517e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f11517e = i11 + 1;
        return bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public synchronized void release() {
        if (this.f11513a != null) {
            this.f11518f.put(this.f11513a);
            this.f11513a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f11513a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f11516d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f11517e + " markLimit: " + this.f11515c);
        }
        this.f11517e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f11513a;
        if (bArr == null) {
            throw h();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw h();
        }
        int i10 = this.f11514b;
        int i11 = this.f11517e;
        if (i10 - i11 >= j10) {
            this.f11517e = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f11517e = i10;
        if (this.f11516d == -1 || j10 > this.f11515c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f11516d = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f11514b;
        int i13 = this.f11517e;
        if (i12 - i13 >= j10 - j11) {
            this.f11517e = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f11517e = i12;
        return j12;
    }

    e0(InputStream inputStream, u5.b bVar, int i10) {
        super(inputStream);
        this.f11516d = -1;
        this.f11518f = bVar;
        this.f11513a = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f11513a;
        if (bArr2 == null) {
            throw h();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f11517e;
            int i15 = this.f11514b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f11517e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f11516d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f11513a && (bArr2 = this.f11513a) == null) {
                        throw h();
                    }
                    int i17 = this.f11514b;
                    int i18 = this.f11517e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f11517e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw h();
        }
    }
}
