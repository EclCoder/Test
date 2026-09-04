package c9;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile v f9679e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m9.a f9680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m9.a f9681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i9.e f9682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j9.r f9683d;

    u(m9.a aVar, m9.a aVar2, i9.e eVar, j9.r rVar, j9.v vVar) {
        this.f9680a = aVar;
        this.f9681b = aVar2;
        this.f9682c = eVar;
        this.f9683d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f9680a.a()).o(this.f9681b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        oVar.c().e();
        oVar.c().b();
        return aVarG.d();
    }

    public static u c() {
        v vVar = f9679e;
        if (vVar != null) {
            return vVar.h();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(a9.b.b("proto"));
    }

    public static void f(Context context) {
        if (f9679e == null) {
            synchronized (u.class) {
                try {
                    if (f9679e == null) {
                        f9679e = e.a().a(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // c9.t
    public void a(o oVar, a9.j jVar) {
        this.f9682c.a(oVar.f().f(oVar.c().d()), b(oVar), jVar);
    }

    public j9.r e() {
        return this.f9683d;
    }

    public a9.i g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
