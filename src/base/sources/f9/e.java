package f9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f38397c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38399b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f38400a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f38401b = 0;

        a() {
        }

        public e a() {
            return new e(this.f38400a, this.f38401b);
        }

        public a b(long j10) {
            this.f38400a = j10;
            return this;
        }

        public a c(long j10) {
            this.f38401b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f38398a = j10;
        this.f38399b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f38398a;
    }

    public long b() {
        return this.f38399b;
    }
}
