package k9;

import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f43017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f43018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f43019f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f43020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f43021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f43022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f43023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f43024e;

        b() {
        }

        @Override // k9.e.a
        e.a b(int i10) {
            this.f43022c = Integer.valueOf(i10);
            return this;
        }

        @Override // k9.e.a
        e.a c(long j10) {
            this.f43023d = Long.valueOf(j10);
            return this;
        }

        @Override // k9.e.a
        e.a d(int i10) {
            this.f43021b = Integer.valueOf(i10);
            return this;
        }

        @Override // k9.e.a
        e.a e(int i10) {
            this.f43024e = Integer.valueOf(i10);
            return this;
        }

        @Override // k9.e.a
        e.a f(long j10) {
            this.f43020a = Long.valueOf(j10);
            return this;
        }

        @Override // k9.e.a
        e a() {
            String str = "";
            if (this.f43020a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f43021b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f43022c == null) {
                str = str + OGoz.mIKjv;
            }
            if (this.f43023d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f43024e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f43020a.longValue(), this.f43021b.intValue(), this.f43022c.intValue(), this.f43023d.longValue(), this.f43024e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    @Override // k9.e
    int b() {
        return this.f43017d;
    }

    @Override // k9.e
    long c() {
        return this.f43018e;
    }

    @Override // k9.e
    int d() {
        return this.f43016c;
    }

    @Override // k9.e
    int e() {
        return this.f43019f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f43015b == eVar.f() && this.f43016c == eVar.d() && this.f43017d == eVar.b() && this.f43018e == eVar.c() && this.f43019f == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // k9.e
    long f() {
        return this.f43015b;
    }

    public int hashCode() {
        long j10 = this.f43015b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f43016c) * 1000003) ^ this.f43017d) * 1000003;
        long j11 = this.f43018e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f43019f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f43015b + ", loadBatchSize=" + this.f43016c + ", criticalSectionEnterTimeoutMs=" + this.f43017d + ", eventCleanUpAge=" + this.f43018e + ", maxBlobByteSizePerRow=" + this.f43019f + "}";
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f43015b = j10;
        this.f43016c = i10;
        this.f43017d = i11;
        this.f43018e = j11;
        this.f43019f = i12;
    }
}
