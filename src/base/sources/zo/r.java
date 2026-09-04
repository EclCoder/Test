package zo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class r implements uo.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f59057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final to.f f59058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f59059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f59060d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum a {
        DEFAULT,
        IE_MEDIUM_SECURITY
    }

    public r(a aVar, to.f fVar, String[] strArr, boolean z10) {
        this.f59057a = aVar == null ? a.DEFAULT : aVar;
        this.f59058b = fVar;
        this.f59059c = strArr;
        this.f59060d = z10;
    }

    public r(to.f fVar) {
        this(a.DEFAULT, fVar, null, false);
    }
}
