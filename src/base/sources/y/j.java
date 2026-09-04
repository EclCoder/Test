package y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class j extends p {
    j(x.e eVar) {
        super(eVar);
        eVar.f56439e.f();
        eVar.f56441f.f();
        this.f57129f = ((x.h) eVar).x1();
    }

    private void q(f fVar) {
        this.f57131h.f57082k.add(fVar);
        fVar.f57083l.add(this.f57131h);
    }

    @Override // y.p, y.d
    public void a(d dVar) {
        f fVar = this.f57131h;
        if (fVar.f57074c && !fVar.f57081j) {
            this.f57131h.d((int) ((((f) fVar.f57083l.get(0)).f57078g * ((x.h) this.f57125b).A1()) + 0.5f));
        }
    }

    @Override // y.p
    void d() {
        x.h hVar = (x.h) this.f57125b;
        int iY1 = hVar.y1();
        int iZ1 = hVar.z1();
        hVar.A1();
        if (hVar.x1() == 1) {
            if (iY1 != -1) {
                this.f57131h.f57083l.add(this.f57125b.f56436c0.f56439e.f57131h);
                this.f57125b.f56436c0.f56439e.f57131h.f57082k.add(this.f57131h);
                this.f57131h.f57077f = iY1;
            } else if (iZ1 != -1) {
                this.f57131h.f57083l.add(this.f57125b.f56436c0.f56439e.f57132i);
                this.f57125b.f56436c0.f56439e.f57132i.f57082k.add(this.f57131h);
                this.f57131h.f57077f = -iZ1;
            } else {
                f fVar = this.f57131h;
                fVar.f57073b = true;
                fVar.f57083l.add(this.f57125b.f56436c0.f56439e.f57132i);
                this.f57125b.f56436c0.f56439e.f57132i.f57082k.add(this.f57131h);
            }
            q(this.f57125b.f56439e.f57131h);
            q(this.f57125b.f56439e.f57132i);
            return;
        }
        if (iY1 != -1) {
            this.f57131h.f57083l.add(this.f57125b.f56436c0.f56441f.f57131h);
            this.f57125b.f56436c0.f56441f.f57131h.f57082k.add(this.f57131h);
            this.f57131h.f57077f = iY1;
        } else if (iZ1 != -1) {
            this.f57131h.f57083l.add(this.f57125b.f56436c0.f56441f.f57132i);
            this.f57125b.f56436c0.f56441f.f57132i.f57082k.add(this.f57131h);
            this.f57131h.f57077f = -iZ1;
        } else {
            f fVar2 = this.f57131h;
            fVar2.f57073b = true;
            fVar2.f57083l.add(this.f57125b.f56436c0.f56441f.f57132i);
            this.f57125b.f56436c0.f56441f.f57132i.f57082k.add(this.f57131h);
        }
        q(this.f57125b.f56441f.f57131h);
        q(this.f57125b.f56441f.f57132i);
    }

    @Override // y.p
    public void e() {
        if (((x.h) this.f57125b).x1() == 1) {
            this.f57125b.r1(this.f57131h.f57078g);
        } else {
            this.f57125b.s1(this.f57131h.f57078g);
        }
    }

    @Override // y.p
    void f() {
        this.f57131h.c();
    }

    @Override // y.p
    boolean m() {
        return false;
    }
}
