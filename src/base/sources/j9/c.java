package j9;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f42125c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f42126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f42127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f42128c;

        b() {
        }

        @Override // j9.f.b.a
        public f.b a() {
            String str = "";
            if (this.f42126a == null) {
                str = " delta";
            }
            if (this.f42127b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f42128c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f42126a.longValue(), this.f42127b.longValue(), this.f42128c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j9.f.b.a
        public f.b.a b(long j10) {
            this.f42126a = Long.valueOf(j10);
            return this;
        }

        @Override // j9.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f42128c = set;
            return this;
        }

        @Override // j9.f.b.a
        public f.b.a d(long j10) {
            this.f42127b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j9.f.b
    long b() {
        return this.f42123a;
    }

    @Override // j9.f.b
    Set c() {
        return this.f42125c;
    }

    @Override // j9.f.b
    long d() {
        return this.f42124b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f42123a == bVar.b() && this.f42124b == bVar.d() && this.f42125c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f42123a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f42124b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f42125c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f42123a + ", maxAllowedDelay=" + this.f42124b + ", flags=" + this.f42125c + "}";
    }

    private c(long j10, long j11, Set set) {
        this.f42123a = j10;
        this.f42124b = j11;
        this.f42125c = set;
    }
}
