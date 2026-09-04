package x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l extends m {
    @Override // x.m
    public void H1(int i10, int i11, int i12, int i13) {
        int iE1 = E1() + F1();
        int iG1 = G1() + D1();
        if (this.W0 > 0) {
            iE1 += this.V0[0].Y();
            iG1 += this.V0[0].z();
        }
        int iMax = Math.max(K(), iE1);
        int iMax2 = Math.max(J(), iG1);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(iMax, i11);
            } else {
                i11 = i10 == 0 ? iMax : 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(iMax2, i13);
            } else {
                i13 = i12 == 0 ? iMax2 : 0;
            }
        }
        M1(i11, i13);
        p1(i11);
        Q0(i13);
        L1(this.W0 > 0);
    }

    @Override // x.e
    public void g(u.d dVar, boolean z10) {
        super.g(dVar, z10);
        if (this.W0 > 0) {
            e eVar = this.V0[0];
            eVar.w0();
            d.a aVar = d.a.LEFT;
            eVar.j(aVar, this, aVar);
            d.a aVar2 = d.a.RIGHT;
            eVar.j(aVar2, this, aVar2);
            d.a aVar3 = d.a.TOP;
            eVar.j(aVar3, this, aVar3);
            d.a aVar4 = d.a.BOTTOM;
            eVar.j(aVar4, this, aVar4);
        }
    }
}
