package gp;

import co.p;
import co.q;
import co.s;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p[] f39843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s[] f39844b;

    public k(p[] pVarArr, s[] sVarArr) {
        if (pVarArr != null) {
            int length = pVarArr.length;
            p[] pVarArr2 = new p[length];
            this.f39843a = pVarArr2;
            System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
        } else {
            this.f39843a = new p[0];
        }
        if (sVarArr == null) {
            this.f39844b = new s[0];
            return;
        }
        int length2 = sVarArr.length;
        s[] sVarArr2 = new s[length2];
        this.f39844b = sVarArr2;
        System.arraycopy(sVarArr, 0, sVarArr2, 0, length2);
    }

    @Override // co.s
    public void b(q qVar, f fVar) {
        for (s sVar : this.f39844b) {
            sVar.b(qVar, fVar);
        }
    }

    @Override // co.p
    public void c(co.o oVar, f fVar) {
        for (p pVar : this.f39843a) {
            pVar.c(oVar, fVar);
        }
    }

    public k(List list, List list2) {
        if (list != null) {
            this.f39843a = (p[]) list.toArray(new p[list.size()]);
        } else {
            this.f39843a = new p[0];
        }
        if (list2 != null) {
            this.f39844b = (s[]) list2.toArray(new s[list2.size()]);
        } else {
            this.f39844b = new s[0];
        }
    }

    public k(p... pVarArr) {
        this(pVarArr, (s[]) null);
    }
}
