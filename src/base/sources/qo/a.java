package qo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class a implements c {
    @Override // qo.c
    public int a(e eVar, e eVar2) {
        ip.a.h(eVar, "Planned route");
        if (eVar2 == null || eVar2.b() < 1) {
            return c(eVar);
        }
        return eVar.b() > 1 ? d(eVar, eVar2) : b(eVar, eVar2);
    }

    protected int b(e eVar, e eVar2) {
        if (eVar2.b() <= 1 && eVar.g().equals(eVar2.g()) && eVar.i() == eVar2.i()) {
            return (eVar.getLocalAddress() == null || eVar.getLocalAddress().equals(eVar2.getLocalAddress())) ? 0 : -1;
        }
        return -1;
    }

    protected int c(e eVar) {
        return eVar.b() > 1 ? 2 : 1;
    }

    protected int d(e eVar, e eVar2) {
        int iB;
        int iB2;
        if (eVar2.b() <= 1 || !eVar.g().equals(eVar2.g()) || (iB = eVar.b()) < (iB2 = eVar2.b())) {
            return -1;
        }
        for (int i10 = 0; i10 < iB2 - 1; i10++) {
            if (!eVar.f(i10).equals(eVar2.f(i10))) {
                return -1;
            }
        }
        if (iB > iB2) {
            return 4;
        }
        if ((eVar2.c() && !eVar.c()) || (eVar2.j() && !eVar.j())) {
            return -1;
        }
        if (eVar.c() && !eVar2.c()) {
            return 3;
        }
        if (!eVar.j() || eVar2.j()) {
            return eVar.i() != eVar2.i() ? -1 : 0;
        }
        return 5;
    }
}
