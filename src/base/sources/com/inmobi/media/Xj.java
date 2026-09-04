package com.inmobi.media;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Xj implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f26030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f26031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f26032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26034e;

    public Xj(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(AbstractC3308sl.f27479a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f26030a = fileInputStream;
        this.f26031b = charset;
        this.f26032c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    public final String a() {
        int i10;
        synchronized (this.f26030a) {
            try {
                byte[] bArr = this.f26032c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f26033d >= this.f26034e) {
                    int i11 = this.f26030a.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f26033d = 0;
                    this.f26034e = i11;
                }
                for (int i12 = this.f26033d; i12 != this.f26034e; i12++) {
                    byte[] bArr2 = this.f26032c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f26033d;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        String str = new String(bArr2, i13, i10 - i13, this.f26031b.name());
                        this.f26033d = i12 + 1;
                        return str;
                    }
                }
                Wj wj2 = new Wj(this, (this.f26034e - this.f26033d) + 80);
                while (true) {
                    byte[] bArr3 = this.f26032c;
                    int i14 = this.f26033d;
                    wj2.write(bArr3, i14, this.f26034e - i14);
                    this.f26034e = -1;
                    FileInputStream fileInputStream = this.f26030a;
                    byte[] bArr4 = this.f26032c;
                    int i15 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f26033d = 0;
                    this.f26034e = i15;
                    for (int i16 = 0; i16 != this.f26034e; i16++) {
                        byte[] bArr5 = this.f26032c;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f26033d;
                            if (i16 != i17) {
                                wj2.write(bArr5, i17, i16 - i17);
                            }
                            this.f26033d = i16 + 1;
                            return wj2.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f26030a) {
            try {
                if (this.f26032c != null) {
                    this.f26032c = null;
                    this.f26030a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
