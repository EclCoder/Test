package on;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49018a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ ml.a f49017r = ml.b.a(d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0760a f49001b = new C0760a(null);

    /* JADX INFO: renamed from: on.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0760a {
        public /* synthetic */ C0760a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i10) {
            for (a aVar : a.values()) {
                if (aVar.g() == i10) {
                    return aVar;
                }
            }
            return null;
        }

        private C0760a() {
        }
    }

    a(int i10) {
        this.f49018a = i10;
    }

    public final int g() {
        return this.f49018a;
    }
}
