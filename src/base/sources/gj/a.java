package gj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum a {
    PCM(0),
    ADPCM(1),
    MP3(2),
    PCM_LE(3),
    NELLYMOSER_16K(4),
    NELLYMOSER_8K(5),
    NELLYMOSER(6),
    G711_A(7),
    G711_MU(8),
    RESERVED(9),
    AAC(10),
    SPEEX(11),
    MP3_8K(14),
    DEVICE_SPECIFIC(15);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ ml.a f39259q = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f39260a;

    a(int i10) {
        this.f39260a = i10;
    }

    public final int g() {
        return this.f39260a;
    }
}
