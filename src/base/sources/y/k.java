package y;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class k extends p {
    k(x.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f57131h.f57082k.add(fVar);
        fVar.f57083l.add(this.f57131h);
    }

    @Override // y.p, y.d
    public void a(d dVar) {
        x.a aVar = (x.a) this.f57125b;
        int iA1 = aVar.A1();
        Iterator it = this.f57131h.f57083l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f57078g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iA1 == 0 || iA1 == 2) {
            this.f57131h.d(i11 + aVar.B1());
        } else {
            this.f57131h.d(i10 + aVar.B1());
        }
    }

    @Override // y.p
    void d() {
        x.e eVar = this.f57125b;
        if (eVar instanceof x.a) {
            this.f57131h.f57073b = true;
            x.a aVar = (x.a) eVar;
            int iA1 = aVar.A1();
            boolean zZ1 = aVar.z1();
            int i10 = 0;
            if (iA1 == 0) {
                this.f57131h.f57076e = f.a.LEFT;
                while (i10 < aVar.W0) {
                    x.e eVar2 = aVar.V0[i10];
                    if (zZ1 || eVar2.X() != 8) {
                        f fVar = eVar2.f56439e.f57131h;
                        fVar.f57082k.add(this.f57131h);
                        this.f57131h.f57083l.add(fVar);
                    }
                    i10++;
                }
                q(this.f57125b.f56439e.f57131h);
                q(this.f57125b.f56439e.f57132i);
                return;
            }
            if (iA1 == 1) {
                this.f57131h.f57076e = f.a.RIGHT;
                while (i10 < aVar.W0) {
                    x.e eVar3 = aVar.V0[i10];
                    if (zZ1 || eVar3.X() != 8) {
                        f fVar2 = eVar3.f56439e.f57132i;
                        fVar2.f57082k.add(this.f57131h);
                        this.f57131h.f57083l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f57125b.f56439e.f57131h);
                q(this.f57125b.f56439e.f57132i);
                return;
            }
            if (iA1 == 2) {
                this.f57131h.f57076e = f.a.TOP;
                while (i10 < aVar.W0) {
                    x.e eVar4 = aVar.V0[i10];
                    if (zZ1 || eVar4.X() != 8) {
                        f fVar3 = eVar4.f56441f.f57131h;
                        fVar3.f57082k.add(this.f57131h);
                        this.f57131h.f57083l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f57125b.f56441f.f57131h);
                q(this.f57125b.f56441f.f57132i);
                return;
            }
            if (iA1 != 3) {
                return;
            }
            this.f57131h.f57076e = f.a.BOTTOM;
            while (i10 < aVar.W0) {
                x.e eVar5 = aVar.V0[i10];
                if (zZ1 || eVar5.X() != 8) {
                    f fVar4 = eVar5.f56441f.f57132i;
                    fVar4.f57082k.add(this.f57131h);
                    this.f57131h.f57083l.add(fVar4);
                }
                i10++;
            }
            q(this.f57125b.f56441f.f57131h);
            q(this.f57125b.f56441f.f57132i);
        }
    }

    @Override // y.p
    public void e() {
        x.e eVar = this.f57125b;
        if (eVar instanceof x.a) {
            int iA1 = ((x.a) eVar).A1();
            if (iA1 == 0 || iA1 == 1) {
                this.f57125b.r1(this.f57131h.f57078g);
            } else {
                this.f57125b.s1(this.f57131h.f57078g);
            }
        }
    }

    @Override // y.p
    void f() {
        this.f57126c = null;
        this.f57131h.c();
    }

    @Override // y.p
    boolean m() {
        return false;
    }
}
