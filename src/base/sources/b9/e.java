package b9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.b f8576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b9.a f8577b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.b f8578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b9.a f8579b;

        b() {
        }

        @Override // b9.o.a
        public o a() {
            return new e(this.f8578a, this.f8579b);
        }

        @Override // b9.o.a
        public o.a b(b9.a aVar) {
            this.f8579b = aVar;
            return this;
        }

        @Override // b9.o.a
        public o.a c(o.b bVar) {
            this.f8578a = bVar;
            return this;
        }
    }

    @Override // b9.o
    public b9.a b() {
        return this.f8577b;
    }

    @Override // b9.o
    public o.b c() {
        return this.f8576a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f8576a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                b9.a aVar = this.f8577b;
                if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f8576a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        b9.a aVar = this.f8577b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f8576a + ", androidClientInfo=" + this.f8577b + "}";
    }

    private e(o.b bVar, b9.a aVar) {
        this.f8576a = bVar;
        this.f8577b = aVar;
    }
}
