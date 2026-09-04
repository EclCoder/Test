package p9;

import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f49781b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f49782a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f49783b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f49784a;

        public a(LogSessionId logSessionId) {
            this.f49784a = logSessionId;
        }
    }

    static {
        f49781b = ob.r0.f48425a < 31 ? new s1() : new s1(a.f49783b);
    }

    public s1() {
        this((a) null);
        ob.a.g(ob.r0.f48425a < 31);
    }

    public LogSessionId a() {
        return ((a) ob.a.e(this.f49782a)).f49784a;
    }

    public s1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private s1(a aVar) {
        this.f49782a = aVar;
    }
}
