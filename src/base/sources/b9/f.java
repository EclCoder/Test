package b9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f8580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.b f8581b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f8582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p.b f8583b;

        b() {
        }

        @Override // b9.p.a
        public p a() {
            return new f(this.f8582a, this.f8583b);
        }

        @Override // b9.p.a
        public p.a b(s sVar) {
            this.f8582a = sVar;
            return this;
        }

        @Override // b9.p.a
        public p.a c(p.b bVar) {
            this.f8583b = bVar;
            return this;
        }
    }

    @Override // b9.p
    public s b() {
        return this.f8580a;
    }

    @Override // b9.p
    public p.b c() {
        return this.f8581b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f8580a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f8581b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f8580a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f8581b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f8580a + ", productIdOrigin=" + this.f8581b + "}";
    }

    private f(s sVar, p.b bVar) {
        this.f8580a = sVar;
        this.f8581b = bVar;
    }
}
