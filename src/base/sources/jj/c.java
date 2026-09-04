package jj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum c {
    SORENSON_H263(2),
    SCREEN_1(3),
    VP6(4),
    VP6_ALPHA(5),
    SCREEN_2(6),
    AVC(7),
    UNKNOWN(255),
    HEVC(1752589105),
    AV1(1635135537),
    VP9(1987063865);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ ml.a f42609m = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42610a;

    c(int i10) {
        this.f42610a = i10;
    }

    public final int g() {
        return this.f42610a;
    }
}
