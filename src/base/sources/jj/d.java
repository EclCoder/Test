package jj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum d {
    UNSPEC(0),
    SLICE(1),
    DPA(2),
    DPB(3),
    DPC(4),
    IDR(5),
    SEI(6),
    SPS(7),
    PPS(8),
    AUD(9),
    EO_SEQ(10),
    EO_STREAM(11),
    FILL(12),
    HEVC_VPS(32),
    HEVC_SPS(33),
    HEVC_PPS(34),
    IDR_N_LP(20),
    IDR_W_DLP(19);


    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ ml.a f42630u = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42631a;

    d(int i10) {
        this.f42631a = i10;
    }

    public final int g() {
        return this.f42631a;
    }
}
