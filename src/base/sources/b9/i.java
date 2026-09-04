package b9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f8590a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r f8591a;

        b() {
        }

        @Override // b9.s.a
        public s a() {
            return new i(this.f8591a);
        }

        @Override // b9.s.a
        public s.a b(r rVar) {
            this.f8591a = rVar;
            return this;
        }
    }

    @Override // b9.s
    public r b() {
        return this.f8590a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f8590a;
        r rVarB = ((s) obj).b();
        if (rVar == null) {
            return rVarB == null;
        }
        return rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f8590a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f8590a + "}";
    }

    private i(r rVar) {
        this.f8590a = rVar;
    }
}
