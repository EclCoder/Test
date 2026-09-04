package y;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b.a f57094a = new b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f57095b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f57096c = 0;

    private static boolean a(int i10, x.e eVar) {
        x.e.b bVar;
        x.e.b bVar2;
        x.e.b bVarC = eVar.C();
        x.e.b bVarV = eVar.V();
        x.f fVar = eVar.M() != null ? (x.f) eVar.M() : null;
        if (fVar != null) {
            fVar.C();
            x.e.b bVar3 = x.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.V();
            x.e.b bVar4 = x.e.b.FIXED;
        }
        x.e.b bVar5 = x.e.b.FIXED;
        boolean z10 = bVarC == bVar5 || eVar.p0() || bVarC == x.e.b.WRAP_CONTENT || (bVarC == (bVar2 = x.e.b.MATCH_CONSTRAINT) && eVar.f56475w == 0 && eVar.f56442f0 == 0.0f && eVar.c0(0)) || (bVarC == bVar2 && eVar.f56475w == 1 && eVar.f0(0, eVar.Y()));
        boolean z11 = bVarV == bVar5 || eVar.q0() || bVarV == x.e.b.WRAP_CONTENT || (bVarV == (bVar = x.e.b.MATCH_CONSTRAINT) && eVar.f56477x == 0 && eVar.f56442f0 == 0.0f && eVar.c0(1)) || (bVarV == bVar && eVar.f56477x == 1 && eVar.f0(1, eVar.z()));
        if (eVar.f56442f0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, x.e eVar, b.InterfaceC0875b interfaceC0875b, boolean z10) {
        x.d dVar;
        x.d dVar2;
        x.d dVar3;
        x.d dVar4;
        if (eVar.i0()) {
            return;
        }
        boolean z11 = true;
        f57095b++;
        if (!(eVar instanceof x.f) && eVar.o0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                x.f.Y1(i11, eVar, interfaceC0875b, new b.a(), b.a.f57048k);
            }
        }
        x.d dVarQ = eVar.q(x.d.a.LEFT);
        x.d dVarQ2 = eVar.q(x.d.a.RIGHT);
        int iE = dVarQ.e();
        int iE2 = dVarQ2.e();
        if (dVarQ.d() != null && dVarQ.n()) {
            for (x.d dVar5 : dVarQ.d()) {
                x.e eVar2 = dVar5.f56415d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.o0() && zA) {
                    x.f.Y1(i12, eVar2, interfaceC0875b, new b.a(), b.a.f57048k);
                }
                boolean z12 = ((dVar5 == eVar2.Q && (dVar4 = eVar2.S.f56417f) != null && dVar4.n()) || (dVar5 == eVar2.S && (dVar3 = eVar2.Q.f56417f) != null && dVar3.n())) ? z11 : false;
                x.e.b bVarC = eVar2.C();
                x.e.b bVar = x.e.b.MATCH_CONSTRAINT;
                if (bVarC != bVar || zA) {
                    if (!eVar2.o0()) {
                        x.d dVar6 = eVar2.Q;
                        if (dVar5 == dVar6 && eVar2.S.f56417f == null) {
                            int iF = dVar6.f() + iE;
                            eVar2.K0(iF, eVar2.Y() + iF);
                            b(i12, eVar2, interfaceC0875b, z10);
                        } else {
                            x.d dVar7 = eVar2.S;
                            if (dVar5 == dVar7 && dVar6.f56417f == null) {
                                int iF2 = iE - dVar7.f();
                                eVar2.K0(iF2 - eVar2.Y(), iF2);
                                b(i12, eVar2, interfaceC0875b, z10);
                            } else if (z12 && !eVar2.k0()) {
                                d(i12, interfaceC0875b, eVar2, z10);
                            }
                        }
                    }
                } else if (eVar2.C() == bVar && eVar2.A >= 0 && eVar2.f56481z >= 0 && ((eVar2.X() == 8 || (eVar2.f56475w == 0 && eVar2.x() == 0.0f)) && !eVar2.k0() && !eVar2.n0() && z12 && !eVar2.k0())) {
                    e(i12, eVar, interfaceC0875b, eVar2, z10);
                }
                z11 = z11;
            }
        }
        boolean z13 = z11;
        if (eVar instanceof x.h) {
            return;
        }
        if (dVarQ2.d() != null && dVarQ2.n()) {
            for (x.d dVar8 : dVarQ2.d()) {
                x.e eVar3 = dVar8.f56415d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.o0() && zA2) {
                    x.f.Y1(i13, eVar3, interfaceC0875b, new b.a(), b.a.f57048k);
                }
                boolean z14 = ((dVar8 == eVar3.Q && (dVar2 = eVar3.S.f56417f) != null && dVar2.n()) || (dVar8 == eVar3.S && (dVar = eVar3.Q.f56417f) != null && dVar.n())) ? z13 : false;
                x.e.b bVarC2 = eVar3.C();
                x.e.b bVar2 = x.e.b.MATCH_CONSTRAINT;
                if (bVarC2 != bVar2 || zA2) {
                    if (!eVar3.o0()) {
                        x.d dVar9 = eVar3.Q;
                        if (dVar8 == dVar9 && eVar3.S.f56417f == null) {
                            int iF3 = dVar9.f() + iE2;
                            eVar3.K0(iF3, eVar3.Y() + iF3);
                            b(i13, eVar3, interfaceC0875b, z10);
                        } else {
                            x.d dVar10 = eVar3.S;
                            if (dVar8 == dVar10 && dVar9.f56417f == null) {
                                int iF4 = iE2 - dVar10.f();
                                eVar3.K0(iF4 - eVar3.Y(), iF4);
                                b(i13, eVar3, interfaceC0875b, z10);
                            } else if (z14 && !eVar3.k0()) {
                                d(i13, interfaceC0875b, eVar3, z10);
                            }
                        }
                    }
                } else if (eVar3.C() == bVar2 && eVar3.A >= 0 && eVar3.f56481z >= 0 && (eVar3.X() == 8 || (eVar3.f56475w == 0 && eVar3.x() == 0.0f))) {
                    if (!eVar3.k0() && !eVar3.n0() && z14 && !eVar3.k0()) {
                        e(i13, eVar, interfaceC0875b, eVar3, z10);
                    }
                }
            }
        }
        eVar.s0();
    }

    private static void c(int i10, x.a aVar, b.InterfaceC0875b interfaceC0875b, int i11, boolean z10) {
        if (aVar.y1()) {
            if (i11 == 0) {
                b(i10 + 1, aVar, interfaceC0875b, z10);
            } else {
                i(i10 + 1, aVar, interfaceC0875b);
            }
        }
    }

    private static void d(int i10, b.InterfaceC0875b interfaceC0875b, x.e eVar, boolean z10) {
        float fA = eVar.A();
        int iE = eVar.Q.f56417f.e();
        int iE2 = eVar.S.f56417f.e();
        int iF = eVar.Q.f() + iE;
        int iF2 = iE2 - eVar.S.f();
        if (iE == iE2) {
            fA = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iY = eVar.Y();
        int i11 = (iE2 - iE) - iY;
        if (iE > iE2) {
            i11 = (iE - iE2) - iY;
        }
        int i12 = ((int) (i11 > 0 ? (fA * i11) + 0.5f : fA * i11)) + iE;
        int i13 = i12 + iY;
        if (iE > iE2) {
            i13 = i12 - iY;
        }
        eVar.K0(i12, i13);
        b(i10 + 1, eVar, interfaceC0875b, z10);
    }

    private static void e(int i10, x.e eVar, b.InterfaceC0875b interfaceC0875b, x.e eVar2, boolean z10) {
        float fA = eVar2.A();
        int iE = eVar2.Q.f56417f.e() + eVar2.Q.f();
        int iE2 = eVar2.S.f56417f.e() - eVar2.S.f();
        if (iE2 >= iE) {
            int iY = eVar2.Y();
            if (eVar2.X() != 8) {
                int i11 = eVar2.f56475w;
                if (i11 == 2) {
                    iY = (int) (eVar2.A() * 0.5f * (eVar instanceof x.f ? eVar.Y() : eVar.M().Y()));
                } else if (i11 == 0) {
                    iY = iE2 - iE;
                }
                iY = Math.max(eVar2.f56481z, iY);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    iY = Math.min(i12, iY);
                }
            }
            int i13 = iE + ((int) ((fA * ((iE2 - iE) - iY)) + 0.5f));
            eVar2.K0(i13, iY + i13);
            b(i10 + 1, eVar2, interfaceC0875b, z10);
        }
    }

    private static void f(int i10, b.InterfaceC0875b interfaceC0875b, x.e eVar) {
        float fT = eVar.T();
        int iE = eVar.R.f56417f.e();
        int iE2 = eVar.T.f56417f.e();
        int iF = eVar.R.f() + iE;
        int iF2 = iE2 - eVar.T.f();
        if (iE == iE2) {
            fT = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iZ = eVar.z();
        int i11 = (iE2 - iE) - iZ;
        if (iE > iE2) {
            i11 = (iE - iE2) - iZ;
        }
        int i12 = (int) (i11 > 0 ? (fT * i11) + 0.5f : fT * i11);
        int i13 = iE + i12;
        int i14 = i13 + iZ;
        if (iE > iE2) {
            i13 = iE - i12;
            i14 = i13 - iZ;
        }
        eVar.N0(i13, i14);
        i(i10 + 1, eVar, interfaceC0875b);
    }

    private static void g(int i10, x.e eVar, b.InterfaceC0875b interfaceC0875b, x.e eVar2) {
        float fT = eVar2.T();
        int iE = eVar2.R.f56417f.e() + eVar2.R.f();
        int iE2 = eVar2.T.f56417f.e() - eVar2.T.f();
        if (iE2 >= iE) {
            int iZ = eVar2.z();
            if (eVar2.X() != 8) {
                int i11 = eVar2.f56477x;
                if (i11 == 2) {
                    iZ = (int) (fT * 0.5f * (eVar instanceof x.f ? eVar.z() : eVar.M().z()));
                } else if (i11 == 0) {
                    iZ = iE2 - iE;
                }
                iZ = Math.max(eVar2.C, iZ);
                int i12 = eVar2.D;
                if (i12 > 0) {
                    iZ = Math.min(i12, iZ);
                }
            }
            int i13 = iE + ((int) ((fT * ((iE2 - iE) - iZ)) + 0.5f));
            eVar2.N0(i13, iZ + i13);
            i(i10 + 1, eVar2, interfaceC0875b);
        }
    }

    public static void h(x.f fVar, b.InterfaceC0875b interfaceC0875b) {
        x.e.b bVarC = fVar.C();
        x.e.b bVarV = fVar.V();
        f57095b = 0;
        f57096c = 0;
        fVar.y0();
        ArrayList arrayListW1 = fVar.w1();
        int size = arrayListW1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((x.e) arrayListW1.get(i10)).y0();
        }
        boolean zV1 = fVar.V1();
        if (bVarC == x.e.b.FIXED) {
            fVar.K0(0, fVar.Y());
        } else {
            fVar.L0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            x.e eVar = (x.e) arrayListW1.get(i11);
            if (eVar instanceof x.h) {
                x.h hVar = (x.h) eVar;
                if (hVar.x1() == 1) {
                    if (hVar.y1() != -1) {
                        hVar.B1(hVar.y1());
                    } else if (hVar.z1() != -1 && fVar.p0()) {
                        hVar.B1(fVar.Y() - hVar.z1());
                    } else if (fVar.p0()) {
                        hVar.B1((int) ((hVar.A1() * fVar.Y()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof x.a) && ((x.a) eVar).C1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                x.e eVar2 = (x.e) arrayListW1.get(i12);
                if (eVar2 instanceof x.h) {
                    x.h hVar2 = (x.h) eVar2;
                    if (hVar2.x1() == 1) {
                        b(0, hVar2, interfaceC0875b, zV1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0875b, zV1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                x.e eVar3 = (x.e) arrayListW1.get(i13);
                if (eVar3 instanceof x.a) {
                    x.a aVar = (x.a) eVar3;
                    if (aVar.C1() == 0) {
                        c(0, aVar, interfaceC0875b, 0, zV1);
                    }
                }
            }
        }
        if (bVarV == x.e.b.FIXED) {
            fVar.N0(0, fVar.z());
        } else {
            fVar.M0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            x.e eVar4 = (x.e) arrayListW1.get(i14);
            if (eVar4 instanceof x.h) {
                x.h hVar3 = (x.h) eVar4;
                if (hVar3.x1() == 0) {
                    if (hVar3.y1() != -1) {
                        hVar3.B1(hVar3.y1());
                    } else if (hVar3.z1() != -1 && fVar.q0()) {
                        hVar3.B1(fVar.z() - hVar3.z1());
                    } else if (fVar.q0()) {
                        hVar3.B1((int) ((hVar3.A1() * fVar.z()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof x.a) && ((x.a) eVar4).C1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                x.e eVar5 = (x.e) arrayListW1.get(i15);
                if (eVar5 instanceof x.h) {
                    x.h hVar4 = (x.h) eVar5;
                    if (hVar4.x1() == 0) {
                        i(1, hVar4, interfaceC0875b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0875b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                x.e eVar6 = (x.e) arrayListW1.get(i16);
                if (eVar6 instanceof x.a) {
                    x.a aVar2 = (x.a) eVar6;
                    if (aVar2.C1() == 1) {
                        c(0, aVar2, interfaceC0875b, 1, zV1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            x.e eVar7 = (x.e) arrayListW1.get(i17);
            if (eVar7.o0() && a(0, eVar7)) {
                x.f.Y1(0, eVar7, interfaceC0875b, f57094a, b.a.f57048k);
                if (!(eVar7 instanceof x.h)) {
                    b(0, eVar7, interfaceC0875b, zV1);
                    i(0, eVar7, interfaceC0875b);
                } else if (((x.h) eVar7).x1() == 0) {
                    i(0, eVar7, interfaceC0875b);
                } else {
                    b(0, eVar7, interfaceC0875b, zV1);
                }
            }
        }
    }

    private static void i(int i10, x.e eVar, b.InterfaceC0875b interfaceC0875b) {
        x.d dVar;
        x.d dVar2;
        x.d dVar3;
        x.d dVar4;
        if (eVar.r0()) {
            return;
        }
        boolean z10 = true;
        f57096c++;
        if (!(eVar instanceof x.f) && eVar.o0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                x.f.Y1(i11, eVar, interfaceC0875b, new b.a(), b.a.f57048k);
            }
        }
        x.d dVarQ = eVar.q(x.d.a.TOP);
        x.d dVarQ2 = eVar.q(x.d.a.BOTTOM);
        int iE = dVarQ.e();
        int iE2 = dVarQ2.e();
        if (dVarQ.d() != null && dVarQ.n()) {
            for (x.d dVar5 : dVarQ.d()) {
                x.e eVar2 = dVar5.f56415d;
                int i12 = i10 + 1;
                boolean zA = a(i12, eVar2);
                if (eVar2.o0() && zA) {
                    x.f.Y1(i12, eVar2, interfaceC0875b, new b.a(), b.a.f57048k);
                }
                boolean z11 = ((dVar5 == eVar2.R && (dVar4 = eVar2.T.f56417f) != null && dVar4.n()) || (dVar5 == eVar2.T && (dVar3 = eVar2.R.f56417f) != null && dVar3.n())) ? z10 : false;
                x.e.b bVarV = eVar2.V();
                boolean z12 = z10;
                x.e.b bVar = x.e.b.MATCH_CONSTRAINT;
                if (bVarV != bVar || zA) {
                    if (!eVar2.o0()) {
                        x.d dVar6 = eVar2.R;
                        if (dVar5 == dVar6 && eVar2.T.f56417f == null) {
                            int iF = dVar6.f() + iE;
                            eVar2.N0(iF, eVar2.z() + iF);
                            i(i12, eVar2, interfaceC0875b);
                        } else {
                            x.d dVar7 = eVar2.T;
                            if (dVar5 == dVar7 && dVar6.f56417f == null) {
                                int iF2 = iE - dVar7.f();
                                eVar2.N0(iF2 - eVar2.z(), iF2);
                                i(i12, eVar2, interfaceC0875b);
                            } else if (z11 && !eVar2.m0()) {
                                f(i12, interfaceC0875b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.V() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && ((eVar2.X() == 8 || (eVar2.f56477x == 0 && eVar2.x() == 0.0f)) && !eVar2.m0() && !eVar2.n0() && z11 && !eVar2.m0())) {
                    g(i12, eVar, interfaceC0875b, eVar2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (eVar instanceof x.h) {
            return;
        }
        if (dVarQ2.d() != null && dVarQ2.n()) {
            for (x.d dVar8 : dVarQ2.d()) {
                x.e eVar3 = dVar8.f56415d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, eVar3);
                if (eVar3.o0() && zA2) {
                    x.f.Y1(i13, eVar3, interfaceC0875b, new b.a(), b.a.f57048k);
                }
                boolean z14 = ((dVar8 == eVar3.R && (dVar2 = eVar3.T.f56417f) != null && dVar2.n()) || (dVar8 == eVar3.T && (dVar = eVar3.R.f56417f) != null && dVar.n())) ? z13 : false;
                x.e.b bVarV2 = eVar3.V();
                x.e.b bVar2 = x.e.b.MATCH_CONSTRAINT;
                if (bVarV2 != bVar2 || zA2) {
                    if (!eVar3.o0()) {
                        x.d dVar9 = eVar3.R;
                        if (dVar8 == dVar9 && eVar3.T.f56417f == null) {
                            int iF3 = dVar9.f() + iE2;
                            eVar3.N0(iF3, eVar3.z() + iF3);
                            i(i13, eVar3, interfaceC0875b);
                        } else {
                            x.d dVar10 = eVar3.T;
                            if (dVar8 == dVar10 && dVar9.f56417f == null) {
                                int iF4 = iE2 - dVar10.f();
                                eVar3.N0(iF4 - eVar3.z(), iF4);
                                i(i13, eVar3, interfaceC0875b);
                            } else if (z14 && !eVar3.m0()) {
                                f(i13, interfaceC0875b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.V() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.X() == 8 || (eVar3.f56477x == 0 && eVar3.x() == 0.0f))) {
                    if (!eVar3.m0() && !eVar3.n0() && z14 && !eVar3.m0()) {
                        g(i13, eVar, interfaceC0875b, eVar3);
                    }
                }
            }
        }
        x.d dVarQ3 = eVar.q(x.d.a.BASELINE);
        if (dVarQ3.d() != null && dVarQ3.n()) {
            int iE3 = dVarQ3.e();
            for (x.d dVar11 : dVarQ3.d()) {
                x.e eVar4 = dVar11.f56415d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, eVar4);
                if (eVar4.o0() && zA3) {
                    x.f.Y1(i14, eVar4, interfaceC0875b, new b.a(), b.a.f57048k);
                }
                if (eVar4.V() != x.e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.o0() && dVar11 == eVar4.U) {
                        eVar4.J0(dVar11.f() + iE3);
                        i(i14, eVar4, interfaceC0875b);
                    }
                }
            }
        }
        eVar.t0();
    }
}
