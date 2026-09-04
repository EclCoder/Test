package y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class n extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f57107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f57108l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57109a;

        static {
            int[] iArr = new int[p.b.values().length];
            f57109a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57109a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57109a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(x.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f57107k = fVar;
        this.f57108l = null;
        this.f57131h.f57076e = f.a.TOP;
        this.f57132i.f57076e = f.a.BOTTOM;
        fVar.f57076e = f.a.BASELINE;
        this.f57129f = 1;
    }

    @Override // y.p, y.d
    public void a(d dVar) {
        float f10;
        float fX;
        float fX2;
        int i10;
        int i11 = a.f57109a[this.f57133j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            x.e eVar = this.f57125b;
            n(dVar, eVar.R, eVar.T, 1);
            return;
        }
        g gVar = this.f57128e;
        if (gVar.f57074c && !gVar.f57081j && this.f57127d == x.e.b.MATCH_CONSTRAINT) {
            x.e eVar2 = this.f57125b;
            int i12 = eVar2.f56477x;
            if (i12 == 2) {
                x.e eVarM = eVar2.M();
                if (eVarM != null) {
                    g gVar2 = eVarM.f56441f.f57128e;
                    if (gVar2.f57081j) {
                        this.f57128e.d((int) ((gVar2.f57078g * this.f57125b.E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f56439e.f57128e.f57081j) {
                int iY = eVar2.y();
                if (iY != -1) {
                    if (iY == 0) {
                        x.e eVar3 = this.f57125b;
                        fX2 = eVar3.f56439e.f57128e.f57078g * eVar3.x();
                        i10 = (int) (fX2 + 0.5f);
                    } else if (iY != 1) {
                        i10 = 0;
                    } else {
                        x.e eVar4 = this.f57125b;
                        f10 = eVar4.f56439e.f57128e.f57078g;
                        fX = eVar4.x();
                    }
                    this.f57128e.d(i10);
                } else {
                    x.e eVar5 = this.f57125b;
                    f10 = eVar5.f56439e.f57128e.f57078g;
                    fX = eVar5.x();
                }
                fX2 = f10 / fX;
                i10 = (int) (fX2 + 0.5f);
                this.f57128e.d(i10);
            }
        }
        f fVar = this.f57131h;
        if (fVar.f57074c) {
            f fVar2 = this.f57132i;
            if (fVar2.f57074c) {
                if (fVar.f57081j && fVar2.f57081j && this.f57128e.f57081j) {
                    return;
                }
                if (!this.f57128e.f57081j && this.f57127d == x.e.b.MATCH_CONSTRAINT) {
                    x.e eVar6 = this.f57125b;
                    if (eVar6.f56475w == 0 && !eVar6.m0()) {
                        f fVar3 = (f) this.f57131h.f57083l.get(0);
                        f fVar4 = (f) this.f57132i.f57083l.get(0);
                        int i13 = fVar3.f57078g;
                        f fVar5 = this.f57131h;
                        int i14 = i13 + fVar5.f57077f;
                        int i15 = fVar4.f57078g + this.f57132i.f57077f;
                        fVar5.d(i14);
                        this.f57132i.d(i15);
                        this.f57128e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f57128e.f57081j && this.f57127d == x.e.b.MATCH_CONSTRAINT && this.f57124a == 1 && this.f57131h.f57083l.size() > 0 && this.f57132i.f57083l.size() > 0) {
                    f fVar6 = (f) this.f57131h.f57083l.get(0);
                    int i16 = (((f) this.f57132i.f57083l.get(0)).f57078g + this.f57132i.f57077f) - (fVar6.f57078g + this.f57131h.f57077f);
                    g gVar3 = this.f57128e;
                    int i17 = gVar3.f57093m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f57128e.f57081j && this.f57131h.f57083l.size() > 0 && this.f57132i.f57083l.size() > 0) {
                    f fVar7 = (f) this.f57131h.f57083l.get(0);
                    f fVar8 = (f) this.f57132i.f57083l.get(0);
                    int i18 = fVar7.f57078g + this.f57131h.f57077f;
                    int i19 = fVar8.f57078g + this.f57132i.f57077f;
                    float fT = this.f57125b.T();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f57078g;
                        i19 = fVar8.f57078g;
                        fT = 0.5f;
                    }
                    this.f57131h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f57128e.f57078g) * fT)));
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
            this.f57128e.d(eVar.z());
        }
        if (!this.f57128e.f57081j) {
            this.f57127d = this.f57125b.V();
            if (this.f57125b.b0()) {
                this.f57108l = new y.a(this);
            }
            x.e.b bVar = this.f57127d;
            if (bVar != x.e.b.MATCH_CONSTRAINT) {
                if (bVar == x.e.b.MATCH_PARENT && (eVarM2 = this.f57125b.M()) != null && eVarM2.V() == x.e.b.FIXED) {
                    int iZ = (eVarM2.z() - this.f57125b.R.f()) - this.f57125b.T.f();
                    b(this.f57131h, eVarM2.f56441f.f57131h, this.f57125b.R.f());
                    b(this.f57132i, eVarM2.f56441f.f57132i, -this.f57125b.T.f());
                    this.f57128e.d(iZ);
                    return;
                }
                if (this.f57127d == x.e.b.FIXED) {
                    this.f57128e.d(this.f57125b.z());
                }
            }
        } else if (this.f57127d == x.e.b.MATCH_PARENT && (eVarM = this.f57125b.M()) != null && eVarM.V() == x.e.b.FIXED) {
            b(this.f57131h, eVarM.f56441f.f57131h, this.f57125b.R.f());
            b(this.f57132i, eVarM.f56441f.f57132i, -this.f57125b.T.f());
            return;
        }
        g gVar = this.f57128e;
        boolean z10 = gVar.f57081j;
        if (z10) {
            x.e eVar2 = this.f57125b;
            if (eVar2.f56431a) {
                x.d[] dVarArr = eVar2.Y;
                x.d dVar = dVarArr[2];
                x.d dVar2 = dVar.f56417f;
                if (dVar2 != null && dVarArr[3].f56417f != null) {
                    if (eVar2.m0()) {
                        this.f57131h.f57077f = this.f57125b.Y[2].f();
                        this.f57132i.f57077f = -this.f57125b.Y[3].f();
                    } else {
                        f fVarH = h(this.f57125b.Y[2]);
                        if (fVarH != null) {
                            b(this.f57131h, fVarH, this.f57125b.Y[2].f());
                        }
                        f fVarH2 = h(this.f57125b.Y[3]);
                        if (fVarH2 != null) {
                            b(this.f57132i, fVarH2, -this.f57125b.Y[3].f());
                        }
                        this.f57131h.f57073b = true;
                        this.f57132i.f57073b = true;
                    }
                    if (this.f57125b.b0()) {
                        b(this.f57107k, this.f57131h, this.f57125b.r());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f57131h, fVarH3, this.f57125b.Y[2].f());
                        b(this.f57132i, this.f57131h, this.f57128e.f57078g);
                        if (this.f57125b.b0()) {
                            b(this.f57107k, this.f57131h, this.f57125b.r());
                            return;
                        }
                        return;
                    }
                    return;
                }
                x.d dVar3 = dVarArr[3];
                if (dVar3.f56417f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f57132i, fVarH4, -this.f57125b.Y[3].f());
                        b(this.f57131h, this.f57132i, -this.f57128e.f57078g);
                    }
                    if (this.f57125b.b0()) {
                        b(this.f57107k, this.f57131h, this.f57125b.r());
                        return;
                    }
                    return;
                }
                x.d dVar4 = dVarArr[4];
                if (dVar4.f56417f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f57107k, fVarH5, 0);
                        b(this.f57131h, this.f57107k, -this.f57125b.r());
                        b(this.f57132i, this.f57131h, this.f57128e.f57078g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof x.i) || eVar2.M() == null || this.f57125b.q(x.d.a.CENTER).f56417f != null) {
                    return;
                }
                b(this.f57131h, this.f57125b.M().f56441f.f57131h, this.f57125b.a0());
                b(this.f57132i, this.f57131h, this.f57128e.f57078g);
                if (this.f57125b.b0()) {
                    b(this.f57107k, this.f57131h, this.f57125b.r());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f57127d != x.e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            x.e eVar3 = this.f57125b;
            int i10 = eVar3.f56477x;
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
            } else if (i10 == 3 && !eVar3.m0()) {
                x.e eVar4 = this.f57125b;
                if (eVar4.f56475w != 3) {
                    g gVar4 = eVar4.f56439e.f57128e;
                    this.f57128e.f57083l.add(gVar4);
                    gVar4.f57082k.add(this.f57128e);
                    g gVar5 = this.f57128e;
                    gVar5.f57073b = true;
                    gVar5.f57082k.add(this.f57131h);
                    this.f57128e.f57082k.add(this.f57132i);
                }
            }
        }
        x.e eVar5 = this.f57125b;
        x.d[] dVarArr2 = eVar5.Y;
        x.d dVar5 = dVarArr2[2];
        x.d dVar6 = dVar5.f56417f;
        if (dVar6 != null && dVarArr2[3].f56417f != null) {
            if (eVar5.m0()) {
                this.f57131h.f57077f = this.f57125b.Y[2].f();
                this.f57132i.f57077f = -this.f57125b.Y[3].f();
            } else {
                f fVarH6 = h(this.f57125b.Y[2]);
                f fVarH7 = h(this.f57125b.Y[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f57133j = p.b.CENTER;
            }
            if (this.f57125b.b0()) {
                c(this.f57107k, this.f57131h, 1, this.f57108l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f57131h, fVarH8, this.f57125b.Y[2].f());
                c(this.f57132i, this.f57131h, 1, this.f57128e);
                if (this.f57125b.b0()) {
                    c(this.f57107k, this.f57131h, 1, this.f57108l);
                }
                x.e.b bVar2 = this.f57127d;
                x.e.b bVar3 = x.e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f57125b.x() > 0.0f) {
                    l lVar = this.f57125b.f56439e;
                    if (lVar.f57127d == bVar3) {
                        lVar.f57128e.f57082k.add(this.f57128e);
                        this.f57128e.f57083l.add(this.f57125b.f56439e.f57128e);
                        this.f57128e.f57072a = this;
                    }
                }
            }
        } else {
            x.d dVar7 = dVarArr2[3];
            if (dVar7.f56417f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f57132i, fVarH9, -this.f57125b.Y[3].f());
                    c(this.f57131h, this.f57132i, -1, this.f57128e);
                    if (this.f57125b.b0()) {
                        c(this.f57107k, this.f57131h, 1, this.f57108l);
                    }
                }
            } else {
                x.d dVar8 = dVarArr2[4];
                if (dVar8.f56417f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f57107k, fVarH10, 0);
                        c(this.f57131h, this.f57107k, -1, this.f57108l);
                        c(this.f57132i, this.f57131h, 1, this.f57128e);
                    }
                } else if (!(eVar5 instanceof x.i) && eVar5.M() != null) {
                    b(this.f57131h, this.f57125b.M().f56441f.f57131h, this.f57125b.a0());
                    c(this.f57132i, this.f57131h, 1, this.f57128e);
                    if (this.f57125b.b0()) {
                        c(this.f57107k, this.f57131h, 1, this.f57108l);
                    }
                    x.e.b bVar4 = this.f57127d;
                    x.e.b bVar5 = x.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f57125b.x() > 0.0f) {
                        l lVar2 = this.f57125b.f56439e;
                        if (lVar2.f57127d == bVar5) {
                            lVar2.f57128e.f57082k.add(this.f57128e);
                            this.f57128e.f57083l.add(this.f57125b.f56439e.f57128e);
                            this.f57128e.f57072a = this;
                        }
                    }
                }
            }
        }
        if (this.f57128e.f57083l.size() == 0) {
            this.f57128e.f57074c = true;
        }
    }

    @Override // y.p
    public void e() {
        f fVar = this.f57131h;
        if (fVar.f57081j) {
            this.f57125b.s1(fVar.f57078g);
        }
    }

    @Override // y.p
    void f() {
        this.f57126c = null;
        this.f57131h.c();
        this.f57132i.c();
        this.f57107k.c();
        this.f57128e.c();
        this.f57130g = false;
    }

    @Override // y.p
    boolean m() {
        return this.f57127d != x.e.b.MATCH_CONSTRAINT || this.f57125b.f56477x == 0;
    }

    void q() {
        this.f57130g = false;
        this.f57131h.c();
        this.f57131h.f57081j = false;
        this.f57132i.c();
        this.f57132i.f57081j = false;
        this.f57107k.c();
        this.f57107k.f57081j = false;
        this.f57128e.f57081j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f57125b.v();
    }
}
