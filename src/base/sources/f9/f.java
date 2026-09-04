package f9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f38402c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38404b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f38405a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f38406b = 0;

        a() {
        }

        public f a() {
            return new f(this.f38405a, this.f38406b);
        }

        public a b(long j10) {
            this.f38406b = j10;
            return this;
        }

        public a c(long j10) {
            this.f38405a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f38403a = j10;
        this.f38404b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f38404b;
    }

    public long b() {
        return this.f38403a;
    }
}
