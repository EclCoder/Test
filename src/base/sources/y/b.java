package y;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f57045a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f57046b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x.f f57047c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f57048k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f57049l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f57050m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x.e.b f57051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x.e.b f57052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f57053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f57054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f57055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f57056f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f57057g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f57058h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f57059i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f57060j;
    }

    /* JADX INFO: renamed from: y.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0875b {
        void a();

        void b(x.e eVar, a aVar);
    }

    public b(x.f fVar) {
        this.f57047c = fVar;
    }

    private boolean a(InterfaceC0875b interfaceC0875b, x.e eVar, int i10) {
        this.f57046b.f57051a = eVar.C();
        this.f57046b.f57052b = eVar.V();
        this.f57046b.f57053c = eVar.Y();
        this.f57046b.f57054d = eVar.z();
        a aVar = this.f57046b;
        aVar.f57059i = false;
        aVar.f57060j = i10;
        x.e.b bVar = aVar.f57051a;
        x.e.b bVar2 = x.e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f57052b == bVar2;
        boolean z12 = z10 && eVar.f56442f0 > 0.0f;
        boolean z13 = z11 && eVar.f56442f0 > 0.0f;
        if (z12 && eVar.f56479y[0] == 4) {
            aVar.f57051a = x.e.b.FIXED;
        }
        if (z13 && eVar.f56479y[1] == 4) {
            aVar.f57052b = x.e.b.FIXED;
        }
        interfaceC0875b.b(eVar, aVar);
        eVar.p1(this.f57046b.f57055e);
        eVar.Q0(this.f57046b.f57056f);
        eVar.P0(this.f57046b.f57058h);
        eVar.F0(this.f57046b.f57057g);
        a aVar2 = this.f57046b;
        aVar2.f57060j = a.f57048k;
        return aVar2.f57059i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(x.f fVar) {
        boolean z10;
        l lVar;
        n nVar;
        int size = fVar.V0.size();
        boolean zZ1 = fVar.Z1(64);
        InterfaceC0875b interfaceC0875bO1 = fVar.O1();
        for (int i10 = 0; i10 < size; i10++) {
            x.e eVar = (x.e) fVar.V0.get(i10);
            if (!(eVar instanceof x.h) && !(eVar instanceof x.a) && !eVar.n0() && (!zZ1 || (lVar = eVar.f56439e) == null || (nVar = eVar.f56441f) == null || !lVar.f57128e.f57081j || !nVar.f57128e.f57081j)) {
                x.e.b bVarW = eVar.w(0);
                x.e.b bVarW2 = eVar.w(1);
                x.e.b bVar = x.e.b.MATCH_CONSTRAINT;
                boolean z11 = bVarW == bVar && eVar.f56475w != 1 && bVarW2 == bVar && eVar.f56477x != 1;
                if (!z11 && fVar.Z1(1) && !(eVar instanceof x.m)) {
                    if (bVarW == bVar && eVar.f56475w == 0 && bVarW2 != bVar && !eVar.k0()) {
                        z11 = true;
                    }
                    if (bVarW2 == bVar && eVar.f56477x == 0 && bVarW != bVar && !eVar.k0()) {
                        z11 = true;
                    }
                    z10 = (!(bVarW == bVar || bVarW2 == bVar) || eVar.f56442f0 <= 0.0f) ? z11 : true;
                }
                if (!z10) {
                    a(interfaceC0875bO1, eVar, a.f57048k);
                }
            }
        }
        interfaceC0875bO1.a();
    }

    private void c(x.f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int iK = fVar.K();
        int iJ = fVar.J();
        fVar.f1(0);
        fVar.e1(0);
        fVar.p1(i11);
        fVar.Q0(i12);
        fVar.f1(iK);
        fVar.e1(iJ);
        this.f57047c.d2(i10);
        this.f57047c.x1();
    }

    public long d(x.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zM1;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22;
        boolean z11;
        b bVar = this;
        InterfaceC0875b interfaceC0875bO1 = fVar.O1();
        int size = fVar.V0.size();
        int iY = fVar.Y();
        int iZ = fVar.z();
        boolean zB = x.k.b(i10, 128);
        boolean z12 = zB || x.k.b(i10, 64);
        if (z12) {
            for (int i23 = 0; i23 < size; i23++) {
                x.e eVar = (x.e) fVar.V0.get(i23);
                x.e.b bVarC = eVar.C();
                x.e.b bVar2 = x.e.b.MATCH_CONSTRAINT;
                boolean z13 = (bVarC == bVar2) && (eVar.V() == bVar2) && eVar.x() > 0.0f;
                if ((eVar.k0() && z13) || ((eVar.m0() && z13) || (eVar instanceof x.m) || eVar.k0() || eVar.m0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = u.d.f53658s;
        }
        boolean z15 = z12 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i24 = 2;
        if (z15) {
            int iMin = Math.min(fVar.I(), i14);
            int iMin2 = Math.min(fVar.H(), i16);
            if (i13 == 1073741824 && fVar.Y() != iMin) {
                fVar.p1(iMin);
                fVar.S1();
            }
            if (i15 == 1073741824 && fVar.z() != iMin2) {
                fVar.Q0(iMin2);
                fVar.S1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zM1 = fVar.K1(zB);
                i19 = 2;
            } else {
                boolean zL1 = fVar.L1(zB);
                if (i13 == 1073741824) {
                    zL1 &= fVar.M1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zM1 = fVar.M1(zB, 1) & zL1;
                    i19++;
                } else {
                    zM1 = zL1;
                }
            }
            if (zM1) {
                fVar.u1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zM1 = false;
            i19 = 0;
        }
        if (zM1 && i19 == 2) {
            return 0L;
        }
        int iP1 = fVar.P1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f57045a.size();
        if (size > 0) {
            bVar.c(fVar, "First pass", 0, iY, iZ);
            i20 = iY;
            i21 = iZ;
        } else {
            i20 = iY;
            i21 = iZ;
        }
        if (size2 > 0) {
            x.e.b bVarC2 = fVar.C();
            x.e.b bVar3 = x.e.b.WRAP_CONTENT;
            boolean z16 = bVarC2 == bVar3;
            boolean z17 = fVar.V() == bVar3;
            int iMax = Math.max(fVar.Y(), bVar.f57047c.K());
            int iMax2 = Math.max(fVar.z(), bVar.f57047c.J());
            int i25 = 0;
            boolean zK1 = false;
            while (i25 < size2) {
                x.e eVar2 = (x.e) bVar.f57045a.get(i25);
                if (eVar2 instanceof x.m) {
                    int iY2 = eVar2.Y();
                    int iZ2 = eVar2.z();
                    boolean zA = bVar.a(interfaceC0875bO1, eVar2, a.f57049l) | zK1;
                    int iY3 = eVar2.Y();
                    int iZ3 = eVar2.z();
                    if (iY3 != iY2) {
                        eVar2.p1(iY3);
                        if (z16 && eVar2.O() > iMax) {
                            iMax = Math.max(iMax, eVar2.O() + eVar2.q(x.d.a.RIGHT).f());
                        }
                        z11 = true;
                    } else {
                        z11 = zA;
                    }
                    if (iZ3 != iZ2) {
                        eVar2.Q0(iZ3);
                        if (z17 && eVar2.t() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.t() + eVar2.q(x.d.a.BOTTOM).f());
                        }
                        z11 = true;
                    }
                    zK1 = z11 | ((x.m) eVar2).K1();
                }
                i25++;
                i20 = i20;
                i24 = 2;
            }
            int i26 = i20;
            int i27 = i24;
            int i28 = 0;
            while (i28 < i27) {
                int i29 = 0;
                while (i29 < size2) {
                    x.e eVar3 = (x.e) bVar.f57045a.get(i29);
                    if (((eVar3 instanceof x.i) && !(eVar3 instanceof x.m)) || (eVar3 instanceof x.h) || eVar3.X() == 8 || ((z15 && eVar3.f56439e.f57128e.f57081j && eVar3.f56441f.f57128e.f57081j) || (eVar3 instanceof x.m))) {
                        z10 = z15;
                        i22 = size2;
                    } else {
                        int iY4 = eVar3.Y();
                        int iZ4 = eVar3.z();
                        z10 = z15;
                        int iR = eVar3.r();
                        int i30 = a.f57049l;
                        i22 = size2;
                        if (i28 == 1) {
                            i30 = a.f57050m;
                        }
                        boolean zA2 = bVar.a(interfaceC0875bO1, eVar3, i30) | zK1;
                        int iY5 = eVar3.Y();
                        int iZ5 = eVar3.z();
                        if (iY5 != iY4) {
                            eVar3.p1(iY5);
                            if (z16 && eVar3.O() > iMax) {
                                iMax = Math.max(iMax, eVar3.O() + eVar3.q(x.d.a.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iZ5 != iZ4) {
                            eVar3.Q0(iZ5);
                            if (z17 && eVar3.t() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.t() + eVar3.q(x.d.a.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zK1 = (!eVar3.b0() || iR == eVar3.r()) ? zA2 : true;
                    }
                    i29++;
                    bVar = this;
                    size2 = i22;
                    z15 = z10;
                }
                boolean z18 = z15;
                int i31 = size2;
                if (!zK1) {
                    break;
                }
                i28++;
                c(fVar, "intermediate pass", i28, i26, i21);
                bVar = this;
                size2 = i31;
                z15 = z18;
                i27 = 2;
                zK1 = false;
            }
        }
        fVar.c2(iP1);
        return 0L;
    }

    public void e(x.f fVar) {
        this.f57045a.clear();
        int size = fVar.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            x.e eVar = (x.e) fVar.V0.get(i10);
            x.e.b bVarC = eVar.C();
            x.e.b bVar = x.e.b.MATCH_CONSTRAINT;
            if (bVarC == bVar || eVar.V() == bVar) {
                this.f57045a.add(eVar);
            }
        }
        fVar.S1();
    }
}
