package f9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f38378c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f38380b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f38381a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f38382b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f38381a, this.f38382b);
        }

        public a b(long j10) {
            this.f38381a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f38382b = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum b implements zd.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f38391a;

        b(int i10) {
            this.f38391a = i10;
        }

        @Override // zd.c
        public int getNumber() {
            return this.f38391a;
        }
    }

    c(long j10, b bVar) {
        this.f38379a = j10;
        this.f38380b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f38379a;
    }

    public b b() {
        return this.f38380b;
    }
}
