package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x extends h0.f.d.AbstractC0707d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46184a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.AbstractC0707d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46185a;

        b() {
        }

        @Override // md.h0.f.d.AbstractC0707d.a
        public h0.f.d.AbstractC0707d a() {
            String str = this.f46185a;
            if (str != null) {
                return new x(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // md.h0.f.d.AbstractC0707d.a
        public h0.f.d.AbstractC0707d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f46185a = str;
            return this;
        }
    }

    @Override // md.h0.f.d.AbstractC0707d
    public String b() {
        return this.f46184a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.AbstractC0707d) {
            return this.f46184a.equals(((h0.f.d.AbstractC0707d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f46184a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f46184a + "}";
    }

    private x(String str) {
        this.f46184a = str;
    }
}
