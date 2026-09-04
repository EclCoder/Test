package c9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f9634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a9.c f9636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a9.g f9637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a9.b f9638e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p f9639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a9.c f9641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a9.g f9642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a9.b f9643e;

        b() {
        }

        @Override // c9.o.a
        public o a() {
            String str = "";
            if (this.f9639a == null) {
                str = " transportContext";
            }
            if (this.f9640b == null) {
                str = str + " transportName";
            }
            if (this.f9641c == null) {
                str = str + " event";
            }
            if (this.f9642d == null) {
                str = str + " transformer";
            }
            if (this.f9643e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f9639a, this.f9640b, this.f9641c, this.f9642d, this.f9643e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c9.o.a
        o.a b(a9.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f9643e = bVar;
            return this;
        }

        @Override // c9.o.a
        o.a c(a9.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f9641c = cVar;
            return this;
        }

        @Override // c9.o.a
        o.a d(a9.g gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f9642d = gVar;
            return this;
        }

        @Override // c9.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f9639a = pVar;
            return this;
        }

        @Override // c9.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f9640b = str;
            return this;
        }
    }

    @Override // c9.o
    public a9.b b() {
        return this.f9638e;
    }

    @Override // c9.o
    a9.c c() {
        return this.f9636c;
    }

    @Override // c9.o
    a9.g e() {
        return this.f9637d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f9634a.equals(oVar.f()) && this.f9635b.equals(oVar.g()) && this.f9636c.equals(oVar.c()) && this.f9637d.equals(oVar.e()) && this.f9638e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // c9.o
    public p f() {
        return this.f9634a;
    }

    @Override // c9.o
    public String g() {
        return this.f9635b;
    }

    public int hashCode() {
        return ((((((((this.f9634a.hashCode() ^ 1000003) * 1000003) ^ this.f9635b.hashCode()) * 1000003) ^ this.f9636c.hashCode()) * 1000003) ^ this.f9637d.hashCode()) * 1000003) ^ this.f9638e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f9634a + ", transportName=" + this.f9635b + ", event=" + this.f9636c + ", transformer=" + this.f9637d + ", encoding=" + this.f9638e + "}";
    }

    private c(p pVar, String str, a9.c cVar, a9.g gVar, a9.b bVar) {
        this.f9634a = pVar;
        this.f9635b = str;
        this.f9636c = cVar;
        this.f9637d = gVar;
        this.f9638e = bVar;
    }
}
