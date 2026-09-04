package me;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements xd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xd.a f46199a = new a();

    /* JADX INFO: renamed from: me.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0710a implements wd.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0710a f46200a = new C0710a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final wd.b f46201b = wd.b.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final wd.b f46202c = wd.b.d("variantId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final wd.b f46203d = wd.b.d("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final wd.b f46204e = wd.b.d("parameterValue");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final wd.b f46205f = wd.b.d("templateVersion");

        private C0710a() {
        }

        @Override // wd.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, wd.d dVar2) {
            dVar2.g(f46201b, dVar.d());
            dVar2.g(f46202c, dVar.f());
            dVar2.g(f46203d, dVar.b());
            dVar2.g(f46204e, dVar.c());
            dVar2.b(f46205f, dVar.e());
        }
    }

    private a() {
    }

    @Override // xd.a
    public void a(xd.b bVar) {
        C0710a c0710a = C0710a.f46200a;
        bVar.a(d.class, c0710a);
        bVar.a(b.class, c0710a);
    }
}
