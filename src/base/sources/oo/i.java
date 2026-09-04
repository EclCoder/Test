package oo;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class i extends InputStream implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected InputStream f49199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f49201c;

    public i(InputStream inputStream, j jVar) {
        ip.a.h(inputStream, "Wrapped stream");
        this.f49199a = inputStream;
        this.f49200b = false;
        this.f49201c = jVar;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!q()) {
            return 0;
        }
        try {
            return this.f49199a.available();
        } catch (IOException e10) {
            k();
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49200b = true;
        l();
    }

    @Override // oo.f
    public void d() {
        this.f49200b = true;
        k();
    }

    protected void k() {
        InputStream inputStream = this.f49199a;
        if (inputStream != null) {
            try {
                j jVar = this.f49201c;
                if (jVar != null ? jVar.c(inputStream) : true) {
                    inputStream.close();
                }
            } finally {
                this.f49199a = null;
            }
        }
    }

    protected void l() {
        InputStream inputStream = this.f49199a;
        if (inputStream != null) {
            try {
                j jVar = this.f49201c;
                if (jVar != null ? jVar.e(inputStream) : true) {
                    inputStream.close();
                }
            } finally {
                this.f49199a = null;
            }
        }
    }

    protected void m(int i10) {
        InputStream inputStream = this.f49199a;
        if (inputStream == null || i10 >= 0) {
            return;
        }
        try {
            j jVar = this.f49201c;
            if (jVar != null ? jVar.a(inputStream) : true) {
                inputStream.close();
            }
        } finally {
            this.f49199a = null;
        }
    }

    protected boolean q() throws IOException {
        if (this.f49200b) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.f49199a != null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!q()) {
            return -1;
        }
        try {
            int i10 = this.f49199a.read();
            m(i10);
            return i10;
        } catch (IOException e10) {
            k();
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (!q()) {
            return -1;
        }
        try {
            int i12 = this.f49199a.read(bArr, i10, i11);
            m(i12);
            return i12;
        } catch (IOException e10) {
            k();
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
