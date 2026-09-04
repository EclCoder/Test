package gd;

import ld.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.a f39128a;

    public k(ce.a aVar) {
        this.f39128a = aVar;
    }

    public static /* synthetic */ void a(e eVar, ce.b bVar) {
        ((le.a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(o oVar) {
        if (oVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(oVar);
            this.f39128a.a(new ce.a.InterfaceC0137a() { // from class: gd.j
                @Override // ce.a.InterfaceC0137a
                public final void a(ce.b bVar) {
                    k.a(eVar, bVar);
                }
            });
        }
    }
}
