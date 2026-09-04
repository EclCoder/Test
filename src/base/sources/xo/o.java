package xo;

import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class o implements oo.k, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f57029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xo.b f57030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oo.l f57031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f57032d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f57033a = new ConcurrentHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f57034b = new ConcurrentHashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile no.e f57035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile no.a f57036d;

        a() {
        }

        public void a(no.a aVar) {
            this.f57036d = aVar;
        }

        public void b(no.e eVar) {
            this.f57035c = eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements fp.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f57037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final oo.m f57038b;

        b(a aVar, oo.m mVar) {
            this.f57037a = aVar == null ? new a() : aVar;
            this.f57038b = mVar == null ? n.f57024f : mVar;
        }
    }

    public o(long j10, TimeUnit timeUnit) {
        this(k(), null, null, null, j10, timeUnit);
    }

    private static no.c k() {
        return no.d.b().c("http", so.b.a()).c("https", org.apache.http.conn.ssl.e.b()).a();
    }

    @Override // oo.k
    public oo.g a(qo.b bVar, Object obj) {
        ip.a.h(bVar, "HTTP route");
        throw null;
    }

    @Override // oo.k
    public void c(long j10, TimeUnit timeUnit) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown();
    }

    @Override // oo.k
    public void d(co.h hVar, Object obj, long j10, TimeUnit timeUnit) {
        ip.a.h(hVar, "Managed connection");
        synchronized (hVar) {
            d.h(hVar);
        }
    }

    protected void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // oo.k
    public void h() {
        throw null;
    }

    public void l(no.a aVar) {
        this.f57029a.a(aVar);
    }

    public void m(int i10) {
        this.f57030b.d(i10);
    }

    public void q(no.e eVar) {
        this.f57029a.b(eVar);
    }

    public void r(int i10) {
        this.f57030b.e(i10);
    }

    public void s(int i10) {
        this.f57030b.f(i10);
    }

    @Override // oo.k
    public void shutdown() {
        if (this.f57032d.compareAndSet(false, true)) {
            throw null;
        }
    }

    public o(no.c cVar, oo.m mVar, oo.r rVar, oo.h hVar, long j10, TimeUnit timeUnit) {
        this(new f(cVar, rVar, hVar), mVar, j10, timeUnit);
    }

    public o(oo.l lVar, oo.m mVar, long j10, TimeUnit timeUnit) {
        zn.h.k(getClass());
        a aVar = new a();
        this.f57029a = aVar;
        xo.b bVar = new xo.b(new b(aVar, mVar), 2, 20, j10, timeUnit);
        this.f57030b = bVar;
        bVar.f(2000);
        this.f57031c = (oo.l) ip.a.h(lVar, "HttpClientConnectionOperator");
        this.f57032d = new AtomicBoolean(false);
    }
}
