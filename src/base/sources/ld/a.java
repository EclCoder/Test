package ld;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements xd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xd.a f44304a = new a();

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0672a implements wd.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0672a f44305a = new C0672a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final wd.b f44306b = wd.b.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final wd.b f44307c = wd.b.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final wd.b f44308d = wd.b.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final wd.b f44309e = wd.b.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final wd.b f44310f = wd.b.d("templateVersion");

        private C0672a() {
        }

        @Override // wd.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, wd.d dVar) {
            dVar.g(f44306b, jVar.e());
            dVar.g(f44307c, jVar.c());
            dVar.g(f44308d, jVar.d());
            dVar.g(f44309e, jVar.g());
            dVar.b(f44310f, jVar.f());
        }
    }

    private a() {
    }

    @Override // xd.a
    public void a(xd.b bVar) {
        C0672a c0672a = C0672a.f44305a;
        bVar.a(j.class, c0672a);
        bVar.a(b.class, c0672a);
    }
}
