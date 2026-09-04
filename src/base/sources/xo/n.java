package xo;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class n implements oo.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicLong f57023e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n f57024f = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dp.b f57025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dp.a f57026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.apache.http.entity.c f57027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final org.apache.http.entity.c f57028d;

    public n(dp.b bVar, dp.a aVar, org.apache.http.entity.c cVar, org.apache.http.entity.c cVar2) {
        zn.h.k(i.class);
        zn.h.l("org.apache.http.headers");
        zn.h.l("org.apache.http.wire");
        this.f57025a = bVar == null ? cp.a.f36024b : bVar;
        this.f57026b = aVar == null ? g.f57015c : aVar;
        this.f57027c = cVar == null ? ap.a.f8197b : cVar;
        this.f57028d = cVar2 == null ? ap.b.f8199b : cVar2;
    }

    public n(dp.b bVar, dp.a aVar) {
        this(bVar, aVar, null, null);
    }

    public n() {
        this(null, null);
    }
}
