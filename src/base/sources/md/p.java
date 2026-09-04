package md;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class p extends h0.f.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f46105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.f.d.a.b.c f46106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0.a f46107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.e f46108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.f.d.a.b.AbstractC0701d f46109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f46110f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.b.AbstractC0699b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f46111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h0.f.d.a.b.c f46112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h0.a f46113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h0.e f46114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h0.f.d.a.b.AbstractC0701d f46115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f46116f;

        @Override // md.h0.f.d.a.b.AbstractC0699b
        public h0.f.d.a.b a() {
            List list;
            h0.f.d.a.b.AbstractC0701d abstractC0701d = this.f46115e;
            if (abstractC0701d != null && (list = this.f46116f) != null) {
                return new p(this.f46111a, this.f46112b, this.f46113c, this.f46114d, abstractC0701d, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46115e == null) {
                sb2.append(" signal");
            }
            if (this.f46116f == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.b.AbstractC0699b
        public h0.f.d.a.b.AbstractC0699b b(h0.a aVar) {
            this.f46113c = aVar;
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0699b
        public h0.f.d.a.b.AbstractC0699b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f46116f = list;
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0699b
        public h0.f.d.a.b.AbstractC0699b d(h0.f.d.a.b.c cVar) {
            this.f46112b = cVar;
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0699b
        public h0.f.d.a.b.AbstractC0699b e(h0.e eVar) {
            this.f46114d = eVar;
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0699b
        public h0.f.d.a.b.AbstractC0699b f(h0.f.d.a.b.AbstractC0701d abstractC0701d) {
            if (abstractC0701d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f46115e = abstractC0701d;
            return this;
        }

        @Override // md.h0.f.d.a.b.AbstractC0699b
        public h0.f.d.a.b.AbstractC0699b g(List list) {
            this.f46111a = list;
            return this;
        }

        b() {
        }

        private b(h0.f.d.a.b bVar) {
            this.f46111a = bVar.g();
            this.f46112b = bVar.d();
            this.f46113c = bVar.b();
            this.f46114d = bVar.e();
            this.f46115e = bVar.f();
            this.f46116f = bVar.c();
        }
    }

    @Override // md.h0.f.d.a.b
    public h0.a b() {
        return this.f46107c;
    }

    @Override // md.h0.f.d.a.b
    public List c() {
        return this.f46110f;
    }

    @Override // md.h0.f.d.a.b
    public h0.f.d.a.b.c d() {
        return this.f46106b;
    }

    @Override // md.h0.f.d.a.b
    public h0.e e() {
        return this.f46108d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a.b) {
            h0.f.d.a.b bVar = (h0.f.d.a.b) obj;
            List list = this.f46105a;
            if (list != null ? list.equals(bVar.g()) : bVar.g() == null) {
                h0.f.d.a.b.c cVar = this.f46106b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    h0.a aVar = this.f46107c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        h0.e eVar = this.f46108d;
                        if (eVar != null ? eVar.equals(bVar.e()) : bVar.e() == null) {
                            if (this.f46109e.equals(bVar.f()) && this.f46110f.equals(bVar.c())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // md.h0.f.d.a.b
    public h0.f.d.a.b.AbstractC0701d f() {
        return this.f46109e;
    }

    @Override // md.h0.f.d.a.b
    public List g() {
        return this.f46105a;
    }

    @Override // md.h0.f.d.a.b
    public h0.f.d.a.b.AbstractC0699b h() {
        return new b(this);
    }

    public int hashCode() {
        List list = this.f46105a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        h0.f.d.a.b.c cVar = this.f46106b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        h0.a aVar = this.f46107c;
        int iHashCode3 = (iHashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        h0.e eVar = this.f46108d;
        return ((((iHashCode3 ^ (eVar != null ? eVar.hashCode() : 0)) * 1000003) ^ this.f46109e.hashCode()) * 1000003) ^ this.f46110f.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f46105a + ", exception=" + this.f46106b + ", appExitInfo=" + this.f46107c + ", profilingManagerInfo=" + this.f46108d + ", signal=" + this.f46109e + ", binaries=" + this.f46110f + "}";
    }

    private p(List list, h0.f.d.a.b.c cVar, h0.a aVar, h0.e eVar, h0.f.d.a.b.AbstractC0701d abstractC0701d, List list2) {
        this.f46105a = list;
        this.f46106b = cVar;
        this.f46107c = aVar;
        this.f46108d = eVar;
        this.f46109e = abstractC0701d;
        this.f46110f = list2;
    }
}
