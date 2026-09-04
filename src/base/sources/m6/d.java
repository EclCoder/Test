package m6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue f45269c = l.f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f45270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f45271b;

    d() {
    }

    public static d h(InputStream inputStream) {
        d dVar;
        Queue queue = f45269c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.i(inputStream);
        return dVar;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f45270a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f45270a.close();
    }

    public IOException d() {
        return this.f45271b;
    }

    void i(InputStream inputStream) {
        this.f45270a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f45270a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f45270a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f45270a.read();
        } catch (IOException e10) {
            this.f45271b = e10;
            throw e10;
        }
    }

    public void release() {
        this.f45271b = null;
        this.f45270a = null;
        Queue queue = f45269c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f45270a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f45270a.skip(j10);
        } catch (IOException e10) {
            this.f45271b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f45270a.read(bArr);
        } catch (IOException e10) {
            this.f45271b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f45270a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f45271b = e10;
            throw e10;
        }
    }
}
