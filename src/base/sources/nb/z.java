package nb;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f47073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f47074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f47075c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f47076d = Collections.EMPTY_MAP;

    public z(j jVar) {
        this.f47073a = (j) ob.a.e(jVar);
    }

    @Override // nb.j
    public void close() {
        this.f47073a.close();
    }

    @Override // nb.j
    public void d(a0 a0Var) {
        ob.a.e(a0Var);
        this.f47073a.d(a0Var);
    }

    public long f() {
        return this.f47074b;
    }

    @Override // nb.j
    public Map getResponseHeaders() {
        return this.f47073a.getResponseHeaders();
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f47073a.getUri();
    }

    @Override // nb.j
    public long h(com.google.android.exoplayer2.upstream.a aVar) {
        this.f47075c = aVar.f18779a;
        this.f47076d = Collections.EMPTY_MAP;
        long jH = this.f47073a.h(aVar);
        this.f47075c = (Uri) ob.a.e(getUri());
        this.f47076d = getResponseHeaders();
        return jH;
    }

    public Uri i() {
        return this.f47075c;
    }

    public Map j() {
        return this.f47076d;
    }

    public void k() {
        this.f47074b = 0L;
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f47073a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f47074b += (long) i12;
        }
        return i12;
    }
}
