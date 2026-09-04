package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class v extends h0.f.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f46165d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.d.a.c.AbstractC0706a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f46166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46168c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f46169d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f46170e;

        b() {
        }

        @Override // md.h0.f.d.a.c.AbstractC0706a
        public h0.f.d.a.c a() {
            String str;
            if (this.f46170e == 7 && (str = this.f46166a) != null) {
                return new v(str, this.f46167b, this.f46168c, this.f46169d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f46166a == null) {
                sb2.append(" processName");
            }
            if ((this.f46170e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f46170e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f46170e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // md.h0.f.d.a.c.AbstractC0706a
        public h0.f.d.a.c.AbstractC0706a b(boolean z10) {
            this.f46169d = z10;
            this.f46170e = (byte) (this.f46170e | 4);
            return this;
        }

        @Override // md.h0.f.d.a.c.AbstractC0706a
        public h0.f.d.a.c.AbstractC0706a c(int i10) {
            this.f46168c = i10;
            this.f46170e = (byte) (this.f46170e | 2);
            return this;
        }

        @Override // md.h0.f.d.a.c.AbstractC0706a
        public h0.f.d.a.c.AbstractC0706a d(int i10) {
            this.f46167b = i10;
            this.f46170e = (byte) (this.f46170e | 1);
            return this;
        }

        @Override // md.h0.f.d.a.c.AbstractC0706a
        public h0.f.d.a.c.AbstractC0706a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f46166a = str;
            return this;
        }
    }

    @Override // md.h0.f.d.a.c
    public int b() {
        return this.f46164c;
    }

    @Override // md.h0.f.d.a.c
    public int c() {
        return this.f46163b;
    }

    @Override // md.h0.f.d.a.c
    public String d() {
        return this.f46162a;
    }

    @Override // md.h0.f.d.a.c
    public boolean e() {
        return this.f46165d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.d.a.c) {
            h0.f.d.a.c cVar = (h0.f.d.a.c) obj;
            if (this.f46162a.equals(cVar.d()) && this.f46163b == cVar.c() && this.f46164c == cVar.b() && this.f46165d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f46162a.hashCode() ^ 1000003) * 1000003) ^ this.f46163b) * 1000003) ^ this.f46164c) * 1000003) ^ (this.f46165d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f46162a + ", pid=" + this.f46163b + ", importance=" + this.f46164c + ", defaultProcess=" + this.f46165d + "}";
    }

    private v(String str, int i10, int i11, boolean z10) {
        this.f46162a = str;
        this.f46163b = i10;
        this.f46164c = i11;
        this.f46165d = z10;
    }
}
