package md;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class r extends h0.f.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f46128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.f.d.a.b.c f46129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46130e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.b.c.AbstractC0700a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f46133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h0.f.d.a.b.c f46134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f46135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f46136f;

        b() {
        }

        @Override // md.h0.f.d.a.b.c.AbstractC0700a
        public h0.f.d.a.b.c a() {
            String str;
            List list;
            if (this.f46136f == 1 && (str = this.f46131a) != null && (list = this.f46133c) != null) {
                return new r(str, this.f46132b, list, this.f46134d, this.f46135e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46131a == null) {
                sb2.append(" type");
            }
            if (this.f46133c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f46136f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.b.c.AbstractC0700a
        public h0.f.d.a.b.c.AbstractC0700a b(h0.f.d.a.b.c cVar) {
            this.f46134d = cVar;
            return this;
        }

        @Override // md.h0.f.d.a.b.c.AbstractC0700a
        public h0.f.d.a.b.c.AbstractC0700a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f46133c = list;
            return this;
        }

        @Override // md.h0.f.d.a.b.c.AbstractC0700a
        public h0.f.d.a.b.c.AbstractC0700a d(int i10) {
            this.f46135e = i10;
            this.f46136f = (byte) (this.f46136f | 1);
            return this;
        }

        @Override // md.h0.f.d.a.b.c.AbstractC0700a
        public h0.f.d.a.b.c.AbstractC0700a e(String str) {
            this.f46132b = str;
            return this;
        }

        @Override // md.h0.f.d.a.b.c.AbstractC0700a
        public h0.f.d.a.b.c.AbstractC0700a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f46131a = str;
            return this;
        }
    }

    @Override // md.h0.f.d.a.b.c
    public h0.f.d.a.b.c b() {
        return this.f46129d;
    }

    @Override // md.h0.f.d.a.b.c
    public List c() {
        return this.f46128c;
    }

    @Override // md.h0.f.d.a.b.c
    public int d() {
        return this.f46130e;
    }

    @Override // md.h0.f.d.a.b.c
    public String e() {
        return this.f46127b;
    }

    public boolean equals(Object obj) {
        String str;
        h0.f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a.b.c) {
            h0.f.d.a.b.c cVar2 = (h0.f.d.a.b.c) obj;
            if (this.f46126a.equals(cVar2.f()) && ((str = this.f46127b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f46128c.equals(cVar2.c()) && ((cVar = this.f46129d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f46130e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0.f.d.a.b.c
    public String f() {
        return this.f46126a;
    }

    public int hashCode() {
        int iHashCode = (this.f46126a.hashCode() ^ 1000003) * 1000003;
        String str = this.f46127b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f46128c.hashCode()) * 1000003;
        h0.f.d.a.b.c cVar = this.f46129d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f46130e;
    }

    public String toString() {
        return "Exception{type=" + this.f46126a + ", reason=" + this.f46127b + ", frames=" + this.f46128c + ", causedBy=" + this.f46129d + ", overflowCount=" + this.f46130e + "}";
    }

    private r(String str, String str2, List list, h0.f.d.a.b.c cVar, int i10) {
        this.f46126a = str;
        this.f46127b = str2;
        this.f46128c = list;
        this.f46129d = cVar;
        this.f46130e = i10;
    }
}
