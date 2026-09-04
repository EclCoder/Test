package b9;

import com.android.vending.billing.fTvD.qEagQqzJZsd;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f8593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f8594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f8596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f8597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f8598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f8599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f8600i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f8601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f8602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f8603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f8604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f8605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f8606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f8607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f8608h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private q f8609i;

        b() {
        }

        @Override // b9.t.a
        public t a() {
            String str = "";
            if (this.f8601a == null) {
                str = " eventTimeMs";
            }
            if (this.f8604d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f8607g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f8601a.longValue(), this.f8602b, this.f8603c, this.f8604d.longValue(), this.f8605e, this.f8606f, this.f8607g.longValue(), this.f8608h, this.f8609i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // b9.t.a
        public t.a b(p pVar) {
            this.f8603c = pVar;
            return this;
        }

        @Override // b9.t.a
        public t.a c(Integer num) {
            this.f8602b = num;
            return this;
        }

        @Override // b9.t.a
        public t.a d(long j10) {
            this.f8601a = Long.valueOf(j10);
            return this;
        }

        @Override // b9.t.a
        public t.a e(long j10) {
            this.f8604d = Long.valueOf(j10);
            return this;
        }

        @Override // b9.t.a
        public t.a f(q qVar) {
            this.f8609i = qVar;
            return this;
        }

        @Override // b9.t.a
        public t.a g(w wVar) {
            this.f8608h = wVar;
            return this;
        }

        @Override // b9.t.a
        t.a h(byte[] bArr) {
            this.f8605e = bArr;
            return this;
        }

        @Override // b9.t.a
        t.a i(String str) {
            this.f8606f = str;
            return this;
        }

        @Override // b9.t.a
        public t.a j(long j10) {
            this.f8607g = Long.valueOf(j10);
            return this;
        }
    }

    @Override // b9.t
    public p b() {
        return this.f8594c;
    }

    @Override // b9.t
    public Integer c() {
        return this.f8593b;
    }

    @Override // b9.t
    public long d() {
        return this.f8592a;
    }

    @Override // b9.t
    public long e() {
        return this.f8595d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f8592a == tVar.d() && ((num = this.f8593b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f8594c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f8595d == tVar.e()) {
                if (Arrays.equals(this.f8596e, tVar instanceof j ? ((j) tVar).f8596e : tVar.h()) && ((str = this.f8597f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f8598g == tVar.j() && ((wVar = this.f8599h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f8600i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b9.t
    public q f() {
        return this.f8600i;
    }

    @Override // b9.t
    public w g() {
        return this.f8599h;
    }

    @Override // b9.t
    public byte[] h() {
        return this.f8596e;
    }

    public int hashCode() {
        long j10 = this.f8592a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f8593b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f8594c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f8595d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f8596e)) * 1000003;
        String str = this.f8597f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f8598g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f8599h;
        int iHashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f8600i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // b9.t
    public String i() {
        return this.f8597f;
    }

    @Override // b9.t
    public long j() {
        return this.f8598g;
    }

    private j(long j10, Integer num, p pVar, long j11, byte[] bArr, String str, long j12, w wVar, q qVar) {
        this.f8592a = j10;
        this.f8593b = num;
        this.f8594c = pVar;
        this.f8595d = j11;
        this.f8596e = bArr;
        this.f8597f = str;
        this.f8598g = j12;
        this.f8599h = wVar;
        this.f8600i = qVar;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f8592a + ", eventCode=" + this.f8593b + qEagQqzJZsd.XToNtbVnspIN + this.f8594c + ", eventUptimeMs=" + this.f8595d + ", sourceExtension=" + Arrays.toString(this.f8596e) + ", sourceExtensionJsonProto3=" + this.f8597f + ", timezoneOffsetSeconds=" + this.f8598g + ", networkConnectionInfo=" + this.f8599h + ", experimentIds=" + this.f8600i + "}";
    }
}
