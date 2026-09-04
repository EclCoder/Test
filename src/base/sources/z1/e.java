package z1;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f58538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f58539b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58543f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f58541d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f58542e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f58540c = new byte[1];

    public e(androidx.media3.datasource.a aVar, g gVar) {
        this.f58538a = aVar;
        this.f58539b = gVar;
    }

    private void d() {
        if (this.f58541d) {
            return;
        }
        this.f58538a.a(this.f58539b);
        this.f58541d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f58542e) {
            return;
        }
        this.f58538a.close();
        this.f58542e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f58540c) == -1) {
            return -1;
        }
        return this.f58540c[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        w1.a.g(!this.f58542e);
        d();
        int i12 = this.f58538a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f58543f += (long) i12;
        return i12;
    }
}
