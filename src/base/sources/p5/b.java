package p5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f49548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f49549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f49550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49552e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f49549b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void d() throws IOException {
        InputStream inputStream = this.f49548a;
        byte[] bArr = this.f49550c;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f49551d = 0;
        this.f49552e = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f49548a) {
            try {
                if (this.f49550c != null) {
                    this.f49550c = null;
                    this.f49548a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean h() {
        return this.f49552e == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    String k() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f49548a) {
            try {
                if (this.f49550c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f49551d >= this.f49552e) {
                    d();
                }
                for (int i12 = this.f49551d; i12 != this.f49552e; i12++) {
                    byte[] bArr2 = this.f49550c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f49551d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f49549b.name());
                        this.f49551d = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f49552e - this.f49551d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f49550c;
                    int i14 = this.f49551d;
                    aVar.write(bArr3, i14, this.f49552e - i14);
                    this.f49552e = -1;
                    d();
                    i10 = this.f49551d;
                    while (i10 != this.f49552e) {
                        bArr = this.f49550c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f49551d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f49551d = i10 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    b(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f49554a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f49548a = inputStream;
        this.f49549b = charset;
        this.f49550c = new byte[i10];
    }
}
