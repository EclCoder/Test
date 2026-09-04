package m6;

import androidx.collection.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.collection.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f45266g;

    @Override // androidx.collection.u, java.util.Map
    public void clear() {
        this.f45266g = 0;
        super.clear();
    }

    @Override // androidx.collection.u, java.util.Map
    public int hashCode() {
        if (this.f45266g == 0) {
            this.f45266g = super.hashCode();
        }
        return this.f45266g;
    }

    @Override // androidx.collection.u
    public void j(u uVar) {
        this.f45266g = 0;
        super.j(uVar);
    }

    @Override // androidx.collection.u
    public Object k(int i10) {
        this.f45266g = 0;
        return super.k(i10);
    }

    @Override // androidx.collection.u
    public Object l(int i10, Object obj) {
        this.f45266g = 0;
        return super.l(i10, obj);
    }

    @Override // androidx.collection.u, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f45266g = 0;
        return super.put(obj, obj2);
    }
}
