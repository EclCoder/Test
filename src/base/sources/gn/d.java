package gn;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f39529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f39530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f39531p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f39533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f39536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f39537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f39538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f39539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f39540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f39541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f39542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f39543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f39544m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f39545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f39546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f39547c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f39548d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f39549e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f39550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f39551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f39552h;

        public final d a() {
            return hn.i.a(this);
        }

        public final boolean b() {
            return this.f39552h;
        }

        public final int c() {
            return this.f39547c;
        }

        public final int d() {
            return this.f39548d;
        }

        public final int e() {
            return this.f39549e;
        }

        public final boolean f() {
            return this.f39545a;
        }

        public final boolean g() {
            return this.f39546b;
        }

        public final boolean h() {
            return this.f39551g;
        }

        public final boolean i() {
            return this.f39550f;
        }

        public final a j(long j10) {
            long jO = cm.a.o(j10);
            if (jO >= 0) {
                this.f39548d = hn.i.b(jO);
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + jO).toString());
        }

        public final a k() {
            return hn.i.e(this);
        }

        public final a l() {
            return hn.i.f(this);
        }

        public final a m() {
            return hn.i.g(this);
        }

        public final void n(boolean z10) {
            this.f39545a = z10;
        }

        public final void o(boolean z10) {
            this.f39546b = z10;
        }

        public final void p(boolean z10) {
            this.f39550f = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(x headers) {
            kotlin.jvm.internal.s.h(headers, "headers");
            return hn.i.h(this, headers);
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        f39529n = bVar;
        f39530o = hn.i.d(bVar);
        f39531p = hn.i.c(bVar);
    }

    public d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f39532a = z10;
        this.f39533b = z11;
        this.f39534c = i10;
        this.f39535d = i11;
        this.f39536e = z12;
        this.f39537f = z13;
        this.f39538g = z14;
        this.f39539h = i12;
        this.f39540i = i13;
        this.f39541j = z15;
        this.f39542k = z16;
        this.f39543l = z17;
        this.f39544m = str;
    }

    public final String a() {
        return this.f39544m;
    }

    public final boolean b() {
        return this.f39543l;
    }

    public final boolean c() {
        return this.f39536e;
    }

    public final boolean d() {
        return this.f39537f;
    }

    public final int e() {
        return this.f39534c;
    }

    public final int f() {
        return this.f39539h;
    }

    public final int g() {
        return this.f39540i;
    }

    public final boolean h() {
        return this.f39538g;
    }

    public final boolean i() {
        return this.f39532a;
    }

    public final boolean j() {
        return this.f39533b;
    }

    public final boolean k() {
        return this.f39542k;
    }

    public final boolean l() {
        return this.f39541j;
    }

    public final int m() {
        return this.f39535d;
    }

    public final void n(String str) {
        this.f39544m = str;
    }

    public String toString() {
        return hn.i.i(this);
    }
}
