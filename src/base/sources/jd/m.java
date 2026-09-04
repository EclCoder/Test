package jd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m implements oe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f42343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f42344b;

    public m(m0 m0Var, pd.j jVar) {
        this.f42343a = m0Var;
        this.f42344b = new l(jVar);
    }

    @Override // oe.d
    public void a(oe.d.b bVar) {
        gd.g.f().b("App Quality Sessions session changed: " + bVar);
        this.f42344b.f(bVar.a());
    }

    @Override // oe.d
    public boolean b() {
        return this.f42343a.d();
    }

    @Override // oe.d
    public oe.d.a c() {
        return oe.d.a.CRASHLYTICS;
    }

    public String d(String str) {
        return this.f42344b.c(str);
    }

    public void e(String str) {
        this.f42344b.g(str);
    }
}
