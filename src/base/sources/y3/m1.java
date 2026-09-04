package y3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f57234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f57236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f57237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f57238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f57239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f57240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f57241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f57242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f57243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private zl.c f57244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f57245l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f57246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f57247b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f57249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private zl.c f57250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f57251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f57252g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f57253h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f57248c = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f57254i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f57255j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f57256k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f57257l = -1;

        public static /* synthetic */ a k(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public final m1 a() {
            String str = this.f57249d;
            if (str != null) {
                return new m1(this.f57246a, this.f57247b, str, this.f57252g, this.f57253h, this.f57254i, this.f57255j, this.f57256k, this.f57257l);
            }
            zl.c cVar = this.f57250e;
            if (cVar != null) {
                return new m1(this.f57246a, this.f57247b, cVar, this.f57252g, this.f57253h, this.f57254i, this.f57255j, this.f57256k, this.f57257l);
            }
            Object obj = this.f57251f;
            if (obj == null) {
                return new m1(this.f57246a, this.f57247b, this.f57248c, this.f57252g, this.f57253h, this.f57254i, this.f57255j, this.f57256k, this.f57257l);
            }
            boolean z10 = this.f57246a;
            boolean z11 = this.f57247b;
            kotlin.jvm.internal.s.e(obj);
            return new m1(z10, z11, obj, this.f57252g, this.f57253h, this.f57254i, this.f57255j, this.f57256k, this.f57257l);
        }

        public final a b(int i10) {
            this.f57254i = i10;
            return this;
        }

        public final a c(int i10) {
            this.f57255j = i10;
            return this;
        }

        public final a d(boolean z10) {
            this.f57246a = z10;
            return this;
        }

        public final a e(int i10) {
            this.f57256k = i10;
            return this;
        }

        public final a f(int i10) {
            this.f57257l = i10;
            return this;
        }

        public final a g(int i10, boolean z10, boolean z11) {
            this.f57248c = i10;
            this.f57249d = null;
            this.f57252g = z10;
            this.f57253h = z11;
            return this;
        }

        public final a h(Object route, boolean z10, boolean z11) {
            kotlin.jvm.internal.s.h(route, "route");
            this.f57251f = route;
            g(c4.d.c(pm.t.c(kotlin.jvm.internal.l0.b(route.getClass()))), z10, z11);
            return this;
        }

        public final a i(String str, boolean z10, boolean z11) {
            this.f57249d = str;
            this.f57248c = -1;
            this.f57252g = z10;
            this.f57253h = z11;
            return this;
        }

        public final a j(zl.c route, boolean z10, boolean z11) {
            kotlin.jvm.internal.s.h(route, "route");
            this.f57250e = route;
            this.f57248c = -1;
            this.f57252g = z10;
            this.f57253h = z11;
            return this;
        }

        public final a l(boolean z10) {
            this.f57247b = z10;
            return this;
        }
    }

    public m1(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f57234a = z10;
        this.f57235b = z11;
        this.f57236c = i10;
        this.f57237d = z12;
        this.f57238e = z13;
        this.f57239f = i11;
        this.f57240g = i12;
        this.f57241h = i13;
        this.f57242i = i14;
    }

    public final int a() {
        return this.f57239f;
    }

    public final int b() {
        return this.f57240g;
    }

    public final int c() {
        return this.f57241h;
    }

    public final int d() {
        return this.f57242i;
    }

    public final int e() {
        return this.f57236c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m1)) {
            m1 m1Var = (m1) obj;
            if (this.f57234a == m1Var.f57234a && this.f57235b == m1Var.f57235b && this.f57236c == m1Var.f57236c && kotlin.jvm.internal.s.c(this.f57243j, m1Var.f57243j) && kotlin.jvm.internal.s.c(this.f57244k, m1Var.f57244k) && kotlin.jvm.internal.s.c(this.f57245l, m1Var.f57245l) && this.f57237d == m1Var.f57237d && this.f57238e == m1Var.f57238e && this.f57239f == m1Var.f57239f && this.f57240g == m1Var.f57240g && this.f57241h == m1Var.f57241h && this.f57242i == m1Var.f57242i) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.f57243j;
    }

    public final zl.c g() {
        return this.f57244k;
    }

    public final Object h() {
        return this.f57245l;
    }

    public int hashCode() {
        int i10 = (((((j() ? 1 : 0) * 31) + (l() ? 1 : 0)) * 31) + this.f57236c) * 31;
        String str = this.f57243j;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        zl.c cVar = this.f57244k;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Object obj = this.f57245l;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (i() ? 1 : 0)) * 31) + (k() ? 1 : 0)) * 31) + this.f57239f) * 31) + this.f57240g) * 31) + this.f57241h) * 31) + this.f57242i;
    }

    public final boolean i() {
        return this.f57237d;
    }

    public final boolean j() {
        return this.f57234a;
    }

    public final boolean k() {
        return this.f57238e;
    }

    public final boolean l() {
        return this.f57235b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1.class.getSimpleName());
        sb2.append("(");
        if (this.f57234a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f57235b) {
            sb2.append("restoreState ");
        }
        String str = this.f57243j;
        if ((str != null || this.f57236c != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.f57243j;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                zl.c cVar = this.f57244k;
                if (cVar != null) {
                    sb2.append(cVar);
                } else {
                    Object obj = this.f57245l;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.f57236c));
                    }
                }
            }
            if (this.f57237d) {
                sb2.append(" inclusive");
            }
            if (this.f57238e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (this.f57239f != -1 || this.f57240g != -1 || this.f57241h != -1 || this.f57242i != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.f57239f));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.f57240g));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.f57241h));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.f57242i));
            sb2.append(")");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public m1(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, d1.f57171f.c(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f57243j = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m1(boolean z10, boolean z11, zl.c cVar, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, c4.d.c(pm.t.c(cVar)), z12, z13, i10, i11, i12, i13);
        kotlin.jvm.internal.s.e(cVar);
        this.f57244k = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m1(boolean z10, boolean z11, Object popUpToRouteObject, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, c4.d.c(pm.t.c(kotlin.jvm.internal.l0.b(popUpToRouteObject.getClass()))), z12, z13, i10, i11, i12, i13);
        kotlin.jvm.internal.s.h(popUpToRouteObject, "popUpToRouteObject");
        this.f57245l = popUpToRouteObject;
    }
}
