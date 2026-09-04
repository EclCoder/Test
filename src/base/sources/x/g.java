package x;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g extends m {
    private e[] H1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f56515k1 = -1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f56516l1 = -1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f56517m1 = -1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f56518n1 = -1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f56519o1 = -1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f56520p1 = -1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private float f56521q1 = 0.5f;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private float f56522r1 = 0.5f;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private float f56523s1 = 0.5f;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private float f56524t1 = 0.5f;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private float f56525u1 = 0.5f;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private float f56526v1 = 0.5f;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private int f56527w1 = 0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private int f56528x1 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f56529y1 = 2;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private int f56530z1 = 2;
    private int A1 = 0;
    private int B1 = -1;
    private int C1 = 0;
    private ArrayList D1 = new ArrayList();
    private e[] E1 = null;
    private e[] F1 = null;
    private int[] G1 = null;
    private int I1 = 0;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f56531a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f56534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f56535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f56536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f56537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f56538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f56539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f56540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f56541k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f56547q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f56532b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f56533c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f56542l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f56543m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f56544n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f56545o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f56546p = 0;

        a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f56538h = 0;
            this.f56539i = 0;
            this.f56540j = 0;
            this.f56541k = 0;
            this.f56547q = 0;
            this.f56531a = i10;
            this.f56534d = dVar;
            this.f56535e = dVar2;
            this.f56536f = dVar3;
            this.f56537g = dVar4;
            this.f56538h = g.this.E1();
            this.f56539i = g.this.G1();
            this.f56540j = g.this.F1();
            this.f56541k = g.this.D1();
            this.f56547q = i11;
        }

        private void h() {
            this.f56542l = 0;
            this.f56543m = 0;
            this.f56532b = null;
            this.f56533c = 0;
            int i10 = this.f56545o;
            for (int i11 = 0; i11 < i10 && this.f56544n + i11 < g.this.I1; i11++) {
                e eVar = g.this.H1[this.f56544n + i11];
                if (this.f56531a == 0) {
                    int iY = eVar.Y();
                    int i12 = g.this.f56527w1;
                    if (eVar.X() == 8) {
                        i12 = 0;
                    }
                    this.f56542l += iY + i12;
                    int iP2 = g.this.p2(eVar, this.f56547q);
                    if (this.f56532b == null || this.f56533c < iP2) {
                        this.f56532b = eVar;
                        this.f56533c = iP2;
                        this.f56543m = iP2;
                    }
                } else {
                    int iQ2 = g.this.q2(eVar, this.f56547q);
                    int iP3 = g.this.p2(eVar, this.f56547q);
                    int i13 = g.this.f56528x1;
                    if (eVar.X() == 8) {
                        i13 = 0;
                    }
                    this.f56543m += iP3 + i13;
                    if (this.f56532b == null || this.f56533c < iQ2) {
                        this.f56532b = eVar;
                        this.f56533c = iQ2;
                        this.f56542l = iQ2;
                    }
                }
            }
        }

        public void b(e eVar) {
            if (this.f56531a == 0) {
                int iQ2 = g.this.q2(eVar, this.f56547q);
                if (eVar.C() == e.b.MATCH_CONSTRAINT) {
                    this.f56546p++;
                    iQ2 = 0;
                }
                this.f56542l += iQ2 + (eVar.X() != 8 ? g.this.f56527w1 : 0);
                int iP2 = g.this.p2(eVar, this.f56547q);
                if (this.f56532b == null || this.f56533c < iP2) {
                    this.f56532b = eVar;
                    this.f56533c = iP2;
                    this.f56543m = iP2;
                }
            } else {
                int iQ3 = g.this.q2(eVar, this.f56547q);
                int iP3 = g.this.p2(eVar, this.f56547q);
                if (eVar.V() == e.b.MATCH_CONSTRAINT) {
                    this.f56546p++;
                    iP3 = 0;
                }
                this.f56543m += iP3 + (eVar.X() != 8 ? g.this.f56528x1 : 0);
                if (this.f56532b == null || this.f56533c < iQ3) {
                    this.f56532b = eVar;
                    this.f56533c = iQ3;
                    this.f56542l = iQ3;
                }
            }
            this.f56545o++;
        }

        public void c() {
            this.f56533c = 0;
            this.f56532b = null;
            this.f56542l = 0;
            this.f56543m = 0;
            this.f56544n = 0;
            this.f56545o = 0;
            this.f56546p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f56545o;
            for (int i13 = 0; i13 < i12 && this.f56544n + i13 < g.this.I1; i13++) {
                e eVar2 = g.this.H1[this.f56544n + i13];
                if (eVar2 != null) {
                    eVar2.x0();
                }
            }
            if (i12 == 0 || this.f56532b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f56544n + i17 >= g.this.I1) {
                    break;
                }
                e eVar3 = g.this.H1[this.f56544n + i17];
                if (eVar3 != null && eVar3.X() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar4 = null;
            if (this.f56531a != 0) {
                e eVar5 = this.f56532b;
                eVar5.S0(g.this.f56515k1);
                int i18 = this.f56538h;
                if (i10 > 0) {
                    i18 += g.this.f56527w1;
                }
                if (z10) {
                    eVar5.S.a(this.f56536f, i18);
                    if (z11) {
                        eVar5.Q.a(this.f56534d, this.f56540j);
                    }
                    if (i10 > 0) {
                        this.f56536f.f56415d.Q.a(eVar5.S, 0);
                    }
                } else {
                    eVar5.Q.a(this.f56534d, i18);
                    if (z11) {
                        eVar5.S.a(this.f56536f, this.f56540j);
                    }
                    if (i10 > 0) {
                        this.f56534d.f56415d.S.a(eVar5.Q, 0);
                    }
                }
                for (int i19 = 0; i19 < i12 && this.f56544n + i19 < g.this.I1; i19++) {
                    e eVar6 = g.this.H1[this.f56544n + i19];
                    if (eVar6 != null) {
                        if (i19 == 0) {
                            eVar6.l(eVar6.R, this.f56535e, this.f56539i);
                            int i20 = g.this.f56516l1;
                            float f12 = g.this.f56522r1;
                            if (this.f56544n == 0 && g.this.f56518n1 != -1) {
                                i20 = g.this.f56518n1;
                                f12 = g.this.f56524t1;
                            } else if (z11 && g.this.f56520p1 != -1) {
                                i20 = g.this.f56520p1;
                                f12 = g.this.f56526v1;
                            }
                            eVar6.j1(i20);
                            eVar6.i1(f12);
                        }
                        if (i19 == i12 - 1) {
                            eVar6.l(eVar6.T, this.f56537g, this.f56541k);
                        }
                        if (eVar4 != null) {
                            eVar6.R.a(eVar4.T, g.this.f56528x1);
                            if (i19 == i14) {
                                eVar6.R.u(this.f56539i);
                            }
                            eVar4.T.a(eVar6.R, 0);
                            if (i19 == i15 + 1) {
                                eVar4.T.u(this.f56541k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z10) {
                                int i21 = g.this.f56529y1;
                                if (i21 == 0) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i21 == 1) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i21 == 2) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                    eVar6.S.a(eVar5.S, 0);
                                }
                            } else {
                                int i22 = g.this.f56529y1;
                                if (i22 == 0) {
                                    eVar6.Q.a(eVar5.Q, 0);
                                } else if (i22 == 1) {
                                    eVar6.S.a(eVar5.S, 0);
                                } else if (i22 == 2) {
                                    if (z12) {
                                        eVar6.Q.a(this.f56534d, this.f56538h);
                                        eVar6.S.a(this.f56536f, this.f56540j);
                                    } else {
                                        eVar6.Q.a(eVar5.Q, 0);
                                        eVar6.S.a(eVar5.S, 0);
                                    }
                                }
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f56532b;
            eVar7.j1(g.this.f56516l1);
            int i23 = this.f56539i;
            if (i10 > 0) {
                i23 += g.this.f56528x1;
            }
            eVar7.R.a(this.f56535e, i23);
            if (z11) {
                eVar7.T.a(this.f56537g, this.f56541k);
            }
            if (i10 > 0) {
                this.f56535e.f56415d.T.a(eVar7.R, 0);
            }
            char c11 = 3;
            if (g.this.f56530z1 != 3 || eVar7.b0()) {
                eVar = eVar7;
                break;
            }
            int i24 = 0;
            while (true) {
                if (i24 < i12) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f56544n + i25 < g.this.I1) {
                        eVar = g.this.H1[this.f56544n + i25];
                        if (eVar.b0()) {
                            break;
                        } else {
                            i24++;
                        }
                    }
                }
                eVar = eVar7;
                break;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f56544n + i27 >= g.this.I1) {
                    return;
                }
                e eVar8 = g.this.H1[this.f56544n + i27];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c10 = c11;
                } else {
                    if (i26 == 0) {
                        i11 = 1;
                        eVar8.l(eVar8.Q, this.f56534d, this.f56538h);
                    } else {
                        i11 = 1;
                    }
                    if (i27 == 0) {
                        int i28 = g.this.f56515k1;
                        float f13 = g.this.f56521q1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f56544n == 0 && g.this.f56517m1 != -1) {
                            i28 = g.this.f56517m1;
                            if (z10) {
                                f11 = g.this.f56523s1;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = g.this.f56523s1;
                            }
                            f13 = f10;
                        } else if (z11 && g.this.f56519o1 != -1) {
                            i28 = g.this.f56519o1;
                            if (z10) {
                                f11 = g.this.f56525u1;
                                f10 = 1.0f - f11;
                            } else {
                                f10 = g.this.f56525u1;
                            }
                            f13 = f10;
                        }
                        eVar8.S0(i28);
                        eVar8.R0(f13);
                    }
                    if (i26 == i12 - 1) {
                        eVar8.l(eVar8.S, this.f56536f, this.f56540j);
                    }
                    if (eVar4 != null) {
                        eVar8.Q.a(eVar4.S, g.this.f56527w1);
                        if (i26 == i14) {
                            eVar8.Q.u(this.f56538h);
                        }
                        eVar4.S.a(eVar8.Q, 0);
                        if (i26 == i15 + 1) {
                            eVar4.S.u(this.f56540j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c10 = 3;
                        if (g.this.f56530z1 == 3 && eVar.b0() && eVar8 != eVar && eVar8.b0()) {
                            eVar8.U.a(eVar.U, 0);
                        } else {
                            int i29 = g.this.f56530z1;
                            if (i29 == 0) {
                                eVar8.R.a(eVar7.R, 0);
                            } else if (i29 == i11) {
                                eVar8.T.a(eVar7.T, 0);
                            } else if (z12) {
                                eVar8.R.a(this.f56535e, this.f56539i);
                                eVar8.T.a(this.f56537g, this.f56541k);
                            } else {
                                eVar8.R.a(eVar7.R, 0);
                                eVar8.T.a(eVar7.T, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i26++;
                c11 = c10;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f56531a == 1 ? this.f56543m - g.this.f56528x1 : this.f56543m;
        }

        public int f() {
            return this.f56531a == 0 ? this.f56542l - g.this.f56527w1 : this.f56542l;
        }

        public void g(int i10) {
            int i11 = this.f56546p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f56545o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f56544n + i14 < g.this.I1; i14++) {
                e eVar = g.this.H1[this.f56544n + i14];
                if (this.f56531a == 0) {
                    if (eVar != null && eVar.C() == e.b.MATCH_CONSTRAINT && eVar.f56475w == 0) {
                        g.this.I1(eVar, e.b.FIXED, i13, eVar.V(), eVar.z());
                    }
                } else if (eVar != null && eVar.V() == e.b.MATCH_CONSTRAINT && eVar.f56477x == 0) {
                    int i15 = i13;
                    g.this.I1(eVar, eVar.C(), eVar.Y(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f56544n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f56531a = i10;
            this.f56534d = dVar;
            this.f56535e = dVar2;
            this.f56536f = dVar3;
            this.f56537g = dVar4;
            this.f56538h = i11;
            this.f56539i = i12;
            this.f56540j = i13;
            this.f56541k = i14;
            this.f56547q = i15;
        }
    }

    private void o2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.G1 == null || this.F1 == null || this.E1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.I1; i11++) {
            this.H1[i11].x0();
        }
        int[] iArr = this.G1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f56521q1;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f56521q1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.F1[i10];
            if (eVar3 != null && eVar3.X() != 8) {
                if (i14 == 0) {
                    eVar3.l(eVar3.Q, this.Q, E1());
                    eVar3.S0(this.f56515k1);
                    eVar3.R0(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.l(eVar3.S, this.S, F1());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.l(eVar3.Q, eVar2.S, this.f56527w1);
                    eVar2.l(eVar2.S, eVar3.Q, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.E1[i15];
            if (eVar4 != null && eVar4.X() != 8) {
                if (i15 == 0) {
                    eVar4.l(eVar4.R, this.R, G1());
                    eVar4.j1(this.f56516l1);
                    eVar4.i1(this.f56522r1);
                }
                if (i15 == i13 - 1) {
                    eVar4.l(eVar4.T, this.T, D1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.l(eVar4.R, eVar2.T, this.f56528x1);
                    eVar2.l(eVar2.T, eVar4.R, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.C1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.H1;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.X() != 8) {
                    e eVar5 = this.F1[i16];
                    e eVar6 = this.E1[i17];
                    if (eVar != eVar5) {
                        eVar.l(eVar.Q, eVar5.Q, 0);
                        eVar.l(eVar.S, eVar5.S, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.l(eVar.R, eVar6.R, 0);
                        eVar.l(eVar.T, eVar6.T, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int p2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.V() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f56477x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.E * i10);
                if (i12 != eVar.z()) {
                    eVar.d1(true);
                    I1(eVar, eVar.C(), eVar.Y(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.z();
            }
            if (i11 == 3) {
                return (int) ((eVar2.Y() * eVar2.f56442f0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int q2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.C() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f56475w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.B * i10);
                if (i12 != eVar.Y()) {
                    eVar.d1(true);
                    I1(eVar, e.b.FIXED, i12, eVar.V(), eVar.z());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.Y();
            }
            if (i11 == 3) {
                return (int) ((eVar2.z() * eVar2.f56442f0) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.Y();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void r2(x.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.g.r2(x.e[], int, int, int, int[]):void");
    }

    private void s2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.D1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
        gVar2.D1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iQ2 = gVar2.q2(eVar, i16);
                if (eVar.C() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f56527w1 + i17) + iQ2 > i16) && aVar.f56532b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.B1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    aVar.i(i18);
                    gVar2.D1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += gVar2.f56527w1 + iQ2;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iQ2;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iP2 = gVar2.p2(eVar2, i16);
                if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f56528x1 + i20) + iP2 > i16) && aVar.f56532b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.B1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.D1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f56528x1 + iP2;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    gVar2 = gVar;
                }
                i20 = iP2;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.D1.size();
        d dVar2 = gVar3.Q;
        d dVar3 = gVar3.R;
        d dVar4 = gVar3.S;
        d dVar5 = gVar3.T;
        int iE1 = gVar3.E1();
        int iG1 = gVar3.G1();
        int iF1 = gVar3.F1();
        int iD1 = gVar3.D1();
        e.b bVarC = gVar3.C();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarC == bVar || gVar3.V() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) gVar3.D1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iD2 = iD1;
        int i24 = 0;
        int iF2 = iF1;
        int i25 = iG1;
        int i26 = iE1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = (a) gVar3.D1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = ((a) gVar3.D1.get(i28 + 1)).f56532b.R;
                    iD2 = 0;
                } else {
                    dVar7 = gVar3.T;
                    iD2 = gVar3.D1();
                }
                d dVar10 = aVar3.f56532b.T;
                int i29 = i27;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iF2, iD2, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += gVar3.f56528x1;
                }
                i27 = iE;
                i24 = iMax;
                dVar9 = dVar10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    dVar = ((a) gVar3.D1.get(i28 + 1)).f56532b.Q;
                    iF2 = 0;
                } else {
                    dVar = gVar3.S;
                    iF2 = gVar3.F1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f56532b.S;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iF2, iD2, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += gVar3.f56527w1;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void t2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.D1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
        gVar2.D1.add(aVar);
        boolean z10 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int iQ2 = gVar2.q2(eVar, i16);
                if (eVar.C() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z11 = (i18 == i16 || (gVar2.f56527w1 + i18) + iQ2 > i16) && aVar.f56532b != null;
                if (!z11 && i19 > 0 && (i15 = gVar2.B1) > 0 && i17 > i15) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    aVar.i(i19);
                    gVar2.D1.add(aVar);
                    i17 = 1;
                } else {
                    if (i19 > 0) {
                        i18 += gVar2.f56527w1 + iQ2;
                    }
                    aVar.b(eVar);
                    i19++;
                    i13 = i20;
                }
                i18 = iQ2;
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int iP2 = gVar2.p2(eVar2, i16);
                if (eVar2.V() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z12 = (i22 == i16 || (gVar2.f56528x1 + i22) + iP2 > i16) && aVar.f56532b != null;
                if (!z12 && i23 > 0 && (i14 = gVar2.B1) > 0 && i21 > i14) {
                    z12 = true;
                }
                if (z12) {
                    aVar = gVar2.new a(i11, gVar2.Q, gVar2.R, gVar2.S, gVar2.T, i16);
                    gVar = gVar2;
                    aVar.i(i23);
                    gVar.D1.add(aVar);
                    i21 = 1;
                } else {
                    gVar = gVar2;
                    if (i23 > 0) {
                        i22 += gVar.f56528x1 + iP2;
                    }
                    aVar.b(eVar2);
                    i23++;
                    i16 = i12;
                    i13 = i24;
                    gVar2 = gVar;
                }
                i22 = iP2;
                aVar.b(eVar2);
                i23++;
                i16 = i12;
                i13 = i24;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.D1.size();
        d dVar2 = gVar3.Q;
        d dVar3 = gVar3.R;
        d dVar4 = gVar3.S;
        d dVar5 = gVar3.T;
        int iE1 = gVar3.E1();
        int iG1 = gVar3.G1();
        int iF1 = gVar3.F1();
        int iD1 = gVar3.D1();
        e.b bVarC = gVar3.C();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z13 = bVarC == bVar || gVar3.V() == bVar;
        if (i13 > 0 && z13) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = (a) gVar3.D1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int iD2 = iD1;
        int i26 = 0;
        int i27 = 0;
        int iF2 = iF1;
        int i28 = iG1;
        int i29 = iE1;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i30 = 0;
        while (i27 < size) {
            a aVar3 = (a) gVar3.D1.get(i27);
            if (i11 == 0) {
                if (i27 < size - 1) {
                    dVar7 = ((a) gVar3.D1.get(i27 + 1)).f56532b.R;
                    iD2 = 0;
                } else {
                    dVar7 = gVar3.T;
                    iD2 = gVar3.D1();
                }
                d dVar10 = aVar3.f56532b.T;
                int i31 = i26;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i29, i28, iF2, iD2, i12);
                int iMax = Math.max(i30, aVar3.f());
                int iE = aVar3.e() + i31;
                if (i27 > 0) {
                    iE += gVar3.f56528x1;
                }
                i26 = iE;
                i30 = iMax;
                dVar6 = dVar10;
                i28 = 0;
            } else {
                int i32 = i26;
                int i33 = i30;
                if (i27 < size - 1) {
                    dVar = ((a) gVar3.D1.get(i27 + 1)).f56532b.Q;
                    iF2 = 0;
                } else {
                    dVar = gVar3.S;
                    iF2 = gVar3.F1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f56532b.S;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i29, i28, iF2, iD2, i12);
                int iF = aVar3.f() + i33;
                int iMax2 = Math.max(i32, aVar3.e());
                if (i27 > 0) {
                    iF += gVar3.f56527w1;
                }
                int i34 = iF;
                i26 = iMax2;
                i30 = i34;
                i29 = 0;
                dVar9 = dVar11;
            }
            i27++;
            z10 = z10;
        }
        iArr[0] = i30;
        iArr[z10 ? 1 : 0] = i26;
    }

    private void u2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.D1.size() == 0) {
            aVar = new a(i11, this.Q, this.R, this.S, this.T, i12);
            this.D1.add(aVar);
        } else {
            a aVar2 = (a) this.D1.get(0);
            aVar2.c();
            aVar2.j(i11, this.Q, this.R, this.S, this.T, E1(), G1(), F1(), D1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(float f10) {
        this.f56521q1 = f10;
    }

    public void B2(int i10) {
        this.f56527w1 = i10;
    }

    public void C2(int i10) {
        this.f56515k1 = i10;
    }

    public void D2(float f10) {
        this.f56525u1 = f10;
    }

    public void E2(int i10) {
        this.f56519o1 = i10;
    }

    public void F2(float f10) {
        this.f56526v1 = f10;
    }

    public void G2(int i10) {
        this.f56520p1 = i10;
    }

    @Override // x.m
    public void H1(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.W0 > 0 && !J1()) {
            M1(0, 0);
            L1(false);
            return;
        }
        int iE1 = E1();
        int iF1 = F1();
        int iG1 = G1();
        int iD1 = D1();
        int[] iArr = new int[2];
        int i15 = (i11 - iE1) - iF1;
        int i16 = this.C1;
        if (i16 == 1) {
            i15 = (i13 - iG1) - iD1;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f56515k1 == -1) {
                this.f56515k1 = 0;
            }
            if (this.f56516l1 == -1) {
                this.f56516l1 = 0;
            }
        } else {
            if (this.f56515k1 == -1) {
                this.f56515k1 = 0;
            }
            if (this.f56516l1 == -1) {
                this.f56516l1 = 0;
            }
        }
        e[] eVarArr2 = this.V0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.W0;
            if (i18 >= i14) {
                break;
            }
            if (this.V0[i18].X() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.W0) {
                e eVar = this.V0[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.X() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.H1 = eVarArr;
        this.I1 = i21;
        int i22 = this.A1;
        if (i22 == 0) {
            u2(eVarArr, i21, this.C1, i17, iArr);
        } else if (i22 == 1) {
            s2(eVarArr, i21, this.C1, i17, iArr);
        } else if (i22 == 2) {
            r2(eVarArr, i21, this.C1, i17, iArr);
        } else if (i22 == 3) {
            t2(eVarArr, i21, this.C1, i17, iArr);
        }
        int iMin = iArr[0] + iE1 + iF1;
        int iMin2 = iArr[1] + iG1 + iD1;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        M1(iMin, iMin2);
        p1(iMin);
        Q0(iMin2);
        L1(this.W0 > 0);
    }

    public void H2(int i10) {
        this.B1 = i10;
    }

    public void I2(int i10) {
        this.C1 = i10;
    }

    public void J2(int i10) {
        this.f56530z1 = i10;
    }

    public void K2(float f10) {
        this.f56522r1 = f10;
    }

    public void L2(int i10) {
        this.f56528x1 = i10;
    }

    public void M2(int i10) {
        this.f56516l1 = i10;
    }

    public void N2(int i10) {
        this.A1 = i10;
    }

    @Override // x.e
    public void g(u.d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = M() != null && ((f) M()).V1();
        int i10 = this.A1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.D1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.D1.get(i11)).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                o2(z11);
            } else if (i10 == 3) {
                int size2 = this.D1.size();
                int i12 = 0;
                while (i12 < size2) {
                    ((a) this.D1.get(i12)).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.D1.size() > 0) {
            ((a) this.D1.get(0)).d(z11, 0, true);
        }
        L1(false);
    }

    @Override // x.j, x.e
    public void n(e eVar, HashMap map) {
        super.n(eVar, map);
        g gVar = (g) eVar;
        this.f56515k1 = gVar.f56515k1;
        this.f56516l1 = gVar.f56516l1;
        this.f56517m1 = gVar.f56517m1;
        this.f56518n1 = gVar.f56518n1;
        this.f56519o1 = gVar.f56519o1;
        this.f56520p1 = gVar.f56520p1;
        this.f56521q1 = gVar.f56521q1;
        this.f56522r1 = gVar.f56522r1;
        this.f56523s1 = gVar.f56523s1;
        this.f56524t1 = gVar.f56524t1;
        this.f56525u1 = gVar.f56525u1;
        this.f56526v1 = gVar.f56526v1;
        this.f56527w1 = gVar.f56527w1;
        this.f56528x1 = gVar.f56528x1;
        this.f56529y1 = gVar.f56529y1;
        this.f56530z1 = gVar.f56530z1;
        this.A1 = gVar.A1;
        this.B1 = gVar.B1;
        this.C1 = gVar.C1;
    }

    public void v2(float f10) {
        this.f56523s1 = f10;
    }

    public void w2(int i10) {
        this.f56517m1 = i10;
    }

    public void x2(float f10) {
        this.f56524t1 = f10;
    }

    public void y2(int i10) {
        this.f56518n1 = i10;
    }

    public void z2(int i10) {
        this.f56529y1 = i10;
    }
}
