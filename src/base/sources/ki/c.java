package ki;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum c {
    RESERVED(0),
    SEQUENCE_HEADER(1),
    TEMPORAL_DELIMITER(2),
    FRAME_HEADER(3),
    TILE_GROUP(4),
    METADATA(5),
    FRAME(6),
    REDUNDANT_FRAME_HEADER(7),
    TILE_LIST(8),
    PADDING(15);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ ml.a f43410m = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43411a;

    c(int i10) {
        this.f43411a = i10;
    }

    public static ml.a g() {
        return f43410m;
    }

    public final int h() {
        return this.f43411a;
    }
}
