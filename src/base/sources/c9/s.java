package c9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class s implements a9.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f9674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a9.b f9676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a9.g f9677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f9678e;

    s(p pVar, String str, a9.b bVar, a9.g gVar, t tVar) {
        this.f9674a = pVar;
        this.f9675b = str;
        this.f9676c = bVar;
        this.f9677d = gVar;
        this.f9678e = tVar;
    }

    @Override // a9.h
    public void a(a9.c cVar, a9.j jVar) {
        this.f9678e.a(o.a().e(this.f9674a).c(cVar).f(this.f9675b).d(this.f9677d).b(this.f9676c).a(), jVar);
    }

    @Override // a9.h
    public void b(a9.c cVar) {
        a(cVar, new a9.j() { // from class: c9.r
            @Override // a9.j
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    p d() {
        return this.f9674a;
    }

    public static /* synthetic */ void c(Exception exc) {
    }
}
