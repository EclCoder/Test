package z1;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f58573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f58574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f58575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f58576d;

    public l(androidx.media3.datasource.a aVar, d dVar) {
        this.f58573a = (androidx.media3.datasource.a) w1.a.e(aVar);
        this.f58574b = (d) w1.a.e(dVar);
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) {
        long jA = this.f58573a.a(gVar);
        this.f58576d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (gVar.f58551h == -1 && jA != -1) {
            gVar = gVar.e(0L, jA);
        }
        this.f58575c = true;
        this.f58574b.a(gVar);
        return this.f58576d;
    }

    @Override // androidx.media3.datasource.a
    public void c(m mVar) {
        w1.a.e(mVar);
        this.f58573a.c(mVar);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        try {
            this.f58573a.close();
        } finally {
            if (this.f58575c) {
                this.f58575c = false;
                this.f58574b.close();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Map getResponseHeaders() {
        return this.f58573a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f58573a.getUri();
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f58576d == 0) {
            return -1;
        }
        int i12 = this.f58573a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f58574b.write(bArr, i10, i12);
            long j10 = this.f58576d;
            if (j10 != -1) {
                this.f58576d = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
