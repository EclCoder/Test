package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class n implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f6028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f6030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f6031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6032e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(w1.u uVar);
    }

    public n(androidx.media3.datasource.a aVar, int i10, a aVar2) {
        w1.a.a(i10 > 0);
        this.f6028a = aVar;
        this.f6029b = i10;
        this.f6030c = aVar2;
        this.f6031d = new byte[1];
        this.f6032e = i10;
    }

    private boolean d() {
        if (this.f6028a.read(this.f6031d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f6031d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f6028a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f6030c.a(new w1.u(bArr, i10));
        }
        return true;
    }

    @Override // androidx.media3.datasource.a
    public long a(z1.g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public void c(z1.m mVar) {
        w1.a.e(mVar);
        this.f6028a.c(mVar);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public Map getResponseHeaders() {
        return this.f6028a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f6028a.getUri();
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f6032e == 0) {
            if (!d()) {
                return -1;
            }
            this.f6032e = this.f6029b;
        }
        int i12 = this.f6028a.read(bArr, i10, Math.min(this.f6032e, i11));
        if (i12 != -1) {
            this.f6032e -= i12;
        }
        return i12;
    }
}
