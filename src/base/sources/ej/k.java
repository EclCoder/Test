package ej;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public enum k {
    UNDEFINED((byte) 0),
    NULL((byte) 1),
    TRUE((byte) 2),
    FALSE((byte) 3),
    f37934f((byte) 4),
    DOUBLE((byte) 5),
    STRING((byte) 6),
    XML_DOC((byte) 7),
    DATE((byte) 8),
    ARRAY((byte) 9),
    OBJECT((byte) 10),
    XML((byte) 11),
    BYTE_ARRAY((byte) 12),
    VECTOR_INT((byte) 13),
    VECTOR_UINT((byte) 14),
    VECTOR_DOUBLE((byte) 15),
    VECTOR_OBJECT((byte) 16),
    DICTIONARY((byte) 17);


    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ ml.a f37949u = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f37950a;

    k(byte b10) {
        this.f37950a = b10;
    }

    public static ml.a g() {
        return f37949u;
    }

    public final byte h() {
        return this.f37950a;
    }
}
