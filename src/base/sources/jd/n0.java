package jd;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum n0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42358a;

    n0(int i10) {
        this.f42358a = i10;
    }

    public static n0 e(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int g() {
        return this.f42358a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f42358a);
    }
}
