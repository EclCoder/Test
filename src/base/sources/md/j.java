package md;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class j extends h0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f46023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f46025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f46026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h0.f.a f46027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0.f.AbstractC0709f f46028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h0.f.e f46029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h0.f.c f46030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f46031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f46032l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f46035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f46036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f46037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f46038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private h0.f.a f46039g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private h0.f.AbstractC0709f f46040h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h0.f.e f46041i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h0.f.c f46042j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f46043k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f46044l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f46045m;

        @Override // md.h0.f.b
        public h0.f a() {
            String str;
            String str2;
            h0.f.a aVar;
            if (this.f46045m == 7 && (str = this.f46033a) != null && (str2 = this.f46034b) != null && (aVar = this.f46039g) != null) {
                return new j(str, str2, this.f46035c, this.f46036d, this.f46037e, this.f46038f, aVar, this.f46040h, this.f46041i, this.f46042j, this.f46043k, this.f46044l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46033a == null) {
                sb2.append(" generator");
            }
            if (this.f46034b == null) {
                sb2.append(" identifier");
            }
            if ((this.f46045m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f46045m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f46039g == null) {
                sb2.append(" app");
            }
            if ((this.f46045m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.b
        public h0.f.b b(h0.f.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f46039g = aVar;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b c(String str) {
            this.f46035c = str;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b d(boolean z10) {
            this.f46038f = z10;
            this.f46045m = (byte) (this.f46045m | 2);
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b e(h0.f.c cVar) {
            this.f46042j = cVar;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b f(Long l10) {
            this.f46037e = l10;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b g(List list) {
            this.f46043k = list;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f46033a = str;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b i(int i10) {
            this.f46044l = i10;
            this.f46045m = (byte) (this.f46045m | 4);
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f46034b = str;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b l(h0.f.e eVar) {
            this.f46041i = eVar;
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b m(long j10) {
            this.f46036d = j10;
            this.f46045m = (byte) (this.f46045m | 1);
            return this;
        }

        @Override // md.h0.f.b
        public h0.f.b n(h0.f.AbstractC0709f abstractC0709f) {
            this.f46040h = abstractC0709f;
            return this;
        }

        b() {
        }

        private b(h0.f fVar) {
            this.f46033a = fVar.g();
            this.f46034b = fVar.i();
            this.f46035c = fVar.c();
            this.f46036d = fVar.l();
            this.f46037e = fVar.e();
            this.f46038f = fVar.n();
            this.f46039g = fVar.b();
            this.f46040h = fVar.m();
            this.f46041i = fVar.k();
            this.f46042j = fVar.d();
            this.f46043k = fVar.f();
            this.f46044l = fVar.h();
            this.f46045m = (byte) 7;
        }
    }

    @Override // md.h0.f
    public h0.f.a b() {
        return this.f46027g;
    }

    @Override // md.h0.f
    public String c() {
        return this.f46023c;
    }

    @Override // md.h0.f
    public h0.f.c d() {
        return this.f46030j;
    }

    @Override // md.h0.f
    public Long e() {
        return this.f46025e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        h0.f.AbstractC0709f abstractC0709f;
        h0.f.e eVar;
        h0.f.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f) {
            h0.f fVar = (h0.f) obj;
            if (this.f46021a.equals(fVar.g()) && this.f46022b.equals(fVar.i()) && ((str = this.f46023c) != null ? str.equals(fVar.c()) : fVar.c() == null) && this.f46024d == fVar.l() && ((l10 = this.f46025e) != null ? l10.equals(fVar.e()) : fVar.e() == null) && this.f46026f == fVar.n() && this.f46027g.equals(fVar.b()) && ((abstractC0709f = this.f46028h) != null ? abstractC0709f.equals(fVar.m()) : fVar.m() == null) && ((eVar = this.f46029i) != null ? eVar.equals(fVar.k()) : fVar.k() == null) && ((cVar = this.f46030j) != null ? cVar.equals(fVar.d()) : fVar.d() == null) && ((list = this.f46031k) != null ? list.equals(fVar.f()) : fVar.f() == null) && this.f46032l == fVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0.f
    public List f() {
        return this.f46031k;
    }

    @Override // md.h0.f
    public String g() {
        return this.f46021a;
    }

    @Override // md.h0.f
    public int h() {
        return this.f46032l;
    }

    public int hashCode() {
        int iHashCode = (((this.f46021a.hashCode() ^ 1000003) * 1000003) ^ this.f46022b.hashCode()) * 1000003;
        String str = this.f46023c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f46024d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f46025e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f46026f ? 1231 : 1237)) * 1000003) ^ this.f46027g.hashCode()) * 1000003;
        h0.f.AbstractC0709f abstractC0709f = this.f46028h;
        int iHashCode4 = (iHashCode3 ^ (abstractC0709f == null ? 0 : abstractC0709f.hashCode())) * 1000003;
        h0.f.e eVar = this.f46029i;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        h0.f.c cVar = this.f46030j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f46031k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f46032l;
    }

    @Override // md.h0.f
    public String i() {
        return this.f46022b;
    }

    @Override // md.h0.f
    public h0.f.e k() {
        return this.f46029i;
    }

    @Override // md.h0.f
    public long l() {
        return this.f46024d;
    }

    @Override // md.h0.f
    public h0.f.AbstractC0709f m() {
        return this.f46028h;
    }

    @Override // md.h0.f
    public boolean n() {
        return this.f46026f;
    }

    @Override // md.h0.f
    public h0.f.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f46021a + ", identifier=" + this.f46022b + ", appQualitySessionId=" + this.f46023c + ", startedAt=" + this.f46024d + ", endedAt=" + this.f46025e + ", crashed=" + this.f46026f + ", app=" + this.f46027g + ", user=" + this.f46028h + ", os=" + this.f46029i + ", device=" + this.f46030j + ", events=" + this.f46031k + ", generatorType=" + this.f46032l + "}";
    }

    private j(String str, String str2, String str3, long j10, Long l10, boolean z10, h0.f.a aVar, h0.f.AbstractC0709f abstractC0709f, h0.f.e eVar, h0.f.c cVar, List list, int i10) {
        this.f46021a = str;
        this.f46022b = str2;
        this.f46023c = str3;
        this.f46024d = j10;
        this.f46025e = l10;
        this.f46026f = z10;
        this.f46027g = aVar;
        this.f46028h = abstractC0709f;
        this.f46029i = eVar;
        this.f46030j = cVar;
        this.f46031k = list;
        this.f46032l = i10;
    }
}
