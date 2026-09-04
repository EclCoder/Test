package y3;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p1 f57303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f57304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f57305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f57306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f57307e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p1 f57308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f57309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f57310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f57311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f57312e;

        public final v a() {
            p1 p1VarC = this.f57308a;
            if (p1VarC == null) {
                p1VarC = p1.f57270c.c(this.f57310c);
                kotlin.jvm.internal.s.f(p1VarC, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new v(p1VarC, this.f57309b, this.f57310c, this.f57311d, this.f57312e);
        }

        public final a b(Object obj) {
            this.f57310c = obj;
            this.f57311d = true;
            return this;
        }

        public final a c(boolean z10) {
            this.f57309b = z10;
            return this;
        }

        public final a d(p1 type) {
            kotlin.jvm.internal.s.h(type, "type");
            this.f57308a = type;
            return this;
        }
    }

    public v(p1 type, boolean z10, Object obj, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.h(type, "type");
        if (!type.c() && z10) {
            throw new IllegalArgumentException((type.b() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f57303a = type;
        this.f57304b = z10;
        this.f57307e = obj;
        this.f57305c = z11 || z12;
        this.f57306d = z12;
    }

    public final p1 a() {
        return this.f57303a;
    }

    public final boolean b() {
        return this.f57305c;
    }

    public final boolean c() {
        return this.f57306d;
    }

    public final boolean d() {
        return this.f57304b;
    }

    public final void e(String name, Bundle bundle) {
        Object obj;
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(bundle, "bundle");
        if (!this.f57305c || (obj = this.f57307e) == null) {
            return;
        }
        this.f57303a.h(bundle, name, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f57304b != vVar.f57304b || this.f57305c != vVar.f57305c || !kotlin.jvm.internal.s.c(this.f57303a, vVar.f57303a)) {
                return false;
            }
            Object obj2 = this.f57307e;
            if (obj2 != null) {
                return kotlin.jvm.internal.s.c(obj2, vVar.f57307e);
            }
            if (vVar.f57307e == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String name, Bundle bundle) {
        kotlin.jvm.internal.s.h(name, "name");
        kotlin.jvm.internal.s.h(bundle, "bundle");
        if (!this.f57304b) {
            Bundle bundleA = n4.c.a(bundle);
            if (n4.c.b(bundleA, name) && n4.c.w(bundleA, name)) {
                return false;
            }
        }
        try {
            this.f57303a.a(bundle, name);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.f57303a.hashCode() * 31) + (this.f57304b ? 1 : 0)) * 31) + (this.f57305c ? 1 : 0)) * 31;
        Object obj = this.f57307e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.jvm.internal.l0.b(v.class).k());
        sb2.append(" Type: " + this.f57303a);
        sb2.append(" Nullable: " + this.f57304b);
        if (this.f57305c) {
            sb2.append(" DefaultValue: " + this.f57307e);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }
}
