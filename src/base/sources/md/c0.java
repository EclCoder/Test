package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c0 extends h0.f.AbstractC0709f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45974a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.AbstractC0709f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f45975a;

        b() {
        }

        @Override // md.h0.f.AbstractC0709f.a
        public h0.f.AbstractC0709f a() {
            String str = this.f45975a;
            if (str != null) {
                return new c0(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // md.h0.f.AbstractC0709f.a
        public h0.f.AbstractC0709f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f45975a = str;
            return this;
        }
    }

    @Override // md.h0.f.AbstractC0709f
    public String b() {
        return this.f45974a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.AbstractC0709f) {
            return this.f45974a.equals(((h0.f.AbstractC0709f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f45974a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f45974a + "}";
    }

    private c0(String str) {
        this.f45974a = str;
    }
}
