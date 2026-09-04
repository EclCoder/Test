package m6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45284a;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f45284a = Integer.MIN_VALUE;
    }

    private long h(long j10) {
        int i10 = this.f45284a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    private void i(long j10) {
        int i10 = this.f45284a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f45284a = (int) (((long) i10) - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f45284a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f45284a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (h(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        i(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f45284a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jH = h(j10);
        if (jH == -1) {
            return 0L;
        }
        long jSkip = super.skip(jH);
        i(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iH = (int) h(i11);
        if (iH == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iH);
        i(i12);
        return i12;
    }
}
