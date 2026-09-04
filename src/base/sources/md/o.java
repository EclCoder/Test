package md;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class o extends h0.f.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.f.d.a.b f46090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f46092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f46093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.f.d.a.c f46094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f46095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f46096g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.AbstractC0696a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h0.f.d.a.b f46097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f46098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f46099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f46100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h0.f.d.a.c f46101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f46102f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f46103g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f46104h;

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a a() {
            h0.f.d.a.b bVar;
            if (this.f46104h == 1 && (bVar = this.f46097a) != null) {
                return new o(bVar, this.f46098b, this.f46099c, this.f46100d, this.f46101e, this.f46102f, this.f46103g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46097a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f46104h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a.AbstractC0696a b(List list) {
            this.f46102f = list;
            return this;
        }

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a.AbstractC0696a c(Boolean bool) {
            this.f46100d = bool;
            return this;
        }

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a.AbstractC0696a d(h0.f.d.a.c cVar) {
            this.f46101e = cVar;
            return this;
        }

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a.AbstractC0696a e(List list) {
            this.f46098b = list;
            return this;
        }

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a.AbstractC0696a f(h0.f.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f46097a = bVar;
            return this;
        }

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a.AbstractC0696a g(List list) {
            this.f46099c = list;
            return this;
        }

        @Override // md.h0.f.d.a.AbstractC0696a
        public h0.f.d.a.AbstractC0696a h(int i10) {
            this.f46103g = i10;
            this.f46104h = (byte) (this.f46104h | 1);
            return this;
        }

        b() {
        }

        private b(h0.f.d.a aVar) {
            this.f46097a = aVar.f();
            this.f46098b = aVar.e();
            this.f46099c = aVar.g();
            this.f46100d = aVar.c();
            this.f46101e = aVar.d();
            this.f46102f = aVar.b();
            this.f46103g = aVar.h();
            this.f46104h = (byte) 1;
        }
    }

    @Override // md.h0.f.d.a
    public List b() {
        return this.f46095f;
    }

    @Override // md.h0.f.d.a
    public Boolean c() {
        return this.f46093d;
    }

    @Override // md.h0.f.d.a
    public h0.f.d.a.c d() {
        return this.f46094e;
    }

    @Override // md.h0.f.d.a
    public List e() {
        return this.f46091b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        h0.f.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a) {
            h0.f.d.a aVar = (h0.f.d.a) obj;
            if (this.f46090a.equals(aVar.f()) && ((list = this.f46091b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f46092c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f46093d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f46094e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f46095f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f46096g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0.f.d.a
    public h0.f.d.a.b f() {
        return this.f46090a;
    }

    @Override // md.h0.f.d.a
    public List g() {
        return this.f46092c;
    }

    @Override // md.h0.f.d.a
    public int h() {
        return this.f46096g;
    }

    public int hashCode() {
        int iHashCode = (this.f46090a.hashCode() ^ 1000003) * 1000003;
        List list = this.f46091b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f46092c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f46093d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        h0.f.d.a.c cVar = this.f46094e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f46095f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f46096g;
    }

    @Override // md.h0.f.d.a
    public h0.f.d.a.AbstractC0696a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f46090a + ", customAttributes=" + this.f46091b + ", internalKeys=" + this.f46092c + ", background=" + this.f46093d + ", currentProcessDetails=" + this.f46094e + ", appProcessDetails=" + this.f46095f + ", uiOrientation=" + this.f46096g + "}";
    }

    private o(h0.f.d.a.b bVar, List list, List list2, Boolean bool, h0.f.d.a.c cVar, List list3, int i10) {
        this.f46090a = bVar;
        this.f46091b = list;
        this.f46092c = list2;
        this.f46093d = bool;
        this.f46094e = cVar;
        this.f46095f = list3;
        this.f46096g = i10;
    }
}
