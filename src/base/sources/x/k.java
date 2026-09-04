package x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f56553a = new boolean[3];

    static void a(f fVar, u.d dVar, e eVar) {
        eVar.f56469t = -1;
        eVar.f56471u = -1;
        e.b bVar = fVar.f56434b0[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f56434b0[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.Q.f56418g;
            int iY = fVar.Y() - eVar.S.f56418g;
            d dVar2 = eVar.Q;
            dVar2.f56420i = dVar.q(dVar2);
            d dVar3 = eVar.S;
            dVar3.f56420i = dVar.q(dVar3);
            dVar.f(eVar.Q.f56420i, i10);
            dVar.f(eVar.S.f56420i, iY);
            eVar.f56469t = 2;
            eVar.T0(i10, iY);
        }
        if (fVar.f56434b0[1] == bVar2 || eVar.f56434b0[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.R.f56418g;
        int iZ = fVar.z() - eVar.T.f56418g;
        d dVar4 = eVar.R;
        dVar4.f56420i = dVar.q(dVar4);
        d dVar5 = eVar.T;
        dVar5.f56420i = dVar.q(dVar5);
        dVar.f(eVar.R.f56420i, i11);
        dVar.f(eVar.T.f56420i, iZ);
        if (eVar.f56458n0 > 0 || eVar.X() == 8) {
            d dVar6 = eVar.U;
            dVar6.f56420i = dVar.q(dVar6);
            dVar.f(eVar.U.f56420i, eVar.f56458n0 + i11);
        }
        eVar.f56471u = 2;
        eVar.k1(i11, iZ);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
