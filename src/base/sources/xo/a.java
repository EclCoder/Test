package xo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class a implements oo.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLong f57000d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ro.i f57001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oo.c f57002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f57003c;

    public a(ro.i iVar) {
        zn.h.k(getClass());
        ip.a.h(iVar, "Scheme registry");
        this.f57001a = iVar;
        this.f57002b = d(iVar);
    }

    private void c() {
        ip.b.a(!this.f57003c, "Connection manager has been shut down");
    }

    @Override // oo.b
    public final oo.d a(qo.b bVar, Object obj) {
        return new C0874a(bVar, obj);
    }

    @Override // oo.b
    public ro.i b() {
        return this.f57001a;
    }

    protected oo.c d(ro.i iVar) {
        return new e(iVar);
    }

    oo.p e(qo.b bVar, Object obj) {
        ip.a.h(bVar, "Route");
        synchronized (this) {
            c();
            throw null;
        }
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
        synchronized (this) {
            this.f57003c = true;
        }
    }

    /* JADX INFO: renamed from: xo.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0874a implements oo.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qo.b f57004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f57005b;

        C0874a(qo.b bVar, Object obj) {
            this.f57004a = bVar;
            this.f57005b = obj;
        }

        @Override // oo.d
        public oo.p b(long j10, TimeUnit timeUnit) {
            return a.this.e(this.f57004a, this.f57005b);
        }

        @Override // oo.d
        public void a() {
        }
    }
}
