package wa;

import com.google.android.exoplayer2.v0;
import ea.h0;
import ob.n0;
import u9.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y f56019d = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u9.k f56020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f56021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f56022c;

    public b(u9.k kVar, v0 v0Var, n0 n0Var) {
        this.f56020a = kVar;
        this.f56021b = v0Var;
        this.f56022c = n0Var;
    }

    @Override // wa.j
    public boolean a(u9.l lVar) {
        return this.f56020a.c(lVar, f56019d) == 0;
    }

    @Override // wa.j
    public void b(u9.m mVar) {
        this.f56020a.b(mVar);
    }

    @Override // wa.j
    public void c() {
        this.f56020a.seek(0L, 0L);
    }

    @Override // wa.j
    public boolean d() {
        u9.k kVar = this.f56020a;
        return (kVar instanceof h0) || (kVar instanceof ca.g);
    }

    @Override // wa.j
    public boolean e() {
        u9.k kVar = this.f56020a;
        return (kVar instanceof ea.h) || (kVar instanceof ea.b) || (kVar instanceof ea.e) || (kVar instanceof ba.f);
    }

    @Override // wa.j
    public j f() {
        u9.k fVar;
        ob.a.g(!d());
        u9.k kVar = this.f56020a;
        if (kVar instanceof s) {
            fVar = new s(this.f56021b.f18859c, this.f56022c);
        } else if (kVar instanceof ea.h) {
            fVar = new ea.h();
        } else if (kVar instanceof ea.b) {
            fVar = new ea.b();
        } else if (kVar instanceof ea.e) {
            fVar = new ea.e();
        } else {
            if (!(kVar instanceof ba.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f56020a.getClass().getSimpleName());
            }
            fVar = new ba.f();
        }
        return new b(fVar, this.f56021b, this.f56022c);
    }
}
