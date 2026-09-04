package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum j implements yd.f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ml.a f47179e = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47180a;

    j(int i10) {
        this.f47180a = i10;
    }

    @Override // yd.f
    public int getNumber() {
        return this.f47180a;
    }
}
