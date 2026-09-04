package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum u implements yd.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ ml.a f47252g = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47253a;

    u(int i10) {
        this.f47253a = i10;
    }

    @Override // yd.f
    public int getNumber() {
        return this.f47253a;
    }
}
