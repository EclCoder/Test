package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class w extends h0.f.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f46171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f46173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f46174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f46175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f46176f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f46177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f46179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f46180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f46181e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f46182f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f46183g;

        b() {
        }

        @Override // md.h0.f.d.c.a
        public h0.f.d.c a() {
            if (this.f46183g == 31) {
                return new w(this.f46177a, this.f46178b, this.f46179c, this.f46180d, this.f46181e, this.f46182f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f46183g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f46183g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f46183g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f46183g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f46183g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.c.a
        public h0.f.d.c.a b(Double d10) {
            this.f46177a = d10;
            return this;
        }

        @Override // md.h0.f.d.c.a
        public h0.f.d.c.a c(int i10) {
            this.f46178b = i10;
            this.f46183g = (byte) (this.f46183g | 1);
            return this;
        }

        @Override // md.h0.f.d.c.a
        public h0.f.d.c.a d(long j10) {
            this.f46182f = j10;
            this.f46183g = (byte) (this.f46183g | 16);
            return this;
        }

        @Override // md.h0.f.d.c.a
        public h0.f.d.c.a e(int i10) {
            this.f46180d = i10;
            this.f46183g = (byte) (this.f46183g | 4);
            return this;
        }

        @Override // md.h0.f.d.c.a
        public h0.f.d.c.a f(boolean z10) {
            this.f46179c = z10;
            this.f46183g = (byte) (this.f46183g | 2);
            return this;
        }

        @Override // md.h0.f.d.c.a
        public h0.f.d.c.a g(long j10) {
            this.f46181e = j10;
            this.f46183g = (byte) (this.f46183g | 8);
            return this;
        }
    }

    @Override // md.h0.f.d.c
    public Double b() {
        return this.f46171a;
    }

    @Override // md.h0.f.d.c
    public int c() {
        return this.f46172b;
    }

    @Override // md.h0.f.d.c
    public long d() {
        return this.f46176f;
    }

    @Override // md.h0.f.d.c
    public int e() {
        return this.f46174d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.c) {
            h0.f.d.c cVar = (h0.f.d.c) obj;
            Double d10 = this.f46171a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f46172b == cVar.c() && this.f46173c == cVar.g() && this.f46174d == cVar.e() && this.f46175e == cVar.f() && this.f46176f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // md.h0.f.d.c
    public long f() {
        return this.f46175e;
    }

    @Override // md.h0.f.d.c
    public boolean g() {
        return this.f46173c;
    }

    public int hashCode() {
        Double d10 = this.f46171a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f46172b) * 1000003) ^ (this.f46173c ? 1231 : 1237)) * 1000003) ^ this.f46174d) * 1000003;
        long j10 = this.f46175e;
        long j11 = this.f46176f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f46171a + ", batteryVelocity=" + this.f46172b + ", proximityOn=" + this.f46173c + ", orientation=" + this.f46174d + ", ramUsed=" + this.f46175e + ", diskUsed=" + this.f46176f + "}";
    }

    private w(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f46171a = d10;
        this.f46172b = i10;
        this.f46173c = z10;
        this.f46174d = i11;
        this.f46175e = j10;
        this.f46176f = j11;
    }
}
