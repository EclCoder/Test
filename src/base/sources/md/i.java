package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i extends h0.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46018a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte f46020b;

        b() {
        }

        @Override // md.h0.e.b.a
        public h0.e.b a() {
            if (this.f46020b == 1) {
                return new i(this.f46019a);
            }
            throw new IllegalStateException("Missing required properties: trigger");
        }

        @Override // md.h0.e.b.a
        public h0.e.b.a b(int i10) {
            this.f46019a = i10;
            this.f46020b = (byte) (this.f46020b | 1);
            return this;
        }
    }

    @Override // md.h0.e.b
    public int b() {
        return this.f46018a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof h0.e.b) && this.f46018a == ((h0.e.b) obj).b();
    }

    public int hashCode() {
        return 1000003 ^ this.f46018a;
    }

    public String toString() {
        return "ProfilingTrigger{trigger=" + this.f46018a + "}";
    }

    private i(int i10) {
        this.f46018a = i10;
    }
}
