package kk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class d extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.b f43436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f43439d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b f43440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f43441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f43442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f43443d;

        b() {
        }

        @Override // kk.k.a
        public k a() {
            String str = "";
            if (this.f43440a == null) {
                str = " type";
            }
            if (this.f43441b == null) {
                str = str + " messageId";
            }
            if (this.f43442c == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.f43443d == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new d(this.f43440a, this.f43441b.longValue(), this.f43442c.longValue(), this.f43443d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // kk.k.a
        public k.a b(long j10) {
            this.f43443d = Long.valueOf(j10);
            return this;
        }

        @Override // kk.k.a
        k.a c(long j10) {
            this.f43441b = Long.valueOf(j10);
            return this;
        }

        @Override // kk.k.a
        public k.a d(long j10) {
            this.f43442c = Long.valueOf(j10);
            return this;
        }

        k.a e(k.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null type");
            }
            this.f43440a = bVar;
            return this;
        }
    }

    @Override // kk.k
    public long b() {
        return this.f43439d;
    }

    @Override // kk.k
    public long c() {
        return this.f43437b;
    }

    @Override // kk.k
    public k.b d() {
        return this.f43436a;
    }

    @Override // kk.k
    public long e() {
        return this.f43438c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f43436a.equals(kVar.d()) && this.f43437b == kVar.c() && this.f43438c == kVar.e() && this.f43439d == kVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jHashCode = (this.f43436a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f43437b;
        long j11 = ((int) (jHashCode ^ (j10 ^ (j10 >>> 32)))) * 1000003;
        long j12 = this.f43438c;
        long j13 = this.f43439d;
        return (int) (((long) (((int) (j11 ^ (j12 ^ (j12 >>> 32)))) * 1000003)) ^ (j13 ^ (j13 >>> 32)));
    }

    public String toString() {
        return "MessageEvent{type=" + this.f43436a + ", messageId=" + this.f43437b + ", uncompressedMessageSize=" + this.f43438c + ", compressedMessageSize=" + this.f43439d + "}";
    }

    private d(k.b bVar, long j10, long j11, long j12) {
        this.f43436a = bVar;
        this.f43437b = j10;
        this.f43438c = j11;
        this.f43439d = j12;
    }
}
