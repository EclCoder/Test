package wm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f56365c = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xm.c f56366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ym.a f56367b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private xm.c f56368a = xm.a.f56880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ym.a f56369b = ym.b.f58097a;

        public a a() {
            return new a(this.f56368a, this.f56369b);
        }
    }

    public xm.c a() {
        return this.f56366a;
    }

    public ym.a b() {
        return this.f56367b;
    }

    private a(xm.c cVar, ym.a aVar) {
        this.f56366a = cVar;
        this.f56367b = aVar;
    }
}
