package nb;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f46978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f46979b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f46983f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46981d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46982e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f46980c = new byte[1];

    public k(j jVar, com.google.android.exoplayer2.upstream.a aVar) {
        this.f46978a = jVar;
        this.f46979b = aVar;
    }

    private void d() {
        if (this.f46981d) {
            return;
        }
        this.f46978a.h(this.f46979b);
        this.f46981d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f46982e) {
            return;
        }
        this.f46978a.close();
        this.f46982e = true;
    }

    public void h() {
        d();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f46980c) == -1) {
            return -1;
        }
        return this.f46980c[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        ob.a.g(!this.f46982e);
        d();
        int i12 = this.f46978a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f46983f += (long) i12;
        return i12;
    }
}
