package o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f47967a;

    public a0(j0 j0Var) {
        this.f47967a = j0Var;
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f47967a.getDurationUs();
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        return this.f47967a.getSeekPoints(j10);
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return this.f47967a.isSeekable();
    }
}
