package zo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class n implements uo.h, uo.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f59049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uo.g f59050b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    public n(String[] strArr, a aVar) {
        this.f59049a = aVar;
        this.f59050b = new m(strArr, aVar);
    }

    public n() {
        this(null, a.SECURITYLEVEL_DEFAULT);
    }
}
