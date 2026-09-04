package y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f57097k = new int[2];

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57098a;

        static {
            int[] iArr = new int[p.b.values().length];
            f57098a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57098a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57098a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(x.e eVar) {
        super(eVar);
        this.f57131h.f57076e = f.a.LEFT;
        this.f57132i.f57076e = f.a.RIGHT;
        this.f57129f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // y.p, y.d
    public void a(d dVar) {
        int iG;
        int i10;
        int iG2;
        float f10;
        float fX;
        float fX2;
        int i11;
        int i12 = a.f57098a[this.f57133j.ordinal()];
        if (i12 == 1) {
            p(dVar);
        } else if (i12 == 2) {
            o(dVar);
        } else if (i12 == 3) {
            x.e eVar = this.f57125b;
            n(dVar, eVar.Q, eVar.S, 0);
            return;
        }
        if (!this.f57128e.f57081j && this.f57127d == x.e.b.MATCH_CONSTRAINT) {
            x.e eVar2 = this.f57125b;
            int i13 = eVar2.f56475w;
            if (i13 == 2) {
                x.e eVarM = eVar2.M();
                if (eVarM != null) {
                    g gVar = eVarM.f56439e.f57128e;
                    if (gVar.f57081j) {
                        this.f57128e.d((int) ((gVar.f57078g * this.f57125b.B) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = eVar2.f56477x;
                if (i14 == 0 || i14 == 3) {
                    n nVar = eVar2.f56441f;
                    f fVar = nVar.f57131h;
                    f fVar2 = nVar.f57132i;
                    boolean z10 = eVar2.Q.f56417f != null;
                    boolean z11 = eVar2.R.f56417f != null;
                    boolean z12 = eVar2.S.f56417f != null;
                    boolean z13 = eVar2.T.f56417f != null;
                    int iY = eVar2.y();
                    if (z10 && z11 && z12 && z13) {
                        float fX3 = this.f57125b.x();
                        if (fVar.f57081j && fVar2.f57081j) {
                            f fVar3 = this.f57131h;
                            if (fVar3.f57074c && this.f57132i.f57074c) {
                                q(f57097k, this.f57131h.f57077f + ((f) fVar3.f57083l.get(0)).f57078g, ((f) this.f57132i.f57083l.get(0)).f57078g - this.f57132i.f57077f, fVar.f57077f + fVar.f57078g, fVar2.f57078g - fVar2.f57077f, fX3, iY);
                                this.f57128e.d(f57097k[0]);
                                this.f57125b.f56441f.f57128e.d(f57097k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f57131h;
                        if (fVar4.f57081j) {
                            f fVar5 = this.f57132i;
                            if (fVar5.f57081j) {
                                if (!fVar.f57074c || !fVar2.f57074c) {
                                    return;
                                }
                                q(f57097k, fVar4.f57078g + fVar4.f57077f, fVar5.f57078g - fVar5.f57077f, fVar.f57077f + ((f) fVar.f57083l.get(0)).f57078g, ((f) fVar2.f57083l.get(0)).f57078g - fVar2.f57077f, fX3, iY);
                                this.f57128e.d(f57097k[0]);
                                this.f57125b.f56441f.f57128e.d(f57097k[1]);
                            }
                        }
                        f fVar6 = this.f57131h;
                        if (!fVar6.f57074c || !this.f57132i.f57074c || !fVar.f57074c || !fVar2.f57074c) {
                            return;
                        }
                        q(f57097k, this.f57131h.f57077f + ((f) fVar6.f57083l.get(0)).f57078g, ((f) this.f57132i.f57083l.get(0)).f57078g - this.f57132i.f57077f, fVar.f57077f + ((f) fVar.f57083l.get(0)).f57078g, ((f) fVar2.f57083l.get(0)).f57078g - fVar2.f57077f, fX3, iY);
                        this.f57128e.d(f57097k[0]);
                        this.f57125b.f56441f.f57128e.d(f57097k[1]);
                    } else if (z10 && z12) {
                        if (!this.f57131h.f57074c || !this.f57132i.f57074c) {
                            return;
                        }
                        float fX4 = this.f57125b.x();
                        int i15 = ((f) this.f57131h.f57083l.get(0)).f57078g + this.f57131h.f57077f;
                        int i16 = ((f) this.f57132i.f57083l.get(0)).f57078g - this.f57132i.f57077f;
                        if (iY == -1 || iY == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * fX4) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / fX4) + 0.5f);
                            }
                            this.f57128e.d(iG3);
                            this.f57125b.f56441f.f57128e.d(iG4);
                        } else if (iY == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / fX4) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * fX4) + 0.5f);
                            }
                            this.f57128e.d(iG5);
                            this.f57125b.f56441f.f57128e.d(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!fVar.f57074c || !fVar2.f57074c) {
                            return;
                        }
                        float fX5 = this.f57125b.x();
                        int i19 = ((f) fVar.f57083l.get(0)).f57078g + fVar.f57077f;
                        int i20 = ((f) fVar2.f57083l.get(0)).f57078g - fVar2.f57077f;
                        if (iY == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fX5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fX5) + 0.5f);
                            }
                            this.f57128e.d(iG2);
                            this.f57125b.f56441f.f57128e.d(iG);
                        } else if (iY == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * fX5) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / fX5) + 0.5f);
                            }
                            this.f57128e.d(iG8);
                            this.f57125b.f56441f.f57128e.d(iG7);
                        } else if (iY == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fX5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fX5) + 0.5f);
                            }
                            this.f57128e.d(iG2);
                            this.f57125b.f56441f.f57128e.d(iG);
                        }
                    }
                } else {
                    int iY2 = eVar2.y();
                    if (iY2 != -1) {
                        if (iY2 == 0) {
                            x.e eVar3 = this.f57125b;
                            fX2 = eVar3.f56441f.f57128e.f57078g / eVar3.x();
                            i11 = (int) (fX2 + 0.5f);
                        } else if (iY2 != 1) {
                            i11 = 0;
                        } else {
                            x.e eVar4 = this.f57125b;
                            f10 = eVar4.f56441f.f57128e.f57078g;
                            fX = eVar4.x();
                        }
                        this.f57128e.d(i11);
                    } else {
                        x.e eVar5 = this.f57125b;
                        f10 = eVar5.f56441f.f57128e.f57078g;
                        fX = eVar5.x();
                    }
                    fX2 = f10 * fX;
                    i11 = (int) (fX2 + 0.5f);
                    this.f57128e.d(i11);
                }
            }
        }
        f fVar7 = this.f57131h;
        if (fVar7.f57074c) {
            f fVar8 = this.f57132i;
            if (fVar8.f57074c) {
                if (fVar7.f57081j && fVar8.f57081j && this.f57128e.f57081j) {
                    return;
                }
                if (!this.f57128e.f57081j && this.f57127d == x.e.b.MATCH_CONSTRAINT) {
                    x.e eVar6 = this.f57125b;
                    if (eVar6.f56475w == 0 && !eVar6.k0()) {
                        f fVar9 = (f) this.f57131h.f57083l.get(0);
                        f fVar10 = (f) this.f57132i.f57083l.get(0);
                        int i22 = fVar9.f57078g;
                        f fVar11 = this.f57131h;
                        int i23 = i22 + fVar11.f57077f;
                        int i24 = fVar10.f57078g + this.f57132i.f57077f;
                        fVar11.d(i23);
                        this.f57132i.d(i24);
                        this.f57128e.d(i24 - i23);
                        return;
                    }
                }
                if (!this.f57128e.f57081j && this.f57127d == x.e.b.MATCH_CONSTRAINT && this.f57124a == 1 && this.f57131h.f57083l.size() > 0 && this.f57132i.f57083l.size() > 0) {
                    int iMin = Math.min((((f) this.f57132i.f57083l.get(0)).f57078g + this.f57132i.f57077f) - (((f) this.f57131h.f57083l.get(0)).f57078g + this.f57131h.f57077f), this.f57128e.f57093m);
                    x.e eVar7 = this.f57125b;
                    int i25 = eVar7.A;
                    int iMax = Math.max(eVar7.f56481z, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f57128e.d(iMax);
                }
                if (this.f57128e.f57081j) {
                    f fVar12 = (f) this.f57131h.f57083l.get(0);
                    f fVar13 = (f) this.f57132i.f57083l.get(0);
                    int i26 = fVar12.f57078g + this.f57131h.f57077f;
                    int i27 = fVar13.f57078g + this.f57132i.f57077f;
                    float fA = this.f57125b.A();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f57078g;
                        i27 = fVar13.f57078g;
                        fA = 0.5f;
                    }
                    this.f57131h.d((int) (i26 + 0.5f + (((i27 - i26) - this.f57128e.f57078g) * fA)));
                    this.f57132i.d(this.f57131h.f57078g + this.f57128e.f57078g);
                }
            }
        }
    }

    @Override // y.p
    void d() {
        x.e eVarM;
        x.e eVarM2;
        x.e eVar = this.f57125b;
        if (eVar.f56431a) {
            this.f57128e.d(eVar.Y());
        }
        if (this.f57128e.f57081j) {
            x.e.b bVar = this.f57127d;
            x.e.b bVar2 = x.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarM = this.f57125b.M()) != null && (eVarM.C() == x.e.b.FIXED || eVarM.C() == bVar2)) {
                b(this.f57131h, eVarM.f56439e.f57131h, this.f57125b.Q.f());
                b(this.f57132i, eVarM.f56439e.f57132i, -this.f57125b.S.f());
                return;
            }
        } else {
            x.e.b bVarC = this.f57125b.C();
            this.f57127d = bVarC;
            if (bVarC != x.e.b.MATCH_CONSTRAINT) {
                x.e.b bVar3 = x.e.b.MATCH_PARENT;
                if (bVarC == bVar3 && (eVarM2 = this.f57125b.M()) != null && (eVarM2.C() == x.e.b.FIXED || eVarM2.C() == bVar3)) {
                    int iY = (eVarM2.Y() - this.f57125b.Q.f()) - this.f57125b.S.f();
                    b(this.f57131h, eVarM2.f56439e.f57131h, this.f57125b.Q.f());
                    b(this.f57132i, eVarM2.f56439e.f57132i, -this.f57125b.S.f());
                    this.f57128e.d(iY);
                    return;
                }
                if (this.f57127d == x.e.b.FIXED) {
                    this.f57128e.d(this.f57125b.Y());
                }
            }
        }
        g gVar = this.f57128e;
        if (gVar.f57081j) {
            x.e eVar2 = this.f57125b;
            if (eVar2.f56431a) {
                x.d[] dVarArr = eVar2.Y;
                x.d dVar = dVarArr[0];
                x.d dVar2 = dVar.f56417f;
                if (dVar2 != null && dVarArr[1].f56417f != null) {
                    if (eVar2.k0()) {
                        this.f57131h.f57077f = this.f57125b.Y[0].f();
                        this.f57132i.f57077f = -this.f57125b.Y[1].f();
                        return;
                    }
                    f fVarH = h(this.f57125b.Y[0]);
                    if (fVarH != null) {
                        b(this.f57131h, fVarH, this.f57125b.Y[0].f());
                    }
                    f fVarH2 = h(this.f57125b.Y[1]);
                    if (fVarH2 != null) {
                        b(this.f57132i, fVarH2, -this.f57125b.Y[1].f());
                    }
                    this.f57131h.f57073b = true;
                    this.f57132i.f57073b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f57131h, fVarH3, this.f57125b.Y[0].f());
                        b(this.f57132i, this.f57131h, this.f57128e.f57078g);
                        return;
                    }
                    return;
                }
                x.d dVar3 = dVarArr[1];
                if (dVar3.f56417f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f57132i, fVarH4, -this.f57125b.Y[1].f());
                        b(this.f57131h, this.f57132i, -this.f57128e.f57078g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof x.i) || eVar2.M() == null || this.f57125b.q(x.d.a.CENTER).f56417f != null) {
                    return;
                }
                b(this.f57131h, this.f57125b.M().f56439e.f57131h, this.f57125b.Z());
                b(this.f57132i, this.f57131h, this.f57128e.f57078g);
                return;
            }
        }
        if (this.f57127d == x.e.b.MATCH_CONSTRAINT) {
            x.e eVar3 = this.f57125b;
            int i10 = eVar3.f56475w;
            if (i10 == 2) {
                x.e eVarM3 = eVar3.M();
                if (eVarM3 != null) {
                    g gVar2 = eVarM3.f56441f.f57128e;
                    this.f57128e.f57083l.add(gVar2);
                    gVar2.f57082k.add(this.f57128e);
                    g gVar3 = this.f57128e;
                    gVar3.f57073b = true;
                    gVar3.f57082k.add(this.f57131h);
                    this.f57128e.f57082k.add(this.f57132i);
                }
            } else if (i10 == 3) {
                if (eVar3.f56477x == 3) {
                    this.f57131h.f57072a = this;
                    this.f57132i.f57072a = this;
                    n nVar = eVar3.f56441f;
                    nVar.f57131h.f57072a = this;
                    nVar.f57132i.f57072a = this;
                    gVar.f57072a = this;
                    if (eVar3.m0()) {
                        this.f57128e.f57083l.add(this.f57125b.f56441f.f57128e);
                        this.f57125b.f56441f.f57128e.f57082k.add(this.f57128e);
                        n nVar2 = this.f57125b.f56441f;
                        nVar2.f57128e.f57072a = this;
                        this.f57128e.f57083l.add(nVar2.f57131h);
                        this.f57128e.f57083l.add(this.f57125b.f56441f.f57132i);
                        this.f57125b.f56441f.f57131h.f57082k.add(this.f57128e);
                        this.f57125b.f56441f.f57132i.f57082k.add(this.f57128e);
                    } else if (this.f57125b.k0()) {
                        this.f57125b.f56441f.f57128e.f57083l.add(this.f57128e);
                        this.f57128e.f57082k.add(this.f57125b.f56441f.f57128e);
                    } else {
                        this.f57125b.f56441f.f57128e.f57083l.add(this.f57128e);
                    }
                } else {
                    g gVar4 = eVar3.f56441f.f57128e;
                    gVar.f57083l.add(gVar4);
                    gVar4.f57082k.add(this.f57128e);
                    this.f57125b.f56441f.f57131h.f57082k.add(this.f57128e);
                    this.f57125b.f56441f.f57132i.f57082k.add(this.f57128e);
                    g gVar5 = this.f57128e;
                    gVar5.f57073b = true;
                    gVar5.f57082k.add(this.f57131h);
                    this.f57128e.f57082k.add(this.f57132i);
                    this.f57131h.f57083l.add(this.f57128e);
                    this.f57132i.f57083l.add(this.f57128e);
                }
            }
        }
        x.e eVar4 = this.f57125b;
        x.d[] dVarArr2 = eVar4.Y;
        x.d dVar4 = dVarArr2[0];
        x.d dVar5 = dVar4.f56417f;
        if (dVar5 != null && dVarArr2[1].f56417f != null) {
            if (eVar4.k0()) {
                this.f57131h.f57077f = this.f57125b.Y[0].f();
                this.f57132i.f57077f = -this.f57125b.Y[1].f();
                return;
            }
            f fVarH5 = h(this.f57125b.Y[0]);
            f fVarH6 = h(this.f57125b.Y[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f57133j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f57131h, fVarH7, this.f57125b.Y[0].f());
                c(this.f57132i, this.f57131h, 1, this.f57128e);
                return;
            }
            return;
        }
        x.d dVar6 = dVarArr2[1];
        if (dVar6.f56417f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f57132i, fVarH8, -this.f57125b.Y[1].f());
                c(this.f57131h, this.f57132i, -1, this.f57128e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof x.i) || eVar4.M() == null) {
            return;
        }
        b(this.f57131h, this.f57125b.M().f56439e.f57131h, this.f57125b.Z());
        c(this.f57132i, this.f57131h, 1, this.f57128e);
    }

    @Override // y.p
    public void e() {
        f fVar = this.f57131h;
        if (fVar.f57081j) {
            this.f57125b.r1(fVar.f57078g);
        }
    }

    @Override // y.p
    void f() {
        this.f57126c = null;
        this.f57131h.c();
        this.f57132i.c();
        this.f57128e.c();
        this.f57130g = false;
    }

    @Override // y.p
    boolean m() {
        return this.f57127d != x.e.b.MATCH_CONSTRAINT || this.f57125b.f56475w == 0;
    }

    void r() {
        this.f57130g = false;
        this.f57131h.c();
        this.f57131h.f57081j = false;
        this.f57132i.c();
        this.f57132i.f57081j = false;
        this.f57128e.f57081j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f57125b.v();
    }
}
