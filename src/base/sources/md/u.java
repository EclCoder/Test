package md;

import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class u extends h0.f.d.a.b.e.AbstractC0704b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46155e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f46156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f46159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f46160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f46161f;

        b() {
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a
        public h0.f.d.a.b.e.AbstractC0704b a() {
            String str;
            if (this.f46161f == 7 && (str = this.f46157b) != null) {
                return new u(this.f46156a, str, this.f46158c, this.f46159d, this.f46160e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f46161f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f46157b == null) {
                sb2.append(" symbol");
            }
            if ((this.f46161f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f46161f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a
        public h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a b(String str) {
            this.f46158c = str;
            return this;
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a
        public h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a c(int i10) {
            this.f46160e = i10;
            this.f46161f = (byte) (this.f46161f | 4);
            return this;
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a
        public h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a d(long j10) {
            this.f46159d = j10;
            this.f46161f = (byte) (this.f46161f | 2);
            return this;
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a
        public h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a e(long j10) {
            this.f46156a = j10;
            this.f46161f = (byte) (this.f46161f | 1);
            return this;
        }

        @Override // md.h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a
        public h0.f.d.a.b.e.AbstractC0704b.AbstractC0705a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f46157b = str;
            return this;
        }
    }

    @Override // md.h0.f.d.a.b.e.AbstractC0704b
    public String b() {
        return this.f46153c;
    }

    @Override // md.h0.f.d.a.b.e.AbstractC0704b
    public int c() {
        return this.f46155e;
    }

    @Override // md.h0.f.d.a.b.e.AbstractC0704b
    public long d() {
        return this.f46154d;
    }

    @Override // md.h0.f.d.a.b.e.AbstractC0704b
    public long e() {
        return this.f46151a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a.b.e.AbstractC0704b) {
            h0.f.d.a.b.e.AbstractC0704b abstractC0704b = (h0.f.d.a.b.e.AbstractC0704b) obj;
            if (this.f46151a == abstractC0704b.e() && this.f46152b.equals(abstractC0704b.f()) && ((str = this.f46153c) != null ? str.equals(abstractC0704b.b()) : abstractC0704b.b() == null) && this.f46154d == abstractC0704b.d() && this.f46155e == abstractC0704b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0.f.d.a.b.e.AbstractC0704b
    public String f() {
        return this.f46152b;
    }

    public int hashCode() {
        long j10 = this.f46151a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46152b.hashCode()) * 1000003;
        String str = this.f46153c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f46154d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f46155e;
    }

    private u(long j10, String str, String str2, long j11, int i10) {
        this.f46151a = j10;
        this.f46152b = str;
        this.f46153c = str2;
        this.f46154d = j11;
        this.f46155e = i10;
    }

    public String toString() {
        return "Frame{pc=" + this.f46151a + ", symbol=" + this.f46152b + ", file=" + this.f46153c + ", offset=" + this.f46154d + ", importance=" + this.f46155e + qnwOeeQSSWa.aRhKfxbqQpX;
    }
}
