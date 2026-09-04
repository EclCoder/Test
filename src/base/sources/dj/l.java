package dj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum l {
    NUMBER((byte) 0),
    BOOLEAN((byte) 1),
    STRING((byte) 2),
    OBJECT((byte) 3),
    NULL((byte) 5),
    UNDEFINED((byte) 6),
    ECMA_ARRAY((byte) 8),
    OBJECT_END((byte) 9),
    STRICT_ARRAY((byte) 10),
    DATE((byte) 11),
    LONG_STRING((byte) 12),
    UNSUPPORTED((byte) 13),
    XML_DOCUMENT((byte) 15),
    REFERENCE((byte) 7),
    TYPED_OBJECT((byte) 16),
    AVM_PLUS_OBJECT((byte) 17),
    MOVIE_CLIP((byte) 4),
    RECORD_SET((byte) 14);


    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ ml.a f36978u = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f36979a;

    l(byte b10) {
        this.f36979a = b10;
    }

    public static ml.a g() {
        return f36978u;
    }

    public final byte h() {
        return this.f36979a;
    }
}
