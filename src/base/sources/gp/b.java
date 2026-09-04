package gp;

import co.p;
import co.q;
import co.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements h, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final List f39831a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final List f39832b = new ArrayList();

    @Override // co.s
    public void b(q qVar, f fVar) {
        Iterator it = this.f39832b.iterator();
        while (it.hasNext()) {
            ((s) it.next()).b(qVar, fVar);
        }
    }

    @Override // co.p
    public void c(co.o oVar, f fVar) {
        Iterator it = this.f39831a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).c(oVar, fVar);
        }
    }

    public Object clone() {
        b bVar = (b) super.clone();
        n(bVar);
        return bVar;
    }

    public final void d(p pVar) {
        h(pVar);
    }

    public final void e(p pVar, int i10) {
        i(pVar, i10);
    }

    public final void f(s sVar) {
        j(sVar);
    }

    public final void g(s sVar, int i10) {
        k(sVar, i10);
    }

    public void h(p pVar) {
        if (pVar == null) {
            return;
        }
        this.f39831a.add(pVar);
    }

    public void i(p pVar, int i10) {
        if (pVar == null) {
            return;
        }
        this.f39831a.add(i10, pVar);
    }

    public void j(s sVar) {
        if (sVar == null) {
            return;
        }
        this.f39832b.add(sVar);
    }

    public void k(s sVar, int i10) {
        if (sVar == null) {
            return;
        }
        this.f39832b.add(i10, sVar);
    }

    public void l() {
        this.f39831a.clear();
    }

    public void m() {
        this.f39832b.clear();
    }

    protected void n(b bVar) {
        bVar.f39831a.clear();
        bVar.f39831a.addAll(this.f39831a);
        bVar.f39832b.clear();
        bVar.f39832b.addAll(this.f39832b);
    }

    public p o(int i10) {
        if (i10 < 0 || i10 >= this.f39831a.size()) {
            return null;
        }
        return (p) this.f39831a.get(i10);
    }

    public int p() {
        return this.f39831a.size();
    }

    public s q(int i10) {
        if (i10 < 0 || i10 >= this.f39832b.size()) {
            return null;
        }
        return (s) this.f39832b.get(i10);
    }

    public int r() {
        return this.f39832b.size();
    }

    public void s(Class cls) {
        Iterator it = this.f39831a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    public void t(Class cls) {
        Iterator it = this.f39832b.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }
}
