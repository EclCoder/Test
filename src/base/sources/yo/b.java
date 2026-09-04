package yo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import zn.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b extends yo.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lock f58171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final oo.c f58172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final po.b f58173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Set f58174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Queue f58175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Queue f58176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Map f58177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f58178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TimeUnit f58179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected volatile int f58180m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f58181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qo.b f58182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f58183c;

        a(f fVar, qo.b bVar, Object obj) {
            this.f58181a = fVar;
            this.f58182b = bVar;
            this.f58183c = obj;
        }

        @Override // yo.c
        public void a() {
            b.this.f58171d.lock();
            try {
                this.f58181a.a();
            } finally {
                b.this.f58171d.unlock();
            }
        }
    }

    public b(oo.c cVar, po.b bVar, int i10) {
        this(cVar, bVar, i10, -1L, TimeUnit.MILLISECONDS);
    }

    protected Queue b() {
        return new LinkedList();
    }

    protected Map c() {
        return new HashMap();
    }

    protected Queue d() {
        return new LinkedList();
    }

    public c e(qo.b bVar, Object obj) {
        return new a(new f(), bVar, obj);
    }

    public b(oo.c cVar, po.b bVar, int i10, long j10, TimeUnit timeUnit) {
        h.k(getClass());
        ip.a.h(cVar, "Connection operator");
        ip.a.h(bVar, "Connections per route");
        this.f58171d = this.f58168a;
        this.f58174g = this.f58169b;
        this.f58172e = cVar;
        this.f58173f = bVar;
        this.f58180m = i10;
        this.f58175h = b();
        this.f58176i = d();
        this.f58177j = c();
        this.f58178k = j10;
        this.f58179l = timeUnit;
    }

    public b(oo.c cVar, ep.d dVar) {
        this(cVar, po.a.a(dVar), po.a.b(dVar));
    }
}
