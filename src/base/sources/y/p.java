package y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x.e f57125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f57126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected x.e.b f57127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f57128e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f57129f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f57130g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f57131h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f57132i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f57133j = b.NONE;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57134a;

        static {
            int[] iArr = new int[x.d.a.values().length];
            f57134a = iArr;
            try {
                iArr[x.d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57134a[x.d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57134a[x.d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57134a[x.d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57134a[x.d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(x.e eVar) {
        this.f57125b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f57124a;
        if (i12 == 0) {
            this.f57128e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f57128e.d(Math.min(g(this.f57128e.f57093m, i10), i11));
            return;
        }
        if (i12 == 2) {
            x.e eVarM = this.f57125b.M();
            if (eVarM != null) {
                g gVar = (i10 == 0 ? eVarM.f56439e : eVarM.f56441f).f57128e;
                if (gVar.f57081j) {
                    this.f57128e.d(g((int) ((gVar.f57078g * (i10 == 0 ? this.f57125b.B : this.f57125b.E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        x.e eVar = this.f57125b;
        p pVar = eVar.f56439e;
        x.e.b bVar = pVar.f57127d;
        x.e.b bVar2 = x.e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f57124a == 3) {
            n nVar = eVar.f56441f;
            if (nVar.f57127d == bVar2 && nVar.f57124a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f56441f;
        }
        if (pVar.f57128e.f57081j) {
            float fX = eVar.x();
            this.f57128e.d(i10 == 1 ? (int) ((pVar.f57128e.f57078g / fX) + 0.5f) : (int) ((fX * pVar.f57128e.f57078g) + 0.5f));
        }
    }

    @Override // y.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f57083l.add(fVar2);
        fVar.f57077f = i10;
        fVar2.f57082k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f57083l.add(fVar2);
        fVar.f57083l.add(this.f57128e);
        fVar.f57079h = i10;
        fVar.f57080i = gVar;
        fVar2.f57082k.add(fVar);
        gVar.f57082k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            x.e eVar = this.f57125b;
            int i12 = eVar.A;
            int iMax = Math.max(eVar.f56481z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            x.e eVar2 = this.f57125b;
            int i13 = eVar2.D;
            int iMax2 = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(x.d dVar) {
        x.d dVar2 = dVar.f56417f;
        if (dVar2 == null) {
            return null;
        }
        x.e eVar = dVar2.f56415d;
        int i10 = a.f57134a[dVar2.f56416e.ordinal()];
        if (i10 == 1) {
            return eVar.f56439e.f57131h;
        }
        if (i10 == 2) {
            return eVar.f56439e.f57132i;
        }
        if (i10 == 3) {
            return eVar.f56441f.f57131h;
        }
        if (i10 == 4) {
            return eVar.f56441f.f57107k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f56441f.f57132i;
    }

    protected final f i(x.d dVar, int i10) {
        x.d dVar2 = dVar.f56417f;
        if (dVar2 == null) {
            return null;
        }
        x.e eVar = dVar2.f56415d;
        p pVar = i10 == 0 ? eVar.f56439e : eVar.f56441f;
        int i11 = a.f57134a[dVar2.f56416e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f57132i;
        }
        return pVar.f57131h;
    }

    public long j() {
        g gVar = this.f57128e;
        if (gVar.f57081j) {
            return gVar.f57078g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f57130g;
    }

    abstract boolean m();

    protected void n(d dVar, x.d dVar2, x.d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f57081j && fVarH2.f57081j) {
            int iF = fVarH.f57078g + dVar2.f();
            int iF2 = fVarH2.f57078g - dVar3.f();
            int i11 = iF2 - iF;
            if (!this.f57128e.f57081j && this.f57127d == x.e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f57128e;
            if (gVar.f57081j) {
                if (gVar.f57078g == i11) {
                    this.f57131h.d(iF);
                    this.f57132i.d(iF2);
                    return;
                }
                float fA = i10 == 0 ? this.f57125b.A() : this.f57125b.T();
                if (fVarH == fVarH2) {
                    iF = fVarH.f57078g;
                    iF2 = fVarH2.f57078g;
                    fA = 0.5f;
                }
                this.f57131h.d((int) (iF + 0.5f + (((iF2 - iF) - this.f57128e.f57078g) * fA)));
                this.f57132i.d(this.f57131h.f57078g + this.f57128e.f57078g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
