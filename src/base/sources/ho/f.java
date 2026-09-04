package ho;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class f extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f40730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f40731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f40732c;

    public f(InputStream inputStream, e eVar) {
        this.f40730a = inputStream;
        this.f40731b = eVar;
    }

    private void d() {
        if (this.f40732c == null) {
            this.f40732c = this.f40731b.a(this.f40730a);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        d();
        return this.f40732c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            InputStream inputStream = this.f40732c;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f40730a.close();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() {
        d();
        return this.f40732c.read();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        d();
        return this.f40732c.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        d();
        return this.f40732c.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        d();
        return this.f40732c.read(bArr, i10, i11);
    }
}
