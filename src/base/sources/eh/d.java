package eh;

import android.view.WindowManager;
import dg.u;
import em.o0;
import yf.i0;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f37904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f37905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f37906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f37907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f37908e;

    public d(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        this.f37904a = aVar;
        this.f37905b = aVar2;
        this.f37906c = aVar3;
        this.f37907d = aVar4;
        this.f37908e = aVar5;
    }

    public static d a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(i0 i0Var, o0 o0Var, p pVar, u uVar) {
        return new c(i0Var, o0Var, pVar, uVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        c cVarC = c((i0) this.f37904a.get(), (o0) this.f37905b.get(), (p) this.f37906c.get(), (u) this.f37907d.get());
        zg.c.a(cVarC, (WindowManager) this.f37908e.get());
        return cVarC;
    }
}
