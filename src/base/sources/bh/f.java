package bh;

import android.view.WindowManager;
import em.k0;
import em.o0;
import yf.g0;
import yf.m;
import yf.o;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f8941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f8942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f8943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f8944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f8945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final el.a f8946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final el.a f8947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final el.a f8948h;

    public f(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7, el.a aVar8) {
        this.f8941a = aVar;
        this.f8942b = aVar2;
        this.f8943c = aVar3;
        this.f8944d = aVar4;
        this.f8945e = aVar5;
        this.f8946f = aVar6;
        this.f8947g = aVar7;
        this.f8948h = aVar8;
    }

    public static f a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7, el.a aVar8) {
        return new f(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    public static e c(g0 g0Var, m mVar, o oVar, p pVar, dk.a aVar, o0 o0Var, k0 k0Var) {
        return new e(g0Var, mVar, oVar, pVar, aVar, o0Var, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        e eVarC = c((g0) this.f8941a.get(), (m) this.f8942b.get(), (o) this.f8943c.get(), (p) this.f8944d.get(), ek.b.a(this.f8945e), (o0) this.f8946f.get(), (k0) this.f8947g.get());
        zg.c.a(eVarC, (WindowManager) this.f8948h.get());
        return eVarC;
    }
}
