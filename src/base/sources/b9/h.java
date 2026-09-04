package b9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f8588a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f8589a;

        b() {
        }

        @Override // b9.r.a
        public r a() {
            return new h(this.f8589a);
        }

        @Override // b9.r.a
        public r.a b(Integer num) {
            this.f8589a = num;
            return this;
        }
    }

    @Override // b9.r
    public Integer b() {
        return this.f8588a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f8588a;
        Integer numB = ((r) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f8588a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f8588a + "}";
    }

    private h(Integer num) {
        this.f8588a = num;
    }
}
