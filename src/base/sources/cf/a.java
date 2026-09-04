package cf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a[] f9960f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9962a;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        f9960f = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i10) {
        this.f9962a = i10;
    }

    public int d() {
        return this.f9962a;
    }
}
