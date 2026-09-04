package y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f57093m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f57076e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f57076e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // y.f
    public void d(int i10) {
        if (this.f57081j) {
            return;
        }
        this.f57081j = true;
        this.f57078g = i10;
        for (d dVar : this.f57082k) {
            dVar.a(dVar);
        }
    }
}
