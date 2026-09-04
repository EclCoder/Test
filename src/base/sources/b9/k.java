package b9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f8612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f8613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f8615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f8616g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f8617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f8618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f8619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f8620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f8621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f8622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x f8623g;

        b() {
        }

        @Override // b9.u.a
        public u a() {
            String str = "";
            if (this.f8617a == null) {
                str = " requestTimeMs";
            }
            if (this.f8618b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f8617a.longValue(), this.f8618b.longValue(), this.f8619c, this.f8620d, this.f8621e, this.f8622f, this.f8623g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b9.u.a
        public u.a b(o oVar) {
            this.f8619c = oVar;
            return this;
        }

        @Override // b9.u.a
        public u.a c(List list) {
            this.f8622f = list;
            return this;
        }

        @Override // b9.u.a
        u.a d(Integer num) {
            this.f8620d = num;
            return this;
        }

        @Override // b9.u.a
        u.a e(String str) {
            this.f8621e = str;
            return this;
        }

        @Override // b9.u.a
        public u.a f(x xVar) {
            this.f8623g = xVar;
            return this;
        }

        @Override // b9.u.a
        public u.a g(long j10) {
            this.f8617a = Long.valueOf(j10);
            return this;
        }

        @Override // b9.u.a
        public u.a h(long j10) {
            this.f8618b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b9.u
    public o b() {
        return this.f8612c;
    }

    @Override // b9.u
    public List c() {
        return this.f8615f;
    }

    @Override // b9.u
    public Integer d() {
        return this.f8613d;
    }

    @Override // b9.u
    public String e() {
        return this.f8614e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f8610a == uVar.g() && this.f8611b == uVar.h() && ((oVar = this.f8612c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f8613d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f8614e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f8615f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.f8616g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // b9.u
    public x f() {
        return this.f8616g;
    }

    @Override // b9.u
    public long g() {
        return this.f8610a;
    }

    @Override // b9.u
    public long h() {
        return this.f8611b;
    }

    public int hashCode() {
        long j10 = this.f8610a;
        long j11 = this.f8611b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f8612c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f8613d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f8614e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f8615f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f8616g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f8610a + ", requestUptimeMs=" + this.f8611b + ", clientInfo=" + this.f8612c + ", logSource=" + this.f8613d + ", logSourceName=" + this.f8614e + ", logEvents=" + this.f8615f + ", qosTier=" + this.f8616g + "}";
    }

    private k(long j10, long j11, o oVar, Integer num, String str, List list, x xVar) {
        this.f8610a = j10;
        this.f8611b = j11;
        this.f8612c = oVar;
        this.f8613d = num;
        this.f8614e = str;
        this.f8615f = list;
        this.f8616g = xVar;
    }
}
