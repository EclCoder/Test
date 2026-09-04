package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m extends h0.f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f46062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f46063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f46064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f46065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f46066i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f46067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f46068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f46070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f46071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f46072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f46073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f46074h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f46075i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f46076j;

        b() {
        }

        @Override // md.h0.f.c.a
        public h0.f.c a() {
            String str;
            String str2;
            String str3;
            if (this.f46076j == 63 && (str = this.f46068b) != null && (str2 = this.f46074h) != null && (str3 = this.f46075i) != null) {
                return new m(this.f46067a, str, this.f46069c, this.f46070d, this.f46071e, this.f46072f, this.f46073g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f46076j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f46068b == null) {
                sb2.append(" model");
            }
            if ((this.f46076j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f46076j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f46076j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f46076j & 16) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f46076j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f46074h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f46075i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a b(int i10) {
            this.f46067a = i10;
            this.f46076j = (byte) (this.f46076j | 1);
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a c(int i10) {
            this.f46069c = i10;
            this.f46076j = (byte) (this.f46076j | 2);
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a d(long j10) {
            this.f46071e = j10;
            this.f46076j = (byte) (this.f46076j | 8);
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f46074h = str;
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f46068b = str;
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f46075i = str;
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a h(long j10) {
            this.f46070d = j10;
            this.f46076j = (byte) (this.f46076j | 4);
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a i(boolean z10) {
            this.f46072f = z10;
            this.f46076j = (byte) (this.f46076j | 16);
            return this;
        }

        @Override // md.h0.f.c.a
        public h0.f.c.a j(int i10) {
            this.f46073g = i10;
            this.f46076j = (byte) (this.f46076j | 32);
            return this;
        }
    }

    @Override // md.h0.f.c
    public int b() {
        return this.f46058a;
    }

    @Override // md.h0.f.c
    public int c() {
        return this.f46060c;
    }

    @Override // md.h0.f.c
    public long d() {
        return this.f46062e;
    }

    @Override // md.h0.f.c
    public String e() {
        return this.f46065h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.c) {
            h0.f.c cVar = (h0.f.c) obj;
            if (this.f46058a == cVar.b() && this.f46059b.equals(cVar.f()) && this.f46060c == cVar.c() && this.f46061d == cVar.h() && this.f46062e == cVar.d() && this.f46063f == cVar.j() && this.f46064g == cVar.i() && this.f46065h.equals(cVar.e()) && this.f46066i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0.f.c
    public String f() {
        return this.f46059b;
    }

    @Override // md.h0.f.c
    public String g() {
        return this.f46066i;
    }

    @Override // md.h0.f.c
    public long h() {
        return this.f46061d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f46058a ^ 1000003) * 1000003) ^ this.f46059b.hashCode()) * 1000003) ^ this.f46060c) * 1000003;
        long j10 = this.f46061d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f46062e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f46063f ? 1231 : 1237)) * 1000003) ^ this.f46064g) * 1000003) ^ this.f46065h.hashCode()) * 1000003) ^ this.f46066i.hashCode();
    }

    @Override // md.h0.f.c
    public int i() {
        return this.f46064g;
    }

    @Override // md.h0.f.c
    public boolean j() {
        return this.f46063f;
    }

    public String toString() {
        return "Device{arch=" + this.f46058a + ", model=" + this.f46059b + ", cores=" + this.f46060c + ", ram=" + this.f46061d + ", diskSpace=" + this.f46062e + ", simulator=" + this.f46063f + ", state=" + this.f46064g + ", manufacturer=" + this.f46065h + ", modelClass=" + this.f46066i + "}";
    }

    private m(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f46058a = i10;
        this.f46059b = str;
        this.f46060c = i11;
        this.f46061d = j10;
        this.f46062e = j11;
        this.f46063f = z10;
        this.f46064g = i12;
        this.f46065h = str2;
        this.f46066i = str3;
    }
}
