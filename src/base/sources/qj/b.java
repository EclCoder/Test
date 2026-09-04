package qj;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public enum b {
    STREAM_BEGIN((byte) 0),
    STREAM_EOF((byte) 1),
    STREAM_DRY((byte) 2),
    SET_BUFFER_LENGTH((byte) 3),
    STREAM_IS_RECORDED((byte) 4),
    PING_REQUEST((byte) 6),
    PONG_REPLY((byte) 7),
    BUFFER_EMPTY((byte) 31),
    BUFFER_READY((byte) 32);


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ ml.a f50874l = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f50875a;

    b(byte b10) {
        this.f50875a = b10;
    }

    public static ml.a g() {
        return f50874l;
    }

    public final byte h() {
        return this.f50875a;
    }
}
