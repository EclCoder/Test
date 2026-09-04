package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum d implements yd.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ ml.a f47154i = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47155a;

    d(int i10) {
        this.f47155a = i10;
    }

    @Override // yd.f
    public int getNumber() {
        return this.f47155a;
    }
}
