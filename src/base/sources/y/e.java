package y;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private x.f f57063a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x.f f57066d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57064b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57065c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f57067e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f57068f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b.InterfaceC0875b f57069g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b.a f57070h = new b.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList f57071i = new ArrayList();

    public e(x.f fVar) {
        this.f57063a = fVar;
        this.f57066d = fVar;
    }

    private void a(f fVar, int i10, int i11, f fVar2, ArrayList arrayList, m mVar) {
        int i12;
        f fVar3;
        ArrayList arrayList2;
        p pVar = fVar.f57075d;
        if (pVar.f57126c == null) {
            x.f fVar4 = this.f57063a;
            if (pVar == fVar4.f56439e || pVar == fVar4.f56441f) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i11);
                arrayList.add(mVar);
            }
            m mVar2 = mVar;
            pVar.f57126c = mVar2;
            mVar2.a(pVar);
            for (d dVar : pVar.f57131h.f57082k) {
                if (dVar instanceof f) {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i12, 0, fVar3, arrayList2, mVar2);
                } else {
                    i12 = i10;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i10 = i12;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i13 = i10;
            f fVar5 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : pVar.f57132i.f57082k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i13, 1, fVar5, arrayList3, mVar2);
                }
            }
            if (i13 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f57107k.f57082k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i13, 2, fVar5, arrayList3, mVar2);
                    }
                }
            }
            for (f fVar6 : pVar.f57131h.f57083l) {
                if (fVar6 == fVar5) {
                    mVar2.f57101b = true;
                }
                a(fVar6, i13, 0, fVar5, arrayList3, mVar2);
            }
            for (f fVar7 : pVar.f57132i.f57083l) {
                if (fVar7 == fVar5) {
                    mVar2.f57101b = true;
                }
                a(fVar7, i13, 1, fVar5, arrayList3, mVar2);
            }
            if (i13 == 1 && (pVar instanceof n)) {
                Iterator it = ((n) pVar).f57107k.f57083l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i13, 2, fVar5, arrayList3, mVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0224 A[PHI: r9
      0x0224: PHI (r9v10 x.e$b) = (r9v8 x.e$b), (r9v11 x.e$b) binds: [B:122:0x0263, B:115:0x0221] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    private boolean b(x.f fVar) {
        x.e.b bVar;
        int i10;
        x.e.b bVar2;
        float f10;
        float f11;
        x.e.b bVar3;
        x.e.b bVar4;
        x.e.b bVar5;
        ArrayList arrayList = fVar.V0;
        int size = arrayList.size();
        char c10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            x.e eVar = (x.e) obj;
            x.e.b[] bVarArr = eVar.f56434b0;
            x.e.b bVar6 = bVarArr[c10];
            x.e.b bVar7 = bVarArr[1];
            if (eVar.X() == 8) {
                eVar.f56431a = true;
            } else {
                if (eVar.B < 1.0f && bVar6 == x.e.b.MATCH_CONSTRAINT) {
                    eVar.f56475w = 2;
                }
                if (eVar.E < 1.0f && bVar7 == x.e.b.MATCH_CONSTRAINT) {
                    eVar.f56477x = 2;
                }
                if (eVar.x() > 0.0f) {
                    x.e.b bVar8 = x.e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == x.e.b.WRAP_CONTENT || bVar7 == x.e.b.FIXED)) {
                        eVar.f56475w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == x.e.b.WRAP_CONTENT || bVar6 == x.e.b.FIXED)) {
                        eVar.f56477x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f56475w == 0) {
                            eVar.f56475w = 3;
                        }
                        if (eVar.f56477x == 0) {
                            eVar.f56477x = 3;
                        }
                    }
                }
                x.e.b bVar9 = x.e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f56475w == 1 && (eVar.Q.f56417f == null || eVar.S.f56417f == null)) {
                    bVar6 = x.e.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && eVar.f56477x == 1 && (eVar.R.f56417f == null || eVar.T.f56417f == null)) {
                    bVar7 = x.e.b.WRAP_CONTENT;
                }
                l lVar = eVar.f56439e;
                lVar.f57127d = bVar6;
                int i12 = eVar.f56475w;
                lVar.f57124a = i12;
                n nVar = eVar.f56441f;
                nVar.f57127d = bVar7;
                int i13 = eVar.f56477x;
                nVar.f57124a = i13;
                x.e.b bVar10 = x.e.b.MATCH_PARENT;
                char c11 = c10;
                if ((bVar6 == bVar10 || bVar6 == x.e.b.FIXED || bVar6 == x.e.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == x.e.b.FIXED || bVar7 == x.e.b.WRAP_CONTENT)) {
                    x.e.b bVar11 = bVar7;
                    x.e.b bVar12 = bVar6;
                    int iY = eVar.Y();
                    if (bVar12 == bVar10) {
                        iY = (fVar.Y() - eVar.Q.f56418g) - eVar.S.f56418g;
                        bVar12 = x.e.b.FIXED;
                    }
                    int i14 = iY;
                    int iZ = eVar.z();
                    if (bVar11 == bVar10) {
                        iZ = (fVar.z() - eVar.R.f56418g) - eVar.T.f56418g;
                        bVar11 = x.e.b.FIXED;
                    }
                    l(eVar, bVar12, i14, bVar11, iZ);
                    eVar.f56439e.f57128e.d(eVar.Y());
                    eVar.f56441f.f57128e.d(eVar.z());
                    eVar.f56431a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        f11 = 0.5f;
                        x.e.b bVar13 = x.e.b.WRAP_CONTENT;
                        f10 = 1.0f;
                        if (bVar7 != bVar13 && bVar7 != x.e.b.FIXED) {
                            bVar = bVar7;
                            i10 = 3;
                        } else if (i12 == 3) {
                            if (bVar7 == bVar13) {
                                l(eVar, bVar13, 0, bVar13, 0);
                            }
                            int iZ2 = eVar.z();
                            int i15 = (int) ((iZ2 * eVar.f56442f0) + 0.5f);
                            x.e.b bVar14 = x.e.b.FIXED;
                            l(eVar, bVar14, i15, bVar14, iZ2);
                            eVar.f56439e.f57128e.d(eVar.Y());
                            eVar.f56441f.f57128e.d(eVar.z());
                            eVar.f56431a = true;
                        } else if (i12 == 1) {
                            l(eVar, bVar13, 0, bVar7, 0);
                            eVar.f56439e.f57128e.f57093m = eVar.Y();
                        } else {
                            bVar = bVar7;
                            i10 = 3;
                            if (i12 == 2) {
                                x.e.b bVar15 = fVar.f56434b0[c11];
                                x.e.b bVar16 = x.e.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    l(eVar, bVar16, (int) ((eVar.B * fVar.Y()) + 0.5f), bVar, eVar.z());
                                    eVar.f56439e.f57128e.d(eVar.Y());
                                    eVar.f56441f.f57128e.d(eVar.z());
                                    eVar.f56431a = true;
                                }
                            } else {
                                x.d[] dVarArr = eVar.Y;
                                if (dVarArr[c11].f56417f == null || dVarArr[1].f56417f == null) {
                                    l(eVar, bVar13, 0, bVar, 0);
                                    eVar.f56439e.f57128e.d(eVar.Y());
                                    eVar.f56441f.f57128e.d(eVar.z());
                                    eVar.f56431a = true;
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i10 = 3;
                        bVar2 = bVar9;
                        f10 = 1.0f;
                        f11 = 0.5f;
                    }
                    if (bVar != bVar2 || (bVar6 != (bVar4 = x.e.b.WRAP_CONTENT) && bVar6 != x.e.b.FIXED)) {
                        bVar3 = bVar6;
                    } else if (i13 == i10) {
                        if (bVar6 == bVar4) {
                            l(eVar, bVar4, 0, bVar4, 0);
                        }
                        int iY2 = eVar.Y();
                        float f12 = eVar.f56442f0;
                        if (eVar.y() == -1) {
                            f12 = f10 / f12;
                        }
                        x.e.b bVar17 = x.e.b.FIXED;
                        l(eVar, bVar17, iY2, bVar17, (int) ((iY2 * f12) + f11));
                        eVar.f56439e.f57128e.d(eVar.Y());
                        eVar.f56441f.f57128e.d(eVar.z());
                        eVar.f56431a = true;
                    } else if (i13 == 1) {
                        l(eVar, bVar6, 0, bVar4, 0);
                        eVar.f56441f.f57128e.f57093m = eVar.z();
                    } else {
                        bVar3 = bVar6;
                        if (i13 == 2) {
                            x.e.b bVar18 = fVar.f56434b0[1];
                            bVar5 = bVar;
                            x.e.b bVar19 = x.e.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                l(eVar, bVar3, eVar.Y(), bVar19, (int) ((eVar.E * fVar.z()) + f11));
                                eVar.f56439e.f57128e.d(eVar.Y());
                                eVar.f56441f.f57128e.d(eVar.z());
                                eVar.f56431a = true;
                            } else {
                                bVar = bVar5;
                            }
                        } else {
                            bVar5 = bVar;
                            x.d[] dVarArr2 = eVar.Y;
                            if (dVarArr2[2].f56417f == null || dVarArr2[i10].f56417f == null) {
                                l(eVar, bVar4, 0, bVar5, 0);
                                eVar.f56439e.f57128e.d(eVar.Y());
                                eVar.f56441f.f57128e.d(eVar.z());
                                eVar.f56431a = true;
                            } else {
                                bVar = bVar5;
                            }
                        }
                    }
                    if (bVar3 == bVar2 && bVar == bVar2) {
                        if (i12 == 1 || i13 == 1) {
                            x.e.b bVar20 = x.e.b.WRAP_CONTENT;
                            l(eVar, bVar20, 0, bVar20, 0);
                            eVar.f56439e.f57128e.f57093m = eVar.Y();
                            eVar.f56441f.f57128e.f57093m = eVar.z();
                        } else if (i13 == 2 && i12 == 2) {
                            x.e.b[] bVarArr2 = fVar.f56434b0;
                            x.e.b bVar21 = bVarArr2[c11];
                            x.e.b bVar22 = x.e.b.FIXED;
                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                l(eVar, bVar22, (int) ((eVar.B * fVar.Y()) + f11), bVar22, (int) ((eVar.E * fVar.z()) + f11));
                                eVar.f56439e.f57128e.d(eVar.Y());
                                eVar.f56441f.f57128e.d(eVar.z());
                                eVar.f56431a = true;
                            }
                        }
                    }
                }
                c10 = c11;
            }
        }
        return c10;
    }

    private int e(x.f fVar, int i10) {
        int size = this.f57071i.size();
        long jMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            jMax = Math.max(jMax, ((m) this.f57071i.get(i11)).b(fVar, i10));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i10, ArrayList arrayList) {
        for (d dVar : pVar.f57131h.f57082k) {
            if (dVar instanceof f) {
                a((f) dVar, i10, 0, pVar.f57132i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f57131h, i10, 0, pVar.f57132i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f57132i.f57082k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, 1, pVar.f57131h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f57132i, i10, 1, pVar.f57131h, arrayList, null);
            }
        }
        int i11 = i10;
        if (i11 == 1) {
            for (d dVar3 : ((n) pVar).f57107k.f57082k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i11, 2, null, arrayList, null);
                }
                i11 = i10;
            }
        }
    }

    private void l(x.e eVar, x.e.b bVar, int i10, x.e.b bVar2, int i11) {
        b.a aVar = this.f57070h;
        aVar.f57051a = bVar;
        aVar.f57052b = bVar2;
        aVar.f57053c = i10;
        aVar.f57054d = i11;
        this.f57069g.b(eVar, aVar);
        eVar.p1(this.f57070h.f57055e);
        eVar.Q0(this.f57070h.f57056f);
        eVar.P0(this.f57070h.f57058h);
        eVar.F0(this.f57070h.f57057g);
    }

    public void c() {
        d(this.f57067e);
        this.f57071i.clear();
        m.f57099h = 0;
        i(this.f57063a.f56439e, 0, this.f57071i);
        i(this.f57063a.f56441f, 1, this.f57071i);
        this.f57064b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f57066d.f56439e.f();
        this.f57066d.f56441f.f();
        arrayList.add(this.f57066d.f56439e);
        arrayList.add(this.f57066d.f56441f);
        ArrayList arrayList2 = this.f57066d.V0;
        int size = arrayList2.size();
        HashSet hashSet = null;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            x.e eVar = (x.e) obj;
            if (eVar instanceof x.h) {
                arrayList.add(new j(eVar));
            } else {
                if (eVar.k0()) {
                    if (eVar.f56435c == null) {
                        eVar.f56435c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f56435c);
                } else {
                    arrayList.add(eVar.f56439e);
                }
                if (eVar.m0()) {
                    if (eVar.f56437d == null) {
                        eVar.f56437d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f56437d);
                } else {
                    arrayList.add(eVar.f56441f);
                }
                if (eVar instanceof x.j) {
                    arrayList.add(new k(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ((p) obj2).f();
        }
        int size3 = arrayList.size();
        while (i10 < size3) {
            Object obj3 = arrayList.get(i10);
            i10++;
            p pVar = (p) obj3;
            if (pVar.f57125b != this.f57066d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (this.f57064b || this.f57065c) {
            ArrayList arrayList = this.f57063a.V0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x.e eVar = (x.e) obj;
                eVar.p();
                eVar.f56431a = false;
                eVar.f56439e.r();
                eVar.f56441f.q();
            }
            this.f57063a.p();
            x.f fVar = this.f57063a;
            fVar.f56431a = false;
            fVar.f56439e.r();
            this.f57063a.f56441f.q();
            this.f57065c = false;
        }
        if (b(this.f57066d)) {
            return false;
        }
        this.f57063a.r1(0);
        this.f57063a.s1(0);
        x.e.b bVarW = this.f57063a.w(0);
        x.e.b bVarW2 = this.f57063a.w(1);
        if (this.f57064b) {
            c();
        }
        int iZ = this.f57063a.Z();
        int iA0 = this.f57063a.a0();
        this.f57063a.f56439e.f57131h.d(iZ);
        this.f57063a.f56441f.f57131h.d(iA0);
        m();
        x.e.b bVar = x.e.b.WRAP_CONTENT;
        if (bVarW == bVar || bVarW2 == bVar) {
            if (z10) {
                ArrayList arrayList2 = this.f57067e;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (!((p) obj2).m()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && bVarW == x.e.b.WRAP_CONTENT) {
                this.f57063a.U0(x.e.b.FIXED);
                x.f fVar2 = this.f57063a;
                fVar2.p1(e(fVar2, 0));
                x.f fVar3 = this.f57063a;
                fVar3.f56439e.f57128e.d(fVar3.Y());
            }
            if (z10 && bVarW2 == x.e.b.WRAP_CONTENT) {
                this.f57063a.l1(x.e.b.FIXED);
                x.f fVar4 = this.f57063a;
                fVar4.Q0(e(fVar4, 1));
                x.f fVar5 = this.f57063a;
                fVar5.f56441f.f57128e.d(fVar5.z());
            }
        }
        x.f fVar6 = this.f57063a;
        x.e.b bVar2 = fVar6.f56434b0[0];
        x.e.b bVar3 = x.e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == x.e.b.MATCH_PARENT) {
            int iY = fVar6.Y() + iZ;
            this.f57063a.f56439e.f57132i.d(iY);
            this.f57063a.f56439e.f57128e.d(iY - iZ);
            m();
            x.f fVar7 = this.f57063a;
            x.e.b bVar4 = fVar7.f56434b0[1];
            if (bVar4 == bVar3 || bVar4 == x.e.b.MATCH_PARENT) {
                int iZ2 = fVar7.z() + iA0;
                this.f57063a.f56441f.f57132i.d(iZ2);
                this.f57063a.f56441f.f57128e.d(iZ2 - iA0);
            }
            m();
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList3 = this.f57067e;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            p pVar = (p) obj3;
            if (pVar.f57125b != this.f57063a || pVar.f57130g) {
                pVar.e();
            }
        }
        ArrayList arrayList4 = this.f57067e;
        int size4 = arrayList4.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj4 = arrayList4.get(i13);
            i13++;
            p pVar2 = (p) obj4;
            if (z11 || pVar2.f57125b != this.f57063a) {
                if (!pVar2.f57131h.f57081j || ((!pVar2.f57132i.f57081j && !(pVar2 instanceof j)) || (!pVar2.f57128e.f57081j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    this.f57063a.U0(bVarW);
                    this.f57063a.l1(bVarW2);
                    return z12;
                }
            }
        }
        z12 = true;
        this.f57063a.U0(bVarW);
        this.f57063a.l1(bVarW2);
        return z12;
    }

    public boolean g(boolean z10) {
        if (this.f57064b) {
            ArrayList arrayList = this.f57063a.V0;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x.e eVar = (x.e) obj;
                eVar.p();
                eVar.f56431a = false;
                l lVar = eVar.f56439e;
                lVar.f57128e.f57081j = false;
                lVar.f57130g = false;
                lVar.r();
                n nVar = eVar.f56441f;
                nVar.f57128e.f57081j = false;
                nVar.f57130g = false;
                nVar.q();
            }
            this.f57063a.p();
            x.f fVar = this.f57063a;
            fVar.f56431a = false;
            l lVar2 = fVar.f56439e;
            lVar2.f57128e.f57081j = false;
            lVar2.f57130g = false;
            lVar2.r();
            n nVar2 = this.f57063a.f56441f;
            nVar2.f57128e.f57081j = false;
            nVar2.f57130g = false;
            nVar2.q();
            c();
        }
        if (b(this.f57066d)) {
            return false;
        }
        this.f57063a.r1(0);
        this.f57063a.s1(0);
        this.f57063a.f56439e.f57131h.d(0);
        this.f57063a.f56441f.f57131h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    public boolean h(boolean z10, int i10) {
        boolean z11;
        x.e.b bVar;
        boolean z12 = false;
        x.e.b bVarW = this.f57063a.w(0);
        x.e.b bVarW2 = this.f57063a.w(1);
        int iZ = this.f57063a.Z();
        int iA0 = this.f57063a.a0();
        if (z10 && (bVarW == (bVar = x.e.b.WRAP_CONTENT) || bVarW2 == bVar)) {
            ArrayList arrayList = this.f57067e;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                p pVar = (p) obj;
                if (pVar.f57129f == i10 && !pVar.m()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && bVarW == x.e.b.WRAP_CONTENT) {
                    this.f57063a.U0(x.e.b.FIXED);
                    x.f fVar = this.f57063a;
                    fVar.p1(e(fVar, 0));
                    x.f fVar2 = this.f57063a;
                    fVar2.f56439e.f57128e.d(fVar2.Y());
                }
            } else if (z10 && bVarW2 == x.e.b.WRAP_CONTENT) {
                this.f57063a.l1(x.e.b.FIXED);
                x.f fVar3 = this.f57063a;
                fVar3.Q0(e(fVar3, 1));
                x.f fVar4 = this.f57063a;
                fVar4.f56441f.f57128e.d(fVar4.z());
            }
        }
        if (i10 == 0) {
            x.f fVar5 = this.f57063a;
            x.e.b bVar2 = fVar5.f56434b0[0];
            if (bVar2 == x.e.b.FIXED || bVar2 == x.e.b.MATCH_PARENT) {
                int iY = fVar5.Y() + iZ;
                this.f57063a.f56439e.f57132i.d(iY);
                this.f57063a.f56439e.f57128e.d(iY - iZ);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            x.f fVar6 = this.f57063a;
            x.e.b bVar3 = fVar6.f56434b0[1];
            if (bVar3 == x.e.b.FIXED || bVar3 == x.e.b.MATCH_PARENT) {
                int iZ2 = fVar6.z() + iA0;
                this.f57063a.f56441f.f57132i.d(iZ2);
                this.f57063a.f56441f.f57128e.d(iZ2 - iA0);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        m();
        ArrayList arrayList2 = this.f57067e;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            p pVar2 = (p) obj2;
            if (pVar2.f57129f == i10 && (pVar2.f57125b != this.f57063a || pVar2.f57130g)) {
                pVar2.e();
            }
        }
        ArrayList arrayList3 = this.f57067e;
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList3.get(i13);
            i13++;
            p pVar3 = (p) obj3;
            if (pVar3.f57129f == i10 && (z11 || pVar3.f57125b != this.f57063a)) {
                if (!pVar3.f57131h.f57081j || !pVar3.f57132i.f57081j || (!(pVar3 instanceof c) && !pVar3.f57128e.f57081j)) {
                    this.f57063a.U0(bVarW);
                    this.f57063a.l1(bVarW2);
                    return z12;
                }
            }
        }
        z12 = true;
        this.f57063a.U0(bVarW);
        this.f57063a.l1(bVarW2);
        return z12;
    }

    public void j() {
        this.f57064b = true;
    }

    public void k() {
        this.f57065c = true;
    }

    public void m() {
        g gVar;
        ArrayList arrayList = this.f57063a.V0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x.e eVar = (x.e) obj;
            if (!eVar.f56431a) {
                x.e.b[] bVarArr = eVar.f56434b0;
                x.e.b bVar = bVarArr[0];
                x.e.b bVar2 = bVarArr[1];
                int i11 = eVar.f56475w;
                int i12 = eVar.f56477x;
                x.e.b bVar3 = x.e.b.WRAP_CONTENT;
                boolean z10 = bVar == bVar3 || (bVar == x.e.b.MATCH_CONSTRAINT && i11 == 1);
                boolean z11 = bVar2 == bVar3 || (bVar2 == x.e.b.MATCH_CONSTRAINT && i12 == 1);
                g gVar2 = eVar.f56439e.f57128e;
                boolean z12 = gVar2.f57081j;
                g gVar3 = eVar.f56441f.f57128e;
                boolean z13 = gVar3.f57081j;
                if (z12 && z13) {
                    x.e.b bVar4 = x.e.b.FIXED;
                    l(eVar, bVar4, gVar2.f57078g, bVar4, gVar3.f57078g);
                    eVar.f56431a = true;
                } else if (z12 && z11) {
                    l(eVar, x.e.b.FIXED, gVar2.f57078g, bVar3, gVar3.f57078g);
                    if (bVar2 == x.e.b.MATCH_CONSTRAINT) {
                        eVar.f56441f.f57128e.f57093m = eVar.z();
                    } else {
                        eVar.f56441f.f57128e.d(eVar.z());
                        eVar.f56431a = true;
                    }
                } else if (z13 && z10) {
                    l(eVar, bVar3, gVar2.f57078g, x.e.b.FIXED, gVar3.f57078g);
                    if (bVar == x.e.b.MATCH_CONSTRAINT) {
                        eVar.f56439e.f57128e.f57093m = eVar.Y();
                    } else {
                        eVar.f56439e.f57128e.d(eVar.Y());
                        eVar.f56431a = true;
                    }
                }
                if (eVar.f56431a && (gVar = eVar.f56441f.f57108l) != null) {
                    gVar.d(eVar.r());
                }
            }
        }
    }

    public void n(b.InterfaceC0875b interfaceC0875b) {
        this.f57069g = interfaceC0875b;
    }
}
