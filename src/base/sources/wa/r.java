package wa;

import android.util.SparseArray;
import ob.n0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f56155a = new SparseArray();

    public n0 a(int i10) {
        n0 n0Var = (n0) this.f56155a.get(i10);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(9223372036854775806L);
        this.f56155a.put(i10, n0Var2);
        return n0Var2;
    }

    public void b() {
        this.f56155a.clear();
    }
}
