package l3;

import android.util.SparseArray;
import o2.j0;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class t implements o2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2.r f43880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f43881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f43882c = new SparseArray();

    public t(o2.r rVar, r.a aVar) {
        this.f43880a = rVar;
        this.f43881b = aVar;
    }

    public void a() {
        for (int i10 = 0; i10 < this.f43882c.size(); i10++) {
            ((v) this.f43882c.valueAt(i10)).j();
        }
    }

    @Override // o2.r
    public void d(j0 j0Var) {
        this.f43880a.d(j0Var);
    }

    @Override // o2.r
    public void endTracks() {
        this.f43880a.endTracks();
    }

    @Override // o2.r
    public o0 track(int i10, int i11) {
        if (i11 != 3) {
            return this.f43880a.track(i10, i11);
        }
        v vVar = (v) this.f43882c.get(i10);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f43880a.track(i10, i11), this.f43881b);
        this.f43882c.put(i10, vVar2);
        return vVar2;
    }
}
