package ta;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.v0;
import java.util.Map;
import nb.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements Loader.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53211a = ra.i.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f53212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0 f53214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f53216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f53217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f53218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final z f53219i;

    public f(nb.j jVar, com.google.android.exoplayer2.upstream.a aVar, int i10, v0 v0Var, int i11, Object obj, long j10, long j11) {
        this.f53219i = new z(jVar);
        this.f53212b = (com.google.android.exoplayer2.upstream.a) ob.a.e(aVar);
        this.f53213c = i10;
        this.f53214d = v0Var;
        this.f53215e = i11;
        this.f53216f = obj;
        this.f53217g = j10;
        this.f53218h = j11;
    }

    public final long a() {
        return this.f53219i.f();
    }

    public final long b() {
        return this.f53218h - this.f53217g;
    }

    public final Map c() {
        return this.f53219i.j();
    }

    public final Uri d() {
        return this.f53219i.i();
    }
}
