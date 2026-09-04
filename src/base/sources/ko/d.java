package ko;

import co.o;
import co.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class d implements p {
    public d() {
        zn.h.k(getClass());
    }

    private void a(co.l lVar, eo.b bVar, eo.g gVar, fo.g gVar2) {
        bVar.h();
        throw null;
    }

    @Override // co.p
    public void c(o oVar, gp.f fVar) {
        eo.b bVarA;
        eo.b bVarA2;
        ip.a.h(oVar, "HTTP request");
        ip.a.h(fVar, "HTTP context");
        a aVarH = a.h(fVar);
        fo.a aVarI = aVarH.i();
        aVarI.getClass();
        fo.g gVarN = aVarH.n();
        gVarN.getClass();
        qo.e eVarO = aVarH.o();
        eVarO.getClass();
        co.l lVarF = aVarH.f();
        lVarF.getClass();
        if (lVarF.j() < 0) {
            lVarF = new co.l(lVarF.i(), eVarO.g().j(), lVarF.k());
        }
        eo.g gVarT = aVarH.t();
        if (gVarT != null && gVarT.c() == eo.a.UNCHALLENGED && (bVarA2 = aVarI.a(lVarF)) != null) {
            a(lVarF, bVarA2, gVarT, gVarN);
        }
        co.l lVarE = eVarO.e();
        eo.g gVarQ = aVarH.q();
        if (lVarE == null || gVarQ == null || gVarQ.c() != eo.a.UNCHALLENGED || (bVarA = aVarI.a(lVarE)) == null) {
            return;
        }
        a(lVarE, bVarA, gVarQ, gVarN);
    }
}
