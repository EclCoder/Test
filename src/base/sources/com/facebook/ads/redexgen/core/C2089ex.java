package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2089ex extends InputStream {
    public int A00;
    public long A01;
    public InterfaceC2694pF A02;
    public final Uri A03;
    public final C5Y A04;
    public final C2194ge A05;
    public final String A06;

    public C2089ex(C2194ge c2194ge, Uri uri, C5Y c5y) throws IOException {
        this.A05 = c2194ge;
        this.A04 = c5y;
        this.A03 = uri;
        this.A06 = C2129fb.A09(this.A05, this.A03);
        A00(0);
    }

    private void A00(int i10) throws IOException {
        if (this.A02 != null) {
            this.A02.close();
        }
        this.A02 = this.A04.A5I();
        this.A01 = (int) this.A02.AGi(new C10185i(this.A03, i10, -1L, this.A06));
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((int) this.A01) - this.A00;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] b10 = new byte[1];
        return read(b10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.A02.read(bArr, i10, i11);
        int read = this.A00;
        this.A00 = read + i12;
        return i12;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = this.A01 - ((long) this.A00);
        if (j11 <= 0) {
            return 0L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        this.A00 = (int) (((long) this.A00) + j10);
        A00(this.A00);
        return j10;
    }
}
