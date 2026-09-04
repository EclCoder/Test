package o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48115b;

    public m0(long j10) {
        this(j10, 0L);
    }

    @Override // o2.j0
    public long getDurationUs() {
        return this.f48114a;
    }

    @Override // o2.j0
    public j0.a getSeekPoints(long j10) {
        return new j0.a(new k0(j10, this.f48115b));
    }

    @Override // o2.j0
    public boolean isSeekable() {
        return true;
    }

    public m0(long j10, long j11) {
        this.f48114a = j10;
        this.f48115b = j11;
    }
}
