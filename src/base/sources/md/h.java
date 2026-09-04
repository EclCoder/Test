package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h extends h0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.e.b f46015a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h0.e.b f46016a;

        b() {
        }

        @Override // md.h0.e.a
        public h0.e a() {
            h0.e.b bVar = this.f46016a;
            if (bVar != null) {
                return new h(bVar);
            }
            throw new IllegalStateException("Missing required properties: profilingTrigger");
        }

        @Override // md.h0.e.a
        public h0.e.a b(h0.e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null profilingTrigger");
            }
            this.f46016a = bVar;
            return this;
        }
    }

    @Override // md.h0.e
    public h0.e.b b() {
        return this.f46015a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.e) {
            return this.f46015a.equals(((h0.e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f46015a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ProfilingManagerInfo{profilingTrigger=" + this.f46015a + "}";
    }

    private h(h0.e.b bVar) {
        this.f46015a = bVar;
    }
}
