package yo;

import java.util.concurrent.TimeUnit;
import oo.p;
import ro.i;
import zn.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class d implements oo.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final i f58185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final yo.a f58186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final b f58187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final oo.c f58188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final po.c f58189e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements oo.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f58190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qo.b f58191b;

        a(c cVar, qo.b bVar) {
            this.f58190a = cVar;
            this.f58191b = bVar;
        }

        @Override // oo.d
        public void a() {
            this.f58190a.a();
        }

        @Override // oo.d
        public p b(long j10, TimeUnit timeUnit) {
            ip.a.h(this.f58191b, "Route");
            d.c(d.this);
            throw null;
        }
    }

    public d(ep.d dVar, i iVar) {
        ip.a.h(iVar, "Scheme registry");
        h.k(getClass());
        this.f58185a = iVar;
        this.f58189e = new po.c();
        this.f58188d = d(iVar);
        b bVar = (b) e(dVar);
        this.f58187c = bVar;
        this.f58186b = bVar;
    }

    static /* synthetic */ zn.a c(d dVar) {
        dVar.getClass();
        return null;
    }

    @Override // oo.b
    public oo.d a(qo.b bVar, Object obj) {
        return new a(this.f58187c.e(bVar, obj), bVar);
    }

    @Override // oo.b
    public i b() {
        return this.f58185a;
    }

    protected oo.c d(i iVar) {
        return new xo.e(iVar);
    }

    protected yo.a e(ep.d dVar) {
        return new b(this.f58188d, dVar);
    }

    protected void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // oo.b
    public void shutdown() {
        throw null;
    }
}
