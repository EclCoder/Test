package com.bytedance.sdk.component.hn.hnj.hnj.hnj;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends InputStream {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    HttpURLConnection f12874hn;
    InputStream hnj;

    public dse(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.hnj = inputStream;
        this.f12874hn = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            inputStream.close();
            this.hnj = null;
        }
        HttpURLConnection httpURLConnection = this.f12874hn;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f12874hn = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i10) {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            inputStream.mark(i10);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            return inputStream.skip(j10);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        InputStream inputStream = this.hnj;
        if (inputStream != null) {
            return inputStream.read(bArr, i10, i11);
        }
        return 0;
    }
}
