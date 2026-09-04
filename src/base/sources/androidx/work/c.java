package androidx.work;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f7812i = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m f7813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f7818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f7819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f7820h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f7821a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7822b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        m f7823c = m.NOT_REQUIRED;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7824d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f7825e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f7826f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f7827g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        d f7828h = new d();

        public c a() {
            return new c(this);
        }

        public a b(m mVar) {
            this.f7823c = mVar;
            return this;
        }
    }

    public c() {
        this.f7813a = m.NOT_REQUIRED;
        this.f7818f = -1L;
        this.f7819g = -1L;
        this.f7820h = new d();
    }

    public d a() {
        return this.f7820h;
    }

    public m b() {
        return this.f7813a;
    }

    public long c() {
        return this.f7818f;
    }

    public long d() {
        return this.f7819g;
    }

    public boolean e() {
        return this.f7820h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f7814b == cVar.f7814b && this.f7815c == cVar.f7815c && this.f7816d == cVar.f7816d && this.f7817e == cVar.f7817e && this.f7818f == cVar.f7818f && this.f7819g == cVar.f7819g && this.f7813a == cVar.f7813a) {
            return this.f7820h.equals(cVar.f7820h);
        }
        return false;
    }

    public boolean f() {
        return this.f7816d;
    }

    public boolean g() {
        return this.f7814b;
    }

    public boolean h() {
        return this.f7815c;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f7813a.hashCode() * 31) + (this.f7814b ? 1 : 0)) * 31) + (this.f7815c ? 1 : 0)) * 31) + (this.f7816d ? 1 : 0)) * 31) + (this.f7817e ? 1 : 0)) * 31;
        long j10 = this.f7818f;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f7819g;
        return ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f7820h.hashCode();
    }

    public boolean i() {
        return this.f7817e;
    }

    public void j(d dVar) {
        this.f7820h = dVar;
    }

    public void k(m mVar) {
        this.f7813a = mVar;
    }

    public void l(boolean z10) {
        this.f7816d = z10;
    }

    public void m(boolean z10) {
        this.f7814b = z10;
    }

    public void n(boolean z10) {
        this.f7815c = z10;
    }

    public void o(boolean z10) {
        this.f7817e = z10;
    }

    public void p(long j10) {
        this.f7818f = j10;
    }

    public void q(long j10) {
        this.f7819g = j10;
    }

    c(a aVar) {
        this.f7813a = m.NOT_REQUIRED;
        this.f7818f = -1L;
        this.f7819g = -1L;
        this.f7820h = new d();
        this.f7814b = aVar.f7821a;
        this.f7815c = aVar.f7822b;
        this.f7813a = aVar.f7823c;
        this.f7816d = aVar.f7824d;
        this.f7817e = aVar.f7825e;
        this.f7820h = aVar.f7828h;
        this.f7818f = aVar.f7826f;
        this.f7819g = aVar.f7827g;
    }

    public c(c cVar) {
        this.f7813a = m.NOT_REQUIRED;
        this.f7818f = -1L;
        this.f7819g = -1L;
        this.f7820h = new d();
        this.f7814b = cVar.f7814b;
        this.f7815c = cVar.f7815c;
        this.f7813a = cVar.f7813a;
        this.f7816d = cVar.f7816d;
        this.f7817e = cVar.f7817e;
        this.f7820h = cVar.f7820h;
    }
}
