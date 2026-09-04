package zo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class k0 implements uo.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f59041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final to.f f59042b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        STRICT,
        RELAXED,
        IE_MEDIUM_SECURITY
    }

    public k0(a aVar, to.f fVar) {
        this.f59041a = aVar == null ? a.RELAXED : aVar;
        this.f59042b = fVar;
    }
}
