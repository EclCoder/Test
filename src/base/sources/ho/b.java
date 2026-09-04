package ho;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f40726a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends InflaterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40727a;

        public a(InputStream inputStream, Inflater inflater) {
            super(inputStream, inflater);
            this.f40727a = false;
        }

        @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f40727a) {
                return;
            }
            this.f40727a = true;
            ((InflaterInputStream) this).inf.end();
            super.close();
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f40726a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f40726a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f40726a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f40726a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f40726a.read();
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.f40726a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f40726a.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f40726a.read(bArr);
    }

    public b(InputStream inputStream) throws IOException {
        boolean z10;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int i10 = pushbackInputStream.read();
        int i11 = pushbackInputStream.read();
        if (i10 != -1 && i11 != -1) {
            pushbackInputStream.unread(i11);
            pushbackInputStream.unread(i10);
            int i12 = i10 & 255;
            int i13 = (i12 >> 4) & 15;
            int i14 = i11 & 255;
            if ((i10 & 15) == 8 && i13 <= 7 && ((i12 << 8) | i14) % 31 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f40726a = new a(pushbackInputStream, new Inflater(z10));
            return;
        }
        throw new ZipException(obFGmWgqyy.dyOdegbah);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.f40726a.read(bArr, i10, i11);
    }
}
