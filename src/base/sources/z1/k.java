package z1;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f58569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f58570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f58571c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f58572d = Collections.EMPTY_MAP;

    public k(androidx.media3.datasource.a aVar) {
        this.f58569a = (androidx.media3.datasource.a) w1.a.e(aVar);
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) {
        this.f58571c = gVar.f58544a;
        this.f58572d = Collections.EMPTY_MAP;
        long jA = this.f58569a.a(gVar);
        this.f58571c = (Uri) w1.a.e(getUri());
        this.f58572d = getResponseHeaders();
        return jA;
    }

    @Override // androidx.media3.datasource.a
    public void c(m mVar) {
        w1.a.e(mVar);
        this.f58569a.c(mVar);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f58569a.close();
    }

    public long d() {
        return this.f58570b;
    }

    public Uri e() {
        return this.f58571c;
    }

    public Map f() {
        return this.f58572d;
    }

    public void g() {
        this.f58570b = 0L;
    }

    @Override // androidx.media3.datasource.a
    public Map getResponseHeaders() {
        return this.f58569a.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f58569a.getUri();
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f58569a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f58570b += (long) i12;
        }
        return i12;
    }
}
