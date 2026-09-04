package b9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.c f8625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w.b f8626b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w.c f8627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w.b f8628b;

        b() {
        }

        @Override // b9.w.a
        public w a() {
            return new m(this.f8627a, this.f8628b);
        }

        @Override // b9.w.a
        public w.a b(w.b bVar) {
            this.f8628b = bVar;
            return this;
        }

        @Override // b9.w.a
        public w.a c(w.c cVar) {
            this.f8627a = cVar;
            return this;
        }
    }

    @Override // b9.w
    public w.b b() {
        return this.f8626b;
    }

    @Override // b9.w
    public w.c c() {
        return this.f8625a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f8625a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f8626b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f8625a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f8626b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f8625a + ", mobileSubtype=" + this.f8626b + "}";
    }

    private m(w.c cVar, w.b bVar) {
        this.f8625a = cVar;
        this.f8626b = bVar;
    }
}
