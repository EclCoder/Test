package dg;

import android.view.WindowManager;
import em.k0;
import em.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class v implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f36846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f36847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f36848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f36849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f36850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final el.a f36851f;

    public v(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6) {
        this.f36846a = aVar;
        this.f36847b = aVar2;
        this.f36848c = aVar3;
        this.f36849d = aVar4;
        this.f36850e = aVar5;
        this.f36851f = aVar6;
    }

    public static v a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static u c(WindowManager windowManager, cg.a aVar, dk.a aVar2, dk.a aVar3, o0 o0Var, k0 k0Var) {
        return new u(windowManager, aVar, aVar2, aVar3, o0Var, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((WindowManager) this.f36846a.get(), (cg.a) this.f36847b.get(), ek.b.a(this.f36848c), ek.b.a(this.f36849d), (o0) this.f36850e.get(), (k0) this.f36851f.get());
    }
}
