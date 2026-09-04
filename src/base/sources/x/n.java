package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends e {
    public ArrayList V0 = new ArrayList();

    public void b(e eVar) {
        this.V0.add(eVar);
        if (eVar.M() != null) {
            ((n) eVar.M()).y1(eVar);
        }
        eVar.h1(this);
    }

    @Override // x.e
    public void v0() {
        this.V0.clear();
        super.v0();
    }

    public ArrayList w1() {
        return this.V0;
    }

    public abstract void x1();

    public void y1(e eVar) {
        this.V0.remove(eVar);
        eVar.v0();
    }

    @Override // x.e
    public void z0(u.c cVar) {
        super.z0(cVar);
        int size = this.V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.V0.get(i10)).z0(cVar);
        }
    }

    public void z1() {
        this.V0.clear();
    }
}
