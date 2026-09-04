package gp;

import co.p;
import co.s;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f39840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f39841b;

    i() {
    }

    public static i j() {
        return new i();
    }

    private c k() {
        if (this.f39840a == null) {
            this.f39840a = new c();
        }
        return this.f39840a;
    }

    private c l() {
        if (this.f39841b == null) {
            this.f39841b = new c();
        }
        return this.f39841b;
    }

    public i a(p pVar) {
        return g(pVar);
    }

    public i b(s sVar) {
        return h(sVar);
    }

    public i c(p... pVarArr) {
        return d(pVarArr);
    }

    public i d(p... pVarArr) {
        if (pVarArr == null) {
            return this;
        }
        k().a(pVarArr);
        return this;
    }

    public i e(p pVar) {
        if (pVar == null) {
            return this;
        }
        k().b(pVar);
        return this;
    }

    public i f(s sVar) {
        if (sVar == null) {
            return this;
        }
        l().b(sVar);
        return this;
    }

    public i g(p pVar) {
        if (pVar == null) {
            return this;
        }
        k().c(pVar);
        return this;
    }

    public i h(s sVar) {
        if (sVar == null) {
            return this;
        }
        l().c(sVar);
        return this;
    }

    public h i() {
        c cVar = this.f39840a;
        LinkedList linkedListD = cVar != null ? cVar.d() : null;
        c cVar2 = this.f39841b;
        return new k(linkedListD, cVar2 != null ? cVar2.d() : null);
    }
}
