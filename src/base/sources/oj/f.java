package oj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public enum f {
    SET_CHUNK_SIZE((byte) 1),
    f48934c((byte) 2),
    ACKNOWLEDGEMENT((byte) 3),
    USER_CONTROL((byte) 4),
    WINDOW_ACKNOWLEDGEMENT_SIZE((byte) 5),
    SET_PEER_BANDWIDTH((byte) 6),
    AUDIO((byte) 8),
    VIDEO((byte) 9),
    DATA_AMF3((byte) 15),
    SHARED_OBJECT_AMF3((byte) 16),
    COMMAND_AMF3((byte) 17),
    DATA_AMF0((byte) 18),
    SHARED_OBJECT_AMF0((byte) 19),
    COMMAND_AMF0((byte) 20),
    AGGREGATE((byte) 22);


    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ ml.a f48949r = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f48950a;

    f(byte b10) {
        this.f48950a = b10;
    }

    public static ml.a g() {
        return f48949r;
    }

    public final byte h() {
        return this.f48950a;
    }
}
